package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsix extends fflr {
    final /* synthetic */ dsjf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsix(dsjf dsjfVar) {
        super(null);
        this.a = dsjfVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        int i;
        kah kahVar = (kah) obj2;
        if (kahVar != null) {
            dsjf dsjfVar = this.a;
            int ordinal = kahVar.ordinal();
            if (ordinal != 0) {
                i = 1;
                if (ordinal != 1) {
                    throw new ffcd();
                }
            } else {
                i = 0;
            }
            dsjfVar.setLayoutDirection(i);
            dsjfVar.setTextAlignment(5);
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
