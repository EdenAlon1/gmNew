package defpackage;

import android.view.View;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicConversationDataView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adym implements fbba {
    public static ProblematicConversationDataView a(View view) {
        if (!(view instanceof ProblematicConversationDataView)) {
            throw new IllegalStateException(a.I(view, adyj.class, "Attempt to inject a View wrapper of type "));
        }
        ProblematicConversationDataView problematicConversationDataView = (ProblematicConversationDataView) view;
        problematicConversationDataView.getClass();
        return problematicConversationDataView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
