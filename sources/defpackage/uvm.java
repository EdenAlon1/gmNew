package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.LegacyPlayerView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.attachment.video.inlineplayer.InlinePlayerCornersView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uvm implements ellh {
    final /* synthetic */ uuy a;

    public uvm(uuy uuyVar) {
        this.a = uuyVar;
    }

    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, lro] */
    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        uuy uuyVar = this.a;
        final cxoq cxoqVar = (cxoq) ellfVar;
        uuyVar.e.z().getClass();
        cxom cxomVar = uuyVar.bd;
        cxomVar.c.isPresent();
        final cxpi cxpiVar = (cxpi) cxomVar.c.get();
        if (cxpiVar.c.isPresent() && cxpiVar.c.get().equals(cxoqVar.d())) {
            if (cxpiVar.e.isPresent() && cxpiVar.f.isPresent()) {
                ?? r14 = cxpiVar.e.get();
                FrameLayout frameLayout = ((LegacyPlayerView) cxpiVar.f.get()).e;
                View findViewById = frameLayout != null ? frameLayout.findViewById(R.id.inline_player_play_button) : null;
                if (cxpiVar.g) {
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    cxpiVar.d.ifPresent(new Consumer() { // from class: cxpd
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            View view = (View) obj;
                            view.setContentDescription(view.getResources().getString(R.string.video_thumbnail_view_play_button_content_description));
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    r14.d();
                    cxpiVar.g = false;
                } else {
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                    cxpiVar.d.ifPresent(new Consumer() { // from class: cxpe
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            View view = (View) obj;
                            view.setContentDescription(view.getResources().getString(R.string.inline_playback_pause_content_description));
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    r14.e();
                }
            }
            return elli.a;
        }
        cxpiVar.a();
        final ViewGroup d = cxoqVar.d();
        Context context = d.getContext();
        ExoPlayer a = new mex(context).a();
        lpj lpjVar = new lpj();
        lpjVar.b();
        lpjVar.c();
        a.ac(lpjVar.a());
        LegacyPlayerView legacyPlayerView = new LegacyPlayerView(context);
        legacyPlayerView.setLayoutParams(new ViewGroup.LayoutParams(d.getMeasuredWidth(), d.getMeasuredHeight()));
        View inflate = LayoutInflater.from(context).inflate(R.layout.inline_player_overlay, legacyPlayerView.e);
        cxpj H = ((InlinePlayerCornersView) inflate.findViewById(R.id.inline_player_corners)).H();
        int a2 = cxoqVar.a();
        engw e = cxoqVar.e();
        H.a.setWillNotDraw(false);
        H.d = a2;
        if (!e.isEmpty()) {
            H.e = ermj.d(e);
            H.g = 0;
            H.h = 0;
            H.a.invalidate();
        }
        inflate.findViewById(R.id.inline_fullscreen_button).setOnClickListener(new View.OnClickListener() { // from class: cxpb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ellj.g(new cxok(cxoqVar.b()), d);
                cxpi.this.a();
            }
        });
        lti.c(true);
        legacyPlayerView.setClickable(legacyPlayerView.hasOnClickListeners());
        if (legacyPlayerView.g) {
            legacyPlayerView.g = false;
            if (legacyPlayerView.l()) {
                legacyPlayerView.d.f(legacyPlayerView.f);
            } else {
                nug nugVar = legacyPlayerView.d;
                if (nugVar != null) {
                    nugVar.b();
                    legacyPlayerView.d.f(null);
                }
            }
            legacyPlayerView.g();
        }
        lti.g(legacyPlayerView.a);
        legacyPlayerView.a.b(3);
        d.addView(legacyPlayerView);
        legacyPlayerView.c(a);
        lwy lwyVar = new lwy(context, lvf.M(context, "Messages Inline Video Player"));
        Uri b = cxoqVar.b();
        lql lqlVar = new lql();
        lqlVar.a = b;
        lqlVar.b(b.toString());
        a.af(new mut(lwyVar).b(lqlVar.a()), -9223372036854775807L);
        a.S(true);
        a.Q();
        a.N(cxpiVar.a);
        cxpiVar.b = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: cxpc
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                cxpi cxpiVar2 = cxpi.this;
                if (cxpiVar2.f.isPresent() && cxpiVar2.c.isPresent()) {
                    ViewGroup.LayoutParams layoutParams = ((LegacyPlayerView) cxpiVar2.f.get()).getLayoutParams();
                    if (layoutParams == null) {
                        ((LegacyPlayerView) cxpiVar2.f.get()).setLayoutParams(new ViewGroup.LayoutParams(((ViewGroup) cxpiVar2.c.get()).getMeasuredWidth(), ((ViewGroup) cxpiVar2.c.get()).getMeasuredHeight()));
                    } else {
                        layoutParams.width = ((ViewGroup) cxpiVar2.c.get()).getMeasuredWidth();
                        layoutParams.height = ((ViewGroup) cxpiVar2.c.get()).getMeasuredHeight();
                        ((LegacyPlayerView) cxpiVar2.f.get()).requestLayout();
                    }
                }
            }
        };
        ViewTreeObserver viewTreeObserver = d.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = cxpiVar.b;
        onGlobalLayoutListener.getClass();
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        cxoqVar.c().setContentDescription(context.getResources().getString(R.string.inline_playback_pause_content_description));
        cxpiVar.c = Optional.of(d);
        cxpiVar.d = Optional.of(cxoqVar.c());
        cxpiVar.e = Optional.of(a);
        cxpiVar.f = Optional.of(legacyPlayerView);
        cxpiVar.g = true;
        return elli.a;
    }
}
