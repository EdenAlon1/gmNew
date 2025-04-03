package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.Compose2oMessagePartDataConverter;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.FullscreenGalleryRecyclerView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.ekkz;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcdf extends dchb implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    private dcdk a;
    private boolean ah;
    private Context d;
    private final lkv e = new lkv(this);
    private final ells ag = new ells();

    @Deprecated
    public dcdf() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dcdk.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            dcdk H = H();
            View inflate = layoutInflater.inflate(R.layout.full_screen_gallery_fragment, viewGroup, false);
            FullscreenGalleryRecyclerView fullscreenGalleryRecyclerView = (FullscreenGalleryRecyclerView) inflate.findViewById(R.id.full_screen_gallery_recycler_view);
            if (fullscreenGalleryRecyclerView.ac == null) {
                fullscreenGalleryRecyclerView.getContext();
                fullscreenGalleryRecyclerView.ac = new GridLayoutManager(fullscreenGalleryRecyclerView.ad);
                fullscreenGalleryRecyclerView.ap(fullscreenGalleryRecyclerView.ac);
            }
            fullscreenGalleryRecyclerView.am(H.u);
            fullscreenGalleryRecyclerView.w(new dcet(H.k.getResources().getDimensionPixelSize(R.dimen.full_screen_recycler_view_padding)));
            vr vrVar = fullscreenGalleryRecyclerView.E;
            if (vrVar instanceof xv) {
                ((xv) vrVar).y();
            }
            ((ejwl) H.h.b()).b(((dchj) H.i.b()).a(), H.q);
            if (((Boolean) dcem.a.e()).booleanValue()) {
                H.l.av(true);
            }
            if (inflate == null) {
                dceb.a(this, H());
            }
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

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dcdk H() {
        dcdk dcdkVar = this.a;
        if (dcdkVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dcdkVar;
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        Bundle extras;
        Uri uri;
        elav f = this.c.f();
        try {
            aV(i, i2, intent);
            dcdk H = H();
            if (H.a) {
                H.a = false;
                dcgl dcglVar = (dcgl) H.g.b();
                if (i == 1400) {
                    if (i2 == -1 && intent != null) {
                        String stringExtra = intent.getStringExtra("photo_url");
                        if (stringExtra == null && (stringExtra = intent.getDataString()) == null && (extras = intent.getExtras()) != null && (uri = (Uri) extras.getParcelable("android.intent.extra.STREAM")) != null) {
                            stringExtra = uri.toString();
                        }
                        if (stringExtra != null) {
                            new dcgk(dcglVar, Uri.parse(stringExtra), H).e(new Void[0]);
                        }
                    }
                    alct alctVar = (alct) dcglVar.b.b();
                    cqoh cqohVar = dcglVar.g;
                    epts eptsVar = epts.EXTERNAL;
                    eptu eptuVar = eptu.EXPANDED;
                    cqohVar.f().toEpochMilli();
                    long j = dcglVar.h;
                    alctVar.b(eptsVar, eptuVar, eptk.UNKNOWN_CLOSING_SOURCE);
                }
            } else {
                if (i == 130) {
                    if (i2 == -1) {
                        H.d.l();
                    } else {
                        i = 130;
                    }
                }
                if (i == 130) {
                    H.d.k();
                } else if (i == 501 && i2 == -1 && intent.getData() != null) {
                    Uri a = dedu.a(intent.getData(), bdjd.a());
                    dcfs dcfsVar = H.d;
                    eohh eohhVar = eohh.VIDEO_TRIMMER;
                    if (a != null) {
                        if (((Boolean) cful.o.e()).booleanValue()) {
                            ufk o = GalleryContent.o();
                            o.k(a);
                            o.f("video/mp4");
                            ((uec) o).a = new Size(-1, -1);
                            o.e(eohhVar);
                            o.i(TimeUnit.MILLISECONDS.toSeconds(dcfsVar.h.f().toEpochMilli()));
                            dcfsVar.v(o.l(), true, -1);
                        } else {
                            dcfsVar.w(new GalleryContentItem(a, "video/mp4", -1, -1, eohhVar, TimeUnit.MILLISECONDS.toSeconds(dcfsVar.h.f().toEpochMilli())), true, -1);
                        }
                    }
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.dchb, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.efaf, defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        super.ah(menu, menuInflater);
        H().m.a();
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            ellg.b(this).b = view;
            H();
            dceb.a(this, H());
            bm(view, bundle);
            dcdk H = H();
            if (H.o.b() == null || !((Boolean) cjja.a.e()).booleanValue()) {
                H.a(new emyl() { // from class: dcdj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return false;
                    }
                }, bundle);
            } else {
                ((ejwl) H.h.b()).b(((eixo) H.o.b()).a(H.n), new dcdv(H, bundle));
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
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.dchb
    protected final /* bridge */ /* synthetic */ ekky b() {
        return new ekkt(this, true);
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

    @Override // defpackage.ellr
    public final elli e(ellf ellfVar) {
        return this.ag.a(ellfVar);
    }

    @Override // defpackage.ellr
    public final void f(Class cls, ellh ellhVar) {
        this.ag.b(cls, ellhVar);
    }

    @Override // defpackage.dchb, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    Context context2 = (Context) ((akgo) aX).d.i.b();
                    akis akisVar = ((akgo) aX).a;
                    fbbf fbbfVar = akisVar.b.hw;
                    fbbf fbbfVar2 = ((akgo) aX).eT;
                    fbbf fbbfVar3 = ((akgo) aX).aK;
                    fbbf fbbfVar4 = ((akgo) aX).g;
                    fbbf fbbfVar5 = ((akgo) aX).eU;
                    fbbf fbbfVar6 = akisVar.aR;
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    if (!(eaVar instanceof dcdf)) {
                        throw new IllegalStateException(a.J(eaVar, dcdk.class));
                    }
                    dcdf dcdfVar = (dcdf) eaVar;
                    eisx eisxVar = (eisx) ((akgo) aX).b.b.b();
                    fbbf fbbfVar7 = ((akgo) aX).a.a.as;
                    Bundle a = ((akgo) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgo) aX).a.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    dces dcesVar = (dces) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", dces.a, eyfcVar);
                    dcesVar.getClass();
                    this.a = new dcdk(context2, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, dcdfVar, eisxVar, fbbfVar7, dcesVar);
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
            LayoutInflater cloneInContext = aO.cloneInContext(new ekkz.a(aO, this));
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
            dcdk H = H();
            if (((dbxx) H.k).n == null) {
                ((dbxx) H.k).n = new AttachmentQueueState(new Compose2oMessagePartDataConverter());
            }
            H.b = new dcfa(H.l);
            H.c = new dcdz(H);
            ((dbxx) H.k).n.j(new dcdx(H));
            ((dbxx) H.k).n.b = new dcdw(H);
            if (bundle != null) {
                H.a = bundle.getBoolean("is_external_gallery_launched", false);
            }
            if (!((Boolean) dcem.a.e()).booleanValue()) {
                H.c();
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
            this.ah = true;
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
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bj(bundle);
            dcdk H = H();
            bundle.putBoolean("is_external_gallery_launched", H.a);
            H.d.n(bundle);
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

    @Override // defpackage.dchb, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
