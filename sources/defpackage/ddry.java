package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import com.google.android.apps.messaging.ui.search.presenter.SelectedSearchResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddry extends ddrq {
    public akvg ag;
    public ayfg ah;
    public ddqu ai;
    public ffbr aj;
    public ffbr ak;
    public ffbr al;
    ddqq am;
    ddua an;

    @Override // defpackage.ddtz
    public final int aV() {
        return R.layout.zero_state_search_link_action_dialog;
    }

    @Override // defpackage.ddtz
    public final ddqu aY() {
        return this.ai;
    }

    @Override // defpackage.ddtz
    public final void aZ(View view) {
        this.an = new ddua(G(), this.ag, this.ah, this.aj, (tam) this.ak.b(), 4);
        view.findViewById(R.id.search_bottom_sheet_chips_container).setVisibility(0);
        ((Button) view.findViewById(R.id.zero_state_search_dialog_jump_to_chat_button)).setOnClickListener(new View.OnClickListener() { // from class: ddrs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ddry ddryVar = ddry.this;
                ddqq ddqqVar = ddryVar.am;
                if (ddqqVar != null) {
                    UrlSearchResult f = ddqqVar.f();
                    ddua dduaVar = ddryVar.an;
                    ames amesVar = (ames) ddryVar.al.b();
                    ConversationIdType j = f.j();
                    f.az(20, "participant_normalized_destination");
                    dduaVar.b(amesVar.a(j, f.u, f.t()), f.k());
                }
            }
        });
        ((Button) view.findViewById(R.id.zero_state_search_dialog_open_in_browser_button)).setOnClickListener(new View.OnClickListener() { // from class: ddrt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ddry.this.ba();
            }
        });
        ((Button) view.findViewById(R.id.zero_state_search_dialog_copy_button)).setOnClickListener(new View.OnClickListener() { // from class: ddru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ddry ddryVar = ddry.this;
                ddqq ddqqVar = ddryVar.am;
                if (ddqqVar != null) {
                    ddryVar.an.a(ddqqVar.l(), R.string.zero_state_search_link_copied);
                }
            }
        });
        ((Button) view.findViewById(R.id.zero_state_search_dialog_share_button)).setOnClickListener(new View.OnClickListener() { // from class: ddrv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ddry ddryVar = ddry.this;
                ddqq ddqqVar = ddryVar.am;
                if (ddqqVar != null) {
                    ddryVar.an.c(ddqqVar.l());
                }
            }
        });
        Rect rect = new Rect();
        TextView textView = (TextView) view.findViewById(R.id.zero_state_search_link_title);
        textView.setOnClickListener(new View.OnClickListener() { // from class: ddrw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ddry.this.ba();
            }
        });
        textView.getHitRect(rect);
        Rect rect2 = new Rect();
        view.findViewById(R.id.zero_state_search_link_image).getHitRect(rect2);
        if (view.getLayoutDirection() == 1) {
            egyp.a(textView, view, rect.left - rect2.left, 0, rect2.height() - rect.height());
        } else {
            egyp.a(textView, view, 0, rect2.right - rect.right, rect2.height() - rect.height());
        }
    }

    public final void ba() {
        ddqq ddqqVar = this.am;
        if (ddqqVar != null) {
            String l = ddqqVar.l();
            ddua dduaVar = this.an;
            csix.f(TextUtils.isEmpty(l));
            ((ddpm) dduaVar.c.b()).i(dduaVar.d);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(l));
            dduaVar.a.startActivity(intent);
        }
    }

    @Override // defpackage.ddtz
    public final boolean bb() {
        ddqu ddquVar = this.ai;
        SelectedSearchResult selectedSearchResult = (SelectedSearchResult) ddquVar.i().a();
        ddqj ddqjVar = (ddqj) ddquVar.g().a();
        if (selectedSearchResult == null || selectedSearchResult.b() != 4) {
            return false;
        }
        ddqjVar.c();
        if (((enou) ddqjVar.c()).c <= selectedSearchResult.a()) {
            return false;
        }
        this.am = (ddqq) ddqjVar.c().get(selectedSearchResult.a());
        View view = this.Q;
        csix.l(this.am);
        new ddsg(z(), Q(), view, new ddrx()).C(this.am);
        return true;
    }
}
