package defpackage;

import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class edzs extends eebo {
    protected abstract eebo a();

    @Override // defpackage.eebo
    protected final ServerSocket b(ServerSocket serverSocket) {
        return a().b(serverSocket);
    }

    @Override // defpackage.eebo
    protected final Socket c(Socket socket) {
        return a().c(socket);
    }

    @Override // defpackage.eebo
    protected final SSLServerSocket d(SSLServerSocket sSLServerSocket) {
        return a().d(sSLServerSocket);
    }

    @Override // defpackage.eebo
    protected final SSLSocket e(SSLSocket sSLSocket) {
        return a().e(sSLSocket);
    }
}
