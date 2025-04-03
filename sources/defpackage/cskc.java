package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cskc {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/common/Logger");
    private final String b;
    private final csjq c;

    private cskc(String str, csjq csjqVar) {
        this.b = str;
        this.c = csjqVar;
    }

    @Deprecated
    public static cskc f(String str, final Class cls) {
        return new cskc(str, new csjq() { // from class: cska
            @Override // defpackage.csjq
            public final void a(StringBuilder sb) {
                sb.append(cls.getSimpleName());
            }
        });
    }

    @Deprecated
    public static cskc g(String str, final String str2) {
        return new cskc(str, new csjq() { // from class: cskb
            @Override // defpackage.csjq
            public final void a(StringBuilder sb) {
                sb.append(str2);
            }
        });
    }

    private final csjb u(int i) {
        csjb csjbVar = (csjb) csjb.a.get();
        if (csjbVar == null) {
            csjbVar = new csjb();
            csjb.a.set(csjbVar);
        } else {
            csjbVar.r();
        }
        csjbVar.t(i, this.b, this.c);
        return csjbVar;
    }

    @Deprecated
    public final csjb a() {
        return u(3);
    }

    @Deprecated
    public final csjb b() {
        return u(6);
    }

    @Deprecated
    public final csjb c() {
        return u(4);
    }

    @Deprecated
    public final csjb d() {
        return u(2);
    }

    @Deprecated
    public final csjb e() {
        return u(5);
    }

    public final enrr h() {
        enrr enrrVar = (enrr) a.g();
        enrrVar.Y(ente.a, this.b);
        return enrrVar;
    }

    public final enrr i() {
        enrr enrrVar = (enrr) a.h();
        enrrVar.Y(ente.a, this.b);
        return enrrVar;
    }

    public final enrr j() {
        enrr enrrVar = (enrr) a.i();
        enrrVar.Y(ente.a, this.b);
        return enrrVar;
    }

    public final enrr k() {
        enrr enrrVar = (enrr) a.j();
        enrrVar.Y(ente.a, this.b);
        return enrrVar;
    }

    @Deprecated
    public final void l(String str) {
        csjy.c("BugleBattery", str);
    }

    @Deprecated
    public final void m(String str) {
        csjb a2 = a();
        a2.I(str);
        a2.r();
    }

    @Deprecated
    public final void n(String str) {
        csjb b = b();
        b.I(str);
        b.r();
    }

    @Deprecated
    public final void o(String str, Throwable th) {
        csjb b = b();
        b.I(str);
        b.s(th);
    }

    @Deprecated
    public final void p(String str) {
        csjb c = c();
        c.I(str);
        c.r();
    }

    @Deprecated
    public final void q(String str) {
        csjb d = d();
        d.I(str);
        d.r();
    }

    @Deprecated
    public final void r(String str) {
        csjb e = e();
        e.I(str);
        e.r();
    }

    @Deprecated
    public final void s(String str, Throwable th) {
        csjb e = e();
        e.I(str);
        e.s(th);
    }

    @Deprecated
    public final boolean t(int i) {
        return csjy.q(this.b, i);
    }
}
