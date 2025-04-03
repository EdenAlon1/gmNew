package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zfw {
    public final ffsk a;
    public final alxr b;
    public final zfj c;
    public final ffbz d;
    public final xgl e;
    public final xgg f;

    public zfw(ffsk ffskVar, alxr alxrVar, zfj zfjVar, ffbz ffbzVar, xgl xglVar, xgg xggVar) {
        alxrVar.getClass();
        this.a = ffskVar;
        this.b = alxrVar;
        this.c = zfjVar;
        this.d = ffbzVar;
        this.e = xglVar;
        this.f = xggVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfw)) {
            return false;
        }
        zfw zfwVar = (zfw) obj;
        return ffkj.e(this.a, zfwVar.a) && ffkj.e(this.b, zfwVar.b) && ffkj.e(this.c, zfwVar.c) && ffkj.e(this.d, zfwVar.d) && ffkj.e(this.e, zfwVar.e) && ffkj.e(this.f, zfwVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "MessageFooterUiData(coroutineScope=" + this.a + ", message=" + this.b + ", mediaViewerUiData=" + this.c + ", sendButtonClickHandler=" + this.d + ", emojiUsageLogger=" + this.e + ", emojiUsageCacheAccessor=" + this.f + ")";
    }
}
