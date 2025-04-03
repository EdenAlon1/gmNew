package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csyb implements fbba {
    public static evkn a(Set set) {
        evko evkoVar = new evko();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            evlg evlgVar = (evlg) it.next();
            evlgVar.getClass();
            evkoVar.a.add(evlgVar);
        }
        return evkoVar.a();
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
