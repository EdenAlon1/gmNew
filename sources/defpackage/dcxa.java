package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.Guideline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.LegacyPlayerView;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.fbal;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxa extends dcwz implements ekhu, fbas, ekhq, ekkk, elar {
    private dcxe a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public dcxa() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dcxe.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            H();
            View inflate = layoutInflater.inflate(R.layout.video_fragment, viewGroup, false);
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
        return this.e;
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
        if (this.d == null) {
            this.d = new ekkn(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.dcwz, defpackage.efaf, defpackage.ea
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
    public final void am() {
        this.c.k();
        try {
            bh();
            H().f.d();
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
    public final void ap(View view, Bundle bundle) {
        Uri uri;
        this.c.k();
        try {
            bm(view, bundle);
            final dcxe H = H();
            eg G = H.a.G();
            Guideline guideline = (Guideline) view.findViewById(R.id.screen_start_guideline);
            guideline.getClass();
            Guideline guideline2 = (Guideline) view.findViewById(R.id.screen_top_guideline);
            guideline2.getClass();
            Guideline guideline3 = (Guideline) view.findViewById(R.id.screen_end_guideline);
            guideline3.getClass();
            Guideline guideline4 = (Guideline) view.findViewById(R.id.screen_bottom_guideline);
            guideline4.getClass();
            H.g = new dcwy(G, guideline, guideline2, guideline3, guideline4);
            H.g.a();
            final LegacyPlayerView legacyPlayerView = (LegacyPlayerView) view.findViewById(R.id.exo_player);
            dcxd dcxdVar = new dcxd(H, H.f);
            legacyPlayerView.c(dcxdVar);
            nuf nufVar = new nuf() { // from class: dcxb
                @Override // defpackage.nuf
                public final void E(int i) {
                    dcxe.this.h.b(i != 0);
                    LegacyPlayerView legacyPlayerView2 = legacyPlayerView;
                    legacyPlayerView2.findViewById(R.id.exo_play).setVisibility(0);
                    legacyPlayerView2.b(5000);
                }
            };
            lti.g(legacyPlayerView.d);
            nuf nufVar2 = legacyPlayerView.h;
            if (nufVar2 != nufVar) {
                if (nufVar2 != null) {
                    legacyPlayerView.d.a.remove(nufVar2);
                }
                legacyPlayerView.h = nufVar;
                legacyPlayerView.d.a(nufVar);
            }
            Bundle bundle2 = H.a.m;
            if (bundle2 != null && (uri = (Uri) bundle2.getParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI)) != null) {
                H.f.af(new mut(new lwy(H.a.z(), lvf.M(H.a.z(), "Messages Video Player"))).b(lqw.a(uri)), bundle2.getLong("video_start_ts", -9223372036854775807L));
                if (bundle2.getBoolean("start_playing_video", false)) {
                    dcxdVar.S(true);
                }
                H.f.Q();
            }
            H.c.b(H.m(), H.l());
            H.f.ad(H);
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.dcwz
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

    @Override // defpackage.ekhu
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final dcxe H() {
        dcxe dcxeVar = this.a;
        if (dcxeVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dcxeVar;
    }

    @Override // defpackage.dcwz, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof dcxa)) {
                        throw new IllegalStateException(a.J(eaVar, dcxe.class));
                    }
                    dcxa dcxaVar = (dcxa) eaVar;
                    akis akisVar = ((akgt) aX).a;
                    alim alimVar = new alim(akisVar.a.dF, new alid(), (Executor) akisVar.p.b());
                    alhx ao = ((akgt) aX).a.a.ao();
                    akis akisVar2 = ((akgt) aX).a;
                    this.a = new dcxe(dcxaVar, alimVar, ao, new alip(akisVar2.a.dF, new alid(), (Executor) akisVar2.p.b()), ((akgt) aX).a.a.al);
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } finally {
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
            dcxe H = H();
            H.f = new mex(H.a.z()).a();
            lpj lpjVar = new lpj();
            lpjVar.b();
            lpjVar.c();
            H.f.ac(lpjVar.a());
            ExoPlayer exoPlayer = H.f;
            if (exoPlayer != null) {
                exoPlayer.ad(new dcxc(H));
            }
            eg G = H.a.G();
            if (G != null) {
                H.h = (dbti) new lmw(G).a(dbti.class);
                G.getWindow().addFlags(128);
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void i() {
        elav b = this.c.b();
        try {
            bf();
            H().f.ae();
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void l() {
        this.c.k();
        try {
            bk();
            dcxe H = H();
            H.i = 0L;
            H.j = 0L;
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
    public final void m() {
        this.c.k();
        try {
            bl();
            dcxe H = H();
            alip alipVar = H.d;
            final eqad m = H.m();
            final epzq l = H.l();
            final long seconds = TimeUnit.MILLISECONDS.toSeconds(H.i);
            final long j = H.j();
            alipVar.o(new Supplier() { // from class: alio
                @Override // java.util.function.Supplier
                public final Object get() {
                    eqaj eqajVar = (eqaj) eqak.a.createBuilder();
                    eqajVar.copyOnWrite();
                    eqak eqakVar = (eqak) eqajVar.instance;
                    eqad eqadVar = eqad.this;
                    eqadVar.getClass();
                    eqakVar.c = eqadVar;
                    eqakVar.b |= 1;
                    eqajVar.copyOnWrite();
                    eqak eqakVar2 = (eqak) eqajVar.instance;
                    epzq epzqVar = l;
                    epzqVar.getClass();
                    eqakVar2.d = epzqVar;
                    eqakVar2.b |= 2;
                    eqajVar.copyOnWrite();
                    eqak eqakVar3 = (eqak) eqajVar.instance;
                    eqakVar3.b |= 4;
                    eqakVar3.e = (((int) seconds) / 10) * 10;
                    eqajVar.copyOnWrite();
                    eqak eqakVar4 = (eqak) eqajVar.instance;
                    eqakVar4.b |= 8;
                    eqakVar4.f = (((int) j) / 10) * 10;
                    return (eqak) eqajVar.build();
                }
            });
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.efaf, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dcwy dcwyVar = H().g;
        if (dcwyVar != null) {
            dcwyVar.a();
        }
    }

    @Override // defpackage.dcwz, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
