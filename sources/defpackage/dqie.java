package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqie {
    public static /* synthetic */ List a(List list, List list2, ffjm ffjmVar, ffjm ffjmVar2, int i) {
        ffjm ffjmVar3 = (i & 4) != 0 ? new ffjm() { // from class: dqhz
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                return Boolean.valueOf(ffkj.e(obj, obj2));
            }
        } : null;
        if ((i & 8) != 0) {
            ffjmVar = new ffjm() { // from class: dqia
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    return Boolean.valueOf(ffkj.e(obj, obj2));
                }
            };
        }
        ffjm ffjmVar4 = ffjmVar;
        if ((i & 16) != 0) {
            ffjmVar2 = dqib.a;
        }
        ffjm ffjmVar5 = ffjmVar2;
        list.getClass();
        ffjmVar3.getClass();
        ffjmVar4.getClass();
        ffjmVar5.getClass();
        mq a = mv.a(new dqid(list, list2, ffjmVar3, ffjmVar4, ffjmVar5));
        ArrayList arrayList = new ArrayList();
        a.b(new dqic(arrayList));
        return arrayList;
    }

    public static final void b(List list, int i, vk vkVar) {
        dqhx dqhxVar;
        int i2;
        list.getClass();
        vkVar.getClass();
        if (list.size() < 5) {
            Iterator it = list.iterator();
            int i3 = i;
            while (it.hasNext()) {
                dqhy dqhyVar = (dqhy) it.next();
                if ((dqhyVar instanceof dqhx) && (i2 = (dqhxVar = (dqhx) dqhyVar).a) < i) {
                    i3 -= ffmk.g(dqhxVar.b + i2, i) - i2;
                }
            }
            if (i3 > 0) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((dqhy) it2.next()).a(vkVar);
                }
                return;
            }
        }
        vkVar.p();
    }
}
