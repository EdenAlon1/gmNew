package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqy extends dira {
    private final diil f;
    private final dips g;
    private final boolean h;
    private final String i;
    private final long j;

    private diqy(diqp diqpVar, Context context, diil diilVar, long j, long j2, String str, ditk ditkVar, dips dipsVar, String str2, boolean z, diqw diqwVar) {
        super(context, ditkVar, diqwVar, diqpVar, j, str2);
        this.f = diilVar;
        this.g = dipsVar;
        this.j = j2;
        this.i = str;
        this.h = z;
    }

    public static diqy d(diqp diqpVar, Context context, diil diilVar, long j, long j2, ditk ditkVar, dips dipsVar, String str) {
        diyy diyyVar = diqw.c;
        diqq diqqVar = new diqq();
        diqqVar.b(false);
        diqqVar.c(false);
        return new diqy(diqpVar, context, diilVar, j, j2, null, ditkVar, dipsVar, str, true, diqqVar.d());
    }

    public static diqy e(diqp diqpVar, Context context, diil diilVar, long j, long j2, String str, ditk ditkVar, dips dipsVar, String str2, boolean z) {
        diyy diyyVar = diqw.c;
        diqq diqqVar = new diqq();
        diqqVar.b(false);
        diqqVar.c(z);
        return new diqy(diqpVar, context, diilVar, j, j2, str, ditkVar, dipsVar, str2, false, diqqVar.d());
    }

    private final void f() {
        this.g.c(new FileTransferEvent(20013, this.d, 8L, this.e), dkuj.SEND_PUSH_MESSAGE_LISTENER);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.dira, defpackage.diuc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r10, android.net.Uri r11) {
        /*
            r9 = this;
            super.b(r10, r11)
            long r0 = r9.d
            diqp r11 = r9.b
            java.lang.String r0 = java.lang.Long.toString(r0)
            com.google.android.ims.filetransfer.http.PendingTransferInfo r11 = r11.a(r0)
            r0 = 0
            if (r11 == 0) goto L25
            com.google.android.ims.rcsservice.filetransfer.FileTransferInfo r11 = r11.mFileTransferInfo
            java.lang.String r2 = r11.b
            r2.getClass()
            java.lang.String r3 = "audio"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L25
            long r2 = r11.g
            goto L26
        L25:
            r2 = r0
        L26:
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 0
            if (r11 <= 0) goto L4b
            com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage r11 = com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage.a(r10)     // Catch: java.io.IOException -> L3b
            com.google.android.ims.filetransfer.http.message.FileInfo r0 = r11.mFileInfo     // Catch: java.io.IOException -> L3b
            r0.mAudioDuration = r2     // Catch: java.io.IOException -> L3b
            byte[] r11 = r11.c()     // Catch: java.io.IOException -> L3b
            if (r11 == 0) goto L4b
            r6 = r11
            goto L4c
        L3b:
            r0 = move-exception
            r11 = r0
            java.lang.String r11 = r11.getMessage()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r11
            java.lang.String r11 = "Could not parse ft response data: %s"
            defpackage.dkty.q(r11, r0)
        L4b:
            r6 = r10
        L4c:
            boolean r10 = r9.h
            if (r10 == 0) goto L67
            diil r2 = r9.f
            long r3 = r9.j
            java.lang.String r5 = r9.e
            r7 = r6
            java.lang.String r6 = "application/vnd.gsma.rcs-ft-http+xml"
            com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult r10 = r2.d(r3, r5, r6, r7)
            boolean r10 = r10.succeeded()
            if (r10 != 0) goto L8d
            r9.f()
            return
        L67:
            r7 = r6
            java.lang.String r3 = r9.i
            if (r3 != 0) goto L77
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = "Failed to send file transfer push message in a one on one conversation. The remote user ID is null."
            defpackage.dkty.g(r11, r10)
            r9.f()
            return
        L77:
            diil r2 = r9.f
            long r4 = r9.j
            java.lang.String r8 = r9.e
            r6 = r7
            java.lang.String r7 = "application/vnd.gsma.rcs-ft-http+xml"
            com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult r10 = r2.f(r3, r4, r6, r7, r8)
            boolean r10 = r10.succeeded()
            if (r10 != 0) goto L8d
            r9.f()
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diqy.b(byte[], android.net.Uri):void");
    }
}
