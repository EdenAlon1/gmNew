package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cteb implements Closeable {
    public static final entd a = entd.c("BugleAudio");
    public final ctci b;
    public final Executor c;
    public final AudioManager d;
    public MediaPlayer e;
    public AudioFocusRequest f;
    public int g = 2;
    public ctdk h;
    private final Context i;

    public cteb(Context context, errl errlVar, AudioManager audioManager, MediaPlayer mediaPlayer, ctci ctciVar) {
        this.i = context;
        this.b = ctciVar;
        this.e = mediaPlayer;
        this.c = new ersb(errlVar);
        this.d = audioManager;
    }

    private final void e(ctch ctchVar) {
        MediaPlayer mediaPlayer = this.e;
        mediaPlayer.getClass();
        int e = ctchVar.e() - 1;
        if (e == 0) {
            mediaPlayer.setDataSource(this.i, ctchVar.a());
            return;
        }
        if (e == 1) {
            mediaPlayer.setDataSource(ctchVar.d());
            return;
        }
        AssetFileDescriptor openRawResourceFd = this.i.getResources().openRawResourceFd(ctchVar.c().intValue());
        try {
            mediaPlayer.setDataSource(openRawResourceFd);
            if (openRawResourceFd != null) {
                openRawResourceFd.close();
            }
        } catch (Throwable th) {
            if (openRawResourceFd != null) {
                try {
                    openRawResourceFd.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    final elfl a(final String str) {
        return elfo.g(new Callable() { // from class: ctdw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cteb ctebVar = cteb.this;
                String str2 = str;
                try {
                    MediaPlayer mediaPlayer = ctebVar.e;
                    if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                        ctebVar.b();
                        ctdk ctdkVar = ctebVar.h;
                        if (ctdkVar != null) {
                            ctdkVar.a();
                            ctebVar.h = null;
                        }
                        return false;
                    }
                    ctebVar.e.stop();
                    ((ensz) cteb.a.n().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "stop", 87, "PlaybackSession.java")).t("Stopping due to: %s", str2);
                    ctebVar.b();
                    ctdk ctdkVar2 = ctebVar.h;
                    if (ctdkVar2 != null) {
                        ctdkVar2.a();
                        ctebVar.h = null;
                    }
                    return true;
                } catch (Throwable th) {
                    ctebVar.b();
                    ctdk ctdkVar3 = ctebVar.h;
                    if (ctdkVar3 != null) {
                        ctdkVar3.a();
                        ctebVar.h = null;
                    }
                    throw th;
                }
            }
        }, this.c);
    }

    public final void b() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            ctef.b(mediaPlayer);
            this.e = null;
            ctci ctciVar = this.b;
            ((ctcq) ctciVar).f.ifPresent(new Consumer() { // from class: ctdl
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    cteb ctebVar = cteb.this;
                    AudioFocusRequest audioFocusRequest = ctebVar.f;
                    if (audioFocusRequest != null) {
                        ctebVar.d.abandonAudioFocusRequest(audioFocusRequest);
                        ctebVar.f = null;
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        this.g = 1;
    }

    public final void c() {
        try {
            e(((ctcq) this.b).a);
        } catch (Resources.NotFoundException | IOException | IllegalArgumentException e) {
            if (!((ctcq) this.b).b.isPresent()) {
                throw e;
            }
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "setDataSource", 264, "PlaybackSession.java")).t("Failed to use data source: %s", ((ctcq) this.b).a);
            e((ctch) ((ctcq) this.b).b.get());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        axnw.h(a("Future cancellation"));
    }

    final elfl d(final cxrj cxrjVar) {
        return elfo.h(new erog() { // from class: ctdn
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final cteb ctebVar = cteb.this;
                if (ctebVar.g == 1) {
                    return elfo.e(ctck.c(3));
                }
                final cxrj cxrjVar2 = cxrjVar;
                final MediaPlayer mediaPlayer = ctebVar.e;
                mediaPlayer.getClass();
                return kfg.a(new kfd() { // from class: ctdu
                    @Override // defpackage.kfd
                    public final Object a(final kfb kfbVar) {
                        kfbVar.a(new Runnable() { // from class: ctdx
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((ensz) cteb.a.o().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "preparePlayer", 116, "PlaybackSession.java")).q("Future cancelled before playback started");
                            }
                        }, erpp.a);
                        ctdk ctdkVar = new ctdk(kfbVar);
                        final cteb ctebVar2 = cteb.this;
                        ctebVar2.h = ctdkVar;
                        MediaPlayer.OnPreparedListener onPreparedListener = new MediaPlayer.OnPreparedListener() { // from class: ctdr
                            @Override // android.media.MediaPlayer.OnPreparedListener
                            public final void onPrepared(MediaPlayer mediaPlayer2) {
                                ((ensz) cteb.a.o().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getPreparedListener", 212, "PlaybackSession.java")).q("Media player is prepared");
                                final kfb kfbVar2 = kfbVar;
                                axnw.h(elfo.f(new Runnable() { // from class: ctdz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        entd entdVar = cteb.a;
                                        if (kfb.this.b(ctck.c(1))) {
                                            return;
                                        }
                                        ((ensz) cteb.a.o().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getPreparedListener", 218, "PlaybackSession.java")).q("Media player prepared before being released");
                                    }
                                }, cteb.this.c));
                            }
                        };
                        MediaPlayer mediaPlayer2 = mediaPlayer;
                        mediaPlayer2.setOnPreparedListener(onPreparedListener);
                        mediaPlayer2.setOnErrorListener(new ctdq(ctebVar2, cxrjVar2, kfbVar));
                        try {
                            ctebVar2.c();
                            final MediaPlayer mediaPlayer3 = ctebVar2.e;
                            mediaPlayer3.getClass();
                            ((ctcq) ctebVar2.b).e.ifPresent(new Consumer() { // from class: ctea
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    mediaPlayer3.setAudioAttributes((AudioAttributes) obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            ((ctcq) ctebVar2.b).d.ifPresent(new Consumer() { // from class: ctdh
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    mediaPlayer3.setLooping(((Boolean) obj).booleanValue());
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            ((ctcq) ctebVar2.b).c.ifPresent(new Consumer() { // from class: ctdi
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    Float f = (Float) obj;
                                    entd entdVar = cteb.a;
                                    mediaPlayer3.setVolume(f.floatValue(), f.floatValue());
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            mediaPlayer2.prepare();
                            return "MediaPlayer.OnPreparedListener";
                        } catch (Exception e) {
                            ctebVar2.b();
                            throw new ctcz(e);
                        }
                    }
                });
            }
        }, this.c).i(new eroh() { // from class: ctdg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ctck ctckVar = (ctck) obj;
                if (ctckVar.b() != 1) {
                    return elfo.e(ctckVar);
                }
                final cxrj cxrjVar2 = cxrjVar;
                final cteb ctebVar = cteb.this;
                return elfo.h(new erog() { // from class: ctds
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final cteb ctebVar2 = cteb.this;
                        if (ctebVar2.g == 1) {
                            return elfo.e(ctck.c(3));
                        }
                        final cxrj cxrjVar3 = cxrjVar2;
                        final MediaPlayer mediaPlayer = ctebVar2.e;
                        mediaPlayer.getClass();
                        ListenableFuture a2 = kfg.a(new kfd() { // from class: ctdm
                            @Override // defpackage.kfd
                            public final Object a(final kfb kfbVar) {
                                kfbVar.a(new Runnable() { // from class: ctdt
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ((ensz) cteb.a.o().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "startPlayback", 154, "PlaybackSession.java")).q("Future cancelled after playback started");
                                    }
                                }, erpp.a);
                                ctdk ctdkVar = new ctdk(kfbVar);
                                final cteb ctebVar3 = cteb.this;
                                ctebVar3.h = ctdkVar;
                                final cxrj cxrjVar4 = cxrjVar3;
                                MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() { // from class: ctdj
                                    @Override // android.media.MediaPlayer.OnCompletionListener
                                    public final void onCompletion(MediaPlayer mediaPlayer2) {
                                        ((ensz) cteb.a.o().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getCompletionListener", 191, "PlaybackSession.java")).q("Media playback completed");
                                        cxrj cxrjVar5 = cxrjVar4;
                                        if (cxrjVar5 != null) {
                                            cxrjVar5.a();
                                        }
                                        final kfb kfbVar2 = kfbVar;
                                        final cteb ctebVar4 = cteb.this;
                                        axnw.h(elfo.f(new Runnable() { // from class: ctdp
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                cteb.this.b();
                                                if (kfbVar2.b(ctck.c(1))) {
                                                    return;
                                                }
                                                ((ensz) cteb.a.n().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getCompletionListener", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "PlaybackSession.java")).q("Media player finished playback before being released");
                                            }
                                        }, ctebVar4.c));
                                    }
                                };
                                MediaPlayer mediaPlayer2 = mediaPlayer;
                                mediaPlayer2.setOnCompletionListener(onCompletionListener);
                                mediaPlayer2.setOnErrorListener(new ctdq(ctebVar3, cxrjVar4, kfbVar));
                                return "MediaPlayer.On(Completion|Error)Listener";
                            }
                        });
                        ctci ctciVar = ctebVar2.b;
                        ((ctcq) ctciVar).f.ifPresent(new Consumer() { // from class: ctdy
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj2) {
                                AudioFocusRequest build;
                                ((ctce) obj2).a();
                                final AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(3);
                                Consumer consumer = new Consumer() { // from class: ctdv
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj3) {
                                        builder.setAudioAttributes((AudioAttributes) obj3);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                        return Consumer$CC.$default$andThen(this, consumer2);
                                    }
                                };
                                cteb ctebVar3 = cteb.this;
                                ((ctcq) ctebVar3.b).e.ifPresent(consumer);
                                build = builder.build();
                                ctebVar3.f = build;
                                ctebVar3.d.requestAudioFocus(ctebVar3.f);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        try {
                            mediaPlayer.start();
                            ctebVar2.g = 3;
                            return a2;
                        } catch (IllegalStateException e) {
                            ctebVar2.b();
                            throw new ctcz(e);
                        }
                    }
                }, ctebVar.c);
            }
        }, erpp.a);
    }
}
