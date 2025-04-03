package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.eiwl;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiwo implements eiwl, ljv {
    private static final enru e = enru.c("com/google/apps/tiktok/account/api/controller/ActivityAccountStateActivityBacked");
    public final boolean a;
    private final eivw f;
    private final eixi g;
    private final ekjp i;
    private final ekki k;
    private final List h = new ArrayList();
    private Object j = null;
    public int b = -1;
    public eixz c = eixz.a;
    public int d = 0;

    public eiwo(ekki ekkiVar, eivw eivwVar, eixi eixiVar, emxc emxcVar, ekjp ekjpVar) {
        this.k = ekkiVar;
        this.f = eivwVar;
        this.g = eixiVar;
        this.a = ((Boolean) emxcVar.e(false)).booleanValue();
        this.i = ekjpVar;
        ekkiVar.P().c(this);
        ekkiVar.U().b("tiktok_activity_account_state_saved_instance_state", new owu() { // from class: eiwn
            @Override // defpackage.owu
            public final Bundle a() {
                Bundle bundle = new Bundle();
                eiwo eiwoVar = eiwo.this;
                bundle.putInt("state_account_id", eiwoVar.b);
                ProtoParsers.k(bundle, "state_account_info", eiwoVar.c);
                bundle.putInt("state_account_state", eiwoVar.d);
                bundle.putBoolean("tiktok_accounts_disabled", eiwoVar.a);
                return bundle;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void p(fr frVar) {
        try {
            frVar.as(null);
            List<ea> p = frVar.p();
            if (p == null || p.isEmpty()) {
                return;
            }
            cg cgVar = new cg(frVar);
            for (ea eaVar : p) {
                if ((eaVar instanceof fbas) && (((fbas) eaVar).aX() instanceof eiwl.a)) {
                    cgVar.n(eaVar);
                } else {
                    fr I = eaVar.I();
                    I.an();
                    p(I);
                }
            }
            if (cgVar.i()) {
                return;
            }
            cgVar.B();
            cgVar.c();
        } catch (IllegalStateException e2) {
            StringWriter stringWriter = new StringWriter();
            frVar.L("fm_state", null, new PrintWriter(stringWriter), new String[0]);
            ((enrr) ((enrr) ((enrr) e.i()).g(e2)).h("com/google/apps/tiktok/account/api/controller/ActivityAccountStateActivityBacked", "clearFragments", 333, "ActivityAccountStateActivityBacked.java")).t("popBackStackImmediate failure, fragment state %s", new evhq(evhp.NO_USER_DATA, stringWriter.toString()));
            throw e2;
        }
    }

    private final void q() {
        this.k.a().an();
    }

    private final boolean r(int i, eixz eixzVar, int i2) {
        eixzVar.getClass();
        efbd.c();
        this.g.g();
        int i3 = this.b;
        boolean z = i2 != this.d;
        boolean z2 = i != i3;
        if (z2 || z) {
            q();
        }
        if (z2 || (z && this.d != 0)) {
            p(this.k.a());
        }
        if (z2) {
            int i4 = this.b;
            this.b = i;
            this.i.b(eisx.b(i));
            if (Log.isLoggable("ActivityAccountState", 3)) {
                Log.d("ActivityAccountState", "Account Transition: " + i4 + " > " + this.b);
            }
        }
        if (this.d == 0) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((eiwm) it.next()).a();
            }
        }
        this.c = eixzVar;
        this.d = i2;
        return z2 || z;
    }

    @Override // defpackage.eiwl
    public final int g() {
        efbd.c();
        return this.b;
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        Bundle a = this.k.U().d() ? this.k.U().a("tiktok_activity_account_state_saved_instance_state") : null;
        if (a != null) {
            if (!this.a && a.getBoolean("tiktok_accounts_disabled")) {
                p(this.k.a());
                return;
            }
            this.b = a.getInt("state_account_id", -1);
            try {
                this.c = (eixz) ProtoParsers.d(a, "state_account_info", eixz.a, eyfc.a());
                int i = a.getInt("state_account_state", 0);
                this.d = i;
                if (i != 0) {
                    if (i == 1) {
                        this.f.e();
                        return;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                        }
                        this.f.d();
                    } else {
                        eivw eivwVar = this.f;
                        eisx.b(this.b);
                        eivwVar.c(this.c);
                    }
                }
            } catch (eygu e2) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", e2);
            }
        }
    }

    @Override // defpackage.eiwl
    public final eixz h() {
        efbd.c();
        return this.c;
    }

    @Override // defpackage.eiwl
    public final boolean i() {
        efbd.c();
        return this.b != -1;
    }

    @Override // defpackage.eiwl
    public final void j() {
        r(-1, eixz.a, 0);
    }

    @Override // defpackage.eiwl
    public final void k(Object obj) {
        Object obj2 = this.j;
        boolean z = true;
        if (obj2 != null && obj2 != obj) {
            z = false;
        }
        emxf.l(z);
        this.j = obj;
    }

    @Override // defpackage.eiwl
    public final void l(eiup eiupVar) {
        eiupVar.getClass();
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Error", eiupVar);
        }
        r(-1, eixz.a, 3);
        this.f.d();
        this.f.f(eiupVar);
    }

    @Override // defpackage.eiwl
    public final void m() {
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Loading");
        }
        if (r(-1, eixz.a, 1)) {
            this.f.e();
            this.f.g();
        }
    }

    @Override // defpackage.eiwl
    public final void n(eisx eisxVar, eixz eixzVar, eitk eitkVar) {
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Account: ".concat(String.valueOf(String.valueOf(eisxVar))));
        }
        if (r(eisxVar.a(), eixzVar, 2)) {
            this.f.c(eixzVar);
            this.f.h(eisxVar, eixzVar);
            q();
            this.f.b(eixzVar);
        }
    }

    @Override // defpackage.eiwl
    public final void o(eixz eixzVar) {
        q();
        if (i()) {
            this.f.b(eixzVar);
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
