package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpyb extends dtsr<bpyb, bpyd, bpyf, UrlSearchQuery.BindData, bpya> implements dtsu {
    @Deprecated
    public bpyb(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bpyd bpydVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, UrlSearchQuery.a, dtyoVar, dtvsVar, bpydVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bpgw();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
