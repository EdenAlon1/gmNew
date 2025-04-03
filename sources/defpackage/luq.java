package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class luq {
    public final WeakReference a;
    final /* synthetic */ lut b;
    private final Executor c;

    public luq(lut lutVar, mxu mxuVar, Executor executor) {
        this.b = lutVar;
        this.a = new WeakReference(mxuVar);
        this.c = executor;
    }

    public final void a() {
        this.c.execute(new Runnable() { // from class: lup
            @Override // java.lang.Runnable
            public final void run() {
                luq luqVar = luq.this;
                mxu mxuVar = (mxu) luqVar.a.get();
                if (mxuVar != null) {
                    mxuVar.a.f(luqVar.b.a());
                }
            }
        });
    }
}
