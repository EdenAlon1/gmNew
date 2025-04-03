package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnoo {
    private final boolean a;
    private final hho b;
    private final hho c;

    public dnoo(boolean z, hho hhoVar, hho hhoVar2) {
        hhoVar.getClass();
        hhoVar2.getClass();
        this.a = z;
        this.b = hhoVar;
        this.c = hhoVar2;
    }

    public final void a() {
        this.c.b(Boolean.valueOf(!((Boolean) this.c.a()).booleanValue()));
        this.b.b(true);
    }

    public final boolean b() {
        if (((Boolean) this.c.a()).booleanValue()) {
            return ((Boolean) this.b.a()).booleanValue() || this.a;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnoo)) {
            return false;
        }
        dnoo dnooVar = (dnoo) obj;
        return this.a == dnooVar.a && ffkj.e(this.b, dnooVar.b) && ffkj.e(this.c, dnooVar.c);
    }

    public final int hashCode() {
        return ((((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BottomMetatextState(showByDefault=" + this.a + ", userInteracted=" + this.b + ", isShowing=" + this.c + ")";
    }
}
