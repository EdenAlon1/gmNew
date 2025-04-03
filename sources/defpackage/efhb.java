package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efhb extends efif {
    public static final efif a = new efhb();

    private efhb() {
    }

    @Override // defpackage.efif
    public final /* synthetic */ efie a(efga efgaVar, String str, Executor executor, efbm efbmVar) {
        eyfc eyfcVar;
        efer eferVar = (efer) efgaVar;
        emxf.a(eferVar.e instanceof efgo);
        if (eferVar.f) {
            eyfcVar = eyfc.a();
        } else {
            eyfc eyfcVar2 = eyfc.a;
            eyib eyibVar = eyib.a;
            eyfcVar = eyfc.a;
        }
        return new efhd(str, erqt.i(eferVar.a), new efin(eferVar.b, eyfcVar), executor, efbmVar, ((efgo) eferVar.e).a(), eferVar.c, new ekyp());
    }

    @Override // defpackage.efif
    public final String b() {
        return "signal";
    }
}
