package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyez implements cxyl {
    public final cxyg a;
    public final ConversationIdType b;
    public ResolvedRecipient c;
    private final Context d;
    private final lkk e;
    private final ejwl f;
    private final ffbr g;
    private final ffbr h;
    private final cyai i;
    private final cyfg j;
    private cyag k;

    public cyez(Context context, lkk lkkVar, ejwl ejwlVar, ffbr ffbrVar, ffbr ffbrVar2, cyai cyaiVar, cyfg cyfgVar, cxyg cxygVar, ConversationIdType conversationIdType) {
        this.d = context;
        this.e = lkkVar;
        this.f = ejwlVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = cyaiVar;
        this.j = cyfgVar;
        this.a = cxygVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        cfup cfupVar = cyfd.a;
        Object e = ((cfup) cyfd.c.get()).e();
        e.getClass();
        return new cxxy("RoamingShortCodeBanner", ((Boolean) e).booleanValue());
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        cyag a = this.i.a(this.d);
        this.k = a;
        a.C();
        a.t(R.drawable.quantum_ic_info_outline_black_24, this.d.getColor(R.color.conversation_action_icon_color_m2));
        cfup cfupVar = cyfd.a;
        a.m(ddyi.c(this.d, this.g, this.h, R.string.conversation_roaming_short_code_paragraph, cyfd.a, cyfd.b));
        a.u(new cyah() { // from class: cyex
            @Override // defpackage.cyah
            public final void f(cyag cyagVar) {
                cyez cyezVar = cyez.this;
                cyezVar.a.a(cyezVar, false);
            }
        });
        a.y = new cyey(this);
        return this.k;
    }

    @Override // defpackage.cxyl
    public final void j() {
        cyag cyagVar = this.k;
        if (cyagVar != null) {
            cyagVar.f(true);
        }
    }

    @Override // defpackage.cxyl
    public final void l() {
        this.f.b(this.j.a(this.e, this.b), new ejwd<cyfl>() { // from class: cyez.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                cyez cyezVar = cyez.this;
                cyezVar.a.a(cyezVar, false);
                ConversationIdType conversationIdType = cyez.this.b;
                Objects.toString(conversationIdType);
                throw new IllegalStateException("Error getting roaming short code loaded data for conversationId ".concat(conversationIdType.toString()), th);
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                cyfl cyflVar = (cyfl) obj;
                cyflVar.getClass();
                cyez cyezVar = cyez.this;
                cyezVar.c = cyflVar.b;
                boolean z = false;
                if (cyflVar.a && cyezVar.c != null) {
                    z = true;
                }
                cyezVar.a.a(cyezVar, z);
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void hB() {
            }
        });
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.cxyl
    public final void k() {
    }
}
