package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Window;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class arcs {
    public static final entd a = entd.c("Bugle");
    public final ea b;
    public final ffbr c;
    public final PackageManager e;
    public arda f;
    public arcc g;
    private final ffbr i;
    private final ffbr j;
    public boolean h = false;
    public final a d = new a();
    private final arcq k = new arcq(this);

    public arcs(ea eaVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = eaVar;
        this.i = ffbrVar;
        this.j = ffbrVar2;
        this.c = ffbrVar3;
        this.e = eaVar.A().getPackageManager();
    }

    public final arda a(arcc arccVar) {
        ardb ardbVar = (ardb) this.j.b();
        Uri a2 = arccVar.a();
        arcr arcrVar = new arcr(this);
        Context context = (Context) ardbVar.a.b();
        context.getClass();
        errl errlVar = (errl) ardbVar.b.b();
        errlVar.getClass();
        arbs arbsVar = (arbs) ardbVar.c.b();
        arbsVar.getClass();
        elbx elbxVar = (elbx) ardbVar.d.b();
        elbxVar.getClass();
        ffbr ffbrVar = ardbVar.e;
        a2.getClass();
        final arda ardaVar = new arda(context, errlVar, arbsVar, elbxVar, ffbrVar, a2, arcrVar);
        this.f = ardaVar;
        this.g = arccVar;
        arccVar.addOnAttachStateChangeListener(this.k);
        ejlq ejlqVar = (ejlq) this.i.b();
        if (ardaVar.g != null) {
            throw new IllegalStateException("Playback session has already been prepared.");
        }
        MediaPlayer a3 = ctef.a();
        ardaVar.g = a3;
        a3.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
        final elbx elbxVar2 = ardaVar.d;
        final MediaPlayer.OnPreparedListener onPreparedListener = new MediaPlayer.OnPreparedListener() { // from class: arcv
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                arda ardaVar2 = arda.this;
                ardaVar2.h = true;
                if (!ardaVar2.equals(ardaVar2.k.a.f)) {
                    ardaVar2.d();
                }
                if (!ardaVar2.j.isZero()) {
                    ardaVar2.e(ardaVar2.j);
                }
                if (ardaVar2.i) {
                    ardaVar2.f();
                }
            }
        };
        a3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: elbc
            public final /* synthetic */ String b = "AudioAttachmentPlaybackSession#onPreparedListener";

            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                elbx elbxVar3 = elbx.this;
                MediaPlayer.OnPreparedListener onPreparedListener2 = onPreparedListener;
                ekzm b = elbxVar3.b(this.b);
                try {
                    onPreparedListener2.onPrepared(mediaPlayer);
                    b.close();
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        final elbx elbxVar3 = ardaVar.d;
        final MediaPlayer.OnErrorListener onErrorListener = new MediaPlayer.OnErrorListener() { // from class: arcw
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                arda ardaVar2 = arda.this;
                arcr arcrVar2 = ardaVar2.k;
                arcs arcsVar = arcrVar2.a;
                arcc arccVar2 = arcsVar.g;
                if (arccVar2 != null) {
                    arcsVar.c(arccVar2, new arcf(i, i2));
                }
                if (ardaVar2.equals(arcrVar2.a.f)) {
                    arcrVar2.a.e();
                } else {
                    ardaVar2.d();
                }
                ((ensz) ((ensz) arcs.a.j()).h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController$AudioControllerSessionStateChangeListener", "onError", 346, "AudioAttachmentController.java")).u("Audio playback error occurred. what=%d, extra=%d", i, i2);
                ardaVar2.c.a();
                return true;
            }
        };
        a3.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: elbo
            public final /* synthetic */ String b = "AudioAttachmentPlaybackSession#onErrorListener";

            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                elbx elbxVar4 = elbx.this;
                MediaPlayer.OnErrorListener onErrorListener2 = onErrorListener;
                ekzm b = elbxVar4.b(this.b);
                try {
                    boolean onError = onErrorListener2.onError(mediaPlayer, i, i2);
                    b.close();
                    return onError;
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        final elbx elbxVar4 = ardaVar.d;
        final MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() { // from class: arcx
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                arda ardaVar2 = arda.this;
                arcr arcrVar2 = ardaVar2.k;
                if (ardaVar2.equals(arcrVar2.a.f)) {
                    arcrVar2.a.e();
                }
                ardaVar2.c.a();
            }
        };
        a3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: elbl
            public final /* synthetic */ String b = "AudioAttachmentPlaybackSession#onCompletionListener";

            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                elbx elbxVar5 = elbx.this;
                MediaPlayer.OnCompletionListener onCompletionListener2 = onCompletionListener;
                ekzm b = elbxVar5.b(this.b);
                try {
                    onCompletionListener2.onCompletion(mediaPlayer);
                    b.close();
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        final elbx elbxVar5 = ardaVar.d;
        final MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = new MediaPlayer.OnSeekCompleteListener() { // from class: arcy
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer) {
                arda ardaVar2 = arda.this;
                arcr arcrVar2 = ardaVar2.k;
                if (ardaVar2.equals(arcrVar2.a.f)) {
                    arcs arcsVar = arcrVar2.a;
                    if (arcsVar.g == null) {
                        return;
                    }
                    ((alcg) arcsVar.c.b()).d(arcrVar2.a.g(), ardaVar2.b().toSeconds());
                    arcrVar2.a.f(new arcl(true != ardaVar2.g() ? 2 : 1, ardaVar2.b(), ardaVar2.a()));
                }
            }
        };
        a3.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: elbg
            public final /* synthetic */ String b = "AudioAttachmentPlaybackSession#onSeekCompleteListener";

            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer) {
                elbx elbxVar6 = elbx.this;
                MediaPlayer.OnSeekCompleteListener onSeekCompleteListener2 = onSeekCompleteListener;
                ekzm b = elbxVar6.b(this.b);
                try {
                    onSeekCompleteListener2.onSeekComplete(mediaPlayer);
                    b.close();
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        ejlqVar.i(ejlp.b(elfo.e(ardaVar.e).i(new eroh() { // from class: arcz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Uri uri = (Uri) obj;
                final arda ardaVar2 = arda.this;
                return elfo.g(new Callable() { // from class: arcu
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        arda ardaVar3 = arda.this;
                        MediaPlayer mediaPlayer = ardaVar3.g;
                        if (mediaPlayer == null) {
                            return null;
                        }
                        mediaPlayer.setDataSource(ardaVar3.a, uri);
                        ardaVar3.g.prepare();
                        return null;
                    }
                }, ardaVar2.b);
            }
        }, ardaVar.b)), new ejlm(arccVar.a()), this.d);
        return ardaVar;
    }

    public final void b() {
        Window window;
        eg G = this.b.G();
        if (G == null || (window = G.getWindow()) == null) {
            return;
        }
        window.clearFlags(128);
    }

    public final void c(arcc arccVar, arch archVar) {
        if (this.e.hasSystemFeature("android.hardware.type.watch")) {
            arcb.a(arccVar);
        } else {
            arccVar.h();
        }
    }

    public final void d() {
        ellj.c(this.b, arcd.class, new ellh() { // from class: arcm
            @Override // defpackage.ellh
            public final elli a(ellf ellfVar) {
                arcs arcsVar = arcs.this;
                arcd arcdVar = (arcd) ellfVar;
                if (!arcsVar.e.hasSystemFeature("android.hardware.audio.output")) {
                    if (arcsVar.e.hasSystemFeature("android.hardware.type.watch")) {
                        ensz enszVar = (ensz) arcs.a.h();
                        enszVar.Y(csux.O, "AudioAttachmentController");
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController", "onPlayPauseClickEvent", 139, "AudioAttachmentController.java")).q("Watch does not have built in speaker.");
                        arcb.a(arcdVar.a);
                        return elli.a;
                    }
                    ensz enszVar2 = (ensz) arcs.a.h();
                    enszVar2.Y(csux.O, "AudioAttachmentController");
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController", "onPlayPauseClickEvent", 148, "AudioAttachmentController.java")).q("Phone does not have built in speaker.");
                }
                if (!arcdVar.a.equals(arcsVar.g)) {
                    arcsVar.e();
                }
                arda ardaVar = arcsVar.f;
                if (ardaVar == null) {
                    ardaVar = arcsVar.a(arcdVar.a);
                }
                if (ardaVar.g()) {
                    ardaVar.c();
                } else {
                    ardaVar.f();
                }
                return elli.a;
            }
        });
        ellj.c(this.b, arci.class, new ellh() { // from class: arcn
            @Override // defpackage.ellh
            public final elli a(ellf ellfVar) {
                arda ardaVar;
                arcc arccVar = ((arci) ellfVar).a;
                arcs arcsVar = arcs.this;
                if (arccVar.equals(arcsVar.g) && (ardaVar = arcsVar.f) != null && ardaVar.g()) {
                    arcsVar.h = true;
                    arcsVar.f.c();
                }
                return elli.a;
            }
        });
        ellj.c(this.b, arcj.class, new ellh() { // from class: arco
            @Override // defpackage.ellh
            public final elli a(ellf ellfVar) {
                arcc arccVar;
                arcj arcjVar = (arcj) ellfVar;
                arcs arcsVar = arcs.this;
                if (arcsVar.b.aI() && ((arccVar = arcsVar.g) == null || arcjVar.b.equals(arccVar))) {
                    arda ardaVar = arcsVar.f;
                    if (ardaVar == null) {
                        ardaVar = arcsVar.a(arcjVar.b);
                    }
                    ardaVar.e(arcjVar.a);
                    if (arcsVar.h) {
                        ardaVar.f();
                        arcsVar.h = false;
                    }
                }
                return elli.a;
            }
        });
        this.b.P().c(new arcp(this));
    }

    public final void e() {
        arda ardaVar = this.f;
        if (ardaVar != null) {
            arcl arclVar = new arcl(3, ardaVar.b(), Duration.ZERO);
            ardaVar.d();
            this.f = null;
            f(arclVar);
        }
        arcc arccVar = this.g;
        if (arccVar != null) {
            arccVar.removeOnAttachStateChangeListener(this.k);
            this.g = null;
        }
        b();
    }

    public final void f(arck arckVar) {
        arcc arccVar = this.g;
        if (arccVar == null || !arccVar.isAttachedToWindow()) {
            return;
        }
        this.g.e(arckVar);
    }

    public final int g() {
        AudioAttachmentView audioAttachmentView;
        crik crikVar;
        arcc arccVar = this.g;
        if (arccVar == null || (crikVar = (audioAttachmentView = (AudioAttachmentView) arccVar).f) == null) {
            return 1;
        }
        int h = crikVar.h() - 1;
        if (h == 0) {
            return audioAttachmentView.e ? 3 : 4;
        }
        if (h != 2) {
            return audioAttachmentView.e ? 5 : 6;
        }
        return 2;
    }

    /* compiled from: PG */
    final class a implements ejlr<Uri, Void> {
        public a() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            Uri uri = (Uri) obj;
            arcs arcsVar = arcs.this;
            arcc arccVar = arcsVar.g;
            if (arccVar != null) {
                arcsVar.c(arccVar, new arcg(th));
            }
            if (uri != null) {
                arda ardaVar = arcs.this.f;
                if (uri.equals(ardaVar != null ? ardaVar.e : null)) {
                    arcs.this.e();
                }
            }
            ((ensz) ((ensz) ((ensz) arcs.a.j()).g(th)).h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController$SessionPreparedCallback", "onFailure", (char) 450, "AudioAttachmentController.java")).q("Failed to prepare audio playback session.");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
