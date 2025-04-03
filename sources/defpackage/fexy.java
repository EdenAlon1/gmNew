package defpackage;

import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fexy extends feng implements feyq {
    public static final /* synthetic */ int z = 0;
    private final int A;
    private int B;
    private int C;
    public final Object a;
    public List b;
    public final fhmt c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final fexm g;
    public final feyu h;
    public final feyg i;
    public boolean u;
    public final ffbp v;
    public feyr w;
    public int x;
    final /* synthetic */ fexz y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fexy(fexz fexzVar, int i, fevo fevoVar, Object obj, fexm fexmVar, feyu feyuVar, feyg feygVar, int i2) {
        super(i, fevoVar, fexzVar.r);
        this.y = fexzVar;
        this.c = new fhmt();
        this.d = false;
        this.e = false;
        this.f = false;
        this.u = true;
        this.x = -1;
        this.a = obj;
        this.g = fexmVar;
        this.h = feyuVar;
        this.i = feygVar;
        this.B = i2;
        this.C = i2;
        this.A = i2;
        int i3 = ffbo.a;
        this.v = ffbn.a;
    }

    @Override // defpackage.feqs
    public final void a(int i) {
        int i2 = this.C - i;
        this.C = i2;
        int i3 = this.A;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.B += i4;
            this.C = i2 + i4;
            this.g.h(this.x, i4);
        }
    }

    @Override // defpackage.feqs
    public final void b(Throwable th) {
        r(Status.c(th), true, new febo());
    }

    @Override // defpackage.feng
    protected final void c(Status status, boolean z2, febo feboVar) {
        r(status, false, feboVar);
    }

    @Override // defpackage.fein
    protected final void d() {
        super.d();
        fevw fevwVar = this.q;
        fevwVar.c++;
        fevwVar.b.a();
    }

    @Override // defpackage.feiq
    public final void e(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    final feyr f() {
        feyr feyrVar;
        synchronized (this.a) {
            feyrVar = this.w;
        }
        return feyrVar;
    }

    @Override // defpackage.feij, defpackage.feqs
    public final void i(boolean z2) {
        if (this.m) {
            this.i.h(this.x, null, fejt.PROCESSED, false, null, null);
        } else {
            this.i.h(this.x, null, fejt.PROCESSED, false, fezm.CANCEL, null);
        }
        super.i(z2);
    }

    public final void r(Status status, boolean z2, febo feboVar) {
        if (this.f) {
            return;
        }
        this.f = true;
        if (!this.u) {
            this.i.h(this.x, status, fejt.PROCESSED, z2, fezm.CANCEL, feboVar);
            return;
        }
        feyg feygVar = this.i;
        fexz fexzVar = this.y;
        feygVar.v.remove(fexzVar);
        feygVar.i(fexzVar);
        this.b = null;
        this.c.A();
        this.u = false;
        if (feboVar == null) {
            feboVar = new febo();
        }
        j(status, true, feboVar);
    }

    public final void s(fhmt fhmtVar, boolean z2, int i) {
        int i2 = this.B - (((int) fhmtVar.b) + i);
        this.B = i2;
        this.C -= i;
        if (i2 >= 0) {
            super.o(new feym(fhmtVar), z2);
        } else {
            this.g.f(this.x, fezm.FLOW_CONTROL_ERROR);
            this.i.h(this.x, Status.o.withDescription("Received data size exceeded our receiving window size"), fejt.PROCESSED, false, null, null);
        }
    }
}
