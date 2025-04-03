package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eua extends ffkk implements ffji {
    final /* synthetic */ eva a;
    final /* synthetic */ fhi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eua(eva evaVar, fhi fhiVar) {
        super(1);
        this.a = evaVar;
        this.b = fhiVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        KeyEvent keyEvent = ((iix) obj).a;
        boolean z = false;
        if (this.a.c() == eug.b && keyEvent.getKeyCode() == 4 && iiy.a(iiz.a(keyEvent), 1)) {
            this.b.h(null);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
