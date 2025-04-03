package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ddrh extends vk {
    protected final Context a;
    protected final ddqu d;
    protected final ffbr e;
    public boolean f = true;
    public int g;
    private final ddtl h;
    private final boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private AlertDialog m;

    public ddrh(Context context, ddqu ddquVar, ddtl ddtlVar, ffbr ffbrVar, boolean z) {
        this.a = context;
        this.d = ddquVar;
        this.h = ddtlVar;
        this.e = ffbrVar;
        this.i = z;
    }

    private final AlertDialog M() {
        if (this.m == null) {
            this.m = this.h.b(this.a, new Runnable() { // from class: ddre
                @Override // java.lang.Runnable
                public final void run() {
                    ddrh.this.d.w(5);
                }
            }).create();
        }
        return this.m;
    }

    protected abstract wr F(ViewGroup viewGroup);

    protected abstract void G(wr wrVar, int i);

    protected final void H(int i) {
        boolean z = this.i && this.h.f();
        boolean z2 = !this.i && this.f && this.h.e();
        this.j = z2;
        this.k = this.f && !z && !z2 && this.h.g();
        if (this.j || z) {
            ((ddpm) this.e.b()).a("Search.ConsentDialog.Impression", this.h.a());
        }
        if (z && i > 0 && !M().isShowing()) {
            M().show();
        }
        I();
    }

    public final void I() {
        this.l = this.g;
        int i = 1;
        if (!this.j && !this.k) {
            i = 0;
        }
        this.g = i;
    }

    protected final boolean J() {
        return this.g != this.l;
    }

    @Override // defpackage.vk
    public final int a() {
        return m() + this.g;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        if (i == 0) {
            if (this.j) {
                return 1;
            }
        } else if (i != 0) {
            return 0;
        }
        return this.k ? 2 : 0;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return F(viewGroup);
        }
        if (i == 1) {
            return this.h.d(viewGroup);
        }
        csix.k(i == 2);
        return this.h.c(viewGroup);
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        int i2 = i - this.g;
        int dE = dE(i);
        if (dE == 0) {
            G(wrVar, i2);
        } else if (dE == 1) {
            ((ddtj) wrVar).C(new ddrf(this));
        } else {
            csix.k(true);
            ((ddtj) wrVar).C(new ddrg(this));
        }
    }

    @Override // defpackage.vk
    public void k(wr wrVar) {
        if (wrVar instanceof ddtj) {
            ((ddtj) wrVar).D();
        }
    }

    protected abstract int m();
}
