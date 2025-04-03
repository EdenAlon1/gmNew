package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffet<T> implements Iterable<ffes<? extends T>>, fflg {
    private final ffix a;

    public ffet(ffix ffixVar) {
        this.a = ffixVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.lang.Iterable
    public final Iterator<ffes<T>> iterator() {
        return new ffeu(this.a.invoke());
    }
}
