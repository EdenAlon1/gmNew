package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyq implements zxl {
    public final Context a;
    public final Uri b;
    public MediaPlayer d;
    public long h;
    public boolean k;
    public Long l;
    private final AudioManager m;
    private final ffsk n;
    private final ffsk o;
    private final elbx p;
    private final Duration q;
    private AudioFocusRequest r;
    private ffud u;
    private ffud v;
    private final int w;
    private final alcg x;
    public final enru c = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer");
    private final AudioAttributes s = new AudioAttributes.Builder().setContentType(2).setUsage(1).build();
    private final ffji t = new ffji() { // from class: zyi
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            int intValue = ((Integer) obj).intValue();
            zyq zyqVar = zyq.this;
            if (intValue == -2 || intValue == -1) {
                zyqVar.g();
            } else if (intValue == 1) {
                zyqVar.h();
            }
            return ffcu.a;
        }
    };
    public final fgcm e = fgdm.a(false);
    public final fgcm f = fgdm.a(false);
    public final fgcm g = fgdm.a(false);
    public final fgcm i = fgdm.a(null);
    public final fgcm j = fgdm.a(null);

    public zyq(AudioManager audioManager, Context context, ffsk ffskVar, ffsk ffskVar2, alcg alcgVar, elbx elbxVar, Uri uri, Duration duration, int i) {
        this.m = audioManager;
        this.a = context;
        this.n = ffskVar;
        this.o = ffskVar2;
        this.x = alcgVar;
        this.p = elbxVar;
        this.b = uri;
        this.q = duration;
        this.w = i;
        this.h = duration.toMillis();
    }

    private final void n(final boolean z) {
        this.e.f(true);
        MediaPlayer a = ctef.a();
        a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: zye
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                zyq zyqVar = zyq.this;
                zyqVar.i.f(0L);
                mediaPlayer.seekTo(0);
                zyqVar.g.f(false);
                zyqVar.m();
            }
        });
        a.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: zyf
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                long duration = mediaPlayer.getDuration();
                zyq zyqVar = zyq.this;
                zyqVar.h = duration;
                zyqVar.k = true;
                zyqVar.e.f(false);
                Long l = zyqVar.l;
                if (l != null) {
                    mediaPlayer.seekTo((int) l.longValue());
                }
                zyqVar.l = null;
                Float f = (Float) zyqVar.j.c();
                if (f != null) {
                    long floatValue = (long) (f.floatValue() * zyqVar.h);
                    zyqVar.i.f(Long.valueOf(floatValue));
                    mediaPlayer.seekTo((int) floatValue);
                }
                boolean z2 = z;
                zyqVar.j.f(null);
                if (z2) {
                    zyqVar.h();
                }
            }
        });
        a.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: zyg
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                mediaPlayer.getClass();
                zyq zyqVar = zyq.this;
                ((enrr) zyqVar.c.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "prepare$lambda$8$lambda$6", 163, "BugleAudioPlayer.kt")).u("Failed to prepare audio file, %d, %d", i, i2);
                zyqVar.f.f(true);
                zyqVar.e.f(false);
                return true;
            }
        });
        a.setAudioAttributes(this.s);
        ffud ffudVar = this.v;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        ffsk ffskVar = this.o;
        ffhe ffheVar = ffhe.a;
        this.v = ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new zyj(null, this));
        this.d = a;
    }

    private final void o() {
        ffud ffudVar = this.u;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.u = null;
    }

    @Override // defpackage.zxl
    public final long a() {
        return this.h;
    }

    @Override // defpackage.zxl
    public final /* synthetic */ ffxx b() {
        return this.i;
    }

    @Override // defpackage.zxl
    public final /* synthetic */ ffxx c() {
        return this.f;
    }

    @Override // defpackage.zxl
    public final /* synthetic */ ffxx d() {
        return this.j;
    }

    @Override // defpackage.zxl
    public final /* synthetic */ ffxx e() {
        return this.e;
    }

    @Override // defpackage.zxl
    public final /* synthetic */ ffxx f() {
        return this.g;
    }

    @Override // defpackage.zxl
    public final void g() {
        if (!this.k || !((Boolean) this.g.c()).booleanValue() || this.d == null) {
            ((enrr) this.c.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "pause", 198, "BugleAudioPlayer.kt")).t("Failed to pause audio file, %b", Boolean.valueOf(this.k));
            return;
        }
        this.x.b(this.w, this.q.getSeconds());
        MediaPlayer mediaPlayer = this.d;
        mediaPlayer.getClass();
        mediaPlayer.pause();
        m();
        this.g.f(false);
        o();
    }

    @Override // defpackage.zxl
    public final void h() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        if (!this.k) {
            n(true);
            return;
        }
        ekzm b = this.p.b("BugleAudioPlayer#play");
        try {
            audioAttributes = new AudioFocusRequest.Builder(1).setAudioAttributes(this.s);
            acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(true);
            final ffji ffjiVar = this.t;
            onAudioFocusChangeListener = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: zyh
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) {
                    ffji.this.invoke(Integer.valueOf(i));
                }
            });
            build = onAudioFocusChangeListener.build();
            this.r = build;
            AudioManager audioManager = this.m;
            build.getClass();
            requestAudioFocus = audioManager.requestAudioFocus(build);
            boolean z = requestAudioFocus == 1;
            if (!z || ((Boolean) this.g.c()).booleanValue() || this.d == null) {
                ((enrr) this.c.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "play", 124, "BugleAudioPlayer.kt")).I("Failed to play audio file, %b, %b", z, this.k);
            } else {
                this.x.c(this.w, this.q.getSeconds());
                MediaPlayer mediaPlayer = this.d;
                mediaPlayer.getClass();
                mediaPlayer.start();
                this.g.f(true);
                ffud ffudVar = this.u;
                if (ffudVar != null) {
                    ffudVar.t(null);
                }
                this.u = ffra.b(this.n, ekxi.a(ffhe.a), ffsm.a, new zyo(null, this));
            }
            ffig.a(b, null);
        } finally {
        }
    }

    @Override // defpackage.zxl
    public final void i() {
        o();
        ffud ffudVar = this.v;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.v = null;
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer != null) {
            ctef.b(mediaPlayer);
        }
        this.l = (Long) this.i.c();
        this.k = false;
        this.e.f(false);
        this.g.f(false);
        this.d = null;
    }

    @Override // defpackage.zxl
    public final void j() {
        axol.k(this.n, null, new zyn(this, null), 3);
    }

    @Override // defpackage.zxl
    public final void k() {
        o();
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        this.k = false;
        this.e.f(false);
        this.g.f(false);
    }

    @Override // defpackage.zxl
    public final void l(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Progress must be value [0-1]");
        }
        enrr enrrVar = (enrr) this.c.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "seek", 213, "BugleAudioPlayer.kt");
        Float valueOf = Float.valueOf(f);
        enrrVar.t("Seeking to position: %s", valueOf);
        this.x.d(this.w, this.q.getSeconds());
        if (!this.k || this.d == null) {
            ((enrr) this.c.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "seek", 220, "BugleAudioPlayer.kt")).q("AudioPlayer not prepared. Preparing and then seeking to position.");
            this.j.f(valueOf);
            n(false);
        } else {
            float f2 = this.h * f;
            this.i.f(Long.valueOf((long) f2));
            MediaPlayer mediaPlayer = this.d;
            mediaPlayer.getClass();
            mediaPlayer.seekTo((int) f2);
        }
    }

    public final void m() {
        AudioFocusRequest audioFocusRequest = this.r;
        if (audioFocusRequest != null) {
            this.m.abandonAudioFocusRequest(audioFocusRequest);
        }
    }
}
