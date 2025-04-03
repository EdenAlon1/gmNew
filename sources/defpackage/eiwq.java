package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiwq implements eiwl, ljv {
    public static final eiwp a = new eiwp();
    public static final enru b = enru.c("com/google/apps/tiktok/account/api/controller/ActivityAccountStateViewModelBacked");
    private final eivw c;
    private final eixi d;
    private final ekjp e;
    private final ffbz f;
    private final List g;
    private final boolean h;
    private Object i;
    private final ekki j;

    public eiwq(final ekki ekkiVar, eivw eivwVar, eixi eixiVar, emxc emxcVar, ekjp ekjpVar) {
        ekkiVar.getClass();
        eivwVar.getClass();
        eixiVar.getClass();
        ekjpVar.getClass();
        this.j = ekkiVar;
        this.c = eivwVar;
        this.d = eixiVar;
        this.e = ekjpVar;
        int i = fflc.a;
        this.f = new lmn(new ffkb(eixb.class), new ffix() { // from class: eiwr
            @Override // defpackage.ffix
            public final Object invoke() {
                return ekki.this.S();
            }
        }, new ffix() { // from class: eiws
            @Override // defpackage.ffix
            public final Object invoke() {
                return ekki.this.R();
            }
        }, new ffix() { // from class: eiwt
            @Override // defpackage.ffix
            public final Object invoke() {
                return ekki.this.T();
            }
        });
        this.g = new ArrayList();
        this.h = ((Boolean) emxcVar.e(false)).booleanValue();
        ekkiVar.P().c(this);
    }

    private final eixb p() {
        return (eixb) this.f.a();
    }

    private final void q() {
        this.j.a().an();
    }

    private final boolean r(int i, eixz eixzVar, int i2) {
        efbd.c();
        this.d.g();
        int g = g();
        boolean z = i2 != p().c;
        boolean z2 = i != g;
        if (z2 || z) {
            q();
        }
        if (z2 || (z && p().c != 0)) {
            a.a(this.j.a());
        }
        if (z2) {
            int g2 = g();
            p().a = i;
            this.e.b(eisx.b(g()));
            if (Log.isLoggable("ActivityAccountState", 3)) {
                Log.d("ActivityAccountState", "Account Transition: " + g2 + " > " + g());
            }
        }
        if (p().c == 0) {
            g();
            if (p().c == 0) {
                s();
            } else {
                g();
                s();
            }
        }
        p().b = eixzVar;
        p().c = i2;
        return z2 || z;
    }

    private final void s() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((eiwm) it.next()).a();
        }
    }

    @Override // defpackage.eiwl
    public final int g() {
        efbd.c();
        return p().a;
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        boolean z = p().e && !this.h && p().d;
        p().d = this.h;
        if (z) {
            eixb p = p();
            p.a = -1;
            p.b = eixz.a;
            p.c = 0;
            a.a(this.j.a());
            return;
        }
        int i = p().c;
        if (i != 0) {
            if (i == 1) {
                this.c.e();
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                }
                this.c.d();
            } else {
                eivw eivwVar = this.c;
                eisx.b(g());
                eivwVar.c(p().b);
            }
        }
    }

    @Override // defpackage.eiwl
    public final eixz h() {
        efbd.c();
        return p().b;
    }

    @Override // defpackage.eiwl
    public final boolean i() {
        efbd.c();
        return p().a != -1;
    }

    @Override // defpackage.eiwl
    public final void j() {
        eixz eixzVar = eixz.a;
        eixzVar.getClass();
        r(-1, eixzVar, 0);
    }

    @Override // defpackage.eiwl
    public final void k(Object obj) {
        Object obj2 = this.i;
        if (obj2 != null && !ffkj.e(obj2, obj)) {
            throw new IllegalStateException("Check failed.");
        }
        this.i = obj;
    }

    @Override // defpackage.eiwl
    public final void l(eiup eiupVar) {
        eiupVar.getClass();
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Error", eiupVar);
        }
        eixz eixzVar = eixz.a;
        eixzVar.getClass();
        r(-1, eixzVar, 3);
        this.c.d();
        this.c.f(eiupVar);
    }

    @Override // defpackage.eiwl
    public final void m() {
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Loading");
        }
        eixz eixzVar = eixz.a;
        eixzVar.getClass();
        if (r(-1, eixzVar, 1)) {
            this.c.e();
            this.c.g();
        }
    }

    @Override // defpackage.eiwl
    public final void n(eisx eisxVar, eixz eixzVar, eitk eitkVar) {
        eisxVar.getClass();
        eixzVar.getClass();
        eitkVar.getClass();
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Objects.toString(eisxVar);
            Log.d("ActivityAccountState", "Switch To Account: ".concat(eisxVar.toString()));
        }
        if (r(eisxVar.a(), eixzVar, 2)) {
            this.c.c(eixzVar);
            this.c.h(eisxVar, eixzVar);
            q();
            this.c.b(eixzVar);
        }
    }

    @Override // defpackage.eiwl
    public final void o(eixz eixzVar) {
        eixzVar.getClass();
        q();
        if (i()) {
            this.c.b(eixzVar);
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
