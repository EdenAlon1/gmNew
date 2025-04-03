package defpackage;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cthq extends Thread {
    final /* synthetic */ ctht a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cthq(ctht cthtVar) {
        super("NotificationPlayer-Bugle");
        this.a = cthtVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        cthr cthrVar;
        while (true) {
            synchronized (this.a.b) {
                cthrVar = (cthr) this.a.b.removeFirst();
            }
            int i = cthrVar.a;
            if (i == 1) {
                ctht cthtVar = this.a;
                try {
                    synchronized (cthtVar.g) {
                        Looper looper = cthtVar.c;
                        if (looper != null && looper.getThread().getState() != Thread.State.TERMINATED) {
                            cthtVar.c.quit();
                        }
                        cthtVar.f = new cths(cthtVar, cthrVar);
                        synchronized (cthtVar.f) {
                            cthtVar.f.start();
                            cthtVar.f.wait();
                        }
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - cthrVar.d;
                    if (elapsedRealtime > 1000) {
                        ensk j = ctht.a.j();
                        j.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer", "startSound", 181, "NotificationPlayer.java")).s("Notification sound delayed by %dmsecs", elapsedRealtime);
                    }
                } catch (Exception e) {
                    ensk j2 = ctht.a.j();
                    j2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j2).g(e)).h("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer", "startSound", 184, "NotificationPlayer.java")).t("error loading sound for %s", cthrVar.b);
                }
            } else if (i == 2) {
                ctht cthtVar2 = this.a;
                if (cthtVar2.h != null) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - cthrVar.d;
                    if (elapsedRealtime2 > 1000) {
                        ensk j3 = ctht.a.j();
                        j3.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer", "stopSound", 194, "NotificationPlayer.java")).s("Notification stop delayed by %dmsecs", elapsedRealtime2);
                    }
                    MediaPlayer mediaPlayer = cthtVar2.h;
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        ctef.b(cthtVar2.h);
                    }
                    cthtVar2.h = null;
                    AudioManager audioManager = cthtVar2.i;
                    if (audioManager != null) {
                        audioManager.abandonAudioFocus(null);
                    }
                    cthtVar2.i = null;
                    Looper looper2 = cthtVar2.c;
                    if (looper2 != null && looper2.getThread().getState() != Thread.State.TERMINATED) {
                        cthtVar2.c.quit();
                    }
                }
            }
            synchronized (this.a.b) {
                if (this.a.b.isEmpty()) {
                    this.a.e = null;
                    return;
                }
            }
        }
    }
}
