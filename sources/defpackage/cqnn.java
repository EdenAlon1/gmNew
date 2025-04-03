package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqnn extends ffhv implements ffji {
    int a;
    final /* synthetic */ cqnv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqnn(cqnv cqnvVar, ffgu ffguVar) {
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
            if (cqnvVar.j(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cqnn(this.b, (ffgu) obj).b(ffcu.a);
    }
}
