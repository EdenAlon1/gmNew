package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efho extends efif {
    public static final efif a = new efho();

    private efho() {
    }

    @Override // defpackage.efif
    public final /* synthetic */ efie a(efga efgaVar, String str, Executor executor, efbm efbmVar) {
        eyfc eyfcVar;
        efer eferVar = (efer) efgaVar;
        if (eferVar.f) {
            eyfcVar = eyfc.a();
        } else {
            eyfc eyfcVar2 = eyfc.a;
            eyib eyibVar = eyib.a;
            eyfcVar = eyfc.a;
        }
        efin efinVar = new efin(eferVar.b, eyfcVar);
        Uri uri = eferVar.a;
        return new efhq(str, erqt.i(uri), efinVar, executor, efbmVar, eferVar.c, new ekyp());
    }

    @Override // defpackage.efif
    public final String b() {
        return "singleproc";
    }
}
