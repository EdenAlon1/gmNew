package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwfb implements cwgp {
    public final dngx a;
    private final String b;
    private final cwfb c = this;

    public cwfb(String str, dngx dngxVar) {
        this.b = str;
        this.a = dngxVar;
    }

    @Override // defpackage.cwgp
    public final cwfb a() {
        return this.c;
    }

    @Override // defpackage.cwgp
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwfb)) {
            return false;
        }
        cwfb cwfbVar = (cwfb) obj;
        return ffkj.e(this.b, cwfbVar.b) && ffkj.e(this.a, cwfbVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "ContactSuggestionsRowUiData(key=" + this.b + ", itemUiData=" + this.a + ")";
    }
}
