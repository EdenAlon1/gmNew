package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
final class enjr implements Iterator {
    public static final enjr a;
    private static final /* synthetic */ enjr[] b;

    static {
        enjr enjrVar = new enjr();
        a = enjrVar;
        b = new enjr[]{enjrVar};
    }

    private enjr() {
    }

    public static enjr[] values() {
        return (enjr[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        endr.b(false);
    }
}
