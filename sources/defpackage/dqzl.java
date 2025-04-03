package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqzl implements dqze {
    private static final dqgm b = new dqgm(0);
    public final drag a;
    private final Context c;
    private final dqiy d;
    private final dqgr e;

    public dqzl(drag dragVar, dqiz dqizVar, dqgr dqgrVar, Context context) {
        dqgrVar.getClass();
        context.getClass();
        this.a = dragVar;
        this.e = dqgrVar;
        this.c = context;
        this.d = dqizVar.a(new dqkd(31));
    }

    @Override // defpackage.dqze
    public final Object a(ffgu ffguVar) {
        drag dragVar = this.a;
        return dragVar.c.d("EmotifyDataService#stickerCount", new draf(dragVar, null), ffguVar);
    }

    @Override // defpackage.dqze
    public final Object b(Uri uri, ffgu ffguVar) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return g(uuid, uri, null, true, ffguVar);
    }

    @Override // defpackage.dqze
    public final Object c(String str, ffgu ffguVar) {
        drag dragVar = this.a;
        Object d = dragVar.c.d("EmotifyDataService#delete", new dqzt(dragVar, str, null), ffguVar);
        ffhh ffhhVar = ffhh.a;
        if (d != ffhhVar) {
            d = ffcu.a;
        }
        return d == ffhhVar ? d : ffcu.a;
    }

    @Override // defpackage.dqze
    public final Object d(ffgu ffguVar) {
        drag dragVar = this.a;
        return dragVar.c.d("EmotifyDataService#getCustomSticker", new drac(dragVar, null), ffguVar);
    }

    @Override // defpackage.dqze
    public final ffxx e() {
        return ffyy.a(new dqzj(this.d.c(b), this));
    }

    @Override // defpackage.dqze
    public final Object f(String str, Uri uri, String str2, ffgu ffguVar) {
        return g(str, uri, str2, false, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r28, android.net.Uri r29, java.lang.String r30, boolean r31, defpackage.ffgu r32) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqzl.g(java.lang.String, android.net.Uri, java.lang.String, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.net.Uri r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dqzg
            if (r0 == 0) goto L13
            r0 = r8
            dqzg r0 = (defpackage.dqzg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqzg r0 = new dqzg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.a
            dqzl r0 = r0.e
            defpackage.ffci.b(r8)
            goto L4e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.ffci.b(r8)
            dqgr r8 = r6.e
            drlx r2 = new drlx
            drlu r4 = defpackage.drlu.a
            java.lang.String r5 = "png"
            r2.<init>(r4, r5)
            r0.e = r6
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 == r1) goto L9d
            r0 = r6
        L4e:
            android.net.Uri r8 = (android.net.Uri) r8
            android.content.Context r1 = r0.c
            java.lang.String r2 = "com.android.providers.telephony"
            eepm r2 = defpackage.eepm.a(r2)
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r3 = "r"
            android.content.res.AssetFileDescriptor r7 = defpackage.eepn.a(r1, r7, r3, r2)
            r1 = 0
            if (r7 == 0) goto L68
            android.os.ParcelFileDescriptor r7 = r7.getParcelFileDescriptor()
            goto L69
        L68:
            r7 = r1
        L69:
            android.content.Context r0 = r0.c
            java.lang.String r2 = "w"
            eepm r3 = defpackage.eepm.c
            android.content.res.AssetFileDescriptor r0 = defpackage.eepn.a(r0, r8, r2, r3)
            if (r0 == 0) goto L7a
            android.os.ParcelFileDescriptor r0 = r0.getParcelFileDescriptor()
            goto L7b
        L7a:
            r0 = r1
        L7b:
            android.os.ParcelFileDescriptor$AutoCloseInputStream r2 = new android.os.ParcelFileDescriptor$AutoCloseInputStream
            r2.<init>(r7)
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r7 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch: java.lang.Throwable -> L96
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L96
            defpackage.eoej.a(r2, r7)     // Catch: java.lang.Throwable -> L8f
            defpackage.ffig.a(r7, r1)     // Catch: java.lang.Throwable -> L96
            defpackage.ffig.a(r2, r1)
            return r8
        L8f:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L91
        L91:
            r0 = move-exception
            defpackage.ffig.a(r7, r8)     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        L96:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L98
        L98:
            r8 = move-exception
            defpackage.ffig.a(r2, r7)
            throw r8
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqzl.h(android.net.Uri, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.dqzc r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.dqzk
            if (r0 == 0) goto L13
            r0 = r12
            dqzk r0 = (defpackage.dqzk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqzk r0 = new dqzk
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r12)
            goto L52
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.ffci.b(r12)
            drag r5 = r10.a
            java.lang.String r6 = r11.a
            java.lang.String r7 = r11.b
            r0.c = r3
            dqzr r4 = new dqzr
            r9 = 0
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            dqkk r11 = r5.c
            java.lang.String r12 = "EmotifyDataService#addSticker"
            java.lang.Object r11 = r11.d(r12, r4, r0)
            ffhh r12 = defpackage.ffhh.a
            if (r11 == r12) goto L4f
            ffcu r11 = defpackage.ffcu.a
        L4f:
            if (r11 != r1) goto L52
            return r1
        L52:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqzl.i(dqzc, ffgu):java.lang.Object");
    }
}
