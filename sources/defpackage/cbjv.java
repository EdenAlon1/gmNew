package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjv {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/resizing/v3/ResizingManagerV3");
    public final crbd b;
    public final ctap c;
    public final ctax d;
    private final Context e;
    private final ffhd f;
    private final cbil g;
    private final cbjo h;
    private final ffbr i;

    public cbjv(Context context, ffhd ffhdVar, cbil cbilVar, cbjo cbjoVar, ffbr ffbrVar, crbd crbdVar, ctap ctapVar, ctax ctaxVar) {
        context.getClass();
        ffhdVar.getClass();
        ffbrVar.getClass();
        crbdVar.getClass();
        ctapVar.getClass();
        ctaxVar.getClass();
        this.e = context;
        this.f = ffhdVar;
        this.g = cbilVar;
        this.h = cbjoVar;
        this.i = ffbrVar;
        this.b = crbdVar;
        this.c = ctapVar;
        this.d = ctaxVar;
    }

    private static final boolean d(ContentType contentType) {
        return le.o(contentType.toString(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.awap r13, android.net.Uri r14, com.google.android.rcs.client.messaging.data.ContentType r15, long r16, defpackage.ffgu r18) {
        /*
            r12 = this;
            r0 = r18
            boolean r1 = r0 instanceof defpackage.cbjq
            if (r1 == 0) goto L15
            r1 = r0
            cbjq r1 = (defpackage.cbjq) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            cbjq r1 = new cbjq
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.a
            ffhh r2 = defpackage.ffhh.a
            int r3 = r1.c
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            awap r13 = r1.d
            defpackage.ffci.b(r0)
            goto L51
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            defpackage.ffci.b(r0)
            ffhd r0 = r12.f
            ffhd r0 = defpackage.ekxi.a(r0)
            cbjp r5 = new cbjp
            r6 = 0
            r7 = r12
            r8 = r14
            r9 = r15
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10)
            r1.d = r13
            r1.c = r4
            java.lang.Object r0 = defpackage.ffra.a(r0, r5, r1)
            if (r0 == r2) goto Lc0
        L51:
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L90
            enru r14 = defpackage.cbjv.a
            ensk r14 = r14.j()
            ensn r15 = defpackage.ente.a
            java.lang.String r0 = "BugleFileTransfer"
            r14.Y(r15, r0)
            enrr r14 = (defpackage.enrr) r14
            ensn r15 = defpackage.cqpo.j
            r14.Y(r15, r13)
            java.lang.String r13 = "createThumbnail"
            r15 = 155(0x9b, float:2.17E-43)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/resizing/v3/ResizingManagerV3"
            java.lang.String r1 = "ResizingManagerV3.kt"
            ensk r13 = r14.h(r0, r13, r15, r1)
            enrr r13 = (defpackage.enrr) r13
            java.lang.String r14 = "Could not generate preview."
            r13.q(r14)
            cbjc r13 = defpackage.cbjc.a
            eyfq r13 = r13.createBuilder()
            cbja r13 = (defpackage.cbja) r13
            r13.getClass()
            r14 = 7
            defpackage.cbjd.d(r14, r13)
            cbjc r13 = defpackage.cbjd.a(r13)
            return r13
        L90:
            cbjc r13 = defpackage.cbjc.a
            eyfq r13 = r13.createBuilder()
            cbja r13 = (defpackage.cbja) r13
            r13.getClass()
            r14 = 3
            defpackage.cbjd.d(r14, r13)
            java.lang.String r14 = "image/jpeg"
            awup r14 = defpackage.awuq.b(r14)
            defpackage.cbjd.b(r14, r13)
            eyee r14 = defpackage.eyee.x(r0)
            r13.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r15 = r13.instance
            cbjc r15 = (defpackage.cbjc) r15
            int r0 = r15.b
            r0 = r0 | 2
            r15.b = r0
            r15.f = r14
            cbjc r13 = defpackage.cbjd.a(r13)
            return r13
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbjv.a(awap, android.net.Uri, com.google.android.rcs.client.messaging.data.ContentType, long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.awap r22, android.net.Uri r23, com.google.android.rcs.client.messaging.data.ContentType r24, long r25, int r27, java.lang.String r28, defpackage.ffgu r29) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbjv.b(awap, android.net.Uri, com.google.android.rcs.client.messaging.data.ContentType, long, int, java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.net.Uri r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cbju
            if (r0 == 0) goto L13
            r0 = r9
            cbju r0 = (defpackage.cbju) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbju r0 = new cbju
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            cbik r8 = r0.d
            defpackage.ffci.b(r9)
            goto L6c
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.ffci.b(r9)
            cbiy r9 = defpackage.cbiy.a
            eyfq r9 = r9.createBuilder()
            cbix r9 = (defpackage.cbix) r9
            r9.getClass()
            java.lang.String r8 = r8.toString()
            defpackage.cbiz.b(r8, r9)
            r5 = 1048576(0x100000, double:5.180654E-318)
            defpackage.cbiz.c(r5, r9)
            cbil r8 = r7.g
            cbiy r9 = defpackage.cbiz.a(r9)
            cbik r8 = r8.a(r9, r4)
            ffhd r9 = r7.f
            ffhd r9 = defpackage.ekxi.a(r9)
            cbjt r2 = new cbjt
            r2.<init>(r4, r8)
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.ffra.a(r9, r2, r0)
            if (r9 == r1) goto L98
        L6c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L95
            enru r8 = defpackage.cbjv.a
            ensk r8 = r8.j()
            ensn r9 = defpackage.ente.a
            java.lang.String r0 = "BugleFileTransfer"
            r8.Y(r9, r0)
            java.lang.String r9 = "resizeGroupIcon"
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.String r1 = "com/google/android/apps/messaging/shared/datamodel/resizing/v3/ResizingManagerV3"
            java.lang.String r2 = "ResizingManagerV3.kt"
            ensk r8 = r8.h(r1, r9, r0, r2)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r9 = "Failed to resize group icon."
            r8.q(r9)
            return r4
        L95:
            android.net.Uri r8 = r8.b
            return r8
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbjv.c(android.net.Uri, ffgu):java.lang.Object");
    }
}
