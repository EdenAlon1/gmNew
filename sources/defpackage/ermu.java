package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermu {
    public static byte a(long j) {
        emxf.e((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static int b(byte b) {
        return b & 255;
    }
}
