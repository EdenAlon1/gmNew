package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admv implements adms {
    public boolean a = false;
    public admi b;
    private final ffbr c;
    private final errl d;
    private final ffbr e;
    private final ffbr f;
    private ajid g;

    public admv(ffbr ffbrVar, errl errlVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.c = ffbrVar;
        this.d = errlVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
    }

    private final void h(eg egVar) {
        egVar.P().c(new admu(this));
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        return !adhu.a() ? elfo.e(false) : ((admk) this.c.b()).a((eisx) this.e.b()).h(new emwl() { // from class: admt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                admi admiVar = (admi) obj;
                admv.this.b = admiVar;
                return Boolean.valueOf(admiVar.a);
            }
        }, this.d);
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        this.g = ajidVar;
    }

    @Override // defpackage.ajhy
    public final void d() {
        if (this.a) {
            this.a = false;
            this.g.b();
        }
    }

    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        if (z) {
            h((eg) context);
            this.a = true;
            return true;
        }
        if (this.b != null) {
            ((eg) context).getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", this.b.b.j);
        }
        this.b = null;
        h((eg) context);
        ((admk) this.c.b()).b((eito) this.f.b());
        this.a = true;
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 9;
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ int n() {
        return ajhx.a();
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ void g() {
    }
}
