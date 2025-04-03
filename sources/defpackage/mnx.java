package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mnx {
    final /* synthetic */ mny a;

    public mnx(mny mnyVar) {
        this.a = mnyVar;
    }

    public final void a(final Exception exc) {
        luj.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        final mmq mmqVar = this.a.j;
        Handler handler = mmqVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mml
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mlh mlhVar = (mlh) mmq.this.b.a.j;
                    mlhVar.J(mlhVar.I(), 1014, new lud() { // from class: mlb
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }
}
