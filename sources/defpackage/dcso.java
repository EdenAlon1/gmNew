package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediaviewer.CenterFitVideoView;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView;
import defpackage.fbal;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcso extends dcsj implements ekhu, fbas, ekhq, ekkk, elar {
    public final lkv a = new lkv(this);
    private boolean ag;
    private dcsz d;
    private Context e;

    @Deprecated
    public dcso() {
        efbd.c();
    }

    static dcso f() {
        dcso dcsoVar = new dcso();
        fbae.e(dcsoVar);
        return dcsoVar;
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dcsz.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            H();
            View inflate = layoutInflater.inflate(R.layout.media_fragment, viewGroup, false);
            ekyf.q();
            return inflate;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.a;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.e == null) {
            this.e = new ekkn(this, super.z());
        }
        return this.e;
    }

    @Override // defpackage.dcsj, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ai() {
        elav b = this.c.b();
        try {
            ba();
            dcsz H = H();
            H.b = false;
            CenterFitVideoView centerFitVideoView = H.c;
            if (centerFitVideoView != null) {
                centerFitVideoView.stopPlayback();
            }
            H.b();
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void am() {
        this.c.k();
        try {
            bh();
            H().b();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ao() {
        elav b = this.c.b();
        try {
            bi();
            dcsz H = H();
            if (H.g.aF()) {
                H.c();
            }
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            bm(view, bundle);
            final dcsz H = H();
            H.d = (ZoomableImageView) view.findViewById(R.id.zoomable_image_view);
            H.d.setImportantForAccessibility(2);
            H.c = (CenterFitVideoView) view.findViewById(R.id.media_viewer_video_preview);
            Bundle bundle2 = H.g.m;
            if (bundle2 != null) {
                Uri uri = (Uri) bundle2.getParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                String string = bundle2.getString("content_type");
                char c = bundle2.getInt("starting_view_state", 0) != 1 ? (char) 1 : (char) 2;
                boolean A = le.A(string);
                int i = 8;
                H.d.setVisibility(true != A ? 0 : 8);
                CenterFitVideoView centerFitVideoView = H.c;
                if (true == A) {
                    i = 0;
                }
                centerFitVideoView.setVisibility(i);
                dcsx dcsxVar = H.i;
                if (dcsxVar != null) {
                    ((dcty) dcsxVar).B.setVisibility(i);
                }
                H.b = A;
                if (!A) {
                    H.d.j = new dcst(H);
                    qqo qqoVar = (qqo) qpt.d(H.g).f(uri).J();
                    if (((Boolean) ((cfup) dcut.i.get()).e()).booleanValue() && uri != null && csuu.z(uri)) {
                        qqoVar = (qqo) qqoVar.D(qvx.c);
                    }
                    qqoVar.f(new dcsw(H)).v(H.d);
                    if (!bundle2.getBoolean("show_direct_send_viewer", false)) {
                        H.d.f = new View.OnClickListener() { // from class: dcsu
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                dcsz.this.a.c();
                            }
                        };
                    }
                    if (c == 2) {
                        H.d();
                    }
                } else {
                    if (uri == null) {
                        throw new IllegalStateException("MediaFragmentPeer: Video uri cannot be null.");
                    }
                    H.c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: dcsp
                        @Override // android.media.MediaPlayer.OnPreparedListener
                        public final void onPrepared(MediaPlayer mediaPlayer) {
                            dcsz dcszVar = dcsz.this;
                            if (dcszVar.b) {
                                mediaPlayer.seekTo(0);
                                mediaPlayer.start();
                                dcszVar.e();
                            }
                            dcszVar.f.set(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
                            dcszVar.f();
                        }
                    });
                    H.c.setVideoURI(uri);
                    H.c.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: dcsq
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer) {
                            mediaPlayer.seekTo(0);
                            mediaPlayer.start();
                        }
                    });
                    H.c.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: dcsr
                        @Override // android.media.MediaPlayer.OnInfoListener
                        public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
                            if (i2 != 3) {
                                return false;
                            }
                            dcsz dcszVar = dcsz.this;
                            dcszVar.e = 0L;
                            dcszVar.c();
                            return false;
                        }
                    });
                    H.c.setOnClickListener(new View.OnClickListener() { // from class: dcss
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            dcsz.this.a.c();
                        }
                    });
                }
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dcsj
    protected final /* synthetic */ fbae b() {
        return new ekku(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.dcsj, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof dcso)) {
                        throw new IllegalStateException(a.J(eaVar, dcsz.class));
                    }
                    this.d = new dcsz((dcso) eaVar, ((akgt) aX).a.a.al);
                    this.Z.c(new ekkg(this.c, this.a));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new fbal.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            dcsz H = H();
            if (H.g.G() != null) {
                H.a = (dbti) new lmw(H.g.G()).a(dbti.class);
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ag = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final dcsz H = H();
        View view = H.g.Q;
        view.getClass();
        ddwu.b(view, new Runnable() { // from class: dcsv
            @Override // java.lang.Runnable
            public final void run() {
                dcsz.this.f();
            }
        });
    }

    @Override // defpackage.ekhu
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final dcsz H() {
        dcsz dcszVar = this.d;
        if (dcszVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dcszVar;
    }

    @Override // defpackage.dcsj, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
