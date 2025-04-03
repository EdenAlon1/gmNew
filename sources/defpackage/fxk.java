package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxk implements ipn {
    @Override // defpackage.ipn
    public final int a(iny inyVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((inx) list.get(0)).a(i));
            int e = ffdx.e(list);
            if (e > 0) {
                int i2 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((inx) list.get(i2)).a(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == e) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ipn
    public final int b(iny inyVar, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((inx) list.get(i3)).b(i);
        }
        return i2;
    }

    @Override // defpackage.ipn
    public final int c(iny inyVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((inx) list.get(0)).c(i));
            int e = ffdx.e(list);
            if (e > 0) {
                int i2 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((inx) list.get(i2)).c(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == e) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ipn
    public final int d(iny inyVar, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((inx) list.get(i3)).d(i);
        }
        return i2;
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        Object obj;
        Object obj2;
        ipo ei;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (ffkj.e(ioe.b((ipl) obj), "leadingIcon")) {
                break;
            }
            i++;
        }
        ipl iplVar = (ipl) obj;
        iqk e = iplVar != null ? iplVar.e(jzk.m(j, 0, 0, 0, 0, 10)) : null;
        int b = hbm.b(e);
        int a = hbm.a(e);
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i2);
            if (ffkj.e(ioe.b((ipl) obj2), "trailingIcon")) {
                break;
            }
            i2++;
        }
        ipl iplVar2 = (ipl) obj2;
        iqk e2 = iplVar2 != null ? iplVar2.e(jzk.m(j, 0, 0, 0, 0, 10)) : null;
        int b2 = hbm.b(e2);
        int a2 = hbm.a(e2);
        int size3 = list.size();
        int i3 = 0;
        while (i3 < size3) {
            ipl iplVar3 = (ipl) list.get(i3);
            if (ffkj.e(ioe.b(iplVar3), ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)) {
                iqk e3 = iplVar3.e(jzl.l(j, -(b + b2), 0, 2));
                int i4 = e3.a + b + b2;
                int max = Math.max(a, Math.max(e3.b, a2));
                ei = ipqVar.ei(i4, max, ffem.a, new fxj(e, a, max, e3, b, e2, a2));
                return ei;
            }
            i3++;
            b = b;
            a = a;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
