package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kor {
    public static int a(Context context, String str, int i, int i2, String str2) {
        int a;
        String opPackageName;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid != i2 || !Objects.equals(packageName, str2)) {
            a = klp.a(context, permissionToOp, str2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            a = klo.a(appOpsManager, permissionToOp, Binder.getCallingUid(), str2);
            if (a == 0) {
                opPackageName = context.getOpPackageName();
                a = klo.a(appOpsManager, permissionToOp, i2, opPackageName);
            }
        } else {
            a = klp.a(context, permissionToOp, str2);
        }
        return a == 0 ? 0 : -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
