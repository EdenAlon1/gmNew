package defpackage;

import android.widget.TextView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaxx {
    public final TextView a;
    private final TextView b;
    private final TextView c;
    private final AccountParticleDisc d;
    private final eave e;
    private final eaxz f;

    public eaxx(eaxy eaxyVar, eave eaveVar, eaxz eaxzVar) {
        this.d = eaxyVar.i();
        this.b = eaxyVar.g();
        this.c = eaxyVar.h();
        this.a = eaxyVar.f();
        eaveVar.getClass();
        this.e = eaveVar;
        this.f = eaxzVar;
    }

    private static String b(String str) {
        return str.replace('-', (char) 8209);
    }

    private static String c(String str) {
        if (str != null) {
            return emxe.a(str.trim());
        }
        return null;
    }

    public final void a(Object obj, eaxw eaxwVar) {
        String c = c(this.e.e(obj));
        String c2 = c(this.e.c(obj));
        eavl eavlVar = this.f.b;
        if (true == ((eavk) eavl.a(obj, this.e)).a) {
            c2 = null;
        }
        if (c == null) {
            c = c2;
        }
        String str = true != efaz.a(c, c2) ? c2 : null;
        c.getClass();
        String b = b(c);
        this.b.setText(b);
        if (str != null) {
            TextView textView = this.c;
            String b2 = b(str);
            int[] iArr = kvo.a;
            textView.setImportantForAccessibility(2);
            b = a.w(b2, b, "\n");
            this.c.setText(b2);
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        if (this.a != null) {
            this.c.getVisibility();
            emxc emxcVar = this.f.a;
            if (emxcVar.g()) {
                emxcVar.c();
            }
            this.a.setVisibility(8);
        }
        String a = eaxwVar.a(b);
        this.d.l(obj);
        String e = this.d.e();
        if (e != null) {
            a = a.w(e, a, "\n");
        }
        this.b.setContentDescription(a);
    }
}
