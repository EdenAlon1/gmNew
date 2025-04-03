package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oji extends vk {
    public final oco a;
    private boolean d;

    public oji(mr mrVar, ffhd ffhdVar, ffhd ffhdVar2) {
        ffhdVar.getClass();
        ffhdVar2.getClass();
        oco ocoVar = new oco(mrVar, new ml(this), ffhdVar, ffhdVar2);
        this.a = ocoVar;
        super.E(3);
        A(new ojg(this));
        F(new ojh(this));
        ffxx ffxxVar = ocoVar.i;
        ffxx ffxxVar2 = ocoVar.j;
    }

    public static final void m(oji ojiVar) {
        if (ojiVar.c != 3 || ojiVar.d) {
            return;
        }
        ojiVar.d = true;
        super.E(1);
    }

    public final void F(ffji ffjiVar) {
        oco ocoVar = this.a;
        if (ocoVar.k.get() == null) {
            ffji ffjiVar2 = ocoVar.m;
            ffjiVar2.getClass();
            ocoVar.k.set(ffjiVar2);
            ogg oggVar = ocoVar.g.e;
            oggVar.a.add(ffjiVar2);
            odk odkVar = (odk) oggVar.b.c();
            if (odkVar != null) {
                ffjiVar2.invoke(odkVar);
            }
        }
        ocoVar.l.add(ffjiVar);
    }

    public final void G() {
        this.a.g.e();
    }

    @Override // defpackage.vk
    public final int a() {
        oco ocoVar = this.a;
        oko okoVar = (oko) ocoVar.f.get();
        return okoVar != null ? okoVar.f() : ocoVar.g.d.f();
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return -1L;
    }
}
