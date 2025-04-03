package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbon extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public dbon(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dbon dbonVar = new dbon((ffgu) obj3);
        dbonVar.a = (Map) obj;
        dbonVar.b = (Map) obj2;
        return dbonVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r11 = this.a;
        ?? r0 = this.b;
        ArrayList arrayList = new ArrayList(r11.size());
        for (Map.Entry entry : r11.entrySet()) {
            String str = (String) entry.getKey();
            cfip cfipVar = (cfip) entry.getValue();
            int size = cfipVar.b.size();
            Instant ofEpochMilli = Instant.ofEpochMilli(cfipVar.a);
            ofEpochMilli.getClass();
            Integer num = (Integer) r0.get(str);
            int i = 0;
            if (num != null) {
                i = Math.max(num.intValue() - size, 0);
            }
            arrayList.add(new dbqc(str, ofEpochMilli, i, size, cfipVar.c));
        }
        return arrayList;
    }
}
