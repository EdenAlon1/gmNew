package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermf {
    public static char a(long j) {
        char c = (char) j;
        emxf.e(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    public static char b(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }
}
