package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dcgh extends SelectableContentItemView {
    private boolean a;

    public dcgh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        h();
    }

    @Override // defpackage.dclp
    public final void h() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((dcga) aX()).L((GalleryContentItemView) this);
    }
}
