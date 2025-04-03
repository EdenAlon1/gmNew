package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecjh {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final dubl e;
    public final emyl f;
    public final emyl g;
    public final ffbr h;
    public final ecis i;
    public final emxc j;
    public final emxc k;
    public final emxc l;
    public final int m;

    public ecjh(Context context, emxc emxcVar, String str, ffbr ffbrVar, ecis ecisVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4) {
        this.a = context;
        this.h = ffbrVar;
        this.b = context.getPackageName();
        ActivityManager activityManager = echh.a;
        this.c = echh.c(context.getPackageName(), echh.b());
        if (emxcVar.g()) {
        }
        this.g = null;
        this.d = str;
        PackageManager packageManager = context.getPackageManager();
        this.m = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : packageManager.hasSystemFeature("android.hardware.type.watch") ? 3 : packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        this.e = new dubl(context);
        this.f = emys.a(new emyl() { // from class: ecjf
            @Override // defpackage.emyl
            public final Object get() {
                return Long.valueOf(ecjh.this.e.a().getTotalSpace() / 1024);
            }
        });
        this.i = ecisVar;
        this.j = emxcVar2;
        this.k = emxcVar3;
        this.l = emxcVar4;
    }
}
