package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpx {
    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final void c(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void d(String str) {
        throw new NoSuchElementException(str);
    }
}
