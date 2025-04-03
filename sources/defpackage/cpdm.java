package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpdm {
    public static final emyl a = cfvl.y("split_external_intents");
    private final Context b;

    public cpdm(Context context) {
        this.b = context;
    }

    public final boolean a() {
        return ((Boolean) ((cfup) a.get()).e()).booleanValue() && this.b.getResources().getBoolean(R.bool.is_large_window_size_class_width);
    }
}
