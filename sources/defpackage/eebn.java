package defpackage;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eebn extends SSLServerSocketFactory {
    final /* synthetic */ SSLServerSocketFactory a;
    final /* synthetic */ eebo b;

    public eebn(eebo eeboVar, SSLServerSocketFactory sSLServerSocketFactory) {
        this.a = sSLServerSocketFactory;
        this.b = eeboVar;
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket() {
        return this.b.g(this.a.createServerSocket());
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i) {
        return this.b.g(this.a.createServerSocket(i));
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2) {
        return this.b.g(this.a.createServerSocket(i, i2));
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return this.b.g(this.a.createServerSocket(i, i2, inetAddress));
    }
}
