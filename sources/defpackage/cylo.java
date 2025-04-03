package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cylo implements cxyl {
    public static final cfup a = cfvl.n(cfvl.b, "enable_unverified_sms_banner", false);
    public static final cskc b = cskc.g("Bugle", "UnverifiedSmsBanner2o");
    public final cxyg c;
    public final ConversationIdType d;
    public boolean e;
    private final Context f;
    private final lkk g;
    private final cylq h;
    private final cyai i;
    private final ejwl j;
    private final ffbr k;
    private final ffbr l;

    public cylo(Context context, lkk lkkVar, cylq cylqVar, cyai cyaiVar, ejwl ejwlVar, ffbr ffbrVar, ffbr ffbrVar2, cxyg cxygVar, ConversationIdType conversationIdType) {
        this.f = context;
        this.g = lkkVar;
        this.h = cylqVar;
        this.i = cyaiVar;
        this.j = ejwlVar;
        this.k = ffbrVar;
        this.l = ffbrVar2;
        this.c = cxygVar;
        this.d = conversationIdType;
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        return new cxxy("UnverifiedSmsBanner", ((Boolean) a.e()).booleanValue());
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        cyai cyaiVar = this.i;
        Context context = this.f;
        cyag a2 = cyaiVar.a(context);
        a2.p(context.getString(R.string.unverified_sms_banner_description));
        a2.C();
        a2.m(ddyi.c(this.f, this.k, this.l, R.string.unverified_sms_banner_body_text, cful.ac, null));
        a2.u(new cyah() { // from class: cylm
            @Override // defpackage.cyah
            public final void f(cyag cyagVar) {
                cylo cyloVar = cylo.this;
                cyloVar.c.a(cyloVar, false);
            }
        });
        a2.y = new cyln(this);
        return a2;
    }

    @Override // defpackage.cxyl
    public final void l() {
        this.j.b(this.h.a(this.g, this.d), new ejwd<byzi>() { // from class: cylo.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                cylo.b.r("Error getting verification status, conversationId: ".concat(cylo.this.d.toString()));
                cylo cyloVar = cylo.this;
                cyloVar.c.a(cyloVar, false);
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                byzi byziVar = byzi.VERIFICATION_NA;
                int ordinal = ((byzi) obj).ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    cylo cyloVar = cylo.this;
                    cyloVar.c.a(cyloVar, false);
                } else if (ordinal == 2) {
                    cylo cyloVar2 = cylo.this;
                    cyloVar2.c.a(cyloVar2, true);
                } else if (ordinal == 3) {
                    cylo cyloVar3 = cylo.this;
                    if (!cyloVar3.e) {
                        cyloVar3.c.a(cyloVar3, false);
                    }
                }
                cylo.this.e = true;
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
