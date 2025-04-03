package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvl implements lra {
    public final float a;
    public final float b;

    public lvl(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        lti.b(z, "Invalid latitude or longitude");
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.lra
    public final /* synthetic */ lqc a() {
        return null;
    }

    @Override // defpackage.lra
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lvl lvlVar = (lvl) obj;
            if (this.a == lvlVar.a && this.b == lvlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((ermj.a(this.a) + 527) * 31) + ermj.a(this.b);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }

    @Override // defpackage.lra
    public final /* synthetic */ void b(lqy lqyVar) {
    }
}
