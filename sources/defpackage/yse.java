package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yse {
    static final /* synthetic */ yse a = new yse();
    public static final enru b = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutHandler$Companion");

    private yse() {
    }

    public static final Object b(llv llvVar, String str, aigz aigzVar, String str2, ffix ffixVar, ffgu ffguVar) {
        if (!ffkj.e(llvVar.b(str), true)) {
            return null;
        }
        ffixVar.invoke();
        llvVar.d(str, false);
        return aigzVar.f(new ainc(str2), ffguVar);
    }

    public static final dsar c(final ysi ysiVar, final Context context) {
        return new dsar(ysiVar.a(), ysiVar.b(), ysiVar.c(), new ffji() { // from class: ysc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ensk e = yse.b.e();
                e.Y(ente.a, "BugleComposeRow2");
                enrr enrrVar = (enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutHandler$Companion", "getShortcutConfiguration$lambda$0", 168, "ShortcutHandler.kt");
                Context context2 = context;
                ysi ysiVar2 = ysiVar;
                enrrVar.t("Clicked on %s shortcut.", context2.getString(ysiVar2.a()));
                ysiVar2.d((View) obj);
                return ffcu.a;
            }
        }, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.llv r5, java.lang.String r6, defpackage.aigz r7, java.lang.String r8, defpackage.ffix r9, defpackage.ffgu r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof defpackage.ysd
            if (r0 == 0) goto L13
            r0 = r10
            ysd r0 = (defpackage.ysd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysd r0 = new ysd
            r0.<init>(r4, r10)
        L18:
            r10 = r0
            java.lang.Object r0 = r10.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r10.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r0)
            goto L3b
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            defpackage.ffci.b(r0)
            r10.c = r3
            java.lang.Object r0 = b(r5, r6, r7, r8, r9, r10)
            if (r0 == r1) goto L52
        L3b:
            ade r0 = (defpackage.ade) r0
            r5 = 0
            if (r0 == 0) goto L51
            android.content.Intent r6 = r0.b
            if (r6 == 0) goto L51
            int r7 = r0.a
            r8 = -1
            if (r7 != r8) goto L4a
            goto L4b
        L4a:
            r6 = r5
        L4b:
            if (r6 == 0) goto L51
            android.net.Uri r5 = r6.getData()
        L51:
            return r5
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yse.a(llv, java.lang.String, aigz, java.lang.String, ffix, ffgu):java.lang.Object");
    }
}
