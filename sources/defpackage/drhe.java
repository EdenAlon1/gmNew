package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drhe implements dtab {
    public final fgcm a;
    public final boolean b;

    public drhe() {
        this((fgcm) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drhe)) {
            return false;
        }
        drhe drheVar = (drhe) obj;
        return ffkj.e(this.a, drheVar.a) && this.b == drheVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "MagicComposeConfiguration(uiState=" + this.a + ", useParentTheme=" + this.b + ")";
    }

    public drhe(fgcm fgcmVar, boolean z) {
        fgcmVar.getClass();
        this.a = fgcmVar;
        this.b = z;
    }

    public /* synthetic */ drhe(fgcm fgcmVar, int i) {
        this((i & 1) != 0 ? fgdm.a(new drja(null)) : fgcmVar, false);
    }
}
