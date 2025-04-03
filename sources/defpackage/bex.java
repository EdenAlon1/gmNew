package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bex implements ath {
    public final int b;

    public bex(int i) {
        this.b = i;
    }

    @Override // defpackage.ath
    public final /* synthetic */ bem a() {
        return ath.a;
    }

    @Override // defpackage.ath
    public final List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ati atiVar = (ati) it.next();
            ksw.b(atiVar instanceof bcq, "The camera info doesn't contain internal implementation.");
            if (atiVar.a() == this.b) {
                arrayList.add(atiVar);
            }
        }
        return arrayList;
    }
}
