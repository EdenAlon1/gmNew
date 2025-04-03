package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ankc extends dtsr implements ankb {
    @Deprecated
    public ankc(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, anke ankeVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, ankj.a, dtyoVar, dtvsVar, ankeVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new amzo();
    }

    @Override // defpackage.ankb
    public final int c() {
        return getInt(cM(5, ankj.a));
    }

    @Override // defpackage.ankb
    public final ConversationIdType d() {
        return new ConversationIdType(getLong(cM(0, ankj.a)));
    }

    @Override // defpackage.ankb
    public final byyy e() {
        byyy[] values = byyy.values();
        int i = getInt(cM(2, ankj.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.ankb
    public final String f() {
        return getString(cM(1, ankj.a));
    }

    @Override // defpackage.ankb
    public final long[] g() {
        return dtub.B(null, ds(getString(cM(6, ankj.a))));
    }

    @Override // defpackage.ankb
    public final String[] h() {
        String[] dt = dt(getString(cM(11, ankj.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxs.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    @Override // defpackage.ankb
    public final String[] i() {
        String[] dt = dt(getString(cM(9, ankj.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxd.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    @Override // defpackage.ankb
    public final String[] j() {
        String[] dt = dt(getString(cM(10, ankj.a)));
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
