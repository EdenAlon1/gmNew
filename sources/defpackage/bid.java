package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bid implements Enumeration {
    int a = 0;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        int i = this.a;
        String str = big.d;
        return i < 4;
    }

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ Object nextElement() {
        this.a++;
        return new HashMap();
    }
}
