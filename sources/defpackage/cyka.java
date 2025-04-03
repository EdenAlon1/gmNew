package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyka implements cxyl {
    public static final cskc a = cskc.g("Bugle", "UnblockUnspamBanner2o");
    public final ea b;
    public final Context c;
    public final ejlq d;
    public final cyky e;
    public final elbx f;
    public final cxyg g;
    public final ConversationIdType h;
    public cyag i;
    public byyt j;
    public ParticipantsTable.BindData k;
    public ParticipantsTable.BindData l;
    public final ejlr m = new ejlr<Void, eyjv<crsn>>() { // from class: cyka.1
        @Override // defpackage.ejlr
        public final /* synthetic */ void c(Object obj, Object obj2) {
            cyka cykaVar = cyka.this;
            cykaVar.g.a(cykaVar, false);
            final crsn crsnVar = (crsn) ((eyjv) obj2).a(crsn.a, eyfc.a());
            if (cyka.a(cyka.this.k)) {
                final cyka cykaVar2 = cyka.this;
                Context context = cykaVar2.c;
                ellj.f(new cyjv(context.getString(R.string.unarchive_conversation_snackbar), context.getString(R.string.unblock_unspam_snack_bar_undo), new Runnable() { // from class: cyjy
                    @Override // java.lang.Runnable
                    public final void run() {
                        cyka cykaVar3 = cyka.this;
                        ekzm b = cykaVar3.f.b("UnblockUnspamBanner:undoUnarchiveClick");
                        try {
                            cykaVar3.d.i(new ejlp(cykaVar3.e.b(cykaVar3.h)), new ejlm(null), cykaVar3.n);
                            b.close();
                        } catch (Throwable th) {
                            try {
                                b.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }), cykaVar2.b);
                return;
            }
            int i = crsnVar.b;
            if ((i & 16) == 0 && (i & 1) == 0 && (i & 2) == 0) {
                return;
            }
            final cyka cykaVar3 = cyka.this;
            ParticipantsTable.BindData bindData = cykaVar3.k;
            int i2 = bindData.Y() ? bindData.ab() && cuky.a(bindData.n()).c() ? R.string.unblock_unspam_snackbar : R.string.unblock_snackbar : R.string.unspam_snackbar;
            final eoko eokoVar = bindData.Y() ? eoko.CONVERSATION_FROM_UNBLOCK_ACTION : eoko.CONVERSATION_FROM_UNSPAM_ACTION;
            final int i3 = true != bindData.Y() ? 13 : 12;
            String U = bindData.U();
            if (U == null) {
                cyka.a.r("Failed to set display destination in snackbar message for unblock/unspam banner because normalized destination is null");
                U = "";
            }
            ellj.f(new cyjv(cykaVar3.c.getString(i2, U), cykaVar3.c.getString(R.string.unblock_unspam_snack_bar_undo), new Runnable() { // from class: cyjz
                @Override // java.lang.Runnable
                public final void run() {
                    eoko eokoVar2 = eokoVar;
                    crsn crsnVar2 = crsnVar;
                    int i4 = i3;
                    cyka cykaVar4 = cyka.this;
                    ekzm b = cykaVar4.f.b("UnblockUnspamBanner:undoUnblockUnspamClick");
                    try {
                        axnw.h(cykaVar4.e.e(eokoVar2, crsnVar2, i4));
                        b.close();
                    } catch (Throwable th) {
                        try {
                            b.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }), cykaVar3.b);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            cyka.a.r("Error unblock/unspam participant for conversationId: ".concat(String.valueOf(String.valueOf(cyka.this.h))));
            cyka.this.i.r(true);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejlr n = new ejlr<Void, Boolean>() { // from class: cyka.2
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            cyka.a.r("Error undoing unblock/unspam: ".concat(String.valueOf(String.valueOf(cyka.this.h))));
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public int o;
    private final cyai p;
    private final lkk q;
    private final ejwl r;

    public cyka(ea eaVar, Context context, lkk lkkVar, cyai cyaiVar, ejlq ejlqVar, ejwl ejwlVar, cyky cykyVar, elbx elbxVar, cxyg cxygVar, ConversationIdType conversationIdType) {
        this.b = eaVar;
        this.c = context;
        this.q = lkkVar;
        this.d = ejlqVar;
        this.r = ejwlVar;
        this.e = cykyVar;
        this.f = elbxVar;
        this.g = cxygVar;
        this.h = conversationIdType;
        this.p = cyaiVar;
    }

    public static boolean a(ParticipantsTable.BindData bindData) {
        if (bindData != null) {
            return (bindData.ab() || bindData.Y()) ? false : true;
        }
        return true;
    }

    private final void b() {
        this.i.y(this.c.getString(R.string.unspam_banner_title_v2));
        this.i.D(R.drawable.safer_with_google_shield, OptionalInt.empty());
        this.i.s(this.c.getString(R.string.unspam_banner_end_button));
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        return new cxxy("UnblockUnspamBanner2o", true);
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        cyag a2 = this.p.a(this.c);
        this.i = a2;
        int i = this.o;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            a2.p(this.c.getString(R.string.unblock_banner_description));
            this.i.y(this.c.getString(R.string.unblock_banner_title));
            this.i.t(R.drawable.quantum_gm_ic_do_not_disturb_black_24, ehdr.d(this.c, R.attr.colorOnSurfaceVariant, "UnblockUnspamBanner2o"));
            this.i.m(this.c.getString(R.string.unblock_banner_body_v2));
            this.i.s(this.c.getString(R.string.unblock_banner_positive_button));
        } else if (i2 == 1 || i2 == 2) {
            a2.p(this.c.getString(R.string.unspam_banner_description));
            b();
            this.i.m(this.c.getString(R.string.unspam_banner_body_v3));
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException("Unsupported BannerType: ".concat(cykx.a(i)));
            }
            emxf.l(this.j.g());
            this.i.p(this.c.getString(R.string.unspam_banner_description));
            b();
            this.i.y(this.c.getString(R.string.unspam_detected_title_v2));
            this.i.m(this.c.getString(R.string.unspam_detected_body_v2));
        }
        this.i.F();
        this.i.E();
        this.i.v(new cyah() { // from class: cyjx
            @Override // defpackage.cyah
            public final void f(cyag cyagVar) {
                elfl d;
                cyagVar.r(false);
                cyka cykaVar = cyka.this;
                ParticipantsTable.BindData bindData = cykaVar.l;
                cykaVar.k = bindData;
                if (cyka.a(bindData)) {
                    d = cykaVar.e.c(cykaVar.h).h(new emwl() { // from class: cyjw
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return crsn.a;
                        }
                    }, erpp.a);
                } else {
                    ParticipantsTable.BindData bindData2 = cykaVar.l;
                    bindData2.getClass();
                    d = cykaVar.e.d(cykaVar.h, bindData2.Y() ? eoko.CONVERSATION_FROM_UNBLOCK_ACTION : eoko.CONVERSATION_FROM_UNSPAM_ACTION, bindData2, true != bindData2.Y() ? 13 : 12);
                }
                cykaVar.d.h(d, cykaVar.m);
            }
        });
        return this.i;
    }

    @Override // defpackage.cxyl
    public final void k() {
        this.d.k(this.m);
        this.d.k(this.n);
    }

    @Override // defpackage.cxyl
    public final void l() {
        this.r.b(this.e.a(this.q, this.h), new ejwd<cykw>() { // from class: cyka.3
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                cyka.a.r("Error getting get unblock/unspam banner loaded data, conversationId: ".concat(String.valueOf(String.valueOf(cyka.this.h))));
                cyka cykaVar = cyka.this;
                cykaVar.g.a(cykaVar, false);
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                cykw cykwVar = (cykw) obj;
                cyka.this.o = cykwVar.c();
                cyka.this.l = cykwVar.a();
                byyt b = cykwVar.b();
                cyka cykaVar = cyka.this;
                cykaVar.j = b;
                cykaVar.g.a(cykaVar, cykaVar.o != 5);
            }

            @Override // defpackage.ejwd
            public final void hB() {
            }
        });
    }

    @Override // defpackage.cxyl
    public final void g() {
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
