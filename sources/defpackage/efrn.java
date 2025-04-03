package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.LocaleList;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.card.MaterialCardView;
import java.text.NumberFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efrn extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    private static final engw c = engw.v(Integer.valueOf(R.drawable.very_dissatisfied), Integer.valueOf(R.drawable.dissatisfied), Integer.valueOf(R.drawable.neutral), Integer.valueOf(R.drawable.satisfied), Integer.valueOf(R.drawable.very_satisfied));
    public efrm a;
    private fajw d;

    public efrn(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_question_rating_container, (ViewGroup) this, true);
    }

    public static void b(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setOnClickListener(null);
            viewGroup.getChildAt(i).setClickable(false);
        }
    }

    public static void c(ViewGroup viewGroup, int i, Drawable drawable, Drawable drawable2) {
        int i2 = 0;
        while (i2 < viewGroup.getChildCount()) {
            ((ImageView) viewGroup.getChildAt(i2).findViewById(R.id.survey_rating_image_icon)).setImageDrawable(i2 >= i ? drawable : drawable2);
            i2++;
        }
    }

    public static boolean e(MotionEvent motionEvent, View view) {
        return motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) view.getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) view.getHeight());
    }

    private final Drawable f(int i, int i2) {
        return efoo.a(getContext().getDrawable(i), getContext(), i2);
    }

    private static void g(TextView textView, String str) {
        textView.setText(str);
        textView.setContentDescription(str);
    }

    private final void h(View view, int i, int i2, int i3) {
        LocaleList locales;
        Locale locale;
        locales = getContext().getResources().getConfiguration().getLocales();
        locale = locales.get(0);
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        String format = numberFormat.format(i);
        String format2 = numberFormat.format(i2);
        String string = getContext().getString(R.string.survey_num_rating, format, format2);
        if (i3 == 4) {
            string = getResources().getQuantityString(R.plurals.survey_star_rating, i, Integer.valueOf(i), Integer.valueOf(i2));
            i3 = 4;
        }
        if (i == 1) {
            string = string + " " + this.d.e;
        } else if (i == i2) {
            string = string + " " + this.d.f;
        }
        if (i3 == 3) {
            string = getContext().getString(R.string.survey_smiley_rating, format, format2, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : getContext().getString(R.string.survey_very_satisfied) : getContext().getString(R.string.survey_somewhat_satisfied) : getContext().getString(R.string.survey_neutral) : getContext().getString(R.string.survey_somewhat_dissatisfied) : getContext().getString(R.string.survey_very_dissatisfied));
        }
        view.setContentDescription(string);
    }

    public final int a(int i) {
        return getContext().getColor(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(fajw fajwVar) {
        this.d = fajwVar;
        int i = fajwVar.c;
        if (i < 2 || i > 7) {
            throw new IllegalArgumentException("Number of ratings must be between 2 and 7.");
        }
        int a = fajv.a(fajwVar.b);
        if (a == 0 || a != 6) {
            g((TextView) findViewById(R.id.survey_rating_low_value_text), fajwVar.e);
            g((TextView) findViewById(R.id.survey_rating_high_value_text), fajwVar.f);
        }
        int i2 = fajwVar.b;
        int a2 = fajv.a(i2);
        int i3 = R.id.survey_rating_image_icon;
        int i4 = R.id.survey_rating_image_layout;
        if (a2 != 0 && a2 == 3) {
            final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater from = LayoutInflater.from(getContext());
            int i5 = ((enou) c).c;
            final int i6 = 0;
            while (i6 < i5) {
                View inflate = from.inflate(R.layout.survey_question_rating_image_item, viewGroup, false);
                if (i6 == 0) {
                    inflate.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    i6 = 0;
                }
                final FrameLayout frameLayout = (FrameLayout) inflate.findViewById(i4);
                final ImageView imageView = (ImageView) frameLayout.findViewById(i3);
                imageView.setImageDrawable(efoo.a(getContext().getDrawable(((Integer) c.get(i6)).intValue()), getContext(), a(R.color.survey_grey_icon_color)));
                i6++;
                imageView.setTag(Integer.valueOf(i6));
                h(imageView, i6, i5, 3);
                frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: efrg
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        FrameLayout frameLayout2 = frameLayout;
                        efrn efrnVar = efrn.this;
                        ImageView imageView2 = imageView;
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            if (!efrn.e(motionEvent, view)) {
                                return true;
                            }
                            frameLayout2.setPressed(true);
                            efoo.e(imageView2, efrnVar.getContext(), efrnVar.a(R.color.survey_accent_color));
                            return true;
                        }
                        if (action == 1) {
                            if (!frameLayout2.isPressed()) {
                                return true;
                            }
                            frameLayout2.performClick();
                            return true;
                        }
                        if (action != 2) {
                            return false;
                        }
                        if (efrn.e(motionEvent, view)) {
                            return true;
                        }
                        frameLayout2.setPressed(false);
                        efoo.e(imageView2, efrnVar.getContext(), efrnVar.a(R.color.survey_grey_icon_color));
                        return true;
                    }
                });
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: efrh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        efrn.b(viewGroup);
                        Handler handler = new Handler();
                        final efrn efrnVar = efrn.this;
                        final int i7 = i6;
                        handler.postDelayed(new Runnable() { // from class: efrl
                            @Override // java.lang.Runnable
                            public final void run() {
                                efrn efrnVar2 = efrn.this;
                                efrm efrmVar = efrnVar2.a;
                                if (efrmVar != null) {
                                    efrmVar.a(i7);
                                    efrnVar2.a = null;
                                }
                            }
                        }, 250L);
                    }
                });
                viewGroup.addView(inflate);
                i3 = R.id.survey_rating_image_icon;
                i4 = R.id.survey_rating_image_layout;
            }
            return;
        }
        int a3 = fajv.a(i2);
        if (a3 != 0 && a3 == 5) {
            final ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater from2 = LayoutInflater.from(getContext());
            int i7 = this.d.c;
            final int i8 = 0;
            while (i8 < i7) {
                View inflate2 = from2.inflate(R.layout.survey_question_rating_number_item, viewGroup2, false);
                if (i8 == 0) {
                    inflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    i8 = 0;
                }
                final FrameLayout frameLayout2 = (FrameLayout) inflate2.findViewById(R.id.survey_rating_number_layout);
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.survey_rating_number_large_button_horizontal_padding);
                viewGroup2.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                final MaterialCardView materialCardView = (MaterialCardView) frameLayout2.findViewById(R.id.survey_rating_number_card);
                int dimension = (int) getResources().getDimension(R.dimen.survey_rating_number_large_side_length);
                ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                layoutParams.width = dimension;
                layoutParams.height = dimension;
                materialCardView.setLayoutParams(layoutParams);
                final TextView textView = (TextView) materialCardView.findViewById(R.id.survey_rating_number_text);
                i8++;
                textView.setTag(Integer.valueOf(i8));
                textView.setText(String.valueOf(i8));
                h(textView, i8, i7, 5);
                frameLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: efrb
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        FrameLayout frameLayout3 = frameLayout2;
                        efrn efrnVar = efrn.this;
                        MaterialCardView materialCardView2 = materialCardView;
                        TextView textView2 = textView;
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            if (!efrn.e(motionEvent, view)) {
                                return true;
                            }
                            frameLayout3.setPressed(true);
                            materialCardView2.gu(efrnVar.a(R.color.survey_accent_color));
                            textView2.setTextColor(efrnVar.a(R.color.survey_surface_color_elevation_2));
                            return true;
                        }
                        if (action == 1) {
                            if (!frameLayout3.isPressed()) {
                                return true;
                            }
                            frameLayout3.performClick();
                            return true;
                        }
                        if (action != 2) {
                            return false;
                        }
                        if (efrn.e(motionEvent, view)) {
                            return true;
                        }
                        frameLayout3.setPressed(false);
                        materialCardView2.gu(efrnVar.a(R.color.google_transparent));
                        textView2.setTextColor(efrnVar.a(R.color.survey_primary_text_color));
                        return true;
                    }
                });
                frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: efrc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        efrn.b(viewGroup2);
                        Handler handler = new Handler();
                        final efrn efrnVar = efrn.this;
                        final int i9 = i8;
                        handler.postDelayed(new Runnable() { // from class: efri
                            @Override // java.lang.Runnable
                            public final void run() {
                                efrn efrnVar2 = efrn.this;
                                efrm efrmVar = efrnVar2.a;
                                if (efrmVar != null) {
                                    efrmVar.a(i9);
                                    efrnVar2.a = null;
                                }
                            }
                        }, 250L);
                    }
                });
                viewGroup2.addView(inflate2);
            }
            return;
        }
        int a4 = fajv.a(i2);
        if (a4 == 0 || a4 != 4) {
            int a5 = fajv.a(i2);
            if (a5 != 0 && a5 == 6) {
                int a6 = a(R.color.survey_grey_icon_color);
                Drawable f = f(R.drawable.quantum_ic_thumb_up_grey600_36, a6);
                Drawable f2 = f(R.drawable.quantum_ic_thumb_down_grey600_36, a6);
                final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.survey_rating_images_container);
                linearLayout.setGravity(17);
                View inflate3 = LayoutInflater.from(getContext()).inflate(R.layout.survey_question_rating_thumb_item, (ViewGroup) linearLayout, false);
                ImageView imageView2 = (ImageView) inflate3.findViewById(R.id.survey_rating_thumb_up_icon);
                imageView2.setImageDrawable(f);
                imageView2.setContentDescription(this.d.e);
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: efqz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        efrn.b(linearLayout);
                        Handler handler = new Handler();
                        final efrn efrnVar = efrn.this;
                        handler.postDelayed(new Runnable() { // from class: efre
                            @Override // java.lang.Runnable
                            public final void run() {
                                efrn efrnVar2 = efrn.this;
                                efrm efrmVar = efrnVar2.a;
                                if (efrmVar != null) {
                                    efrmVar.a(1);
                                    efrnVar2.a = null;
                                }
                            }
                        }, 250L);
                    }
                });
                ImageView imageView3 = (ImageView) inflate3.findViewById(R.id.survey_rating_thumb_down_icon);
                imageView3.setImageDrawable(f2);
                imageView3.setContentDescription(this.d.f);
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: efrd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        efrn.b(linearLayout);
                        Handler handler = new Handler();
                        final efrn efrnVar = efrn.this;
                        handler.postDelayed(new Runnable() { // from class: efrf
                            @Override // java.lang.Runnable
                            public final void run() {
                                efrn efrnVar2 = efrn.this;
                                efrm efrmVar = efrnVar2.a;
                                if (efrmVar != null) {
                                    efrmVar.a(2);
                                    efrnVar2.a = null;
                                }
                            }
                        }, 250L);
                    }
                });
                linearLayout.addView(inflate3);
                return;
            }
            return;
        }
        int a7 = a(R.color.survey_accent_color);
        Drawable f3 = f(R.drawable.quantum_ic_star_border_grey600_36, a(R.color.survey_grey_icon_color));
        final Drawable f4 = f(R.drawable.quantum_ic_star_grey600_36, a7);
        final ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
        LayoutInflater from3 = LayoutInflater.from(getContext());
        int i9 = this.d.c;
        final int i10 = 0;
        while (i10 < i9) {
            View inflate4 = from3.inflate(R.layout.survey_question_rating_image_item, viewGroup3, false);
            if (i10 == 0) {
                inflate4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                i10 = 0;
            }
            final FrameLayout frameLayout3 = (FrameLayout) inflate4.findViewById(R.id.survey_rating_image_layout);
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.survey_rating_image_large_button_horizontal_padding);
            viewGroup3.setPadding(dimensionPixelOffset2, 0, dimensionPixelOffset2, 0);
            ImageView imageView4 = (ImageView) frameLayout3.findViewById(R.id.survey_rating_image_icon);
            imageView4.setImageDrawable(f3);
            i10++;
            imageView4.setTag(Integer.valueOf(i10));
            h(imageView4, i10, i9, 4);
            final Drawable drawable = f3;
            frameLayout3.setOnTouchListener(new View.OnTouchListener() { // from class: efrj
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i11 = efrn.b;
                    ViewGroup viewGroup4 = viewGroup3;
                    FrameLayout frameLayout4 = frameLayout3;
                    int i12 = i10;
                    Drawable drawable2 = drawable;
                    int action = motionEvent.getAction();
                    Drawable drawable3 = f4;
                    if (action == 0) {
                        if (!efrn.e(motionEvent, view)) {
                            return true;
                        }
                        frameLayout4.setPressed(true);
                        efrn.c(viewGroup4, i12, drawable2, drawable3);
                        return true;
                    }
                    if (action == 1) {
                        if (!frameLayout4.isPressed()) {
                            return true;
                        }
                        frameLayout4.performClick();
                        efrn.c(viewGroup4, i12, drawable2, drawable3);
                        return true;
                    }
                    if (action != 2) {
                        return false;
                    }
                    if (efrn.e(motionEvent, view)) {
                        return true;
                    }
                    frameLayout4.setPressed(false);
                    efrn.c(viewGroup4, 0, drawable2, drawable3);
                    return true;
                }
            });
            frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: efrk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    efrn.b(viewGroup3);
                    Handler handler = new Handler();
                    final efrn efrnVar = efrn.this;
                    final int i11 = i10;
                    handler.postDelayed(new Runnable() { // from class: efra
                        @Override // java.lang.Runnable
                        public final void run() {
                            efrn efrnVar2 = efrn.this;
                            efrm efrmVar = efrnVar2.a;
                            if (efrmVar != null) {
                                efrmVar.a(i11);
                                efrnVar2.a = null;
                            }
                        }
                    }, 250L);
                }
            });
            viewGroup3.addView(inflate4);
            f3 = drawable;
        }
    }
}
