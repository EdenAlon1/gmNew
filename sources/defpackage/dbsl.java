package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.util.Property;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.ditto.CameraSourcePreview;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsl implements dbru {
    public static final entd a = entd.c("BugleDitto");
    public static final cfup b = cfvl.i(cfvl.b, "enable_desktop_pair_with_test_only", false);
    public static final cfup c = cfvl.h(cfvl.b, "desktop_pair_with_test_only", "");
    public final dbsy d;
    public final ffbr e;
    public final dbrz f;
    public final ejxn g;
    public final elbx h;
    public final Activity i;
    public final dbsa j;
    public final ffbr k;
    public dbrt l;
    public dbsk m;
    public dhvy n;
    public dbrs o;
    public dbsi p;
    public CameraSourcePreview q;
    public View r;
    public iv s;
    public ejxm t;

    public dbsl(dbsy dbsyVar, ffbr ffbrVar, ffbr ffbrVar2, dbrz dbrzVar, ejxn ejxnVar, elbx elbxVar, Activity activity, dbsa dbsaVar) {
        this.d = dbsyVar;
        this.e = ffbrVar;
        this.k = ffbrVar2;
        this.f = dbrzVar;
        this.g = ejxnVar;
        this.h = elbxVar;
        this.i = activity;
        this.j = dbsaVar;
    }

    @Override // defpackage.dbru
    public final void a(boolean z) {
        dbrs dbrsVar = this.o;
        if (dbrsVar == null) {
            return;
        }
        if (z) {
            dbrsVar.a(this.p);
        } else {
            dbrsVar.a(new dbsj());
        }
    }

    @Override // defpackage.dbru
    public final void b(boolean z, boolean z2) {
        if (this.j.aF()) {
            d();
            if (!z) {
                this.r.setVisibility(8);
                return;
            }
            ProgressBar progressBar = (ProgressBar) this.r.findViewById(R.id.qr_loading_progress_bar);
            View findViewById = this.r.findViewById(R.id.qr_loading_overlay_background);
            if (!z2) {
                progressBar.setVisibility(0);
                findViewById.setVisibility(0);
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(c(progressBar, findViewById));
                animatorSet.start();
            }
        }
    }

    public final List c(View... viewArr) {
        ArrayList arrayList = new ArrayList(2);
        int integer = this.i.getResources().getInteger(android.R.integer.config_shortAnimTime);
        for (int i = 0; i < 2; i++) {
            View view = viewArr[i];
            if (view.getVisibility() != 0) {
                view.setAlpha(0.0f);
                view.setVisibility(0);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat.setDuration(integer);
                arrayList.add(ofFloat);
            }
        }
        return arrayList;
    }

    public final void d() {
        iv ivVar = this.s;
        if (ivVar != null) {
            ivVar.dismiss();
        }
        this.s = null;
    }

    public final void e() {
        CameraSourcePreview cameraSourcePreview;
        dhvy dhvyVar = this.n;
        if (dhvyVar == null || (cameraSourcePreview = this.q) == null) {
            return;
        }
        try {
            cameraSourcePreview.b = dhvyVar;
            if (cameraSourcePreview.d) {
                return;
            }
            cameraSourcePreview.c = true;
            cameraSourcePreview.a();
        } catch (IOException e) {
            csjy.h("Bugle", e, "Error starting QR Scanner");
            dhvy dhvyVar2 = this.n;
            if (dhvyVar2 != null) {
                dhvyVar2.a();
                this.n = null;
            }
            this.i.finish();
        }
    }
}
