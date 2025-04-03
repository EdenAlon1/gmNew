package defpackage;

import j$.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zli extends ffkh implements ffjm {
    public zli(Object obj) {
        super(2, obj, zkt.class, "generate", "generate(ILcom/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiDataWrapper;)Ljava/lang/String;", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        zqz zqzVar = (zqz) obj2;
        zkt zktVar = (zkt) this.g;
        if (zqzVar == null) {
            return a.B(intValue, "-no_id");
        }
        String a = zkt.a(zqzVar.a());
        Iterable iterable = (Iterable) Map.EL.getOrDefault(zktVar.a, a, ffel.a);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : iterable) {
            if (((Number) obj3).intValue() != intValue) {
                arrayList.add(obj3);
            }
        }
        while (!arrayList.isEmpty()) {
            a = a.concat("~");
            Iterable iterable2 = (Iterable) Map.EL.getOrDefault(zktVar.a, a, ffel.a);
            arrayList = new ArrayList();
            for (Object obj4 : iterable2) {
                if (((Number) obj4).intValue() != intValue) {
                    arrayList.add(obj4);
                }
            }
        }
        HashMap hashMap = zktVar.a;
        HashMap hashMap2 = zktVar.b;
        Integer valueOf = Integer.valueOf(intValue);
        Object obj5 = hashMap2.get(valueOf);
        fflf.g(hashMap);
        hashMap.remove(obj5);
        HashMap hashMap3 = zktVar.a;
        List am = ffdx.am(arrayList);
        am.add(valueOf);
        hashMap3.put(a, am);
        zktVar.b.put(valueOf, a);
        return a;
    }
}
