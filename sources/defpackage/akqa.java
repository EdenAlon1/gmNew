package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akqa {
    public final Context a;

    public akqa(Context context) {
        this.a = context;
    }

    public final ObjectAnimator a(View view, float f, float f2, long j) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, f, f2));
        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        ofPropertyValuesHolder.setStartDelay(j);
        ofPropertyValuesHolder.setDuration(this.a.getResources().getInteger(R.integer.scheduled_messages_alpha_animation_duration));
        return ofPropertyValuesHolder;
    }

    public final ObjectAnimator b(View view, float f, float f2, long j) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f, f2));
        ofPropertyValuesHolder.setInterpolator(new ljm());
        ofPropertyValuesHolder.setStartDelay(j);
        ofPropertyValuesHolder.setDuration(this.a.getResources().getInteger(R.integer.scheduled_messages_translation_animation_duration));
        return ofPropertyValuesHolder;
    }
}
