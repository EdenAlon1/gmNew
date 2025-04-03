package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajee implements ajcx {
    public static final enru a = enru.c("com/google/android/apps/messaging/penpal/conversation/reauthenticate/PenpalReauthenticateHandlerImpl");
    public static final Bundle b;
    public final Context c;
    public final ffxx d;
    public final ConversationId e;
    public final akzt f;
    public final zqx g;
    public final aigz h;
    public final ffbr i;
    public final elbx j;
    public final ajjc k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final fgdj o;
    private final ffsk p;
    private final ffhd q;
    private final aepg r;

    static {
        Bundle bundle = new Bundle();
        bundle.putBoolean("handle_notification", true);
        b = bundle;
    }

    public ajee(Context context, ffsk ffskVar, ffhd ffhdVar, ffxx ffxxVar, ConversationId conversationId, akzt akztVar, zqx zqxVar, aepg aepgVar, aigz aigzVar, Optional optional, ffbr ffbrVar, elbx elbxVar, ajjc ajjcVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        fgdj j;
        context.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffxxVar.getClass();
        conversationId.getClass();
        akztVar.getClass();
        zqxVar.getClass();
        aepgVar.getClass();
        aigzVar.getClass();
        optional.getClass();
        ffbrVar.getClass();
        elbxVar.getClass();
        ajjcVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.c = context;
        this.p = ffskVar;
        this.q = ffhdVar;
        this.d = ffxxVar;
        this.e = conversationId;
        this.f = akztVar;
        this.g = zqxVar;
        this.r = aepgVar;
        this.h = aigzVar;
        this.i = ffbrVar;
        this.j = elbxVar;
        this.k = ajjcVar;
        this.l = ffbrVar2;
        this.m = ffbrVar3;
        this.n = ffbrVar4;
        if (optional.isEmpty()) {
            j = fgdm.a(false);
        } else {
            cjeo cjeoVar = (cjeo) optional.get();
            Object b2 = ffbrVar.b();
            b2.getClass();
            j = cjeoVar.j((eisx) b2);
        }
        this.o = j;
    }

    @Override // defpackage.ajcx
    public final void a() {
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            axol.k(this.p, null, new ajed(this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[Catch: Exception -> 0x0034, TRY_LEAVE, TryCatch #1 {Exception -> 0x0034, blocks: (B:11:0x0030, B:12:0x005f, B:14:0x0063), top: B:10:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0 A[EDGE_INSN: B:37:0x00d0->B:30:0x00d0 BREAK  A[LOOP:0: B:22:0x00af->B:27:0x00cb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajee.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r6, boolean r7, boolean r8, defpackage.ffgu r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.ajdm
            if (r0 == 0) goto L13
            r0 = r9
            ajdm r0 = (defpackage.ajdm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajdm r0 = new ajdm
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ajee r6 = r0.d
            defpackage.ffci.b(r9)
            goto L4f
        L38:
            defpackage.ffci.b(r9)
            if (r6 == 0) goto L65
            if (r7 == 0) goto L65
            if (r8 == 0) goto L65
            aepg r6 = r5.r
            r0.d = r5
            r0.c = r4
            java.lang.Object r9 = r6.c(r0)
            if (r9 != r1) goto L4e
            goto L63
        L4e:
            r6 = r5
        L4f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 != 0) goto L58
            goto L65
        L58:
            r7 = 0
            r0.d = r7
            r0.c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            return r6
        L65:
            ajdb r6 = defpackage.ajdb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajee.c(boolean, boolean, boolean, ffgu):java.lang.Object");
    }

    public final void d(ajdc ajdcVar) {
        axol.k(this.p, null, new ajdi(this, ajdcVar, null), 3);
    }
}
