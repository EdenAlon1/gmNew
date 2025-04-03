package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sxn {
    public abstract sxo a();

    public abstract void b(int i);

    public abstract void c(boolean z);

    public abstract void d(boolean z);

    public abstract void e(engw engwVar);

    public final sxo f() {
        sxo a = a();
        sxk sxkVar = (sxk) a;
        boolean z = true;
        emxf.a(!TextUtils.isEmpty(sxkVar.a));
        Optional optional = sxkVar.b;
        Optional optional2 = sxkVar.c;
        if (!optional.isPresent() && !optional2.isPresent()) {
            z = false;
        }
        emxf.a(z);
        return a;
    }

    public final void g(boolean z, boolean z2) {
        if (z) {
            c(z2);
        }
    }

    public final void h(boolean z, boolean z2) {
        if (z) {
            d(z2);
        }
    }
}
