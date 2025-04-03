package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhq implements dcbb {
    final /* synthetic */ uhs a;

    public uhq(uhs uhsVar) {
        this.a = uhsVar;
    }

    @Override // defpackage.dcbb
    public final void D(CustomizationModel customizationModel) {
        uhs uhsVar = this.a;
        if (uhsVar.n != null && customizationModel.b) {
            uhsVar.e.a(customizationModel);
            uhs uhsVar2 = this.a;
            uhsVar2.n.g(customizationModel, uhsVar2.m, uhsVar2.l());
        }
        ContentGridView contentGridView = this.a.q;
        if (contentGridView != null) {
            contentGridView.a();
        }
    }
}
