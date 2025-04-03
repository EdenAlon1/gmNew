package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rfw {
    public final qrd a;
    public final List b;
    final qqs c;
    public boolean d;
    public rft e;
    public boolean f;
    public rft g;
    public Bitmap h;
    public rft i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final qxf n;
    private boolean o;
    private qqo p;

    public rfw(qpt qptVar, qrd qrdVar, int i, int i2, qty qtyVar, Bitmap bitmap) {
        qxf qxfVar = qptVar.a;
        qqs c = qpt.c(qptVar.a());
        qqo q = qpt.c(qptVar.a()).b().q(((rig) ((rig) rig.d(qvx.c).ag()).ai()).Q(i, i2));
        this.b = new ArrayList();
        this.c = c;
        Handler handler = new Handler(Looper.getMainLooper(), new rfv(this));
        this.n = qxfVar;
        this.m = handler;
        this.p = q;
        this.a = qrdVar;
        e(qtyVar, bitmap);
    }

    final int a() {
        return ((qrh) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        rft rftVar = this.i;
        if (rftVar != null) {
            this.i = null;
            c(rftVar);
            return;
        }
        this.o = true;
        qrh qrhVar = (qrh) this.a;
        qrf qrfVar = qrhVar.f;
        int i2 = qrfVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = qrhVar.e) >= 0) {
            i3 = i < i2 ? ((qre) qrfVar.e.get(i)).i : -1;
        }
        long uptimeMillis = SystemClock.uptimeMillis() + i3;
        this.a.b();
        this.g = new rft(this.m, ((qrh) this.a).e, uptimeMillis);
        this.p.q((rig) new rig().W(new rjn(Double.valueOf(Math.random())))).k(this.a).w(this.g);
    }

    final void c(rft rftVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, rftVar).sendToTarget();
            return;
        }
        if (!this.d) {
            this.i = rftVar;
            return;
        }
        if (rftVar.b != null) {
            d();
            rft rftVar2 = this.e;
            this.e = rftVar;
            int size = this.b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((rfu) this.b.get(size)).c();
                }
            }
            if (rftVar2 != null) {
                this.m.obtainMessage(2, rftVar2).sendToTarget();
            }
        }
        b();
    }

    public final void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    final void e(qty qtyVar, Bitmap bitmap) {
        rkf.f(qtyVar);
        rkf.f(bitmap);
        this.h = bitmap;
        this.p = this.p.q(new rig().Y(qtyVar));
        this.j = rkh.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void f() {
        this.d = false;
    }
}
