package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eebe extends edzz implements eeok {
    private final eeos b;

    public eebe(Socket socket, eeoo eeooVar) {
        super(socket);
        this.b = eeos.a(eeooVar);
    }

    @Override // defpackage.edzz
    protected final InputStream a(InputStream inputStream) {
        eeaf eeafVar = new eeaf(inputStream);
        this.b.e(eeafVar, eebg.a);
        return eeafVar;
    }

    @Override // defpackage.edzz
    protected final OutputStream b(OutputStream outputStream) {
        eeak eeakVar = new eeak(outputStream);
        this.b.e(eeakVar, eebg.a);
        return eeakVar;
    }

    public final /* synthetic */ void c() {
        super.close();
    }

    @Override // defpackage.edzz, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b.d(eebf.CLOSING, new eeoa(new eeob() { // from class: eebd
            @Override // defpackage.eeob
            public final void a() {
                eebe.this.c();
            }
        }), eebf.CLOSED);
    }

    @Override // defpackage.edzz, java.net.Socket
    public final void connect(final SocketAddress socketAddress) {
        this.b.d(eebf.CONNECTING, new eeoa(new eeob() { // from class: eebb
            @Override // defpackage.eeob
            public final void a() {
                eebe.this.a.connect(socketAddress);
            }
        }), eebf.CONNECTED);
    }

    @Override // defpackage.eeok
    public final void e(eeon eeonVar) {
        this.b.f(eeonVar);
    }

    @Override // defpackage.edzz, java.net.Socket
    public final void connect(final SocketAddress socketAddress, final int i) {
        this.b.d(eebf.CONNECTING, new eeoa(new eeob() { // from class: eebc
            @Override // defpackage.eeob
            public final void a() {
                eebe.this.a.connect(socketAddress, i);
            }
        }), eebf.CONNECTED);
    }
}
