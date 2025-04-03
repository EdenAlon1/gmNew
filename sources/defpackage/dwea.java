package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwea {
    private Choreographer.FrameCallback a;

    public abstract void a(long j);

    final Choreographer.FrameCallback b() {
        if (this.a == null) {
            this.a = new Choreographer.FrameCallback() { // from class: dwdz
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    dwea.this.a(j);
                }
            };
        }
        return this.a;
    }
}
