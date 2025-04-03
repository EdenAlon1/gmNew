package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxb {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public euxb(Context context) {
        this.a = context;
    }

    public static String e(eumr eumrVar) {
        String str = eumrVar.e().c;
        if (str != null) {
            return str;
        }
        String str2 = eumrVar.e().b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    private final PackageInfo g(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    private final synchronized void h() {
        PackageInfo g = g(this.a.getPackageName());
        if (g != null) {
            this.b = Integer.toString(g.versionCode);
            this.c = g.versionName;
        }
    }

    final synchronized int a() {
        PackageInfo g;
        if (this.d == 0 && (g = g("com.google.android.gms")) != null) {
            this.d = g.versionCode;
        }
        return this.d;
    }

    final synchronized int b() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        this.e = 2;
        return 2;
    }

    public final synchronized String c() {
        if (this.b == null) {
            h();
        }
        return this.b;
    }

    final synchronized String d() {
        if (this.c == null) {
            h();
        }
        return this.c;
    }

    final boolean f() {
        return b() != 0;
    }
}
