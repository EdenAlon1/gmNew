package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsje extends fflr {
    final /* synthetic */ dsjf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsje(dsjf dsjfVar) {
        super(null);
        this.a = dsjfVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dsjx dsjxVar = (dsjx) obj2;
        if (dsjxVar == null) {
            this.a.setHint((CharSequence) null);
            return;
        }
        this.a.setHint(dsjxVar.a);
        ibw ibwVar = new ibw(dsjxVar.b);
        ibw ibwVar2 = ibwVar.i != 16 ? ibwVar : null;
        if (ibwVar2 != null) {
            this.a.setHintTextColor(iby.b(ibwVar2.i));
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
