package defpackage;

import android.view.View;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wer implements fbba {
    public static SimPickerView a(View view) {
        if (!(view instanceof SimPickerView)) {
            throw new IllegalStateException(a.I(view, weo.class, "Attempt to inject a View wrapper of type "));
        }
        SimPickerView simPickerView = (SimPickerView) view;
        simPickerView.getClass();
        return simPickerView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
