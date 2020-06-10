package org.imarticusFsd.assignment01;

interface SocialMedia{
	void post(String content);
}

class Facebook implements SocialMedia{
	
	@Override
	public void post(String content) {
		System.out.println("Posting "+content+"in Facebook");
	}
}

class Twitter implements SocialMedia{

	@Override
	public void post(String content) {
		content = " graduation ceremony pics";
		System.out.println("Posting "+content+"in Twitter");
	}	
}

public class SocialMediaBuilder {
	
	SocialMedia buildSocialMediaInterface(String nameOfSocialMeida) {
		if(nameOfSocialMeida == "facebook") {
			SocialMedia socialMedia1 = new Facebook();
			return socialMedia1;
		}else if(nameOfSocialMeida == "twitter"){
			SocialMedia socialMedia2 = new Twitter();	
			return socialMedia2;
		} else {
			throw new IllegalArgumentException("Invalid Plateform");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Interface Implemented");
		SocialMediaBuilder obj = new SocialMediaBuilder();
		SocialMedia fb = obj.buildSocialMediaInterface("facebook");
		fb.post(" birthday pics ");
	}

	
}
