package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elaa {
    private static final elaa a = new elaa(3, null, true);
    private static final elaa b = new elaa(2, null, true);
    private final Object c;
    private boolean d;
    private final int e;

    public elaa(int i, Object obj, boolean z) {
        this.e = i;
        this.c = obj;
        this.d = z;
    }

    static elaa d(int i) {
        return i + (-1) != 1 ? a : b;
    }

    public final Object a() {
        if (this.d && this.e == 1) {
            return this.c;
        }
        throw new IllegalStateException("Calling get() without checking if the extra is present is an error");
    }

    public final boolean b() {
        this.d = true;
        return this.e == 1;
    }

    public final int c() {
        this.d = true;
        return this.e;
    }
}
