package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgmy {
    public final Context a;
    public final dlpw b;
    public final emyl c;

    public dgmy(final Context context, dlpw dlpwVar) {
        emyl a = emys.a(new emyl() { // from class: dgmv
            @Override // defpackage.emyl
            public final Object get() {
                dgmt dgmtVar = dgmu.a;
                Context context2 = context;
                if (dubc.d(context2)) {
                    dgmu.a.e("getAndroidId called in direct boot mode.", new Object[0]);
                    return emux.a;
                }
                PackageManager packageManager = context2.getPackageManager();
                String packageName = context2.getPackageName();
                if (packageManager.checkPermission("com.google.android.providers.gsf.permission.READ_GSERVICES", packageName) == 0) {
                    return emxc.j(Long.valueOf(digu.b(context2.getContentResolver(), "android_id", 0L)));
                }
                dgmu.a.e("app %s doesn't have gservice read permission", packageName);
                return emux.a;
            }
        });
        emys.a(new emyl() { // from class: dgmw
            @Override // defpackage.emyl
            public final Object get() {
                Context context2 = context;
                String string = Settings.Secure.getString(context2.getContentResolver(), "android_id");
                return (emxe.c(string) || "0".equals(string)) ? emux.a : dgxp.a(string, context2.getPackageName());
            }
        });
        this.a = context;
        this.b = dlpwVar;
        this.c = a;
    }
}
