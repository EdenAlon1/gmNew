package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyei implements cxyl {
    public static final cskc a = cskc.g("Bugle", "AddCountryCodeBanner");
    public final Context b;
    public final ffbr c;
    public final cxyg d;
    public final ConversationIdType e;
    public ResolvedRecipient f;
    private final lkk g;
    private final ejwl h;
    private final ejlq i;
    private final cyai j;
    private final cyet k;
    private final ctvb l;
    private final cxyw m;
    private cyag n;
    private final AnonymousClass2 o = new ejlr<Void, Boolean>() { // from class: cyei.2
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            csjb c = cyei.a.c();
            c.I("The banner was shown and the user informed.");
            ResolvedRecipient resolvedRecipient = cyei.this.f;
            c.A("participantId", resolvedRecipient != null ? resolvedRecipient.F() : null);
            c.r();
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ResolvedRecipient resolvedRecipient = cyei.this.f;
            aqkv F = resolvedRecipient != null ? resolvedRecipient.F() : null;
            Objects.toString(F);
            throw new IllegalStateException("Failed to update Norm UI status for a participant with ID ".concat(String.valueOf(F)), th);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };

    /* JADX WARN: Type inference failed for: r1v1, types: [cyei$2] */
    public cyei(Context context, lkk lkkVar, ejwl ejwlVar, ejlq ejlqVar, ffbr ffbrVar, cyai cyaiVar, cyet cyetVar, ctvb ctvbVar, cxyg cxygVar, ConversationIdType conversationIdType, cxyw cxywVar) {
        this.b = context;
        this.g = lkkVar;
        this.h = ejwlVar;
        this.i = ejlqVar;
        this.c = ffbrVar;
        this.j = cyaiVar;
        this.k = cyetVar;
        this.l = ctvbVar;
        this.d = cxygVar;
        this.e = conversationIdType;
        this.m = cxywVar;
    }

    public final void a() {
        ResolvedRecipient resolvedRecipient = this.f;
        if (resolvedRecipient != null) {
            this.i.i(new ejlp(this.k.b(resolvedRecipient)), new ejlm(null), this.o);
        }
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        Object e = ((cfup) cyer.a.get()).e();
        e.getClass();
        return new cxxy("AddCountryCodeBanner", ((Boolean) e).booleanValue());
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        ctvf ctvfVar;
        aoku g;
        Optional f;
        cyag a2 = this.j.a(this.b);
        this.n = a2;
        a2.C();
        a2.t(R.drawable.quantum_ic_info_outline_black_24, this.b.getColor(R.color.conversation_action_icon_color_m2));
        String string = this.b.getString(R.string.add_country_code_banner_button);
        string.getClass();
        ResolvedRecipient resolvedRecipient = this.f;
        if (resolvedRecipient == null || (g = resolvedRecipient.g()) == null || (f = g.f()) == null || (ctvfVar = (ctvf) f.orElse(new ctvf(0))) == null) {
            ctvfVar = new ctvf(0);
        }
        String string2 = this.b.getResources().getString(R.string.conversation_country_code_popup_paragraph, ctvfVar, !ctvfVar.a() ? this.l.z(ctvfVar) : "", string);
        string2.getClass();
        a2.m(ddyi.e(this.b, string2, string, new View.OnClickListener() { // from class: cyef
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Uri e;
                cyei cyeiVar = cyei.this;
                ResolvedRecipient resolvedRecipient2 = cyeiVar.f;
                if (resolvedRecipient2 != null && (e = resolvedRecipient2.e()) != null) {
                    ((axul) cyeiVar.c.b()).e(cyeiVar.b, e, 10);
                }
                cyeiVar.a();
                cyeiVar.d.a(cyeiVar, false);
            }
        }));
        a2.u(new cyah() { // from class: cyeg
            @Override // defpackage.cyah
            public final void f(cyag cyagVar) {
                cyei cyeiVar = cyei.this;
                cyeiVar.d.a(cyeiVar, false);
                cyeiVar.a();
            }
        });
        a2.y = new cyeh(this);
        return this.n;
    }

    @Override // defpackage.cxyl
    public final void g() {
        a();
    }

    @Override // defpackage.cxyl
    public final void j() {
        cyag cyagVar;
        if (this.m == cxyw.CONVERSATION_DETAILS || (cyagVar = this.n) == null) {
            return;
        }
        cyagVar.f(true);
    }

    @Override // defpackage.cxyl
    public final void k() {
        this.i.k(this.o);
    }

    @Override // defpackage.cxyl
    public final void l() {
        this.h.b(this.k.a(this.g, this.e), new ejwd<cyew>() { // from class: cyei.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                cyei cyeiVar = cyei.this;
                cyeiVar.d.a(cyeiVar, false);
                ConversationIdType conversationIdType = cyei.this.e;
                Objects.toString(conversationIdType);
                throw new IllegalStateException("Error getting add country code loaded data for conversationId ".concat(conversationIdType.toString()), th);
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                cyew cyewVar = (cyew) obj;
                cyewVar.getClass();
                cyei cyeiVar = cyei.this;
                cyeiVar.f = cyewVar.b;
                boolean z = false;
                if (cyewVar.a && cyeiVar.f != null) {
                    z = true;
                }
                cyeiVar.d.a(cyeiVar, z);
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
