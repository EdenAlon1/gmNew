package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbfj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbfl b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbfj(ffgu ffguVar, dbfl dbflVar) {
        super(2, ffguVar);
        this.b = dbflVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbfj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                axld axldVar = this.b.a;
                this.a = 1;
                obj = axldVar.e(this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ((axla) obj).name();
        } catch (Exception e) {
            e.toString();
            return "Failed. ".concat(e.toString());
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbfj dbfjVar = new dbfj(ffguVar, this.b);
        dbfjVar.c = obj;
        return dbfjVar;
    }
}
