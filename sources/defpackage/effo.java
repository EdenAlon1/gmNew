package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class effo extends efif {
    public static final efif a = new effo();

    private effo() {
    }

    @Override // defpackage.efif
    public final /* synthetic */ efie a(efga efgaVar, String str, Executor executor, efbm efbmVar) {
        eyfc eyfcVar;
        efer eferVar = (efer) efgaVar;
        emxf.a(eferVar.e instanceof effd);
        if (eferVar.f) {
            eyfcVar = eyfc.a();
        } else {
            eyfc eyfcVar2 = eyfc.a;
            eyib eyibVar = eyib.a;
            eyfcVar = eyfc.a;
        }
        efin efinVar = new efin(eferVar.b, eyfcVar);
        Uri uri = eferVar.a;
        return new effr(str, erqt.i(uri), efinVar, executor, efbmVar, eferVar.c, new ekyp());
    }

    @Override // defpackage.efif
    public final String b() {
        return "multiproc";
    }
}
