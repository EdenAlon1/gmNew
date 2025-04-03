package com.google.android.libraries.hats20.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.ui.StarRatingBar;
import defpackage.cmh;
import defpackage.dulf;
import defpackage.dulg;
import defpackage.dulh;
import defpackage.enhk;
import defpackage.euke;
import defpackage.pcj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RatingView extends LinearLayout {
    private static final enhk b;
    public dulh a;
    private euke c;

    static {
        cmh cmhVar = new cmh();
        cmhVar.put(0, Integer.valueOf(R.drawable.ic_sentiment_very_dissatisfied_grey600_36dp));
        cmhVar.put(1, Integer.valueOf(R.drawable.ic_sentiment_dissatisfied_grey600_36dp));
        cmhVar.put(2, Integer.valueOf(R.drawable.ic_sentiment_neutral_grey600_36dp));
        cmhVar.put(3, Integer.valueOf(R.drawable.ic_sentiment_satisfied_grey600_36dp));
        cmhVar.put(4, Integer.valueOf(R.drawable.ic_sentiment_very_satisfied_grey600_36dp));
        b = enhk.j(cmhVar);
    }

    public RatingView(Context context) {
        super(context);
        c(context);
    }

    private final void c(Context context) {
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.hats_survey_rating_smiley_star, (ViewGroup) this, true);
        context.getSystemService("accessibility");
    }

    private static final void d(TextView textView, String str) {
        textView.setText(str);
        textView.setContentDescription(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view, int i, int i2) {
        String format = String.format("%d of %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1) {
            format = format + " " + ((String) this.c.c.get(0));
        } else if (i == i2) {
            format = format + " " + ((String) this.c.c.get(1));
        }
        view.setContentDescription(format);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(euke eukeVar, boolean z) {
        this.c = eukeVar;
        d((TextView) findViewById(R.id.hats_lib_survey_rating_low_value_text), (String) eukeVar.c.get(0));
        d((TextView) findViewById(R.id.hats_lib_survey_rating_high_value_text), (String) eukeVar.c.get(1));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.hats_lib_survey_rating_images_container);
        StarRatingBar starRatingBar = (StarRatingBar) findViewById(R.id.hats_lib_star_rating_bar);
        if (!z) {
            starRatingBar.setVisibility(0);
            int i = eukeVar.b;
            if (i < 3) {
                throw new IllegalArgumentException("numStars must be at least 3");
            }
            starRatingBar.a = i;
            starRatingBar.requestLayout();
            starRatingBar.b = new dulg(this, starRatingBar, eukeVar);
            return;
        }
        viewGroup.setVisibility(0);
        LayoutInflater from = LayoutInflater.from(getContext());
        int i2 = 0;
        while (i2 < 5) {
            View inflate = from.inflate(R.layout.hats_survey_question_rating_item, viewGroup, false);
            ((ImageView) inflate.findViewById(R.id.hats_lib_survey_rating_icon)).setImageDrawable(pcj.b(getResources(), ((Integer) b.get(Integer.valueOf(i2))).intValue(), null));
            int i3 = i2 + 1;
            inflate.setTag(Integer.valueOf(i3));
            a(inflate, i3, 5);
            inflate.setOnClickListener(new dulf(this, viewGroup, i3));
            if (i2 != 0) {
                if (i2 != 4) {
                    viewGroup.addView(inflate);
                    i2 = i3;
                } else {
                    i2 = 4;
                }
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.getLayoutParams();
            if (i2 == 0) {
                layoutParams.setMargins(0, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
            } else {
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, 0, layoutParams.bottomMargin);
            }
            inflate.setLayoutParams(layoutParams);
            viewGroup.addView(inflate);
            i2 = i3;
        }
    }

    public RatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public RatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }

    public RatingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c(context);
    }
}
