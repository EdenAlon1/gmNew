package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsho {
    public final dtbv a;
    public final dqls b;
    public final dtbg c;
    public final boolean d;
    public final boolean e;
    private final boolean f;

    public dsho(dtbv dtbvVar, dqls dqlsVar, dtbg dtbgVar, boolean z, boolean z2) {
        dtbvVar.getClass();
        this.a = dtbvVar;
        this.b = dqlsVar;
        this.c = dtbgVar;
        this.d = z;
        this.f = false;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsho)) {
            return false;
        }
        dsho dshoVar = (dsho) obj;
        if (!ffkj.e(this.a, dshoVar.a) || !ffkj.e(this.b, dshoVar.b) || !ffkj.e(this.c, dshoVar.c) || this.d != dshoVar.d) {
            return false;
        }
        boolean z = dshoVar.f;
        return this.e == dshoVar.e;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + dshm.a(this.d)) * 31) + dshm.a(false)) * 31) + dshm.a(this.e);
    }

    public final String toString() {
        return "HugoUiData(inputDisplay=" + this.a + ", draftController=" + this.b + ", stateCollector=" + this.c + ", enableThemingHugo=" + this.d + ", enableSkipUpdateWhenFragmentDestroyed=false, useAndroidFragment=" + this.e + ")";
    }

    public /* synthetic */ dsho(dtbv dtbvVar, dqls dqlsVar, dtbg dtbgVar, boolean z, int i) {
        this(dtbvVar, dqlsVar, (i & 4) != 0 ? dshn.a : dtbgVar, false, ((i & 32) == 0) & z);
    }
}
