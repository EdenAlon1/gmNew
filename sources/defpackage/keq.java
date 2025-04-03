package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class keq extends ffkk implements ffji {
    final /* synthetic */ kes a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public keq(kes kesVar) {
        super(1);
        this.a = kesVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final ffix ffixVar = (ffix) obj;
        Handler handler = this.a.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            ffixVar.invoke();
        } else {
            Handler handler2 = this.a.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: kep
                    @Override // java.lang.Runnable
                    public final void run() {
                        ffix.this.invoke();
                    }
                });
            }
        }
        return ffcu.a;
    }
}
