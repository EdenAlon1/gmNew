package defpackage;

import android.util.Log;
import android.widget.ScrollView;
import com.google.android.setupdesign.view.BottomScrollView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqt implements eird {
    public eiqt(ScrollView scrollView) {
        if (scrollView instanceof BottomScrollView) {
        } else {
            Log.w("ScrollViewDelegate", "Cannot set non-BottomScrollView. Found=".concat(scrollView.toString()));
        }
    }
}
