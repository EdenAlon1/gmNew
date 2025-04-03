package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqfy extends wr {
    public static final /* synthetic */ int u = 0;
    public final TextView s;
    final /* synthetic */ dqfz t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqfy(dqfz dqfzVar, View view) {
        super(view);
        this.t = dqfzVar;
        View findViewById = view.findViewById(R.id.select_media_request_permission_button);
        findViewById.getClass();
        this.s = (TextView) findViewById;
    }
}
