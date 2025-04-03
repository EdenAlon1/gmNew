package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehoo extends lej {
    private final int a;

    public ehoo(int i) {
        this.a = i;
    }

    @Override // defpackage.lej
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = ehop.A;
        float[] fArr = ((ehop) obj).z;
        if (fArr != null) {
            return fArr[this.a];
        }
        return 0.0f;
    }

    @Override // defpackage.lej
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        ehop ehopVar = (ehop) obj;
        int i = ehop.A;
        float[] fArr = ehopVar.z;
        if (fArr != null) {
            fArr[this.a] = f;
            ehopVar.invalidateSelf();
        }
    }
}
