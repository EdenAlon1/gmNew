package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class day extends ffhv implements ffjm {
    float a;
    int b;
    final /* synthetic */ dbe c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public day(dbe dbeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dbeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((day) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffsk ffskVar;
        float a;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            a = this.a;
            ffskVar = (ffsk) this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ffskVar = (ffsk) this.d;
            a = dap.a(ffskVar.hT());
        }
        while (ffsl.g(ffskVar)) {
            dax daxVar = new dax(this.c, a);
            this.d = ffskVar;
            this.a = a;
            this.b = 1;
            if (hhj.c(daxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        day dayVar = new day(this.c, ffguVar);
        dayVar.d = obj;
        return dayVar;
    }
}
