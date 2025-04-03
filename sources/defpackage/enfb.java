package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enfb extends enfc {
    final /* synthetic */ Iterable[] a;

    public enfb(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new enjq(new enfa(this.a));
    }
}
