package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akni {
    private static final cskc b = cskc.g("Bugle", "MessageStatusChangedIntentSender");
    public final ffbr a;

    public akni(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public static Intent c(Uri uri, UUID uuid, int i) {
        Intent intent = new Intent("com.google.android.apps.messaging.samsung.mde.messagestatus.MESSAGE_STATUS_CHANGED");
        if (uri != null) {
            intent.putExtra("EXTRA_URI", uri.toString());
        }
        if (uuid != null) {
            intent.putExtra("EXTRA_DRAFT_ID", uuid.toString());
        }
        intent.putExtra("EXTRA_STATUS", i - 1);
        return intent;
    }

    public final void a(Uri uri, int i) {
        b(uri, null, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.net.Uri r4, java.util.UUID r5, int r6) {
        /*
            r3 = this;
            r0 = 1
            switch(r6) {
                case 1: goto L22;
                case 2: goto L20;
                case 3: goto L1e;
                case 4: goto L1e;
                case 5: goto L1e;
                case 6: goto L1e;
                case 7: goto L1e;
                case 8: goto L1c;
                case 9: goto L1c;
                case 10: goto L1e;
                case 11: goto L1a;
                case 12: goto L1c;
                case 13: goto L1c;
                case 14: goto L22;
                case 15: goto L22;
                default: goto L4;
            }
        L4:
            switch(r6) {
                case 17: goto L1c;
                case 18: goto L1c;
                case 19: goto L1c;
                case 20: goto L1e;
                case 21: goto L1c;
                case 22: goto L1c;
                case 23: goto L22;
                case 24: goto L1c;
                case 25: goto L1c;
                default: goto L7;
            }
        L7:
            switch(r6) {
                case 100: goto L18;
                case 101: goto L15;
                case 102: goto L12;
                case 103: goto L12;
                case 104: goto L12;
                case 105: goto L12;
                case 106: goto Lf;
                case 107: goto Lf;
                default: goto La;
            }
        La:
            switch(r6) {
                case 110: goto Lf;
                case 111: goto Lf;
                case 112: goto Lf;
                case 113: goto Lf;
                case 114: goto Lf;
                case 115: goto L15;
                case 116: goto Lf;
                case 117: goto L18;
                default: goto Ld;
            }
        Ld:
            r1 = r0
            goto L23
        Lf:
            r1 = 10
            goto L23
        L12:
            r1 = 9
            goto L23
        L15:
            r1 = 8
            goto L23
        L18:
            r1 = 7
            goto L23
        L1a:
            r1 = 5
            goto L23
        L1c:
            r1 = 6
            goto L23
        L1e:
            r1 = 2
            goto L23
        L20:
            r1 = 4
            goto L23
        L22:
            r1 = 3
        L23:
            if (r1 != r0) goto L3b
            cskc r4 = defpackage.akni.b
            csjb r4 = r4.e()
            java.lang.String r5 = "Not sending status changed broadcast. Unknown MDE status for bugle status:"
            r4.I(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4.v(r5)
            r4.r()
            return
        L3b:
            cskc r6 = defpackage.akni.b
            csjb r6 = r6.c()
            java.lang.String r0 = "Sending message status changed intent for message:"
            r6.I(r0)
            if (r4 != 0) goto L4b
            java.lang.String r0 = ""
            goto L4f
        L4b:
            java.lang.String r0 = r4.toString()
        L4f:
            java.lang.String r2 = "URI:"
            r6.D(r2, r0)
            java.lang.String r0 = ", status:"
            r6.I(r0)
            switch(r1) {
                case 2: goto L74;
                case 3: goto L71;
                case 4: goto L6e;
                case 5: goto L6b;
                case 6: goto L68;
                case 7: goto L65;
                case 8: goto L62;
                case 9: goto L5f;
                default: goto L5c;
            }
        L5c:
            java.lang.String r0 = "INCOMING_FAILED"
            goto L76
        L5f:
            java.lang.String r0 = "INCOMING_DOWNLOADING"
            goto L76
        L62:
            java.lang.String r0 = "INCOMING_YET_TO_MANUAL_DOWNLOAD"
            goto L76
        L65:
            java.lang.String r0 = "INCOMING_COMPLETE"
            goto L76
        L68:
            java.lang.String r0 = "OUTGOING_FAILED"
            goto L76
        L6b:
            java.lang.String r0 = "OUTGOING_DISPLAYED"
            goto L76
        L6e:
            java.lang.String r0 = "OUTGOING_DELIVERED"
            goto L76
        L71:
            java.lang.String r0 = "OUTGOING_COMPLETE"
            goto L76
        L74:
            java.lang.String r0 = "OUTGOING_SENDING"
        L76:
            r6.I(r0)
            r6.r()
            ffbr r6 = r3.a
            java.lang.Object r6 = r6.b()
            akne r6 = (defpackage.akne) r6
            android.content.Intent r4 = c(r4, r5, r1)
            r6.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akni.b(android.net.Uri, java.util.UUID, int):void");
    }
}
