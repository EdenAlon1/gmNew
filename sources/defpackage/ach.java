package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ach extends ffkk implements ffji {
    public static final ach a = new ach();

    public ach() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof acd) {
            return (acd) tag;
        }
        return null;
    }
}
