package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import j$.util.Objects;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejn implements aema {
    static final cfva a = cfvl.i(cfvl.b, "show_otp_chip_in_conversation_list", true);
    public final ffbr b;
    public LinearLayout c;
    private final cqoh d;
    private crly e;

    public aejn(cqoh cqohVar, ffbr ffbrVar) {
        this.d = cqohVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!((Boolean) a.e()).booleanValue()) {
            this.e.g(8);
            return;
        }
        bduq m = aelyVar.m();
        if (m == null) {
            this.e.g(8);
            return;
        }
        Optional b = m.b();
        if (b.isEmpty()) {
            this.e.g(8);
            return;
        }
        ConversationIdType conversationIdType = m.b;
        MessageIdType messageIdType = m.c;
        fbuk fbukVar = (fbuk) b.get();
        engw r = engw.r(bduq.a(conversationIdType, messageIdType, fbukVar.c == 2 ? (fbva) fbukVar.d : fbva.a));
        if (r == null) {
            this.e.g(8);
            return;
        }
        long epochMilli = this.d.f().toEpochMilli() - TimeUnit.HOURS.toMillis(2L);
        long m2 = aelyVar.k().m();
        if (aelyVar.ab() || m2 <= epochMilli) {
            this.e.g(8);
            return;
        }
        this.e.g(0);
        this.c.setGravity(8388611);
        ((ConversationSuggestionsView) this.e.b()).c(r, new aejm(this, aelyVar));
        View findViewById = ((ConversationSuggestionsView) this.e.b()).findViewById(R.id.suggestion_button);
        if (findViewById == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()) == null) {
            return;
        }
        marginLayoutParams.setMarginStart(0);
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.e = new crly(view, R.id.conversation_suggestions_view_stub, R.id.conversation_suggestions_view, new crlx() { // from class: aejl
            @Override // defpackage.crlx
            public final void a(Object obj) {
                aejn.this.c = (LinearLayout) ((ConversationSuggestionsView) obj).findViewById(R.id.suggestion_list_container);
            }
        });
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        return !Objects.equals(aelyVar.m(), aelyVar2.m());
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
    }
}
