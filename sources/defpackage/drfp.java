package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class drfp extends ffkh implements ffjm {
    public drfp(Object obj) {
        super(2, obj, drgb.class, "onNewResults", "onNewResults(Ljava/lang/CharSequence;Ljava/lang/Iterable;)V", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        drgf drgfVar;
        CharSequence charSequence = (CharSequence) obj;
        Iterable iterable = (Iterable) obj2;
        charSequence.getClass();
        iterable.getClass();
        drgb drgbVar = (drgb) this.g;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dren drenVar = (dren) it.next();
            dren drenVar2 = true == (drenVar instanceof dren) ? drenVar : null;
            if (drenVar2 != null) {
                arrayList.add(drenVar2);
            }
        }
        ArrayList arrayList2 = true != arrayList.isEmpty() ? arrayList : null;
        if (arrayList2 != null) {
            drgf drgfVar2 = drgbVar.am;
            if (drgfVar2 == null) {
                ffkj.c("searchResultsAdapter");
                drgfVar = null;
            } else {
                drgfVar = drgfVar2;
            }
            ffqy.d(drgbVar.bF(), null, null, new drga(drgbVar, drgfVar, arrayList2, charSequence, null), 3);
        } else {
            drgb.bi(drgbVar, null, null, Integer.valueOf(drgbVar.ah), null, null, 27);
        }
        if (((drfe) drgbVar.bA()).g()) {
            drgbVar.ba();
        }
        return ffcu.a;
    }
}
