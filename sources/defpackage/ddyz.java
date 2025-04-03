package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddyz extends cuxz {
    public ddyz(Context context, ctvs ctvsVar) {
        super(context, ctvsVar);
    }

    @Override // defpackage.cuxz
    public final Drawable a(Resources resources) {
        return new cxqy(resources.getDimensionPixelSize(R.dimen.progress_indicator_default_radius), resources.getDimensionPixelSize(R.dimen.progress_indicator_default_stroke_width));
    }
}
