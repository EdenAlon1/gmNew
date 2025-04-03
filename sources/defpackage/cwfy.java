package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwfy implements cwgp {
    private final String a;
    private final ffix b;
    private final ffbz c;

    public cwfy(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
        this.c = ffca.b(3, ffixVar);
    }

    @Override // defpackage.cwgp
    public final cwfb a() {
        return (cwfb) this.c.a();
    }

    @Override // defpackage.cwgp
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwfy)) {
            return false;
        }
        cwfy cwfyVar = (cwfy) obj;
        return ffkj.e(this.a, cwfyVar.a) && ffkj.e(this.b, cwfyVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LazyContactSuggestionsRowUiData(key=" + this.a + ", initializer=" + this.b + ")";
    }
}
