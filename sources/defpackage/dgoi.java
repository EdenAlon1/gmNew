package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgoi extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ dgoj b;

    public dgoi(dgoj dgojVar, WeakReference weakReference) {
        this.a = weakReference;
        this.b = dgojVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onTogglingPipProcessed(TogglingData togglingData) {
        final Activity activity = (Activity) this.a.get();
        if (activity == null) {
            this.b.j(dgom.a);
            return;
        }
        if (!TextUtils.isEmpty(togglingData.b)) {
            togglingData.c = dgor.a(activity);
        }
        final Intent putExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_TOGGLING_DATA", togglingData).putExtra("EXTRA_START_TICK", System.nanoTime());
        new dgxx(Looper.getMainLooper()).post(new Runnable() { // from class: dgoh
            @Override // java.lang.Runnable
            public final void run() {
                activity.startActivityForResult(putExtra, 123);
            }
        });
        this.b.l(Status.a);
    }
}
