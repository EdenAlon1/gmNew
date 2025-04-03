package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsw implements ffji {
    final /* synthetic */ ffix a;

    public dmsw(ffix ffixVar) {
        this.a = ffixVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        KeyEvent keyEvent = ((iix) obj).a;
        keyEvent.getClass();
        if (iiw.a(iiz.b(keyEvent), iiw.n)) {
            this.a.invoke();
        }
        return false;
    }
}
