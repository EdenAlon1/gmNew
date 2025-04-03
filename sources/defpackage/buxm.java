package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buxm extends dtyq<buuo, buxm, buxo, MessagesTable.BindData, buun> {
    public buxm(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new buxf(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = MessagesTable.a;
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
        buuo buuoVar = (buuo) p(MessagesTable.c.b);
        try {
            engw u = buuoVar.u();
            buuoVar.close();
            return u;
        } catch (Throwable th) {
            try {
                buuoVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw g() {
        buuo buuoVar = (buuo) p(MessagesTable.c.a);
        try {
            engw v = buuoVar.v();
            buuoVar.close();
            return v;
        } catch (Throwable th) {
            try {
                buuoVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw h() {
        buuo buuoVar = (buuo) p(MessagesTable.c.o);
        try {
            engw z = buuoVar.z();
            buuoVar.close();
            return z;
        } catch (Throwable th) {
            try {
                buuoVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
