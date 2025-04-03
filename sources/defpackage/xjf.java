package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjf implements xit {
    public final long a;
    public final Duration b;
    public final xje c;
    private final int d;
    private final boolean e;
    private final xlt f;
    private final xlr g;
    private final askf h;
    private final xlu i;
    private final ffbz j;
    private final alyx k;
    private final alyx l;

    public xjf(long j, Duration duration, int i, boolean z, xlt xltVar, xlr xlrVar, askf askfVar, xje xjeVar) {
        duration.getClass();
        xltVar.getClass();
        xlrVar.getClass();
        xjeVar.getClass();
        this.a = j;
        this.b = duration;
        this.d = i;
        this.e = z;
        this.f = xltVar;
        this.g = xlrVar;
        this.h = askfVar;
        this.c = xjeVar;
        this.i = xjeVar.c();
        this.j = ffca.a(new ffix() { // from class: xiu
            @Override // defpackage.ffix
            public final Object invoke() {
                xjf xjfVar = xjf.this;
                xje xjeVar2 = xjfVar.c;
                return new xwy(xjeVar2 instanceof xiy, xjfVar.a, xjeVar2.h(), xjeVar2.g(), xjeVar2.a(), xjfVar.b);
            }
        });
        this.k = xjeVar.d();
        this.l = xjeVar.e();
    }

    @Override // defpackage.xit
    public final alyx a() {
        return this.k;
    }

    @Override // defpackage.xit
    public final alyx b() {
        return this.l;
    }

    @Override // defpackage.xit
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.xlv
    public final int d() {
        return this.d;
    }

    @Override // defpackage.xlv
    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjf)) {
            return false;
        }
        xjf xjfVar = (xjf) obj;
        return this.a == xjfVar.a && ffkj.e(this.b, xjfVar.b) && this.d == xjfVar.d && this.e == xjfVar.e && ffkj.e(this.f, xjfVar.f) && ffkj.e(this.g, xjfVar.g) && ffkj.e(this.h, xjfVar.h) && ffkj.e(this.c, xjfVar.c);
    }

    @Override // defpackage.xlv
    public final xlr f() {
        return this.g;
    }

    @Override // defpackage.xlv
    public final xlt g() {
        return this.f;
    }

    @Override // defpackage.xlv
    public final xlu h() {
        return this.i;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((((((((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.d) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.f.hashCode()) * 31) + this.g.a) * 31) + this.h.hashCode()) * 31) + this.c.hashCode();
    }

    @Override // defpackage.xlv
    public final xwy i() {
        return (xwy) this.j.a();
    }

    @Override // defpackage.xlv
    public final String j() {
        return this.c.f();
    }

    @Override // defpackage.xlv
    public final boolean k() {
        return this.c instanceof xiy;
    }

    @Override // defpackage.xlv
    public final boolean l() {
        return this.c instanceof xiy;
    }

    @Override // defpackage.xlv
    public final boolean m() {
        if (this.c instanceof xiy) {
            return (ersy.a("bugle.use_aggregate_capabilities_for_edit", "bugle") && ersy.a("bugle.exclude_self_from_compose_constraints_capabilities", "bugle") && !((xiy) this.c).c) ? false : true;
        }
        return false;
    }

    @Override // defpackage.xlv
    public final boolean n() {
        xje xjeVar = this.c;
        return (xjeVar instanceof xiy) && ((xiy) xjeVar).a.h;
    }

    @Override // defpackage.xlv
    public final boolean o() {
        return this.c instanceof xiy;
    }

    @Override // defpackage.xlv
    public final boolean p() {
        xje xjeVar = this.c;
        return (xjeVar instanceof xiy) && ((xiy) xjeVar).e;
    }

    @Override // defpackage.xlv
    public final boolean q() {
        return this.c instanceof xiy;
    }

    @Override // defpackage.xlv
    public final boolean r() {
        return this.c instanceof xiy;
    }

    @Override // defpackage.xlv
    public final boolean s() {
        return this.c instanceof xiy;
    }

    @Override // defpackage.xlv
    public final boolean t() {
        xje xjeVar = this.c;
        return (xjeVar instanceof xiy) && ((xiy) xjeVar).d;
    }

    public final String toString() {
        return "MapiTransportCapabilityDataImpl(maxMessageSizeBytes=" + this.a + ", maxVideoDuration=" + this.b + ", textLengthLimit=" + this.d + ", hasActiveSelfIdentity=" + this.e + ", sendIcon=" + this.f + ", directSendIcon=" + this.g + ", enableRbmInConversation2=" + this.h + ", transportCapability=" + this.c + ")";
    }

    @Override // defpackage.xlv
    public final boolean u() {
        return this.c instanceof xiy;
    }

    @Override // defpackage.xlv
    public final boolean v() {
        return this.c instanceof xiy;
    }

    @Override // defpackage.xlv
    public final boolean w() {
        xje xjeVar = this.c;
        if (xjeVar instanceof xja) {
            return false;
        }
        if (!(xjeVar instanceof xiy)) {
            return true;
        }
        int ordinal = ((xiy) xjeVar).b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return true;
            }
            if (ordinal != 4) {
                throw new ffcd();
            }
        }
        return false;
    }

    @Override // defpackage.xlv
    public final boolean x() {
        return this.c instanceof xjd;
    }

    @Override // defpackage.xlv
    public final boolean y() {
        return this.c instanceof xiy;
    }
}
