package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.setupcompat.logging.CustomEvent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eioo {
    public static final /* synthetic */ int a = 0;

    static {
        new eipn("SetupMetricsLogger");
    }

    public static void a(Context context, CustomEvent customEvent) {
        eioc.c(context, "Context cannot be null.");
        eiof a2 = eiof.a(context);
        Bundle bundle = new Bundle();
        bundle.putParcelable("CustomEvent_bundle", CustomEvent.a(customEvent));
        a2.d(1, bundle);
    }
}
