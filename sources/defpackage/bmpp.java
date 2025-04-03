package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmpp extends dtsr implements dtsu {
    @Deprecated
    public bmpp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bmpr bmprVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bmpy.a, dtyoVar, dtvsVar, bmprVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bmjw();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cM(0, bmpy.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
