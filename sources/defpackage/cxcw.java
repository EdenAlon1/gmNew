package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxcw implements fbba {
    public static RcsSimStatusView a(View view) {
        if (!(view instanceof RcsSimStatusView)) {
            throw new IllegalStateException(a.I(view, cxct.class, "Attempt to inject a View wrapper of type "));
        }
        RcsSimStatusView rcsSimStatusView = (RcsSimStatusView) view;
        rcsSimStatusView.getClass();
        return rcsSimStatusView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
