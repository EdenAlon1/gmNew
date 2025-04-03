package defpackage;

import j$.util.Optional;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eebo {
    public static final eebo c = new eebj();
    public static final Optional d = Optional.empty();

    public static Socket h(Socket socket) {
        return socket instanceof edzz ? h(((edzz) socket).a) : socket instanceof edzw ? h(((edzw) socket).a) : socket;
    }

    protected abstract ServerSocket b(ServerSocket serverSocket);

    protected abstract Socket c(Socket socket);

    protected abstract SSLServerSocket d(SSLServerSocket sSLServerSocket);

    protected abstract SSLSocket e(SSLSocket sSLSocket);

    protected Optional f() {
        return d;
    }

    public final ServerSocket g(ServerSocket serverSocket) {
        serverSocket.getClass();
        Optional f = f();
        if (f.isPresent()) {
            serverSocket = ((eebo) f.get()).g(serverSocket);
        }
        return serverSocket instanceof SSLServerSocket ? d((SSLServerSocket) serverSocket) : b(serverSocket);
    }

    public final Socket i(Socket socket) {
        socket.getClass();
        Optional f = f();
        if (f.isPresent()) {
            socket = ((eebo) f.get()).i(socket);
        }
        return socket instanceof SSLSocket ? e((SSLSocket) socket) : c(socket);
    }

    public final SSLSocketFactory j(SSLSocketFactory sSLSocketFactory) {
        sSLSocketFactory.getClass();
        return new eebm(this, sSLSocketFactory);
    }
}
