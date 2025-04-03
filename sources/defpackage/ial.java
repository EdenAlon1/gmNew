package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ial {
    public static final long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}
