package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dteb implements MediaPlayer.OnCompletionListener {
    final /* synthetic */ ffrf a;

    public dteb(ffrf ffrfVar) {
        this.a = ffrfVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.a.i()) {
            this.a.w(ffcu.a);
        }
    }
}
