package defpackage;

import android.content.Context;
import java.text.Collator;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crnh implements Comparator {
    private final Collator a;

    public crnh(Context context) {
        Collator collator = Collator.getInstance(kqt.a(context.getResources().getConfiguration()).f(0));
        this.a = collator;
        collator.setStrength(0);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        qmc qmcVar = (qmc) obj;
        boolean a = crmb.a(qmcVar.f);
        qmc qmcVar2 = (qmc) obj2;
        if (a != crmb.a(qmcVar2.f)) {
            return a ? -1 : 1;
        }
        int compare = this.a.compare(qmcVar.b, qmcVar2.b);
        if (compare != 0 || (compare = Long.compare(qmcVar.f, qmcVar2.f)) != 0) {
            return compare;
        }
        boolean z = qmcVar.a;
        if (z != qmcVar2.a) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
