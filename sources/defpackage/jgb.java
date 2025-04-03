package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.messaging.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgb implements View.OnAttachStateChangeListener {
    final /* synthetic */ iya a;

    public jgb(iya iyaVar) {
        this.a = iyaVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Iterator a = kvz.a(this.a).a();
        while (a.hasNext()) {
            Object obj = (ViewParent) a.next();
            if (obj instanceof View) {
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null && bool.booleanValue()) {
                    return;
                }
            }
        }
        this.a.f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
