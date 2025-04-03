package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbho extends cbid {
    private static final cskc g = cskc.g("BugleResizing", "ImageResizingJob");
    private final int h;
    private final int i;
    private final Context j;
    private final ctap k;

    public cbho(Context context, ffbr ffbrVar, bazm bazmVar, MessagePartCoreData messagePartCoreData, cbic cbicVar) {
        super(messagePartCoreData, cbicVar, bazmVar);
        this.j = context;
        this.k = (ctap) ffbrVar.b();
        if (messagePartCoreData.c() <= 0 || messagePartCoreData.b() <= 0) {
            messagePartCoreData.ai();
        }
        this.h = messagePartCoreData.c();
        this.i = messagePartCoreData.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        defpackage.cbho.g.r("Cannot resize image with unknown width");
     */
    @Override // defpackage.cbid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean b() {
        /*
            r11 = this;
            java.lang.String r0 = "ImageResizingJob#runInBackground"
            ekzz r1 = defpackage.eleg.f(r0)
            android.net.Uri r9 = r11.c     // Catch: java.lang.Throwable -> L6b
            r0 = 0
            if (r9 != 0) goto L13
            cskc r2 = defpackage.cbho.g     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "Cannot resize image with null contentUri"
            r2.r(r3)     // Catch: java.lang.Throwable -> L6b
            goto L67
        L13:
            int r3 = r11.h     // Catch: java.lang.Throwable -> L6b
            if (r3 <= 0) goto L53
            int r4 = r11.i     // Catch: java.lang.Throwable -> L6b
            if (r4 > 0) goto L1c
            goto L53
        L1c:
            ctap r2 = r11.k     // Catch: java.lang.Throwable -> L6b
            long r7 = r11.d     // Catch: java.lang.Throwable -> L6b
            java.lang.String r10 = r11.e     // Catch: java.lang.Throwable -> L6b
            r5 = r3
            r6 = r4
            byte[] r2 = r2.q(r3, r4, r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L6b
            if (r2 != 0) goto L32
            java.lang.String r2 = "Bugle"
            java.lang.String r3 = "Could not resize image"
            defpackage.csjy.n(r2, r3)     // Catch: java.lang.Throwable -> L6b
            goto L67
        L32:
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L6b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L6b
            android.content.Context r2 = r11.j     // Catch: java.lang.Throwable -> L6b
            android.net.Uri r4 = r11.b     // Catch: java.lang.Throwable -> L6b
            android.net.Uri r2 = defpackage.csuu.e(r2, r3, r4)     // Catch: java.lang.Throwable -> L6b
            r3 = 1
            if (r2 == 0) goto L43
            r0 = r3
        L43:
            if (r0 == 0) goto L67
            java.lang.String r2 = r11.e     // Catch: java.lang.Throwable -> L6b
            boolean r2 = defpackage.le.k(r2)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L67
            java.lang.String r0 = "image/jpeg"
            r11.e = r0     // Catch: java.lang.Throwable -> L6b
            r0 = r3
            goto L67
        L53:
            if (r3 > 0) goto L5c
            cskc r2 = defpackage.cbho.g     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "Cannot resize image with unknown width"
            r2.r(r3)     // Catch: java.lang.Throwable -> L6b
        L5c:
            int r2 = r11.i     // Catch: java.lang.Throwable -> L6b
            if (r2 > 0) goto L67
            cskc r2 = defpackage.cbho.g     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "Cannot resize image with unknown height"
            r2.r(r3)     // Catch: java.lang.Throwable -> L6b
        L67:
            r1.close()
            return r0
        L6b:
            r0 = move-exception
            r2 = r0
            r1.close()     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r0 = move-exception
            r2.addSuppressed(r0)
        L75:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbho.b():boolean");
    }

    @Override // defpackage.cbid
    protected final void a() {
    }
}
