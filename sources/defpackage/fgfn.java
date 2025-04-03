package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgfn implements ffgu, ffhs {
    private final ffgu a;
    private final ffhd b;

    public fgfn(ffgu ffguVar, ffhd ffhdVar) {
        this.a = ffguVar;
        this.b = ffhdVar;
    }

    @Override // defpackage.ffhs
    public final ffhs dI() {
        ffgu ffguVar = this.a;
        if (ffguVar instanceof ffhs) {
            return (ffhs) ffguVar;
        }
        return null;
    }

    @Override // defpackage.ffgu
    public final ffhd u() {
        return this.b;
    }

    @Override // defpackage.ffgu
    public final void w(Object obj) {
        this.a.w(obj);
    }

    @Override // defpackage.ffhs
    public final void dJ() {
    }
}
