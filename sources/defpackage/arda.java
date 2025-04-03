package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Window;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class arda {
    public final Context a;
    public final errl b;
    public final arbs c;
    public final elbx d;
    public final Uri e;
    public final ffbr f;
    public MediaPlayer g;
    public final arcr k;
    public boolean h = false;
    private boolean l = false;
    public boolean i = false;
    public Duration j = Duration.ZERO;

    public arda(Context context, errl errlVar, arbs arbsVar, elbx elbxVar, ffbr ffbrVar, Uri uri, arcr arcrVar) {
        this.a = context;
        this.b = errlVar;
        this.c = arbsVar;
        this.d = elbxVar;
        this.f = ffbrVar;
        this.e = uri;
        this.k = arcrVar;
    }

    final Duration a() {
        MediaPlayer mediaPlayer;
        return (!this.h || (mediaPlayer = this.g) == null) ? Duration.ZERO : Duration.ofMillis(mediaPlayer.getCurrentPosition());
    }

    final Duration b() {
        MediaPlayer mediaPlayer;
        long j = -1;
        if (this.h && (mediaPlayer = this.g) != null) {
            j = mediaPlayer.getDuration();
        }
        return Duration.ofMillis(j);
    }

    final void c() {
        MediaPlayer mediaPlayer;
        if (!this.h || (mediaPlayer = this.g) == null) {
            this.i = false;
            return;
        }
        mediaPlayer.pause();
        arcr arcrVar = this.k;
        if (equals(arcrVar.a.f)) {
            arcs arcsVar = arcrVar.a;
            if (arcsVar.g != null) {
                ((alcg) arcsVar.c.b()).b(arcrVar.a.g(), b().toSeconds());
                arcrVar.a.f(new arcl(2, b(), a()));
                arcrVar.a.b();
            }
        }
        this.c.a();
    }

    final void d() {
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer == null || this.l) {
            return;
        }
        ctef.b(mediaPlayer);
        this.l = true;
        this.h = false;
        this.c.a();
    }

    final void e(Duration duration) {
        MediaPlayer mediaPlayer;
        if (!this.h || (mediaPlayer = this.g) == null) {
            this.j = duration;
        } else {
            mediaPlayer.seekTo((int) duration.toMillis());
        }
    }

    final void f() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        Window window;
        if (!this.h || this.g == null) {
            this.i = true;
            return;
        }
        arbs arbsVar = this.c;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = new AudioManager.OnAudioFocusChangeListener() { // from class: arct
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                arda ardaVar;
                arcr arcrVar = arda.this.k;
                if (i == -3 || i == -2) {
                    arda ardaVar2 = arcrVar.a.f;
                    if (ardaVar2 != null) {
                        ardaVar2.c();
                        return;
                    }
                    return;
                }
                if (i == -1) {
                    arcrVar.a.e();
                    return;
                }
                if ((i == 1 || i == 2 || i == 3 || i == 4) && (ardaVar = arcrVar.a.f) != null) {
                    ardaVar.f();
                }
            }
        };
        audioAttributes = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
        onAudioFocusChangeListener = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener2);
        build = onAudioFocusChangeListener.build();
        arbsVar.b = build;
        requestAudioFocus = arbsVar.a.requestAudioFocus(arbsVar.b);
        if (requestAudioFocus != 1) {
            arcr arcrVar = this.k;
            if (equals(arcrVar.a.f)) {
                arcs arcsVar = arcrVar.a;
                arcc arccVar = arcsVar.g;
                if (arccVar != null) {
                    arcsVar.c(arccVar, arce.a);
                }
                arcrVar.a.f(new arcl(2, b(), a()));
                ((ensz) ((ensz) arcs.a.h()).h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController$AudioControllerSessionStateChangeListener", "onAudioFocusRequestDenied", 364, "AudioAttachmentController.java")).q("Audio playback focus request denied.");
                return;
            }
            return;
        }
        this.g.start();
        arcr arcrVar2 = this.k;
        if (equals(arcrVar2.a.f)) {
            arcs arcsVar2 = arcrVar2.a;
            if (arcsVar2.g == null) {
                return;
            }
            ((alcg) arcsVar2.c.b()).c(arcrVar2.a.g(), b().toSeconds());
            arcrVar2.a.f(new arcl(1, b(), a()));
            eg G = arcrVar2.a.b.G();
            if (G == null || (window = G.getWindow()) == null) {
                return;
            }
            window.addFlags(128);
        }
    }

    final boolean g() {
        MediaPlayer mediaPlayer;
        return this.h && (mediaPlayer = this.g) != null && mediaPlayer.isPlaying();
    }
}
