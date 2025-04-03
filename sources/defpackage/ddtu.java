package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddtu extends ddtj {
    final /* synthetic */ ddtv s;
    private final View t;
    private final View u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddtu(ddtv ddtvVar, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zero_state_search_rich_cards_opt_in_banner, viewGroup, false));
        this.s = ddtvVar;
        TextView textView = (TextView) this.a.findViewById(R.id.zero_state_search_rich_cards_opt_in_banner_text);
        textView.setText(ddtvVar.h());
        egyl.b(textView);
        egyl.c(textView);
        this.t = this.a.findViewById(R.id.zero_state_search_rich_cards_opt_in_banner_cancel_button);
        this.u = this.a.findViewById(R.id.zero_state_search_rich_cards_opt_in_banner_opt_in_button);
    }

    @Override // defpackage.ddtj
    public final void C(final ddtk ddtkVar) {
        this.t.setOnClickListener(new View.OnClickListener() { // from class: ddts
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddtu ddtuVar = ddtu.this;
                ((ddpm) ddtuVar.s.b.b()).c(ddtuVar.s.a());
                ddtuVar.s.i();
                ddtkVar.a();
            }
        });
        this.u.setOnClickListener(new View.OnClickListener() { // from class: ddtt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddtu ddtuVar = ddtu.this;
                ((ddpm) ddtuVar.s.b.b()).d(ddtuVar.s.a());
                ddtuVar.s.j();
                ddtkVar.b();
            }
        });
    }

    @Override // defpackage.ddtj
    public final void D() {
        this.t.setOnClickListener(null);
        this.u.setOnClickListener(null);
    }
}
