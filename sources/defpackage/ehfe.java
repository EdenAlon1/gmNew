package defpackage;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehfe extends BaseAdapter {
    static final int a = ehfo.e().getMaximum(4);
    private static final int h = (ehfo.e().getMaximum(5) + ehfo.e().getMaximum(7)) - 1;
    public final ehfd b;
    public final ehee c;
    public Collection d;
    public ehed e;
    final eheb f;
    final ehef g;

    public ehfe(ehfd ehfdVar, ehee eheeVar, eheb ehebVar, ehef ehefVar) {
        this.b = ehfdVar;
        this.c = eheeVar;
        this.f = ehebVar;
        this.g = ehefVar;
        this.d = eheeVar.a();
    }

    private final void f(TextView textView, long j, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ehec ehecVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean g = g(j);
        Iterator it = this.c.b().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Object obj = ((ksr) it.next()).a;
            if (obj != null && ((Long) obj).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Iterator it2 = this.c.b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = false;
                break;
            }
            Object obj2 = ((ksr) it2.next()).b;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z3 = true;
                break;
            }
        }
        Calendar d = ehfo.d();
        Calendar e = ehfo.e();
        e.setTimeInMillis(j);
        String format = d.get(1) == e.get(1) ? ehfo.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : ehfo.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (g) {
            format = String.format(context.getString(R.string.mtrl_picker_today_description), format);
        }
        if (z2) {
            format = String.format(context.getString(R.string.mtrl_picker_start_date_description), format);
        } else if (z3) {
            format = String.format(context.getString(R.string.mtrl_picker_end_date_description), format);
        }
        textView.setContentDescription(format);
        if (this.f.c.a()) {
            textView.setEnabled(true);
            Iterator it3 = this.c.a().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                } else if (ehfo.a(j) == ehfo.a(((Long) it3.next()).longValue())) {
                    z = true;
                    break;
                }
            }
            textView.setSelected(z);
            ehecVar = z ? this.e.b : g(j) ? this.e.c : this.e.a;
        } else {
            textView.setEnabled(false);
            ehecVar = this.e.g;
        }
        if (this.g == null || i == -1) {
            ehecVar.d(textView);
            return;
        }
        ehfd ehfdVar = this.b;
        int i2 = ehfdVar.c;
        int i3 = ehfdVar.b;
        throw null;
    }

    private static final boolean g(long j) {
        return ehfo.d().getTimeInMillis() == j;
    }

    public final int a(int i) {
        return b() + (i - 1);
    }

    public final int b() {
        ehfd ehfdVar = this.b;
        int i = ehfdVar.a.get(7);
        int i2 = this.f.e;
        if (i2 <= 0) {
            i2 = ehfdVar.a.getFirstDayOfWeek();
        }
        int i3 = i - i2;
        return i3 < 0 ? i3 + ehfdVar.d : i3;
    }

    public final int c() {
        return (b() + this.b.e) - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < b() || i > c()) {
            return null;
        }
        ehfd ehfdVar = this.b;
        int b = i - b();
        Calendar c = ehfo.c(ehfdVar.a);
        c.set(5, b + 1);
        return Long.valueOf(c.getTimeInMillis());
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (ehfd.c(j).equals(this.b)) {
            Calendar c = ehfo.c(this.b.a);
            c.setTimeInMillis(j);
            int i = c.get(5);
            f((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(i) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.b.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            ehed r1 = r5.e
            if (r1 != 0) goto Lf
            ehed r1 = new ehed
            r1.<init>(r0)
            r5.e = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L27
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131624514(0x7f0e0242, float:1.887621E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L5d
            ehfd r8 = r5.b
            int r2 = r8.e
            if (r7 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L66
        L5d:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 == 0) goto L73
            long r1 = r6.longValue()
            r5.f(r0, r1, r7)
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehfe.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
