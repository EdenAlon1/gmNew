package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ sql b;
    final /* synthetic */ sra c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqj(ffgu ffguVar, sql sqlVar, sra sraVar) {
        super(2, ffguVar);
        this.b = sqlVar;
        this.c = sraVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sqj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        sql sqlVar = this.b;
        sra sraVar = this.c;
        comc a = sqlVar.a();
        sqk sqkVar = new sqk(sraVar);
        this.a = 1;
        Object d = a.d(sqkVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sqj sqjVar = new sqj(ffguVar, this.b, this.c);
        sqjVar.d = obj;
        return sqjVar;
    }
}
