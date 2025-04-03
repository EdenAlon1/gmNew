package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxv extends fflr {
    final /* synthetic */ drxw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drxv(drxw drxwVar) {
        super(null);
        this.a = drxwVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        ehrp ehrpVar = (ehrp) obj2;
        ehrp ehrpVar2 = (ehrp) obj;
        if (ehrpVar2 != null) {
            this.a.c.i.l(ehrpVar2);
        }
        if (ehrpVar != null) {
            this.a.c.i.f(ehrpVar);
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
