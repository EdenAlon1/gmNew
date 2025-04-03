package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsmh extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dsml c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsmh(dsml dsmlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dsmlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsmh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            dsml dsmlVar = this.c;
            this.a = dsmlVar;
            this.b = 1;
            dsol dsolVar = (dsol) dsmlVar.c;
            Object d = dsolVar.d.d("KeyboardDataPersistenceProtoDataStore#savedKeyboardData", new dsok(dsolVar, null), this);
            if (d == ffhhVar) {
                return ffhhVar;
            }
            obj2 = dsmlVar;
            obj = d;
        }
        dson dsonVar = (dson) obj;
        dsonVar.getClass();
        if (true == ffkj.e(dsonVar, dson.a)) {
            dsonVar = null;
        }
        if (dsonVar != null) {
            dsml dsmlVar2 = (dsml) obj2;
            dsmlVar2.i = dsonVar.c;
            dsmlVar2.j = dsonVar.d;
        }
        dsml dsmlVar3 = (dsml) obj2;
        if (!dsmlVar3.h) {
            Integer valueOf = Integer.valueOf(dskj.f(dsmlVar3.b) ? dsmlVar3.i : dsmlVar3.j);
            Integer num = valueOf.intValue() >= 0 ? valueOf : null;
            if (num != null) {
                dsmlVar3.p(num.intValue());
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsmh(this.c, ffguVar);
    }
}
