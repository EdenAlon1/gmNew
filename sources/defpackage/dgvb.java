package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgvb implements dgvc {
    private static final Object a = new Object();
    private static DynamiteModule b = null;
    private static boolean c = false;

    public dgvb(Context context) {
    }

    private static void b(Context context, boolean z) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        synchronized (a) {
            if (c) {
                return;
            }
            Intent putExtra = new Intent("com.google.android.gms.learning.REQUEST_FULL_FEATURE").setPackage("com.google.android.gms").putExtra("requester_package", context.getPackageName()).putExtra("module_loaded_successfully", z);
            if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(putExtra);
            } else {
                makeBasic = BroadcastOptions.makeBasic();
                shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                bundle = shareIdentityEnabled.toBundle();
                context.sendBroadcast(putExtra, null, bundle);
            }
        }
    }

    @Override // defpackage.dgvc
    public final IInterface a(Context context, String str, dgve dgveVar) {
        DynamiteModule dynamiteModule;
        try {
            synchronized (a) {
                if (b == null) {
                    try {
                        b = DynamiteModule.d(context, DynamiteModule.a, "com.google.android.gms.brella_dynamite");
                        b(context, true);
                    } catch (dggy e) {
                        b(context, false);
                        c = true;
                        throw e;
                    }
                }
                dynamiteModule = b;
            }
            IBinder c2 = dynamiteModule.c(str);
            IInterface a2 = c2 == null ? null : dgveVar.a(c2);
            if (a2 != null) {
                return a2;
            }
            throw new dgvd("null impl for ".concat(str));
        } catch (dggy e2) {
            throw new dgvd("Couldn't load impl " + str + ": " + e2.getMessage(), e2);
        }
    }
}
