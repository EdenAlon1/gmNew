package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llp {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Activity activity, lki lkiVar) {
        lkiVar.getClass();
        if (activity instanceof lkw) {
            ((lkw) activity).a().e(lkiVar);
        } else if (activity instanceof lkr) {
            lkk P = ((lkr) activity).P();
            if (P instanceof lkv) {
                ((lkv) P).e(lkiVar);
            }
        }
    }

    public static final void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            llq llqVar = llr.Companion;
            llq.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new lls(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
