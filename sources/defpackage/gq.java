package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gq implements lkd, owz, lmy {
    public lkv a = null;
    public owy b = null;
    private final ea c;
    private final lmx d;
    private final Runnable e;
    private lms f;

    public gq(ea eaVar, lmx lmxVar, Runnable runnable) {
        this.c = eaVar;
        this.d = lmxVar;
        this.e = runnable;
    }

    @Override // defpackage.lkr
    public final lkk P() {
        b();
        return this.a;
    }

    @Override // defpackage.lkd
    public final lms R() {
        Application application;
        ea eaVar = this.c;
        lms R = eaVar.R();
        if (!R.equals(eaVar.ac)) {
            this.f = R;
            return R;
        }
        if (this.f == null) {
            Context applicationContext = this.c.A().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            ea eaVar2 = this.c;
            this.f = new lmg(application, eaVar2, eaVar2.m);
        }
        return this.f;
    }

    @Override // defpackage.lmy
    public final lmx S() {
        b();
        return this.d;
    }

    @Override // defpackage.lkd
    public final lnx T() {
        Application application;
        Context applicationContext = this.c.A().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        loa loaVar = new loa();
        if (application != null) {
            loaVar.b(lmp.b, application);
        }
        loaVar.b(lmc.a, this.c);
        loaVar.b(lmc.b, this);
        Bundle bundle = this.c.m;
        if (bundle != null) {
            loaVar.b(lmc.c, bundle);
        }
        return loaVar;
    }

    @Override // defpackage.owz
    public final owv U() {
        b();
        return this.b.a;
    }

    final void a(lki lkiVar) {
        this.a.e(lkiVar);
    }

    final void b() {
        if (this.a == null) {
            this.a = new lkv(this);
            owy a = owx.a(this);
            this.b = a;
            a.a();
            this.e.run();
        }
    }
}
