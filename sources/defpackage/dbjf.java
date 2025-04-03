package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbjf extends okl {
    private final Map a;

    public dbjf(Map map) {
        this.a = map;
    }

    @Override // defpackage.okl
    public final /* bridge */ /* synthetic */ Object b(okm okmVar) {
        throw new ffce("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.okl
    public final Object c(oke okeVar, ffgu ffguVar) {
        Integer num = (Integer) okeVar.a();
        int intValue = num != null ? num.intValue() : 1;
        int min = Math.min((okeVar.b + intValue) - 1, 100);
        ffmj ffmjVar = new ffmj(intValue, min);
        ArrayList arrayList = new ArrayList(ffdx.n(ffmjVar, 10));
        ffev it = ffmjVar.iterator();
        while (((ffmi) it).a) {
            int a = it.a();
            dbjd dbjdVar = (dbjd) this.a.get(new Integer(a));
            if (dbjdVar == null) {
                dbjdVar = new dbjd(a, a.h(a, "Place Holder "), "run", new ffix() { // from class: dbje
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return ffcu.a;
                    }
                });
            }
            arrayList.add(dbjdVar);
        }
        return new oki(arrayList, intValue == 1 ? null : new Integer(Math.max(intValue - okeVar.b, 1)), min != 100 ? new Integer(min + 1) : null);
    }
}
