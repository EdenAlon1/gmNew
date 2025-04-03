package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsfs extends fflr {
    final /* synthetic */ dsfv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsfs(dsfv dsfvVar) {
        super(null);
        this.a = dsfvVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dskc dskcVar = (dskc) obj2;
        dskc dskcVar2 = (dskc) obj;
        if (dskcVar2 != null) {
            dskcVar2.setSelected(false);
        }
        if (dskcVar != null) {
            dskcVar.setSelected(true);
            if (this.a.g.c() != dsmm.d) {
                this.a.c.e(dskcVar, false);
            }
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
