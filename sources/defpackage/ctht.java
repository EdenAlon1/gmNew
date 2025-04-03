package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctht implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer");
    public Looper c;
    public final Context d;
    public cthq e;
    public cths f;
    public MediaPlayer h;
    public AudioManager i;
    public final LinkedList b = new LinkedList();
    public final Object g = new Object();
    public int j = 2;

    public ctht(Context context) {
        this.d = context;
    }

    public final void a(cthr cthrVar) {
        this.b.add(cthrVar);
        if (this.e == null) {
            cthq cthqVar = new cthq(this);
            this.e = cthqVar;
            cthqVar.start();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        AudioManager audioManager = this.i;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(null);
        }
        synchronized (this.b) {
            if (this.b.isEmpty()) {
                synchronized (this.g) {
                    Looper looper = this.c;
                    if (looper != null) {
                        looper.quit();
                    }
                    this.f = null;
                }
            }
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        ensk j = a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer", "onError", 277, "NotificationPlayer.java")).u("NotificationPlayer failed: error type: %d, extra code: %d", i, i2);
        return false;
    }
}
