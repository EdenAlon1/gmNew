package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avin implements avij {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/business/RbmWebviewHelperImpl");
    public final ffbr b;
    private final Context c;
    private final ffsk d;
    private final ffbr e;

    public avin(Context context, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar2.getClass();
        this.c = context;
        this.d = ffskVar;
        this.b = ffbrVar;
        this.e = ffbrVar2;
    }

    @Override // defpackage.avij
    public final Object a(String str, String str2, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d.hT()), new avil(null, str2, this, str), ffguVar);
    }

    public final afh b(String str) {
        String upperCase;
        float f;
        DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        if (str != null) {
            try {
                upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } catch (IllegalArgumentException unused) {
                ((enrr) a.j().h("com/google/android/apps/messaging/shared/business/RbmWebviewHelperImpl", "getCustomTabsIntent", 66, "RbmWebviewHelperImpl.kt")).t("Invalid view mode: %s, default to full view.", str);
                f = 1.0f;
            }
        } else {
            upperCase = "FULL";
        }
        avik avikVar = avik.a;
        f = ((avik) Enum.valueOf(avik.class, upperCase)).d;
        float f2 = displayMetrics.heightPixels;
        afg afgVar = new afg();
        afgVar.a.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", true != ((crjx) this.e.b()).g() ? 1 : 2);
        afgVar.e();
        afgVar.d(1);
        afgVar.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        afgVar.a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", true);
        if (f > 1.0f) {
            int i = (int) (f2 / f);
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            afgVar.a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
            afgVar.a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 1);
        }
        return afgVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, java.lang.String r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.avim
            if (r0 == 0) goto L13
            r0 = r8
            avim r0 = (defpackage.avim) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avim r0 = new avim
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L5c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            afh r7 = r5.b(r7)
            android.content.Intent r7 = r7.a
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r7.setData(r6)
            ffbr r6 = r5.b
            java.lang.Object r6 = r6.b()
            aigz r6 = (defpackage.aigz) r6
            aiir r8 = new aiir
            ael r2 = new ael
            r2.<init>()
            java.lang.String r4 = "RbmWebviewCustomTabs"
            r8.<init>(r4, r2, r7)
            r0.c = r3
            java.lang.Object r8 = r6.f(r8, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            ade r8 = (defpackage.ade) r8
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avin.c(java.lang.String, java.lang.String, ffgu):java.lang.Object");
    }
}
