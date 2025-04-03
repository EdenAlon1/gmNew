package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbpl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbpl(hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbpl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        long d;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        do {
            hho hhoVar = this.b;
            hhoVar.b(dbpr.a(hhoVar).plusSeconds(1L));
            long j = ffpw.a;
            d = ffpy.d(1, ffpz.d);
            this.a = 1;
        } while (ffsw.d(d, this) != ffhhVar);
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbpl(this.b, ffguVar);
    }
}
