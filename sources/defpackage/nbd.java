package defpackage;

import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nbd {
    public final int a;
    public final FloatBuffer b;
    public final FloatBuffer c;
    public final int d;

    public nbd(nba nbaVar) {
        float[] fArr = nbaVar.c;
        this.a = fArr.length / 3;
        this.b = ltz.k(fArr);
        this.c = ltz.k(nbaVar.d);
        int i = nbaVar.b;
        this.d = i != 1 ? i != 2 ? 4 : 6 : 5;
    }
}
