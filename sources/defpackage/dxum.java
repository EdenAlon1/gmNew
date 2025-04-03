package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxum implements efgk {
    private static String b(String str, String str2) {
        return str + "|" + str2;
    }

    @Override // defpackage.efgk
    public final /* bridge */ /* synthetic */ eyhs a(efgl efglVar, eyhs eyhsVar) {
        dwtr dwtrVar = (dwtr) eyhsVar;
        if (dwtrVar.e) {
            return dwtrVar;
        }
        HashSet hashSet = new HashSet();
        dwtp dwtpVar = (dwtp) dwtrVar.toBuilder();
        dwtpVar.copyOnWrite();
        dwtr dwtrVar2 = (dwtr) dwtpVar.instance;
        dwtrVar2.b |= 2;
        int i = 1;
        dwtrVar2.e = true;
        enqu listIterator = efglVar.b().entrySet().listIterator();
        while (listIterator.hasNext()) {
            List i2 = emye.d("|").i((CharSequence) ((Map.Entry) listIterator.next()).getKey());
            if (i2.size() >= 4) {
                String str = (String) i2.get(0);
                String str2 = (String) i2.get(i);
                int parseInt = Integer.parseInt((String) i2.get(2));
                String str3 = str + "|" + str2 + "|" + parseInt;
                if (!hashSet.contains(str3)) {
                    hashSet.add(str3);
                    String b = b(str3, "w");
                    String b2 = b(str3, "c");
                    long a = efglVar.a(b, 0L);
                    long a2 = efglVar.a(b2, 0L);
                    dwtd dwtdVar = (dwtd) dwte.a.createBuilder();
                    dwtl dwtlVar = (dwtl) dwtm.a.createBuilder();
                    dwtlVar.copyOnWrite();
                    dwtm dwtmVar = (dwtm) dwtlVar.instance;
                    str2.getClass();
                    int i3 = i;
                    dwtmVar.b |= 1;
                    dwtmVar.c = str2;
                    dwtlVar.copyOnWrite();
                    dwtm dwtmVar2 = (dwtm) dwtlVar.instance;
                    str.getClass();
                    dwtmVar2.b |= 2;
                    dwtmVar2.d = str;
                    dwtdVar.copyOnWrite();
                    dwte dwteVar = (dwte) dwtdVar.instance;
                    dwtm dwtmVar3 = (dwtm) dwtlVar.build();
                    dwtmVar3.getClass();
                    dwteVar.c = dwtmVar3;
                    dwteVar.b |= 1;
                    dwtdVar.copyOnWrite();
                    dwte dwteVar2 = (dwte) dwtdVar.instance;
                    dwteVar2.b |= 8;
                    dwteVar2.f = parseInt;
                    dwtdVar.copyOnWrite();
                    dwte dwteVar3 = (dwte) dwtdVar.instance;
                    dwteVar3.b |= 16;
                    dwteVar3.g = a2;
                    dwtdVar.copyOnWrite();
                    dwte dwteVar4 = (dwte) dwtdVar.instance;
                    dwteVar4.b |= 32;
                    dwteVar4.h = a;
                    dwtpVar.copyOnWrite();
                    dwtr dwtrVar3 = (dwtr) dwtpVar.instance;
                    dwte dwteVar5 = (dwte) dwtdVar.build();
                    dwteVar5.getClass();
                    dwtrVar3.a();
                    dwtrVar3.d.add(dwteVar5);
                    i = i3;
                }
            }
        }
        return (dwtr) dwtpVar.build();
    }
}
