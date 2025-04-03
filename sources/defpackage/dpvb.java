package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpvb extends ffhv implements ffjn {
    int a;
    final /* synthetic */ dpvl b;
    final /* synthetic */ hho c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpvb(dpvl dpvlVar, hho hhoVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = dpvlVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((iak) obj2).a;
        dpvb dpvbVar = new dpvb(this.b, this.c, (ffgu) obj3);
        dpvbVar.d = (dqt) obj;
        return dpvbVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [dqt, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r3 = this.d;
            if (this.b != null) {
                this.a = 1;
                if (r3.a(this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ffcu.a;
        }
        if (dpvi.d(this.c)) {
            this.b.b.invoke();
            dpvi.c(this.c, false);
        }
        return ffcu.a;
    }
}
