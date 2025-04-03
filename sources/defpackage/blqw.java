package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class blqw extends dtsr<blqw, blqy, blra, MediaSearchQuery.BindData, blqv> implements dtsu {
    @Deprecated
    public blqw(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, blqy blqyVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, MediaSearchQuery.a, dtyoVar, dtvsVar, blqyVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bkwv();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
