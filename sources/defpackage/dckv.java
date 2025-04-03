package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dckv extends wr {
    public static final /* synthetic */ int w = 0;
    final TextView s;
    final TextView t;
    final TextView u;
    final ImageView v;

    public dckv(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.nearby_place_name);
        this.t = (TextView) view.findViewById(R.id.nearby_place_address);
        this.u = (TextView) view.findViewById(R.id.nearby_place_distance);
        this.v = (ImageView) view.findViewById(R.id.nearby_place_image);
    }
}
