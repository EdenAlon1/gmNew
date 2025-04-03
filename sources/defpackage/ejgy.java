package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgy implements ljv {
    public final ea a;
    public final eito b;
    final ebbc c;
    private final elbx f;
    private final eays g = new ejgx(this);
    eisx d = null;
    public eixn e = null;

    public ejgy(ea eaVar, eito eitoVar, emxc emxcVar, elbx elbxVar) {
        this.a = eaVar;
        this.b = eitoVar;
        this.f = elbxVar;
        ebbc ebbcVar = new ebbc(new ejhi(emxcVar));
        this.c = ebbcVar;
        ebbcVar.a.a = false;
        eaVar.P().c(this);
        eaVar.U().b("tiktok_og_model_saved_instance_state", new owu() { // from class: ejgw
            @Override // defpackage.owu
            public final Bundle a() {
                Bundle bundle = new Bundle();
                bundle.putParcelable("active_account_id", ejgy.this.d);
                return bundle;
            }
        });
    }

    private final void k(eixn eixnVar) {
        this.b.b(eixnVar.a());
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        this.c.d(this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eixn g(eisx eisxVar) {
        if (eisxVar == null) {
            return null;
        }
        engw b = this.c.b();
        int i = ((enou) b).c;
        int i2 = 0;
        while (i2 < i) {
            eixn eixnVar = (eixn) b.get(i2);
            i2++;
            if (eisxVar.equals(eixnVar.a())) {
                return eixnVar;
            }
        }
        return null;
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        Bundle a2 = this.a.U().d() ? this.a.U().a("tiktok_og_model_saved_instance_state") : null;
        if (a2 != null) {
            this.d = (eisx) a2.getParcelable("active_account_id");
        }
        this.c.c(this.g);
    }

    public final void h() {
        j(null);
    }

    final void i(eixn eixnVar) {
        if (ekyf.v()) {
            k(eixnVar);
            return;
        }
        ekzm b = this.f.b("Nav: Switch Account");
        try {
            k(eixnVar);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j(eisx eisxVar) {
        this.d = eisxVar;
        this.c.g(g(eisxVar));
    }

    /* compiled from: PG */
    public final class a implements ejwd, ljv {
        private final ejgy a;
        private final ejgz b;
        private emxc c = emux.a;
        private final emxc d;

        public a(ejgy ejgyVar, emxc emxcVar, ejgz ejgzVar, emxc emxcVar2) {
            this.a = ejgyVar;
            this.b = ejgzVar;
            this.d = emxcVar2;
            ejhh ejhhVar = (ejhh) ((emxn) emxcVar).a;
            if (ejhhVar.a.compareAndSet(false, true)) {
                ejhhVar.b.d(new ejhg(ejhhVar));
            }
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            this.c = emux.a;
            this.a.h();
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            List<eixn> list = (List) obj;
            enip o = enip.o(list);
            if (this.c.g() && ((enip) this.c.c()).equals(o)) {
                return;
            }
            this.c = emxc.j(o);
            ArrayList arrayList = new ArrayList();
            for (eixn eixnVar : list) {
                if ("pseudonymous".equals(eixnVar.b().k)) {
                    ejgy ejgyVar = this.a;
                    emxf.l("pseudonymous".equals(eixnVar.b().k));
                    ejgyVar.e = eixnVar;
                } else if (!"incognito".equals(eixnVar.b().k)) {
                    arrayList.add(eixnVar);
                }
            }
            this.a.c.a.g(engw.n(arrayList));
            ejgy ejgyVar2 = this.a;
            ejgyVar2.c.g(ejgyVar2.g(ejgyVar2.d));
            if (((Boolean) this.d.e(false)).booleanValue()) {
                ejgz ejgzVar = this.b;
                if (ejgzVar.a.compareAndSet(false, true)) {
                    ejjz.c(ejgzVar.b.b(), "Failed to sync accounts in the OGAccountsModel", new Object[0]);
                }
            }
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
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
        public final /* synthetic */ void gZ(lkr lkrVar) {
        }

        @Override // defpackage.ljv
        public final /* synthetic */ void ha(lkr lkrVar) {
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
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
