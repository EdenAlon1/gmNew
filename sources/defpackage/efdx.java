package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdx implements efbi {
    private final eyhz a;
    private final eyfc b;

    public efdx(eyhz eyhzVar) {
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        this.b = eyfc.a;
        this.a = eyhzVar;
    }

    public static efdx b(eyhs eyhsVar) {
        return new efdx(eyhsVar.getParserForType());
    }

    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        InputStream a = new efdy().a(efbhVar);
        try {
            Object k = this.a.k(a, this.b);
            if (a != null) {
                a.close();
            }
            return k;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
