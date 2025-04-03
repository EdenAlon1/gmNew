package defpackage;

import android.database.Cursor;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cogj extends dtsr implements cogi {
    @Deprecated
    public cogj(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, cogl coglVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, cogq.a, dtyoVar, dtvsVar, coglVar);
    }

    public final byte[] A() {
        return getBlob(cM(102, cogq.a));
    }

    public final byte[] B() {
        return getBlob(cM(51, cogq.a));
    }

    public final int[] C() {
        return dtub.z(null, dr(getString(cM(98, cogq.a))));
    }

    public final long[] D() {
        return dtub.B(null, ds(getString(cM(105, cogq.a))));
    }

    public final long[] E() {
        return dtub.B(null, ds(getString(cM(112, cogq.a))));
    }

    public final long[] F() {
        return dtub.B(null, ds(getString(cM(108, cogq.a))));
    }

    public final Uri[] G() {
        String[] dt = dt(getString(cM(96, cogq.a)));
        int length = dt.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            Uri uri = null;
            if (i >= length) {
                return (Uri[]) dtub.C(null, uriArr, new Uri[0]);
            }
            String str = dt[i];
            int i3 = i2 + 1;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
    }

    public final byyu[] H() {
        int[] dr = dr(getString(cM(87, cogq.a)));
        byyu[] values = byyu.values();
        int length = values.length;
        byyu[] byyuVarArr = new byyu[dr.length];
        for (int i = 0; i < dr.length; i++) {
            int i2 = dr[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            byyuVarArr[i] = values[i2];
        }
        return (byyu[]) dtub.C(null, byyuVarArr, new byyu[0]);
    }

    public final String[] I() {
        return (String[]) dtub.C(null, dt(getString(cM(99, cogq.a))), new String[0]);
    }

    public final String[] J() {
        return (String[]) dtub.C(null, dt(getString(cM(109, cogq.a))), new String[0]);
    }

    public final String[] K() {
        return (String[]) dtub.C(null, dt(getString(cM(78, cogq.a))), new String[0]);
    }

    public final String[] L() {
        return (String[]) dtub.C(null, dt(getString(cM(106, cogq.a))), new String[0]);
    }

    public final String[] M() {
        return (String[]) dtub.C(null, dt(getString(cM(107, cogq.a))), new String[0]);
    }

    public final boolean[] N() {
        return dtub.D(null, du(getString(cM(104, cogq.a))));
    }

    public final boolean[] O() {
        return dtub.D(null, du(getString(cM(111, cogq.a))));
    }

    public final byte[][] P() {
        return dtub.E(null, dC(getString(cM(114, cogq.a))));
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new cnvw();
    }

    public final int c() {
        return getInt(cM(64, cogq.a));
    }

    public final long e() {
        return getLong(cM(45, cogq.a));
    }

    public final ConversationIdType f() {
        return new ConversationIdType(getLong(cM(7, cogq.a)));
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cM(88, cogq.a)));
    }

    public final ConversationIdType h() {
        return new ConversationIdType(getLong(cM(2, cogq.a)));
    }

    public final byyw i() {
        byyw[] values = byyw.values();
        int i = getInt(cM(63, cogq.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final csgg j() {
        csgg[] values = csgg.values();
        int i = getInt(cM(61, cogq.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final fayv k() {
        byte[] blob = getBlob(cM(53, cogq.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fayv) eyfy.parseFrom(fayv.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return fayv.a;
        }
    }

    public final Instant l() {
        return bdgw.b(getLong(cM(5, cogq.a)));
    }

    public final Optional m() {
        return bdhj.a(getString(cM(59, cogq.a)));
    }

    public final String n() {
        return getString(cM(100, cogq.a));
    }

    public final String o() {
        return getString(cM(127, cogq.a));
    }

    public final String p() {
        return getString(cM(33, cogq.a));
    }

    public final String q() {
        return getString(cM(110, cogq.a));
    }

    public final String r() {
        return getString(cM(54, cogq.a));
    }

    public final String s() {
        return getString(cM(EnergyProfile.EVCONNECTOR_TYPE_OTHER, cogq.a));
    }

    public final String t() {
        return getString(cM(44, cogq.a));
    }

    public final String u() {
        return getString(cM(43, cogq.a));
    }

    public final String v() {
        return getString(cM(50, cogq.a));
    }

    public final boolean w() {
        return getInt(cM(57, cogq.a)) == 1;
    }

    public final boolean x() {
        return getInt(cM(116, cogq.a)) == 1;
    }

    public final boolean y() {
        return getInt(cM(65, cogq.a)) == 1;
    }

    public final byte[] z() {
        return getBlob(cM(103, cogq.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
