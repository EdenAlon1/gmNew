package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fhne {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final fhnt a(Socket socket) {
        socket.getClass();
        fhnu fhnuVar = new fhnu(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return new fhmo(fhnuVar, new fhni(outputStream, fhnuVar));
    }

    public static final fhnv b(InputStream inputStream) {
        inputStream.getClass();
        return new fhnd(inputStream, new fhnx());
    }

    public static final fhnv c(Socket socket) {
        socket.getClass();
        fhnu fhnuVar = new fhnu(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return new fhmp(fhnuVar, new fhnd(inputStream, fhnuVar));
    }

    public static final boolean d(AssertionError assertionError) {
        String message;
        boolean I;
        if (assertionError.getCause() == null || (message = assertionError.getMessage()) == null) {
            return false;
        }
        I = ffpc.I(message, "getsockname failed", false);
        return I;
    }
}
