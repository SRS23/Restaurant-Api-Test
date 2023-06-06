package tokens;

import java.security.Key;
import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class Tokenss {
	
	
    public static String generateJwtToken(String userId) {
        Key signingKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);

        long expirationTimeMillis = System.currentTimeMillis() + 3600000; // Token expires in 1 hour

        String token = Jwts.builder()
                .setSubject(userId)
                .setExpiration(new Date(expirationTimeMillis))
                .signWith(signingKey)
                .compact();
        
        return token;
    }

    // Usage
    
    public static void main(String[] args) {
        String userId = "475938";
        String token = generateJwtToken(userId);
        System.out.println(token);
    }
}


