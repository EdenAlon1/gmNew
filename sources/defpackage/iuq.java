package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuq extends isa {
    public iuq(isb isbVar) {
        super(isbVar);
    }

    @Override // defpackage.isa
    protected final int a(iwi iwiVar, imq imqVar) {
        iuw C = iwiVar.C();
        C.getClass();
        return C.eh(imqVar);
    }

    @Override // defpackage.isa
    protected final long b(iwi iwiVar, long j) {
        iuw C = iwiVar.C();
        C.getClass();
        long j2 = C.h;
        int a = kaa.a(j2);
        int b = kaa.b(j2);
        return iak.f((Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(b) & 4294967295L), j);
    }

    @Override // defpackage.isa
    protected final Map c(iwi iwiVar) {
        iuw C = iwiVar.C();
        C.getClass();
        return C.K().m();
    }
}
