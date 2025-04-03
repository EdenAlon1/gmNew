package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itm {
    public static final long a(float f, boolean z, boolean z2) {
        return (true != z ? 0L : 1L) | (true == z2 ? 2L : 0L) | (Float.floatToRawIntBits(f) << 32);
    }
}
