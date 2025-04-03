package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yrd extends ffhv implements ffji {
    int a;
    final /* synthetic */ yrg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrd(yrg yrgVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = yrgVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpif dpifVar = this.b.c;
            this.a = 1;
            if (dpifVar.c(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new yrd(this.b, (ffgu) obj).b(ffcu.a);
    }
}
