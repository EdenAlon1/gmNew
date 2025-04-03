package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgeg extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fgeh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgeg(fgeh fgehVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = fgehVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgeg) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.b;
            fgeh fgehVar = this.c;
            this.a = 1;
            if (fgehVar.g(ffxyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgeg fgegVar = new fgeg(this.c, ffguVar);
        fgegVar.b = obj;
        return fgegVar;
    }
}
