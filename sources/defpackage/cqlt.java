package defpackage;

import android.net.Uri;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqlt extends ceut {
    public final cqlk a;
    private final errl b;

    public cqlt(cqlk cqlkVar, errl errlVar) {
        this.a = cqlkVar;
        this.b = errlVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WAKELOCK);
        l.c(5);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CopyFileTelephonyPartsWorkItemHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cptf.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cptf cptfVar = (cptf) eyhsVar;
        return !this.a.e() ? elfo.e(ceyt.i()) : elfo.g(new Callable() { // from class: cqls
            @Override // java.util.concurrent.Callable
            public final Object call() {
                for (cpte cpteVar : cptfVar.b) {
                    cqlt cqltVar = cqlt.this;
                    cqltVar.a.c(cpteVar.b, Uri.parse(cpteVar.c));
                }
                return ceyt.i();
            }
        }, this.b);
    }
}
