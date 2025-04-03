package defpackage;

import android.view.View;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wei implements fbba {
    public static SimPickerItemView a(View view) {
        if (!(view instanceof SimPickerItemView)) {
            throw new IllegalStateException(a.I(view, wef.class, "Attempt to inject a View wrapper of type "));
        }
        SimPickerItemView simPickerItemView = (SimPickerItemView) view;
        simPickerItemView.getClass();
        return simPickerItemView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
