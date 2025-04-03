package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqhe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqih b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqhe(cqih cqihVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cqihVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqhe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cqem cqemVar = (cqem) this.b.a.b();
            this.a = 1;
            if (cqemVar.a(null, null, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqhe(this.b, ffguVar);
    }
}
