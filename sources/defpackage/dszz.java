package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dszz extends fflr {
    final /* synthetic */ dtaa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dszz(dtaa dtaaVar) {
        super(null);
        this.a = dtaaVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dsjz dsjzVar = (dsjz) obj2;
        if (dsjzVar == null) {
            throw new IllegalStateException("Do not attempt to apply null HugoColors. This should not happen.");
        }
        dtaa dtaaVar = this.a;
        if (dtaaVar.aT) {
            dtaaVar.aZ(dsjzVar);
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
