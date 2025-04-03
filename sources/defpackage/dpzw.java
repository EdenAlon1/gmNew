package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpzw implements dpzx {
    public final fgdj a;
    public final ffji b;
    public final ffix c;
    public final ffxx d;
    public final ffji e;
    public final boolean f;
    private final ffxx g;

    public dpzw(ffxx ffxxVar, fgdj fgdjVar, ffji ffjiVar, ffix ffixVar, ffxx ffxxVar2, ffji ffjiVar2, boolean z) {
        ffxxVar2.getClass();
        this.g = ffxxVar;
        this.a = fgdjVar;
        this.b = ffjiVar;
        this.c = ffixVar;
        this.d = ffxxVar2;
        this.e = ffjiVar2;
        this.f = z;
    }

    @Override // defpackage.dpzx
    public final ffxx a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpzw)) {
            return false;
        }
        dpzw dpzwVar = (dpzw) obj;
        return ffkj.e(this.g, dpzwVar.g) && ffkj.e(this.a, dpzwVar.a) && ffkj.e(this.b, dpzwVar.b) && ffkj.e(this.c, dpzwVar.c) && ffkj.e(this.d, dpzwVar.d) && ffkj.e(this.e, dpzwVar.e) && this.f == dpzwVar.f;
    }

    public final int hashCode() {
        return (((((((((((this.g.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        return "InApp(titleFlow=" + this.g + ", selectedMedia=" + this.a + ", prepareSystemContentPicker=" + this.b + ", launchSystemContentPicker=" + this.c + ", galleryMedia=" + this.d + ", onGalleryItemClick=" + this.e + ", shouldAskForPermission=" + this.f + ")";
    }
}
