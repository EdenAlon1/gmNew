package defpackage;

import android.widget.CompoundButton;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcbj implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ dcbl b;

    public dcbj(dcbl dcblVar, int i) {
        this.a = i;
        this.b = dcblVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        eymq eymqVar = z ? eymq.VISIBLE : eymq.INVISIBLE;
        dcbl dcblVar = this.b;
        int i = this.a;
        CustomizationModel customizationModel = dcblVar.a;
        eymo createBuilder = eymp.a.createBuilder((eymp) customizationModel.a.get(i));
        createBuilder.copyOnWrite();
        ((eymp) createBuilder.instance).c = eymqVar.a();
        customizationModel.a.set(i, createBuilder.build());
        customizationModel.c();
        customizationModel.b = true;
    }
}
