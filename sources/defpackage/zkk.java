package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkk {
    public final dmms a;
    public final dmpi d;
    private final boolean f;
    private final boolean g;
    public final dmnh b = null;
    public final int e = 2;
    public final dmov c = new dmov(ffel.a, null, new ffji() { // from class: zkj
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            ((dmog) obj).getClass();
            return ffcu.a;
        }
    });

    public zkk(dmms dmmsVar, boolean z, boolean z2) {
        this.a = dmmsVar;
        this.f = z;
        this.g = z2;
        this.d = new dmpi(false, true, z, z2, 71);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkk)) {
            return false;
        }
        zkk zkkVar = (zkk) obj;
        if (!ffkj.e(this.a, zkkVar.a)) {
            return false;
        }
        dmnh dmnhVar = zkkVar.b;
        if (!ffkj.e(null, null)) {
            return false;
        }
        int i = zkkVar.e;
        return this.f == zkkVar.f && this.g == zkkVar.g;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 961) + 2) * 31) + zki.a(this.f)) * 31) + zki.a(this.g);
    }

    public final String toString() {
        return "FullScreenComposeRowUiData(draft=" + this.a + ", inputs=null, theme=PROJECTOR, fixTextOnWhiteBackground=" + this.f + ", showSpacerForNullShortcuts=" + this.g + ")";
    }
}
