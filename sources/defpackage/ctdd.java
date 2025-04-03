package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctdd implements MediaPlayer.OnPreparedListener {
    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.seekTo(0);
        mediaPlayer.start();
    }
}
