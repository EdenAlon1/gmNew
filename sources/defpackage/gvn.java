package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvn implements ipn {
    public final dxq a;
    public final hun b;
    private final hbe c;
    private final float d;

    public gvn(hbe hbeVar, dxq dxqVar, hun hunVar, float f) {
        this.c = hbeVar;
        this.a = dxqVar;
        this.b = hunVar;
        this.d = f;
    }

    @Override // defpackage.ipn
    public final int a(iny inyVar, List list, int i) {
        Integer num;
        int eo = inyVar.eo(this.d);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer valueOf = Integer.valueOf(((inx) list.get(0)).a(i));
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
            num = valueOf;
        }
        return Math.max(eo, num != null ? num.intValue() : 0);
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
        Integer num;
        int eo = inyVar.eo(this.d);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer valueOf = Integer.valueOf(((inx) list.get(0)).c(i));
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
            num = valueOf;
        }
        return Math.max(eo, num != null ? num.intValue() : 0);
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
        ipo ei;
        gvn gvnVar = this;
        int size = list.size();
        int i = 0;
        while (i < size) {
            ipl iplVar = (ipl) list.get(i);
            if (ffkj.e(ioe.b(iplVar), "navigationIcon")) {
                iqk e = iplVar.e(jzk.m(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    ipl iplVar2 = (ipl) list.get(i2);
                    if (ffkj.e(ioe.b(iplVar2), "actionIcons")) {
                        iqk e2 = iplVar2.e(jzk.m(j, 0, 0, 0, 0, 14));
                        int b = jzk.b(j) == Integer.MAX_VALUE ? jzk.b(j) : ffmk.f((jzk.b(j) - e.a) - e2.a, 0);
                        int size3 = list.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            ipl iplVar3 = (ipl) list.get(i3);
                            if (ffkj.e(ioe.b(iplVar3), ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE)) {
                                iqk e3 = iplVar3.e(jzk.m(j, 0, b, 0, 0, 12));
                                if (e3.eh(imt.b) != Integer.MIN_VALUE) {
                                    e3.eh(imt.b);
                                }
                                float a = gvnVar.c.a();
                                int b2 = Float.isNaN(a) ? 0 : ffln.b(a);
                                int max = Math.max(ipqVar.eo(gvnVar.d), e3.b);
                                if (jzk.a(j) != Integer.MAX_VALUE) {
                                    max = ffmk.f(max + b2, 0);
                                }
                                int i4 = max;
                                ei = ipqVar.ei(jzk.b(j), i4, ffem.a, new gvm(e, i4, e3, e2, j, ipqVar, gvnVar));
                                return ei;
                            }
                            i3++;
                            gvnVar = this;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    i2++;
                    gvnVar = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i++;
            gvnVar = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
