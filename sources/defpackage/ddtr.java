package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddtr extends ddtj {
    public final View s;
    final /* synthetic */ ddtv t;
    private final TextView u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddtr(ddtv ddtvVar, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zero_state_search_rich_cards_reminder_opt_in_banner, viewGroup, false));
        this.t = ddtvVar;
        TextView textView = (TextView) this.a.findViewById(R.id.zss_reminder_opt_in_banner_text);
        this.u = textView;
        this.s = this.a.findViewById(R.id.zss_reminder_opt_in_banner_dismiss_button);
        String string = ddtvVar.e.getString(R.string.zero_state_search_rich_cards_opt_in_banner_setting);
        textView.setText(ddyi.e(ddtvVar.e, ddtvVar.e.getString(R.string.zero_state_search_rich_cards_reminder_opt_in_banner_text, string), string, new View.OnClickListener() { // from class: ddtp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddtr ddtrVar = ddtr.this;
                ddtrVar.t.c.K(ddtrVar.s.getContext());
            }
        }));
        egyl.b(textView);
        egyl.c(textView);
    }

    @Override // defpackage.ddtj
    public final void C(final ddtk ddtkVar) {
        this.s.setOnClickListener(new View.OnClickListener() { // from class: ddtq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ctyz ctyzVar = ddtr.this.t.a;
                ctyzVar.a.g(ctyzVar.b.getString(R.string.reminder_rich_cards_opt_in_banner_dismissed), true);
                ddtkVar.a();
            }
        });
    }

    @Override // defpackage.ddtj
    public final void D() {
    }
}
