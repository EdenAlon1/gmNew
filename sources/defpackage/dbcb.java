package defpackage;

import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbcb extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dbcc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbcb(dbcc dbccVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dbccVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbcb) c((dtyq) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl w = ((dtyq) this.b).w();
            w.getClass();
            this.a = 1;
            obj = fgfz.c(w, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        dbcc dbccVar = this.c;
        Iterable<dtro> iterable = (Iterable) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(iterable, 10)), 16));
        for (dtro dtroVar : iterable) {
            dbbz a = dbccVar.a.a();
            dtroVar.getClass();
            Object b = a.b(dtroVar);
            String ay = dtroVar.ay("count");
            ay.getClass();
            ffcf ffcfVar = new ffcf(b, new Integer(Integer.parseInt(ay)));
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        return linkedHashMap;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbcb dbcbVar = new dbcb(this.c, ffguVar);
        dbcbVar.b = obj;
        return dbcbVar;
    }
}
