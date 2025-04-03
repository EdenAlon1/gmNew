package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yrg implements yqv {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/SelfieGifUiAdapterImpl");
    public final ffsk b;
    public final dpif c;
    public final dpgu d;
    public final ffbr e;
    public ajiy f;
    public boolean g;
    public boolean h;
    private final Context i;
    private final ajjc j;
    private final ctud k;
    private final aigz l;
    private final abai m;

    public yrg(ffsk ffskVar, ffhd ffhdVar, Context context, dpif dpifVar, ajjc ajjcVar, dpgu dpguVar, ffbr ffbrVar, ctud ctudVar, aigz aigzVar, abai abaiVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        context.getClass();
        dpifVar.getClass();
        ajjcVar.getClass();
        ffbrVar.getClass();
        ctudVar.getClass();
        aigzVar.getClass();
        abaiVar.getClass();
        this.b = ffskVar;
        this.i = context;
        this.c = dpifVar;
        this.j = ajjcVar;
        this.d = dpguVar;
        this.e = ffbrVar;
        this.k = ctudVar;
        this.l = aigzVar;
        this.m = abaiVar;
    }

    @Override // defpackage.yqv
    @ffbs
    public final void a(int i) {
        if (this.m.a) {
            Context context = this.i;
            Toast.makeText(context, context.getString(R.string.selfie_gif_multi_window_alert_text), 0).show();
        } else {
            ensk e = a.e();
            e.Y(ente.a, "BugleSelfieGif");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/SelfieGifUiAdapterImpl", "deprecatedShowPopup", 57, "SelfieGifUiAdapterImpl.kt")).t("Selfie GIF popup opened from OpeningSource: %s", i != 1 ? i != 2 ? "SMART_SUGGESTION" : "SHORTCUTS_SCREEN" : "CAMERA_GALLERY_BUTTON");
            axol.k(this.b, null, new yqx(this, i, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.yqy
            if (r0 == 0) goto L13
            r0 = r8
            yqy r0 = (defpackage.yqy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yqy r0 = new yqy
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.ffci.b(r8)
            goto L81
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            yrg r2 = r0.d
            defpackage.ffci.b(r8)
            goto L5a
        L39:
            defpackage.ffci.b(r8)
            ctud r8 = r7.k
            boolean r8 = r8.f()
            if (r8 == 0) goto L46
        L44:
            r3 = r5
            goto L81
        L46:
            aigz r8 = r7.l
            aimz r2 = new aimz
            ctuf r6 = defpackage.ctuf.CAMERA_PERMISSIONS
            r2.<init>(r6)
            r0.d = r7
            r0.c = r5
            java.lang.Object r8 = r8.f(r2, r0)
            if (r8 == r1) goto L86
            r2 = r7
        L5a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L63
            goto L44
        L63:
            android.content.Context r8 = r2.i
            r5 = 0
            r0.d = r5
            r0.c = r4
            ffsk r2 = r2.b
            ffhd r2 = r2.hT()
            yrf r4 = new yrf
            r4.<init>(r8, r5)
            java.lang.Object r8 = defpackage.ffra.a(r2, r4, r0)
            ffhh r0 = defpackage.ffhh.a
            if (r8 == r0) goto L7f
            ffcu r8 = defpackage.ffcu.a
        L7f:
            if (r8 == r1) goto L86
        L81:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrg.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(final int r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.yqz
            if (r0 == 0) goto L13
            r0 = r6
            yqz r0 = (defpackage.yqz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yqz r0 = new yqz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.e
            yrg r0 = r0.d
            defpackage.ffci.b(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            r0.d = r4
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 == r1) goto L5c
            r0 = r4
        L43:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L56
            ajjc r6 = r0.j
            yqw r1 = new yqw
            r1.<init>()
            r6.e(r1)
            goto L57
        L56:
            r3 = 0
        L57:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrg.c(int, ffgu):java.lang.Object");
    }
}
