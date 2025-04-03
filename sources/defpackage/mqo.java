package defpackage;

import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqo implements mrb {
    public final emyl a;
    public final emyl b;

    public mqo(final int i) {
        emyl emylVar = new emyl() { // from class: mqm
            @Override // defpackage.emyl
            public final Object get() {
                return new HandlerThread(mqp.d(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        emyl emylVar2 = new emyl() { // from class: mqn
            @Override // defpackage.emyl
            public final Object get() {
                return new HandlerThread(mqp.d(i, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.a = emylVar;
        this.b = emylVar2;
    }
}
