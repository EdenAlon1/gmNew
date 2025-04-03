package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsjb extends fflr {
    final /* synthetic */ dsjf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsjb(Object obj, dsjf dsjfVar) {
        super(obj);
        this.a = dsjfVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        float f = ((jzq) obj2).a;
        this.a.setMinHeight(!Float.isNaN(f) ? this.a.b().eo(f) : -1);
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
