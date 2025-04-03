package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hjb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjn b;
    final /* synthetic */ hhh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjb(ffjn ffjnVar, hhh hhhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjnVar;
        this.c = hhhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hjb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            ffjn ffjnVar = this.b;
            hhh hhhVar = this.c;
            this.a = 1;
            if (ffjnVar.a(ffskVar, hhhVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        hjb hjbVar = new hjb(this.b, this.c, ffguVar);
        hjbVar.d = obj;
        return hjbVar;
    }
}
