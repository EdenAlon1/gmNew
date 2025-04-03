package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cths extends Thread {
    public final cthr a;
    final /* synthetic */ ctht b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cths(ctht cthtVar, cthr cthrVar) {
        super("CreationAndCompletionThread");
        this.b = cthtVar;
        this.a = cthrVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String encodedPath;
        AudioFocusRequest build;
        Looper.prepare();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.b.c = myLooper;
        synchronized (this) {
            AudioManager audioManager = (AudioManager) this.b.d.getSystemService("audio");
            MediaPlayer a = ctef.a();
            try {
                a.setAudioAttributes(new AudioAttributes.Builder().setUsage(8).build());
                a.setDataSource(this.b.d, this.a.b);
                a.setLooping(false);
                float f = this.a.c;
                a.setVolume(f, f);
                a.prepare();
                Uri uri = this.a.b;
                if (uri != null && (encodedPath = uri.getEncodedPath()) != null && encodedPath.length() > 0) {
                    AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(3);
                    builder.setAudioAttributes(new AudioAttributes.Builder().setUsage(8).build());
                    build = builder.build();
                    audioManager.requestAudioFocus(build);
                }
                a.setOnCompletionListener(this.b);
                a.setOnErrorListener(this.b);
                a.start();
                MediaPlayer mediaPlayer = this.b.h;
                if (mediaPlayer != null) {
                    ctef.b(mediaPlayer);
                }
                this.b.h = a;
                this.a.e.set(null);
            } catch (Exception e) {
                ensk j = ctht.a.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/util/notifications/NotificationPlayer$CreationAndCompletionThread", "run", 142, "NotificationPlayer.java")).t("error loading sound for %s", this.a.b);
                ctef.b(a);
                this.a.e.setException(e);
            }
            this.b.i = audioManager;
            notify();
        }
        Looper.loop();
    }
}
