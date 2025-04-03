package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctde implements MediaPlayer.OnCompletionListener {
    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        ctef.b(mediaPlayer);
    }
}
