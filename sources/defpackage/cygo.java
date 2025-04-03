package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cygo implements cxyl {
    public static final cskc a = cskc.g("Bugle", "PremiumSmsBanner");
    public static final cfva b = cfvl.n(cfvl.b, "enable_premium_sms_banner", false);
    public static final cfup c = cfvl.h(cfvl.b, "premium_sms_help_center_link", "https://support.google.com/messages/?p=premium_sms");
    public final Context d;
    public final lkk e;
    public final ejvp f;
    public final cxyg g;
    public final ConversationIdType h;
    public final ffbr i;
    public final ddzb j;
    public final ffbr k;
    public final Intent m;
    public String n;
    public String o;
    private final cygt q;
    private final cyai r;
    private final ejwl s;
    private cyag t;
    public boolean p = true;
    public final Intent l = new Intent("android.settings.PREMIUM_SMS_SETTINGS").setData(Uri.parse("package: com.android.settings"));

    public cygo(Context context, lkk lkkVar, cygt cygtVar, cyai cyaiVar, ejwl ejwlVar, ejvp ejvpVar, ffbr ffbrVar, ddzb ddzbVar, ffbr ffbrVar2, cxyg cxygVar, ConversationIdType conversationIdType) {
        this.d = context;
        this.e = lkkVar;
        this.q = cygtVar;
        this.s = ejwlVar;
        this.r = cyaiVar;
        this.f = ejvpVar;
        this.i = ffbrVar;
        this.j = ddzbVar;
        this.k = ffbrVar2;
        this.g = cxygVar;
        this.h = conversationIdType;
        this.m = new Intent("android.settings.APP_SEARCH_SETTINGS").putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, context.getString(R.string.premium_sms_search_query));
    }

    public final void a() {
        ((cydc) this.k.b()).a();
        this.g.a(this, false);
    }

    public final boolean b(Intent intent) {
        return intent.resolveActivity(this.d.getPackageManager()) != null;
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        boolean z = false;
        if (((Boolean) b.e()).booleanValue() && ctid.a) {
            z = true;
        }
        return new cxxy("PremiumSmsBanner", z);
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        cyag a2 = this.r.a(this.d);
        this.t = a2;
        a2.p(this.d.getString(R.string.premium_sms_banner_description));
        this.t.C();
        this.t.t(R.drawable.quantum_gm_ic_info_black_24, ehdr.d(this.d, R.attr.colorPrimaryBrandIcon, "PremiumSmsBanner"));
        cyag cyagVar = this.t;
        if (this.n == null) {
            this.n = "";
        }
        String str = this.o;
        if (str == null) {
            cyagVar.m(this.d.getString(R.string.premium_sms_banner_body, this.n));
        } else {
            cyagVar.m(this.d.getString(R.string.premium_sms_banner_body_saved_contact, str, this.n));
        }
        boolean b2 = b(this.l);
        boolean b3 = b(this.m);
        if (!b2) {
            ((cydc) this.k.b()).c(2);
        }
        if (!b3) {
            ((cydc) this.k.b()).c(3);
        }
        if (b2 || b3) {
            this.t.x(this.d.getString(R.string.premium_sms_banner_open_settings_button));
            this.t.w(new cyah() { // from class: cygk
                @Override // defpackage.cyah
                public final void f(cyag cyagVar2) {
                    cygo cygoVar = cygo.this;
                    ((cydc) cygoVar.k.b()).e();
                    if (ctid.e && cygoVar.b(cygoVar.l)) {
                        cygoVar.j.q(cygoVar.d, cygoVar.l);
                    } else {
                        cygoVar.j.q(cygoVar.d, cygoVar.m);
                    }
                }
            });
        } else {
            this.t.E();
        }
        this.t.s(this.d.getString(R.string.premium_sms_banner_learn_more_button));
        this.t.u(new cyah() { // from class: cygl
            @Override // defpackage.cyah
            public final void f(cyag cyagVar2) {
                cygo.this.a();
            }
        });
        cyag cyagVar2 = this.t;
        cyagVar2.y = new cygn(this);
        cyagVar2.v(new cyah() { // from class: cygm
            @Override // defpackage.cyah
            public final void f(cyag cyagVar3) {
                cygo cygoVar = cygo.this;
                ((cydc) cygoVar.k.b()).d();
                ((akvg) cygoVar.i.b()).y(cygoVar.d, (String) cygo.c.e());
            }
        });
        return this.t;
    }

    @Override // defpackage.cxyl
    public final void l() {
        this.s.b(this.q.a(this.h), new ejwd<cygs>() { // from class: cygo.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                cygo.a.r("Error getting get premium sms loaded data, conversationId: ".concat(cygo.this.h.toString()));
                cygo cygoVar = cygo.this;
                cygoVar.g.a(cygoVar, false);
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [aoku, java.lang.Object] */
            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                cygs cygsVar = (cygs) obj;
                Optional d = cygsVar.a().d();
                if (cygo.this.p && d.isPresent()) {
                    ?? r0 = d.get();
                    cfva cfvaVar = aoqm.a;
                    if (aoqw.j(r0.k(((Boolean) new emyl() { // from class: aooz
                        @Override // defpackage.emyl
                        public final Object get() {
                            return Boolean.valueOf(ersy.a("bugle.enable_mi_as_other_participant_phone_number", "bugle"));
                        }
                    }.get()).booleanValue()))) {
                        cygo cygoVar = cygo.this;
                        cygsVar.b().M(cygoVar.e, new cygp(cygoVar));
                    }
                }
                if (cygsVar.c()) {
                    ParticipantsTable.BindData a2 = cygsVar.a().a();
                    if (a2 != null) {
                        cygo.this.n = a2.P();
                        cygo.this.o = a2.R();
                    }
                    ((cydc) cygo.this.k.b()).b();
                }
                cygo cygoVar2 = cygo.this;
                cygoVar2.g.a(cygoVar2, cygsVar.c());
                cygo.this.p = false;
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
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.cxyl
    public final void k() {
    }
}
