package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Score;
import services.DbUtil;

public class ScoreDao {

	private Connection connection;

	public ScoreDao() {
		connection = DbUtil.getConnection();
	}

	public void addScore(Score s) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into score(subjectId,studentId,marks) values (?, ?, ?)");
			
			preparedStatement.setInt(1, s.getSubjectId());
			preparedStatement.setInt(2, s.getStudentId());

			preparedStatement.setDouble(3, s.getMarks());

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Score> getAllScore() {
		List<Score> scores = new ArrayList<Score>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from score");
			while (rs.next()) {
				Score score = new Score();
				score.setScoreId(rs.getInt("scoreId"));
				score.setSubId(rs.getInt("subjectId"));

				score.setMarks(rs.getDouble("marks"));
				scores.add(score);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return scores;
	}

}
