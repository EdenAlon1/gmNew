package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcne implements ellh {
    final /* synthetic */ dcnd a;

    public dcne(dcnd dcndVar) {
        this.a = dcndVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        MediaViewerPrimaryButtonEvent mediaViewerPrimaryButtonEvent = (MediaViewerPrimaryButtonEvent) ellfVar;
        boolean booleanValue = ((Boolean) dcut.a.e()).booleanValue();
        dcnd dcndVar = this.a;
        if (booleanValue && dcndVar.Z != null) {
            dctl dctlVar = dcndVar.Y;
            if (dctlVar != null) {
                dctlVar.H().C(5);
            }
            dcndVar.Z.o(mediaViewerPrimaryButtonEvent.a);
        } else if (dcndVar.aa != null) {
            dctl dctlVar2 = dcndVar.Y;
            if (dctlVar2 != null) {
                dctlVar2.H().C(5);
            }
            dcndVar.aa.run();
        }
        return elli.a;
    }
}
