package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeir extends eeit {
    public eeis a;

    public eeir() {
        this.e = "tel";
    }

    public final String a() {
        return this.a.b;
    }

    public final String b() {
        return this.a.c();
    }

    @Override // defpackage.eeit, defpackage.eeiw
    public final String c() {
        return this.e + ":" + this.a.c();
    }

    @Override // defpackage.eeit, defpackage.eeiw
    public final Object clone() {
        eeir eeirVar = new eeir();
        eeirVar.e = this.e;
        eeis eeisVar = this.a;
        if (eeisVar != null) {
            eeirVar.a = (eeis) eeisVar.clone();
        }
        return eeirVar;
    }

    @Override // defpackage.eeit
    public final String d() {
        return this.e;
    }

    public final boolean e() {
        return this.a.a;
    }

    @Override // defpackage.eeit
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eeir)) {
            return false;
        }
        eeir eeirVar = (eeir) obj;
        eeis eeisVar = this.a;
        if (eeisVar == null && eeirVar.a != null) {
            return false;
        }
        if (eeisVar == null || eeisVar.equals(eeirVar.a)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.eeit
    public final void h(String str) {
        eeis eeisVar = this.a;
        eeisVar.c.e(new eejc("method", str));
    }

    @Override // defpackage.eeit
    public final int hashCode() {
        int hashCode = super.hashCode();
        eeis eeisVar = this.a;
        return eeisVar != null ? (hashCode * 37) + eeisVar.hashCode() : hashCode;
    }

    @Override // defpackage.eeit
    public final boolean l() {
        return false;
    }

    @Override // defpackage.eeit
    public final String toString() {
        return c();
    }
}
