package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijc extends hvh implements ijb {
    public ffji a;
    public ffji b;

    public ijc(ffji ffjiVar, ffji ffjiVar2) {
        this.a = ffjiVar;
        this.b = ffjiVar2;
    }

    @Override // defpackage.ijb
    public final boolean u(KeyEvent keyEvent) {
        ffji ffjiVar = this.a;
        if (ffjiVar != null) {
            return ((Boolean) ffjiVar.invoke(new iix(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.ijb
    public final boolean v(KeyEvent keyEvent) {
        ffji ffjiVar = this.b;
        if (ffjiVar != null) {
            return ((Boolean) ffjiVar.invoke(new iix(keyEvent))).booleanValue();
        }
        return false;
    }
}
