package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbdo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbdp b;
    final /* synthetic */ eisx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbdo(ffgu ffguVar, dbdp dbdpVar, eisx eisxVar) {
        super(2, ffguVar);
        this.b = dbdpVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbdo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                cryz cryzVar = this.b.a;
                eisx eisxVar = this.c;
                this.a = 1;
                obj = cryzVar.d(eisxVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ((cryp) obj).name();
        } catch (Exception e) {
            e.toString();
            return "Failed. ".concat(e.toString());
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbdo dbdoVar = new dbdo(ffguVar, this.b, this.c);
        dbdoVar.d = obj;
        return dbdoVar;
    }
}
