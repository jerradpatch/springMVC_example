package com.Test.Model;

public class UserModel {

	private Long id;
    private String fname;
    private String lname;
    private String username;
    private Double latitude;
    private Double longitude;
    private String gender;
    private Integer age;
    private String comments;
    private Long likes;
    private Long dislikes;
    private Long retweets;
 
    public UserModel() {
        // this empty constructor is required
    }
 
    public UserModel(Long id, String fname, String lname, String username, Double latitude, Double longitude,
			String gender, Integer age, String comments, Long likes, Long dislikes, Long retweets) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.latitude = latitude;
		this.longitude = longitude;
		this.gender = gender;
		this.age = age;
		this.comments = comments;
		this.likes = likes;
		this.dislikes = dislikes;
		this.retweets = retweets;
	}
//    public Book(String isbn, String title, String author, String publisher,
//            Date published, double price) {
//        this.isbn = isbn;
//        this.title = title;
//        this.author = author;
//        this.publisher = publisher;
//        this.published = published;
//        this.price = price;
//    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Long getLikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

	public Long getDislikes() {
		return dislikes;
	}

	public void setDislikes(Long dislikes) {
		this.dislikes = dislikes;
	}

	public Long getRetweets() {
		return retweets;
	}

	public void setRetweets(Long retweets) {
		this.retweets = retweets;
	}
 
    // getters and setters
    
}