package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drzg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsao b;
    final /* synthetic */ drzi c;
    final /* synthetic */ dtan d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drzg(dsao dsaoVar, drzi drziVar, dtan dtanVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsaoVar;
        this.c = drziVar;
        this.d = dtanVar;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drzg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dsao dsaoVar = this.b;
        drzi drziVar = this.c;
        dtan dtanVar = this.d;
        String str = this.e;
        this.a = 1;
        Object f = dsaoVar.f(drziVar, dtanVar, str, 20, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drzg(this.b, this.c, this.d, this.e, ffguVar);
    }
}
