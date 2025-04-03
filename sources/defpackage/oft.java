package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oft extends lld {
    public final ffsk a;
    public final oin h;
    public final ffix i;
    public final ffsd j;
    public final ffsd k;
    public oiv l;
    public final ffix m;
    private ffud n;

    public oft(ffsk ffskVar, Object obj, oin oinVar, ffix ffixVar, ffsd ffsdVar, ffsd ffsdVar2) {
        super(new oew(ffskVar, ffsdVar, ffsdVar2, oinVar, obj));
        this.a = ffskVar;
        this.h = oinVar;
        this.i = ffixVar;
        this.j = ffsdVar;
        this.k = ffsdVar2;
        this.m = new ofq(this);
        Object a = a();
        a.getClass();
        this.l = (oiv) a;
    }

    public final void b(boolean z) {
        ffud ffudVar = this.n;
        if (ffudVar == null || z) {
            if (ffudVar != null) {
                ffudVar.t(null);
            }
            this.n = ffqy.d(this.a, this.k, null, new ofs(this, null), 2);
        }
    }

    @Override // defpackage.lld
    protected final void h() {
        b(false);
    }
}
