package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxp implements dbxy {
    public final dede A;
    public final akvg B;
    public final axul C;
    public final ffbr D;
    private View E;
    private final Optional G;
    private final Optional H;
    private final dcgl I;
    private final ffbr J;
    private final cqoh K;
    private final tam L;
    private final ddzb M;
    public CoordinatorLayout a;
    public View b;
    public dbxo c;
    public int d;
    public ContentGridView e;
    public cxqz f;
    public dcfa g;
    public boolean h;
    public CustomizationModel v;
    public final Compose2oFragment w;
    public final akzt x;
    public final crjx y;
    public final cuxz z;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public boolean l = false;
    public boolean m = false;
    private boolean F = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public Bundle r = null;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;

    public dbxp(Optional optional, Optional optional2, Compose2oFragment compose2oFragment, akzt akztVar, crjx crjxVar, dcgl dcglVar, ffbr ffbrVar, cuxz cuxzVar, dede dedeVar, akvg akvgVar, axul axulVar, cqoh cqohVar, tam tamVar, ddzb ddzbVar, ffbr ffbrVar2) {
        this.G = optional;
        this.H = optional2;
        this.w = compose2oFragment;
        this.x = akztVar;
        this.y = crjxVar;
        this.I = dcglVar;
        this.J = ffbrVar;
        this.z = cuxzVar;
        this.A = dedeVar;
        this.B = akvgVar;
        this.C = axulVar;
        this.K = cqohVar;
        this.L = tamVar;
        this.M = ddzbVar;
        this.D = ffbrVar2;
    }

    public final void a(dcae dcaeVar) {
        LayoutInflater.from(this.w.z()).inflate(dcaeVar.n(), this.a);
        this.E = this.a.findViewById(R.id.single_category_container);
        if (!((Boolean) cful.ap.e()).booleanValue()) {
            this.E.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: dbxk
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    dbxp.this.h(view, windowInsets);
                    return windowInsets;
                }
            });
            WindowInsets rootWindowInsets = this.a.getRootWindowInsets();
            ContentGridView contentGridView = this.e;
            if (contentGridView != null && contentGridView.getVisibility() == 0 && rootWindowInsets != null) {
                this.E.dispatchApplyWindowInsets(rootWindowInsets);
            }
        }
        n(this.h);
        dcaeVar.gB(this.E);
    }

    public final void b() {
        if (this.n) {
            this.a.setVisibility(0);
            dbxo dbxoVar = this.c;
            ContentGridView contentGridView = this.e;
            loo.a(this.w);
            dbxoVar.m(contentGridView);
            this.n = false;
        }
        if (this.q) {
            this.c.d(this.r);
            this.q = false;
        }
        if (this.s) {
            this.c.j();
            this.s = false;
        }
        if (this.t) {
            this.c.h();
            this.t = false;
        }
        if (this.F) {
            this.c.a();
            this.F = false;
        }
    }

    public final void c() {
        ContentGridView contentGridView = this.e;
        if (contentGridView != null) {
            contentGridView.aQ(0, 0);
        }
    }

    public final void d(int i, int i2, int i3) {
        this.j = i;
        this.i = i2;
        this.k = i3;
    }

    public final void e(dbxo dbxoVar) {
        cxqz cxqzVar;
        this.c = dbxoVar;
        if (this.u) {
            this.u = false;
            return;
        }
        if (this.e != null) {
            b();
        }
        if (this.p && (cxqzVar = this.f) != null) {
            dbxoVar.b(cxqzVar);
            this.p = false;
            this.o = true;
        }
        if (this.o) {
            if (!dbxoVar.l()) {
                Log.e("Bugle", "Compose2oFragment: Processing intent results failed");
            }
            this.o = false;
        }
    }

    public final void f(int i) {
        this.d = i;
        ContentGridView contentGridView = this.e;
        if (contentGridView != null) {
            contentGridView.aR(i);
        }
    }

    public final void g() {
        if (this.e == null) {
            return;
        }
        boolean n = this.M.n();
        this.m = n;
        this.w.av(n);
        dbxo dbxoVar = this.c;
        if (dbxoVar != null) {
            dbxoVar.a();
        } else {
            this.F = true;
        }
    }

    public final void h(View view, WindowInsets windowInsets) {
        view.setPadding(0, this.w.B().getDimensionPixelSize(R.dimen.c2o_padding_top), 0, this.w.B().getDimensionPixelSize(R.dimen.c2o_padding_bottom) + (windowInsets != null ? windowInsets.getSystemWindowInsetBottom() : 0));
    }

    public final void i(Intent intent, int i, eptm eptmVar) {
        if (eptmVar != null) {
            intent.putExtra("EXTRA_OPENING_SOURCE", eptmVar.name());
        }
        intent.putExtra("EXTRA_OPENING_TIME", this.K.f().toEpochMilli());
        this.w.startActivityForResult(intent, i);
    }

    @Override // defpackage.dbxy
    public final void j(eptm eptmVar) {
        this.I.a(this.w);
        q(epts.EXTERNAL, eptmVar);
    }

    @Override // defpackage.dbxy
    public final void k(eisx eisxVar, eptm eptmVar, AttachmentQueueState attachmentQueueState) {
        Intent intent = new Intent(this.w.G(), (Class<?>) GalleryBrowserActivity.class);
        eiuy.c(intent, eisxVar);
        intent.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        intent.putExtra("draft_message_data", attachmentQueueState);
        intent.putExtra("theme_color", this.d);
        if (((Boolean) dedt.a.e()).booleanValue()) {
            intent.putExtra("EXTRA_MAX_ATTACHMENT_SIZE", this.k);
        }
        if (((Boolean) cjja.a.e()).booleanValue()) {
            intent.putExtra("EXTRA_IS_RCS_ON_OPEN", this.l);
        }
        i(intent, 124, eptmVar);
        q(epts.GALLERY, eptmVar);
    }

    @Override // defpackage.dbxy
    public final void l(eptm eptmVar) {
        this.B.F(this.w, this.j, this.i, this.k, eptmVar);
    }

    @Override // defpackage.dbxy
    public final void m(eptm eptmVar, int i) {
        this.x.c("Bugle.Share.LocationAttachmentPicker.Entered");
        Intent intent = new Intent(this.w.G(), (Class<?>) this.H.get());
        intent.putExtra("theme_color", this.d);
        intent.putExtra("message_type", i);
        i(intent, 125, eptmVar);
    }

    public final void n(boolean z) {
        this.h = z;
        View view = this.E;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
            ContentGridView contentGridView = this.e;
            if (contentGridView != null) {
                contentGridView.setVisibility(true != z ? 0 : 8);
            }
        }
    }

    public final boolean o() {
        return ctid.e(this.w.G(), this.L.a);
    }

    @Override // defpackage.dbxy
    public final boolean p(eptm eptmVar, AttachmentQueueState attachmentQueueState) {
        if (ctid.e(this.w.G(), this.L.a)) {
            this.M.h(R.string.camera_fullscreen_does_not_work_in_split_screen);
            return false;
        }
        Intent intent = new Intent(this.w.G(), (Class<?>) this.G.get());
        intent.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        intent.putExtra("draft_message_data", attachmentQueueState);
        intent.putExtra("theme_color", this.d);
        intent.putExtra("is_bubble_activity", this.L.a);
        intent.putExtra("IS_USING_C2O_CAMERA_GALLERY", true);
        i(intent, 126, eptmVar);
        return true;
    }

    public final void q(epts eptsVar, eptm eptmVar) {
        ((aled) this.J.b()).d(eptsVar, eptu.EXPANDED, eptmVar, epto.UNKNOWN_OPENING_STATE, 0, Duration.ofMillis(0L), null);
    }

    @Override // defpackage.dbxy
    public final void r(Intent intent) {
        dcfa dcfaVar = this.g;
        if (dcfaVar != null) {
            dcfaVar.a(intent);
        }
    }
}
