package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnrt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgcm b;
    final /* synthetic */ dnto c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnrt(fgcm fgcmVar, dnto dntoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgcmVar;
        this.c = dntoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnrt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgcm fgcmVar = this.b;
            dnrs dnrsVar = new dnrs(this.c, null);
            this.a = 1;
            if (ffyk.b(fgcmVar, dnrsVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dnrt(this.b, this.c, ffguVar);
    }
}
