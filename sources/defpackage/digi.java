package defpackage;

import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class digi {
    public static dhzq a(digh dighVar) {
        dhzq dhzqVar = new dhzq();
        for (digr digrVar : dighVar.a.b) {
            List list = dighVar.b;
            String str = digrVar.c;
            digq digqVar = digrVar.d;
            if (digqVar == null) {
                digqVar = digq.a;
            }
            d(list, dhzqVar, str, digqVar);
        }
        return dhzqVar;
    }

    public static digh b(dhzq dhzqVar) {
        ArrayList arrayList = new ArrayList();
        digj digjVar = (digj) digs.a.createBuilder();
        TreeSet treeSet = new TreeSet(dhzqVar.f());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object d = dhzqVar.d(str);
            digk digkVar = (digk) digr.a.createBuilder();
            digkVar.copyOnWrite();
            digr digrVar = (digr) digkVar.instance;
            str.getClass();
            digrVar.b |= 1;
            digrVar.c = str;
            digq c = c(arrayList, d);
            digkVar.copyOnWrite();
            digr digrVar2 = (digr) digkVar.instance;
            c.getClass();
            digrVar2.d = c;
            digrVar2.b |= 2;
            arrayList2.add((digr) digkVar.build());
        }
        digjVar.copyOnWrite();
        digs digsVar = (digs) digjVar.instance;
        eygr eygrVar = digsVar.b;
        if (!eygrVar.c()) {
            digsVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(arrayList2, digsVar.b);
        return new digh((digs) digjVar.build(), arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0398 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.digq c(java.util.List r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.digi.c(java.util.List, java.lang.Object):digq");
    }

    private static void d(List list, dhzq dhzqVar, String str, digq digqVar) {
        int i;
        int a;
        int a2;
        int a3;
        int a4 = dign.a(digqVar.c);
        if (a4 == 0) {
            a4 = 1;
        }
        if (a4 == 14) {
            dhzqVar.n(str, null);
            return;
        }
        digp digpVar = digqVar.d;
        if (digpVar == null) {
            digpVar = digp.a;
        }
        if (a4 == 1) {
            dhzqVar.j(str, digpVar.c.I());
            return;
        }
        if (a4 == 11) {
            dhzqVar.a.put(str, (String[]) digpVar.m.toArray(new String[0]));
            return;
        }
        if (a4 == 12) {
            dhzqVar.a.put(str, ermr.g(digpVar.n));
            return;
        }
        if (a4 == 15) {
            dhzqVar.a.put(str, ermj.d(digpVar.o));
            return;
        }
        if (a4 == 2) {
            dhzqVar.n(str, digpVar.d);
            return;
        }
        if (a4 == 3) {
            dhzqVar.a.put(str, Double.valueOf(digpVar.e));
            return;
        }
        if (a4 == 4) {
            dhzqVar.a.put(str, Float.valueOf(digpVar.f));
            return;
        }
        if (a4 == 5) {
            dhzqVar.m(str, digpVar.g);
            return;
        }
        if (a4 == 6) {
            dhzqVar.l(str, digpVar.h);
            return;
        }
        if (a4 == 7) {
            dhzqVar.i(str, (byte) digpVar.i);
            return;
        }
        if (a4 == 8) {
            dhzqVar.h(str, digpVar.j);
            return;
        }
        if (a4 == 13) {
            dhzqVar.g(str, (Asset) list.get((int) digpVar.p));
            return;
        }
        if (a4 == 9) {
            dhzq dhzqVar2 = new dhzq();
            for (digr digrVar : digpVar.k) {
                try {
                    String str2 = digrVar.c;
                    digq digqVar2 = digrVar.d;
                    if (digqVar2 == null) {
                        digqVar2 = digq.a;
                    }
                    d(list, dhzqVar2, str2, digqVar2);
                } catch (RuntimeException e) {
                    throw new RuntimeException("DataBundle parse error for: ".concat(String.valueOf(str)), e);
                }
            }
            dhzqVar.a.put(str, dhzqVar2);
            return;
        }
        if (a4 != 10) {
            throw new RuntimeException("populateBundle: unexpected type ".concat(Integer.toString(a4)));
        }
        do {
            int i2 = 14;
            for (digq digqVar3 : digpVar.l) {
                if (i2 == 14) {
                    i = digqVar3.c;
                    int a5 = dign.a(i);
                    if ((a5 == 0 || a5 != 9) && (((a = dign.a(i)) == 0 || a != 2) && ((a2 = dign.a(i)) == 0 || a2 != 6))) {
                        a3 = dign.a(i);
                        if (a3 == 0) {
                            break;
                        }
                    } else {
                        i2 = dign.a(i);
                        if (i2 == 0) {
                            i2 = 1;
                        }
                    }
                } else {
                    int a6 = dign.a(digqVar3.c);
                    if (a6 == 0) {
                        a6 = 1;
                    }
                    if (a6 != i2) {
                        String num = Integer.toString(i2);
                        int a7 = dign.a(digqVar3.c);
                        throw new IllegalArgumentException("The ArrayList elements should all be the same type, but ArrayList with key " + str + " contains items of type " + num + " and " + Integer.toString(a7 != 0 ? a7 : 1));
                    }
                }
            }
            ArrayList arrayList = new ArrayList(digpVar.l.size());
            for (digq digqVar4 : digpVar.l) {
                int a8 = dign.a(digqVar4.c);
                if (a8 != 0 && a8 == 14) {
                    arrayList.add(null);
                } else if (i2 == 9) {
                    dhzq dhzqVar3 = new dhzq();
                    digp digpVar2 = digqVar4.d;
                    if (digpVar2 == null) {
                        digpVar2 = digp.a;
                    }
                    for (digr digrVar2 : digpVar2.k) {
                        String str3 = digrVar2.c;
                        digq digqVar5 = digrVar2.d;
                        if (digqVar5 == null) {
                            digqVar5 = digq.a;
                        }
                        d(list, dhzqVar3, str3, digqVar5);
                    }
                    arrayList.add(dhzqVar3);
                } else if (i2 == 2) {
                    digp digpVar3 = digqVar4.d;
                    if (digpVar3 == null) {
                        digpVar3 = digp.a;
                    }
                    arrayList.add(digpVar3.d);
                } else {
                    if (i2 != 6) {
                        throw new IllegalArgumentException("Unexpected typeOfArrayList: ".concat(Integer.toString(i2)));
                    }
                    digp digpVar4 = digqVar4.d;
                    if (digpVar4 == null) {
                        digpVar4 = digp.a;
                    }
                    arrayList.add(Integer.valueOf(digpVar4.h));
                }
            }
            if (i2 == 14) {
                dhzqVar.o(str, arrayList);
                return;
            }
            if (i2 == 9) {
                dhzqVar.k(str, arrayList);
                return;
            } else if (i2 == 2) {
                dhzqVar.o(str, arrayList);
                return;
            } else {
                if (i2 != 6) {
                    throw new IllegalStateException("Unexpected typeOfArrayList: ".concat(Integer.toString(i2)));
                }
                dhzqVar.a.put(str, arrayList);
                return;
            }
        } while (a3 == 14);
        int a9 = dign.a(i);
        throw new IllegalArgumentException(a.m(str, Integer.toString(a9 != 0 ? a9 : 1), "Unexpected TypedValue type: ", " for key "));
    }
}
