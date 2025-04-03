package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jio extends ffhv implements ffjm {
    boolean a;
    int b;
    /* synthetic */ float c;
    final /* synthetic */ jip d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jio(jip jipVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = jipVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jio) c(Float.valueOf(((Number) obj).floatValue()), (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            z = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            float f = this.c;
            ffjm a = jja.a(this.d.a);
            if (a == null) {
                imn.a("Required value was null.");
                throw new ffbx();
            }
            jip jipVar = this.d;
            jku jkuVar = jkm.a;
            boolean z2 = ((jjk) jipVar.a.c.b(jkm.t)).c;
            if (z2) {
                f = -f;
            }
            iak iakVar = new iak((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.a = z2;
            this.b = 1;
            obj = a.a(iakVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            z = z2;
        }
        int i = (int) (4294967295L & ((iak) obj).a);
        return new Float(z ? -Float.intBitsToFloat(i) : Float.intBitsToFloat(i));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        jio jioVar = new jio(this.d, ffguVar);
        jioVar.c = ((Number) obj).floatValue();
        return jioVar;
    }
}
