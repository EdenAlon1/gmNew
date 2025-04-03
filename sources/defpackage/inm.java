package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class inm implements inp {
    @Override // defpackage.inp
    public final long a(long j, long j2) {
        float a = inq.a(j, j2);
        long floatToRawIntBits = Float.floatToRawIntBits(a);
        long floatToRawIntBits2 = Float.floatToRawIntBits(a);
        int i = iqu.a;
        return (floatToRawIntBits << 32) | (4294967295L & floatToRawIntBits2);
    }
}
