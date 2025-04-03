package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.simpicker.SimIconView;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdq extends ArrayAdapter {
    public int a;
    private final crnx b;
    private final aolr c;
    private final List d;

    public wdq(crnx crnxVar, aolr aolrVar, Context context, List list) {
        super(context, R.layout.sim_picker_dialog_row, list);
        this.b = crnxVar;
        this.c = aolrVar;
        this.d = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int a;
        viewGroup.getClass();
        aztg aztgVar = (aztg) this.d.get(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.sim_picker_dialog_row, viewGroup, false);
        }
        ((RadioButton) view.findViewById(R.id.option_radio_button)).setChecked(i == this.a);
        ((TextView) view.findViewById(R.id.name)).setText(getContext().getString(R.string.sim_dialog_picker_row_text, aztgVar.h(), Integer.valueOf(aztgVar.c())));
        aoku aokuVar = (aoku) aztgVar.b().orElse(null);
        TextView textView = (TextView) view.findViewById(R.id.details);
        if (aokuVar != null) {
            textView.setVisibility(0);
            textView.setText(this.b.a(this.c.u(aokuVar.H(true).a, aztgVar.e())));
        } else {
            textView.setVisibility(8);
        }
        SimIconView simIconView = (SimIconView) view.findViewById(R.id.sim_icon);
        String format = String.format(ctid.c(getContext()), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(aztgVar.c())}, 1));
        format.getClass();
        if (aztgVar.f() == 0) {
            a = getContext().getColor(R.color.sim_icon_text_color);
        } else {
            Context context = getContext();
            context.getClass();
            a = doxi.a(context, aztgVar.f());
        }
        Uri z = crjm.z(getContext(), format, false, a);
        z.getClass();
        Context context2 = simIconView.getContext();
        context2.getClass();
        simIconView.j(z, cwoj.a(context2));
        simIconView.h(false);
        view.getClass();
        return view;
    }
}
