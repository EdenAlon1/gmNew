package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyhg implements cxyl {
    public static final cskc a = cskc.g("Bugle", "RemindersBanner2o");
    public final ea b;
    public final Context c;
    public final cyhn d;
    public final ejlq e;
    public final cnla f;
    public final adsd g;
    public final ddlw h;
    public final elbx i;
    public final cxyg j;
    public final ConversationIdType k;
    public final List l = new ArrayList();
    public cyax m;
    public final ejlr n;
    public final ejlr o;
    public final ejlr p;
    private final cyay q;
    private final ejwl r;

    public cyhg(ea eaVar, Context context, cyay cyayVar, cyhn cyhnVar, ejlq ejlqVar, ejwl ejwlVar, Optional optional, adsd adsdVar, ddlw ddlwVar, elbx elbxVar, cxyg cxygVar, ConversationIdType conversationIdType) {
        ejlr<Void, Boolean> ejlrVar = new ejlr<Void, Boolean>() { // from class: cyhg.1
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                if (!((Boolean) obj2).booleanValue()) {
                    cyhg.a.r("Mark as done was not successful");
                } else if (((Boolean) cyhb.b.e()).booleanValue()) {
                    cyhg.this.g.a(10);
                }
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.n = ejlrVar;
        ejlr<Void, eyjv<ddlo>> ejlrVar2 = new ejlr<Void, eyjv<ddlo>>() { // from class: cyhg.2
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                final ddlo ddloVar = (ddlo) ((eyjv) obj2).a(ddlo.a, eyfc.a());
                long j = ddloVar.c;
                boolean z = ddloVar.f;
                final cyhg cyhgVar = cyhg.this;
                ellj.f(new cvms(cyhgVar.h.b(j, z), cyhgVar.c.getResources().getString(R.string.reminders_snackbar_action_text), new Runnable() { // from class: cyhf
                    @Override // java.lang.Runnable
                    public final void run() {
                        ddlo ddloVar2 = ddloVar;
                        cyhg cyhgVar2 = cyhg.this;
                        ekzm b = cyhgVar2.i.b("RemindersBanner:undoSnoozeReminder");
                        try {
                            cyhgVar2.e.i(new ejlp(cyhgVar2.f.u(bdhb.b(ddloVar2.d), bdgq.b(ddloVar2.e), ddloVar2.g, 6)), new ejlm(null), cyhgVar2.p);
                            b.close();
                        } finally {
                        }
                    }
                }), cyhgVar.b);
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                cyhg.a.r("Error snoozing reminder for : ".concat(String.valueOf(String.valueOf(cyhg.this.k))));
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.o = ejlrVar2;
        ejlr<Void, Boolean> ejlrVar3 = new ejlr<Void, Boolean>() { // from class: cyhg.3
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                if (((Boolean) obj2).booleanValue()) {
                    return;
                }
                cyhg.a.r("The reminder was not removed successfully by reminder snackbar");
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                cyhg.a.r("Error undoing snooze reminder for: ".concat(String.valueOf(String.valueOf(cyhg.this.k))));
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.p = ejlrVar3;
        this.b = eaVar;
        this.c = context;
        this.q = cyayVar;
        this.d = cyhnVar;
        this.e = ejlqVar;
        this.r = ejwlVar;
        this.f = (cnla) optional.get();
        this.g = adsdVar;
        this.h = ddlwVar;
        this.i = elbxVar;
        this.j = cxygVar;
        this.k = conversationIdType;
        ejlqVar.k(ejlrVar2);
        ejlqVar.k(ejlrVar);
        ejlqVar.k(ejlrVar3);
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        return new cxxy("RemindersBanner", ((Boolean) cyhb.a.e()).booleanValue());
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        cyai cyaiVar = (cyai) this.q.a.b();
        Context context = this.c;
        context.getClass();
        cyax cyaxVar = new cyax(cyaiVar, context);
        this.m = cyaxVar;
        cyaxVar.d = this.c.getString(R.string.reminders_banner_description);
        cyaxVar.h(engw.n(this.l));
        return cyaxVar;
    }

    @Override // defpackage.cxyl
    public final void j() {
        cyag cyagVar;
        cyax cyaxVar = this.m;
        if (cyaxVar == null || cyaxVar.i() || (cyagVar = cyaxVar.b) == null) {
            return;
        }
        cyagVar.g(new cyas(cyaxVar), true);
    }

    @Override // defpackage.cxyl
    public final void l() {
        this.r.b(this.d.a(this.k), new ejwd<cyhm>() { // from class: cyhg.4
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                cyhg.a.r("Error getting get reminders banner loaded data, conversationId: ".concat(String.valueOf(String.valueOf(cyhg.this.k))));
                cyhg cyhgVar = cyhg.this;
                cyhgVar.j.a(cyhgVar, false);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                char c;
                String string;
                SpannableStringBuilder spannableStringBuilder;
                cyhm cyhmVar = (cyhm) obj;
                cyhg.this.l.clear();
                engw a2 = cyhmVar.a();
                int size = a2.size();
                char c2 = 0;
                int i = 0;
                while (i < size) {
                    final cyhl cyhlVar = (cyhl) a2.get(i);
                    final cyhg cyhgVar = cyhg.this;
                    String d = cyhlVar.d();
                    int i2 = true != ddjr.c() ? R.drawable.quantum_gm_ic_alarm_on_black_24 : R.drawable.quantum_gm_ic_alarm_vd_theme_24;
                    Drawable drawable = cyhgVar.c.getDrawable(i2);
                    String str = null;
                    cxyd cxydVar = drawable != null ? new cxyd(drawable, i2, ehdr.d(cyhgVar.c, R.attr.colorPrimaryBrandIcon, "RemindersBanner")) : null;
                    Integer valueOf = ddjr.c() ? Integer.valueOf(ehdr.d(cyhgVar.c, R.attr.colorPrimaryBrandNonIcon, "RemindersBanner")) : null;
                    Resources resources = cyhgVar.c.getResources();
                    Object[] objArr = new Object[1];
                    objArr[c2] = cyhlVar.c();
                    String string2 = resources.getString(R.string.reminders_banner_title, objArr);
                    String e = cyhlVar.e();
                    String b = cyhlVar.b();
                    String f = cyhlVar.f();
                    boolean g = cyhlVar.g();
                    boolean isEmpty = TextUtils.isEmpty(e);
                    boolean isEmpty2 = TextUtils.isEmpty(b);
                    if (isEmpty && isEmpty2) {
                        spannableStringBuilder = SpannableStringBuilder.valueOf("");
                        c = c2;
                    } else {
                        if (g) {
                            c = c2;
                            str = cyhgVar.c.getResources().getString(R.string.reminders_banner_self_sender_name);
                        } else {
                            c = c2;
                            if (!TextUtils.isEmpty(f)) {
                                str = f;
                            }
                        }
                        if (isEmpty) {
                            e = cyhgVar.c.getResources().getString(cuww.a(b));
                        }
                        if (TextUtils.isEmpty(str)) {
                            string = e;
                        } else {
                            Resources resources2 = cyhgVar.c.getResources();
                            Object[] objArr2 = new Object[2];
                            objArr2[c] = str;
                            objArr2[1] = e;
                            string = resources2.getString(R.string.reminders_banner_body, objArr2);
                        }
                        spannableStringBuilder = new SpannableStringBuilder(string);
                        if (isEmpty) {
                            spannableStringBuilder.setSpan(new StyleSpan(2), string.indexOf(e), spannableStringBuilder.length(), 33);
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    cyhgVar.l.add(new cxye(d, new Runnable() { // from class: cyhe
                        @Override // java.lang.Runnable
                        public final void run() {
                            cyhl cyhlVar2 = cyhlVar;
                            if (TextUtils.isEmpty(cyhlVar2.d())) {
                                cyhg.a.r("Failed to snooze, reminder id is empty/null: ".concat(cyhlVar2.d()));
                                return;
                            }
                            cyhg cyhgVar2 = cyhg.this;
                            cyhgVar2.e.i(ejlp.a(cyhgVar2.d.b(cyhgVar2.k, cyhlVar2.d())), new ejlm(null), cyhgVar2.o);
                        }
                    }, new Runnable() { // from class: cyhc
                        @Override // java.lang.Runnable
                        public final void run() {
                            cyhl cyhlVar2 = cyhlVar;
                            if (TextUtils.isEmpty(cyhlVar2.d())) {
                                cyhg.a.r("Failed to mark as done, reminder id is empty/null");
                                return;
                            }
                            cyhg cyhgVar2 = cyhg.this;
                            cyhgVar2.e.i(new ejlp(cyhgVar2.f.r(cyhlVar2.d(), cyhgVar2.k, 2)), new ejlm(null), cyhgVar2.n);
                        }
                    }, new Runnable() { // from class: cyhd
                        @Override // java.lang.Runnable
                        public final void run() {
                            cyhl cyhlVar2 = cyhlVar;
                            if (TextUtils.isEmpty(cyhlVar2.d())) {
                                cyhg.a.r("Failed to scroll to message id, reminder id is null");
                            } else {
                                ellj.f(new cyha(cyhlVar2.a()), cyhg.this.b);
                            }
                        }
                    }, cxydVar, string2, valueOf, spannableStringBuilder2, cyhgVar.c.getResources().getString(R.string.reminders_banner_remind_button), cyhgVar.c.getResources().getString(R.string.reminders_banner_done_button)));
                    i++;
                    c2 = c;
                }
                cyhg cyhgVar2 = cyhg.this;
                cyax cyaxVar = cyhgVar2.m;
                if (cyaxVar != null) {
                    cyaxVar.h(engw.n(cyhgVar2.l));
                }
                cyhg cyhgVar3 = cyhg.this;
                cyhgVar3.j.a(cyhgVar3, cyhmVar.b());
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
