package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsu {
    public static final enru a = enru.c("com/google/android/apps/messaging/dittosatellite/intent/DraftMessageJsBridgeRequestSender");
    public static final cskc b = cskc.g("Bugle", "DraftMessageJsBridgeRequestSender");
    public final Context c;
    public final ffhd d;
    public final ffsk e;
    private final ffhd f;
    private final ffbr g;
    private final ffbr h;

    public acsu(Context context, ffhd ffhdVar, ffhd ffhdVar2, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2) {
        context.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.c = context;
        this.d = ffhdVar;
        this.f = ffhdVar2;
        this.e = ffskVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
    }

    public static final boolean c(Intent intent) {
        return intent != null && ffkj.e("ForwardDraftIntentToDittoAction", intent.getAction());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5 A[LOOP:0: B:11:0x00bf->B:13:0x00c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Intent r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acsu.a(android.content.Intent, ffgu):java.lang.Object");
    }

    public final void b(esnk esnkVar) {
        actj a2 = ((actk) this.h.b()).a();
        a2.d = true;
        a2.d(acua.FOREGROUND, esnkVar);
    }
}
