package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cydq implements cxyl {
    public static final cskc a = cskc.g("Bugle", "AddAreaCodeBanner");
    public final Context b;
    public final ffbr c;
    public final cxyg d;
    public final ConversationIdType e;
    public ResolvedRecipient f;
    private final lkk g;
    private final ejwl h;
    private final ejlq i;
    private final cyai j;
    private final cyeb k;
    private final cxyw l;
    private cyag m;
    private final AnonymousClass2 n = new ejlr<Void, Boolean>() { // from class: cydq.2
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            csjb c = cydq.a.c();
            c.I("The banner was shown and the user informed.");
            ResolvedRecipient resolvedRecipient = cydq.this.f;
            c.A("participantId", resolvedRecipient != null ? resolvedRecipient.F() : null);
            c.r();
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ResolvedRecipient resolvedRecipient = cydq.this.f;
            aqkv F = resolvedRecipient != null ? resolvedRecipient.F() : null;
            Objects.toString(F);
            throw new IllegalStateException("Failed to update Norm UI status for a participant with ID ".concat(String.valueOf(F)), th);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };

    /* JADX WARN: Type inference failed for: r1v1, types: [cydq$2] */
    public cydq(Context context, lkk lkkVar, ejwl ejwlVar, ejlq ejlqVar, ffbr ffbrVar, cyai cyaiVar, cyeb cyebVar, cxyg cxygVar, ConversationIdType conversationIdType, cxyw cxywVar) {
        this.b = context;
        this.g = lkkVar;
        this.h = ejwlVar;
        this.i = ejlqVar;
        this.c = ffbrVar;
        this.j = cyaiVar;
        this.k = cyebVar;
        this.d = cxygVar;
        this.e = conversationIdType;
        this.l = cxywVar;
    }

    public final void a() {
        ResolvedRecipient resolvedRecipient = this.f;
        if (resolvedRecipient != null) {
            this.i.i(new ejlp(this.k.b(resolvedRecipient)), new ejlm(null), this.n);
        }
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        Object e = ((cfup) cydz.a.get()).e();
        e.getClass();
        return new cxxy("AddAreaCodeBanner", ((Boolean) e).booleanValue());
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        cyag a2 = this.j.a(this.b);
        this.m = a2;
        a2.p(this.b.getString(R.string.area_code_banner_description));
        a2.C();
        a2.t(R.drawable.quantum_ic_info_outline_black_24, this.b.getColor(R.color.conversation_action_icon_color_m2));
        String string = this.b.getString(R.string.add_area_code_banner_button);
        string.getClass();
        Resources resources = this.b.getResources();
        ResolvedRecipient resolvedRecipient = this.f;
        aoku g = resolvedRecipient != null ? resolvedRecipient.g() : null;
        g.getClass();
        String string2 = resources.getString(R.string.conversation_area_code_popup_paragraph, g.G(), string);
        string2.getClass();
        a2.m(ddyi.e(this.b, string2, string, new View.OnClickListener() { // from class: cydn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Uri e;
                cydq cydqVar = cydq.this;
                ResolvedRecipient resolvedRecipient2 = cydqVar.f;
                if (resolvedRecipient2 != null && (e = resolvedRecipient2.e()) != null) {
                    ((axul) cydqVar.c.b()).e(cydqVar.b, e, 9);
                }
                cydqVar.a();
                cydqVar.d.a(cydqVar, false);
            }
        }));
        a2.u(new cyah() { // from class: cydo
            @Override // defpackage.cyah
            public final void f(cyag cyagVar) {
                cydq cydqVar = cydq.this;
                cydqVar.d.a(cydqVar, false);
                cydqVar.a();
            }
        });
        a2.y = new cydp(this);
        return this.m;
    }

    @Override // defpackage.cxyl
    public final void g() {
        a();
    }

    @Override // defpackage.cxyl
    public final void j() {
        cyag cyagVar;
        if (this.l == cxyw.CONVERSATION_DETAILS || (cyagVar = this.m) == null) {
            return;
        }
        cyagVar.f(true);
    }

    @Override // defpackage.cxyl
    public final void k() {
        this.i.k(this.n);
    }

    @Override // defpackage.cxyl
    public final void l() {
        this.h.b(this.k.a(this.g, this.e), new ejwd<cyee>() { // from class: cydq.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                cydq cydqVar = cydq.this;
                cydqVar.d.a(cydqVar, false);
                ConversationIdType conversationIdType = cydq.this.e;
                Objects.toString(conversationIdType);
                throw new IllegalStateException("Error getting add area code loaded data for conversationId ".concat(conversationIdType.toString()), th);
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                cyee cyeeVar = (cyee) obj;
                cyeeVar.getClass();
                cydq cydqVar = cydq.this;
                cydqVar.f = cyeeVar.b;
                boolean z = false;
                if (cyeeVar.a && cydqVar.f != null) {
                    z = true;
                }
                cydqVar.d.a(cydqVar, z);
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void hB() {
            }
        });
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void i() {
    }
}
