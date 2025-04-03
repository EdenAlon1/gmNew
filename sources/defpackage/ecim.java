package defpackage;

import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecim extends eciu {
    public String a;
    public fgmh b;
    public String c;
    public Long d;
    public Predicate e;
    public ecfy f;
    private boolean g;
    private fgqx h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private byte m;

    @Override // defpackage.eciu
    public final eciv a() {
        fgqx fgqxVar;
        Predicate predicate;
        if (this.m == 31 && (fgqxVar = this.h) != null && (predicate = this.e) != null) {
            return new ecin(this.a, this.g, fgqxVar, this.b, this.c, this.d, this.i, this.j, this.k, predicate, this.f, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.m & 1) == 0) {
            sb.append(" isEventNameConstant");
        }
        if (this.h == null) {
            sb.append(" metric");
        }
        if ((this.m & 2) == 0) {
            sb.append(" isUnsampled");
        }
        if ((this.m & 4) == 0) {
            sb.append(" shouldAttachActiveTraces");
        }
        if ((this.m & 8) == 0) {
            sb.append(" maxActiveTraces");
        }
        if (this.e == null) {
            sb.append(" activeTracePredicate");
        }
        if ((this.m & 16) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eciu
    public final void b(int i) {
        this.l = i;
        this.m = (byte) (this.m | 16);
    }

    @Override // defpackage.eciu
    public final void c(boolean z) {
        this.g = z;
        this.m = (byte) (this.m | 1);
    }

    @Override // defpackage.eciu
    public final void d(boolean z) {
        this.i = z;
        this.m = (byte) (this.m | 2);
    }

    @Override // defpackage.eciu
    public final void e(int i) {
        this.k = i;
        this.m = (byte) (this.m | 8);
    }

    @Override // defpackage.eciu
    public final void f(fgqx fgqxVar) {
        if (fgqxVar == null) {
            throw new NullPointerException("Null metric");
        }
        this.h = fgqxVar;
    }

    @Override // defpackage.eciu
    public final void g(boolean z) {
        this.j = z;
        this.m = (byte) (this.m | 4);
    }
}
