package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcbi extends aag {
    final /* synthetic */ dcbl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcbi(dcbl dcblVar) {
        super(3, 0);
        this.c = dcblVar;
    }

    @Override // defpackage.aac
    public final boolean m(RecyclerView recyclerView, wr wrVar, wr wrVar2) {
        dcbl dcblVar = this.c;
        int fr = wrVar.fr();
        int fr2 = wrVar2.fr();
        if (fr >= 0 && fr2 >= 0) {
            CustomizationModel customizationModel = dcblVar.a;
            if (fr < customizationModel.a() && fr2 < customizationModel.a() && fr != fr2) {
                eymp b = customizationModel.b(fr);
                customizationModel.a.remove(fr);
                customizationModel.a.add(fr2, b);
                customizationModel.c();
                customizationModel.b = true;
            }
        }
        dcblVar.q(fr);
        dcblVar.q(fr2);
        dcblVar.t(fr, fr2);
        return true;
    }

    @Override // defpackage.aac
    public final void i(wr wrVar, int i) {
    }
}
