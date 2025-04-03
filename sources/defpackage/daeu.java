package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.debug.DebugPrefsItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daeu implements fbba {
    public static DebugPrefsItemView a(View view) {
        if (!(view instanceof DebugPrefsItemView)) {
            throw new IllegalStateException(a.I(view, daer.class, "Attempt to inject a View wrapper of type "));
        }
        DebugPrefsItemView debugPrefsItemView = (DebugPrefsItemView) view;
        debugPrefsItemView.getClass();
        return debugPrefsItemView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
