package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dszc extends fflr {
    final /* synthetic */ dszd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dszc(Object obj, dszd dszdVar) {
        super(obj);
        this.a = dszdVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        this.a.i(intValue, false);
        dqkx.a(this.a.d.d, Integer.valueOf(intValue));
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
