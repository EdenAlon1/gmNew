package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqnq extends ffhv implements ffji {
    int a;
    final /* synthetic */ cqnv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqnq(cqnv cqnvVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cqnvVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cqnv cqnvVar = this.b;
            this.a = 1;
            if (cqnvVar.m(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cqnq(this.b, (ffgu) obj).b(ffcu.a);
    }
}
