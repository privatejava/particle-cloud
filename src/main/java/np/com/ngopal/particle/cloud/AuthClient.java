/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.com.ngopal.particle.cloud;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author NGM
 */
@Getter
@Setter
public abstract class AuthClient implements AccessToken {

    private String accessToken;

    private String refreshToken;

    private Long expiresIn;

    public abstract String getUser();

    public abstract String getSecret();

}
