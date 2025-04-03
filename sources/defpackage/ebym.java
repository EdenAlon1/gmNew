package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ebym implements emwl {
    public void a(dhis dhisVar, ebwl ebwlVar) {
        throw null;
    }

    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        dhis dhisVar = (dhis) obj;
        ebwl m = ebwn.m();
        if (dhisVar.f() != null) {
            m.b(dhisVar.f());
        }
        if (dhisVar.h() != null) {
            ((ebwd) m).a = dhisVar.h();
        }
        if (dhisVar.j() != null) {
            b(dhisVar, m);
        }
        if (dhisVar.i() != null) {
            a(dhisVar, m);
        }
        if (dhisVar.e() != null) {
            ((ebwd) m).d = dhisVar.e();
        }
        c(dhisVar, m);
        if (dhisVar.g() != null) {
            ((ebwd) m).e = dhisVar.g();
        }
        return m.a();
    }

    public void b(dhis dhisVar, ebwl ebwlVar) {
        throw null;
    }

    public abstract void c(dhis dhisVar, ebwl ebwlVar);
}
