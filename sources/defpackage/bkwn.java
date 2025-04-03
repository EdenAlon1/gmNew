package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationSearchQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkwn extends dtsr<bkwn, bkwp, bkwr, LocationSearchQuery.BindData, bkwm> implements dtsu {
    @Deprecated
    public bkwn(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bkwp bkwpVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, LocationSearchQuery.a, dtyoVar, dtvsVar, bkwpVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bkgf();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
