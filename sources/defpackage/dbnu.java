package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbnu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbnz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbnu(dbnz dbnzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dbnzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbnu) c((dbiq) obj, (ffgu) obj2)).b(ffcu.a);
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
            if (dbnzVar.b(dbiqVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbnu dbnuVar = new dbnu(this.b, ffguVar);
        dbnuVar.c = obj;
        return dbnuVar;
    }
}
