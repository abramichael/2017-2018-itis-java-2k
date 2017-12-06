public class TestUser {

	@Test
	public void testUserCanGoToClass() {
		
		
		Mock courseDAO = Mock.mock(CourseDAO.class);
		courseDAO.when(getNumberOfFreePlaces(10).thenReturn(0));
		courseDAO.when(addUserToCourse(5, 10).thenReturn(false));
		
		UserService us = new UserServiceImpl(
			new UserDAOImpl(), courseDAO		
		);
		
		boolean result = us.putOnCourse(5, 10);
		assertTrue(true, result);	
	
	}

}