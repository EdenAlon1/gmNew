package defpackage;

import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.simpicker.SimIconView;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wef {
    public final crnx a;
    public final ellq b;
    public final SimPickerItemView c;
    public final TextView d;
    public final TextView e;
    public final SimIconView f;
    public final aolr g;

    public wef(crnx crnxVar, ellq ellqVar, SimPickerItemView simPickerItemView, aolr aolrVar) {
        this.a = crnxVar;
        this.b = ellqVar;
        this.c = simPickerItemView;
        this.g = aolrVar;
        this.e = (TextView) simPickerItemView.findViewById(R.id.name);
        this.d = (TextView) simPickerItemView.findViewById(R.id.details);
        this.f = (SimIconView) simPickerItemView.findViewById(R.id.sim_icon);
    }
}
