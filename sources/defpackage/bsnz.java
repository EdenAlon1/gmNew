package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsnz extends dtyq<bskr, bsnz, bsob, bseh, bskq> {
    public bsnz(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new bsnr(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = bsom.a;
        return new HashMap();
    }

    @Override // defpackage.dtyq
    protected final boolean c() {
        return false;
    }

    @Override // defpackage.dtyq
    protected final String[] d() {
        return new String[0];
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[0];
    }

    public final engw f() {
        bskr bskrVar = (bskr) p(bsom.c.a);
        try {
            engw n = bskrVar.n();
            bskrVar.close();
            return n;
        } catch (Throwable th) {
            try {
                bskrVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw g() {
        bskr bskrVar = (bskr) p(bsom.c.b);
        try {
            engw p = bskrVar.p();
            bskrVar.close();
            return p;
        } catch (Throwable th) {
            try {
                bskrVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
