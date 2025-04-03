package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fim {
    public static final void a(hvi hviVar, long j, float f, ffjm ffjmVar, hfd hfdVar, int i, int i2) {
        hfd hfdVar2;
        long j2;
        if ((i2 & 1) != 0) {
            hviVar = hvi.e;
        }
        hvi hviVar2 = hviVar;
        eqd eqdVar = (i2 & 2) != 0 ? fla.b(hfdVar).b : null;
        if ((i2 & 4) != 0) {
            j = fla.a(hfdVar).l();
        }
        long j3 = j;
        if ((i2 & 8) != 0) {
            hfdVar2 = hfdVar;
            j2 = fip.a(j3, hfdVar2);
        } else {
            hfdVar2 = hfdVar;
            j2 = 0;
        }
        long j4 = j2;
        if ((i2 & 32) != 0) {
            f = 1.0f;
        }
        C0001for.a(hviVar2, eqdVar, j3, j4, f, ffjmVar, hfdVar2, (i & 524286) | 1572864, 0);
    }
}
