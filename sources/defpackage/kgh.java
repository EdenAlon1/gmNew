package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kgh extends ffkk implements ffji {
    final /* synthetic */ kgj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgh(kgj kgjVar) {
        super(1);
        this.a = kgjVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final ffix ffixVar = (ffix) obj;
        if (ffkj.e(Looper.myLooper(), Looper.getMainLooper())) {
            ffixVar.invoke();
        } else {
            Handler handler = this.a.b;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                this.a.b = handler;
            }
            handler.post(new Runnable() { // from class: kgg
                @Override // java.lang.Runnable
                public final void run() {
                    ffix.this.invoke();
                }
            });
        }
        return ffcu.a;
    }
}
