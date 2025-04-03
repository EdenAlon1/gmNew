package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbnt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbnz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbnt(dbnz dbnzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dbnzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbnt) c((dbiq) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dbiq dbiqVar = (dbiq) this.c;
            dbnz dbnzVar = this.b;
            this.a = 1;
            if (dbnzVar.c(dbiqVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbnt dbntVar = new dbnt(this.b, ffguVar);
        dbntVar.c = obj;
        return dbntVar;
    }
}
