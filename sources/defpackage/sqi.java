package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ sql b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqi(ffgu ffguVar, sql sqlVar) {
        super(2, ffguVar);
        this.b = sqlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sqi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        comc a = this.b.a();
        this.a = 1;
        Object c = a.c(this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sqi sqiVar = new sqi(ffguVar, this.b);
        sqiVar.c = obj;
        return sqiVar;
    }
}
