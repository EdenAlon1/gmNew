package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbcl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbcd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbcl(ffgu ffguVar, dbcd dbcdVar) {
        super(2, ffguVar);
        this.b = dbcdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbcl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dbcd dbcdVar = this.b;
        dbcm dbcmVar = new dbcm(dbcdVar, null);
        this.a = 1;
        Object b = dbcd.b(dbcdVar, dbcmVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbcl dbclVar = new dbcl(ffguVar, this.b);
        dbclVar.c = obj;
        return dbclVar;
    }
}
