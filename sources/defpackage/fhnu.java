package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhnu extends fhmq {
    private final Socket a;

    public fhnu(Socket socket) {
        this.a = socket;
    }

    @Override // defpackage.fhmq
    protected final void a() {
        try {
            this.a.close();
        } catch (AssertionError e) {
            if (!fhne.d(e)) {
                throw e;
            }
            Socket socket = this.a;
            Logger logger = fhne.a;
            Level level = Level.WARNING;
            Objects.toString(socket);
            logger.log(level, "Failed to close timed out socket ".concat(socket.toString()), (Throwable) e);
        } catch (Exception e2) {
            Socket socket2 = this.a;
            Logger logger2 = fhne.a;
            Level level2 = Level.WARNING;
            Objects.toString(socket2);
            logger2.log(level2, "Failed to close timed out socket ".concat(socket2.toString()), (Throwable) e2);
        }
    }

    @Override // defpackage.fhmq
    protected final IOException d(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
