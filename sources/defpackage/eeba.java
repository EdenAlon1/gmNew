package defpackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeba extends edzr implements eeok {
    private final eeos b;

    public eeba(ServerSocket serverSocket) {
        super(serverSocket);
        this.b = eeos.a(eebf.m);
    }

    @Override // defpackage.edzr
    protected final Socket a(Socket socket) {
        return new eebe(socket, eebf.n);
    }

    @Override // defpackage.edzr, java.net.ServerSocket
    public final Socket accept() {
        return (Socket) this.b.c(eebf.ACCEPTING, new eeot() { // from class: eeay
            @Override // defpackage.eeot
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.eeot
            public final Object b() {
                eeba eebaVar = eeba.this;
                return eebaVar.a(eebaVar.a.accept());
            }
        });
    }

    @Override // defpackage.edzr, java.net.ServerSocket, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.d(eebf.CLOSING, new eeoa(new eeob() { // from class: eeaz
            @Override // defpackage.eeob
            public final void a() {
                eeba.this.a.close();
            }
        }), eebf.CLOSED);
    }

    @Override // defpackage.eeok
    public final void e(eeon eeonVar) {
        this.b.f(eeonVar);
    }
}
