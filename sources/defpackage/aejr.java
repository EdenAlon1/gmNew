package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejr implements aema {
    private final Context a;
    private final cqoh b;
    private TextView c;
    private ImageView d;
    private crly e;
    private crly f;

    public aejr(Context context, cqoh cqohVar) {
        this.a = context;
        this.b = cqohVar;
    }

    private static long f(aeki aekiVar) {
        String ak = aekiVar.ak("earliest_reminder_trigger_time");
        if (TextUtils.isEmpty(ak)) {
            return 0L;
        }
        return Long.parseLong(ak);
    }

    private final void g(aely aelyVar) {
        if (!ddjr.c()) {
            this.e.g(8);
            this.f.g(8);
            return;
        }
        if ((!ctjd.f() || !aelyVar.W()) && ((!stl.a() || !aelyVar.U()) && TextUtils.isEmpty(aelyVar.I()))) {
            this.e.g(8);
        }
        if (TextUtils.isEmpty(aelyVar.I())) {
            this.f.g(8);
        }
    }

    private final void h(aelx aelxVar, aeki aekiVar, Long l, boolean z) {
        if (!ddjr.b() || f(aekiVar) == 0 || l == null) {
            aelxVar.i(false);
            aelxVar.h(false);
            return;
        }
        boolean z2 = l.longValue() < this.b.f().toEpochMilli();
        Resources resources = this.a.getResources();
        if (!z) {
            boolean c = ddjr.c();
            int i = R.drawable.quantum_ic_alarm_black_24;
            if (!c && z2) {
                i = R.drawable.quantum_ic_alarm_on_black_24;
            }
            ((aelu) aelxVar).p = Integer.valueOf(i);
        }
        aelu aeluVar = (aelu) aelxVar;
        aeluVar.m = l;
        aelxVar.i(true);
        aelxVar.h(!z);
        aeluVar.n = resources.getText(z2 ? true != ddjr.c() ? R.string.missed_reminder : R.string.active_reminder : R.string.upcoming_reminder).toString();
        int i2 = R.attr.colorOnSurfaceVariant;
        aeluVar.o = Integer.valueOf(true != z2 ? R.attr.colorOnSurfaceVariant : R.attr.colorPrimaryBrandNonIcon);
        if (true == z2) {
            i2 = R.attr.colorPrimaryBrandIcon;
        }
        aeluVar.q = Integer.valueOf(i2);
    }

    @Override // defpackage.aema
    public final aely a(aely aelyVar) {
        aelx l = aelyVar.l();
        h(l, aelyVar.k(), aelyVar.C(), aelyVar.T());
        return l.a();
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        Long C = aelyVar.C();
        if (C == null || C.longValue() == 0) {
            g(aelyVar);
            return;
        }
        aely a = a(aelyVar);
        aelv aelvVar = (aelv) a;
        if (!aelvVar.v) {
            g(a);
            return;
        }
        this.e.g(0);
        TextView textView = (TextView) this.e.b();
        this.c = textView;
        if (textView != null) {
            String str = aelvVar.x;
            str.getClass();
            textView.setText(str);
            TextView textView2 = this.c;
            Integer num = aelvVar.y;
            num.getClass();
            textView2.setTextColor(ehdr.b(textView2, num.intValue()));
        }
        boolean z2 = this.c != null && aelvVar.w;
        this.f.g(true != z2 ? 8 : 0);
        if (z2) {
            ImageView imageView = (ImageView) this.f.b();
            this.d = imageView;
            if (imageView != null) {
                Integer num2 = aelvVar.z;
                num2.getClass();
                imageView.setImageResource(num2.intValue());
                ImageView imageView2 = this.d;
                Integer num3 = aelvVar.A;
                num3.getClass();
                imageView2.setColorFilter(ehdr.b(imageView2, num3.intValue()));
            }
        }
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.e = new crly(view, R.id.additional_text, R.id.additional_text, R.layout.additional_text_view);
        this.f = new crly(view, R.id.additional_info_icon, R.id.additional_info_icon, R.layout.additional_info_icon);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        Long C = aelyVar2.C();
        boolean z = (C == null || C.equals(aelyVar.C())) ? false : true;
        return ddjr.c() ? (!z && aelyVar.Y() == aelyVar2.Y() && aelyVar.X() == aelyVar2.X()) ? false : true : z;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        h(aelxVar, aekiVar, Long.valueOf(f(aekiVar)), aekiVar.al());
    }
}
