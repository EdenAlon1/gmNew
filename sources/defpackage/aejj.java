package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejj implements aema {
    public TextView a;
    public ddvv b;
    private final Context c;
    private final ffbr d;

    public aejj(Context context, ffbr ffbrVar) {
        this.c = context;
        this.d = ffbrVar;
    }

    private final String f(aeki aekiVar) {
        if (aekiVar.t() == amny.c && byyr.b(aekiVar.a())) {
            return this.c.getString(R.string.unapproved_rcs_group);
        }
        String J = aekiVar.J();
        if (J == null) {
            return null;
        }
        return cuxh.a(J);
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        CharSequence p = aelyVar.p();
        ddvv ddvvVar = this.b;
        if (ddvvVar != null) {
            p = ddvvVar.a.f(this.a);
        }
        this.a.setText(p);
        this.a.setTypeface(aelyVar.g());
        this.a.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.a = (TextView) view.findViewById(R.id.conversation_name);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        return (TextUtils.equals(aelyVar2.k().J(), aelyVar.k().J()) && Objects.equals(aelyVar2.g(), aelyVar.g()) && TextUtils.equals(aelyVar2.k().M(), aelyVar.k().M()) && TextUtils.equals(aelyVar2.k().K(), aelyVar.k().K()) && TextUtils.equals(aelyVar2.k().L(), aelyVar.k().L())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        boolean c = aeja.c(aekiVar);
        aelu aeluVar = (aelu) aelxVar;
        aeluVar.j = aekiVar.t() == amny.c ? crlw.e(this.c) : c ? crlw.f(this.c) : crlw.e(this.c);
        if (!aekiVar.am()) {
            aeluVar.B = f(aekiVar);
            return;
        }
        String f = f(aekiVar);
        String M = aekiVar.M();
        M.getClass();
        String a = cjze.a(M);
        if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(f)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(f) + " " + a);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ehdr.d(this.c, R.attr.colorOnSurfaceVariant, "NameViewPart")), f.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), f.length(), spannableStringBuilder.length(), 33);
            f = spannableStringBuilder;
        }
        aeluVar.B = f;
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}
