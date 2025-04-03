package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpfw implements cnjs, cnjx, cfug, cnjv {
    private static final entd a = entd.c("BugleRcsProvisioning");
    private final Context b;
    private final errl c;
    private final dikg d;

    public cpfw(Context context, errl errlVar, dikg dikgVar, cfud cfudVar) {
        this.b = context;
        this.c = errlVar;
        this.d = dikgVar;
        cfudVar.c(new diyo() { // from class: cpfv
            @Override // defpackage.diyo
            public final void onCsLibPhenotypeUpdated() {
                cpfw.this.c();
            }
        });
    }

    @Override // defpackage.cnjs
    public final void a() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/systembinding/BugleSystemBindingManager", "onBootComplete", 83, "BugleSystemBindingManager.java")).q("BugleSystemBindingManager: onBootComplete");
        c();
    }

    @Override // defpackage.cnjx
    public final void b() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/systembinding/BugleSystemBindingManager", "onPackageReplaced", 89, "BugleSystemBindingManager.java")).q("BugleSystemBindingManager: onPackageReplace");
        c();
    }

    final void c() {
        final Context context = this.b;
        final dikg dikgVar = this.d;
        if (dkuy.e(context)) {
            dikgVar.d(context, 6);
        }
        errl errlVar = this.c;
        elfl.g(errlVar.submit(new Runnable() { // from class: dihr
            @Override // java.lang.Runnable
            public final void run() {
                dkvx.a();
                Context context2 = context;
                boolean e = dkuy.e(context2);
                context2.getPackageManager().setComponentEnabledSetting(new ComponentName(context2, "com.google.android.ims.binding.SystemBindingService"), true != e ? 2 : 1, 1);
                dkty.l(diht.a, "SystemBinding enabled: %b", Boolean.valueOf(e));
                int i = true != e ? 1 : 2;
                dikg dikgVar2 = dikgVar;
                if (i - 1 != 0) {
                    dikgVar2.d(context2, 4);
                } else {
                    dikgVar2.d(context2, 5);
                }
            }
        }, null)).k(new dihs(), errlVar);
    }

    @Override // defpackage.cnjv
    public final elfl fM(boolean z) {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/systembinding/BugleSystemBindingManager", "onDefaultSmsAppChange", 106, "BugleSystemBindingManager.java")).t("BugleSystemBindingManager: onDefaultSmsAppChange; isDefaultSmsApp: %b", Boolean.valueOf(z));
        c();
        return elfo.e(null);
    }

    @Override // defpackage.cfug
    public final boolean ge() {
        return true;
    }

    @Override // defpackage.cfug
    public final void gg() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/systembinding/BugleSystemBindingManager", "onBuglePhenotypeFlagChanged", 100, "BugleSystemBindingManager.java")).q("BugleSystemBindingManager: onBuglePhenotypeFlagChanged");
        c();
    }
}
