package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dszy {
    private final ImageView a;
    private final TextView b;
    private final TextView c;
    private final Button d;

    public dszy(View view) {
        View inflate = ((ViewStub) kvo.b(view, R.id.error_prompt)).inflate();
        this.a = (ImageView) kvo.b(inflate, R.id.error_image);
        this.b = (TextView) kvo.b(inflate, R.id.error_description);
        this.c = (TextView) kvo.b(inflate, R.id.error_caption);
        this.d = (Button) kvo.b(inflate, R.id.error_button);
    }

    public static /* synthetic */ void c(dszy dszyVar, Integer num, Integer num2, Integer num3, Integer num4, View.OnClickListener onClickListener, int i) {
        Drawable drawable;
        if (1 == (i & 1)) {
            num = null;
        }
        ImageView imageView = dszyVar.a;
        if (num != null) {
            num.intValue();
            Context context = imageView.getContext();
            if (context != null) {
                num.intValue();
                drawable = context.getDrawable(R.drawable.quantum_gm_ic_sentiment_dissatisfied_vd_theme_24);
            } else {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        imageView.setVisibility(num != null ? 0 : 8);
        TextView textView = dszyVar.b;
        if (num2 != null) {
            num2.intValue();
            textView.setText(num2.intValue());
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        textView.setVisibility(num2 != null ? 0 : 8);
        TextView textView2 = dszyVar.c;
        if (num3 != null) {
            textView2.setText(num3.intValue());
        }
        textView2.setVisibility(num3 != null ? 0 : 8);
        Button button = dszyVar.d;
        if (num4 != null) {
            num4.intValue();
            button.setText(num4.intValue());
            button.setOnClickListener(onClickListener);
        }
        button.setVisibility(num4 == null ? 8 : 0);
    }

    public final void a() {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
    }

    public final void b(int i, int i2) {
        Button button = this.d;
        button.setBackgroundTintList(ColorStateList.valueOf(i));
        button.setTextColor(i2);
    }
}
