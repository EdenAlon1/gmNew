package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.appsettings.RcsMultiSimStatusCheckboxView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxbe implements fbba {
    public static RcsMultiSimStatusCheckboxView a(View view) {
        if (!(view instanceof RcsMultiSimStatusCheckboxView)) {
            throw new IllegalStateException(a.I(view, cxba.class, "Attempt to inject a View wrapper of type "));
        }
        RcsMultiSimStatusCheckboxView rcsMultiSimStatusCheckboxView = (RcsMultiSimStatusCheckboxView) view;
        rcsMultiSimStatusCheckboxView.getClass();
        return rcsMultiSimStatusCheckboxView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
