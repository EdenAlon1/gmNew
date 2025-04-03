package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgw extends fflr {
    public cjgw() {
        super(null);
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        cjgv cjgvVar = (cjgv) obj2;
        cjgv cjgvVar2 = (cjgv) obj;
        if (cjgvVar2 != null) {
            cjgvVar2.a().setVisibility(8);
        }
        if (cjgvVar != null) {
            cjgvVar.a().setVisibility(0);
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
