package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.ditto.CameraSourcePreview;
import defpackage.fbal;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsa extends dbrq implements ekhu, fbas, ekhq, ekkk, elar {
    public final lkv a = new lkv(this);
    private boolean ag;
    private dbsl d;
    private Context e;

    @Deprecated
    public dbsa() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dbsl.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            dbsl H = H();
            dbsy dbsyVar = H.d;
            cstj cstjVar = (cstj) dbsyVar.a.b();
            cstjVar.getClass();
            akzt akztVar = (akzt) dbsyVar.b.b();
            akztVar.getClass();
            albq albqVar = (albq) dbsyVar.c.b();
            albqVar.getClass();
            ffbr ffbrVar = dbsyVar.d;
            errl errlVar = (errl) dbsyVar.e.b();
            errlVar.getClass();
            H.l = new dbsx(cstjVar, akztVar, albqVar, ffbrVar, errlVar, H);
            View inflate = layoutInflater.inflate(R.layout.mnext_qr_scanner_fragment, viewGroup, false);
            H.q = (CameraSourcePreview) inflate.findViewById(R.id.camera_preview);
            H.r = inflate.findViewById(R.id.qr_loading_overlay);
            ((TextView) inflate.findViewById(R.id.qr_scanner_text_view)).setText(Html.fromHtml(H.i.getResources().getString(R.string.qr_code_scanner_hint_text, bzaq.i.e())));
            if (((aslh) H.k.b()).a() && viewGroup != null) {
                viewGroup.setAccessibilityLiveRegion(1);
            } else if (crnx.j(H.i) && viewGroup != null) {
                crnx.k(viewGroup, H.i.getResources().getString(R.string.qr_code_scanner_a11y_hint, bzaq.i.e()));
            }
            ekyf.q();
            return inflate;
        } catch (Throwable th) {
            try {
                ekyf.q();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
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

    @Override // defpackage.dbrq, defpackage.efaf, defpackage.ea
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
            CameraSourcePreview cameraSourcePreview = H().q;
            dhvy dhvyVar = cameraSourcePreview.b;
            if (dhvyVar != null) {
                dhvyVar.b();
                cameraSourcePreview.d = false;
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
    public final void ao() {
        elav b = this.c.b();
        try {
            bi();
            dbsl H = H();
            ((dbsx) H.l).i();
            H.e();
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

    @Override // defpackage.dbrq
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
    public final dbsl H() {
        dbsl dbslVar = this.d;
        if (dbslVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dbslVar;
    }

    @Override // defpackage.dbrq, defpackage.ekkd, defpackage.ea
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
                    akis akisVar = ((akgt) aX).a;
                    fbbf fbbfVar = akisVar.b.pz;
                    akkp akkpVar = akisVar.a;
                    dbsy dbsyVar = new dbsy(fbbfVar, akkpVar.f, akkpVar.di, akkpVar.jZ, akisVar.p);
                    fbbf fbbfVar2 = ((akgt) aX).c.g;
                    akis akisVar2 = ((akgt) aX).a;
                    fbbf fbbfVar3 = akisVar2.b.kW;
                    dbrz dbrzVar = new dbrz((Executor) akisVar2.p.b());
                    ejxn ejxnVar = (ejxn) ((akgt) aX).f.b();
                    elbx elbxVar = (elbx) ((akgt) aX).a.aJ.b();
                    Activity activity = (Activity) ((akgt) aX).c.d.b();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof dbsa)) {
                        throw new IllegalStateException(a.J(eaVar, dbsl.class));
                    }
                    this.d = new dbsl(dbsyVar, fbbfVar2, fbbfVar3, dbrzVar, ejxnVar, elbxVar, activity, (dbsa) eaVar);
                    this.Z.c(new ekkg(this.c, this.a));
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
            final dbsl H = H();
            H.t = H.g.h(new ejxk() { // from class: dbsc
                @Override // defpackage.ejxk
                public final /* synthetic */ void a(Throwable th) {
                    ejxj.a(th);
                }

                @Override // defpackage.ejxk
                public final void b(Object obj) {
                    dbsl dbslVar = dbsl.this;
                    dbslVar.n = (dhvy) obj;
                    dbslVar.e();
                }
            });
            H.g.g(R.id.barcode_scanner_data_source_id, new dbrw(H.f), new ejxk() { // from class: dbsd
                @Override // defpackage.ejxk
                public final /* synthetic */ void a(Throwable th) {
                    ejxj.a(th);
                }

                @Override // defpackage.ejxk
                public final void b(Object obj) {
                    dbsl dbslVar = dbsl.this;
                    dbrs dbrsVar = (dbrs) obj;
                    dbslVar.o = dbrsVar;
                    if (dbslVar.p == null) {
                        dbslVar.p = new dbsi(dbslVar);
                    }
                    dbslVar.a(true);
                    if (((Boolean) dbsl.b.e()).booleanValue()) {
                        dbslVar.l.a((String) dbsl.c.e());
                    } else {
                        ((ctuk) dbslVar.e.b()).d(new dbsf(dbslVar, dbrsVar));
                    }
                }
            });
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
            dbsl H = H();
            CameraSourcePreview cameraSourcePreview = H.q;
            if (cameraSourcePreview != null && !cameraSourcePreview.f) {
                dhvy dhvyVar = cameraSourcePreview.b;
                if (dhvyVar != null) {
                    dhvyVar.a();
                    cameraSourcePreview.b = null;
                    cameraSourcePreview.d = false;
                    cameraSourcePreview.f = true;
                }
                H.n = null;
            }
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

    @Override // defpackage.dbrq, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
