package defpackage;

import j$.util.Comparator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgsb implements cgrz {
    public static final ffbz a = ffca.a(new ffix() { // from class: cgsa
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = cgsb.a;
            fiqn fiqnVar = new fiqn();
            for (fimq fimqVar : fffi.d(new fims(), new fina())) {
                if (fimqVar instanceof fiqo) {
                    ((fiqo) fimqVar).a(fiqnVar);
                }
            }
            return new fiqp(fiqnVar);
        }
    });
    private static final ffpa b = new ffpa("((]\\()|[*#_~`])");
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/message/markdown/MarkdownParserImpl");
    private final ayzr d;

    public cgsb(ayzr ayzrVar) {
        ayzrVar.getClass();
        this.d = ayzrVar;
    }

    @Override // defpackage.cgrz
    public final cgsc a(String str) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        ayzr ayzrVar = this.d;
        ayzrVar.e.put(randomUUID, ayzrVar.c.e(ayzr.b));
        fiqp fiqpVar = (fiqp) a.a();
        List list = fiqpVar.a;
        fiqm fiqmVar = fiqpVar.e;
        List list2 = fiqpVar.b;
        int i = fiqpVar.d;
        finn finnVar = new finn(list, list2);
        int i2 = 0;
        while (true) {
            int length = str.length();
            int i3 = i2;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                char charAt = str.charAt(i3);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                break;
            }
            finnVar.c(str.substring(i2, i3));
            i2 = i3 + 1;
            if (i2 < str.length() && str.charAt(i3) == '\r' && str.charAt(i2) == '\n') {
                i2 = i3 + 2;
            }
        }
        if (str.length() > 0 && (i2 == 0 || i2 < str.length())) {
            finnVar.c(str.substring(i2));
        }
        finnVar.b(finnVar.l.size());
        finy finyVar = new finy(new finw(finnVar.i, finnVar.k));
        Iterator it = finnVar.m.iterator();
        while (it.hasNext()) {
            ((fiqw) it.next()).e(finyVar);
        }
        fink finkVar = finnVar.j;
        Iterator it2 = fiqpVar.c.iterator();
        fipy fipyVar = finkVar.a;
        while (it2.hasNext()) {
            fipyVar = ((fiqq) it2.next()).a();
        }
        cgsm cgsmVar = new cgsm();
        try {
            fipyVar.d(cgsmVar);
            List list3 = cgsmVar.a;
            cgsl cgslVar = new cgsl();
            final ffjm ffjmVar = new ffjm() { // from class: cgsd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    dlus dlusVar;
                    dlus dlusVar2;
                    dltq dltqVar = (dltq) obj;
                    boolean z = dltqVar instanceof dlto;
                    dltq dltqVar2 = (dltq) obj2;
                    int i4 = 0;
                    if (z && ((dlto) dltqVar).a == dlus.q) {
                        if ((dltqVar2 instanceof dltn) || ((dltqVar2 instanceof dlto) && ((dlusVar2 = ((dlto) dltqVar2).a) == dlus.p || dlusVar2 == dlus.n || dlusVar2 == dlus.o))) {
                            i4 = 1;
                        }
                    } else if ((dltqVar2 instanceof dlto) && ((dlto) dltqVar2).a == dlus.q && ((dltqVar instanceof dltn) || (z && ((dlusVar = ((dlto) dltqVar).a) == dlus.p || dlusVar == dlus.n || dlusVar == dlus.o)))) {
                        i4 = -1;
                    }
                    return Integer.valueOf(i4);
                }
            };
            Comparator thenComparing = Comparator.EL.thenComparing(cgslVar, new java.util.Comparator() { // from class: cgse
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) ffjm.this.a(obj, obj2)).intValue();
                }
            });
            final ffjm ffjmVar2 = new ffjm() { // from class: cgsf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    dltq dltqVar = (dltq) obj;
                    dltq dltqVar2 = (dltq) obj2;
                    return Integer.valueOf(dltqVar.a() <= dltqVar2.b() ? -1 : dltqVar2.a() <= dltqVar.b() ? 1 : ffkj.a(dltqVar2.a(), dltqVar.a()));
                }
            };
            java.util.Comparator thenComparing2 = Comparator.EL.thenComparing(thenComparing, new java.util.Comparator() { // from class: cgsg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) ffjm.this.a(obj, obj2)).intValue();
                }
            });
            thenComparing2.getClass();
            StringBuilder sb = cgsmVar.b;
            List ah = ffdx.ah(list3, thenComparing2);
            String sb2 = sb.toString();
            if (ah.size() == 1 && cgsn.d(ah)) {
                return new cgsc(str, ffel.a);
            }
            ayzr ayzrVar2 = this.d;
            ayzrVar2.c.f((ecri) ayzrVar2.e.remove(randomUUID), ayzr.b, null, ecrh.SUCCESS);
            return new cgsc(sb2, ah);
        } catch (Exception e) {
            ((enrr) ((enrr) c.j()).g(e).h("com/google/android/apps/messaging/shared/message/markdown/MarkdownParserImpl", "parse", 59, "MarkdownParserImpl.kt")).q("MarkdownParser: Failed to parse markdown, falling back to plaintext.");
            return new cgsc(str, ffel.a);
        }
    }

    @Override // defpackage.cgrz
    public final boolean b(String str) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        ayzr ayzrVar = this.d;
        ayzrVar.d.put(randomUUID, ayzrVar.c.e(ayzr.a));
        boolean c2 = b.c(str);
        ayzr ayzrVar2 = this.d;
        ayzrVar2.c.f((ecri) ayzrVar2.d.remove(randomUUID), ayzr.a, null, ecrh.SUCCESS);
        return c2;
    }
}
