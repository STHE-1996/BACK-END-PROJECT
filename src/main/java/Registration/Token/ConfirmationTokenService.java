package Registration.Token;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final ConfirmationTokenRepository confirmationTokenRepository;

    public void saveConfirmationToken(ConfirmationToken token) {
        confirmationTokenRepository.save(token);
    }

    public Optional<ConfirmationToken> getToken(String token) {
        return Optional.empty();
    }

   

	public int setConfirmedAt(String token) {
		// TODO Auto-generated method stub
		return confirmationTokenRepository.updateConfirmedAt(
				token, LocalDateTime.now());
	}
}

