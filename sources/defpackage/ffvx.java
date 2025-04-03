package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvx extends ffvy implements ffsu {
    public final Handler a;
    public final ffvx b;
    private final String c;
    private final boolean d;

    public ffvx(Handler handler, String str) {
        this(handler, str, false);
    }

    private final void k(ffhd ffhdVar, Runnable runnable) {
        ffui.d(ffhdVar, new CancellationException(a.i(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        ffsd ffsdVar = fftc.a;
        fgie.a.a(ffhdVar, runnable);
    }

    @Override // defpackage.ffsd
    public final void a(ffhd ffhdVar, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        k(ffhdVar, runnable);
    }

    @Override // defpackage.ffvy, defpackage.ffsu
    public final ffte c(long j, final Runnable runnable, ffhd ffhdVar) {
        if (this.a.postDelayed(runnable, ffmk.k(j, 4611686018427387903L))) {
            return new ffte() { // from class: ffvu
                @Override // defpackage.ffte
                public final void hO() {
                    ffvx.this.a.removeCallbacks(runnable);
                }
            };
        }
        k(ffhdVar, runnable);
        return ffux.a;
    }

    @Override // defpackage.ffsu
    public final void d(long j, ffrf ffrfVar) {
        final ffvw ffvwVar = new ffvw(ffrfVar, this);
        if (this.a.postDelayed(ffvwVar, ffmk.k(j, 4611686018427387903L))) {
            ffrfVar.d(new ffji() { // from class: ffvv
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ffvx.this.a.removeCallbacks(ffvwVar);
                    return ffcu.a;
                }
            });
        } else {
            k(((ffrh) ffrfVar).b, ffvwVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ffvx)) {
            return false;
        }
        ffvx ffvxVar = (ffvx) obj;
        return ffvxVar.a == this.a && ffvxVar.d == this.d;
    }

    @Override // defpackage.ffsd
    public final boolean ex(ffhd ffhdVar) {
        if (this.d) {
            return !ffkj.e(Looper.myLooper(), this.a.getLooper());
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.d;
        return (true != z ? 1237 : 1231) ^ System.identityHashCode(this.a);
    }

    @Override // defpackage.ffuu
    public final /* synthetic */ ffuu j() {
        return this.b;
    }

    @Override // defpackage.ffuu, defpackage.ffsd
    public final String toString() {
        String g = g();
        if (g != null) {
            return g;
        }
        String str = this.c;
        if (str == null) {
            str = this.a.toString();
        }
        return this.d ? String.valueOf(str).concat(".immediate") : str;
    }

    private ffvx(Handler handler, String str, boolean z) {
        this.a = handler;
        this.c = str;
        this.d = z;
        this.b = z ? this : new ffvx(handler, str, true);
    }
}
