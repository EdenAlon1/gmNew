package defpackage;

import android.media.MediaPlayer;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ctdq implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ cteb a;
    public final /* synthetic */ kfb b;
    public final /* synthetic */ cxrj c;

    public /* synthetic */ ctdq(cteb ctebVar, cxrj cxrjVar, kfb kfbVar) {
        this.a = ctebVar;
        this.c = cxrjVar;
        this.b = kfbVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, final int i, final int i2) {
        ((ensz) cteb.a.o().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getErrorListener", 231, "PlaybackSession.java")).u("Media player encountered an error: type = %d, code = %d", i, i2);
        cxrj cxrjVar = this.c;
        if (cxrjVar != null) {
            cxrjVar.a();
        }
        final kfb kfbVar = this.b;
        final cteb ctebVar = this.a;
        axnw.h(elfo.f(new Runnable() { // from class: ctdo
            @Override // java.lang.Runnable
            public final void run() {
                cteb.this.b();
                if (kfbVar.b(new ctcs(2, Optional.of(new ctct(i, i2))))) {
                    return;
                }
                ((ensz) cteb.a.n().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getErrorListener", 242, "PlaybackSession.java")).q("Media player encountered error before being released");
            }
        }, ctebVar.c));
        return true;
    }
}
