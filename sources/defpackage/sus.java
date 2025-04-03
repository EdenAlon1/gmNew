package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sus implements aema {
    public final stz a;
    private final Context b;
    private final ffsk c;
    private final stm d;
    private final String e;
    private TextView f;
    private crly g;

    public sus(Context context, ffsk ffskVar, stz stzVar, stm stmVar) {
        context.getClass();
        ffskVar.getClass();
        stmVar.getClass();
        this.b = context;
        this.c = ffskVar;
        this.a = stzVar;
        this.d = stmVar;
        this.e = "BirthdayViewPart";
    }

    private final void f(aelx aelxVar, aeki aekiVar) {
        if (!suq.a(aekiVar)) {
            aelxVar.f(false);
            return;
        }
        String a = this.d.a(aekiVar.K(), aekiVar.L());
        aelxVar.f(true);
        ((aelu) aelxVar).C = a;
        axol.k(this.c, null, new sur(this, aekiVar, null), 3);
    }

    @Override // defpackage.aema
    public final aely a(aely aelyVar) {
        aelyVar.getClass();
        aelx l = aelyVar.l();
        f(l, aelyVar.k());
        return l.a();
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        aelyVar.getClass();
        if (aelyVar.Y() || !TextUtils.isEmpty(aelyVar.I())) {
            return;
        }
        crly crlyVar = null;
        if (!aelyVar.U()) {
            if (ctjd.f() && aelyVar.W()) {
                return;
            }
            crly crlyVar2 = this.g;
            if (crlyVar2 == null) {
                ffkj.c("birthdayTextViewStubber");
            } else {
                crlyVar = crlyVar2;
            }
            crlyVar.g(8);
            return;
        }
        crly crlyVar3 = this.g;
        if (crlyVar3 == null) {
            ffkj.c("birthdayTextViewStubber");
            crlyVar3 = null;
        }
        crlyVar3.g(0);
        crly crlyVar4 = this.g;
        if (crlyVar4 == null) {
            ffkj.c("birthdayTextViewStubber");
        } else {
            crlyVar = crlyVar4;
        }
        TextView textView = (TextView) crlyVar.b();
        this.f = textView;
        if (textView != null) {
            String D = aelyVar.D();
            D.getClass();
            textView.setText(D);
        }
        int d = ehdr.d(this.b, R.attr.colorPrimaryBrandNonIcon, this.e);
        TextView textView2 = this.f;
        if (textView2 != null) {
            textView2.setTextColor(d);
        }
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.g = new crly(view, R.id.additional_text, R.id.additional_text, R.layout.additional_text_view);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        aelyVar.getClass();
        aelyVar2.getClass();
        return (aelyVar.U() == aelyVar2.U() && TextUtils.equals(aelyVar.D(), aelyVar2.D())) ? false : true;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        aekiVar.getClass();
        f(aelxVar, aekiVar);
    }
}
