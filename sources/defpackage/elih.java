package defpackage;

import android.app.Activity;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elih {
    public final efac a;
    public final elka b;

    public elih(Activity activity) {
        this.a = (efac) activity;
        try {
            this.b = (elka) ProtoParsers.d(activity.getIntent().getExtras(), "trace_waterfall", elka.a, eyfc.a());
        } catch (eygu e) {
            throw new RuntimeException(e);
        }
    }
}
