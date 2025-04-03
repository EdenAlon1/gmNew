package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oae extends ffkk implements ffji {
    public static final oae a = new oae();

    public oae() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (nyj) ((WeakReference) tag).get();
        }
        if (tag instanceof nyj) {
            return (nyj) tag;
        }
        return null;
    }
}
