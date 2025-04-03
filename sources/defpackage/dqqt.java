package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqqt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqqw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqqt(dqqw dqqwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqqwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqqt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqqw dqqwVar = this.b;
            this.a = 1;
            if (dqqwVar.b.c(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqqt(this.b, ffguVar);
    }
}
