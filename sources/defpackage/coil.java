package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coil extends dtyq<coia, coil, coin, ScheduledSendTable.BindData, cohz> {
    public coil(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new coih(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = ScheduledSendTable.a;
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
}
