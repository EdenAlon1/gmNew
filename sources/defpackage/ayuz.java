package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayuz extends dtsr implements ayuy {
    @Deprecated
    public ayuz(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, ayvb ayvbVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, ayvg.a, dtyoVar, dtvsVar, ayvbVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new aykl();
    }

    @Override // defpackage.ayuy
    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cM(0, ayvg.a)));
    }

    @Override // defpackage.ayuy
    public final String[] d() {
        String[] dt = dt(getString(cM(6, ayvg.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxd.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    @Override // defpackage.ayuy
    public final String[] e() {
        String[] dt = dt(getString(cM(7, ayvg.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxd.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
