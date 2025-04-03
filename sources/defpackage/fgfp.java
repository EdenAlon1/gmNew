package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgfp extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffxy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgfp(ffxy ffxyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffxyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgfp) c(obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            ffxy ffxyVar = this.c;
            this.a = 1;
            if (ffxyVar.fQ(obj2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgfp fgfpVar = new fgfp(this.c, ffguVar);
        fgfpVar.b = obj;
        return fgfpVar;
    }
}
