package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjkt extends ffhv implements ffji {
    int a;
    final /* synthetic */ cjkz b;
    final /* synthetic */ cjlt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjkt(cjkz cjkzVar, cjlt cjltVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cjkzVar;
        this.c = cjltVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cjkz cjkzVar = this.b;
        cjlt cjltVar = this.c;
        this.a = 1;
        Object e = cjkzVar.e(cjltVar, this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cjkt(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
