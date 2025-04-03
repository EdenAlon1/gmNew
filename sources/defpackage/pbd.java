package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbd {
    public final long[] a;
    public final float[] b = new float[20];
    public int c = 0;

    public pbd() {
        long[] jArr = new long[20];
        this.a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public static final float b(float f) {
        double signum = Math.signum(f);
        float abs = Math.abs(f);
        return (float) (signum * Math.sqrt(abs + abs));
    }

    public final void a(long j, float f) {
        int i = (this.c + 1) % 20;
        this.c = i;
        this.a[i] = j;
        this.b[i] = f;
    }
}
