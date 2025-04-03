package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fht extends ffkk implements ffix {
    final /* synthetic */ fhi a;
    final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fht(fhi fhiVar, hho hhoVar) {
        super(0);
        this.a = fhiVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffix
    public final /* synthetic */ Object invoke() {
        jlm e;
        euf c;
        int e2;
        exq d;
        eva evaVar;
        evw evwVar;
        jlm jlmVar;
        long j = ((kaf) this.b.a()).a;
        fhi fhiVar = this.a;
        iak d2 = fhiVar.d();
        long j2 = 9205357640488583168L;
        if (d2 != null && (e = fhiVar.e()) != null && e.a() != 0 && (c = fhiVar.c()) != null) {
            int ordinal = c.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                e2 = jpm.e(fhiVar.f().c);
            } else {
                if (ordinal != 2) {
                    throw new ffcd();
                }
                e2 = jpm.a(fhiVar.f().c);
            }
            eva evaVar2 = fhiVar.d;
            if (evaVar2 != null && (d = evaVar2.d()) != null && (evaVar = fhiVar.d) != null && (evwVar = evaVar.a) != null && (jlmVar = evwVar.a) != null) {
                long j3 = d2.a;
                int i = ffmk.i(fhiVar.b.a(e2), 0, jlmVar.a());
                long b = d.b(j3) >> 32;
                jpg jpgVar = d.a;
                float intBitsToFloat = Float.intBitsToFloat((int) b);
                int h = jpgVar.h(i);
                float c2 = jpgVar.c(h);
                float d3 = jpgVar.d(h);
                float e3 = ffmk.e(intBitsToFloat, Math.min(c2, d3), Math.max(c2, d3));
                if (kaf.e(j, 0L) || Math.abs(intBitsToFloat - e3) <= ((int) (j >> 32)) / 2) {
                    float e4 = jpgVar.e(h);
                    j2 = (Float.floatToRawIntBits(e3) << 32) | (Float.floatToRawIntBits(((jpgVar.b(h) - e4) / 2.0f) + e4) & 4294967295L);
                }
            }
        }
        return new iak(j2);
    }
}
