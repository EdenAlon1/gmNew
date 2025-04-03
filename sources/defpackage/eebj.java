package defpackage;

import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eebj extends eebo {
    @Override // defpackage.eebo
    public final ServerSocket b(ServerSocket serverSocket) {
        return serverSocket;
    }

    @Override // defpackage.eebo
    protected final Socket c(Socket socket) {
        return socket;
    }

    @Override // defpackage.eebo
    public final SSLServerSocket d(SSLServerSocket sSLServerSocket) {
        return sSLServerSocket;
    }

    @Override // defpackage.eebo
    public final SSLSocket e(SSLSocket sSLSocket) {
        return sSLSocket;
    }
}
