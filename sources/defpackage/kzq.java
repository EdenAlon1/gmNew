package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzq {
    public static final kzr a(View view) {
        kzr kzrVar = (kzr) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (kzrVar != null) {
            return kzrVar;
        }
        kzr kzrVar2 = new kzr();
        view.setTag(R.id.pooling_container_listener_holder_tag, kzrVar2);
        return kzrVar2;
    }

    public static final void b(View view) {
        Iterator a = new ffnp(new kvx(view, null)).a();
        while (a.hasNext()) {
            a((View) a.next()).a();
        }
    }
}
