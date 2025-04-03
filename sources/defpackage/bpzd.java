package defpackage;

import android.database.Cursor;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpzd extends dtsr implements dtsu {
    @Deprecated
    public bpzd(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bpze bpzeVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bpzi.a, dtyoVar, dtvsVar, bpzeVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bpyk();
    }

    public final Uri c() {
        String string = getString(cM(7, bpzi.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
