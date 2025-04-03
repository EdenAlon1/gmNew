package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crgj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ crgn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crgj(crgn crgnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = crgnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crgj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.c;
            crgn crgnVar = this.b;
            ffss a = emau.a(ffskVar, crgnVar.e, new crgi(crgnVar, null));
            this.a = 1;
            if (a.c(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        crgj crgjVar = new crgj(this.b, ffguVar);
        crgjVar.c = obj;
        return crgjVar;
    }
}
