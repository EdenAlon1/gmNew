package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knh {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r4 = r4.getBubbleMetadata();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kmi a(android.app.Notification r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 < r2) goto L23
            android.app.Notification$BubbleMetadata r4 = defpackage.abk$$ExternalSyntheticApiModelOutline0.m(r4)
            if (r4 != 0) goto Le
            return r1
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 < r3) goto L19
            kmi r4 = defpackage.kmg.b(r4)
            return r4
        L19:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 == r2) goto L1e
            return r1
        L1e:
            kmi r4 = defpackage.kmf.b(r4)
            return r4
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knh.a(android.app.Notification):kmi");
    }

    public static boolean b(Notification notification) {
        return (notification.flags & 512) != 0;
    }
}
