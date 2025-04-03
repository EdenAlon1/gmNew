package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsbr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsbw b;
    final /* synthetic */ dsar c;
    final /* synthetic */ dsbs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsbr(dsbw dsbwVar, dsar dsarVar, dsbs dsbsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsbwVar;
        this.c = dsarVar;
        this.d = dsbsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsbr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dsbw dsbwVar = this.b;
            dsar dsarVar = this.c;
            dsbs dsbsVar = this.d;
            this.a = 1;
            if (dsbwVar.G(dsarVar, dsbsVar.s, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsbr(this.b, this.c, this.d, ffguVar);
    }
}
