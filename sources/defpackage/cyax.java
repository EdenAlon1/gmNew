package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyax extends cxyq {
    public cyag b;
    public engw c;
    public String d;
    private final cyai e;
    private final FrameLayout f;
    private final Context g;
    private engw h;
    private ViewGroup i;
    public final List a = new ArrayList();
    private boolean j = false;

    public cyax(cyai cyaiVar, Context context) {
        this.g = context;
        this.e = cyaiVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.d = context.getString(R.string.banner_description);
    }

    public static cyaz e(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (cyaz) enjk.j(list);
    }

    private final void k(int i) {
        if (this.a.size() != i) {
            while (this.a.size() < i) {
                cyag a = this.e.a(this.g);
                a.o(8);
                a.e(this.f, 0);
                this.a.add(0, a);
            }
            while (this.a.size() > i) {
                ((cyag) this.a.get(0)).b();
                this.a.remove(0);
            }
        }
    }

    private final void l(final cyag cyagVar, final cyaz cyazVar, int i, boolean z, int i2) {
        cyagVar.p(this.d);
        cyagVar.v = true;
        cyagVar.F();
        cyagVar.C();
        cyagVar.y = null;
        cyagVar.w(new cyah() { // from class: cyam
            @Override // defpackage.cyah
            public final void f(cyag cyagVar2) {
                cyaz.this.g().run();
            }
        });
        cyagVar.v(new cyah() { // from class: cyan
            @Override // defpackage.cyah
            public final void f(cyag cyagVar2) {
                cyaz.this.f().run();
            }
        });
        cyagVar.C = new cyah() { // from class: cyao
            @Override // defpackage.cyah
            public final void f(cyag cyagVar2) {
                cyaz.this.k();
            }
        };
        cyagVar.z = new cyah() { // from class: cyap
            @Override // defpackage.cyah
            public final void f(cyag cyagVar2) {
                cyaz.this.e().run();
            }
        };
        cyagVar.h.setOnClickListener(new elay(cyagVar.b, "FullBannerUiController: Full content clicked", new View.OnClickListener() { // from class: cxzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cyag cyagVar2 = cyag.this;
                ((akzt) cyagVar2.d.b()).c("Bugle.Banners2o.ContentClicked.Count");
                cyah cyahVar = cyagVar2.z;
                if (cyahVar != null) {
                    cyahVar.f(cyagVar2);
                }
                ((ensz) ((ensz) cyag.a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/FullBannerUiController", "setOnCardClickListener", 325, "FullBannerUiController.java")).q("Banner card button clicked");
            }
        }));
        cyak a = cyazVar.a();
        if (a != null) {
            cxyd cxydVar = (cxyd) a;
            cyagVar.t(cxydVar.a, cxydVar.b);
        }
        cyagVar.y(cyazVar.c());
        cyagVar.n(cyazVar.b(), true);
        cyagVar.x(cyazVar.j());
        cyagVar.s(cyazVar.h());
        Integer d = cyazVar.d();
        if (d != null) {
            cyagVar.z(d.intValue());
        }
        if (i2 > 1) {
            cyagVar.q(this.g.getString(R.string.stacked_banner_count_text, Integer.valueOf(i2)));
        } else {
            cyagVar.q(null);
        }
        cyagVar.o(i);
        cyagVar.x = z;
    }

    @Override // defpackage.cxyq
    public final void a(ViewGroup viewGroup) {
        this.i = viewGroup;
        viewGroup.addView(this.f);
    }

    @Override // defpackage.cxyq
    public final void b() {
        this.i = null;
        ViewGroup viewGroup = (ViewGroup) this.f.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f);
        }
    }

    @Override // defpackage.cxyq
    public final void c(cxyp cxypVar, boolean z) {
        cyag cyagVar = this.b;
        if (cyagVar != null) {
            cyagVar.c(new cyar(this, cxypVar), z);
        } else {
            cxypVar.a(this);
        }
    }

    @Override // defpackage.cxyq
    public final void d(cxyp cxypVar, boolean z) {
        cyag cyagVar = this.b;
        if (cyagVar != null) {
            cyagVar.d(new cyaq(this, cxypVar), z);
        }
        cxypVar.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(engw engwVar) {
        int i = 0;
        if (this.a.size() != engwVar.size()) {
            k(engwVar.size());
        }
        while (i < this.a.size()) {
            int i2 = i + 1;
            if (i == this.a.size() - 1) {
                l((cyag) this.a.get(i), (cyaz) engwVar.get(i), 0, true, i2);
                this.b = (cyag) this.a.get(i);
            } else {
                l((cyag) this.a.get(i), (cyaz) engwVar.get(i), 8, false, i2);
            }
            i = i2;
        }
    }

    public final void g(engw engwVar, cyaz cyazVar) {
        cyax cyaxVar;
        k(engwVar.size() + 1);
        if (this.a.size() > 1) {
            cyag cyagVar = (cyag) this.a.get(r0.size() - 2);
            cyazVar.getClass();
            cyaxVar = this;
            cyaxVar.l(cyagVar, cyazVar, 0, false, this.a.size() - 1);
            cyag cyagVar2 = cyaxVar.b;
            cyagVar2.getClass();
            int i = cyagVar2.E;
            if (i == 0) {
                throw null;
            }
            if (i == 2) {
                cyagVar.f(false);
            } else {
                cyagVar.h(null, false);
            }
        } else {
            cyaxVar = this;
        }
        cyag cyagVar3 = cyaxVar.b;
        cyagVar3.getClass();
        cyagVar3.c(new cyaw(this, engwVar), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(engw engwVar) {
        if (engwVar == null) {
            throw new IllegalStateException("newParamsList should not be null");
        }
        if (!engwVar.isEmpty()) {
            HashSet hashSet = new HashSet();
            boolean isEmpty = TextUtils.isEmpty(((cyaz) engwVar.get(0)).c());
            boolean isEmpty2 = TextUtils.isEmpty(((cyaz) engwVar.get(0)).b());
            boolean z = ((cyaz) engwVar.get(0)).a() != null;
            boolean isEmpty3 = TextUtils.isEmpty(((cyaz) engwVar.get(0)).h());
            int size = engwVar.size();
            for (int i = 0; i < size; i++) {
                cyaz cyazVar = (cyaz) engwVar.get(i);
                emxf.a(!hashSet.contains(cyazVar.i()));
                hashSet.add(cyazVar.i());
                emxf.a(TextUtils.isEmpty(cyazVar.c()) == isEmpty);
                emxf.a(TextUtils.isEmpty(cyazVar.b()) == isEmpty2);
                emxf.a((cyazVar.a() != null) == z);
                emxf.a(TextUtils.isEmpty(cyazVar.h()) == isEmpty3);
            }
        }
        if (Objects.equals(this.c, engwVar)) {
            return;
        }
        if (i()) {
            this.h = engwVar;
            return;
        }
        this.j = true;
        cyaz e = e(engwVar);
        cyaz e2 = e(this.c);
        if ((e == null && e2 == null) || (e != null && e2 != null && Objects.equals(e.i(), e2.i()))) {
            f(engwVar);
            this.c = engwVar;
            j();
            return;
        }
        cyag cyagVar = this.b;
        if (cyagVar != null) {
            cyagVar.x = false;
        }
        cyaz e3 = e(this.c);
        if (e3 != null) {
            int size2 = engwVar.size();
            int i2 = 0;
            while (i2 < size2) {
                boolean equals = Objects.equals(((cyaz) engwVar.get(i2)).i(), e3.i());
                i2++;
                if (!equals) {
                    e = e;
                }
            }
            cyaz cyazVar2 = e;
            cyag cyagVar2 = this.b;
            cyagVar2.getClass();
            int i3 = cyagVar2.E;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == 2) {
                cyagVar2.h(new cyat(this, engwVar, cyazVar2), true);
                return;
            } else {
                g(engwVar, cyazVar2);
                return;
            }
        }
        e.getClass();
        k(engwVar.size() - 1);
        cyag a = this.e.a(this.g);
        l(a, e, 0, false, engwVar.size());
        a.a(this.f);
        this.a.add(a);
        a.d(new cyav(this, e, engwVar), this.i != null);
    }

    public final boolean i() {
        cyag cyagVar = this.b;
        return (cyagVar != null && cyagVar.A()) || this.j;
    }

    public final void j() {
        this.j = false;
        engw engwVar = this.h;
        if (engwVar != null) {
            h(engwVar);
            this.h = null;
        }
    }
}
