package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czgj implements czgx, czfi {
    private final Runnable A;
    public final czgy a;
    public final czha b;
    public final czfj c;
    public final ddzb d;
    public final bcpw e;
    public final czgd[] f;
    public final czgb g;
    public final czfx h;
    public final alct i;
    public final dede j;
    public final ctud k;
    public boolean o;
    public boolean p;
    public final decz q;
    public final decy r;
    private final fr s;
    private final Context t;
    private final bcpw u;
    private final czga v;
    private final csmj w;
    private final ffbr x;
    private int y;
    public final Handler l = new Handler(Looper.getMainLooper());
    public boolean m = false;
    public boolean n = false;
    private boolean z = false;

    public czgj(czfy czfyVar, czfh czfhVar, alct alctVar, alcb alcbVar, czgc czgcVar, dede dedeVar, ctud ctudVar, csmj csmjVar, cqoh cqohVar, ddzb ddzbVar, ffbr ffbrVar, Context context, czgy czgyVar, czha czhaVar, czff czffVar, fr frVar, csuk csukVar, cpbn cpbnVar, bcpu bcpuVar, bcpu bcpuVar2, bdud bdudVar) {
        this.o = false;
        this.p = false;
        czgi czgiVar = new czgi(this);
        this.q = czgiVar;
        decy decyVar = new decy() { // from class: czgg
            @Override // defpackage.decy
            public final void b(int i) {
                czgj czgjVar = czgj.this;
                if (czgjVar.o || czgjVar.p) {
                    return;
                }
                czgjVar.w(i, -1L);
                csjy.i("Bugle", a.h(i, "ConversationInputManager: IME height changed to: "));
            }
        };
        this.r = decyVar;
        this.A = new Runnable() { // from class: czgh
            @Override // java.lang.Runnable
            public final void run() {
                czgj.this.h(false);
            }
        };
        this.i = alctVar;
        this.j = dedeVar;
        this.k = ctudVar;
        this.w = csmjVar;
        this.x = ffbrVar;
        this.d = ddzbVar;
        this.t = context;
        this.a = czgyVar;
        this.b = czhaVar;
        this.s = frVar;
        bcpw bcpwVar = new bcpw(bcpuVar);
        this.u = bcpwVar;
        bcpw bcpwVar2 = new bcpw(bcpuVar2);
        this.e = bcpwVar2;
        this.o = ddzbVar.n();
        this.p = czgyVar.bc();
        dedeVar.d(czgiVar);
        dedeVar.c(decyVar);
        Context context2 = (Context) czfhVar.a.b();
        context2.getClass();
        this.c = new czfg(context2, this, czffVar, dedeVar);
        czga czgaVar = new czga(this, czgyVar, czhaVar, frVar, alctVar, alcbVar, cqohVar, context);
        this.v = czgaVar;
        dede dedeVar2 = (dede) czgcVar.a.b();
        dedeVar2.getClass();
        czhaVar.getClass();
        context.getClass();
        this.g = new czgb(dedeVar2, this, czhaVar, context);
        bbfb bbfbVar = (bbfb) czfyVar.a.b();
        bbfbVar.getClass();
        alcb alcbVar2 = (alcb) czfyVar.b.b();
        alcbVar2.getClass();
        alct alctVar2 = (alct) czfyVar.c.b();
        alctVar2.getClass();
        dcax dcaxVar = (dcax) czfyVar.d.b();
        dcaxVar.getClass();
        dcba dcbaVar = (dcba) czfyVar.e.b();
        dcbaVar.getClass();
        altk altkVar = (altk) czfyVar.f.b();
        altkVar.getClass();
        ffbr ffbrVar2 = czfyVar.g;
        cqoh cqohVar2 = (cqoh) czfyVar.h.b();
        cqohVar2.getClass();
        cxqh cxqhVar = (cxqh) czfyVar.i.b();
        cxqhVar.getClass();
        uot uotVar = (uot) czfyVar.j.b();
        uotVar.getClass();
        uco ucoVar = (uco) czfyVar.k.b();
        ucoVar.getClass();
        ddzb ddzbVar2 = (ddzb) czfyVar.l.b();
        ddzbVar2.getClass();
        byzp byzpVar = (byzp) czfyVar.m.b();
        byzpVar.getClass();
        czgyVar.getClass();
        czhaVar.getClass();
        frVar.getClass();
        czfx czfxVar = new czfx(bbfbVar, alcbVar2, alctVar2, dcaxVar, dcbaVar, altkVar, ffbrVar2, cqohVar2, cxqhVar, uotVar, ucoVar, ddzbVar2, byzpVar, this, czgyVar, czhaVar, frVar, csukVar, cpbnVar, bcpwVar2, bcpwVar, bdudVar, context);
        this.h = czfxVar;
        this.f = new czgd[]{czfxVar, czgaVar};
    }

    private final int E() {
        View p = this.b.p();
        WindowInsets rootWindowInsets = p != null ? p.getRootWindowInsets() : null;
        int systemWindowInsetBottom = rootWindowInsets != null ? rootWindowInsets.getSystemWindowInsetBottom() : 0;
        Context context = this.t;
        int a = this.j.a();
        if (a == -1) {
            dede dedeVar = this.j;
            a = dedeVar.d.d(true != dedeVar.e.n() ? "last_ime_height" : "last_ime_height_landscape", -1);
            if (a == -1) {
                a = context.getResources().getDimensionPixelSize(R.dimen.c2o_fragment_default_height);
            }
        }
        if (systemWindowInsetBottom >= a) {
            return systemWindowInsetBottom;
        }
        return Math.max(a + systemWindowInsetBottom, this.t.getResources().getDimensionPixelSize(R.dimen.c2o_ime_minimum_height));
    }

    public final void A(int i) {
        czfj czfjVar = this.c;
        czgj czgjVar = (czgj) czfjVar.h;
        czha czhaVar = czgjVar.b;
        czgy czgyVar = czgjVar.a;
        if (czhaVar != null && czgyVar != null) {
            PlainTextEditText v = i + (-1) != 0 ? ((cxtc) czhaVar).c.n : ((cxtc) czhaVar).v();
            czfjVar.l = i;
            if (v != null) {
                if (((Boolean) czfj.g.e()).booleanValue()) {
                    czfjVar.i.k(v.getContext(), v);
                } else {
                    czfjVar.i.j(v.getContext(), v);
                }
            }
        }
        czfg czfgVar = (czfg) czfjVar;
        czgj czgjVar2 = (czgj) czfgVar.h;
        boolean z = czgjVar2.m;
        czfgVar.f = z;
        boolean z2 = czgjVar2.n;
        czfgVar.e = z2;
        if (z || z2) {
            czfgVar.c();
            ((czgj) czfgVar.h).l.postDelayed(czfgVar.c, czfgVar.a.getResources().getInteger(R.integer.ime_appear_delay_ms));
        }
    }

    final int B() {
        View findViewById;
        Object apply;
        int i;
        if (!this.d.n() && !this.p) {
            return E();
        }
        czgy czgyVar = this.a;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        vvn vvnVar = (vvn) czgyVar;
        vvnVar.p().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels - vvnVar.cV;
        View view = vvnVar.cr;
        if (view != null) {
            Rect g = vvnVar.av.g(view);
            float f = displayMetrics.heightPixels;
            if (g.top > 0 && g.top < ((int) (f * 0.2f))) {
                i = g.top;
            } else if (g.top < 0 || vvnVar.N.B().getConfiguration().orientation == 2) {
                i = vvnVar.z;
                if (i == -1) {
                    View findViewById2 = vvnVar.p().findViewById(android.R.id.statusBarBackground);
                    i = findViewById2 != null ? findViewById2.getMeasuredHeight() : 0;
                }
            }
            i2 -= i;
        }
        if ((!vvnVar.aG.n() && !vvnVar.bc()) || (findViewById = vvnVar.p().findViewById(R.id.action_add_more_people)) == null || findViewById.getVisibility() != 0) {
            return i2;
        }
        Function function = new Function() { // from class: vrr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = vvn.a;
                return ((uav) obj).e().findViewById(R.id.compose_message_text);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        Function function2 = new Function() { // from class: vrs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = vvn.a;
                return ((ComposeMessageView) obj).findViewById(R.id.compose_message_text);
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        };
        if (vvnVar.ba()) {
            uav w = vvnVar.w();
            w.getClass();
            apply = function.apply(w);
        } else {
            apply = function2.apply(vvnVar.cv);
        }
        View view2 = (View) apply;
        return view2 != null ? i2 - view2.getHeight() : i2;
    }

    public final void C(boolean z) {
        D(this.v, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r2.s(r4) != false) goto L13;
     */
    @Override // defpackage.czgx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(defpackage.czgz r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            bcpw r0 = r1.u
            boolean r0 = r0.g()
            if (r0 != 0) goto L9
            goto L24
        L9:
            boolean r0 = r2.y()
            if (r0 == r3) goto L24
            r1.j()
            if (r3 != 0) goto L1b
            boolean r4 = r2.s(r4)
            if (r4 == 0) goto L21
            goto L1e
        L1b:
            r2.v(r4)
        L1e:
            r2.w(r3)
        L21:
            r1.l()
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czgj.D(czgz, boolean, boolean):void");
    }

    @Override // defpackage.czfi
    public final void a() {
        View q = this.b.q();
        if (!this.n || q == null) {
            return;
        }
        C(false);
        d(false);
        q.getContext();
        w(B(), -1L);
    }

    @Override // defpackage.czfi
    public final void b() {
        this.l.removeCallbacks(this.A);
    }

    @Override // defpackage.czfi
    public final void c(boolean z) {
        this.m = z;
        v();
    }

    @Override // defpackage.czfi
    public final void d(boolean z) {
        this.n = z;
        v();
    }

    @Override // defpackage.czfi
    public final void e(int i, boolean z) {
        View p;
        if (this.m || (p = this.b.p()) == null) {
            return;
        }
        final vvn vvnVar = (vvn) this.a;
        vvnVar.S(null, new Consumer() { // from class: vqa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((ComposeMessageView) obj).addOnLayoutChangeListener(vvn.this.t());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        vvnVar.cs.addOnLayoutChangeListener(vvnVar.t());
        vvnVar.T(null, new Consumer() { // from class: vqb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                vvn.this.bc.b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (i == -1) {
            p.getContext();
            i = B();
        }
        if (z) {
            Runnable runnable = new Runnable() { // from class: czge
                @Override // java.lang.Runnable
                public final void run() {
                    czgj.this.s();
                }
            };
            cria criaVar = new cria(p, 0);
            if (i != Integer.MIN_VALUE) {
                criaVar.a(i);
            }
            csmj.l(p, 0, -1L, csmj.b, runnable, criaVar);
        } else {
            p.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = p.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            }
            if (layoutParams.height != i) {
                layoutParams.height = i;
                p.requestLayout();
            }
            s();
        }
        this.h.h();
        c(true);
    }

    @Override // defpackage.czfi
    public final void f() {
        View q = this.b.q();
        if (this.n || q == null) {
            return;
        }
        if (this.b.p() != null) {
            this.z = true;
            h(false);
        }
        C(true);
        d(true);
    }

    @Override // defpackage.czfi
    public final boolean g() {
        int i = 0;
        while (true) {
            czgd[] czgdVarArr = this.f;
            int length = czgdVarArr.length;
            if (i >= 2) {
                return false;
            }
            if (czgdVarArr[i].q) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.czfi
    public final void h(boolean z) {
        czfx czfxVar = this.h;
        if (czfxVar != null) {
            D(czfxVar, z, false);
        }
    }

    @Override // defpackage.czgx
    public final String i(czgz czgzVar) {
        return String.valueOf(czgzVar.getClass().getCanonicalName()).concat("_savedstate_");
    }

    @Override // defpackage.czgx
    public final void j() {
        this.y++;
    }

    public final void k() {
        this.a.Z();
        w(z() ? E() : B(), 0L);
    }

    @Override // defpackage.czgx
    public final void l() {
        csix.k(this.y > 0);
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            this.a.Z();
        }
    }

    public final void m() {
        if (w(z() ? E() : B(), 0L)) {
            this.a.Z();
        }
    }

    public final void n(boolean z) {
        j();
        int i = 0;
        while (true) {
            czgd[] czgdVarArr = this.f;
            int length = czgdVarArr.length;
            if (i >= 2) {
                l();
                this.c.a(false);
                a();
                o(true, z);
                return;
            }
            czgd czgdVar = czgdVarArr[i];
            if (czgdVar != this.h) {
                D(czgdVar, false, z);
            }
            i++;
        }
    }

    public final void o(final boolean z, boolean z2) {
        if (this.m) {
            this.a.ag();
            View p = this.b.p();
            if (p != null) {
                csmj.l(p, 8, true != z2 ? 0L : -1L, csmj.b, eldl.l(new Runnable() { // from class: czgf
                    @Override // java.lang.Runnable
                    public final void run() {
                        czgj czgjVar = czgj.this;
                        if (z) {
                            czgjVar.h(false);
                            czgjVar.b.S();
                            czfg czfgVar = (czfg) czgjVar.c;
                            czfgVar.b.z(48);
                            czfgVar.f = false;
                            czgjVar.c(false);
                            if (czgjVar.c.l == 1) {
                                czgjVar.b.G(czgjVar.j.b);
                            }
                        }
                        vvn vvnVar = (vvn) czgjVar.a;
                        View view = vvnVar.cr;
                        if (view != null) {
                            view.setPadding(vvnVar.A.getSystemWindowInsetLeft(), 0, vvnVar.A.getStableInsetRight(), vvnVar.A.getSystemWindowInsetBottom());
                        }
                        vvnVar.ar();
                    }
                }), new cria(p, 1));
                this.h.g();
            }
        }
    }

    @Override // defpackage.czgx
    public final void p(CharSequence charSequence) {
        PlainTextEditText v = ((cxtc) this.b).v();
        int selectionStart = v.getSelectionStart();
        int selectionEnd = v.getSelectionEnd();
        v.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), charSequence);
        ((upg) this.x.b()).a();
    }

    public final void q() {
        if (this.p && !this.a.bc()) {
            this.p = false;
            k();
        } else if (!this.p && this.a.bc()) {
            this.p = true;
            m();
        } else if (this.a.bc()) {
            if (y() || z()) {
                w(B(), 0L);
            } else {
                o(true, true);
            }
        }
        v();
    }

    public final void r(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        czgd[] czgdVarArr = this.f;
        int length = czgdVarArr.length;
        for (int i = 0; i < 2; i++) {
            czgdVarArr[i].q(bundle);
        }
        czfj czfjVar = this.c;
        czfjVar.j = bundle.getBoolean("is_ime_visible_before_pause", false);
        czfjVar.k = bundle.getBoolean("is_c2o_visible_before_pause", false);
        czfg czfgVar = (czfg) czfjVar;
        czfgVar.f = bundle.getBoolean("is_c2o_hidden_behind_ime", false);
        czfgVar.d = bundle.getBoolean("is_emoji_picker_visible_before_pause", false);
        czfgVar.e = bundle.getBoolean("is_emoji_picker_hidden_behind_ime", false);
    }

    public final void s() {
        this.b.S();
        ((vvn) this.a).ar();
    }

    public final void t() {
        this.h.r(false);
        a();
        this.c.b();
        List list = ((bcvr) this.e.a()).v;
        epts eptsVar = epts.ALL;
        eptu eptuVar = eptu.COLLAPSED;
        list.size();
        this.i.d(eptsVar, eptuVar, epto.UNKNOWN_OPENING_STATE, eptm.PLUS_BUTTON);
    }

    @Override // defpackage.czgx
    public final void u(eptm eptmVar) {
        if (eptmVar == eptm.DRAFT_END_EMOJI_BUTTON && !this.m) {
            this.c.c();
            e(E(), false);
        }
        f();
        if (this.j.b) {
            this.c.a(false);
        }
        this.h.r(false);
        this.b.S();
        this.i.d(epts.EMOJI, eptu.EXPANDED, epto.UNKNOWN_OPENING_STATE, eptmVar);
    }

    final void v() {
        if ((this.o || this.p) && this.m && !this.n) {
            this.b.M(4);
        } else {
            this.b.M(1);
        }
    }

    final boolean w(int i, long j) {
        ViewGroup.LayoutParams layoutParams;
        View p = this.b.p();
        if (p == null || !this.m || (layoutParams = p.getLayoutParams()) == null || layoutParams.height == i) {
            return false;
        }
        if (j != 0) {
            this.w.j(p, i, -1L);
            return true;
        }
        layoutParams.height = i;
        p.requestLayout();
        return true;
    }

    public final boolean x() {
        if (this.j.b) {
            this.c.a(true);
            if (this.n) {
                this.b.X();
            }
            this.b.S();
            this.a.ag();
            return true;
        }
        if (!this.n) {
            if (!this.m) {
                return false;
            }
            o(true, true);
            return true;
        }
        czdq a = czgn.a(this.s);
        if (a != null && a.e()) {
            return true;
        }
        a();
        w(B(), -1L);
        if (((Boolean) cful.g.e()).booleanValue()) {
            o(true, false);
        } else if (this.z) {
            this.l.removeCallbacks(this.A);
            h(true);
            this.z = false;
        } else {
            o(false, false);
        }
        this.b.S();
        return true;
    }

    public final boolean y() {
        czfx czfxVar = this.h;
        if (czfxVar != null) {
            return czfxVar.q;
        }
        return false;
    }

    public final boolean z() {
        return this.v.q;
    }
}
