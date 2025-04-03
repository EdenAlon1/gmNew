package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzjg extends ffhv implements ffji {
    int a;
    final /* synthetic */ bzid b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzjg(bzid bzidVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = bzidVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bzid bzidVar = this.b;
            this.a = 1;
            if (bzidVar.m(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bzjg(this.b, (ffgu) obj).b(ffcu.a);
    }
}
