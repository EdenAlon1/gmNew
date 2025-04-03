package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drro {
    public static final /* synthetic */ int c = 0;
    private static final Duration d;
    public boolean a;
    public final ffbz b = ffca.a(new ffix() { // from class: drrk
        @Override // defpackage.ffix
        public final Object invoke() {
            int i = drro.c;
            return new dqkz(new ffjm() { // from class: drrm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ViewGroup viewGroup = (ViewGroup) obj;
                    ImageView imageView = (ImageView) obj2;
                    int i2 = drro.c;
                    viewGroup.getClass();
                    imageView.getClass();
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.selection_layout, viewGroup, false);
                    inflate.getClass();
                    TextView textView = (TextView) inflate;
                    viewGroup.addView(textView);
                    textView.setOutlineProvider(imageView.getOutlineProvider());
                    textView.setClipToOutline(true);
                    return textView;
                }
            });
        }
    });

    static {
        Duration ofMillis = Duration.ofMillis(150L);
        ofMillis.getClass();
        d = ofMillis;
    }

    public static final void a(View view, TextView textView, float f, float f2, final ffix ffixVar) {
        textView.setVisibility(0);
        ViewPropertyAnimator animate = view.animate();
        Duration duration = d;
        animate.setDuration(duration.toMillis());
        animate.scaleX(f);
        animate.scaleY(f);
        if (ffixVar != null) {
            animate.withEndAction(new Runnable() { // from class: drrl
                @Override // java.lang.Runnable
                public final void run() {
                    int i = drro.c;
                    ffix.this.invoke();
                }
            });
        }
        animate.start();
        ViewPropertyAnimator animate2 = textView.animate();
        animate2.setDuration(duration.toMillis());
        animate2.alpha(f2);
        animate2.start();
    }

    public static final void b(TextView textView, int i) {
        String string = textView.getResources().getString(R.string.selection_position_text, Integer.valueOf(i + 1));
        string.getClass();
        textView.setText(string);
    }

    public static final void c(View view, TextView textView, float f, float f2) {
        view.setScaleX(f);
        view.setScaleY(f);
        textView.setAlpha(f2);
    }
}
