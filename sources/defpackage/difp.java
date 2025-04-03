package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.wearable.internal.IWearableService;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class difp extends dfwc {
    private final died A;
    private final died B;
    private final died C;
    private final died D;
    private final died E;
    private final died F;
    private final digf G;
    public final ExecutorService a;
    public final emyl v;
    private final died w;
    private final died x;
    private final died y;
    private final died z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public difp(final Context context, Looper looper, dfrc dfrcVar, dfrd dfrdVar, dfvs dfvsVar) {
        super(context, looper, 14, dfvsVar, dfrcVar, dfrdVar);
        dgxv dgxvVar = dgxw.a;
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        digf a = digf.a(context);
        this.w = new died();
        this.x = new died();
        this.y = new died();
        this.z = new died();
        this.A = new died();
        this.B = new died();
        this.C = new died();
        this.D = new died();
        this.E = new died();
        this.F = new died();
        new died();
        new died();
        dfwv.n(unconfigurableExecutorService);
        this.a = unconfigurableExecutorService;
        this.G = a;
        this.v = emys.a(new emyl() { // from class: difn
            @Override // defpackage.emyl
            public final Object get() {
                dgwl dgwlVar = dgwj.a;
                File file = new File(dgwk.a(context.getFilesDir(), "wearos_assets"));
                dgwl dgwlVar2 = dgwj.a;
                File file2 = new File(dgwk.a(file, "streamtmp"));
                file2.mkdirs();
                File[] listFiles = file2.listFiles();
                if (listFiles != null) {
                    for (File file3 : listFiles) {
                        file3.delete();
                    }
                }
                return file2;
            }
        });
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final void C(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", a.h(i, "onPostInitHandler: statusCode "));
        }
        if (i == 0) {
            this.w.a(iBinder);
            this.x.a(iBinder);
            this.y.a(iBinder);
            this.A.a(iBinder);
            this.B.a(iBinder);
            this.C.a(iBinder);
            this.D.a(iBinder);
            this.E.a(iBinder);
            this.F.a(iBinder);
            this.z.a(iBinder);
            i = 0;
        }
        super.C(i, iBinder, bundle, i2);
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 8600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IWearableService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gK() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gL() {
        return dhzs.F;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final void l(dfvk dfvkVar) {
        if (!r()) {
            try {
                Bundle bundle = this.c.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    Log.w("WearableClient", a.h(i, "The Wear OS app is out of date. Requires API version 8600000 but found "));
                    Context context = this.c;
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    E(dfvkVar, 6, PendingIntent.getActivity(context, 0, intent, dgxs.a));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                E(dfvkVar, 16, null);
                return;
            }
        }
        super.l(dfvkVar);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final boolean r() {
        return !this.G.b();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String y() {
        return this.G.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }
}
