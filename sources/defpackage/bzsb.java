package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzsb extends ffhv implements ffji {
    int a;
    final /* synthetic */ bzse b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzsb(bzse bzseVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = bzseVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bzse bzseVar = this.b;
            this.a = 1;
            if (bzseVar.h(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bzsb(this.b, (ffgu) obj).b(ffcu.a);
    }
}
