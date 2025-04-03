package defpackage;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljw {
    public static final dlhk a(m mVar, Map map) {
        dkzx dkzxVar = new dkzx(map);
        long j = ffpw.a;
        i iVar = new i();
        int d = mVar.d(10);
        if (d != 0) {
            int c = mVar.c(d + mVar.a);
            ByteBuffer byteBuffer = mVar.b;
            byteBuffer.getClass();
            iVar.h(c, byteBuffer);
        } else {
            iVar = null;
        }
        if (iVar != null) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            int d2 = iVar.d(4);
            r4 = timeUnit.convert(timeUnit2.convert(d2 != 0 ? iVar.b.getLong(d2 + iVar.a) : 0L, TimeUnit.SECONDS) + (iVar.d(6) != 0 ? iVar.b.getInt(r7 + iVar.a) : 0), TimeUnit.NANOSECONDS);
        }
        ffqi ffqiVar = new ffqi(dkzxVar, ffpy.e(r4, ffpz.c));
        int d3 = mVar.d(4);
        String g = d3 != 0 ? mVar.g(d3 + mVar.a) : null;
        int d4 = mVar.d(6);
        String g2 = d4 != 0 ? mVar.g(d4 + mVar.a) : null;
        if (g == null) {
            g = "";
        }
        if (g2 == null) {
            g2 = "";
        }
        return new dlhk(ffqiVar, new dlab(g, g2));
    }
}
