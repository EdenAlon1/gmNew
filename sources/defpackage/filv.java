package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.StatsEvent;
import android.util.StatsLog;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class filv extends fiic {
    private static final String a = "filv";
    private final AtomicInteger b;
    private final filz c;

    public filv() {
        filz filzVar = new filz();
        this.b = new AtomicInteger();
        this.c = filzVar;
    }

    private static long[] f(List list) {
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = ((Long) list.get(i)).longValue();
        }
        return jArr;
    }

    @Override // defpackage.fiic
    public final long a() {
        long nextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        return nextLong >= -1 ? nextLong + 2 : nextLong;
    }

    @Override // defpackage.fiic
    public final void b(fihx fihxVar) {
        new fiev("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
        try {
            long j = fihxVar.a;
            int i = fihxVar.h;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            int i3 = 0;
            int i4 = 2;
            int i5 = i2 != 0 ? i2 != 1 ? 0 : 2 : 1;
            int i6 = fihxVar.b;
            int ordinal = fihxVar.c.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    i4 = 3;
                    if (ordinal != 3) {
                        i4 = 4;
                        if (ordinal != 4) {
                        }
                    }
                }
                i3 = i4;
            } else {
                i3 = 1;
            }
            int a2 = fily.a(fily.b(fihxVar.d));
            fiib fiibVar = fihxVar.e;
            int i7 = fiibVar.a;
            int i8 = fiibVar.b;
            int i9 = fiibVar.c;
            int i10 = fiibVar.d;
            fiib fiibVar2 = fihxVar.f;
            int i11 = fiibVar2 == null ? -1 : fiibVar2.a;
            int i12 = fiibVar2 == null ? -1 : fiibVar2.b;
            int i13 = fiibVar2 == null ? -1 : fiibVar2.c;
            int i14 = fiibVar2 == null ? -1 : fiibVar2.d;
            int i15 = fihxVar.g;
            StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
            newBuilder.setAtomId(762);
            newBuilder.writeLong(j);
            newBuilder.writeInt(i5);
            newBuilder.writeInt(i6);
            newBuilder.writeInt(i3);
            newBuilder.writeInt(a2);
            newBuilder.writeInt(i7);
            newBuilder.writeInt(i8);
            newBuilder.writeInt(i9);
            newBuilder.writeInt(i10);
            newBuilder.writeInt(i11);
            newBuilder.writeInt(i12);
            newBuilder.writeInt(i13);
            newBuilder.writeInt(i14);
            newBuilder.writeInt(i15);
            newBuilder.addBooleanAnnotation((byte) 1, true);
            newBuilder.usePooledBuffer();
            StatsLog.write(newBuilder.build());
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:4|5|(2:6|7)|(5:(17:(1:(1:(1:12))(1:77))(1:78)|13|14|15|(1:(1:(1:19)(1:71))(1:72))(1:73)|20|21|(6:23|(3:25|(2:27|28)(1:30)|29)|31|32|(2:34|(2:35|(1:37)(1:38)))(0)|39)(1:68)|40|(8:61|62|43|44|45|46|47|48)|42|43|44|45|46|47|48)|45|46|47|48)|79|13|14|15|(0)(0)|20|21|(0)(0)|40|(0)|42|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0360, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x036b, code lost:
    
        r8 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0362, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0363, code lost:
    
        r17 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[Catch: all -> 0x0360, TryCatch #0 {all -> 0x0360, blocks: (B:21:0x005a, B:23:0x007e, B:25:0x0090, B:27:0x00aa, B:29:0x00ad, B:32:0x00b4, B:34:0x00c5, B:35:0x00cb, B:37:0x00d4, B:39:0x00de, B:40:0x00e7, B:43:0x029d, B:62:0x026b, B:65:0x0279, B:67:0x0282), top: B:20:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.ClassCastException, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [long] */
    /* JADX WARN: Type inference failed for: r8v24, types: [long] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // defpackage.fiic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r41, defpackage.fihw r43, defpackage.fiib r44, defpackage.fihz r45) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.filv.c(long, fihw, fiib, fihz):void");
    }

    @Override // defpackage.fiic
    public final void d(fihy fihyVar) {
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        new fiev("CronetLoggerImpl#logCronetInitializedInfo");
        try {
            long j = fihyVar.a;
            int i = fihyVar.b;
            int i2 = fihyVar.c;
            int i3 = fihyVar.d;
            int a2 = fily.a(fily.b(fihyVar.e));
            long[] f = f(fihyVar.f);
            long[] f2 = f(fihyVar.g);
            StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
            newBuilder.setAtomId(764);
            newBuilder.writeLong(j);
            newBuilder.writeInt(i);
            newBuilder.writeInt(i2);
            newBuilder.writeInt(i3);
            newBuilder.writeInt(a2);
            newBuilder.writeLongArray(f);
            newBuilder.writeLongArray(f2);
            newBuilder.usePooledBuffer();
            StatsLog.write(newBuilder.build());
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [filv] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [long] */
    /* JADX WARN: Type inference failed for: r1v26, types: [long] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.fiic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r29, defpackage.fiia r31) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.filv.e(long, fiia):void");
    }
}
