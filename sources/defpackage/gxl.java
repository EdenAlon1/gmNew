package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxl extends ffkk implements ffji {
    final /* synthetic */ float a;
    final /* synthetic */ gvz b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxl(float f, gvz gvzVar, float f2) {
        super(1);
        this.a = f;
        this.b = gvzVar;
        this.c = f2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        gvz gvzVar;
        gxi gxiVar = (gxi) obj;
        gxiVar.b(this.a, true);
        int i = 0;
        while (true) {
            gvzVar = this.b;
            if (i >= gvzVar.f) {
                break;
            }
            gxiVar.b(gvzVar.e, false);
            i++;
        }
        for (int i2 = 0; i2 < gvzVar.d; i2++) {
            gxiVar.b(gvzVar.c, false);
        }
        gvz gvzVar2 = this.b;
        for (int i3 = 0; i3 < gvzVar2.b; i3++) {
            gxiVar.b(gvzVar2.a, false);
        }
        gxiVar.b(this.c, true);
        return ffcu.a;
    }
}
