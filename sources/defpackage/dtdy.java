package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtdy implements dtds {
    public static final enru a = enru.c("com/google/android/libraries/compose/voice/audioplayer/AudioPlayerImpl");
    private static final AudioAttributes h = new AudioAttributes.Builder().setContentType(2).setUsage(1).build();
    public final fgcm b;
    public final fgcm c;
    public final fgcm d;
    public final fgdj e;
    public final fgdj f;
    public final fgdj g;
    private final Context i;
    private final ffsk j;
    private final ffbz k;
    private ffud l;

    public dtdy(Context context, ffsk ffskVar) {
        context.getClass();
        ffskVar.getClass();
        this.i = context;
        this.j = ffskVar;
        this.k = ffca.a(new ffix() { // from class: dtdw
            @Override // defpackage.ffix
            public final Object invoke() {
                enru enruVar = dtdy.a;
                return new MediaPlayer();
            }
        });
        fgcm a2 = fgdm.a(false);
        this.b = a2;
        fgcm a3 = fgdm.a(false);
        this.c = a3;
        fgcm a4 = fgdm.a(Duration.ZERO);
        this.d = a4;
        this.e = new fgco(a2);
        this.f = new fgco(a3);
        this.g = new fgco(a4);
    }

    @Override // defpackage.dtds
    public final void a() {
        if (!((Boolean) this.b.c()).booleanValue() || !((Boolean) this.c.c()).booleanValue()) {
            ((enrr) a.j().h("com/google/android/libraries/compose/voice/audioplayer/AudioPlayerImpl", "pause", 81, "AudioPlayerImpl.kt")).I("Failed to pause audio file, isPrepared: %b, isPlaying: %b", ((Boolean) this.b.c()).booleanValue(), ((Boolean) this.c.c()).booleanValue());
            return;
        }
        e().pause();
        this.c.f(false);
        f();
    }

    @Override // defpackage.dtds
    public final void b() {
        if (!((Boolean) this.b.c()).booleanValue() || ((Boolean) this.c.c()).booleanValue()) {
            ((enrr) a.j().h("com/google/android/libraries/compose/voice/audioplayer/AudioPlayerImpl", "play", 65, "AudioPlayerImpl.kt")).I("Failed to play audio file, isPrepared: %b, isPlaying: %b", ((Boolean) this.b.c()).booleanValue(), ((Boolean) this.c.c()).booleanValue());
            return;
        }
        e().start();
        this.c.f(true);
        ffud ffudVar = this.l;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.l = ffqy.d(this.j, null, null, new dtdx(this, null), 3);
    }

    @Override // defpackage.dtds
    public final void c(boolean z) {
        f();
        e().reset();
        this.b.f(false);
        this.c.f(false);
        if (z) {
            this.d.f(Duration.ZERO);
        }
    }

    @Override // defpackage.dtds
    public final void d(Uri uri, boolean z) {
        c(z);
        final MediaPlayer e = e();
        e.setAudioAttributes(h);
        e.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: dtdt
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                dtdy dtdyVar = dtdy.this;
                dtdyVar.c.f(false);
                dtdyVar.d.f(Duration.ZERO);
            }
        });
        e.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: dtdu
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer) {
                dtdy.this.d.f(Duration.ofMillis(e.getCurrentPosition()));
            }
        });
        e.setDataSource(this.i, uri);
        e.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: dtdv
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                dtdy.this.b.f(true);
            }
        });
        e.prepareAsync();
    }

    public final MediaPlayer e() {
        return (MediaPlayer) this.k.a();
    }

    public final void f() {
        ffud ffudVar = this.l;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.l = null;
    }
}
