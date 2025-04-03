package defpackage;

import android.content.Context;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dede {
    public final ctyx d;
    public final ddzb e;
    private static final cfva f = cfvl.q(150629952);
    public static final cskc a = cskc.g("Bugle", "ImeUtil");
    public volatile boolean b = false;
    private final List g = new ArrayList();
    public final List c = new ArrayList();
    private final dedd h = new dedd(this, "last_ime_height");
    private final dedd i = new dedd(this, "last_ime_height_landscape");
    private final ResultReceiver j = new dedc(this);

    public dede(ctyx ctyxVar, ddzb ddzbVar) {
        this.d = ctyxVar;
        this.e = ddzbVar;
    }

    public static void b(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r3 = r4.getWindowInsetsController();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l(android.content.Context r3, android.view.View r4, boolean r5) {
        /*
            r2 = this;
            if (r3 == 0) goto L59
            if (r4 != 0) goto L5
            goto L59
        L5:
            r0 = 1
            if (r5 != 0) goto L37
            boolean r5 = defpackage.ctid.d
            if (r5 == 0) goto L37
            cfva r5 = defpackage.dede.f
            java.lang.Object r5 = r5.e()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L37
            boolean r3 = r4.isFocusable()
            if (r3 == 0) goto L59
            boolean r3 = r4.requestFocus()
            if (r3 == 0) goto L59
            android.view.WindowInsetsController r3 = defpackage.aeb$$ExternalSyntheticApiModelOutline0.m(r4)
            if (r3 == 0) goto L59
            int r4 = defpackage.aeb$$ExternalSyntheticApiModelOutline0.m$1()
            defpackage.aeb$$ExternalSyntheticApiModelOutline0.m$1(r3, r4)
            r2.f(r0)
            return
        L37:
            java.lang.String r5 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r5)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            if (r3 == 0) goto L59
            boolean r5 = r4.isFocusable()
            if (r5 == 0) goto L59
            boolean r5 = r4.requestFocus()
            if (r5 == 0) goto L59
            r5 = 0
            android.os.ResultReceiver r1 = r2.j
            boolean r3 = r3.showSoftInput(r4, r5, r1)
            if (r3 == 0) goto L59
            r2.f(r0)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dede.l(android.content.Context, android.view.View, boolean):void");
    }

    public final int a() {
        return (this.e.n() ? this.i : this.h).a;
    }

    public final void c(decy decyVar) {
        this.c.add(decyVar);
    }

    public final void d(decz deczVar) {
        this.g.add(deczVar);
    }

    public final void e(int i) {
        if (this.e.n()) {
            this.i.a(i);
        } else {
            this.h.a(i);
        }
    }

    public final synchronized void f(boolean z) {
        if (z != this.b) {
            this.b = z;
            ArrayList arrayList = new ArrayList(this.g);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((decz) arrayList.get(i)).a(this.b);
            }
        }
    }

    public final void g(decy decyVar) {
        this.c.remove(decyVar);
    }

    public final void h(decz deczVar) {
        this.g.remove(deczVar);
    }

    public final boolean i(Context context, View view) {
        if (context != null && view != null) {
            if (!this.b) {
                return true;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                if (inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0, this.j)) {
                    f(false);
                    return true;
                }
            }
        }
        return false;
    }

    public final void j(Context context, View view) {
        l(context, view, false);
    }

    public final void k(Context context, View view) {
        l(context, view, true);
    }
}
