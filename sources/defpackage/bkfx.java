package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationAndLinkAnnotationIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkfx extends dtsr<bkfx, bkfz, bkgb, LocationAndLinkAnnotationIdsQuery.BindData, bkfw> implements dtsu {
    @Deprecated
    public bkfx(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bkfz bkfzVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, LocationAndLinkAnnotationIdsQuery.a, dtyoVar, dtvsVar, bkfzVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bkfj();
    }

    public final String c() {
        return getString(cM(0, LocationAndLinkAnnotationIdsQuery.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
