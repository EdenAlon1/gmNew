package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class okx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okx(ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((okx) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            okw okwVar = new okw((ffxy) this.c, this.b, null);
            this.a = 1;
            if (ffsl.a(okwVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        okx okxVar = new okx(this.b, ffguVar);
        okxVar.c = obj;
        return okxVar;
    }
}
