package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsuq implements dswd {
    public static final enru a = enru.c("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer");
    public final ffsk b;
    public long d;
    public boolean f;
    public ffud g;
    public ExoPlayer h;
    private final drnl i;
    private final dswx j;
    public final fgcm c = fgdm.a(false);
    public final fgcm e = fgdm.a(0L);

    public dsuq(dswx dswxVar, ffsk ffskVar, drnl drnlVar) {
        this.j = dswxVar;
        this.b = ffskVar;
        this.i = drnlVar;
        this.d = drnlVar.g.toMillis();
    }

    public final void a() {
        if (this.h != null) {
            return;
        }
        dswx dswxVar = this.j;
        final mex mexVar = new mex(dswxVar.a);
        final ffji ffjiVar = new ffji() { // from class: dswv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dswu dswuVar = (dswu) obj;
                dswuVar.getClass();
                mee meeVar = new mee();
                meeVar.b(dswuVar.a, dswuVar.b, dswuVar.c, dswuVar.d);
                mex.this.b(meeVar.a());
                return ffcu.a;
            }
        };
        dswxVar.b.ifPresent(new Consumer() { // from class: dsww
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ExoPlayer a2 = mexVar.a();
        a2.N(new dsun(this, a2));
        this.h = a2;
    }

    @Override // defpackage.dswd
    public final void b() {
        if (this.f) {
            ((enrr) a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "pause", 121, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::pause media player pausing");
            ExoPlayer exoPlayer = this.h;
            if (exoPlayer != null) {
                exoPlayer.d();
            }
        }
    }

    @Override // defpackage.dswd
    public final void c() {
        a();
        if (!this.f) {
            ((enrr) a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "play", 62, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::play preparing media player");
            d(true);
            return;
        }
        ExoPlayer exoPlayer = this.h;
        exoPlayer.getClass();
        if (exoPlayer.u() == 4) {
            ((enrr) a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "play", 66, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::play seeking to the beginning");
            lro lroVar = this.h;
            lroVar.getClass();
            ((lpm) lroVar).t(0L);
        }
        ((enrr) a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "play", 69, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::play playing media player");
        ExoPlayer exoPlayer2 = this.h;
        exoPlayer2.getClass();
        exoPlayer2.e();
    }

    public final void d(boolean z) {
        Uri parse = Uri.parse(this.i.b);
        ExoPlayer exoPlayer = this.h;
        if (exoPlayer != null) {
            engw r = engw.r(lqw.a(parse));
            mgl mglVar = (mgl) exoPlayer;
            mglVar.au();
            mglVar.av(mglVar.ak(r), 0L);
        }
        ExoPlayer exoPlayer2 = this.h;
        if (exoPlayer2 != null) {
            exoPlayer2.Q();
        }
        ExoPlayer exoPlayer3 = this.h;
        if (exoPlayer3 != null) {
            exoPlayer3.S(z);
        }
    }

    public final void e() {
        ffud ffudVar = this.g;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.g = null;
    }
}
