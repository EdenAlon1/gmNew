package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bfkg extends dtsr implements bfkf {
    @Deprecated
    public bfkg(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bfki bfkiVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bfkq.a, dtyoVar, dtvsVar, bfkiVar);
    }

    @Override // defpackage.bfkf
    public final String A() {
        return getString(cM(12, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final String B() {
        return cuxs.a(getString(cM(9, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final String C() {
        return cuxs.a(getString(cM(10, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final String D() {
        return cuxs.a(getString(cM(64, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final String E() {
        return cuxs.a(getString(cM(60, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final String F() {
        return cuxs.a(getString(cM(63, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final String G() {
        return cuxs.a(getString(cM(59, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final String H() {
        return getString(cM(16, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final String I() {
        return getString(cM(2, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final String J() {
        return cuxs.a(getString(cM(34, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final String K() {
        return getString(cM(18, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final String L() {
        return getString(cM(19, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final String M() {
        return getString(cM(56, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final String N() {
        return cuxs.a(getString(cM(5, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final String O() {
        return cuxs.a(getString(cM(66, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final String P() {
        return getString(cM(70, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final boolean Q() {
        return getInt(cM(33, bfkq.a)) == 1;
    }

    @Override // defpackage.bfkf
    public final boolean R() {
        return getInt(cM(32, bfkq.a)) == 1;
    }

    @Override // defpackage.bfkf
    public final boolean S() {
        return getInt(cM(44, bfkq.a)) == 1;
    }

    @Override // defpackage.bfkf
    public final boolean T() {
        return getInt(cM(23, bfkq.a)) == 1;
    }

    @Override // defpackage.bfkf
    public final boolean U() {
        return getInt(cM(39, bfkq.a)) == 1;
    }

    @Override // defpackage.bfkf
    public final boolean V() {
        return getInt(cM(52, bfkq.a)) == 1;
    }

    @Override // defpackage.bfkf
    public final boolean W() {
        return getInt(cM(8, bfkq.a)) == 1;
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bejg();
    }

    @Override // defpackage.bfkf
    public final int c() {
        return getInt(cM(30, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final int d() {
        return getInt(cM(29, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final int e() {
        return getInt(cM(22, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final int f() {
        return getInt(cM(50, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final int g() {
        return getInt(cM(54, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final int h() {
        return getInt(cM(55, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final int i() {
        return getInt(cM(53, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final int j() {
        return getInt(cM(27, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final int k() {
        return getInt(cM(51, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final int l() {
        return getInt(cM(57, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final long m() {
        return getLong(cM(28, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final long n() {
        return getLong(cM(49, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final long o() {
        return getLong(cM(48, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final long p() {
        return getLong(cM(71, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final Uri q() {
        String string = getString(cM(11, bfkq.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bfkf
    public final Uri r() {
        String string = getString(cM(67, bfkq.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bfkf
    public final ardn s() {
        return ardn.b(getInt(cM(69, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final ConversationIdType t() {
        return new ConversationIdType(getLong(cM(75, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final ConversationIdType u() {
        return new ConversationIdType(getLong(cM(0, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final MessageIdType v() {
        return new MessageIdType(getLong(cM(47, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final byyt w() {
        return byyt.a(getInt(cM(14, bfkq.a)));
    }

    @Override // defpackage.bfkf
    public final engw x() {
        engr engrVar = new engr();
        while (moveToNext()) {
            u();
            engrVar.h(u());
        }
        return engrVar.g();
    }

    @Override // defpackage.bfkf
    public final String y() {
        return getString(cM(68, bfkq.a));
    }

    @Override // defpackage.bfkf
    public final String z() {
        return cuxd.a(getString(cM(58, bfkq.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
