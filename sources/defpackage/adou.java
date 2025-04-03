package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adou extends ffhv implements ffjm {
    int a;
    final /* synthetic */ deoa b;
    final /* synthetic */ adpj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adou(deoa deoaVar, adpj adpjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = deoaVar;
        this.c = adpjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adou) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            deoa deoaVar = this.b;
            adot adotVar = new adot(this.c);
            this.a = 1;
            if (fgct.g((fgct) deoaVar.g, adotVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adou(this.b, this.c, ffguVar);
    }
}
