package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewg extends ffkk implements ffji {
    final /* synthetic */ hyr a;
    final /* synthetic */ eva b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewg(hyr hyrVar, eva evaVar) {
        super(1);
        this.a = hyrVar;
        this.b = evaVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        KeyEvent keyEvent = ((iix) obj).a;
        InputDevice device = keyEvent.getDevice();
        boolean z = false;
        if (device != null && device.supportsSource(513) && !device.isVirtual() && iiy.a(iiz.a(keyEvent), 2) && keyEvent.getSource() != 257) {
            if (ewh.a(keyEvent, 19)) {
                z = this.a.b(5);
            } else if (ewh.a(keyEvent, 20)) {
                z = this.a.b(6);
            } else if (ewh.a(keyEvent, 21)) {
                z = this.a.b(3);
            } else if (ewh.a(keyEvent, 22)) {
                z = this.a.b(4);
            } else if (ewh.a(keyEvent, 23)) {
                jdt jdtVar = this.b.t;
                z = true;
                if (jdtVar != null) {
                    jdtVar.b();
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
