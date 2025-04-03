package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class deg extends hvh implements itg, iwn {
    public long a;
    public ibq b;
    public float c;
    public idh d;
    public icr e;
    private long f = 9205357640488583168L;
    private kah g;
    private icr h;
    private idh i;

    public deg(long j, ibq ibqVar, float f, idh idhVar) {
        this.a = j;
        this.b = ibqVar;
        this.c = f;
        this.d = idhVar;
    }

    @Override // defpackage.iwn
    public final void a() {
        this.f = 9205357640488583168L;
        this.g = null;
        this.h = null;
        this.i = null;
        ith.a(this);
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        icr icrVar;
        if (this.d == idb.a) {
            if (!ffcp.a(this.a, ibw.h)) {
                ifoVar.r(this.a, 0L, (r20 & 4) != 0 ? ifq.c(ifoVar.b(), 0L) : 0L, (r20 & 8) != 0 ? 1.0f : 0.0f, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? 3 : 0);
            }
            ibq ibqVar = this.b;
            if (ibqVar != null) {
                ifq.i(ifoVar, ibqVar, 0L, 0L, this.c, null, 0, 118);
            }
        } else {
            if (iar.f(ifoVar.b(), this.f) && ifoVar.q() == this.g && ffkj.e(this.i, this.d)) {
                icrVar = this.h;
                icrVar.getClass();
            } else {
                iwo.a(this, new def(this, ifoVar));
                icrVar = this.e;
                this.e = null;
            }
            this.h = icrVar;
            this.f = ifoVar.b();
            this.g = ifoVar.q();
            this.i = this.d;
            icrVar.getClass();
            if (!ffcp.a(this.a, ibw.h)) {
                ics.b(ifoVar, icrVar, this.a);
            }
            ibq ibqVar2 = this.b;
            if (ibqVar2 != null) {
                ics.a(ifoVar, icrVar, ibqVar2, this.c);
            }
        }
        ifoVar.p();
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }
}
