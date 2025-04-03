package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agsl extends dtsr implements agsk {
    @Deprecated
    public agsl(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, agsn agsnVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, agss.a, dtyoVar, dtvsVar, agsnVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new agmb();
    }

    @Override // defpackage.agsk
    public final int c() {
        return getInt(cM(2, agss.a));
    }

    @Override // defpackage.agsk
    public final MessageIdType d() {
        return new MessageIdType(getLong(cM(1, agss.a)));
    }

    @Override // defpackage.agsk
    public final buax e() {
        buax[] values = buax.values();
        int i = getInt(cM(3, agss.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.agsk
    public final buay f() {
        buay[] values = buay.values();
        int i = getInt(cM(4, agss.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.agsk
    public final String g() {
        if (isNull(cM(5, agss.a))) {
            throw new IllegalStateException("found null in cursor for column intent");
        }
        return getString(cM(5, agss.a));
    }

    @Override // defpackage.agsk
    public final String h() {
        if (isNull(cM(6, agss.a))) {
            throw new IllegalStateException("found null in cursor for column model_id");
        }
        return getString(cM(6, agss.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
