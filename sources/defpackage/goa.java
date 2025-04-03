package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goa {
    public final ffrf a;
    public final gob b;

    public goa(gob gobVar, ffrf ffrfVar) {
        this.b = gobVar;
        this.a = ffrfVar;
    }

    public final void a() {
        if (this.a.i()) {
            this.a.w(gos.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        goa goaVar = (goa) obj;
        return ffkj.e(this.b, goaVar.b) && ffkj.e(this.a, goaVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
