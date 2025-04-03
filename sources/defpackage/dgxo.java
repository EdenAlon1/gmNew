package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgxo {
    public static boolean a(eyja eyjaVar, long j, long j2, long j3) {
        long millis = (TimeUnit.SECONDS.toMillis(eyjaVar.b) + TimeUnit.NANOSECONDS.toMillis(eyjaVar.c)) - j;
        return j2 <= millis && millis < j3;
    }
}
