package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.actions.SimpleActionView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebnq extends wr {
    public final ImageView s;
    public final TextView t;
    public final int u;
    public final ebvw v;
    public final SimpleActionView w;

    public ebnq(Context context, ebvw ebvwVar, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.action_list_item, viewGroup, false));
        View view = this.a;
        this.w = (SimpleActionView) view;
        this.v = ebvwVar;
        this.s = (ImageView) view.findViewById(R.id.icon);
        this.t = (TextView) this.a.findViewById(R.id.text);
        this.u = ebnr.b(context, R.attr.ogIconColor);
    }
}
