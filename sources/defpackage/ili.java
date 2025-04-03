package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ili implements hvg {
    public ffji a;
    public boolean b;
    public final ilb c = new ilh(this);
    private ils d;

    @Override // defpackage.hvi
    public final /* synthetic */ hvi a(hvi hviVar) {
        return hvd.a(this, hviVar);
    }

    @Override // defpackage.hvi
    public final /* synthetic */ Object b(Object obj, ffjm ffjmVar) {
        return hvf.a(this, obj, ffjmVar);
    }

    @Override // defpackage.hvi
    public final /* synthetic */ boolean c(ffji ffjiVar) {
        return hvf.b(this, ffjiVar);
    }

    public final ffji d() {
        ffji ffjiVar = this.a;
        if (ffjiVar != null) {
            return ffjiVar;
        }
        ffkj.c("onTouchEvent");
        return null;
    }

    public final void e(ils ilsVar) {
        ils ilsVar2 = this.d;
        if (ilsVar2 != null) {
            ilsVar2.a = null;
        }
        this.d = ilsVar;
        if (ilsVar == null) {
            return;
        }
        ilsVar.a = this;
    }
}
