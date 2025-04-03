package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpnj {
    public final dpni a;
    public final drqm b;
    public final dpnk c;
    public final boolean d;
    private final boolean e = true;
    private final boolean f = true;

    public dpnj(dpni dpniVar, drqm drqmVar, dpnk dpnkVar, boolean z) {
        this.a = dpniVar;
        this.b = drqmVar;
        this.c = dpnkVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpnj)) {
            return false;
        }
        dpnj dpnjVar = (dpnj) obj;
        if (!ffkj.e(this.a, dpnjVar.a)) {
            return false;
        }
        boolean z = dpnjVar.e;
        if (!ffkj.e(this.b, dpnjVar.b) || !ffkj.e(this.c, dpnjVar.c)) {
            return false;
        }
        boolean z2 = dpnjVar.f;
        return this.d == dpnjVar.d;
    }

    public final int hashCode() {
        dpni dpniVar = this.a;
        return ((((((((((dpniVar == null ? 0 : dpniVar.hashCode()) * 31) + dpne.a(true)) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + dpne.a(true)) * 31) + dpne.a(this.d);
    }

    public final String toString() {
        return "CameraConfiguration(miniCameraMode=" + this.a + ", showFab=true, outputFileProvider=" + this.b + ", launcher=" + this.c + ", mirrorFrontFacingCameraHorizontally=true, enableMiniCameraLifecycleObserverFix=" + this.d + ")";
    }
}
