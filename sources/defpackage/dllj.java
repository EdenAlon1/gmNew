package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dllj implements AutoCloseable, dlll {
    public static final Uri a = Uri.parse("content://com.google.android.gms.common.appdoctor/fixes");
    public final ContentProviderClient b;
    private final String c;

    public dllj(Context context) {
        ProviderInfo resolveContentProvider;
        PackageManager.ComponentInfoFlags of;
        this.c = context.getPackageName();
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            of = PackageManager.ComponentInfoFlags.of(0L);
            resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.common.appdoctor", of);
        } else {
            resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.common.appdoctor", 0);
        }
        if (resolveContentProvider == null || !emxb.a(resolveContentProvider.applicationInfo.packageName, "com.google.android.gms")) {
            throw new RemoteException("com.google.android.gms is not the authority.");
        }
        ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(a);
        if (acquireContentProviderClient == null) {
            throw new RemoteException("Unable to acquire ContentProviderClient");
        }
        this.b = acquireContentProviderClient;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.common.appdoctor.package_name", this.c);
        return bundle;
    }

    @Override // java.lang.AutoCloseable, defpackage.dlll
    public final void close() {
        this.b.release();
    }
}
