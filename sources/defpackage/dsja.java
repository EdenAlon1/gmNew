package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsja extends fflr {
    final /* synthetic */ dsjf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsja(Object obj, dsjf dsjfVar) {
        super(obj);
        this.a = dsjfVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        float f = ((jzq) obj2).a;
        jzn b = this.a.b();
        jzq jzqVar = new jzq(f);
        if (true == Float.isNaN(jzqVar.a)) {
            jzqVar = null;
        }
        if (jzqVar != null) {
            int eo = b.eo(jzqVar.a);
            dsjf dsjfVar = this.a;
            dsjfVar.setPadding(dsjfVar.getPaddingLeft(), eo, dsjfVar.getPaddingRight(), eo);
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
