package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdkl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdkp b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdkl(cdkp cdkpVar, String str, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cdkpVar;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdkl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cdkp cdkpVar = this.b;
            String str = this.c;
            int i2 = this.d;
            this.a = 1;
            if (cdkpVar.i(str, i2, true, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdkl(this.b, this.c, this.d, ffguVar);
    }
}
