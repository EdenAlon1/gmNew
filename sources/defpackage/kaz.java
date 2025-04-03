package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kaz extends ffkk implements ffji {
    public static final kaz a = new kaz();

    public kaz() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        kbs kbsVar = (kbs) obj;
        Handler handler = kbsVar.getHandler();
        final ffix ffixVar = kbsVar.q;
        handler.post(new Runnable() { // from class: kay
            @Override // java.lang.Runnable
            public final void run() {
                ffix.this.invoke();
            }
        });
        return ffcu.a;
    }
}
