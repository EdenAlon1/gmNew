package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dne b;
    final /* synthetic */ dhy c;
    final /* synthetic */ ffjm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnc(dne dneVar, dhy dhyVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dneVar;
        this.c = dhyVar;
        this.d = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dne dneVar = this.b;
            dhy dhyVar = this.c;
            dnb dnbVar = new dnb(dneVar, this.d, null);
            this.a = 1;
            if (dneVar.c.b(dneVar.b, dhyVar, dnbVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dnc(this.b, this.c, this.d, ffguVar);
    }
}
