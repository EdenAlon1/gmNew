package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxq implements pxm {
    public final otb a;
    public final otr b;
    public final otr c;
    private final oru d;

    public pxq(otb otbVar) {
        this.a = otbVar;
        this.d = new pxn(otbVar);
        this.b = new pxo(otbVar);
        this.c = new pxp(otbVar);
    }

    @Override // defpackage.pxm
    public final void a(pxk pxkVar) {
        this.a.m();
        this.a.n();
        try {
            this.d.a(pxkVar);
            this.a.q();
        } finally {
            this.a.o();
        }
    }
}
