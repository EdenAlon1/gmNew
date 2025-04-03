package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ddx b;
    final /* synthetic */ dwp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddt(ddx ddxVar, dwp dwpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ddxVar;
        this.c = dwpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ddt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dwn dwnVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0 && (dwnVar = this.b.h) != null) {
            dwq dwqVar = new dwq(this.c);
            this.a = 1;
            if (dwnVar.a(dwqVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ddt(this.b, this.c, ffguVar);
    }
}
