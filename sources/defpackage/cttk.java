package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cttk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cttm b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cttk(cttm cttmVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cttmVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cttk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        cttm cttmVar = this.b;
        ffji ffjiVar = this.c;
        this.a = 1;
        if (cttmVar.f(ffjiVar, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cttk(this.b, this.c, ffguVar);
    }
}
