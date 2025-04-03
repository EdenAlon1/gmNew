package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwom extends dtyq<bwnm, bwom, bwon, ProfilesTable.BindData, bwnl> {
    public bwom(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new bwoh(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = ProfilesTable.a;
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
