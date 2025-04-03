package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drbz extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public drbz(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        drbz drbzVar = new drbz((ffgu) obj3);
        drbzVar.a = (drbm) obj;
        drbzVar.b = (Map) obj2;
        return drbzVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        ?? r0 = this.b;
        int ordinal = ((drbm) obj2).ordinal();
        if (ordinal == 0) {
            return r0;
        }
        if (ordinal == 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : r0.entrySet()) {
                if (((dqzc) entry.getValue()).d) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
        if (ordinal != 2) {
            throw new ffcd();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : r0.entrySet()) {
            if (!((dqzc) entry2.getValue()).d) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }
}
