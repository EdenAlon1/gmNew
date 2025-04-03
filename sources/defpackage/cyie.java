package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyie implements cxyl {
    public static final cskc a = cskc.g("Bugle", "SpamBanner2o");
    public final ffbr b;
    public final ffbr c;
    public final cxyg d;
    public final ConversationIdType e;
    public ParticipantsTable.BindData g;
    private final cyiw h;
    private final cyai i;
    private final Context j;
    private final lkk k;
    private final ejwl l;
    private final errl m;
    private final ejlq n;
    private cyag o;
    public boolean f = false;
    private final ejlr p = new ejlr<eyjv<erdj>, Void>() { // from class: cyie.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            cyie cyieVar = cyie.this;
            cyieVar.d.a(cyieVar, false);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            cyie.a.r("Error updating as not spam, conversationId: ".concat(String.valueOf(String.valueOf(cyie.this.e))));
            cyie cyieVar = cyie.this;
            cyieVar.d.a(cyieVar, false);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };

    public cyie(Context context, lkk lkkVar, cyiw cyiwVar, cyai cyaiVar, ejlq ejlqVar, ejwl ejwlVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, cxyg cxygVar, ConversationIdType conversationIdType) {
        this.j = context;
        this.k = lkkVar;
        this.n = ejlqVar;
        this.l = ejwlVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.m = errlVar;
        this.d = cxygVar;
        this.e = conversationIdType;
        this.h = cyiwVar;
        this.i = cyaiVar;
    }

    public final void a(int i) {
        ParticipantsTable.BindData bindData = this.g;
        bindData.getClass();
        erfe erfeVar = erfe.UNKNOWN_USER_ACTION_TYPE;
        if (i == 4) {
            erfeVar = erfe.DISMISSED_WARNING_BANNER;
        }
        ejlq ejlqVar = this.n;
        ejlp b = ejlp.b(this.h.b(this.e, bindData.S(), i != 4, erfeVar));
        erdh createBuilder = erdj.a.createBuilder();
        createBuilder.copyOnWrite();
        erdj erdjVar = (erdj) createBuilder.instance;
        erdjVar.c = i - 1;
        erdjVar.b |= 1;
        ejlqVar.i(b, ejlm.a(createBuilder.build()), this.p);
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        return new cxxy("SpamBanner2o", ((Boolean) cyin.a.e()).booleanValue());
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        cyag a2 = this.i.a(this.j);
        this.o = a2;
        a2.p(this.j.getString(R.string.spam_banner_description));
        this.o.C();
        this.o.t(R.drawable.gs_gpp_maybe_vd_theme_24, ehdr.d(this.j, R.attr.colorErrorVariant, "SpamBanner2o"));
        this.o.y(this.j.getString(R.string.spam_banner_title_v2));
        this.o.m(this.j.getString(R.string.spam_banner_body_v2));
        this.o.x(this.j.getString(R.string.spam_banner_not_spam_button_v2));
        this.o.s(this.j.getString(R.string.spam_banner_spam_button_v2));
        this.o.u(new cyah() { // from class: cyia
            @Override // defpackage.cyah
            public final void f(cyag cyagVar) {
                cyie.this.a(4);
            }
        });
        cyag cyagVar = this.o;
        cyagVar.y = new cyif(this);
        cyagVar.v(new cyah() { // from class: cyib
            @Override // defpackage.cyah
            public final void f(cyag cyagVar2) {
                cyie cyieVar = cyie.this;
                cyieVar.g.getClass();
                taa taaVar = (taa) cyieVar.b.b();
                taf k = tak.k();
                k.d(cyieVar.f ? taj.GROUP_SPAM : taj.SPAM);
                syk sykVar = (syk) k;
                sykVar.e = 1;
                sykVar.b = cyieVar.g;
                k.c(cyieVar.e);
                sykVar.c = new sya(3);
                sykVar.d = syf.a(cyieVar.g);
                k.e();
                sykVar.f = 11;
                taaVar.d(k.f());
            }
        });
        this.o.w(new cyah() { // from class: cyic
            @Override // defpackage.cyah
            public final void f(cyag cyagVar2) {
                cyie.this.a(3);
            }
        });
        return this.o;
    }

    @Override // defpackage.cxyl
    public final void g() {
        axnw.h(elfo.g(new Callable() { // from class: cyid
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cyie cyieVar = cyie.this;
                culp culpVar = (culp) cyieVar.c.b();
                ConversationIdType conversationIdType = cyieVar.e;
                return Boolean.valueOf(culpVar.l(conversationIdType, new cuva(conversationIdType)));
            }
        }, this.m));
    }

    @Override // defpackage.cxyl
    public final void k() {
        this.n.k(this.p);
        ((taa) this.b.b()).c(new Supplier() { // from class: cyhz
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = engw.d;
                return enou.a;
            }
        });
    }

    @Override // defpackage.cxyl
    public final void l() {
        this.l.b(this.h.a(this.k, this.e), new ejwd<cyiv>() { // from class: cyie.2
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                cyie.a.r("Error getting get spam banner loaded data, conversationId: ".concat(String.valueOf(String.valueOf(cyie.this.e))));
                cyie cyieVar = cyie.this;
                cyieVar.d.a(cyieVar, false);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                cyiv cyivVar = (cyiv) obj;
                if (cyivVar.b()) {
                    cyie.this.g = (ParticipantsTable.BindData) cyivVar.a().get(0);
                }
                cyie.this.f = cyivVar.c();
                cyie cyieVar = cyie.this;
                cyieVar.d.a(cyieVar, cyivVar.b());
            }

            @Override // defpackage.ejwd
            public final void hB() {
            }
        });
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void j() {
    }
}
