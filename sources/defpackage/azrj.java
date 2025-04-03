package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azrj extends dtyq {
    public azrj(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new azri(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = azrn.a;
        return new HashMap();
    }

    @Override // defpackage.dtyq
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dtyq
    protected final String[] d() {
        return new String[]{"subscriptions.my_identity_token", "my_identities.token"};
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[]{"subscriptions", "null"};
    }
}
