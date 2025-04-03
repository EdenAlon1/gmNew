package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzpb {
    public static dzpa k() {
        dzmr dzmrVar = new dzmr();
        dzmrVar.h(false);
        int i = engw.d;
        dzmrVar.j(enou.a);
        dzmrVar.m(enou.a);
        dzmrVar.l(0L);
        return dzmrVar;
    }

    public abstract long a();

    public abstract long b();

    public abstract dzpa c();

    public abstract dzpg d();

    public abstract emxc e();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzpb) {
            dzpb dzpbVar = (dzpb) obj;
            if (d().equals(dzpbVar.d()) && a() == dzpbVar.a() && g().equals(dzpbVar.g()) && i().equals(dzpbVar.i()) && j() == dzpbVar.j() && h().equals(dzpbVar.h()) && b() == dzpbVar.b()) {
                return true;
            }
        }
        return false;
    }

    public abstract emxc f();

    public abstract emxc g();

    public abstract emxc h();

    public final int hashCode() {
        int hashCode = ((((((d().hashCode() + 527) * 31) + g().hashCode()) * 31) + (true != f().g() ? 1237 : 1231)) * 31) + i().hashCode();
        int i = true != j() ? 1237 : 1231;
        return (((((((hashCode * 31) + i) * 31) + dzoz.a(a())) * 31) + (h().g() ? h().c().hashCode() : 1237)) * 31) + dzoz.a(b());
    }

    public abstract emxc i();

    public abstract boolean j();
}
