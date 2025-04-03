package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import defpackage.cyag;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cybh implements cxyl {
    public static final cskc a = cskc.g("Bugle", "AddContactBanner2o");
    public final ea b;
    public final Context c;
    public final cybz d;
    public final altk e;
    public final axul f;
    public final ffbr g;
    public final aolr h;
    public final cxyg i;
    public final ConversationIdType j;
    public aoku k;
    public ParticipantsTable.BindData l;
    public ProfilesTable.BindData m;
    public byte[] n = null;
    public boolean o = false;
    private final lkk p;
    private final cyai q;
    private final ejwl r;
    private final errl s;
    private final crnx t;
    private cyag u;

    public cybh(ea eaVar, Context context, lkk lkkVar, cybz cybzVar, altk altkVar, axul axulVar, cyai cyaiVar, ffbr ffbrVar, ejwl ejwlVar, errl errlVar, aolr aolrVar, crnx crnxVar, cxyg cxygVar, ConversationIdType conversationIdType) {
        this.b = eaVar;
        this.c = context;
        this.p = lkkVar;
        this.d = cybzVar;
        this.e = altkVar;
        this.f = axulVar;
        this.q = cyaiVar;
        this.g = ffbrVar;
        this.r = ejwlVar;
        this.s = errlVar;
        this.h = aolrVar;
        this.t = crnxVar;
        this.i = cxygVar;
        this.j = conversationIdType;
    }

    @Deprecated
    private final String a() {
        String b;
        aoku aokuVar = this.k;
        return (aokuVar == null || (b = cuxh.b(aokuVar.H(true).toString())) == null) ? "" : b;
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        return new cxxy("AddContactBanner", ((Boolean) cybw.c.e()).booleanValue());
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        String string;
        String string2;
        cyag a2 = this.q.a(this.c);
        this.u = a2;
        a2.p(this.c.getString(R.string.add_contact_banner_description));
        this.u.C();
        this.u.t(R.drawable.quantum_gm_ic_person_add_black_24, ehdr.d(this.c, R.attr.colorPrimaryBrandIcon, "AddContactBanner"));
        cyag cyagVar = this.u;
        cfva cfvaVar = aoqm.a;
        if (((Boolean) new aoph().get()).booleanValue()) {
            ProfilesTable.BindData bindData = this.m;
            if (bindData == null || TextUtils.isEmpty(bindData.v())) {
                Context context = this.c;
                aoku aokuVar = this.k;
                string = context.getString(R.string.add_contact_banner_title_v2, aokuVar != null ? this.t.a(aokuVar) : "");
            } else {
                Context context2 = this.c;
                aoku aokuVar2 = this.k;
                String a3 = aokuVar2 != null ? this.t.a(aokuVar2) : "";
                ProfilesTable.BindData bindData2 = this.m;
                bindData2.getClass();
                string = context2.getString(R.string.add_contact_banner_title_with_name, a3, bindData2.v());
            }
        } else {
            ProfilesTable.BindData bindData3 = this.m;
            if (bindData3 == null || TextUtils.isEmpty(bindData3.v())) {
                string = this.c.getString(R.string.add_contact_banner_title_v2, a());
            } else {
                Context context3 = this.c;
                String a4 = a();
                ProfilesTable.BindData bindData4 = this.m;
                bindData4.getClass();
                string = context3.getString(R.string.add_contact_banner_title_with_name, a4, bindData4.v());
            }
        }
        cyagVar.y(string);
        cyag cyagVar2 = this.u;
        ProfilesTable.BindData bindData5 = this.m;
        cyagVar2.m((bindData5 == null || TextUtils.isEmpty(bindData5.v())) ? this.c.getString(R.string.add_contact_banner_body_v2) : this.c.getString(R.string.add_contact_banner_body_profile_disclosure));
        this.u.x(this.c.getString(R.string.add_contact_banner_spam_button));
        this.u.s(this.c.getString(R.string.add_contact_banner_add_button));
        this.u.u(new cyah() { // from class: cybb
            @Override // defpackage.cyah
            public final void f(cyag cyagVar3) {
                cybh cybhVar = cybh.this;
                cybhVar.i.a(cybhVar, false);
            }
        });
        cyag cyagVar3 = this.u;
        cyagVar3.y = new cybg(this);
        cyagVar3.v(new cyah() { // from class: cybc
            @Override // defpackage.cyah
            public final void f(cyag cyagVar4) {
                engw g;
                cybh cybhVar = cybh.this;
                if (cybhVar.o) {
                    cybhVar.i.a(cybhVar, false);
                    cybhVar.g();
                    return;
                }
                aoku aokuVar3 = cybhVar.k;
                if (aokuVar3 == null) {
                    cybh.a.r("Failed to set display destination because MessagingIdentity was null. Likely add contact banner with no phone number was displayed");
                    return;
                }
                ProfilesTable.BindData bindData6 = cybhVar.m;
                if (bindData6 == null) {
                    int i = engw.d;
                    g = enou.a;
                } else {
                    int i2 = engw.d;
                    engr engrVar = new engr();
                    if (!TextUtils.isEmpty(bindData6.w()) && !TextUtils.isEmpty(bindData6.x())) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("mimetype", "vnd.android.cursor.item/name");
                        contentValues.put("data2", bindData6.w());
                        contentValues.put("data3", bindData6.x());
                        engrVar.h(contentValues);
                    } else if (!TextUtils.isEmpty(bindData6.v())) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("mimetype", "vnd.android.cursor.item/name");
                        contentValues2.put("data2", bindData6.v());
                        engrVar.h(contentValues2);
                    }
                    if (cybhVar.n != null) {
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("mimetype", "vnd.android.cursor.item/photo");
                        contentValues3.put("data15", cybhVar.n);
                        engrVar.h(contentValues3);
                    }
                    g = engrVar.g();
                }
                cybhVar.f.d(cybhVar.c, aokuVar3, 8, g);
                if (((Boolean) cybw.b.e()).booleanValue()) {
                    return;
                }
                cybhVar.e.aw(4);
            }
        });
        this.u.w(new cyah() { // from class: cybd
            @Override // defpackage.cyah
            public final void f(cyag cyagVar4) {
                cybh cybhVar = cybh.this;
                cybhVar.l.getClass();
                taa taaVar = (taa) cybhVar.g.b();
                taf k = tak.k();
                k.d(taj.SPAM);
                syk sykVar = (syk) k;
                sykVar.e = 1;
                ParticipantsTable.BindData bindData6 = cybhVar.l;
                bindData6.getClass();
                sykVar.b = bindData6;
                k.c(cybhVar.j);
                sykVar.c = new sya(2);
                ParticipantsTable.BindData bindData7 = cybhVar.l;
                bindData7.getClass();
                sykVar.d = syf.a(bindData7);
                k.e();
                sykVar.f = 14;
                taaVar.d(k.f());
                if (((Boolean) cybw.b.e()).booleanValue()) {
                    return;
                }
                cybhVar.e.aw(5);
            }
        });
        cyag cyagVar4 = this.u;
        cyagVar4.C = new cyah() { // from class: cybe
            @Override // defpackage.cyah
            public final void f(cyag cyagVar5) {
                ellj.f(new cyag.a(), cybh.this.b);
            }
        };
        if (this.o) {
            if (((Boolean) new aoph().get()).booleanValue()) {
                Context context4 = this.c;
                aoku aokuVar3 = this.k;
                string2 = context4.getString(R.string.report_spam_banner_title, aokuVar3 != null ? this.t.a(aokuVar3) : "");
            } else {
                string2 = this.c.getString(R.string.report_spam_banner_title, a());
            }
            cyagVar4.y(string2);
            this.u.m(this.c.getString(R.string.report_spam_banner_body));
            this.u.x(this.c.getString(R.string.report_spam_banner_spam_button));
            this.u.s(this.c.getString(R.string.report_spam_banner_dismiss_button));
        }
        return this.u;
    }

    @Override // defpackage.cxyl
    public final void g() {
        axnw.h(elfo.f(new Runnable() { // from class: cyba
            @Override // java.lang.Runnable
            public final void run() {
                cybh cybhVar = cybh.this;
                cybhVar.d.b(cybhVar.j);
            }
        }, this.s));
    }

    @Override // defpackage.cxyl
    public final void j() {
        cyag cyagVar = this.u;
        if (cyagVar == null) {
            return;
        }
        cyagVar.f(true);
    }

    @Override // defpackage.cxyl
    public final void k() {
        ((taa) this.g.b()).c(new Supplier() { // from class: cybf
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = engw.d;
                return enou.a;
            }
        });
    }

    @Override // defpackage.cxyl
    public final void l() {
        this.r.b(this.d.a(this.p, this.j), new ejwd<cyby>() { // from class: cybh.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                cybh.a.r("Error getting get add contact loaded data, conversationId: ".concat(cybh.this.j.toString()));
                cybh cybhVar = cybh.this;
                cybhVar.i.a(cybhVar, false);
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                cyby cybyVar = (cyby) obj;
                if (cybyVar.c()) {
                    cybh.this.l = cybyVar.a().a();
                    cybh cybhVar = cybh.this;
                    ParticipantsTable.BindData bindData = cybhVar.l;
                    bindData.getClass();
                    cybhVar.k = cybhVar.h.q(bindData);
                    cybh cybhVar2 = cybh.this;
                    boolean b = cybyVar.b();
                    boolean z = false;
                    if (aewg.j() && !b) {
                        z = true;
                    }
                    cybhVar2.o = z;
                    cybh cybhVar3 = cybh.this;
                    ParticipantsTable.BindData a2 = cybyVar.a().a();
                    ProfilesTable.BindData bindData2 = null;
                    if (a2 != null && a2.aE("profiles_table_join_tag")) {
                        bindData2 = (ProfilesTable.BindData) a2.aw("profiles_table_join_tag", ProfilesTable.BindData.class);
                    }
                    cybhVar3.m = bindData2;
                    cybh.this.n = cybyVar.d();
                }
                cybh cybhVar4 = cybh.this;
                cybhVar4.i.a(cybhVar4, cybyVar.c());
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
}
