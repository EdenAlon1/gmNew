package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dinp extends dimn {
    public static final Optional x = Optional.empty();
    private final dinm y;

    public dinp(Context context) {
        ecwj.f(context);
        this.y = new dinm(new ecwh(ecvd.a("com.google.android.ims.library")).d("RcsFlags__").c().a());
    }

    @Override // defpackage.dimn
    public final dimm A() {
        return this.y.u;
    }

    @Override // defpackage.dimn
    public final dimm B() {
        return this.y.l;
    }

    @Override // defpackage.dimn
    public final dimm C() {
        return this.y.v;
    }

    @Override // defpackage.dimn
    public final dimm D() {
        return this.y.w;
    }

    @Override // defpackage.dimn
    public final ezdl F() {
        ezdj ezdjVar = (ezdj) super.F().toBuilder();
        ezdjVar.copyOnWrite();
        ezdl ezdlVar = (ezdl) ezdjVar.instance;
        ezdlVar.b |= 2;
        ezdlVar.d = "com.google.android.ims.library";
        return (ezdl) ezdjVar.build();
    }

    @Override // defpackage.dimn
    public final boolean K() {
        return true;
    }

    @Override // defpackage.dimn
    public final int L() {
        return 5;
    }

    @Override // defpackage.dimn
    public final dimm a() {
        return this.y.a;
    }

    @Override // defpackage.dimn
    public final dimm b() {
        return this.y.y;
    }

    @Override // defpackage.dimn
    public final dimm c() {
        return this.y.b;
    }

    @Override // defpackage.dimn
    public final dimm d() {
        return this.y.x;
    }

    @Override // defpackage.dimn
    public final dimm e() {
        return this.y.c;
    }

    @Override // defpackage.dimn
    public final dimm f() {
        return this.y.d;
    }

    @Override // defpackage.dimn
    public final dimm g() {
        return this.y.A;
    }

    @Override // defpackage.dimn
    public final dimm h() {
        return this.y.e;
    }

    @Override // defpackage.dimn
    public final dimm i() {
        return this.y.f;
    }

    @Override // defpackage.dimn
    public final dimm j() {
        return this.y.r;
    }

    @Override // defpackage.dimn
    public final dimm k() {
        return this.y.g;
    }

    @Override // defpackage.dimn
    public final dimm l() {
        return this.y.h;
    }

    @Override // defpackage.dimn
    public final dimm m() {
        return this.y.j;
    }

    @Override // defpackage.dimn
    public final dimm n() {
        return this.y.s;
    }

    @Override // defpackage.dimn
    public final dimm o() {
        return this.y.D;
    }

    @Override // defpackage.dimn
    public final dimm p() {
        return this.y.k;
    }

    @Override // defpackage.dimn
    public final dimm q() {
        return this.y.m;
    }

    @Override // defpackage.dimn
    public final dimm r() {
        return this.y.n;
    }

    @Override // defpackage.dimn
    public final dimm s() {
        return this.y.o;
    }

    @Override // defpackage.dimn
    public final dimm t() {
        return this.y.i;
    }

    @Override // defpackage.dimn
    public final dimm u() {
        return this.y.p;
    }

    @Override // defpackage.dimn
    public final dimm v() {
        return this.y.C;
    }

    @Override // defpackage.dimn
    public final dimm w() {
        return this.y.q;
    }

    @Override // defpackage.dimn
    public final dimm x() {
        return this.y.z;
    }

    @Override // defpackage.dimn
    public final dimm y() {
        return this.y.B;
    }

    @Override // defpackage.dimn
    public final dimm z() {
        return this.y.t;
    }
}
