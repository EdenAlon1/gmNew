package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dckz extends wr {
    public static final /* synthetic */ int u = 0;
    final TextView s;
    final TextView t;

    public dckz(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.search_result_name);
        this.t = (TextView) view.findViewById(R.id.search_result_address);
    }
}
