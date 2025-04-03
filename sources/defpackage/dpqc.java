package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpqc implements ffji {
    final /* synthetic */ ffix a;

    public dpqc(ffix ffixVar) {
        this.a = ffixVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        boolean z;
        KeyEvent keyEvent = ((iix) obj).a;
        keyEvent.getClass();
        if (iiw.a(iiz.b(keyEvent), iiw.j) || iiw.a(iiz.b(keyEvent), iiw.i)) {
            this.a.invoke();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
