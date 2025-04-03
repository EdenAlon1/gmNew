package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ParticipantIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boja extends dtsr<boja, bojc, boje, ParticipantIdsQuery.BindData, boiz> implements dtsu {
    @Deprecated
    public boja(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bojc bojcVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, ParticipantIdsQuery.a, dtyoVar, dtvsVar, bojcVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new boff();
    }

    public final String c() {
        return getString(cM(0, ParticipantIdsQuery.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
