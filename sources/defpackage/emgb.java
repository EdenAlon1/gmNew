package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emgb extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ emge c;
    final /* synthetic */ Bitmap d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emgb(emge emgeVar, Bitmap bitmap, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = emgeVar;
        this.d = bitmap;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((emgb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0087  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.b
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L11
            java.lang.Object r0 = r8.e
            android.net.Uri r0 = (android.net.Uri) r0
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L7a
            goto L7f
        L11:
            java.lang.Object r1 = r8.a
            java.lang.Object r2 = r8.e
            emge r2 = (defpackage.emge) r2
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L7a
            goto L5b
        L1b:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.e
            ffsk r9 = (defpackage.ffsk) r9
            emge r9 = r8.c
            enru r9 = r9.e
            ensk r9 = r9.h()
            java.lang.String r1 = "invokeSuspend"
            r3 = 301(0x12d, float:4.22E-43)
            java.lang.String r4 = "com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel$onSelectEmote$1"
            java.lang.String r5 = "EmotifyViewModel.kt"
            ensk r9 = r9.h(r4, r1, r3, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r1 = "ViewModel onClipSticker"
            r9.q(r1)
            emge r9 = r8.c
            android.graphics.Bitmap r1 = r8.d
            dqgr r3 = r9.w     // Catch: java.lang.Throwable -> L7a
            drlx r4 = new drlx     // Catch: java.lang.Throwable -> L7a
            drlu r5 = defpackage.drlu.a     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = "png"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L7a
            r8.e = r9     // Catch: java.lang.Throwable -> L7a
            r8.a = r1     // Catch: java.lang.Throwable -> L7a
            r8.b = r2     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r3.a(r4, r8)     // Catch: java.lang.Throwable -> L7a
            if (r2 == r0) goto L79
            r7 = r2
            r2 = r9
            r9 = r7
        L5b:
            android.net.Uri r9 = (android.net.Uri) r9     // Catch: java.lang.Throwable -> L7a
            ffbr r3 = r2.c     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L7a
            emgq r3 = (defpackage.emgq) r3     // Catch: java.lang.Throwable -> L7a
            boolean r2 = r2.k     // Catch: java.lang.Throwable -> L7a
            r8.e = r9     // Catch: java.lang.Throwable -> L7a
            r4 = 0
            r8.a = r4     // Catch: java.lang.Throwable -> L7a
            r4 = 2
            r8.b = r4     // Catch: java.lang.Throwable -> L7a
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r3.a(r1, r9, r2)     // Catch: java.lang.Throwable -> L7a
            if (r1 == r0) goto L79
            r0 = r9
            goto L7f
        L79:
            return r0
        L7a:
            r9 = move-exception
            java.lang.Object r0 = defpackage.ffci.a(r9)
        L7f:
            emge r9 = r8.c
            java.lang.Throwable r1 = defpackage.ffch.c(r0)
            if (r1 != 0) goto La7
            android.net.Uri r0 = (android.net.Uri) r0
            android.graphics.Bitmap r9 = r8.d
            r9.recycle()
            emge r9 = r8.c
            hho r9 = r9.m
            java.lang.Object r9 = r9.a()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto L9d
            r9.recycle()
        L9d:
            emge r9 = r8.c
            fgcm r9 = r9.r
            r9.f(r0)
            ffcu r9 = defpackage.ffcu.a
            return r9
        La7:
            adak r9 = r9.x
            if (r9 != 0) goto Lac
            goto Lb1
        Lac:
            draw r0 = defpackage.draw.c
            r9.b(r0)
        Lb1:
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r0 = "Can't create URI from temp file"
            r9.<init>(r0, r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emgb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        emgb emgbVar = new emgb(this.c, this.d, ffguVar);
        emgbVar.e = obj;
        return emgbVar;
    }
}
