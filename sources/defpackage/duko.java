package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duko {
    public static Point a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static void b(ImageView imageView, int i) {
        if (i <= 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
        }
    }

    public static void c(View view, View view2, int i, int i2) {
        view.post(new dukn(view2, i, i2, view));
    }
}
