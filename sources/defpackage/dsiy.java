package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsiy extends fflr {
    final /* synthetic */ dsjf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsiy(Object obj, dsjf dsjfVar) {
        super(obj);
        this.a = dsjfVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        euw euwVar = (euw) obj2;
        euwVar.getClass();
        int i = euwVar.b;
        Integer num = null;
        Integer num2 = jva.b(i, 1) ? 4096 : jva.b(i, 2) ? 8192 : jva.b(i, 3) ? 16384 : null;
        dsjf dsjfVar = this.a;
        dsie.b(dsjfVar, num2);
        int i2 = euwVar.c;
        dsie.b(dsjfVar, jvb.b(i2, 1) ? 1 : jvb.b(i2, 3) ? 2 : jvb.b(i2, 4) ? 3 : jvb.b(i2, 5) ? 16 : jvb.b(i2, 6) ? 32 : jvb.b(i2, 7) ? 128 : jvb.b(i2, 8) ? 16 : jvb.b(i2, 9) ? 8194 : null);
        int i3 = euwVar.d;
        if (juu.b(i3, 2)) {
            num = 2;
        } else if (juu.b(i3, 3)) {
            num = 3;
        } else if (juu.b(i3, 4)) {
            num = 4;
        } else if (juu.b(i3, 5)) {
            num = 7;
        } else if (juu.b(i3, 6)) {
            num = 5;
        } else if (juu.b(i3, 7)) {
            num = 6;
        }
        if (num != null) {
            dsjfVar.setImeOptions((dsjfVar.getImeOptions() & (-256)) | num.intValue());
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
