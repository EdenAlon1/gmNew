package defpackage;

import android.view.View;
import com.google.android.apps.messaging.label.ui.recategorize.ChangeCategoryView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahks implements fbba {
    public static ChangeCategoryView a(View view) {
        if (!(view instanceof ChangeCategoryView)) {
            throw new IllegalStateException(a.I(view, ahko.class, "Attempt to inject a View wrapper of type "));
        }
        ChangeCategoryView changeCategoryView = (ChangeCategoryView) view;
        changeCategoryView.getClass();
        return changeCategoryView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
