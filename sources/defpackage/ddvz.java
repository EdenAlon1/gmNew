package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddvz implements aema {
    private final aejt a;
    private final ffbr b;
    private String c;
    private String d;
    private String e;

    public ddvz(aejt aejtVar, ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = aejtVar;
        this.b = ffbrVar;
        this.c = "";
        this.d = "";
        this.e = "";
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        aelyVar.getClass();
        this.a.b(aelyVar, z);
        String M = aelyVar.M();
        if (M == null) {
            M = "";
        }
        this.d = M;
        String L = aelyVar.L();
        if (L == null) {
            L = "";
        }
        this.e = L;
        String J = aelyVar.J();
        this.c = J != null ? J : "";
        f();
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.a.c(view);
        this.a.a.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ddvy
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ddvz.this.f();
            }
        });
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        aelyVar2.getClass();
        String J = aelyVar2.J();
        aelyVar.getClass();
        return (TextUtils.equals(J, aelyVar.J()) && TextUtils.equals(aelyVar2.M(), aelyVar.M()) && TextUtils.equals(aelyVar2.L(), aelyVar.L()) && ffkj.e(aelyVar2.h(), aelyVar.h()) && aelyVar2.d() == aelyVar.d()) ? false : true;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        this.a.e(aelxVar, aekiVar);
    }

    public final void f() {
        TextView textView = this.a.a;
        textView.setText(((azzw) this.b.b()).c(this.e, this.d, this.c, textView));
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}
