package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.cxfr;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxfl extends ejzn {
    final /* synthetic */ LayoutInflater a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ cxfr f;

    public cxfl(cxfr cxfrVar, LayoutInflater layoutInflater, int i, int i2, int i3, int i4) {
        this.a = layoutInflater;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = cxfrVar;
    }

    @Override // defpackage.ejzn
    public final View a(ViewGroup viewGroup) {
        final View inflate = this.a.inflate(R.layout.sim_messages_list_item_view, viewGroup, false);
        ((ellq) this.f.g.b()).c(inflate, new emyl() { // from class: cxfk
            @Override // defpackage.emyl
            public final Object get() {
                return new cxfr.b(inflate);
            }
        });
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.ejzn
    public final /* synthetic */ void b(View view, Object obj) {
        String str;
        ?? r6;
        cxet cxetVar = (cxet) obj;
        TextView textView = (TextView) view.findViewById(R.id.message_text);
        TextView textView2 = (TextView) view.findViewById(R.id.message_sender_name);
        TextView textView3 = (TextView) view.findViewById(R.id.message_timestamp);
        String d = cxetVar.d();
        textView.setText(d);
        aoku c = cxetVar.c();
        if (c == null) {
            str = null;
        } else {
            cfva cfvaVar = aoqm.a;
            str = c.H(((Boolean) new emyl() { // from class: aoqb
                @Override // defpackage.emyl
                public final Object get() {
                    return Boolean.valueOf(ersy.a("bugle.enable_mi_in_sim_messages_data", "bugle"));
                }
            }.get()).booleanValue()).a;
        }
        textView2.setText(str);
        String e = cxetVar.e();
        textView3.setText(e);
        int b = cxetVar.b();
        view.setTag(R.id.sim_message_index_tag, Integer.valueOf(b));
        int i = this.f.n;
        boolean z = i != -1 && i == b;
        if (z) {
            view.setBackgroundColor(this.b);
            textView.setTextColor(this.c);
            textView2.setTextColor(this.c);
            textView3.setTextColor(this.c);
        } else {
            view.setBackgroundColor(this.d);
            textView.setTextColor(this.e);
            textView2.setTextColor(this.e);
            textView3.setTextColor(this.e);
        }
        if (((Boolean) ((cfup) cxfr.b.get()).e()).booleanValue()) {
            cxfr cxfrVar = this.f;
            aoku c2 = cxetVar.c();
            r6 = new SpannableStringBuilder();
            if (cxfrVar.c()) {
                Resources resources = cxfrVar.c.z().getResources();
                r6.append(z ? resources.getString(R.string.action_selected) : resources.getString(R.string.action_unselected));
            }
            if (d != null) {
                if (r6.length() > 0) {
                    r6.append(' ');
                }
                r6.append(d);
            }
            if (c2 != null) {
                if (r6.length() > 0) {
                    r6.append(' ');
                }
                SpannableString a = ((crnx) cxfrVar.i.b()).a(c2);
                r6.append(a, a, 0);
            }
            if (e != null) {
                if (r6.length() > 0) {
                    r6.append(' ');
                }
                r6.append(e);
            }
        } else {
            cxfr cxfrVar2 = this.f;
            aoku c3 = cxetVar.c();
            Context z2 = this.f.c.z();
            boolean c4 = cxfrVar2.c();
            Resources resources2 = z2.getResources();
            String d2 = c3 != null ? crnx.d(resources2, c3) : "";
            String str2 = emxe.b(d) + " " + d2 + " " + emxe.b(e);
            if (c4) {
                r6 = String.valueOf(z ? resources2.getString(R.string.action_selected) : resources2.getString(R.string.action_unselected)).concat(str2);
            } else {
                r6 = str2;
            }
        }
        view.setContentDescription(r6);
    }
}
