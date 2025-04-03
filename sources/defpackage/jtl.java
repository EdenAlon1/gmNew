package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtl implements jsd {
    public final int a;
    public final jsw b;
    private final jsy c;
    private final int d = 0;
    private final int e = 0;

    public jtl(int i, jsy jsyVar, jsw jswVar) {
        this.a = i;
        this.c = jsyVar;
        this.b = jswVar;
    }

    @Override // defpackage.jsd
    public final int a() {
        return 0;
    }

    @Override // defpackage.jsd
    public final jsy b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtl)) {
            return false;
        }
        jtl jtlVar = (jtl) obj;
        if (this.a == jtlVar.a && ffkj.e(this.c, jtlVar.c)) {
            int i = jtlVar.d;
            if (jss.b(0, 0) && ffkj.e(this.b, jtlVar.b)) {
                int i2 = jtlVar.e;
                return jsr.b(0, 0);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.i) * 29791) + this.b.hashCode();
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.c + ", style=" + ((Object) jss.a(0)) + ", loadingStrategy=" + ((Object) jsr.a(0)) + ')';
    }

    @Override // defpackage.jsd
    public final void c() {
    }
}
