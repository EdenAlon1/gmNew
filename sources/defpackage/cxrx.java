package defpackage;

import android.view.View;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxrx {
    public Runnable a;
    public Runnable b;
    protected cxrv c;
    private final BiConsumer d;

    public cxrx(BiConsumer biConsumer, cxrv cxrvVar) {
        this.c = cxrvVar;
        this.d = biConsumer;
        b(cxrvVar);
    }

    public abstract View a();

    public abstract void b(cxrv cxrvVar);

    public final void c(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    final void d(cxrv cxrvVar) {
        csjy.l("SimpleIcons", "Button " + a().getResources().getResourceEntryName(a().getId()) + " got state set to " + String.valueOf(cxrvVar) + ". Current was " + String.valueOf(this.c));
        if (this.c != cxrvVar) {
            b(cxrvVar);
            this.c = cxrvVar;
            this.d.accept(this, cxrvVar);
        }
    }
}
