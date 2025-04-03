package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ degt b;
    final /* synthetic */ cvic c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public degs(degt degtVar, cvic cvicVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = degtVar;
        this.c = cvicVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((degs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        degt degtVar = this.b;
        cvic cvicVar = this.c;
        this.a = 1;
        Object a = ffra.a(ekxi.a(degtVar.c), new degr(null, degtVar, cvicVar), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new degs(this.b, this.c, ffguVar);
    }
}
