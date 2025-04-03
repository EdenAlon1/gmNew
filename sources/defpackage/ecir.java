package defpackage;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecir {
    public final emyl a;

    public ecir(final Context context) {
        this.a = emys.a(new emyl() { // from class: eciq
            @Override // defpackage.emyl
            public final Object get() {
                InstallSourceInfo installSourceInfo;
                String installingPackageName;
                if (Build.VERSION.SDK_INT < 30) {
                    return emux.a;
                }
                Context context2 = context;
                try {
                    installSourceInfo = context2.getPackageManager().getInstallSourceInfo(context2.getPackageName());
                    installingPackageName = installSourceInfo.getInstallingPackageName();
                    return emxc.i(installingPackageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return emux.a;
                }
            }
        });
    }
}
