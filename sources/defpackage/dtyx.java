package defpackage;

import android.text.TextUtils;
import defpackage.dtro;
import defpackage.dtry;
import defpackage.dtsu;
import defpackage.dtyq;
import defpackage.dtyx;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtyx<C extends dtsu<C, Q, B, D, R>, Q extends dtyq<C, Q, B, D, R>, B extends dtyx<C, Q, B, D, R>, D extends dtro<C, Q, B, D, R>, R extends dtry<R>> {
    public final dtyz a;

    protected dtyx(String str, String[] strArr, String str2, String str3, String str4, String str5) {
        dtyz B = dtza.B();
        this.a = B;
        dtri dtriVar = (dtri) B;
        dtriVar.w = str5;
        dtriVar.a = str;
        B.e(false);
        B.c(Arrays.asList(strArr));
        dtri dtriVar2 = (dtri) B;
        dtriVar2.l = null;
        dtriVar2.k = str2;
        dtriVar2.i = str3 == null ? null : new dtzr(str3);
        dtriVar2.j = null;
        dtriVar2.f = str4;
        B.f(false);
        B.g(false);
    }

    private final void a(dtvz dtvzVar, int i) {
        dtre dtreVar = (dtre) dtvzVar;
        dtyq dtyqVar = dtreVar.a;
        if (dtyqVar.c()) {
            throw new IllegalArgumentException("cannot join on @Query");
        }
        dtrj dtrjVar = (dtrj) dtyqVar.e;
        if (dtrjVar.l != null) {
            throw new IllegalArgumentException("cannot specify having on joined table");
        }
        engw engwVar = dtrjVar.p;
        if (engwVar != null && !engwVar.isEmpty()) {
            throw new IllegalArgumentException("cannot specify union on joined table");
        }
        if (!TextUtils.isEmpty(dtyqVar.n)) {
            throw new IllegalArgumentException("cannot specify limit on joined table");
        }
        if (!TextUtils.isEmpty(((dtrj) dtyqVar.e).n)) {
            throw new IllegalArgumentException("cannot specify offset on joined table");
        }
        dtrj dtrjVar2 = (dtrj) dtyqVar.e;
        if (dtrjVar2.b) {
            throw new IllegalArgumentException("cannot specify distinct on joined table");
        }
        if (dtrjVar2.i != null) {
            throw new IllegalArgumentException("cannot specify order by on joined table");
        }
        dtry dtryVar = dtreVar.b;
        boolean z = dtryVar == null;
        dtry dtryVar2 = dtreVar.c;
        if (z != (dtryVar2 == null)) {
            throw new IllegalArgumentException("joinColumn and parentJoinColumn must both be null or both be not null");
        }
        this.a.b().h(new dtvn(dtreVar.a, dtryVar, dtryVar2, dtreVar.d, dtreVar.e, i, dtreVar.g, dtreVar.f));
    }

    public final void A(int i) {
        ((dtri) this.a).n = String.valueOf(i);
    }

    public final void B(dtzj dtzjVar) {
        ((dtri) this.a).i = dtzjVar;
    }

    @Deprecated
    public final void C(String str) {
        ((dtri) this.a).i = new dtzr(str);
    }

    public final void D(dtvz dtvzVar) {
        a(dtvzVar, 4);
    }

    public final void E(dtvz dtvzVar) {
        a(dtvzVar, 1);
    }

    public final void F(dtvy dtvyVar) {
        a(dtvyVar.g(), 2);
    }

    public final void G(dtvz dtvzVar) {
        a(dtvzVar, 2);
    }

    public abstract dtyq b();

    public final dtyx j(dtvy dtvyVar) {
        D(dtvyVar.g());
        return this;
    }

    public final void k(duap duapVar) {
        dtri dtriVar = (dtri) this.a;
        if (dtriVar.g == null) {
            if (dtriVar.h == null) {
                int i = engw.d;
                dtriVar.g = new engr();
            } else {
                int i2 = engw.d;
                dtriVar.g = new engr();
                dtriVar.g.j(dtriVar.h);
                dtriVar.h = null;
            }
        }
        dtriVar.g.h(duapVar);
    }

    protected final void l() {
        dtrj dtrjVar = (dtrj) this.a.a();
        if (TextUtils.isEmpty(dtrjVar.m) && !TextUtils.isEmpty(dtrjVar.n)) {
            throw new IllegalStateException("offset requires limit");
        }
    }

    public final void m(dtry... dtryVarArr) {
        engw f = dtub.f(dtryVarArr);
        ((dtri) this.a).b = f == null ? null : engw.n(f);
    }

    public final void n(dtzj dtzjVar, String str) {
        dtri dtriVar = (dtri) this.a;
        if (dtriVar.d == null) {
            if (dtriVar.e == null) {
                int i = engw.d;
                dtriVar.d = new engr();
            } else {
                int i2 = engw.d;
                dtriVar.d = new engr();
                dtriVar.d.j(dtriVar.e);
                dtriVar.e = null;
            }
        }
        dtriVar.d.h(new dtqr(dtzjVar, str));
    }

    public final void o(String str, String str2) {
        dtri dtriVar = (dtri) this.a;
        if (dtriVar.r == null) {
            if (dtriVar.s == null) {
                dtriVar.r = new enhd();
            } else {
                dtriVar.r = new enhd();
                dtriVar.r.g(dtriVar.s);
                dtriVar.s = null;
            }
        }
        dtriVar.r.k(str, str2);
    }

    public final void p(dtyq dtyqVar) {
        dtri dtriVar = (dtri) this.a;
        if (dtriVar.p == null) {
            if (dtriVar.q == null) {
                int i = engw.d;
                dtriVar.p = new engr();
            } else {
                int i2 = engw.d;
                dtriVar.p = new engr();
                dtriVar.p.j(dtriVar.q);
                dtriVar.q = null;
            }
        }
        dtriVar.p.h(dtyqVar);
    }

    public final void q() {
        this.a.d(true);
    }

    public final void r() {
        this.a.f(true);
    }

    public final void s(dtry dtryVar, int i) {
        dtry dtryVar2;
        dtry dtryVar3;
        if (dtryVar.c() == null) {
            throw new IllegalArgumentException(a.b(dtryVar, "column ", " is not a foreign key"));
        }
        boolean equals = dtryVar.e().equals(this.a.i());
        dtry c = dtryVar.c();
        if (equals) {
            dtryVar2 = dtryVar;
            dtryVar3 = c;
        } else {
            if (!c.e().equals(this.a.i())) {
                throw new IllegalArgumentException("joining column to unrelated table");
            }
            dtryVar3 = dtryVar;
            dtryVar2 = c;
        }
        dtyq a = dtryVar3.a();
        this.a.b().h(new dtvn(a, dtryVar3, dtryVar2, "=", null, i, true, a.o));
    }

    public final void t() {
        this.a.e(true);
    }

    public final void u() {
        this.a.g(true);
    }

    public final void v(dtry... dtryVarArr) {
        ((dtri) this.a).k = (String) DesugarArrays.stream(dtryVarArr).map(new Function() { // from class: dtyv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dtry) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(","));
    }

    public final void w(dtzj dtzjVar) {
        ((dtri) this.a).l = dtzjVar;
    }

    public final void x(int i) {
        ((dtri) this.a).m = String.valueOf(i);
    }

    public final void y(String str) {
        ((dtri) this.a).m = str;
    }

    public final void z(String str) {
        ((dtri) this.a).t = new dtui(str);
    }
}
