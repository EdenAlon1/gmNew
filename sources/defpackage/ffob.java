package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffob implements ffnl {
    final /* synthetic */ ffnl a;
    final /* synthetic */ Comparator b;

    public ffob(ffnl ffnlVar, Comparator comparator) {
        this.a = ffnlVar;
        this.b = comparator;
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        ArrayList arrayList = new ArrayList();
        ffnf ffnfVar = new ffnf((ffng) this.a);
        while (ffnfVar.hasNext()) {
            arrayList.add(ffnfVar.next());
        }
        ffdx.q(arrayList, this.b);
        return arrayList.iterator();
    }
}
