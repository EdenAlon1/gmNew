package defpackage;

import android.os.SystemClock;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duiv extends fdxt {
    public final Object a = new Object();
    public final ecou b;
    public boolean c;
    public int d;
    public int e;

    public duiv(ecou ecouVar) {
        this.b = ecouVar;
    }

    @Override // defpackage.fdxt
    public final void a() {
        synchronized (this.a) {
            if (!this.c) {
                ecou ecouVar = this.b;
                ecouVar.b = SystemClock.elapsedRealtime() - ecouVar.a;
            }
        }
    }

    @Override // defpackage.fedo
    public final void b(long j) {
        synchronized (this.a) {
            this.d += (int) j;
        }
    }

    @Override // defpackage.fedo
    public final void c(long j) {
        synchronized (this.a) {
            this.e += (int) j;
        }
    }

    @Override // defpackage.fdxt
    public final void d(fdxd fdxdVar) {
        synchronized (this.a) {
            ecou ecouVar = this.b;
            SocketAddress socketAddress = (SocketAddress) fdxdVar.a(fdzi.a);
            if (!(socketAddress instanceof InetSocketAddress)) {
                if (socketAddress instanceof feig) {
                    ecouVar.v = 2;
                } else if (socketAddress instanceof feef) {
                    ecouVar.v = 3;
                }
            }
        }
    }
}
