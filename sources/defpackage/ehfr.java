package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehfr extends vk {
    public final ehes a;

    public ehfr(ehes ehesVar) {
        this.a = ehesVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.b.f;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new ehfq((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        ehfq ehfqVar = (ehfq) wrVar;
        int i2 = this.a.b.a.c;
        TextView textView = ehfqVar.s;
        Locale locale = Locale.getDefault();
        int i3 = i2 + i;
        Integer valueOf = Integer.valueOf(i3);
        textView.setText(String.format(locale, "%d", valueOf));
        TextView textView2 = ehfqVar.s;
        Context context = textView2.getContext();
        textView2.setContentDescription(ehfo.d().get(1) == i3 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), valueOf) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), valueOf));
        ehed ehedVar = this.a.d;
        Calendar d = ehfo.d();
        ehec ehecVar = d.get(1) == i3 ? ehedVar.f : ehedVar.d;
        Iterator it = this.a.a.a().iterator();
        while (it.hasNext()) {
            d.setTimeInMillis(((Long) it.next()).longValue());
            if (d.get(1) == i3) {
                ehecVar = ehedVar.e;
            }
        }
        ehecVar.d(ehfqVar.s);
        ehfqVar.s.setSelected(ehecVar == ehedVar.e);
        ehfqVar.s.setOnClickListener(new ehfp(this, i3));
    }

    final int m(int i) {
        return i - this.a.b.a.c;
    }
}
