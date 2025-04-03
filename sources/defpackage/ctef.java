package defpackage;

import android.media.MediaPlayer;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctef {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/media/common/MediaPlayerManager");
    private static final Set b = DesugarCollections.synchronizedSet(new HashSet());

    public static MediaPlayer a() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        b.add(mediaPlayer);
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/media/common/MediaPlayerManager", "create", 38, "MediaPlayerManager.java")).r("MediaPlayerManager: created %d", mediaPlayer.hashCode());
        return mediaPlayer;
    }

    public static void b(MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.release();
        emxf.l(b.remove(mediaPlayer));
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/media/common/MediaPlayerManager", "release", 48, "MediaPlayerManager.java")).r("MediaPlayerManager: released %d", mediaPlayer.hashCode());
    }
}
