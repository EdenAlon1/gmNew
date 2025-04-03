package defpackage;

import android.os.PowerManager;
import java.io.BufferedInputStream;
import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eenx extends Thread {
    final /* synthetic */ eeny a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eenx(eeny eenyVar) {
        super("ClientSocketConnection");
        this.a = eenyVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        dkty.d(this.a.b, "TCP socket reader started", new Object[0]);
        try {
            eecp eecpVar = this.a.e;
            eecpVar.getClass();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(eecpVar.a());
            while (this.a.h.get() == 1) {
                if (bufferedInputStream.available() >= 0) {
                    try {
                        eelv a = eemz.a(bufferedInputStream);
                        this.a.f = dkvj.a().longValue();
                        eeny eenyVar = this.a;
                        dkty.d(eenyVar.b, ">>>>>>>>>> SIP message[%s] received (%d bytes) [Call-ID: %s]", eelu.a(a.l), Integer.valueOf(a.a().length()), a.h());
                        try {
                            eenz eenzVar = eenyVar.d;
                            dkty.d(((eeij) eenzVar).a.a, "shouldAcquireWakelock for context id: %s", a.u(1));
                            if ((!((eeij) eenzVar).a.i(a) || !((eeij) eenzVar).a.h(a)) && !a.r() && eenyVar.g != null && djao.o() > 0 && (wakeLock = eenyVar.g) != null) {
                                wakeLock.acquire(djao.o());
                            }
                            eenyVar.d.c(a);
                        } catch (Exception e) {
                            eenyVar.s(5);
                            dkty.j(e, eenyVar.b, "Error while notifying message: %s", e.getMessage());
                        }
                    } catch (SocketTimeoutException unused) {
                        dkty.d(this.a.b, "Socket read timeout due to inactivity.", new Object[0]);
                    }
                }
            }
        } catch (Exception e2) {
            if (!this.a.h.compareAndSet(1, 2)) {
                return;
            }
            int i = 7;
            if (!(e2 instanceof eeje) && !(e2 instanceof dktg)) {
                i = 6;
            }
            this.a.s(i);
            dkty.j(e2, this.a.b, "Error while receiving message: %s", e2.getMessage());
            this.a.q(ezbe.SOCKET_FAILURE_READ_ERROR);
            this.a.r();
            eeny eenyVar2 = this.a;
            eenp eenpVar = eenyVar2.c;
            if (eenpVar != null) {
                eenpVar.a(eenyVar2.d(), e2);
            } else {
                dkty.r(eenyVar2.b, "SipTransportErrorListener is null", new Object[0]);
            }
        }
        dkty.d(this.a.b, "TCP socket reader terminated", new Object[0]);
    }
}
