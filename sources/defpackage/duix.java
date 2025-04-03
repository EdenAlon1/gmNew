package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duix extends fdxs {
    public duiv b;
    public final ecou d;
    public final Object a = new Object();
    public boolean c = false;

    public duix(ecou ecouVar) {
        this.d = ecouVar;
        ecouVar.c("application/grpc");
    }

    @Override // defpackage.fdxs
    public final fdxt a() {
        synchronized (this.a) {
            if (this.b != null) {
                return new duiw();
            }
            duiv duivVar = new duiv(this.d);
            this.b = duivVar;
            return duivVar;
        }
    }
}
