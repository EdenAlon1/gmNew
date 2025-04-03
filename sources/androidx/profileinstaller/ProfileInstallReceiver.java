package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import defpackage.oos;
import defpackage.ooz;
import defpackage.ope;
import defpackage.opf;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    static void a(int i, ope opeVar) {
        Process.sendSignal(i, 10);
        opeVar.a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        Context createDeviceProtectedStorageContext;
        File codeCacheDir;
        Context createDeviceProtectedStorageContext2;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            opf.c(context, new Executor() { // from class: ooy
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new ooz(this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        Executor executor = new Executor() { // from class: ooy
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        };
                        ooz oozVar = new ooz(this);
                        ope opeVar = opf.a;
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        opf.b(executor, oozVar, 11, null);
                        return;
                    }
                    return;
                }
                Executor executor2 = new Executor() { // from class: ooy
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                };
                ooz oozVar2 = new ooz(this);
                ope opeVar2 = opf.a;
                try {
                    opf.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    opf.b(executor2, oozVar2, 10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    opf.b(executor2, oozVar2, 7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            a(Process.myPid(), new ooz(this));
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        ooz oozVar3 = new ooz(this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            if ("SAVE_PROFILE".equals(string2)) {
                a(extras.getInt("EXTRA_PID", Process.myPid()), oozVar3);
                return;
            } else {
                oozVar3.a(16, null);
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            createDeviceProtectedStorageContext2 = context.createDeviceProtectedStorageContext();
            codeCacheDir = createDeviceProtectedStorageContext2.getCacheDir();
        } else {
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
        }
        if (oos.a(codeCacheDir)) {
            oozVar3.a(14, null);
        } else {
            oozVar3.a(15, null);
        }
    }
}
