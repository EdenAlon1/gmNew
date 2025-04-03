package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ConversationIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class beiw extends dtsr<beiw, beix, beiy, ConversationIdsQuery.BindData, beiv> implements dtsu {
    @Deprecated
    public beiw(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, beix beixVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, ConversationIdsQuery.a, dtyoVar, dtvsVar, beixVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new becp();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cM(0, ConversationIdsQuery.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
