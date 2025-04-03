package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsaz {
    public final ViewGroup a;
    public final RecyclerView b;

    public dsaz(ViewGroup viewGroup) {
        this.a = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.shortcuts_screen_recycler_view);
        findViewById.getClass();
        this.b = (RecyclerView) findViewById;
    }
}
