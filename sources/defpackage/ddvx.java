package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddvx implements aema {
    private final Context a;
    private final aejj b;
    private final ffbr c;
    private final ffbr d;
    private String e;
    private String f;

    public ddvx(Context context, aejj aejjVar, ffbr ffbrVar, ffbr ffbrVar2) {
        context.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = context;
        this.b = aejjVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = "";
        this.f = "";
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        aelyVar.getClass();
        CharSequence p = aelyVar.p();
        this.e = p != null ? p.toString() : "";
        String J = aelyVar.J();
        this.f = J != null ? J : "";
        this.b.b(aelyVar, z);
    }

    @Override // defpackage.aema
    public final void c(View view) {
        ddvv ddvvVar = new ddvv(this);
        aejj aejjVar = this.b;
        aejjVar.b = ddvvVar;
        aejjVar.c(view);
        this.b.a.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ddvw
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view2.getClass();
                TextView textView = (TextView) view2;
                textView.setText(ddvx.this.f(textView));
            }
        });
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        aelyVar.getClass();
        aelyVar2.getClass();
        return (ffkj.e(aelyVar2.k().J(), aelyVar.k().J()) && ffkj.e(aelyVar2.J(), aelyVar.J()) && ffkj.e(aelyVar2.g(), aelyVar.g())) ? false : true;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        this.b.e(aelxVar, aekiVar);
    }

    public final CharSequence f(TextView textView) {
        if (this.f.length() > 0) {
            return ((azzw) this.c.b()).c(null, this.e, this.f, textView);
        }
        if (textView.getMeasuredWidth() == 0 || this.e.length() == 0 || textView.getPaint().measureText(this.e) <= textView.getMeasuredWidth()) {
            return this.e;
        }
        Resources resources = this.a.getResources();
        resources.getClass();
        cuxh cuxhVar = (cuxh) this.d.b();
        String str = this.e;
        TextPaint paint = textView.getPaint();
        int measuredWidth = textView.getMeasuredWidth();
        resources.getString(R.string.and_n_more);
        String e = cuxhVar.e(str, paint, measuredWidth, R.plurals.and_n_more_plural);
        e.getClass();
        return e;
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}
