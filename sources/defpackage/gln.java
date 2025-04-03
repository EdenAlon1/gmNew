package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gln extends ffhv implements ffjm {
    int a;
    final /* synthetic */ glo b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gln(glo gloVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gloVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gln) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            glo gloVar = this.b;
            int i2 = this.c;
            this.a = 1;
            if (gloVar.a.d(i2, gloVar.c, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gln(this.b, this.c, ffguVar);
    }
}
