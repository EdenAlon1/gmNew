package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fix {
    public static final float a(hfd hfdVar) {
        return d(0.38f, 0.38f, hfdVar);
    }

    public static final float b(hfd hfdVar) {
        return d(1.0f, 0.87f, hfdVar);
    }

    public static final float c(hfd hfdVar) {
        return d(0.74f, 0.6f, hfdVar);
    }

    private static final float d(float f, float f2, hfd hfdVar) {
        long j = ((ibw) hfdVar.e(fjb.a)).i;
        return (!fla.a(hfdVar).m() ? ((double) iby.a(j)) >= 0.5d : ((double) iby.a(j)) <= 0.5d) ? f : f2;
    }
}
