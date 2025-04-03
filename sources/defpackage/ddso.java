package defpackage;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.presenter.SelectedSearchResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddso extends ddrr {
    public ddqs ag;
    public ddua ah;
    public akvg ai;
    public ayfg aj;
    public ddqu ak;
    public ffbr al;
    public ffbr am;
    private ddsr an;

    private final ddsr bc() {
        if (this.an == null) {
            ddsr ddsrVar = new ddsr(z(), this.Z, new ddsn());
            this.an = ddsrVar;
            ddsrVar.a(this.Q);
        }
        return this.an;
    }

    @Override // defpackage.ddtz
    public final int aV() {
        return R.layout.zero_state_search_location_action_dialog;
    }

    @Override // defpackage.ddtz
    public final ddqu aY() {
        return this.ak;
    }

    @Override // defpackage.ddtz
    public final void aZ(View view) {
        this.ah = new ddua(G(), this.ai, this.aj, this.al, (tam) this.am.b(), 5);
        view.findViewById(R.id.search_bottom_sheet_chips_container).setVisibility(0);
        view.findViewById(R.id.zero_state_search_location_dialog_jump_to_chat_button).setOnClickListener(new View.OnClickListener() { // from class: ddsj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ddso ddsoVar = ddso.this;
                ddqs ddqsVar = ddsoVar.ag;
                if (ddqsVar != null) {
                    ddsoVar.ah.b(ddqsVar.e(), ddsoVar.ag.f());
                }
            }
        });
        view.findViewById(R.id.zero_state_search_location_dialog_maps_button).setOnClickListener(new View.OnClickListener() { // from class: ddsk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ddso.this.ba();
            }
        });
        view.findViewById(R.id.zero_state_search_location_dialog_copy_button).setOnClickListener(new View.OnClickListener() { // from class: ddsl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ddso ddsoVar = ddso.this;
                ddqs ddqsVar = ddsoVar.ag;
                if (ddqsVar != null) {
                    ddsoVar.ah.a(ddqsVar.k(), R.string.zero_state_search_location_copied);
                }
            }
        });
        view.findViewById(R.id.zero_state_search_location_dialog_share_button).setOnClickListener(new View.OnClickListener() { // from class: ddsm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ddso ddsoVar = ddso.this;
                ddqs ddqsVar = ddsoVar.ag;
                if (ddqsVar != null) {
                    ddsoVar.ah.c(ddqsVar.k());
                }
            }
        });
        Rect rect = new Rect();
        TextView textView = (TextView) view.findViewById(R.id.zero_state_search_location_street_level_address);
        textView.setOnClickListener(new View.OnClickListener() { // from class: ddsi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ddso.this.ba();
            }
        });
        textView.getHitRect(rect);
        Rect rect2 = new Rect();
        view.findViewById(R.id.zero_state_search_location_image).getHitRect(rect2);
        if (view.getLayoutDirection() == 1) {
            egyp.a(textView, view, rect.left - rect2.left, 0, rect2.height() - rect.height());
        } else {
            egyp.a(textView, view, 0, rect2.right - rect.right, rect2.height() - rect.height());
        }
    }

    public final void ba() {
        ddqs ddqsVar = this.ag;
        if (ddqsVar != null) {
            ddua dduaVar = this.ah;
            String h = ddqsVar.h();
            if (TextUtils.isEmpty(h)) {
                return;
            }
            ((ddpm) dduaVar.c.b()).i(dduaVar.d);
            dduaVar.b.y(dduaVar.a, h);
        }
    }

    @Override // defpackage.ddtz
    public final boolean bb() {
        ddqu ddquVar = this.ak;
        SelectedSearchResult selectedSearchResult = (SelectedSearchResult) ddquVar.i().a();
        ddqj ddqjVar = (ddqj) ddquVar.g().a();
        if (selectedSearchResult == null || selectedSearchResult.b() != 5 || ddqjVar == null || ddqjVar.a().f().isEmpty()) {
            return false;
        }
        ddqs ddqsVar = (ddqs) ddqjVar.d().get(selectedSearchResult.a());
        this.ag = ddqsVar;
        ddqsVar.n();
        bc().b(this.ag);
        View findViewById = this.Q.findViewById(R.id.zero_state_search_location_dialog_maps_button);
        if (TextUtils.isEmpty(this.ag.h())) {
            findViewById.setVisibility(8);
            return true;
        }
        findViewById.setVisibility(0);
        return true;
    }

    @Override // defpackage.ddtz, defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        bc().c();
    }
}
