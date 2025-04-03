package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dduy extends wr {
    public lld s;
    public final llh t;
    public final View u;
    public final ImageView v;
    public final crly w;
    public final crly x;
    public final VideoOverlayView y;

    public dduy(View view) {
        super(view);
        this.u = view;
        this.v = (ImageView) view.findViewById(R.id.zero_state_search_thumbnail);
        this.w = new crly(view, R.id.zero_state_search_video_star_icon, R.id.zero_state_search_video_star_icon);
        crly crlyVar = new crly(view, R.id.zero_state_search_video_play_icon, R.id.zero_state_search_video_play_icon);
        this.x = crlyVar;
        VideoOverlayView videoOverlayView = (VideoOverlayView) view.findViewById(R.id.search_video_overlay);
        this.y = videoOverlayView;
        videoOverlayView.g();
        crlyVar.b();
        this.t = new llh() { // from class: ddux
            @Override // defpackage.llh
            public final void a(Object obj) {
                Long l = (Long) obj;
                dduy.this.y.e(l != null ? l.longValue() : 0L);
            }
        };
    }
}
