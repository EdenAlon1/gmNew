package defpackage;

import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcjh extends wr {
    public final ImageView s;
    public final qqo t;
    public final dcjb u;
    public final ConstraintLayout v;

    public dcjh(View view, qqo qqoVar, dcjb dcjbVar) {
        super(view);
        this.t = qqoVar;
        this.u = dcjbVar;
        this.s = (ImageView) view.findViewById(R.id.gif_content_image);
        this.v = (ConstraintLayout) view;
        view.setClipToOutline(true);
    }
}
