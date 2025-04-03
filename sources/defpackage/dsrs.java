package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsrs {
    public final hvi a;
    public final ffjp b;
    public final ffjp c;
    public final ffjp d;
    public final ffjp e;
    public final ffjp f;
    public final ffjp g;
    public final ffjo h;

    public /* synthetic */ dsrs(ffjp ffjpVar, ffjp ffjpVar2, ffjp ffjpVar3, ffjp ffjpVar4, ffjp ffjpVar5, ffjp ffjpVar6, ffjo ffjoVar, int i) {
        hve hveVar = (i & 1) != 0 ? hvi.e : null;
        ffjpVar = (i & 2) != 0 ? dspb.a : ffjpVar;
        ffjpVar2 = (i & 4) != 0 ? dspb.b : ffjpVar2;
        ffjpVar3 = (i & 8) != 0 ? dspb.c : ffjpVar3;
        ffjpVar5 = (i & 32) != 0 ? dspb.d : ffjpVar5;
        ffjpVar6 = (i & 64) != 0 ? dspb.e : ffjpVar6;
        ffjoVar = (i & 128) != 0 ? dspb.f : ffjoVar;
        hveVar.getClass();
        ffjpVar5.getClass();
        ffjpVar6.getClass();
        ffjoVar.getClass();
        this.a = hveVar;
        this.b = ffjpVar;
        this.c = ffjpVar2;
        this.d = ffjpVar3;
        this.e = ffjpVar4;
        this.f = ffjpVar5;
        this.g = ffjpVar6;
        this.h = ffjoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsrs)) {
            return false;
        }
        dsrs dsrsVar = (dsrs) obj;
        return ffkj.e(this.a, dsrsVar.a) && ffkj.e(this.b, dsrsVar.b) && ffkj.e(this.c, dsrsVar.c) && ffkj.e(this.d, dsrsVar.d) && ffkj.e(this.e, dsrsVar.e) && ffkj.e(this.f, dsrsVar.f) && ffkj.e(this.g, dsrsVar.g) && ffkj.e(this.h, dsrsVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "UiSpec(modifier=" + this.a + ", background=" + this.b + ", header=" + this.c + ", footer=" + this.d + ", content=" + this.e + ", contentOverlay=" + this.f + ", screenOverlay=" + this.g + ", snackbar=" + this.h + ")";
    }
}
