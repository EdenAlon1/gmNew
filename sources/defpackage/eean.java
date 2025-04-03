package defpackage;

import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eean extends eebo {
    public final int a;
    public final djkj b;

    public eean(int i, djkj djkjVar) {
        this.a = i;
        this.b = djkjVar;
    }

    @Override // defpackage.eebo
    protected final ServerSocket b(ServerSocket serverSocket) {
        enhk enhkVar = eebg.a;
        return new eeba(serverSocket);
    }

    @Override // defpackage.eebo
    protected final Socket c(Socket socket) {
        enhk enhkVar = eebg.a;
        final eebe eebeVar = new eebe(socket, eebf.l);
        eebeVar.e(new eeon() { // from class: eeam
            @Override // defpackage.eeon
            public final void a(eeoh eeohVar) {
                if (eeao.a(eeohVar)) {
                    eebe eebeVar2 = eebeVar;
                    eean eeanVar = eean.this;
                    eeanVar.b.a(eeao.b(eeanVar.a, eebeVar2, eeohVar));
                }
            }
        });
        return eebeVar;
    }

    @Override // defpackage.eebo
    protected final SSLSocket e(SSLSocket sSLSocket) {
        enhk enhkVar = eebg.a;
        final eeax eeaxVar = new eeax(sSLSocket);
        eeaxVar.e(new eeon() { // from class: eeal
            @Override // defpackage.eeon
            public final void a(eeoh eeohVar) {
                if (eeao.a(eeohVar)) {
                    eeax eeaxVar2 = eeaxVar;
                    eean eeanVar = eean.this;
                    eeanVar.b.a(eeao.b(eeanVar.a, eeaxVar2, eeohVar));
                }
            }
        });
        return eeaxVar;
    }

    @Override // defpackage.eebo
    protected final SSLServerSocket d(SSLServerSocket sSLServerSocket) {
        return sSLServerSocket;
    }
}
