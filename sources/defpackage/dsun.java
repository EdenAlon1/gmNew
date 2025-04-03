package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsun implements lrm {
    final /* synthetic */ dsuq a;
    final /* synthetic */ ExoPlayer b;

    public dsun(dsuq dsuqVar, ExoPlayer exoPlayer) {
        this.a = dsuqVar;
        this.b = exoPlayer;
    }

    @Override // defpackage.lrm
    public final void g(boolean z) {
        enrr enrrVar = (enrr) dsuq.a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer$createExoPlayerIfNecessary$1$1", "onIsPlayingChanged", 84, "HugoVideoPlayer.kt");
        Boolean valueOf = Boolean.valueOf(z);
        enrrVar.t("HugoVideoPlayer::onIsPlayingChanged: %b", valueOf);
        this.a.c.f(valueOf);
        if (!z) {
            this.a.e();
            return;
        }
        dsuq dsuqVar = this.a;
        ffud ffudVar = dsuqVar.g;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        dsuqVar.g = ffqy.d(dsuqVar.b, null, null, new dsup(dsuqVar, null), 3);
    }

    @Override // defpackage.lrm
    public final void n(int i) {
        ((enrr) dsuq.a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer$createExoPlayerIfNecessary$1$1", "onPlaybackStateChanged", 95, "HugoVideoPlayer.kt")).r("HugoVideoPlayer::onPlaybackStateChanged: %d", i);
        if (i == 3) {
            this.a.d = this.b.A();
            this.a.f = true;
        }
    }

    @Override // defpackage.lrm
    public final void p(lrh lrhVar) {
        lrhVar.getClass();
        ((enrr) dsuq.a.j().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer$createExoPlayerIfNecessary$1$1", "onPlayerError", 103, "HugoVideoPlayer.kt")).t("HugoVideoPlayer::onPlayerError: %s", lrhVar);
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void A(lrz lrzVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void B(lsb lsbVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void C(lsl lslVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void D(lrl lrlVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void a(lpk lpkVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void c(lrk lrkVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void d(lta ltaVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void e(List list) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void f(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void h(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void j(lqz lqzVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void k(lrb lrbVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void m(lri lriVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void o(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void q(lrh lrhVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void s(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void x(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void i(lqw lqwVar, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void l(boolean z, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void y(int i, int i2) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void z(lru lruVar, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void t(lrn lrnVar, lrn lrnVar2, int i) {
    }
}
