package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvy {
    public final String a = "camera";
    public final dpwz b;
    public final ujn c;

    public dpvy(dpwz dpwzVar, ujn ujnVar) {
        this.b = dpwzVar;
        this.c = ujnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpvy)) {
            return false;
        }
        dpvy dpvyVar = (dpvy) obj;
        return ffkj.e(this.a, dpvyVar.a) && ffkj.e(this.b, dpvyVar.b) && ffkj.e(this.c, dpvyVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) - 2095793070) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CameraEffectsConfiguration(categoryName=" + this.a + ", effectsFilter=" + this.b + ", performanceLogger=" + this.c + ")";
    }
}
