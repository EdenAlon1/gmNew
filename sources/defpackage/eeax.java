package defpackage;

import j$.util.Map;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketAddress;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeax extends edzw implements eeok {
    private final eeos d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeax(SSLSocket sSLSocket) {
        super(sSLSocket);
        eeoo eeooVar = eebf.o;
        this.d = eeos.a(eeooVar);
    }

    private final boolean f() {
        return g(eebf.AUTHENTICATING);
    }

    private final boolean g(eebf eebfVar) {
        if (this.d.a.a.contains(eebfVar)) {
            return false;
        }
        this.d.h(eebfVar);
        return true;
    }

    @Override // defpackage.edzw
    protected final InputStream a(InputStream inputStream) {
        eeaf eeafVar = new eeaf(inputStream);
        this.d.e(eeafVar, eebg.a);
        return new eeav(this, eeafVar);
    }

    @Override // defpackage.edzw
    protected final OutputStream b(OutputStream outputStream) {
        eeak eeakVar = new eeak(outputStream);
        this.d.e(eeakVar, eebg.a);
        return new eeaw(this, eeakVar);
    }

    public final /* synthetic */ void c() {
        super.close();
    }

    @Override // defpackage.edzw, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d.d(eebf.CLOSING, new eeoa(new eeob() { // from class: eeas
            @Override // defpackage.eeob
            public final void a() {
                eeax.this.c();
            }
        }), eebf.CLOSED);
    }

    @Override // defpackage.edzw, java.net.Socket
    public final void connect(final SocketAddress socketAddress) {
        this.d.d(eebf.CONNECTING, new eeoa(new eeob() { // from class: eeat
            @Override // defpackage.eeob
            public final void a() {
                eeax.this.a.connect(socketAddress);
            }
        }), eebf.CONNECTED);
    }

    public final synchronized void d() {
        if (f()) {
            startHandshake();
        }
    }

    @Override // defpackage.eeok
    public final void e(eeon eeonVar) {
        this.d.f(eeonVar);
    }

    @Override // defpackage.edzw, java.net.Socket
    public final InputStream getInputStream() {
        d();
        return (InputStream) this.d.b(new eeot() { // from class: eear
            @Override // defpackage.eeot
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.eeot
            public final Object b() {
                eeax eeaxVar = eeax.this;
                return (InputStream) Map.EL.computeIfAbsent(eeaxVar.b, eeaxVar.a.getInputStream(), new edzt(eeaxVar));
            }
        });
    }

    @Override // defpackage.edzw, java.net.Socket
    public final OutputStream getOutputStream() {
        d();
        return (OutputStream) this.d.b(new eeot() { // from class: eeaq
            @Override // defpackage.eeot
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.eeot
            public final Object b() {
                eeax eeaxVar = eeax.this;
                return (OutputStream) Map.EL.computeIfAbsent(eeaxVar.c, eeaxVar.a.getOutputStream(), new edzu(eeaxVar));
            }
        });
    }

    @Override // defpackage.edzw, javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
        try {
            d();
        } catch (IOException unused) {
        }
        return this.a.getSession();
    }

    @Override // defpackage.edzw, javax.net.ssl.SSLSocket
    public final void startHandshake() {
        f();
        this.d.b(new eeoa(new eeob() { // from class: eeau
            @Override // defpackage.eeob
            public final void a() {
                eeax.this.a.startHandshake();
            }
        }));
        g(eebf.AUTHENTICATED);
    }

    @Override // defpackage.edzw, java.net.Socket
    public final void connect(final SocketAddress socketAddress, final int i) {
        this.d.d(eebf.CONNECTING, new eeoa(new eeob() { // from class: eeap
            @Override // defpackage.eeob
            public final void a() {
                eeax.this.a.connect(socketAddress, i);
            }
        }), eebf.CONNECTED);
    }
}
