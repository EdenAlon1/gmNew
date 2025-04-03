package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yti implements ysi {
    public static final enru b = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/files/FilesShortcutHandler");
    public final Context c;
    public final csum d;
    private final ffsk e;
    private final ffhd f;
    private final ffhd g;
    private final aigz h;
    private final llv i;
    private final ffbr j;
    private final int k;
    private final dsaq l;
    private final xto m;
    private final ablq n;
    private final xgp o;

    public yti(ffsk ffskVar, ffhd ffhdVar, ffhd ffhdVar2, aigz aigzVar, xto xtoVar, Context context, ablq ablqVar, csum csumVar, llv llvVar, xgp xgpVar, ffbr ffbrVar, ysb ysbVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        aigzVar.getClass();
        xtoVar.getClass();
        context.getClass();
        ablqVar.getClass();
        csumVar.getClass();
        llvVar.getClass();
        ffbrVar.getClass();
        this.e = ffskVar;
        this.f = ffhdVar;
        this.g = ffhdVar2;
        this.h = aigzVar;
        this.m = xtoVar;
        this.c = context;
        this.n = ablqVar;
        this.d = csumVar;
        this.i = llvVar;
        this.o = xgpVar;
        this.j = ffbrVar;
        axol.k(ffskVar, null, new ytb(this, null), 3);
        this.k = R.string.files_shortcut_title;
        this.l = new dsaq(R.drawable.quantum_gm_ic_attach_file_vd_theme_24, new dsap(ysbVar.a(R.color.files_shortcut_background), new dszo(R.color.files_shortcut_icon_tint)));
    }

    @Override // defpackage.ysi
    public final int a() {
        return this.k;
    }

    @Override // defpackage.ysi
    public final dsaq b() {
        return this.l;
    }

    @Override // defpackage.ysi
    public final /* synthetic */ List c() {
        return ffel.a;
    }

    @Override // defpackage.ysi
    @ffbs
    public final void d(View view) {
        axol.k(this.e, null, new ytd(this, view, null), 3);
    }

    @Override // defpackage.ysi
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r1.g(r10, r7) == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.ytc
            if (r0 == 0) goto L13
            r0 = r10
            ytc r0 = (defpackage.ytc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ytc r0 = new ytc
            r0.<init>(r9, r10)
        L18:
            r7 = r0
            java.lang.Object r10 = r7.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.c
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 == r2) goto L33
            if (r1 != r8) goto L2b
            defpackage.ffci.b(r10)
            goto L8a
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            yti r1 = r7.d
            defpackage.ffci.b(r10)
            goto L57
        L39:
            defpackage.ffci.b(r10)
            r10 = r2
            llv r2 = r9.i
            aigz r4 = r9.h
            yse r1 = defpackage.ysi.a
            yta r6 = new yta
            r6.<init>()
            r7.d = r9
            r7.c = r10
            java.lang.String r5 = "FilePicker"
            java.lang.String r3 = "files_shortcut_saved_state_pending_result"
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r10 == r0) goto L8d
            r1 = r9
        L57:
            android.net.Uri r10 = (android.net.Uri) r10
            if (r10 != 0) goto L7e
            enru r10 = defpackage.yti.b
            ensk r10 = r10.j()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleComposeRow2"
            r10.Y(r0, r1)
            java.lang.String r0 = "checkForAndHandlePendingResult"
            r1 = 192(0xc0, float:2.69E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/files/FilesShortcutHandler"
            java.lang.String r3 = "FilesShortcutHandler.kt"
            ensk r10 = r10.h(r2, r0, r1, r3)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r0 = "Skipping file picker activity result because of null uri"
            r10.q(r0)
            ffcu r10 = defpackage.ffcu.a
            return r10
        L7e:
            r2 = 0
            r7.d = r2
            r7.c = r8
            java.lang.Object r10 = r1.g(r10, r7)
            if (r10 != r0) goto L8a
            goto L8d
        L8a:
            ffcu r10 = defpackage.ffcu.a
            return r10
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yti.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.net.Uri r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yti.g(android.net.Uri, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r4.g(r0, r2) == r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.aiir r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yti.h(aiir, ffgu):java.lang.Object");
    }
}
