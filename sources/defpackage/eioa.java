package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eioa extends Fragment {
    public static final String a = "eioa";
    private MetricKey b;
    private long c;
    private long d = 0;

    public eioa() {
        setRetainInstance(true);
    }

    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.b = MetricKey.b("ScreenDuration", getActivity());
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        Activity activity = getActivity();
        MetricKey metricKey = this.b;
        long millis = TimeUnit.NANOSECONDS.toMillis(this.d);
        int i = eioo.a;
        eioc.c(activity, "Context cannot be null.");
        eioc.c(metricKey, "Timer name cannot be null.");
        eioc.a(millis >= 0, "Duration cannot be negative.");
        eiof a2 = eiof.a(activity);
        Bundle bundle = new Bundle();
        bundle.putParcelable("MetricKey_bundle", MetricKey.a(metricKey));
        bundle.putLong("timeMillis", millis);
        a2.d(2, bundle);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        this.d += System.nanoTime() - this.c;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.c = System.nanoTime();
        if (Build.VERSION.SDK_INT >= 29) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putLong("onScreenResume", System.nanoTime());
            eioo.a(getActivity(), CustomEvent.b(MetricKey.b("ScreenActivity", getActivity()), persistableBundle));
        }
    }
}
