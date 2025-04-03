package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fxv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxt(fxv fxvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fxvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fxt) c((ild) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ild ildVar = (ild) this.c;
            fxq fxqVar = new fxq(this.b, null);
            fxs fxsVar = new fxs(this.b);
            this.a = 1;
            if (dtr.i(ildVar, null, null, fxqVar, fxsVar, this, 3) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fxt fxtVar = new fxt(this.b, ffguVar);
        fxtVar.c = obj;
        return fxtVar;
    }
}
