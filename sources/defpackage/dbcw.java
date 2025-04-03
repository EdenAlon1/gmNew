package defpackage;

import defpackage.dbcd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbcw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbcd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbcw(ffgu ffguVar, dbcd dbcdVar) {
        super(2, ffguVar);
        this.b = dbcdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbcw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            elfl a = this.b.b.a();
            this.a = 1;
            obj = fgfz.c(a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ((dbcd.a) ekhv.a(this.b.c, dbcd.a.class, (eisx) obj)).eR();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbcw dbcwVar = new dbcw(ffguVar, this.b);
        dbcwVar.c = obj;
        return dbcwVar;
    }
}
