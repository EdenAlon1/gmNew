package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dszd {
    static final /* synthetic */ ffmx[] a;
    public static final enru b;
    public final dsxv c;
    public final dsxk d;
    public dsxu e;
    public dtaa f;
    public final dsym g;
    public final dqku i;
    private final fr j;
    private final dsma k;
    private boolean l;
    public final View.OnLayoutChangeListener h = new View.OnLayoutChangeListener() { // from class: dsyt
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            dszd dszdVar = dszd.this;
            if (dszdVar.d.g && dszdVar.b() == 0) {
                return;
            }
            dszdVar.j(ffmk.f(i4 - i2, ((Number) dszdVar.i.a()).intValue()));
        }
    };
    private final ffls m = new dszc(0, this);

    static {
        ffko ffkoVar = new ffko(dszd.class, "visibleHeight", "getVisibleHeight()I", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
        b = enru.c("com/google/android/libraries/compose/ui/rendering/renderer/Renderer");
    }

    public dszd(final Context context, dsxv dsxvVar, fr frVar, dsxk dsxkVar, dsma dsmaVar) {
        this.c = dsxvVar;
        this.j = frVar;
        this.d = dsxkVar;
        this.k = dsmaVar;
        this.g = new dsym(dsxkVar, new dsyy(this), new dsyz(this), dszb.a);
        this.i = new dqku(new dsza(context), new ffji() { // from class: dsyu
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.minimum_rendering_height));
            }
        });
    }

    public static /* synthetic */ void m(dszd dszdVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = dszdVar.k.b();
        }
        dszdVar.k(i, ffmk.f(dszdVar.d.a() - i, 0));
    }

    public final int a() {
        return ffmk.f(this.k.a(), ((Number) this.i.a()).intValue());
    }

    public final int b() {
        return ((Number) this.m.c(a[0])).intValue();
    }

    public final dszh c() {
        ea g = this.j.g(this.d.c.getId());
        if (g instanceof dszh) {
            return (dszh) g;
        }
        return null;
    }

    public final dtaa d(dszr dszrVar) {
        dszrVar.getClass();
        dszh c = c();
        if (c != null) {
            return (dtaa) c.I().h(dszrVar.name());
        }
        return null;
    }

    public void e() {
        j(0);
        f();
    }

    public final void f() {
        final dszh c = c();
        if (c != null) {
            dsxl.a(this.d, this.j, true, new ffji() { // from class: dsyv
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    gg ggVar = (gg) obj;
                    enru enruVar = dszd.b;
                    ggVar.getClass();
                    ggVar.l(dszh.this);
                    return ffcu.a;
                }
            });
        }
        if (this.d.h) {
            this.g.b();
        }
    }

    public final void g(final dtaa dtaaVar) {
        this.f = null;
        dszh c = c();
        if (c != null) {
            dsxk dsxkVar = this.d;
            fr I = c.I();
            I.getClass();
            dsxl.a(dsxkVar, I, true, new ffji() { // from class: dsze
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    gg ggVar = (gg) obj;
                    ggVar.getClass();
                    ggVar.l(dtaa.this);
                    return ffcu.a;
                }
            });
        }
    }

    public final void h() {
        if (this.j.ai()) {
            return;
        }
        final dszh c = c();
        final int id = this.d.c.getId();
        if (c == null || !c.aF()) {
            if (this.l) {
                return;
            }
            dsxl.a(this.d, this.j, false, new ffji() { // from class: dsyn
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    gg ggVar = (gg) obj;
                    enru enruVar = dszd.b;
                    ggVar.getClass();
                    ggVar.s(id, new dszh());
                    return ffcu.a;
                }
            });
            this.l = true;
            return;
        }
        if (c.aJ()) {
            dsxl.a(this.d, this.j, false, new ffji() { // from class: dsyo
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    gg ggVar = (gg) obj;
                    enru enruVar = dszd.b;
                    ggVar.getClass();
                    ggVar.E(id, new dszh());
                    return ffcu.a;
                }
            });
        } else {
            if (c.aK()) {
                return;
            }
            dsxl.a(this.d, this.j, false, new ffji() { // from class: dsyp
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    gg ggVar = (gg) obj;
                    enru enruVar = dszd.b;
                    ggVar.getClass();
                    ggVar.q(dszh.this);
                    return ffcu.a;
                }
            });
        }
    }

    public void i(int i, boolean z) {
        j(i);
        dszh c = c();
        if (c != null) {
            RendererContainer rendererContainer = c.c;
            if (rendererContainer != null) {
                rendererContainer.b(i, z);
            } else {
                c.b = Integer.valueOf(i);
            }
        }
    }

    public final void j(int i) {
        this.m.d(a[0], Integer.valueOf(i));
    }

    public void k(int i, int i2) {
        h();
        i(i2, false);
    }
}
