package com.google.android.libraries.stickers.packdetails;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import defpackage.eeru;
import defpackage.eerv;
import defpackage.eeuj;
import defpackage.eeve;
import defpackage.eevj;
import defpackage.eevl;
import defpackage.eevm;
import defpackage.eulz;
import defpackage.ewmw;
import defpackage.ewnp;
import defpackage.eyfy;
import defpackage.eygu;
import defpackage.iy;
import defpackage.qpt;
import defpackage.qqs;
import defpackage.rff;
import defpackage.rig;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PackDetailsActivity extends iy implements eevl {
    private int n;
    private eevm o;

    @Override // defpackage.eevl
    public final boolean B() {
        return eeru.a(this.n);
    }

    @Override // defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        this.n = getIntent().getIntExtra("theme_mode", 0);
        if (B()) {
            setTheme(R.style.StickerDarkTheme);
        }
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalStateException("Missing extras. Did you launch the activity using PackDetailsActivity#launchActivity()?");
        }
        try {
            final ewnp ewnpVar = (ewnp) eyfy.parseFrom(ewnp.a, extras.getByteArray("sticker_pack"));
            eevm eevmVar = new eevm(this, this);
            this.o = eevmVar;
            setContentView(eevmVar);
            final eevm eevmVar2 = this.o;
            eevmVar2.m = ewnpVar;
            eevmVar2.p = eevmVar2.d.m(ewnpVar.b);
            eevmVar2.b();
            eevmVar2.f.setText(ewnpVar.e);
            eevmVar2.g.setText(ewnpVar.g);
            eevmVar2.h.setText(ewnpVar.f);
            int b = eulz.b(eevmVar2.d.i().b);
            eevmVar2.n = new eeve(ewnpVar, b == 0 || b != 5, eevmVar2.o);
            eevmVar2.j.am(eevmVar2.n);
            Resources resources = eevmVar2.e.getContext().getResources();
            qqs e = qpt.e(eevmVar2);
            ewmw ewmwVar = ewnpVar.d;
            if (ewmwVar == null) {
                ewmwVar = ewmw.a;
            }
            e.i(ewmwVar.c).q(new rig().H(eerv.b(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), eevmVar2.e, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).p(rff.b()).v(eevmVar2.e);
            eevmVar2.j.getViewTreeObserver().addOnGlobalLayoutListener(new eevj(eevmVar2));
            eevmVar2.i.setOnClickListener(new View.OnClickListener() { // from class: eevf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    eevm eevmVar3 = eevm.this;
                    eevmVar3.i.setClickable(false);
                    boolean z = !eevmVar3.p;
                    eevmVar3.p = z;
                    ewnp ewnpVar2 = ewnpVar;
                    eevmVar3.k = eevmVar3.d.g(ewnpVar2.b, z);
                    erqt.r(eevmVar3.k, new eevk(eevmVar3, view), eerw.a);
                    eevmVar3.d.a().b(ewnpVar2.b, eumg.PACK_DETAIL, eevmVar3.p);
                }
            });
            if (eevmVar2.isAttachedToWindow()) {
                ((eeuj) eevmVar2.d.a()).j(ewnpVar.b);
            }
            if (Build.VERSION.SDK_INT < 27) {
                return;
            }
            ((LinearLayout) findViewById(R.id.action_bar_root).getParent().getParent()).setSystemUiVisibility(1280);
            getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: eeva
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return windowInsets;
                }
            });
            this.o.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: eevb
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
                    return windowInsets;
                }
            });
        } catch (eygu e2) {
            throw new RuntimeException("Failed to parse sticker pack from intent.", e2);
        }
    }
}
