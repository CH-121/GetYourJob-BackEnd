package ma.fstt.lsi.security;

public interface SecurityParams {

	public static final String JWT_HEADER_NAME = "Authorization";
	public static final String SECRET = "rc@gh.net";
	public static final long EXPIRATION = 10*24*3600*1000;
	public static final String HEADER_PREFIX = "Bearer ";
}
