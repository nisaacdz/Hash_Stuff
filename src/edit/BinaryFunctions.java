package edit;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BinaryFunctions {

	public byte[] converToBinary(File sample) throws IOException {
		return Files.readAllBytes(sample.toPath());
	}

	public boolean isVerified(byte[] arg) {
		int mod = arg.length % 8;
		return false;
	}
}
