package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bymx extends dtyq {
    public bymx(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new bymw(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = bynb.a;
        return new HashMap();
    }

    @Override // defpackage.dtyq
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dtyq
    protected final String[] d() {
        return new String[]{"messages._id", "conversation_suggestions.message_id"};
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[]{"messages", "conversation_suggestions"};
    }
}
