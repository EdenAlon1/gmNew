package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.material.textview.MaterialTextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egbk extends wr {
    public static final /* synthetic */ int u = 0;
    public final ImageView s;
    public final MaterialTextView t;

    public egbk(View view) {
        super(view);
        this.s = (ImageView) view.findViewById(R.id.photo_picker_photos_header_image);
        this.t = (MaterialTextView) view.findViewById(R.id.photo_picker_photos_header_name);
    }
}
