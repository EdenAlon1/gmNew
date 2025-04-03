package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.ContainerContentView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcad extends dcae {
    protected FrameLayout e;
    protected final View.AccessibilityDelegate f;
    public final ContentGridView g;

    public dcad(eymn eymnVar, ContentGridView contentGridView, int i) {
        super(eymnVar, i);
        this.f = new dcac(this);
        this.g = contentGridView;
    }

    @Override // defpackage.dcae
    public void gB(View view) {
        super.gB(view);
        this.e = (FrameLayout) view.findViewById(R.id.c2o_category_container);
        if (view instanceof ContainerContentView) {
            ((ContainerContentView) view).a = this;
        }
    }

    @Override // defpackage.dcae
    public final int n() {
        return R.layout.compose2o_category_container_m2;
    }
}
