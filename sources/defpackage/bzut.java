package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzut extends dtyq {
    public bzut(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new bzus(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = bzux.a;
        return new HashMap();
    }

    @Override // defpackage.dtyq
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dtyq
    protected final String[] d() {
        return new String[]{"remote_user_id_to_registration_id.tachyon_registration_id", "remote_registrations_table.tachyon_registration_id", "contacts.phone_number", "remote_user_id_to_registration_id.remote_user_id"};
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[]{"remote_user_id_to_registration_id", "remote_registrations_table", "contacts", "remote_user_id_to_registration_id"};
    }
}
