package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eyda {
    private static final emww b = new emww("-");
    public final eydc a;

    public eyda() {
        this.a = new eydc();
    }

    public final String a() {
        boolean z;
        String j;
        int i;
        eydc eydcVar = this.a;
        String str = eydcVar.a;
        Map map = eydcVar.b;
        Map map2 = eydcVar.c;
        if (map2.size() == 0) {
            return str.isEmpty() ? "" : "".concat(String.valueOf(str));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        Iterator it2 = map2.entrySet().iterator();
        Map.Entry entry = it.hasNext() ? (Map.Entry) it.next() : null;
        Map.Entry entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (entry == null && entry2 == null) {
                if (z2) {
                    arrayList.add(str.substring(i2, i3));
                }
                return arrayList.isEmpty() ? "" : "".concat(b.b(arrayList));
            }
            if (entry2 == null) {
                z = true;
            } else if (entry == null) {
                z = false;
            } else {
                int compareTo = ((eycx) entry.getKey()).compareTo((eycx) entry2.getKey());
                z = compareTo < 0;
                if (compareTo == 0) {
                    entry = null;
                }
            }
            if (z) {
                eycy eycyVar = (eycy) entry.getValue();
                if (z2) {
                    int i4 = eycyVar.b;
                    if (i4 == i3 + 1) {
                        i3 = i4 + eycyVar.d;
                        entry = null;
                        z2 = true;
                    } else {
                        arrayList.add(str.substring(i2, i3));
                        i2 = eycyVar.b;
                        i = eycyVar.d;
                    }
                } else {
                    i2 = eycyVar.b;
                    i = eycyVar.d;
                }
                i3 = i + i2;
                entry = null;
                z2 = true;
            } else {
                eycx eycxVar = (eycx) entry2.getKey();
                eydd eyddVar = (eydd) entry2.getValue();
                if (z2) {
                    arrayList.add(str.substring(i2, i3));
                }
                if (eyddVar.a != null) {
                    boolean z3 = eyddVar.b;
                    String str2 = eycxVar.be;
                    switch (eycxVar.bf) {
                        case FIXED_LENGTH_BASE_64:
                            j = eoeg.f.g().j(ermr.f(((Long) ((eydd) entry2.getValue()).a).longValue()));
                            break;
                        case BOOLEAN:
                            j = "";
                            break;
                        case STRING:
                            j = ((String) ((eydd) entry2.getValue()).a).replace(';', ':');
                            break;
                        case INTEGER:
                            j = ((Integer) ((eydd) entry2.getValue()).a).toString();
                            break;
                        case LONG:
                            j = ((Long) ((eydd) entry2.getValue()).a).toString();
                            break;
                        case FLOAT:
                            j = ((Float) ((eydd) entry2.getValue()).a).toString();
                            break;
                        case PREFIX_HEX:
                            Integer num = (Integer) ((eydd) entry2.getValue()).a;
                            num.intValue();
                            j = "0x".concat(String.valueOf(String.format("%08x", num)));
                            break;
                        case FIFE_SAFE_BASE_64:
                            j = eoeg.f.g().j(((String) ((eydd) entry2.getValue()).a).getBytes(StandardCharsets.ISO_8859_1)).replace('-', '~');
                            break;
                        default:
                            throw new IllegalStateException("OptionType " + String.valueOf(eycxVar.bf) + " not handled.");
                    }
                    arrayList.add(String.valueOf(str2).concat(String.valueOf(j)));
                }
                entry2 = null;
                z2 = false;
            }
            if (entry == null && it.hasNext()) {
                entry = (Map.Entry) it.next();
            }
            if (entry2 == null && it2.hasNext()) {
                entry2 = (Map.Entry) it2.next();
            }
        }
    }

    public eyda(eydf eydfVar) {
        this.a = new eydc(eydfVar);
    }
}
