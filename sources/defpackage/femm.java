package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class femm extends ferc {
    private boolean b;
    private final Status c;
    private final fejt d;
    private final fdxt[] e;

    public femm(Status status, fejt fejtVar, fdxt[] fdxtVarArr) {
        emxf.b(!status.f(), "error must not be OK");
        this.c = status;
        this.d = fejtVar;
        this.e = fdxtVarArr;
    }

    @Override // defpackage.ferc, defpackage.fejs
    public final void b(fenl fenlVar) {
        fenlVar.b("error", this.c);
        fenlVar.b("progress", this.d);
    }

    @Override // defpackage.ferc, defpackage.fejs
    public final void m(feju fejuVar) {
        emxf.m(!this.b, "already started");
        this.b = true;
        int i = 0;
        while (true) {
            fdxt[] fdxtVarArr = this.e;
            if (i >= fdxtVarArr.length) {
                fejuVar.a(this.c, this.d, new febo());
                return;
            } else {
                fdxtVarArr[i].e();
                i++;
            }
        }
    }

    public femm(Status status, fdxt[] fdxtVarArr) {
        this(status, fejt.PROCESSED, fdxtVarArr);
    }
}
