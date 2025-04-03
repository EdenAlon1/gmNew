package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bic implements Enumeration {
    int a = 0;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        int i = this.a;
        String str = big.d;
        return i < 4;
    }

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ Object nextElement() {
        HashMap hashMap = new HashMap();
        for (bii biiVar : big.b[this.a]) {
            hashMap.put(biiVar.b, biiVar);
        }
        this.a++;
        return hashMap;
    }
}
