package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drdy extends wr {
    public static final /* synthetic */ int w = 0;
    public final View s;
    public final ImageView t;
    public final TextView u;
    final /* synthetic */ drdz v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drdy(drdz drdzVar, View view) {
        super(view);
        this.v = drdzVar;
        this.s = view;
        View findViewById = view.findViewById(R.id.gifsticker_category_thumbnail);
        findViewById.getClass();
        this.t = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.gifsticker_category_label);
        findViewById2.getClass();
        this.u = (TextView) findViewById2;
    }
}
