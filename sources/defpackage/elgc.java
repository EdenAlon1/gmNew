package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elgc implements rif {
    private final rif a;
    private final elbx b;

    public elgc(rif rifVar, elbx elbxVar) {
        this.a = rifVar;
        this.b = elbxVar;
    }

    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        if (ekyf.v()) {
            this.a.a(qwpVar, obj, rixVar, z);
            return true;
        }
        ekzm a = this.b.a(elgc.class, "onLoadFailed");
        try {
            this.a.a(qwpVar, obj, rixVar, z);
            a.close();
            return true;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rif
    public final boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        if (ekyf.v()) {
            this.a.b(obj, obj2, rixVar, qsyVar, z);
            return false;
        }
        ekzm a = this.b.a(elgc.class, "onResourceReady");
        try {
            this.a.b(obj, obj2, rixVar, qsyVar, z);
            a.close();
            return false;
        } finally {
        }
    }
}
