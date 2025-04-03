package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpz extends dxqb {
    private final dwtm a;
    private final dwso b;

    public dxpz(dwtm dwtmVar, dwso dwsoVar) {
        if (dwtmVar == null) {
            throw new NullPointerException("Null groupKey");
        }
        this.a = dwtmVar;
        if (dwsoVar == null) {
            throw new NullPointerException("Null dataFileGroup");
        }
        this.b = dwsoVar;
    }

    @Override // defpackage.dxqb
    public final dwso a() {
        return this.b;
    }

    @Override // defpackage.dxqb
    public final dwtm b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxqb) {
            dxqb dxqbVar = (dxqb) obj;
            if (this.a.equals(dxqbVar.b()) && this.b.equals(dxqbVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        dwso dwsoVar = this.b;
        return "GroupKeyAndGroup{groupKey=" + this.a.toString() + ", dataFileGroup=" + dwsoVar.toString() + "}";
    }
}
