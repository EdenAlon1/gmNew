package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtx extends jrk {
    public final String c;
    public final jtv d;
    public final jsy e;
    public final int f;
    private final boolean g;

    public jtx(String str, jtv jtvVar, jsy jsyVar) {
        super(jua.a, new jsw(new jsv[0]));
        this.c = str;
        this.d = jtvVar;
        this.e = jsyVar;
        this.f = 0;
        this.g = true;
    }

    @Override // defpackage.jsd
    public final jsy b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtx)) {
            return false;
        }
        jtx jtxVar = (jtx) obj;
        if (!ffkj.e(this.c, jtxVar.c) || !ffkj.e(this.d, jtxVar.d) || !ffkj.e(this.e, jtxVar.e)) {
            return false;
        }
        int i = jtxVar.f;
        if (!jss.b(0, 0)) {
            return false;
        }
        boolean z = jtxVar.g;
        return true;
    }

    public final int hashCode() {
        return (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.i) * 961) + 1231;
    }

    public final String toString() {
        return "Font(GoogleFont(\"" + this.c + "\", bestEffort=true), weight=" + this.e + ", style=" + ((Object) jss.a(0)) + ')';
    }

    @Override // defpackage.jsd
    public final void c() {
    }
}
