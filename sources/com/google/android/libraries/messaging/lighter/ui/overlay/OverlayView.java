package com.google.android.libraries.messaging.lighter.ui.overlay;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.card.MaterialCardView;
import defpackage.dzqb;
import defpackage.dzqo;
import defpackage.dzya;
import defpackage.dzyd;
import defpackage.dzyk;
import defpackage.emxc;
import defpackage.eyee;
import defpackage.fdql;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class OverlayView extends FrameLayout implements dzya {
    final LinearLayout a;
    public final MaterialCardView b;
    public final ImageView c;
    public final FrameLayout.LayoutParams d;
    public final FrameLayout.LayoutParams e;
    private final ImageView f;
    private final TextView g;
    private final LinearLayout h;
    private final FrameLayout.LayoutParams i;

    public OverlayView(Context context) {
        this(context, null);
    }

    public static boolean c(View view) {
        return view.getVisibility() == 0;
    }

    private static void d(View view, boolean z) {
        view.setVisibility(true != z ? 4 : 0);
    }

    private static boolean e(emxc emxcVar) {
        return emxcVar.g() && !((String) emxcVar.c()).isEmpty();
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.CharSequence, java.lang.Object] */
    public final void b(dzqo dzqoVar, boolean z) {
        this.a.removeAllViews();
        this.a.setVisibility(8);
        if (z) {
            this.i.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.overlay_card_view_top_margin);
        } else {
            this.i.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.overlay_card_view_top_collapsed_margin);
        }
        this.b.setLayoutParams(this.i);
        setClickable(false);
        setVisibility(0);
        setBackgroundColor(getContext().getColor(R.color.overlay_background_transparent_color));
        boolean z2 = dzqoVar.g().g() && ((dzqb) dzqoVar.g().c()).e().length != 0;
        if (z2) {
            Object c = dzqoVar.g().c();
            ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
            dzqb dzqbVar = (dzqb) c;
            layoutParams.height = dzyk.a(getContext(), dzqbVar.a());
            layoutParams.width = dzyk.a(getContext(), dzqbVar.b());
            this.f.setLayoutParams(layoutParams);
            this.f.setImageBitmap(BitmapFactory.decodeByteArray(dzqbVar.e(), 0, dzqbVar.e().length));
            this.f.setContentDescription(dzqbVar.d());
        } else if (dzqoVar.d().g()) {
            byte[] I = ((eyee) dzqoVar.d().c()).I();
            this.f.setImageBitmap(BitmapFactory.decodeByteArray(I, 0, I.length));
        }
        if (e(dzqoVar.e())) {
            this.g.setText((CharSequence) dzqoVar.e().c());
        }
        d(this.f, z2);
        d(this.g, e(dzqoVar.e()));
        d(this.c, !dzqoVar.i());
        if (c(this.f) || c(this.g) || c(this.c)) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(dzyd.a(context, fdql.i()), attributeSet, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.i = layoutParams;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        this.d = layoutParams2;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        this.e = layoutParams3;
        inflate(getContext(), R.layout.overlay_layout, this);
        this.f = (ImageView) findViewById(R.id.display_icon);
        this.g = (TextView) findViewById(R.id.title);
        this.a = (LinearLayout) findViewById(R.id.overlay_content);
        this.b = (MaterialCardView) findViewById(R.id.overlay_card_view);
        this.h = (LinearLayout) findViewById(R.id.overlay_header);
        this.c = (ImageView) findViewById(R.id.dismiss_button);
        layoutParams.setMargins(getResources().getDimensionPixelSize(R.dimen.overlay_card_view_left_right_margin), getResources().getDimensionPixelSize(R.dimen.overlay_card_view_top_margin), getResources().getDimensionPixelSize(R.dimen.overlay_card_view_left_right_margin), getResources().getDimensionPixelSize(R.dimen.overlay_card_view_bottom_margin));
        layoutParams.gravity = 0;
        layoutParams2.setMargins(getResources().getDimensionPixelSize(R.dimen.overlay_card_view_left_right_margin), 0, getResources().getDimensionPixelSize(R.dimen.overlay_card_view_left_right_margin), 0);
        layoutParams2.gravity = 17;
        layoutParams3.gravity = 80;
        getResources().getDimensionPixelSize(R.dimen.overlay_card_view_corner_radius);
    }
}
