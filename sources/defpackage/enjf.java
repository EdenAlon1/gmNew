package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enjf extends enfc {
    final /* synthetic */ Iterable a;
    final /* synthetic */ emxg b;

    public enjf(Iterable iterable, emxg emxgVar) {
        this.a = iterable;
        this.b = emxgVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return enju.c(this.a.iterator(), this.b);
    }
}
