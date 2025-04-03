package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsy extends fghk {
    public final ffql b;

    public ffsy(ffhd ffhdVar, ffgu ffguVar) {
        super(ffhdVar, ffguVar);
        this.b = new ffql(0, ffqo.a);
    }

    @Override // defpackage.fghk, defpackage.ffuq
    protected final void hR(Object obj) {
        hV(obj);
    }

    @Override // defpackage.fghk, defpackage.ffqq
    protected final void hV(Object obj) {
        do {
            int i = this.b.c;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                ffgu ffguVar = this.e;
                fggl.a(ffhi.c(ffguVar), ffrv.a(obj, ffguVar));
                return;
            }
        } while (!this.b.c(0, 2));
    }
}
