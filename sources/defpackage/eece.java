package defpackage;

import j$.util.Optional;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eece {
    public static final diyy a = dizd.a(175047957);
    public final SocketFactory b;
    public final ServerSocketFactory c;
    private final eebo d;
    private final eecy e;

    public eece(eecy eecyVar, eebo eeboVar) {
        this.e = eecyVar;
        this.d = eeboVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.b = new eebk(eeboVar, socketFactory);
        ServerSocketFactory serverSocketFactory = ServerSocketFactory.getDefault();
        serverSocketFactory.getClass();
        this.c = new eebl(eeboVar, serverSocketFactory);
    }

    public final eecp a(eecm eecmVar, String str, int i, Optional optional) {
        return new eecp(new eeco() { // from class: eebz
            @Override // defpackage.eeco
            public final Socket a() {
                Socket createSocket = eece.this.b.createSocket();
                createSocket.setTcpNoDelay(true);
                createSocket.setSoTimeout(660000);
                return createSocket;
            }
        }, eecmVar, str, i, optional);
    }

    public final /* synthetic */ ServerSocket b(int i) {
        try {
            dkty.c("Opening secure server socket at %d", Integer.valueOf(i));
            eebo eeboVar = this.d;
            SSLServerSocketFactory serverSocketFactory = this.e.a().getServerSocketFactory();
            serverSocketFactory.getClass();
            return (SSLServerSocket) new eebn(eeboVar, serverSocketFactory).createServerSocket(i);
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    public final /* synthetic */ Socket c(KeyStore keyStore, String str) {
        try {
            SSLSocket sSLSocket = (SSLSocket) this.d.j(new eecx(keyStore, str).a().getSocketFactory()).createSocket();
            sSLSocket.setUseClientMode(true);
            int a2 = (int) djas.a();
            if (a2 > 0) {
                sSLSocket.setSoTimeout(a2);
            }
            return sSLSocket;
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    public final SSLSocketFactory d() {
        try {
            return this.d.j(this.e.a().getSocketFactory());
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }
}
