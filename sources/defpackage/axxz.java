package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axxz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ axyy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axxz(ffgu ffguVar, List list, axyy axyyVar) {
        super(2, ffguVar);
        this.b = list;
        this.c = axyyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axxz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable closeable;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            closeable = (Closeable) this.d;
            try {
                ffci.b(obj);
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(closeable, th);
                    throw th2;
                }
            }
        } else {
            ffci.b(obj);
            ffsk ffskVar = (ffsk) this.d;
            ekzz f = eleg.f("Cp2DataService#queryContacts");
            try {
                List list = this.b;
                Object e = axum.i.e();
                e.getClass();
                List<List> W = ffdx.W(list, ((Number) e).intValue());
                ArrayList arrayList = new ArrayList(ffdx.n(W, 10));
                for (List list2 : W) {
                    ekrb u = this.c.u(list2, axwz.a);
                    ffhe ffheVar = ffhe.a;
                    arrayList.add(ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new axyc(null, this.c, u, list2)));
                }
                this.d = f;
                this.a = 1;
                obj = ffqv.a(arrayList, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
                closeable = f;
            } catch (Throwable th3) {
                th = th3;
                closeable = f;
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            ffdx.w(arrayList2, ffdx.ak((List) it.next()));
        }
        ffig.a(closeable, null);
        return arrayList2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axxz axxzVar = new axxz(ffguVar, this.b, this.c);
        axxzVar.d = obj;
        return axxzVar;
    }
}
