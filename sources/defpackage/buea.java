package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buea extends dtyq {
    public buea(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new budu(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = bueg.a;
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
        budm budmVar = (budm) p(bueg.c.b);
        try {
            engw e = budmVar.e();
            budmVar.close();
            return e;
        } catch (Throwable th) {
            try {
                budmVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
