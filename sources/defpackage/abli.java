package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abli extends fflr {
    final /* synthetic */ abll a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abli(Object obj, abll abllVar) {
        super(obj);
        this.a = abllVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        ablg ablgVar = (ablg) obj2;
        ablg ablgVar2 = (ablg) obj;
        if (ablgVar2 != ablgVar) {
            ablg ablgVar3 = ablg.a;
            if (ablgVar == ablgVar3) {
                abll abllVar = this.a;
                abllVar.e.a(ddrd.c, abllVar.h.incrementAndGet());
            } else if (ablgVar2 == ablgVar3) {
                abll abllVar2 = this.a;
                abllVar2.e.e(ddrd.c, abllVar2.h.get(), null, ablgVar == ablg.c ? ecrh.CANCEL : ecrh.SUCCESS);
            }
        }
    }
}
