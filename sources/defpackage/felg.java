package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class felg extends fema {
    public final feal a;
    public final fdyn b = fdyn.k();
    public final fdxt[] c;
    public volatile Status d;
    final /* synthetic */ feli e;

    public felg(feli feliVar, feal fealVar, fdxt[] fdxtVarArr) {
        this.e = feliVar;
        this.a = fealVar;
        this.c = fdxtVarArr;
    }

    @Override // defpackage.fema, defpackage.fejs
    public final void b(fenl fenlVar) {
        if (((fery) this.a).a.i()) {
            fenlVar.a("wait_for_ready");
            Status status = this.d;
            if (status != null && !status.f()) {
                fenlVar.b("Last Pick Failure", status);
            }
        }
        super.b(fenlVar);
    }

    @Override // defpackage.fema, defpackage.fejs
    public final void c(Status status) {
        super.c(status);
        synchronized (this.e.a) {
            feli feliVar = this.e;
            if (feliVar.e != null) {
                boolean remove = feliVar.g.remove(this);
                if (!this.e.b() && remove) {
                    feli feliVar2 = this.e;
                    feliVar2.b.c(feliVar2.d);
                    if (this.e.h.b != null) {
                        feli feliVar3 = this.e;
                        feliVar3.b.c(feliVar3.e);
                        this.e.e = null;
                    }
                }
            }
        }
        this.e.b.b();
    }

    @Override // defpackage.fema
    protected final void p() {
        int i = 0;
        while (true) {
            fdxt[] fdxtVarArr = this.c;
            if (i >= fdxtVarArr.length) {
                return;
            }
            fdxtVarArr[i].e();
            i++;
        }
    }
}
