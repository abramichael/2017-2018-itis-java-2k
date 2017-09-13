--Выбрать users, для которых not exists songs Deep Purple, которых not exists user_albums для этого user.

SELECT * FROM users
WHERE NOT EXISTS(
	SELECT * FROM songs join artists on songs.artist_id = artists.id
	WHERE artists.name = 'Deep Purple' AND NOT EXISTS(
		SELECT * from user_albums 
		WHERE users.id = user_id AND songs.id = song_id
	)
);