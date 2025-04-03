package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejv implements aema {
    public ddwa a;
    private final Context b;
    private TextView c;
    private crly d;
    private final fazb e;
    private final ffbr f;

    public aejv(Context context, fazb fazbVar, ffbr ffbrVar) {
        this.b = context;
        this.e = fazbVar;
        this.f = ffbrVar;
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        CharSequence N;
        ddwa ddwaVar = this.a;
        if (ddwaVar != null) {
            ddwb ddwbVar = ddwaVar.a;
            N = ddwbVar.e.length() == 0 ? ddwbVar.b : ((azzw) ddwbVar.a.b()).c(ddwbVar.c, ddwbVar.d, ddwbVar.e, null);
        } else {
            N = aelyVar.N();
        }
        this.d.g(aelyVar.c());
        if (aelyVar.c() == 0) {
            TextView textView = (TextView) this.d.b();
            this.c = textView;
            textView.setText(N);
            TextView textView2 = this.c;
            textView2.setTextColor(ehdr.b(textView2, true != aelyVar.ab() ? R.attr.colorOnSurface : R.attr.colorOnSurfaceVariant));
            this.c.setTypeface(aelyVar.i());
        }
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.d = new crly(view, R.id.conversation_subject, R.id.conversation_subject, R.layout.conversation_subject_view);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        if (!TextUtils.equals(aelyVar2.N(), aelyVar.N()) || !Objects.equals(aelyVar2.i(), aelyVar.i())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        Resources resources = this.b.getResources();
        int g = aekiVar.g();
        String H = aekiVar.ah() ? aekiVar.H() : ((cpdg) this.e.b()).c(resources, aekiVar.V());
        boolean z = g == 130;
        if (!z && TextUtils.isEmpty(H)) {
            aelxVar.m(8);
            return;
        }
        boolean c = aeja.c(aekiVar);
        aelxVar.m(0);
        aelu aeluVar = (aelu) aelxVar;
        aeluVar.g = resources.getString(true != z ? R.string.subject_with_label : R.string.subject_with_urgent_label, emxe.b(H));
        aeluVar.k = c ? crlw.f(this.b) : crlw.e(this.b);
        CharSequence concat = z ? TextUtils.concat(resources.getString(R.string.urgent_snippet), " ") : resources.getString(R.string.subject_label);
        aeluVar.h = H;
        aeluVar.i = concat.toString();
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}
