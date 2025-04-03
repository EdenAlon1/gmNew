package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwl extends ffkk implements ffjm {
    final /* synthetic */ jzn a;
    final /* synthetic */ gxa b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwl(jzn jznVar, gxa gxaVar, float f, float f2) {
        super(2);
        this.a = jznVar;
        this.b = gxaVar;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        jzn jznVar = this.a;
        float em = jznVar.em(156.0f);
        int intValue = ((Number) ((ffix) this.b.b.a.a()).invoke()).intValue();
        float em2 = jznVar.em(this.c);
        float em3 = jznVar.em(this.d);
        if (floatValue == 0.0f || em == 0.0f) {
            return gxe.a;
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float min = Math.min(em, floatValue);
        float e = ffmk.e(min / 3.0f, em2, em3);
        float f = min + e;
        if (floatValue < em2 + em2) {
            iArr = new int[]{0};
        }
        float f2 = f / 2.0f;
        int ceil = (int) Math.ceil(floatValue / min);
        int max = (ceil - Math.max(1, (int) Math.floor(((floatValue - (ffdo.E(iArr2) * f2)) - (ffdo.E(iArr) * em3)) / min))) + 1;
        int[] iArr3 = new int[max];
        for (int i = 0; i < max; i++) {
            iArr3[i] = ceil - i;
        }
        float em4 = jznVar.em(10.0f);
        gvz a = gvy.a(floatValue, floatValue2, e, em2, em3, iArr, f2, iArr2, min, iArr3);
        if (a != null && a.b() > intValue) {
            int i2 = a.b;
            int i3 = a.d;
            for (int b = a.b() - intValue; b > 0; b--) {
                if (i2 > 0) {
                    i2--;
                } else if (i3 > 1) {
                    i3--;
                }
            }
            a = gvy.a(floatValue, floatValue2, e, em2, em3, new int[]{i2}, f2, new int[]{i3}, min, iArr3);
        }
        if (a == null) {
            return gxe.a;
        }
        gxl gxlVar = new gxl(em4, a, em4);
        gxi gxiVar = new gxi();
        gxlVar.invoke(gxiVar);
        int a2 = gxiVar.a();
        int i4 = gxiVar.a;
        float f3 = gxiVar.b;
        return new gxe(gxi.c(i4, f3 / 2.0f, i4, a2, f3, floatValue, floatValue2, gxiVar.c));
    }
}
