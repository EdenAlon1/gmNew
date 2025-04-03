package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuav extends cuax {
    public static final cskc a = cskc.g("Bugle", "CsApkPackageUidUpdater");
    public cuat b;
    public elbx c;
    public errl d;

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.c.b("CsApkPackageUidUpdater Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.CsApkPackageUpdated.Latency";
    }

    @Override // defpackage.cnhy
    public final elfl j(Context context, final Intent intent) {
        return elfo.f(new Runnable() { // from class: cuau
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2 = intent;
                if (intent2 == null) {
                    return;
                }
                cuav cuavVar = cuav.this;
                String action = intent2.getAction();
                if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_CHANGED".equals(action) || "android.intent.action.PACKAGE_REPLACED".equals(action)) {
                    Uri data = intent2.getData();
                    if (data == null || !"package:com.google.android.ims".equals(data.toString())) {
                        return;
                    }
                    cuav.a.p("CarrierServices APK package change detected, updating Bugle's verified uids cache");
                    cuavVar.b.a();
                    return;
                }
                if ("android.intent.action.UID_REMOVED".equals(action)) {
                    int intExtra = intent2.getIntExtra("android.intent.extra.UID", -1);
                    csjb a2 = cuav.a.a();
                    a2.I("UID has been removed from the system");
                    a2.y("uid", intExtra);
                    a2.r();
                    if (intExtra != -1) {
                        cuat cuatVar = cuavVar.b;
                        synchronized (cuatVar.b) {
                            if (cuatVar.d.remove(Integer.valueOf(intExtra))) {
                                csjb a3 = cuat.a.a();
                                a3.I("Removed Bugle verified uid");
                                a3.y("uid", intExtra);
                                a3.r();
                            }
                        }
                    }
                }
            }
        }, this.d);
    }
}
