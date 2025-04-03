package defpackage;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class finy implements fiql, fios {
    public fiow a;
    private final BitSet b;
    private final Map c;
    private final Map d;
    private boolean e;
    private int f;
    private finj g;
    private fini h;
    private final finw i;

    public finy(finw finwVar) {
        List list = finwVar.a;
        HashMap hashMap = new HashMap();
        e(Arrays.asList(new fiok(), new fiox()), hashMap);
        e(list, hashMap);
        this.c = hashMap;
        this.i = finwVar;
        HashMap hashMap2 = new HashMap();
        this.d = hashMap2;
        hashMap2.put('\\', Collections.singletonList(new fiom()));
        hashMap2.put('`', Collections.singletonList(new fion()));
        hashMap2.put('&', Collections.singletonList(new fiop()));
        hashMap2.put('<', Arrays.asList(new fiol(), new fioq()));
        Set keySet = hashMap.keySet();
        Set keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        Iterator it2 = keySet2.iterator();
        while (it2.hasNext()) {
            bitSet.set(((Character) it2.next()).charValue());
        }
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(33);
        bitSet.set(10);
        this.b = bitSet;
    }

    private final fipy b() {
        char a;
        fiov e = this.a.e();
        this.a.h();
        while (true) {
            a = this.a.a();
            if (a == 0 || this.b.get(a)) {
                break;
            }
            this.a.h();
        }
        fiow fiowVar = this.a;
        fiqs g = fiowVar.g(e, fiowVar.e());
        String a2 = g.a();
        int i = -1;
        if (a == '\n') {
            int length = a2.length() - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (a2.charAt(length) != ' ') {
                    i = length;
                    break;
                }
                length--;
            }
            int i2 = i + 1;
            this.f = a2.length() - i2;
            a2 = a2.substring(0, i2);
        } else if (a == 0) {
            a2 = a2.substring(0, fipd.e(a2, a2.length() - 1, 0) + 1);
        }
        fiqi fiqiVar = new fiqi(a2);
        fiqiVar.i(g.b());
        return fiqiVar;
    }

    private final void c(fini finiVar) {
        fini finiVar2 = this.h;
        if (finiVar2 != null) {
            finiVar2.h = true;
        }
        this.h = finiVar;
    }

    private static void d(char c, fira firaVar, Map map) {
        if (((fira) map.put(Character.valueOf(c), firaVar)) != null) {
            throw new IllegalArgumentException(a.H(c, "Delimiter processor conflict with delimiter char '", "'"));
        }
    }

    private static void e(Iterable iterable, Map map) {
        fioh fiohVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            fira firaVar = (fira) it.next();
            char b = firaVar.b();
            char a = firaVar.a();
            if (b == a) {
                Character valueOf = Character.valueOf(b);
                fira firaVar2 = (fira) map.get(valueOf);
                if (firaVar2 == null || firaVar2.b() != firaVar2.a()) {
                    d(b, firaVar, map);
                } else {
                    if (firaVar2 instanceof fioh) {
                        fiohVar = (fioh) firaVar2;
                    } else {
                        fioh fiohVar2 = new fioh(b);
                        fiohVar2.e(firaVar2);
                        fiohVar = fiohVar2;
                    }
                    fiohVar.e(firaVar);
                    map.put(valueOf, fiohVar);
                }
            } else {
                d(b, firaVar, map);
                d(a, firaVar, map);
            }
        }
    }

    private final void f(fipy fipyVar) {
        fipy fipyVar2 = fipyVar.f;
        if (fipyVar2 != null) {
            fipy fipyVar3 = fipyVar.g;
            int i = 0;
            fiqi fiqiVar = null;
            fiqi fiqiVar2 = null;
            while (fipyVar2 != null) {
                if (fipyVar2 instanceof fiqi) {
                    fiqiVar2 = fipyVar2;
                    if (fiqiVar == null) {
                        fiqiVar = fiqiVar2;
                    }
                    i += fiqiVar2.a.length();
                } else {
                    g(fiqiVar, fiqiVar2, i);
                    f(fipyVar2);
                    i = 0;
                    fiqiVar = null;
                    fiqiVar2 = null;
                }
                if (fipyVar2 == fipyVar3) {
                    break;
                } else {
                    fipyVar2 = fipyVar2.i;
                }
            }
            g(fiqiVar, fiqiVar2, i);
        }
    }

    private final void g(fiqi fiqiVar, fiqi fiqiVar2, int i) {
        fiqg fiqgVar;
        if (fiqiVar == null || fiqiVar2 == null || fiqiVar == fiqiVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(fiqiVar.a);
        if (this.e) {
            fiqgVar = new fiqg();
            fiqgVar.b(fiqiVar.e());
        } else {
            fiqgVar = null;
        }
        fipy fipyVar = fiqiVar.i;
        fipy fipyVar2 = fiqiVar2.i;
        while (fipyVar != fipyVar2) {
            sb.append(((fiqi) fipyVar).a);
            if (fiqgVar != null) {
                fiqgVar.b(fipyVar.e());
            }
            fipy fipyVar3 = fipyVar.i;
            fipyVar.j();
            fipyVar = fipyVar3;
        }
        fiqiVar.a = sb.toString();
        if (fiqgVar != null) {
            fiqiVar.i(fiqgVar.a());
        }
    }

    private final void h(finj finjVar) {
        boolean z;
        HashMap hashMap = new HashMap();
        finj finjVar2 = this.g;
        while (finjVar2 != null) {
            finj finjVar3 = finjVar2.f;
            if (finjVar3 == finjVar) {
                break;
            } else {
                finjVar2 = finjVar3;
            }
        }
        while (finjVar2 != null) {
            Map map = this.c;
            char c = finjVar2.b;
            fira firaVar = (fira) map.get(Character.valueOf(c));
            if (!finjVar2.e || firaVar == null) {
                finjVar2 = finjVar2.g;
            } else {
                char b = firaVar.b();
                finj finjVar4 = finjVar2.f;
                boolean z2 = false;
                int i = 0;
                while (finjVar4 != null && finjVar4 != finjVar && finjVar4 != hashMap.get(Character.valueOf(c))) {
                    if (finjVar4.d && finjVar4.b == b) {
                        i = firaVar.d(finjVar4, finjVar2);
                        z2 = true;
                        if (i > 0) {
                            z = true;
                            break;
                        }
                    }
                    finjVar4 = finjVar4.f;
                }
                z = z2;
                z2 = false;
                if (z2) {
                    for (int i2 = 0; i2 < i; i2++) {
                        ((fiqi) finjVar4.a.remove(r3.size() - 1)).j();
                    }
                    for (int i3 = 0; i3 < i; i3++) {
                        ((fiqi) finjVar2.a.remove(0)).j();
                    }
                    finj finjVar5 = finjVar2.f;
                    while (finjVar5 != null && finjVar5 != finjVar4) {
                        finj finjVar6 = finjVar5.f;
                        i(finjVar5);
                        finjVar5 = finjVar6;
                    }
                    if (finjVar4.a() == 0) {
                        i(finjVar4);
                    }
                    if (finjVar2.a() == 0) {
                        finj finjVar7 = finjVar2.g;
                        i(finjVar2);
                        finjVar2 = finjVar7;
                    }
                } else {
                    if (!z) {
                        hashMap.put(Character.valueOf(c), finjVar2.f);
                        if (!finjVar2.d) {
                            i(finjVar2);
                        }
                    }
                    finjVar2 = finjVar2.g;
                }
            }
        }
        while (true) {
            finj finjVar8 = this.g;
            if (finjVar8 == null || finjVar8 == finjVar) {
                return;
            } else {
                i(finjVar8);
            }
        }
    }

    private final void i(finj finjVar) {
        finj finjVar2 = finjVar.f;
        if (finjVar2 != null) {
            finjVar2.g = finjVar.g;
        }
        finj finjVar3 = finjVar.g;
        if (finjVar3 == null) {
            this.g = finjVar2;
        } else {
            finjVar3.f = finjVar2;
        }
    }

    private final void j() {
        this.h = this.h.e;
    }

    private static final fiqi k(fiqs fiqsVar) {
        fiqi fiqiVar = new fiqi(fiqsVar.a());
        fiqiVar.i(fiqsVar.b());
        return fiqiVar;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ce, code lost:
    
        if (r11 != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e2, code lost:
    
        if (r8 == r6.a()) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0338, code lost:
    
        if (r6.length() > 999) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0207, code lost:
    
        if (r5 == 0) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c8  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v57, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v35, types: [finx] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v46 */
    @Override // defpackage.fiql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.fiqs r17, defpackage.fipy r18) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.finy.a(fiqs, fipy):void");
    }
}
