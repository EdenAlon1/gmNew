package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dstx {
    public final dspe a;
    public final hho b;
    public final hho c;
    public final hho d;
    public final hho e;
    public final hho f;
    public final hkx g;
    public final dni h = new dni(new ffjn() { // from class: dstw
        @Override // defpackage.ffjn
        public final Object a(Object obj, Object obj2, Object obj3) {
            long floatToRawIntBits;
            float floatValue = ((Float) obj).floatValue();
            iak iakVar = (iak) obj2;
            ((Float) obj3).floatValue();
            dstx dstxVar = dstx.this;
            hho hhoVar = dstxVar.b;
            hhoVar.b(Float.valueOf(ffmk.e(((hjx) hhoVar).a().floatValue() * floatValue, 1.0f, 4.0f)));
            float floatValue2 = ((int) (((kaf) dstxVar.c.a()).a >> 32)) * ((hjx) dstxVar.b).a().floatValue();
            float floatValue3 = ((int) (((kaf) dstxVar.c.a()).a & 4294967295L)) * ((hjx) dstxVar.b).a().floatValue();
            dspe dspeVar = dstxVar.a;
            int b = jzk.b(dspeVar.a());
            int a = jzk.a(dspeVar.a());
            hho hhoVar2 = dstxVar.b;
            float a2 = dstxVar.a(floatValue2, b);
            float a3 = dstxVar.a(floatValue3, a);
            if (((hjx) hhoVar2).a().floatValue() == 1.0f) {
                floatToRawIntBits = 0;
            } else {
                float e = ffmk.e(Float.intBitsToFloat((int) (((iak) dstxVar.d.a()).a >> 32)) + Float.intBitsToFloat((int) (iakVar.a >> 32)), -a2, a2);
                float e2 = ffmk.e(Float.intBitsToFloat((int) (((iak) dstxVar.d.a()).a & 4294967295L)) + Float.intBitsToFloat((int) (iakVar.a & 4294967295L)), -a3, a3);
                floatToRawIntBits = (Float.floatToRawIntBits(e) << 32) | (Float.floatToRawIntBits(e2) & 4294967295L);
            }
            dstxVar.d.b(new iak(floatToRawIntBits));
            return ffcu.a;
        }
    });

    public dstx(dspe dspeVar, hho hhoVar, hho hhoVar2, hho hhoVar3, hho hhoVar4, hho hhoVar5) {
        this.a = dspeVar;
        this.b = hhoVar;
        this.c = hhoVar2;
        this.d = hhoVar3;
        this.e = hhoVar4;
        this.f = hhoVar5;
        this.g = hhoVar4;
    }

    public final float a(float f, float f2) {
        float floatValue = ((hjx) this.b).a().floatValue();
        return ffmk.c((f - f2) / (floatValue + floatValue), 0.0f);
    }

    public final boolean b() {
        return (((hjx) this.b).a().floatValue() == 1.0f && iak.i(((iak) this.d.a()).a, 0L)) || ((Boolean) this.f.a()).booleanValue();
    }
}
