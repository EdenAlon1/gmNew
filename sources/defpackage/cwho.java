package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwho extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgcm b;
    final /* synthetic */ ajiy c;
    final /* synthetic */ cwhr d;
    final /* synthetic */ engw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwho(fgcm fgcmVar, ajiy ajiyVar, cwhr cwhrVar, engw engwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgcmVar;
        this.c = ajiyVar;
        this.d = cwhrVar;
        this.e = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwho) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgcm fgcmVar = this.b;
            cwhn cwhnVar = new cwhn(this.c, this.d, this.e, fgcmVar);
            this.a = 1;
            if (fgcmVar.a(cwhnVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwho(this.b, this.c, this.d, this.e, ffguVar);
    }
}
