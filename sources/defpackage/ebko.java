package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebko extends ConstraintLayout {
    public ebko(Context context, CharSequence charSequence, Drawable drawable) {
        super(context);
        boolean z = true;
        LayoutInflater.from(context).inflate(R.layout.og_tooltip_content, (ViewGroup) this, true);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.og_slim_card_spacing);
        int[] iArr = kvo.a;
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        CharSequence string = ebow.a(context) ? context.getString(R.string.og_a11y_close) : null;
        e(R.id.og_tooltip_title, null);
        e(R.id.og_tooltip_detail, charSequence);
        e(R.id.og_tooltip_dismiss_button, string);
        boolean isEmpty = TextUtils.isEmpty(null);
        boolean z2 = !isEmpty;
        if (drawable != null) {
            ImageView imageView = (ImageView) findViewById(R.id.image);
            kjz kjzVar = (kjz) imageView.getLayoutParams();
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(true != z2 ? R.dimen.og_slim_card_image_size_small : R.dimen.og_slim_card_image_size_large);
            kjzVar.height = dimensionPixelSize2;
            kjzVar.width = dimensionPixelSize2;
            if (isEmpty) {
                z2 = false;
            } else {
                kkk kkkVar = new kkk();
                kkkVar.d(this);
                kkkVar.f(R.id.image, 3, 0, 3);
                kkkVar.f(R.id.image, 4, 0, 4);
                kkkVar.c(this);
                kjzVar.H = 0.0f;
                z2 = true;
            }
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(R.id.og_tooltip_detail);
        if (z2) {
            textView.setTextAppearance(ebnr.d(context, R.attr.ogTextAppearanceBody2));
            textView.setTextColor(dtqo.a(context, R.attr.slimCardDetailWithTitleTextColor));
        } else {
            textView.setTextAppearance(ebnr.d(context, R.attr.ogTextAppearanceBody1));
            textView.setTextColor(dtqo.a(context, R.attr.slimCardDetailTextColor));
            z = false;
        }
        String str = String.valueOf(charSequence) + "\n" + context.getString(R.string.og_open_account_and_settings);
        setContentDescription(z ? "null\n".concat(str) : str);
    }

    private final void e(int i, CharSequence charSequence) {
        TextView textView = (TextView) findViewById(i);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }
}
