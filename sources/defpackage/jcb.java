package defpackage;

import android.view.Choreographer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcb implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ jcc a;

    public jcb(jcc jccVar) {
        this.a = jccVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d.removeCallbacks(this);
        this.a.b();
        jcc jccVar = this.a;
        synchronized (jccVar.e) {
            if (jccVar.h) {
                jccVar.h = false;
                List list = jccVar.f;
                jccVar.f = jccVar.g;
                jccVar.g = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
        jcc jccVar = this.a;
        synchronized (jccVar.e) {
            if (jccVar.f.isEmpty()) {
                jccVar.c.removeFrameCallback(this);
                jccVar.h = false;
            }
        }
    }
}
