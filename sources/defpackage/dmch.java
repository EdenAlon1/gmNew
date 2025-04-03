package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmch implements idh {
    @Override // defpackage.idh
    public final /* bridge */ /* synthetic */ icr a(long j, kah kahVar, jzn jznVar) {
        kahVar.getClass();
        jznVar.getClass();
        int i = (int) (4294967295L & j);
        float intBitsToFloat = Float.intBitsToFloat(i) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat(i) / 4.0f;
        float intBitsToFloat3 = kahVar == kah.a ? intBitsToFloat : Float.intBitsToFloat((int) (j >> 32)) - intBitsToFloat;
        float intBitsToFloat4 = kahVar == kah.a ? (Float.intBitsToFloat((int) (j >> 32)) - doxh.a(8)) - intBitsToFloat : doxh.a(8) + intBitsToFloat;
        float intBitsToFloat5 = kahVar == kah.b ? intBitsToFloat2 : Float.intBitsToFloat((int) (j >> 32)) - intBitsToFloat2;
        ibc ibcVar = new ibc((byte[]) null);
        ibcVar.k();
        float f = intBitsToFloat + intBitsToFloat;
        icu.a(ibcVar, new iam(intBitsToFloat3 - intBitsToFloat, 0.0f, intBitsToFloat3 + intBitsToFloat, f));
        icu.a(ibcVar, new iam(intBitsToFloat4 - intBitsToFloat, 0.0f, intBitsToFloat + intBitsToFloat4, f));
        ibcVar.r(new iam(Math.min(intBitsToFloat3, intBitsToFloat4), 0.0f, Math.max(intBitsToFloat3, intBitsToFloat4), Float.intBitsToFloat(i)));
        icu.a(ibcVar, new iam(intBitsToFloat5 - intBitsToFloat2, 0.0f, intBitsToFloat5 + intBitsToFloat2, intBitsToFloat2 + intBitsToFloat2));
        ibcVar.c();
        return new ico(ibcVar);
    }
}
