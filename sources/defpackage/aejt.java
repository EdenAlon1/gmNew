package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejt implements aema {
    public TextView a;
    private final bcym b;
    private final Context c;
    private final cuxh d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private boolean m = false;

    public aejt(Context context, bcym bcymVar, cuxh cuxhVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        this.c = context;
        this.b = bcymVar;
        this.d = cuxhVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = ffbrVar7;
        this.l = ffbrVar8;
    }

    private static void f(aelx aelxVar, String str, String str2, String str3) {
        aelu aeluVar = (aelu) aelxVar;
        aeluVar.f = str;
        aeluVar.F = str2;
        aeluVar.E = str3;
    }

    private static void g(TextView textView, boolean z, int i, int i2) {
        if (true != z) {
            i = i2;
        }
        textView.setTextColor(ehdr.b(textView, i));
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        String string;
        bduq m;
        Typeface h = aelyVar.h();
        String F = aelyVar.F();
        int i = R.attr.colorOnSurface;
        if (F != null) {
            this.a.setText(aelyVar.F());
            TextView textView = this.a;
            textView.setTypeface(textView.getTypeface(), 2);
            if (((Boolean) this.l.b()).booleanValue()) {
                g(this.a, aelyVar.ab(), R.attr.colorOnSurfaceVariant, R.attr.colorOnSurface);
            }
        } else {
            if (aelyVar.k().t() != amny.c && aelyVar.n() != null) {
                enip n = aelyVar.n();
                n.getClass();
                if (!n.isEmpty()) {
                    TextView textView2 = this.a;
                    if (aelyVar.k().c() == 1) {
                        string = this.c.getString(R.string.one_to_one_typing_indicator);
                    } else {
                        enip n2 = aelyVar.n();
                        n2.getClass();
                        string = n2.size() == 1 ? this.c.getString(R.string.single_typing_indicators_in_group, ((bdrt) this.h.b()).a((ParticipantsTable.BindData) Collection.EL.stream(n2).findFirst().get(), false)) : this.c.getResources().getQuantityString(R.plurals.multiple_typing_indicators_in_groups, n2.size(), Integer.valueOf(n2.size()));
                    }
                    textView2.setText(string);
                    TextView textView3 = this.a;
                    h.getClass();
                    textView3.setTypeface(h, true == h.isBold() ? 3 : 2);
                    if (((Boolean) this.l.b()).booleanValue()) {
                        g(this.a, aelyVar.ab(), R.attr.colorSecondaryVariant, R.attr.colorSecondary);
                    }
                }
            }
            this.a.setText(aelyVar.K());
            this.a.setTypeface(h, aelyVar.d());
            if (((Boolean) this.l.b()).booleanValue()) {
                g(this.a, aelyVar.ab(), R.attr.colorOnSurfaceVariant, R.attr.colorOnSurface);
            }
        }
        this.a.setMaxLines(aelyVar.a());
        if (!((Boolean) this.l.b()).booleanValue()) {
            TextView textView4 = this.a;
            if (true == aelyVar.ab()) {
                i = R.attr.colorOnSurfaceVariant;
            }
            textView4.setTextColor(ehdr.b(textView4, i));
        }
        if (aelyVar.R() && !this.m) {
            this.m = true;
            Resources resources = this.c.getResources();
            TextView textView5 = this.a;
            textView5.setPadding(textView5.getPaddingLeft(), this.a.getPaddingTop(), this.a.getPaddingRight() + resources.getDimensionPixelSize(R.dimen.snippet_rtl_right_padding), this.a.getPaddingBottom());
            this.a.setShadowLayer(kpp.a(resources, R.dimen.snippet_rtl_shadow_radius), 0.0f, 0.0f, this.c.getColor(R.color.snippet_rtl_shadow_color));
        }
        if (((asql) this.j.b()).a() && aelyVar.o() != null && this.a.getParent() != null && this.a.getParent().getParent() != null) {
            View view = (View) this.a.getParent().getParent();
            Boolean o = aelyVar.o();
            o.getClass();
            view.setActivated(o.booleanValue());
        }
        if (cojh.a().booleanValue() && ctid.i && (m = aelyVar.m()) != null) {
            m.b().ifPresent(new Consumer() { // from class: aejs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    if (((fbuk) obj).c == 2) {
                        aejt.this.a.setContentSensitivity(1);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.a = (TextView) view.findViewById(R.id.conversation_snippet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r0.booleanValue() == false) goto L20;
     */
    @Override // defpackage.aema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.aely r5, defpackage.aely r6) {
        /*
            r4 = this;
            java.lang.String r0 = r6.K()
            java.lang.String r1 = r5.K()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r1 = 1
            if (r0 == 0) goto Ld1
            android.graphics.Typeface r0 = r6.h()
            android.graphics.Typeface r2 = r5.h()
            boolean r0 = j$.util.Objects.equals(r0, r2)
            if (r0 == 0) goto Ld1
            int r0 = r6.d()
            int r2 = r5.d()
            if (r0 != r2) goto Ld1
            enip r0 = r6.n()
            enip r2 = r5.n()
            boolean r0 = j$.util.Objects.equals(r0, r2)
            if (r0 == 0) goto Ld1
            ffbr r0 = r4.i
            java.lang.Object r0 = r0.b()
            asou r0 = (defpackage.asou) r0
            java.lang.String r0 = r6.F()
            java.lang.String r2 = r5.F()
            boolean r0 = j$.util.Objects.equals(r0, r2)
            if (r0 == 0) goto Ld1
            ffbr r0 = r4.j
            java.lang.Object r0 = r0.b()
            asql r0 = (defpackage.asql) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L7a
            java.lang.Boolean r0 = r6.o()
            java.lang.Boolean r2 = r5.o()
            boolean r0 = j$.util.Objects.equals(r0, r2)
            if (r0 == 0) goto Ld1
            java.lang.Boolean r0 = r6.o()
            if (r0 == 0) goto L7a
            java.lang.Boolean r0 = r6.o()
            r0.getClass()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Ld1
        L7a:
            java.lang.Boolean r0 = defpackage.cojh.a()
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto Ld0
            boolean r0 = defpackage.ctid.i
            if (r0 != 0) goto L8a
            goto Ld0
        L8a:
            bduq r5 = r5.m()
            r0 = 2
            if (r5 == 0) goto Lab
            j$.util.Optional r3 = r5.b()
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto Lab
            j$.util.Optional r5 = r5.b()
            java.lang.Object r5 = r5.get()
            fbuk r5 = (defpackage.fbuk) r5
            int r5 = r5.c
            if (r5 != r0) goto Lab
            r5 = r1
            goto Lac
        Lab:
            r5 = r2
        Lac:
            bduq r6 = r6.m()
            if (r6 == 0) goto Lcc
            j$.util.Optional r3 = r6.b()
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto Lcc
            j$.util.Optional r6 = r6.b()
            java.lang.Object r6 = r6.get()
            fbuk r6 = (defpackage.fbuk) r6
            int r6 = r6.c
            if (r6 != r0) goto Lcc
            r6 = r1
            goto Lcd
        Lcc:
            r6 = r2
        Lcd:
            if (r5 == r6) goto Ld0
            goto Ld1
        Ld0:
            return r2
        Ld1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aejt.d(aely, aely):boolean");
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        String string;
        boolean z;
        boolean z2;
        Resources resources = this.c.getResources();
        String G = aekiVar.ah() ? aekiVar.G() : aekiVar.i() == 210 ? resources.getString(R.string.conversation_list_snippet_link) : (((auol) this.k.b()).a() && aekiVar.i() == 117) ? resources.getString(R.string.conversation_list_snippet_deleted_incoming) : (((auol) this.k.b()).a() && aekiVar.i() == 23) ? resources.getString(R.string.conversation_list_snippet_deleted_outgoing) : aekiVar.U();
        String F = aekiVar.ah() ? aekiVar.F() : aekiVar.Q();
        boolean c = aeja.c(aekiVar);
        aelxVar.n((!((auol) this.k.b()).a() ? aekiVar.ah() : aekiVar.ah() || cbvv.e(aekiVar.i())) ? 0 : 2);
        aelu aeluVar = (aelu) aelxVar;
        aeluVar.e = true != c ? 3 : 1;
        aeluVar.M |= 2;
        aeluVar.v = aekiVar.ah() && this.d.d();
        aeluVar.M |= 4096;
        aeluVar.l = c ? crlw.f(this.c) : crlw.e(this.c);
        int i = aekiVar.i();
        boolean a = aeja.a(aekiVar);
        String a2 = this.b.a(aekiVar.R(), aekiVar.S(), aekiVar.E());
        boolean b = byyr.b(aekiVar.a());
        boolean h = cbvv.h(i);
        boolean z3 = ((auol) this.k.b()).a() && cbvv.e(i);
        if (aekiVar.t().equals(amny.c)) {
            String string2 = resources.getString(R.string.ask_parent_for_approval_snippet);
            f(aelxVar, string2, string2, "");
            aelxVar.n(2);
            aeluVar.l = crlw.f(this.c);
            return;
        }
        if (!TextUtils.isEmpty(G)) {
            String a3 = cuxh.a(G);
            if (((bzqa) this.f.b()).n() && MessageData.cl(i)) {
                String string3 = resources.getString(((caao) this.e.b()).a());
                f(aelxVar, string3, string3, "");
                return;
            }
            if (!a) {
                z2 = false;
            } else if (!b || a2 == null) {
                z2 = true;
            } else {
                if (!h) {
                    f(aelxVar, resources.getString(R.string.snippet, a2, a3), a3, resources.getString(R.string.conversation_list_item_view_sent_from_other_prefix, a2));
                    return;
                }
                z2 = true;
            }
            if ((i == 0 || z2 || z3) && !aekiVar.ah()) {
                f(aelxVar, a3, a3, "");
                return;
            } else {
                f(aelxVar, resources.getString(R.string.snippet_from_you, a3), a3, resources.getString(R.string.conversation_list_item_view_sent_from_you_prefix));
                return;
            }
        }
        if (aekiVar.h() == 4) {
            String string4 = resources.getString(R.string.lighter_empty_snippet_v3, aekiVar.J());
            f(aelxVar, string4, string4, "");
            return;
        }
        if (F == null) {
            if (TextUtils.isEmpty(G)) {
                aelxVar.n(2);
                String string5 = bcym.e(aekiVar.i()) ? this.c.getString(R.string.mms_pending_download_default_snippet) : this.c.getString(R.string.no_message_preview_default_snippet);
                f(aelxVar, string5, string5, "");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(aekiVar.W()) || aekiVar.u() != ardn.VMT_STATUS_COMPLETE) {
            if (aekiVar.D() != null) {
                F = aekiVar.D();
            }
            if (aekiVar.ah()) {
                F = aekiVar.F();
            }
            string = resources.getString(cuww.a(F));
        } else {
            string = aekiVar.W();
            string.getClass();
            ((akzt) this.g.b()).c("Bugle.Vmt.TranscriptSnippet.Show.Count");
        }
        if (!a) {
            z = false;
        } else {
            if (b && a2 != null && !h) {
                f(aelxVar, resources.getString(R.string.snippet, a2, string), string, resources.getString(R.string.conversation_list_item_view_sent_from_other_prefix, a2));
                return;
            }
            z = true;
        }
        if ((i == 0 || z) && !aekiVar.ah()) {
            f(aelxVar, string, string, "");
        } else {
            f(aelxVar, resources.getString(R.string.snippet_from_you, string), string, resources.getString(R.string.conversation_list_item_view_sent_from_you_prefix));
        }
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}
