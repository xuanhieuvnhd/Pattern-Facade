public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.share("Day la mot bai dang");
    }

    public void share(String message) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }
}
