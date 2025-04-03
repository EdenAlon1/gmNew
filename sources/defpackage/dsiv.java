package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsiv extends fflr {
    final /* synthetic */ dsjf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsiv(dsjf dsjfVar) {
        super(null);
        this.a = dsjfVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (!ffkj.e(bool, true)) {
            if (ffkj.e(bool, false)) {
                this.a.f();
            }
        } else if (this.a.hasFocus()) {
            this.a.g();
        } else {
            this.a.requestFocus();
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
