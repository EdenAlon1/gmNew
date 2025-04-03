package com.google.android.libraries.user.profile.photopicker.common.view.error;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import defpackage.dvxi;
import defpackage.dvyc;
import defpackage.egdp;
import defpackage.egji;
import defpackage.fazf;
import defpackage.fdrm;
import defpackage.ku;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FullscreenErrorView extends egji {
    public dvyc d;
    public dvxi e;
    public MaterialButton f;
    public MaterialButton g;
    private AppCompatImageView i;
    private MaterialTextView j;

    public FullscreenErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!((egji) this).h) {
            Object context2 = getContext();
            while (!(context2 instanceof fazf) && (context2 instanceof ContextWrapper)) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            ((fazf) context2).ab().a(this);
        }
        if (fdrm.s()) {
            inflate(getContext(), R.layout.photo_picker_fullscreen_error_remove_settings, this);
        } else {
            inflate(getContext(), R.layout.photo_picker_fullscreen_error, this);
        }
        this.i = (AppCompatImageView) findViewById(R.id.photo_picker_error_image);
        this.j = (MaterialTextView) findViewById(R.id.photo_picker_error_text);
        this.f = (MaterialButton) findViewById(R.id.photo_picker_retry_button);
        this.d.b.a(110128).b(this);
        this.d.b.a(97066).b(this.f);
        if (fdrm.s()) {
            return;
        }
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.photo_picker_settings_button);
        this.g = materialButton;
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: egjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FullscreenErrorView fullscreenErrorView = FullscreenErrorView.this;
                fullscreenErrorView.e.a(dvxh.e(), fullscreenErrorView.g);
                fullscreenErrorView.getContext().startActivity(new Intent("android.settings.SETTINGS"));
            }
        });
        this.d.b.a(104981).b(this.g);
    }

    private final void j(int i) {
        Drawable a = ku.a(getContext(), i);
        a.setTint(getResources().getColor(R.color.google_grey500));
        this.i.setImageDrawable(a);
    }

    public final void b(final View.OnClickListener onClickListener) {
        this.f.setOnClickListener(new View.OnClickListener() { // from class: egjf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FullscreenErrorView fullscreenErrorView = FullscreenErrorView.this;
                fullscreenErrorView.e.a(dvxh.e(), fullscreenErrorView.f);
                onClickListener.onClick(view);
            }
        });
    }

    public final void c(egdp egdpVar) {
        int ordinal = egdpVar.ordinal();
        if (ordinal == 0) {
            f();
        } else if (ordinal == 1) {
            g();
        } else {
            if (ordinal != 2) {
                return;
            }
            d();
        }
    }

    public final void d() {
        j(R.drawable.quantum_gm_ic_cloud_off_vd_theme_24);
        this.j.setText(R.string.op3_check_your_connection);
        this.f.setVisibility(0);
        if (fdrm.s()) {
            return;
        }
        this.g.setVisibility(0);
    }

    public final void f() {
        j(R.drawable.quantum_gm_ic_alert_vd_theme_24);
        this.j.setText(R.string.op3_something_went_wrong);
        this.f.setVisibility(8);
        if (fdrm.s()) {
            return;
        }
        this.g.setVisibility(8);
    }

    public final void g() {
        j(R.drawable.quantum_gm_ic_alert_vd_theme_24);
        this.j.setText(R.string.op3_something_went_wrong);
        this.f.setVisibility(0);
        if (fdrm.s()) {
            return;
        }
        this.g.setVisibility(8);
    }
}
