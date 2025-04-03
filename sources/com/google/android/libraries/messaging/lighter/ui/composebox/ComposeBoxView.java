package com.google.android.libraries.messaging.lighter.ui.composebox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.composebox.ComposeBoxView;
import defpackage.clx;
import defpackage.cly;
import defpackage.dyhk;
import defpackage.dzxm;
import defpackage.dzyd;
import defpackage.dzyj;
import defpackage.dzyk;
import defpackage.dzyu;
import defpackage.dzyw;
import defpackage.dzyz;
import defpackage.dzza;
import defpackage.dzzc;
import defpackage.ehdr;
import defpackage.ehga;
import defpackage.fdql;
import defpackage.kpp;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ComposeBoxView extends CardView implements dzyu {
    public final LighterEditText g;
    public boolean h;
    private final LinearLayout i;
    private final ImageButton j;
    private final ViewGroup k;

    static {
        Color.parseColor("#F1F3F4");
        Color.parseColor("#1A73E8");
        Color.parseColor("#9AA0A6");
    }

    public ComposeBoxView(Context context) {
        this(context, null);
    }

    private final int h(float f) {
        return dzyk.a(getContext(), f);
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final dzyw dzywVar = (dzyw) obj;
        this.j.setOnClickListener(new View.OnClickListener() { // from class: dzyy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComposeBoxView composeBoxView = ComposeBoxView.this;
                dzywVar.b.a(composeBoxView.g.getText() == null ? null : composeBoxView.g.getText().toString());
                composeBoxView.g.setText("");
            }
        });
        this.g.addTextChangedListener(new dzyz(this, dzywVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzyu
    public final void b(dzxm dzxmVar) {
        this.k.removeAllViews();
        this.k.addView((View) dzxmVar);
    }

    @Override // defpackage.dzyu
    public final void c(CharSequence charSequence) {
        this.g.setText(charSequence);
        this.g.setSelection(charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.g.clearFocus();
    }

    public final void g(boolean z) {
        this.j.setEnabled(z);
        this.j.setColorFilter(z ? ehdr.b(this, R.attr.colorPrimary) : ehdr.b(this, R.attr.colorOnSurfaceVariant), PorterDuff.Mode.SRC_IN);
    }

    public ComposeBoxView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.composeBoxStyle);
    }

    public ComposeBoxView(Context context, AttributeSet attributeSet, int i) {
        super(dzyd.a(context, fdql.i()), attributeSet, i);
        this.h = false;
        inflate(getContext(), R.layout.compose_view_layout, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_container);
        this.i = linearLayout;
        ImageButton imageButton = (ImageButton) findViewById(R.id.send_message_button);
        this.j = imageButton;
        LighterEditText lighterEditText = (LighterEditText) findViewById(R.id.compose);
        this.g = lighterEditText;
        this.k = (ViewGroup) findViewById(R.id.attachment_preview_container);
        imageButton.setImageResource(R.drawable.quantum_gm_ic_send_vd_24);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dzzc.a, i, R.style.LighterComposeBox);
        gu(ehga.a(R.dimen.m3_sys_elevation_level3, getContext()));
        gw(obtainStyledAttributes.getDimension(1, getResources().getDimension(R.dimen.compose_box_border_radius)));
        gv(0.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(h(1.0f), ehga.a(R.dimen.m3_sys_elevation_level3, getContext()));
        linearLayout.setBackground(gradientDrawable);
        if (dyhk.a(getContext())) {
            linearLayout.setPadding(h(0.0f), h(0.0f), h(12.0f), h(0.0f));
        } else {
            linearLayout.setPadding(h(12.0f), h(0.0f), h(0.0f), h(0.0f));
        }
        if (!this.a) {
            this.a = true;
            cly clyVar = CardView.e;
            clx clxVar = this.f;
            clyVar.a(clxVar, cly.b(clxVar));
        }
        lighterEditText.setTextAppearance(obtainStyledAttributes.getResourceId(2, R.style.ComposeBoxInputText));
        lighterEditText.setTypeface(kpp.b(getContext(), R.font.google_sans_text));
        lighterEditText.setHighlightColor(getResources().getColor(true != dzyd.c(getContext()) ? R.color.input_text_highlight_font_color_dark : R.color.input_text_highlight_font_color_light));
        lighterEditText.setHintTextColor(obtainStyledAttributes.getColor(0, ehdr.b(this, R.attr.colorOnSurfaceVariant)));
        lighterEditText.setHint(R.string.composebox_text_placeholder);
        lighterEditText.addTextChangedListener(new dzza(this));
        lighterEditText.setBackgroundColor(0);
        lighterEditText.setInputType(147457);
        g(false);
        dzyj.a(lighterEditText, ehdr.b(this, R.attr.colorPrimary));
        obtainStyledAttributes.recycle();
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: dzyx
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    ComposeBoxView.this.g.requestFocus();
                }
            }
        });
    }
}
