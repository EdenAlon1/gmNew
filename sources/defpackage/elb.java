package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elb extends hvh implements ixn {
    public ffix a;
    public eks b;
    public dqs c;
    public boolean d;
    public boolean e;
    private jjk f;
    private final ffji g = new ekw(this);
    private ffji h;

    public elb(ffix ffixVar, eks eksVar, dqs dqsVar, boolean z, boolean z2) {
        this.a = ffixVar;
        this.b = eksVar;
        this.c = dqsVar;
        this.d = z;
        this.e = z2;
        a();
    }

    public final void a() {
        this.f = new jjk(new ekx(this), new eky(this), this.e);
        this.h = this.d ? new ela(this) : null;
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.ixn
    public final void dO(jkv jkvVar) {
        jkr.L(jkvVar);
        jku jkuVar = jkm.a;
        jkvVar.e(jkm.J, this.g);
        if (this.c == dqs.a) {
            jjk jjkVar = this.f;
            if (jjkVar == null) {
                ffkj.c("scrollAxisRange");
                jjkVar = null;
            }
            jkr.A(jkvVar, jjkVar);
        } else {
            jjk jjkVar2 = this.f;
            if (jjkVar2 == null) {
                ffkj.c("scrollAxisRange");
                jjkVar2 = null;
            }
            jkr.m(jkvVar, jjkVar2);
        }
        ffji ffjiVar = this.h;
        if (ffjiVar != null) {
            jku jkuVar2 = jjl.a;
            jkvVar.e(jjl.f, new jjb(null, ffjiVar));
        }
        ekv ekvVar = new ekv(this);
        jku jkuVar3 = jjl.a;
        jkvVar.e(jjl.B, new jjb(null, new jkq(ekvVar)));
        jjc e = this.b.e();
        jku jkuVar4 = jkm.f;
        ffmx ffmxVar = jkr.a[20];
        jkuVar4.a(jkvVar, e);
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean ea() {
        return false;
    }
}
