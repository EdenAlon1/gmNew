package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ Object c;
    final /* synthetic */ ffsk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlf(ffjm ffjmVar, Object obj, ffsk ffskVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjmVar;
        this.c = obj;
        this.d = ffskVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffjm ffjmVar = this.b;
            Object obj2 = this.c;
            this.a = 1;
            if (ffjmVar.a(obj2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        ffsl.e(this.d, new dkv());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dlf(this.b, this.c, this.d, ffguVar);
    }
}
