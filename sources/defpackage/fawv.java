package defpackage;

import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fawv implements favq {
    private final CronetEngine a;
    private final dlpw b;
    private final ExecutorService c;

    public fawv(CronetEngine cronetEngine, dlpw dlpwVar, ExecutorService executorService) {
        cronetEngine.getClass();
        this.a = cronetEngine;
        this.b = dlpwVar;
        this.c = executorService;
    }

    @Override // defpackage.favq
    public final fawj a(String str, String str2, favs favsVar, favp favpVar) {
        str.getClass();
        str2.getClass();
        return new faxb(str, str2, favsVar, this.a, this.c, new fawx(this.c), favpVar != null ? new faxd(this.c, favpVar, this.b) : null);
    }
}
