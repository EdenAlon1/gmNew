package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MessageWithTextIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boex extends dtsr<boex, boez, bofb, MessageWithTextIdsQuery.BindData, boew> implements dtsu {
    @Deprecated
    public boex(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, boez boezVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, MessageWithTextIdsQuery.a, dtyoVar, dtvsVar, boezVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new boaq();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cM(0, MessageWithTextIdsQuery.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
