package com.google.android.libraries.compose.cameragallery.ui.camera.inapp;

import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;
import defpackage.dpnz;
import defpackage.dpoa;
import defpackage.dpob;
import defpackage.dpoc;
import defpackage.dpoe;
import defpackage.dpog;
import defpackage.dpoi;
import defpackage.dptq;
import defpackage.dptz;
import defpackage.dqlf;
import defpackage.dqli;
import defpackage.dszy;
import defpackage.eg;
import defpackage.ffbz;
import defpackage.ffca;
import defpackage.ffdx;
import defpackage.ffix;
import defpackage.ffkb;
import defpackage.ffkj;
import defpackage.fflc;
import defpackage.ffqy;
import defpackage.ffsk;
import defpackage.hpw;
import defpackage.lmn;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CameraActivity extends dptz {
    public static final List n = ffdx.g(dqlf.a, dqlf.g);
    public eg o;
    public dqli p;
    public ffsk q;
    public Optional r;
    public ComposeView s;
    public View t;
    private final ffbz v = ffca.a(new ffix() { // from class: dpnv
        @Override // defpackage.ffix
        public final Object invoke() {
            View rootView = CameraActivity.this.getWindow().getDecorView().getRootView();
            rootView.getClass();
            return new dszy(rootView);
        }
    });

    public CameraActivity() {
        ffca.a(new ffix() { // from class: dpnw
            @Override // defpackage.ffix
            public final Object invoke() {
                Optional optional = CameraActivity.this.r;
                if (optional == null) {
                    ffkj.c("providedFullScreenCameraContentConfiguration");
                    optional = null;
                }
                optional.isPresent();
                return optional.get();
            }
        });
    }

    public static final dptq k(ffbz ffbzVar) {
        return (dptq) ffbzVar.a();
    }

    public final eg j() {
        eg egVar = this.o;
        if (egVar != null) {
            return egVar;
        }
        ffkj.c("activity");
        return null;
    }

    public final dqli l() {
        dqli dqliVar = this.p;
        if (dqliVar != null) {
            return dqliVar;
        }
        ffkj.c("permissionsManager");
        return null;
    }

    public final dszy m() {
        return (dszy) this.v.a();
    }

    public final ffsk n() {
        ffsk ffskVar = this.q;
        if (ffskVar != null) {
            return ffskVar;
        }
        ffkj.c("uiScope");
        return null;
    }

    public final void o() {
        ComposeView composeView = this.s;
        ComposeView composeView2 = null;
        if (composeView == null) {
            ffkj.c("cameraComposeView");
            composeView = null;
        }
        composeView.setVisibility(0);
        eg j = j();
        dpoa dpoaVar = new dpoa(j);
        int i = fflc.a;
        lmn lmnVar = new lmn(new ffkb(dptq.class), new dpob(j), dpoaVar, new dpoc(j));
        ffqy.d(n(), null, null, new dpoe(lmnVar, this, null), 3);
        ffqy.d(n(), null, null, new dpog(lmnVar, this, null), 3);
        ComposeView composeView3 = this.s;
        if (composeView3 == null) {
            ffkj.c("cameraComposeView");
        } else {
            composeView2 = composeView3;
        }
        composeView2.a(new hpw(-1228945405, true, new dpoi(lmnVar)));
    }

    @Override // defpackage.dptz, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WindowInsetsController windowInsetsController;
        int statusBars;
        super.onCreate(bundle);
        getTheme().applyStyle(R.style.Theme_GoogleMaterial3_Dark, true);
        if (Build.VERSION.SDK_INT >= 31) {
            getTheme().applyStyle(R.style.ThemeOverlay_GoogleMaterial3_DynamicColors_Dark, true);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            windowInsetsController = getWindow().getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                statusBars = WindowInsets.Type.statusBars();
                windowInsetsController.hide(statusBars);
            }
        } else {
            getWindow().getDecorView().setSystemUiVisibility(4);
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        setContentView(R.layout.camera_activity);
        this.s = (ComposeView) findViewById(R.id.camera_compose_view);
        this.t = findViewById(R.id.error_prompt);
        getWindow().addFlags(128);
    }

    @Override // defpackage.eg, android.app.Activity
    protected final void onResume() {
        super.onResume();
        ffqy.d(n(), null, null, new dpnz(this, null), 3);
    }
}
