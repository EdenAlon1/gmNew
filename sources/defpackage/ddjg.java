package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddjg extends dtsr implements dtsu {
    @Deprecated
    public ddjg(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, ddji ddjiVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, ddjn.a, dtyoVar, dtvsVar, ddjiVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new dddb();
    }

    public final String c() {
        return getString(cM(2, ddjn.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
