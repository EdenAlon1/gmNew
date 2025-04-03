package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.material.textview.MaterialTextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egas extends wr {
    public static final /* synthetic */ int v = 0;
    public final SquareImageView s;
    public final MaterialTextView t;
    public final View u;

    public egas(View view) {
        super(view);
        this.s = (SquareImageView) view.findViewById(R.id.photo_picker_cluster_image_view);
        this.t = (MaterialTextView) view.findViewById(R.id.photo_picker_cluster_name);
        this.u = view.findViewById(R.id.photo_picker_cluster_gradient);
    }
}
