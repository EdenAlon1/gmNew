package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddtc extends wr {
    public final View s;
    public final ImageView t;
    public final crly u;

    public ddtc(View view) {
        super(view);
        this.s = view;
        this.t = (ImageView) view.findViewById(R.id.zero_state_search_photo_thumbnail);
        this.u = new crly(view, R.id.zero_state_search_photo_star_icon, R.id.zero_state_search_photo_star_icon);
    }
}
