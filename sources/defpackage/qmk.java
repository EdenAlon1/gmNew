package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmk extends qmi {
    public int a = 0;
    public IGetInstallReferrerService b;
    private final Context c;
    private final String d;
    private ServiceConnection e;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (defpackage.kqq.a("UpsideDownCake", r0) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qmk(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            android.content.Context r0 = r4.getApplicationContext()
            r3.c = r0
            int r0 = defpackage.kqq.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L27
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L4b
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r0.getClass()
            java.lang.String r2 = "UpsideDownCake"
            boolean r0 = defpackage.kqq.a(r2, r0)
            if (r0 == 0) goto L4b
        L27:
            int r0 = defpackage.aeb$$ExternalSyntheticApiModelOutline0.m(r1)
            r1 = 8
            if (r0 < r1) goto L4b
            boolean r0 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m462m$1()
            if (r0 == 0) goto L46
            java.lang.Class r0 = defpackage.aak$$ExternalSyntheticApiModelOutline0.m$7()
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.sdksandbox.sdkprovider.SdkSandboxController r4 = defpackage.aak$$ExternalSyntheticApiModelOutline0.m(r4)
            java.lang.String r4 = defpackage.agj$$ExternalSyntheticApiModelOutline0.m(r4)
            goto L4f
        L46:
            java.lang.String r4 = r4.getPackageName()
            goto L4f
        L4b:
            java.lang.String r4 = r4.getPackageName()
        L4f:
            r3.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmk.<init>(android.content.Context):void");
    }

    @Override // defpackage.qmi
    public final qml a() {
        if (!d()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.d);
        try {
            return new qml(this.b.getInstallReferrer(bundle));
        } catch (RemoteException e) {
            qmm.b("RemoteException getting install referrer information");
            this.a = 0;
            throw e;
        }
    }

    @Override // defpackage.qmi
    public final void b() {
        this.a = 3;
        if (this.e != null) {
            qmm.a("Unbinding from service.");
            this.c.unbindService(this.e);
            this.e = null;
        }
        this.b = null;
    }

    @Override // defpackage.qmi
    public final void c(allh allhVar) {
        if (d()) {
            qmm.a("Service connection is valid. No need to re-initialize.");
            allhVar.a(0);
            return;
        }
        int i = this.a;
        if (i == 1) {
            qmm.b("Client is already in the process of connecting to the service.");
            allhVar.a(3);
            return;
        }
        if (i == 3) {
            qmm.b("Client was already closed and can't be reused. Please create another instance.");
            allhVar.a(3);
            return;
        }
        qmm.a("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> queryIntentServices = this.c.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            ResolveInfo resolveInfo = queryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                String str = resolveInfo.serviceInfo.packageName;
                String str2 = resolveInfo.serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    try {
                        if (this.c.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                            Intent intent2 = new Intent(intent);
                            qmj qmjVar = new qmj(this, allhVar);
                            this.e = qmjVar;
                            try {
                                if (this.c.bindService(intent2, qmjVar, 1)) {
                                    qmm.a("Service was bonded successfully.");
                                    return;
                                }
                                qmm.b("Connection to service is blocked.");
                                this.a = 0;
                                allhVar.a(1);
                                return;
                            } catch (SecurityException unused) {
                                qmm.b("No permission to connect to service.");
                                this.a = 0;
                                allhVar.a(4);
                                return;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
                qmm.b("Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.a = 0;
                allhVar.a(2);
                return;
            }
        }
        this.a = 0;
        qmm.a("Install Referrer service unavailable on device.");
        allhVar.a(2);
    }

    public final boolean d() {
        return (this.a != 2 || this.b == null || this.e == null) ? false : true;
    }
}
