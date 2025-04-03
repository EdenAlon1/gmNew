package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qsj implements rif {
    private final kfb a;

    public qsj(kfb kfbVar) {
        this.a = kfbVar;
    }

    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        Throwable th = qwpVar;
        if (qwpVar == null) {
            th = new RuntimeException("Unknown error");
        }
        this.a.c(th);
        return true;
    }

    @Override // defpackage.rif
    public final boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        try {
            this.a.b(new qsk(rixVar, obj));
            return true;
        } catch (Throwable th) {
            this.a.c(th);
            return true;
        }
    }
}
