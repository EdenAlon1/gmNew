package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yqx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yrg b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqx(yrg yrgVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yrgVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yqx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            yrg yrgVar = this.b;
            int i2 = this.c;
            this.a = 1;
            obj = yrgVar.c(i2, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ((Boolean) obj).booleanValue();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yqx(this.b, this.c, ffguVar);
    }
}
