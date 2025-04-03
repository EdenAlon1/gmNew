package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpsq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsu b;
    final /* synthetic */ awui c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsq(cpsu cpsuVar, awui awuiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpsuVar;
        this.c = awuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cpsu cpsuVar = this.b;
            awui awuiVar = this.c;
            this.a = 1;
            obj = cpsu.g(cpsuVar, awuiVar, null, this, 6);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return new cprv((esrx) obj, this.b.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpsq(this.b, this.c, ffguVar);
    }
}
