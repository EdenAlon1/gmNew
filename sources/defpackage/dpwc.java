package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpwc extends ffhv implements ffjo {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ dpwf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpwc(dpwf dpwfVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.e = dpwfVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        dpwc dpwcVar = new dpwc(this.e, (ffgu) obj4);
        dpwcVar.b = (dpvw) obj;
        dpwcVar.c = (Set) obj2;
        dpwcVar.d = booleanValue;
        return dpwcVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        boolean z;
        ?? r1;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            z = this.d;
            Object obj3 = this.c;
            obj2 = this.b;
            ffci.b(obj);
            r1 = obj3;
        } else {
            ffci.b(obj);
            obj2 = this.b;
            Object obj4 = this.c;
            boolean z2 = this.d;
            dpwf dpwfVar = this.e;
            this.a = 1;
            Object invoke = dpwfVar.m.invoke(this);
            if (invoke == ffhhVar) {
                return ffhhVar;
            }
            z = z2;
            obj = invoke;
            r1 = obj4;
        }
        Iterable<dpvw> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
        for (dpvw dpvwVar : iterable) {
            arrayList.add(new dpvw(dpvwVar.a, dpvwVar.b, dpvwVar.c, dpvwVar.a((dpvw) obj2), r1.contains(dpvwVar.a)));
        }
        return new dpwi(arrayList, z);
    }
}
