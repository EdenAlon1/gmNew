package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buxf extends dtsr implements buuo {
    @Deprecated
    public buxf(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, buxm buxmVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, MessagesTable.a, dtyoVar, dtvsVar, buxmVar);
    }

    @Override // defpackage.buuo
    public final engw A() {
        engr engrVar = new engr();
        while (moveToNext()) {
            i();
            engrVar.h(Integer.valueOf(i()));
        }
        return engrVar.g();
    }

    @Override // defpackage.buuo
    public final Optional B() {
        return bdhj.a(getString(cM(67, MessagesTable.a)));
    }

    @Override // defpackage.buuo
    public final String C() {
        return getString(cM(27, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final String D() {
        return getString(cM(38, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final String E() {
        return getString(cM(19, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final String F() {
        return getString(cM(22, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final String G() {
        return cuxs.a(getString(cM(17, MessagesTable.a)));
    }

    @Override // defpackage.buuo
    public final String H() {
        return getString(cM(18, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final String I() {
        return getString(cM(4, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final String J() {
        return getString(cM(40, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final boolean K() {
        return getInt(cM(32, MessagesTable.a)) == 1;
    }

    public final int L() {
        return getInt(cM(58, MessagesTable.a));
    }

    public final int M() {
        return getInt(cM(11, MessagesTable.a));
    }

    public final int N() {
        return getInt(cM(64, MessagesTable.a));
    }

    public final int O() {
        return getInt(cM(29, MessagesTable.a));
    }

    public final int P() {
        return getInt(cM(31, MessagesTable.a));
    }

    public final long Q() {
        return getLong(cM(39, MessagesTable.a));
    }

    public final long R() {
        return getLong(cM(21, MessagesTable.a));
    }

    public final long S() {
        return getLong(cM(46, MessagesTable.a));
    }

    public final long T() {
        return getLong(cM(26, MessagesTable.a));
    }

    public final long U() {
        return getLong(cM(42, MessagesTable.a));
    }

    public final long V() {
        return getLong(cM(16, MessagesTable.a));
    }

    public final long W() {
        return getLong(cM(41, MessagesTable.a));
    }

    public final azsu X() {
        return azsv.a(getString(cM(25, MessagesTable.a)));
    }

    public final bdgr Y() {
        return new bdgr(getString(cM(65, MessagesTable.a)));
    }

    public final MessageIdType Z() {
        return new MessageIdType(getLong(cM(50, MessagesTable.a)));
    }

    public final int[] aA() {
        return dtub.z(null, dr(getString(cM(58, MessagesTable.a))));
    }

    public final int[] aB() {
        return dtub.z(null, dr(getString(cM(11, MessagesTable.a))));
    }

    public final int[] aC() {
        return dtub.z(null, dr(getString(cM(64, MessagesTable.a))));
    }

    public final int[] aD() {
        return dtub.z(null, dr(getString(cM(9, MessagesTable.a))));
    }

    public final int[] aE() {
        return dtub.z(null, dr(getString(cM(23, MessagesTable.a))));
    }

    public final int[] aF() {
        return dtub.z(null, dr(getString(cM(29, MessagesTable.a))));
    }

    public final int[] aG() {
        return dtub.z(null, dr(getString(cM(31, MessagesTable.a))));
    }

    public final int[] aH() {
        return dtub.z(null, dr(getString(cM(54, MessagesTable.a))));
    }

    public final int[] aI() {
        return dtub.z(null, dr(getString(cM(35, MessagesTable.a))));
    }

    public final long[] aJ() {
        return dtub.B(null, ds(getString(cM(39, MessagesTable.a))));
    }

    public final long[] aK() {
        return dtub.B(null, ds(getString(cM(20, MessagesTable.a))));
    }

    public final long[] aL() {
        return dtub.B(null, ds(getString(cM(21, MessagesTable.a))));
    }

    public final long[] aM() {
        return dtub.B(null, ds(getString(cM(34, MessagesTable.a))));
    }

    public final long[] aN() {
        return dtub.B(null, ds(getString(cM(8, MessagesTable.a))));
    }

    public final long[] aO() {
        return dtub.B(null, ds(getString(cM(46, MessagesTable.a))));
    }

    public final long[] aP() {
        return dtub.B(null, ds(getString(cM(26, MessagesTable.a))));
    }

    public final long[] aQ() {
        return dtub.B(null, ds(getString(cM(42, MessagesTable.a))));
    }

    public final long[] aR() {
        return dtub.B(null, ds(getString(cM(6, MessagesTable.a))));
    }

    public final Uri[] aS() {
        String[] dt = dt(getString(cM(52, MessagesTable.a)));
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

    public final Uri[] aT() {
        String[] dt = dt(getString(cM(14, MessagesTable.a)));
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

    public final azsu[] aU() {
        String[] dt = dt(getString(cM(25, MessagesTable.a)));
        int length = dt.length;
        azsu[] azsuVarArr = new azsu[length];
        for (int i = 0; i < length; i++) {
            azsuVarArr[i] = azsv.a(dt[i]);
        }
        return (azsu[]) dtub.C(null, azsuVarArr, new azsu[0]);
    }

    public final ConversationIdType[] aV() {
        long[] ds = ds(getString(cM(1, MessagesTable.a)));
        int length = ds.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(ds[i]);
        }
        return (ConversationIdType[]) dtub.C(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final bdgr[] aW() {
        String[] dt = dt(getString(cM(65, MessagesTable.a)));
        int length = dt.length;
        bdgr[] bdgrVarArr = new bdgr[length];
        for (int i = 0; i < length; i++) {
            bdgrVarArr[i] = new bdgr(dt[i]);
        }
        return (bdgr[]) dtub.C(null, bdgrVarArr, new bdgr[0]);
    }

    public final MessageIdType[] aX() {
        long[] ds = ds(getString(cM(0, MessagesTable.a)));
        int length = ds.length;
        MessageIdType[] messageIdTypeArr = new MessageIdType[length];
        for (int i = 0; i < length; i++) {
            messageIdTypeArr[i] = new MessageIdType(ds[i]);
        }
        return (MessageIdType[]) dtub.C(null, messageIdTypeArr, new MessageIdType[0]);
    }

    public final MessageIdType[] aY() {
        long[] ds = ds(getString(cM(50, MessagesTable.a)));
        int length = ds.length;
        MessageIdType[] messageIdTypeArr = new MessageIdType[length];
        for (int i = 0; i < length; i++) {
            messageIdTypeArr[i] = new MessageIdType(ds[i]);
        }
        return (MessageIdType[]) dtub.C(null, messageIdTypeArr, new MessageIdType[0]);
    }

    public final bdhg[] aZ() {
        String[] dt = dt(getString(cM(43, MessagesTable.a)));
        int length = dt.length;
        bdhg[] bdhgVarArr = new bdhg[length];
        for (int i = 0; i < length; i++) {
            bdhgVarArr[i] = bdhg.a(dt[i]);
        }
        return (bdhg[]) dtub.C(null, bdhgVarArr, new bdhg[0]);
    }

    public final bdhg aa() {
        return bdhg.a(getString(cM(43, MessagesTable.a)));
    }

    public final byyw ab() {
        byyw[] values = byyw.values();
        int i = getInt(cM(57, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzg ac() {
        byzg[] values = byzg.values();
        int i = getInt(cM(61, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzg ad() {
        byzg[] values = byzg.values();
        int i = getInt(cM(62, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzi ae() {
        byzi[] values = byzi.values();
        int i = getInt(cM(30, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final cfmh af() {
        return new cfmh(getLong(cM(66, MessagesTable.a)));
    }

    public final cjco ag() {
        cjco[] values = cjco.values();
        int i = getInt(cM(56, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final fayv ah() {
        byte[] blob = getBlob(cM(47, MessagesTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fayv) eyfy.parseFrom(fayv.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return fayv.a;
        }
    }

    public final Instant ai() {
        return bdgw.b(getLong(cM(7, MessagesTable.a)));
    }

    public final Optional aj() {
        return bdhj.a(getString(cM(53, MessagesTable.a)));
    }

    public final String ak() {
        return getString(cM(48, MessagesTable.a));
    }

    public final String al() {
        return getString(cM(37, MessagesTable.a));
    }

    public final String am() {
        return getString(cM(44, MessagesTable.a));
    }

    public final String an() {
        return getString(cM(49, MessagesTable.a));
    }

    public final String ao() {
        return getString(cM(33, MessagesTable.a));
    }

    public final String ap() {
        return getString(cM(5, MessagesTable.a));
    }

    public final String aq() {
        return getString(cM(24, MessagesTable.a));
    }

    public final String ar() {
        return getString(cM(2, MessagesTable.a));
    }

    public final String as() {
        return getString(cM(3, MessagesTable.a));
    }

    public final String at() {
        return getString(cM(36, MessagesTable.a));
    }

    public final fjay au() {
        byte[] blob = getBlob(cM(60, MessagesTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fjay) eyfy.parseFrom(fjay.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return fjay.a;
        }
    }

    public final boolean av() {
        return getInt(cM(51, MessagesTable.a)) == 1;
    }

    public final boolean aw() {
        return getInt(cM(59, MessagesTable.a)) == 1;
    }

    public final boolean ax() {
        return getInt(cM(12, MessagesTable.a)) == 1;
    }

    public final boolean ay() {
        return getInt(cM(13, MessagesTable.a)) == 1;
    }

    public final byte[] az() {
        return getBlob(cM(45, MessagesTable.a));
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new buov();
    }

    public final String[] bA() {
        return (String[]) dtub.C(null, dt(getString(cM(3, MessagesTable.a))), new String[0]);
    }

    public final String[] bB() {
        return (String[]) dtub.C(null, dt(getString(cM(36, MessagesTable.a))), new String[0]);
    }

    public final boolean[] bC() {
        return dtub.D(null, du(getString(cM(51, MessagesTable.a))));
    }

    public final boolean[] bD() {
        return dtub.D(null, du(getString(cM(59, MessagesTable.a))));
    }

    public final boolean[] bE() {
        return dtub.D(null, du(getString(cM(32, MessagesTable.a))));
    }

    public final boolean[] bF() {
        return dtub.D(null, du(getString(cM(12, MessagesTable.a))));
    }

    public final boolean[] bG() {
        return dtub.D(null, du(getString(cM(13, MessagesTable.a))));
    }

    public final byte[][] bH() {
        return dtub.E(null, dC(getString(cM(45, MessagesTable.a))));
    }

    public final bdhg[] ba() {
        String[] dt = dt(getString(cM(28, MessagesTable.a)));
        int length = dt.length;
        bdhg[] bdhgVarArr = new bdhg[length];
        for (int i = 0; i < length; i++) {
            bdhgVarArr[i] = bdhg.a(dt[i]);
        }
        return (bdhg[]) dtub.C(null, bdhgVarArr, new bdhg[0]);
    }

    public final byyw[] bb() {
        int[] dr = dr(getString(cM(57, MessagesTable.a)));
        byyw[] values = byyw.values();
        int length = values.length;
        byyw[] byywVarArr = new byyw[dr.length];
        for (int i = 0; i < dr.length; i++) {
            int i2 = dr[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            byywVarArr[i] = values[i2];
        }
        return (byyw[]) dtub.C(null, byywVarArr, new byyw[0]);
    }

    public final byzg[] bc() {
        int[] dr = dr(getString(cM(61, MessagesTable.a)));
        byzg[] values = byzg.values();
        int length = values.length;
        byzg[] byzgVarArr = new byzg[dr.length];
        for (int i = 0; i < dr.length; i++) {
            int i2 = dr[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            byzgVarArr[i] = values[i2];
        }
        return (byzg[]) dtub.C(null, byzgVarArr, new byzg[0]);
    }

    public final byzg[] bd() {
        int[] dr = dr(getString(cM(62, MessagesTable.a)));
        byzg[] values = byzg.values();
        int length = values.length;
        byzg[] byzgVarArr = new byzg[dr.length];
        for (int i = 0; i < dr.length; i++) {
            int i2 = dr[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            byzgVarArr[i] = values[i2];
        }
        return (byzg[]) dtub.C(null, byzgVarArr, new byzg[0]);
    }

    public final cfmh[] be() {
        long[] ds = ds(getString(cM(66, MessagesTable.a)));
        int length = ds.length;
        cfmh[] cfmhVarArr = new cfmh[length];
        for (int i = 0; i < length; i++) {
            cfmhVarArr[i] = new cfmh(ds[i]);
        }
        return (cfmh[]) dtub.C(null, cfmhVarArr, new cfmh[0]);
    }

    public final cjco[] bf() {
        int[] dr = dr(getString(cM(56, MessagesTable.a)));
        cjco[] values = cjco.values();
        int length = values.length;
        cjco[] cjcoVarArr = new cjco[dr.length];
        for (int i = 0; i < dr.length; i++) {
            int i2 = dr[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            cjcoVarArr[i] = values[i2];
        }
        return (cjco[]) dtub.C(null, cjcoVarArr, new cjco[0]);
    }

    public final csgg[] bg() {
        int[] dr = dr(getString(cM(55, MessagesTable.a)));
        csgg[] values = csgg.values();
        int length = values.length;
        csgg[] csggVarArr = new csgg[dr.length];
        for (int i = 0; i < dr.length; i++) {
            int i2 = dr[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            csggVarArr[i] = values[i2];
        }
        return (csgg[]) dtub.C(null, csggVarArr, new csgg[0]);
    }

    public final fayv[] bh() {
        fayv fayvVar;
        List de = de(getString(cM(47, MessagesTable.a)));
        fayv[] fayvVarArr = new fayv[de.size()];
        Iterator it = de.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                byte[] y = dtub.y((String) it.next());
                int i2 = i + 1;
                if (y == null) {
                    fayvVar = null;
                } else {
                    try {
                        fayvVar = (fayv) eyfy.parseFrom(fayv.a, y);
                    } catch (Throwable unused) {
                        i = i2;
                        fayvVarArr[i] = null;
                        i++;
                    }
                }
                fayvVarArr[i] = fayvVar;
                i = i2;
            } catch (Throwable unused2) {
            }
        }
        return (fayv[]) dtub.C(null, fayvVarArr, new fayv[0]);
    }

    public final Instant[] bi() {
        long[] ds = ds(getString(cM(7, MessagesTable.a)));
        int length = ds.length;
        Instant[] instantArr = new Instant[length];
        for (int i = 0; i < length; i++) {
            instantArr[i] = bdgw.b(ds[i]);
        }
        return (Instant[]) dtub.C(null, instantArr, new Instant[0]);
    }

    public final Optional[] bj() {
        String[] dt = dt(getString(cM(53, MessagesTable.a)));
        int length = dt.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = bdhj.a(dt[i]);
        }
        return (Optional[]) dtub.C(null, optionalArr, new Optional[0]);
    }

    public final Optional[] bk() {
        String[] dt = dt(getString(cM(67, MessagesTable.a)));
        int length = dt.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = bdhj.a(dt[i]);
        }
        return (Optional[]) dtub.C(null, optionalArr, new Optional[0]);
    }

    public final String[] bl() {
        return (String[]) dtub.C(null, dt(getString(cM(27, MessagesTable.a))), new String[0]);
    }

    public final String[] bm() {
        return (String[]) dtub.C(null, dt(getString(cM(48, MessagesTable.a))), new String[0]);
    }

    public final String[] bn() {
        return (String[]) dtub.C(null, dt(getString(cM(38, MessagesTable.a))), new String[0]);
    }

    public final String[] bo() {
        return (String[]) dtub.C(null, dt(getString(cM(37, MessagesTable.a))), new String[0]);
    }

    public final String[] bp() {
        return (String[]) dtub.C(null, dt(getString(cM(44, MessagesTable.a))), new String[0]);
    }

    public final String[] bq() {
        return (String[]) dtub.C(null, dt(getString(cM(49, MessagesTable.a))), new String[0]);
    }

    public final String[] br() {
        return (String[]) dtub.C(null, dt(getString(cM(19, MessagesTable.a))), new String[0]);
    }

    public final String[] bs() {
        return (String[]) dtub.C(null, dt(getString(cM(22, MessagesTable.a))), new String[0]);
    }

    public final String[] bt() {
        String[] dt = dt(getString(cM(17, MessagesTable.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxs.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    public final String[] bu() {
        return (String[]) dtub.C(null, dt(getString(cM(18, MessagesTable.a))), new String[0]);
    }

    public final String[] bv() {
        return (String[]) dtub.C(null, dt(getString(cM(4, MessagesTable.a))), new String[0]);
    }

    public final String[] bw() {
        return (String[]) dtub.C(null, dt(getString(cM(33, MessagesTable.a))), new String[0]);
    }

    public final String[] bx() {
        return (String[]) dtub.C(null, dt(getString(cM(5, MessagesTable.a))), new String[0]);
    }

    public final String[] by() {
        return (String[]) dtub.C(null, dt(getString(cM(24, MessagesTable.a))), new String[0]);
    }

    public final String[] bz() {
        return (String[]) dtub.C(null, dt(getString(cM(2, MessagesTable.a))), new String[0]);
    }

    @Override // defpackage.buuo
    public final int c() {
        return getInt(cM(9, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final int e() {
        return getInt(cM(23, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final int f() {
        return getInt(cM(54, MessagesTable.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        int i;
        Instant[] instantArr;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        boolean[] zArr4;
        Uri[] uriArr;
        Uri[] uriArr2;
        int[] iArr6;
        int[] iArr7;
        long[] jArr3;
        long[] jArr4;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        long[] jArr5;
        long[] jArr6;
        long[] jArr7;
        long[] jArr8;
        String[] strArr7;
        String[] strArr8;
        int[] iArr8;
        int[] iArr9;
        String[] strArr9;
        String[] strArr10;
        azsu[] azsuVarArr;
        azsu[] azsuVarArr2;
        long[] jArr9;
        long[] jArr10;
        String[] strArr11;
        String[] strArr12;
        bdhg[] bdhgVarArr;
        bdhg[] bdhgVarArr2;
        int[] iArr10;
        int[] iArr11;
        long[] jArr11;
        boolean z;
        MessageIdType[] messageIdTypeArr;
        byzi[] byziVarArr;
        int[] iArr12;
        long[] jArr12;
        long[] jArr13;
        int[] iArr13;
        int[] iArr14;
        String[] strArr13;
        String[] strArr14;
        String[] strArr15;
        String[] strArr16;
        String[] strArr17;
        String[] strArr18;
        long[] jArr14;
        long[] jArr15;
        byzi[] byziVarArr2;
        String[] strArr19;
        long[] jArr16;
        long[] jArr17;
        long[] jArr18;
        bdhg[] bdhgVarArr3;
        bdhg[] bdhgVarArr4;
        String[] strArr20;
        String[] strArr21;
        byte[][] bArr;
        byte[][] bArr2;
        long[] jArr19;
        long[] jArr20;
        fayv[] fayvVarArr;
        fayv[] fayvVarArr2;
        String[] strArr22;
        String[] strArr23;
        String[] strArr24;
        String[] strArr25;
        MessageIdType[] messageIdTypeArr2;
        MessageIdType[] messageIdTypeArr3;
        boolean[] zArr5;
        boolean[] zArr6;
        Uri[] uriArr3;
        Uri[] uriArr4;
        Optional[] optionalArr;
        Optional[] optionalArr2;
        int[] iArr15;
        int[] iArr16;
        csgg[] csggVarArr;
        csgg[] csggVarArr2;
        cjco[] cjcoVarArr;
        cjco[] cjcoVarArr2;
        byyw[] byywVarArr;
        byyw[] byywVarArr2;
        int[] iArr17;
        int[] iArr18;
        boolean[] zArr7;
        boolean[] zArr8;
        String[] strArr26;
        boolean[] zArr9;
        fjay[] fjayVarArr;
        byzg[] byzgVarArr;
        fjay[] fjayVarArr2;
        byzg[] byzgVarArr2;
        String[] strArr27;
        bdgr[] bdgrVarArr;
        byzl[] byzlVarArr;
        int i2;
        byzl[] byzlVarArr2;
        Optional[] optionalArr3;
        int i3;
        cfmh[] cfmhVarArr;
        int i4;
        String[] strArr28;
        fjay fjayVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i5 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z2 = dtvsVar.b;
        MessageIdType[] aX = di ? z2 ? aX() : new MessageIdType[]{q()} : null;
        dtsr.dz(length, aX, new emyl() { // from class: buup
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(buxf.this.getString(0)));
            }
        });
        ConversationIdType[] aV = di(1) ? z2 ? aV() : new ConversationIdType[]{p()} : null;
        dtsr.dz(length, aV, new emyl() { // from class: buur
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(buxf.this.getString(1)));
            }
        });
        String[] bz = di(2) ? z2 ? bz() : new String[]{ar()} : null;
        dtsr.dz(length, bz, new emyl() { // from class: buvd
            @Override // defpackage.emyl
            public final Object get() {
                return "sender_id:".concat(String.valueOf(buxf.this.getString(2)));
            }
        });
        String[] bA = di(3) ? z2 ? bA() : new String[]{as()} : null;
        dtsr.dz(length, bA, new emyl() { // from class: buvp
            @Override // defpackage.emyl
            public final Object get() {
                return "sender_send_destination:".concat(String.valueOf(buxf.this.getString(3)));
            }
        });
        String[] bv = di(4) ? z2 ? bv() : new String[]{I()} : null;
        dtsr.dz(length, bv, new emyl() { // from class: buwb
            @Override // defpackage.emyl
            public final Object get() {
                return "msisdn_receiving_rcs_message:".concat(String.valueOf(buxf.this.getString(4)));
            }
        });
        String[] bx = di(5) ? z2 ? bx() : new String[]{ap()} : null;
        dtsr.dz(length, bx, new emyl() { // from class: buwn
            @Override // defpackage.emyl
            public final Object get() {
                return "receiving_network_country:".concat(String.valueOf(buxf.this.getString(5)));
            }
        });
        long[] aR = di(6) ? z2 ? aR() : new long[]{m()} : null;
        dtsr.dy(length, aR, new emyl() { // from class: buwx
            @Override // defpackage.emyl
            public final Object get() {
                return "sent_timestamp:".concat(String.valueOf(buxf.this.getString(6)));
            }
        });
        if (di(7)) {
            instantArr = z2 ? bi() : new Instant[]{ai()};
            i = 0;
        } else {
            i = 0;
            instantArr = null;
        }
        dtsr.dz(length, instantArr, new emyl() { // from class: buwy
            @Override // defpackage.emyl
            public final Object get() {
                return "queue_insert_timestamp:".concat(String.valueOf(buxf.this.getString(7)));
            }
        });
        if (!di(8)) {
            jArr = null;
        } else if (z2) {
            jArr = aN();
        } else {
            jArr = new long[1];
            jArr[i] = l();
        }
        dtsr.dy(length, jArr, new emyl() { // from class: buwz
            @Override // defpackage.emyl
            public final Object get() {
                return "received_timestamp:".concat(String.valueOf(buxf.this.getString(8)));
            }
        });
        if (!di(9)) {
            iArr = null;
        } else if (z2) {
            iArr = aD();
        } else {
            iArr = new int[1];
            iArr[i] = c();
        }
        dtsr.dx(length, iArr, new emyl() { // from class: buxa
            @Override // defpackage.emyl
            public final Object get() {
                return "message_protocol:".concat(String.valueOf(buxf.this.getString(9)));
            }
        });
        if (!di(10)) {
            jArr2 = dB;
            iArr2 = null;
        } else if (z2) {
            jArr2 = dB;
            iArr2 = dtub.z(null, dr(getString(cM(10, MessagesTable.a))));
        } else {
            jArr2 = dB;
            iArr2 = new int[1];
            iArr2[i] = i();
        }
        dtsr.dx(length, iArr2, new emyl() { // from class: buva
            @Override // defpackage.emyl
            public final Object get() {
                return "message_status:".concat(String.valueOf(buxf.this.getString(10)));
            }
        });
        if (!di(11)) {
            iArr3 = iArr2;
            iArr4 = null;
        } else if (z2) {
            iArr3 = iArr2;
            iArr4 = aB();
        } else {
            iArr3 = iArr2;
            iArr4 = new int[1];
            iArr4[i] = M();
        }
        dtsr.dx(length, iArr4, new emyl() { // from class: buvl
            @Override // defpackage.emyl
            public final Object get() {
                return "message_report_status:".concat(String.valueOf(buxf.this.getString(11)));
            }
        });
        if (!di(12)) {
            iArr5 = iArr4;
            zArr = null;
        } else if (z2) {
            iArr5 = iArr4;
            zArr = bF();
        } else {
            iArr5 = iArr4;
            zArr = new boolean[1];
            zArr[i] = ax();
        }
        dtsr.dA(length, zArr, new emyl() { // from class: buvw
            @Override // defpackage.emyl
            public final Object get() {
                return "seen:".concat(String.valueOf(buxf.this.getString(12)));
            }
        });
        if (!di(13)) {
            zArr2 = zArr;
            zArr3 = null;
        } else if (z2) {
            zArr2 = zArr;
            zArr3 = bG();
        } else {
            zArr2 = zArr;
            zArr3 = new boolean[1];
            zArr3[i] = ay();
        }
        dtsr.dA(length, zArr3, new emyl() { // from class: buwh
            @Override // defpackage.emyl
            public final Object get() {
                return "read:".concat(String.valueOf(buxf.this.getString(13)));
            }
        });
        if (!di(14)) {
            zArr4 = zArr3;
            uriArr = null;
        } else if (z2) {
            zArr4 = zArr3;
            uriArr = aT();
        } else {
            zArr4 = zArr3;
            uriArr = new Uri[1];
            uriArr[i] = o();
        }
        dtsr.dz(length, uriArr, new emyl() { // from class: buws
            @Override // defpackage.emyl
            public final Object get() {
                return "sms_message_uri:".concat(String.valueOf(buxf.this.getString(14)));
            }
        });
        if (!di(15)) {
            uriArr2 = uriArr;
            iArr6 = null;
        } else if (z2) {
            uriArr2 = uriArr;
            iArr6 = dtub.z(null, dr(getString(cM(15, MessagesTable.a))));
        } else {
            uriArr2 = uriArr;
            iArr6 = new int[1];
            iArr6[i] = h();
        }
        dtsr.dx(length, iArr6, new emyl() { // from class: buxb
            @Override // defpackage.emyl
            public final Object get() {
                return "sms_priority:".concat(String.valueOf(buxf.this.getString(15)));
            }
        });
        if (!di(16)) {
            iArr7 = iArr6;
            jArr3 = null;
        } else if (z2) {
            iArr7 = iArr6;
            jArr3 = dtub.B(null, ds(getString(cM(16, MessagesTable.a))));
        } else {
            iArr7 = iArr6;
            jArr3 = new long[1];
            jArr3[i] = V();
        }
        dtsr.dy(length, jArr3, new emyl() { // from class: buxc
            @Override // defpackage.emyl
            public final Object get() {
                return "sms_message_size:".concat(String.valueOf(buxf.this.getString(16)));
            }
        });
        if (!di(17)) {
            jArr4 = jArr3;
            strArr = null;
        } else if (z2) {
            jArr4 = jArr3;
            strArr = bt();
        } else {
            jArr4 = jArr3;
            strArr = new String[1];
            strArr[i] = G();
        }
        dtsr.dz(length, strArr, new emyl() { // from class: buxd
            @Override // defpackage.emyl
            public final Object get() {
                return "mms_subject:".concat(String.valueOf(buxf.this.getString(17)));
            }
        });
        if (!di(18)) {
            strArr2 = strArr;
            strArr3 = null;
        } else if (z2) {
            strArr2 = strArr;
            strArr3 = bu();
        } else {
            strArr2 = strArr;
            strArr3 = new String[1];
            strArr3[i] = H();
        }
        dtsr.dz(length, strArr3, new emyl() { // from class: buxe
            @Override // defpackage.emyl
            public final Object get() {
                return "mms_transaction_id:".concat(String.valueOf(buxf.this.getString(18)));
            }
        });
        if (!di(19)) {
            strArr4 = strArr3;
            strArr5 = null;
        } else if (z2) {
            strArr4 = strArr3;
            strArr5 = br();
        } else {
            strArr4 = strArr3;
            strArr5 = new String[1];
            strArr5[i] = E();
        }
        dtsr.dz(length, strArr5, new emyl() { // from class: buuq
            @Override // defpackage.emyl
            public final Object get() {
                return "mms_content_location:".concat(String.valueOf(buxf.this.getString(19)));
            }
        });
        if (!di(20)) {
            strArr6 = strArr5;
            jArr5 = null;
        } else if (z2) {
            strArr6 = strArr5;
            jArr5 = aK();
        } else {
            strArr6 = strArr5;
            jArr5 = new long[1];
            jArr5[i] = j();
        }
        dtsr.dy(length, jArr5, new emyl() { // from class: buus
            @Override // defpackage.emyl
            public final Object get() {
                return "mms_expiry:".concat(String.valueOf(buxf.this.getString(20)));
            }
        });
        if (!di(21)) {
            jArr6 = jArr5;
            jArr7 = null;
        } else if (z2) {
            jArr6 = jArr5;
            jArr7 = aL();
        } else {
            jArr6 = jArr5;
            jArr7 = new long[1];
            jArr7[i] = R();
        }
        dtsr.dy(length, jArr7, new emyl() { // from class: buut
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_expiry:".concat(String.valueOf(buxf.this.getString(21)));
            }
        });
        if (!di(22)) {
            jArr8 = jArr7;
            strArr7 = null;
        } else if (z2) {
            jArr8 = jArr7;
            strArr7 = bs();
        } else {
            jArr8 = jArr7;
            strArr7 = new String[1];
            strArr7[i] = F();
        }
        dtsr.dz(length, strArr7, new emyl() { // from class: buuu
            @Override // defpackage.emyl
            public final Object get() {
                return "mms_retrieve_text:".concat(String.valueOf(buxf.this.getString(22)));
            }
        });
        if (!di(23)) {
            strArr8 = strArr7;
            iArr8 = null;
        } else if (z2) {
            strArr8 = strArr7;
            iArr8 = aE();
        } else {
            strArr8 = strArr7;
            iArr8 = new int[1];
            iArr8[i] = e();
        }
        dtsr.dx(length, iArr8, new emyl() { // from class: buuv
            @Override // defpackage.emyl
            public final Object get() {
                return "raw_status:".concat(String.valueOf(buxf.this.getString(23)));
            }
        });
        if (!di(24)) {
            iArr9 = iArr8;
            strArr9 = null;
        } else if (z2) {
            iArr9 = iArr8;
            strArr9 = by();
        } else {
            iArr9 = iArr8;
            strArr9 = new String[1];
            strArr9[i] = aq();
        }
        dtsr.dz(length, strArr9, new emyl() { // from class: buuw
            @Override // defpackage.emyl
            public final Object get() {
                return "self_id:".concat(String.valueOf(buxf.this.getString(24)));
            }
        });
        if (!di(25)) {
            strArr10 = strArr9;
            azsuVarArr = null;
        } else if (z2) {
            strArr10 = strArr9;
            azsuVarArr = aU();
        } else {
            strArr10 = strArr9;
            azsuVarArr = new azsu[1];
            azsuVarArr[i] = X();
        }
        dtsr.dz(length, azsuVarArr, new emyl() { // from class: buux
            @Override // defpackage.emyl
            public final Object get() {
                return "my_identity_foreign_key:".concat(String.valueOf(buxf.this.getString(25)));
            }
        });
        if (!di(26)) {
            azsuVarArr2 = azsuVarArr;
            jArr9 = null;
        } else if (z2) {
            azsuVarArr2 = azsuVarArr;
            jArr9 = aP();
        } else {
            azsuVarArr2 = azsuVarArr;
            jArr9 = new long[1];
            jArr9[i] = T();
        }
        dtsr.dy(length, jArr9, new emyl() { // from class: buuy
            @Override // defpackage.emyl
            public final Object get() {
                return "retry_start_timestamp:".concat(String.valueOf(buxf.this.getString(26)));
            }
        });
        if (!di(27)) {
            jArr10 = jArr9;
            strArr11 = null;
        } else if (z2) {
            jArr10 = jArr9;
            strArr11 = bl();
        } else {
            jArr10 = jArr9;
            strArr11 = new String[1];
            strArr11[i] = C();
        }
        dtsr.dz(length, strArr11, new emyl() { // from class: buuz
            @Override // defpackage.emyl
            public final Object get() {
                return "cloud_sync_id:".concat(String.valueOf(buxf.this.getString(27)));
            }
        });
        if (!di(28)) {
            strArr12 = strArr11;
            bdhgVarArr = null;
        } else if (z2) {
            strArr12 = strArr11;
            bdhgVarArr = ba();
        } else {
            strArr12 = strArr11;
            bdhgVarArr = new bdhg[1];
            bdhgVarArr[i] = r();
        }
        dtsr.dz(length, bdhgVarArr, new emyl() { // from class: buvb
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_message_id_with_text_type:".concat(String.valueOf(buxf.this.getString(28)));
            }
        });
        if (!di(29)) {
            bdhgVarArr2 = bdhgVarArr;
            iArr10 = null;
        } else if (z2) {
            bdhgVarArr2 = bdhgVarArr;
            iArr10 = aF();
        } else {
            bdhgVarArr2 = bdhgVarArr;
            iArr10 = new int[1];
            iArr10[i] = O();
        }
        dtsr.dx(length, iArr10, new emyl() { // from class: buvc
            @Override // defpackage.emyl
            public final Object get() {
                return "etouffee_status:".concat(String.valueOf(buxf.this.getString(29)));
            }
        });
        if (!di(30)) {
            iArr11 = iArr10;
            jArr11 = jArr;
            z = z2;
            messageIdTypeArr = aX;
            byziVarArr = null;
        } else if (z2) {
            iArr11 = iArr10;
            int[] dr = dr(getString(cM(30, MessagesTable.a)));
            byzi[] values = byzi.values();
            jArr11 = jArr;
            int length2 = values.length;
            byzi[] byziVarArr3 = new byzi[dr.length];
            z = z2;
            messageIdTypeArr = aX;
            for (int i6 = i; i6 < dr.length; i6++) {
                int i7 = dr[i6];
                if (i7 >= length2) {
                    throw new IllegalStateException();
                }
                byziVarArr3[i6] = values[i7];
            }
            byziVarArr = (byzi[]) dtub.C(null, byziVarArr3, new byzi[i]);
        } else {
            iArr11 = iArr10;
            jArr11 = jArr;
            z = z2;
            messageIdTypeArr = aX;
            byzi[] byziVarArr4 = new byzi[1];
            byziVarArr4[i] = ae();
            byziVarArr = byziVarArr4;
        }
        dtsr.dz(length, byziVarArr, new emyl() { // from class: buve
            @Override // defpackage.emyl
            public final Object get() {
                return "verification_status:".concat(String.valueOf(buxf.this.getString(30)));
            }
        });
        int[] aG = di(31) ? z ? aG() : new int[]{P()} : null;
        dtsr.dx(length, aG, new emyl() { // from class: buvf
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_ui_status:".concat(String.valueOf(buxf.this.getString(31)));
            }
        });
        boolean[] bE = di(32) ? z ? bE() : new boolean[]{K()} : null;
        dtsr.dA(length, bE, new emyl() { // from class: buvg
            @Override // defpackage.emyl
            public final Object get() {
                return "is_hidden:".concat(String.valueOf(buxf.this.getString(32)));
            }
        });
        String[] bw = di(33) ? z ? bw() : new String[]{ao()} : null;
        dtsr.dz(length, bw, new emyl() { // from class: buvh
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_remote_instance:".concat(String.valueOf(buxf.this.getString(33)));
            }
        });
        if (!di(34)) {
            iArr12 = aG;
            jArr12 = null;
        } else if (z) {
            iArr12 = aG;
            jArr12 = aM();
        } else {
            iArr12 = aG;
            jArr12 = new long[]{k()};
        }
        dtsr.dy(length, jArr12, new emyl() { // from class: buvi
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_file_transfer_session_id:".concat(String.valueOf(buxf.this.getString(34)));
            }
        });
        if (!di(35)) {
            jArr13 = jArr12;
            iArr13 = null;
        } else if (z) {
            jArr13 = jArr12;
            iArr13 = aI();
        } else {
            jArr13 = jArr12;
            iArr13 = new int[]{g()};
        }
        dtsr.dx(length, iArr13, new emyl() { // from class: buvj
            @Override // defpackage.emyl
            public final Object get() {
                return "sms_error_code:".concat(String.valueOf(buxf.this.getString(35)));
            }
        });
        if (!di(36)) {
            iArr14 = iArr13;
            strArr13 = null;
        } else if (z) {
            iArr14 = iArr13;
            strArr13 = bB();
        } else {
            iArr14 = iArr13;
            strArr13 = new String[]{at()};
        }
        dtsr.dz(length, strArr13, new emyl() { // from class: buvk
            @Override // defpackage.emyl
            public final Object get() {
                return "sms_error_desc_map_name:".concat(String.valueOf(buxf.this.getString(36)));
            }
        });
        if (!di(37)) {
            strArr14 = strArr13;
            strArr15 = null;
        } else if (z) {
            strArr14 = strArr13;
            strArr15 = bo();
        } else {
            strArr14 = strArr13;
            strArr15 = new String[]{al()};
        }
        dtsr.dz(length, strArr15, new emyl() { // from class: buvm
            @Override // defpackage.emyl
            public final Object get() {
                return "correlation_id:".concat(String.valueOf(buxf.this.getString(37)));
            }
        });
        if (!di(38)) {
            strArr16 = strArr15;
            strArr17 = null;
        } else if (z) {
            strArr16 = strArr15;
            strArr17 = bn();
        } else {
            strArr16 = strArr15;
            strArr17 = new String[]{D()};
        }
        dtsr.dz(length, strArr17, new emyl() { // from class: buvn
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_id:".concat(String.valueOf(buxf.this.getString(38)));
            }
        });
        if (!di(39)) {
            strArr18 = strArr17;
            jArr14 = null;
        } else if (z) {
            strArr18 = strArr17;
            jArr14 = aJ();
        } else {
            strArr18 = strArr17;
            jArr14 = new long[]{Q()};
        }
        dtsr.dy(length, jArr14, new emyl() { // from class: buvo
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_last_mod_seq:".concat(String.valueOf(buxf.this.getString(39)));
            }
        });
        if (!di(40)) {
            jArr15 = jArr14;
            byziVarArr2 = byziVarArr;
            strArr19 = null;
        } else if (z) {
            jArr15 = jArr14;
            byziVarArr2 = byziVarArr;
            strArr19 = (String[]) dtub.C(null, dt(getString(cM(40, MessagesTable.a))), new String[0]);
        } else {
            jArr15 = jArr14;
            byziVarArr2 = byziVarArr;
            strArr19 = new String[]{J()};
        }
        dtsr.dz(length, strArr19, new emyl() { // from class: buvq
            @Override // defpackage.emyl
            public final Object get() {
                return "web_id:".concat(String.valueOf(buxf.this.getString(40)));
            }
        });
        long[] B = di(41) ? z ? dtub.B(null, ds(getString(cM(41, MessagesTable.a)))) : new long[]{W()} : null;
        dtsr.dy(length, B, new emyl() { // from class: buvr
            @Override // defpackage.emyl
            public final Object get() {
                return "usage_stats_logging_id:".concat(String.valueOf(buxf.this.getString(41)));
            }
        });
        if (!di(42)) {
            jArr16 = B;
            jArr17 = null;
        } else if (z) {
            jArr16 = B;
            jArr17 = aQ();
        } else {
            jArr16 = B;
            jArr17 = new long[]{U()};
        }
        dtsr.dy(length, jArr17, new emyl() { // from class: buvs
            @Override // defpackage.emyl
            public final Object get() {
                return "send_counter:".concat(String.valueOf(buxf.this.getString(42)));
            }
        });
        if (!di(43)) {
            jArr18 = jArr17;
            bdhgVarArr3 = null;
        } else if (z) {
            jArr18 = jArr17;
            bdhgVarArr3 = aZ();
        } else {
            jArr18 = jArr17;
            bdhgVarArr3 = new bdhg[]{aa()};
        }
        dtsr.dz(length, bdhgVarArr3, new emyl() { // from class: buvt
            @Override // defpackage.emyl
            public final Object get() {
                return "original_rcs_message_id:".concat(String.valueOf(buxf.this.getString(43)));
            }
        });
        if (!di(44)) {
            bdhgVarArr4 = bdhgVarArr3;
            strArr20 = null;
        } else if (z) {
            bdhgVarArr4 = bdhgVarArr3;
            strArr20 = bp();
        } else {
            bdhgVarArr4 = bdhgVarArr3;
            strArr20 = new String[]{am()};
        }
        dtsr.dz(length, strArr20, new emyl() { // from class: buvu
            @Override // defpackage.emyl
            public final Object get() {
                return "custom_delivery_receipt_mime_type:".concat(String.valueOf(buxf.this.getString(44)));
            }
        });
        if (!di(45)) {
            strArr21 = strArr20;
            bArr = null;
        } else if (z) {
            strArr21 = strArr20;
            bArr = bH();
        } else {
            strArr21 = strArr20;
            bArr = new byte[][]{az()};
        }
        dtsr.dz(length, bArr, new emyl() { // from class: buvv
            @Override // defpackage.emyl
            public final Object get() {
                return "custom_delivery_receipt_content:".concat(String.valueOf(buxf.this.getString(45)));
            }
        });
        if (!di(46)) {
            bArr2 = bArr;
            jArr19 = null;
        } else if (z) {
            bArr2 = bArr;
            jArr19 = aO();
        } else {
            bArr2 = bArr;
            jArr19 = new long[]{S()};
        }
        dtsr.dy(length, jArr19, new emyl() { // from class: buvx
            @Override // defpackage.emyl
            public final Object get() {
                return "report_attempt_acounter:".concat(String.valueOf(buxf.this.getString(46)));
            }
        });
        if (!di(47)) {
            jArr20 = jArr19;
            fayvVarArr = null;
        } else if (z) {
            jArr20 = jArr19;
            fayvVarArr = bh();
        } else {
            jArr20 = jArr19;
            fayvVarArr = new fayv[]{ah()};
        }
        dtsr.dz(length, fayvVarArr, new emyl() { // from class: buvy
            @Override // defpackage.emyl
            public final Object get() {
                return "custom_headers:".concat(String.valueOf(buxf.this.getString(47)));
            }
        });
        if (!di(48)) {
            fayvVarArr2 = fayvVarArr;
            strArr22 = null;
        } else if (z) {
            fayvVarArr2 = fayvVarArr;
            strArr22 = bm();
        } else {
            fayvVarArr2 = fayvVarArr;
            strArr22 = new String[]{ak()};
        }
        dtsr.dz(length, strArr22, new emyl() { // from class: buvz
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_correlation_id:".concat(String.valueOf(buxf.this.getString(48)));
            }
        });
        if (!di(49)) {
            strArr23 = strArr22;
            strArr24 = null;
        } else if (z) {
            strArr23 = strArr22;
            strArr24 = bq();
        } else {
            strArr23 = strArr22;
            strArr24 = new String[]{an()};
        }
        dtsr.dz(length, strArr24, new emyl() { // from class: buwa
            @Override // defpackage.emyl
            public final Object get() {
                return "group_private_participant:".concat(String.valueOf(buxf.this.getString(49)));
            }
        });
        if (!di(50)) {
            strArr25 = strArr24;
            messageIdTypeArr2 = null;
        } else if (z) {
            strArr25 = strArr24;
            messageIdTypeArr2 = aY();
        } else {
            strArr25 = strArr24;
            messageIdTypeArr2 = new MessageIdType[]{Z()};
        }
        dtsr.dz(length, messageIdTypeArr2, new emyl() { // from class: buwc
            @Override // defpackage.emyl
            public final Object get() {
                return "original_message_id:".concat(String.valueOf(buxf.this.getString(50)));
            }
        });
        if (!di(51)) {
            messageIdTypeArr3 = messageIdTypeArr2;
            zArr5 = null;
        } else if (z) {
            messageIdTypeArr3 = messageIdTypeArr2;
            zArr5 = bC();
        } else {
            messageIdTypeArr3 = messageIdTypeArr2;
            zArr5 = new boolean[]{av()};
        }
        dtsr.dA(length, zArr5, new emyl() { // from class: buwd
            @Override // defpackage.emyl
            public final Object get() {
                return "awaiting_reverse_sync:".concat(String.valueOf(buxf.this.getString(51)));
            }
        });
        if (!di(52)) {
            zArr6 = zArr5;
            uriArr3 = null;
        } else if (z) {
            zArr6 = zArr5;
            uriArr3 = aS();
        } else {
            zArr6 = zArr5;
            uriArr3 = new Uri[]{n()};
        }
        dtsr.dz(length, uriArr3, new emyl() { // from class: buwe
            @Override // defpackage.emyl
            public final Object get() {
                return "old_sms_message_uri:".concat(String.valueOf(buxf.this.getString(52)));
            }
        });
        if (!di(53)) {
            uriArr4 = uriArr3;
            optionalArr = null;
        } else if (z) {
            uriArr4 = uriArr3;
            optionalArr = bj();
        } else {
            uriArr4 = uriArr3;
            optionalArr = new Optional[]{aj()};
        }
        dtsr.dz(length, optionalArr, new emyl() { // from class: buwf
            @Override // defpackage.emyl
            public final Object get() {
                return "draft_id:".concat(String.valueOf(buxf.this.getString(53)));
            }
        });
        if (!di(54)) {
            optionalArr2 = optionalArr;
            iArr15 = null;
        } else if (z) {
            optionalArr2 = optionalArr;
            iArr15 = aH();
        } else {
            optionalArr2 = optionalArr;
            iArr15 = new int[]{f()};
        }
        dtsr.dx(length, iArr15, new emyl() { // from class: buwg
            @Override // defpackage.emyl
            public final Object get() {
                return "result_code:".concat(String.valueOf(buxf.this.getString(54)));
            }
        });
        if (!di(55)) {
            iArr16 = iArr15;
            csggVarArr = null;
        } else if (z) {
            iArr16 = iArr15;
            csggVarArr = bg();
        } else {
            iArr16 = iArr15;
            csggVarArr = new csgg[]{t()};
        }
        dtsr.dz(length, csggVarArr, new emyl() { // from class: buwi
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_life_cycle:".concat(String.valueOf(buxf.this.getString(55)));
            }
        });
        if (!di(56)) {
            csggVarArr2 = csggVarArr;
            cjcoVarArr = null;
        } else if (z) {
            csggVarArr2 = csggVarArr;
            cjcoVarArr = bf();
        } else {
            csggVarArr2 = csggVarArr;
            cjcoVarArr = new cjco[]{ag()};
        }
        dtsr.dz(length, cjcoVarArr, new emyl() { // from class: buwj
            @Override // defpackage.emyl
            public final Object get() {
                return "mute_priority:".concat(String.valueOf(buxf.this.getString(56)));
            }
        });
        if (!di(57)) {
            cjcoVarArr2 = cjcoVarArr;
            byywVarArr = null;
        } else if (z) {
            cjcoVarArr2 = cjcoVarArr;
            byywVarArr = bb();
        } else {
            cjcoVarArr2 = cjcoVarArr;
            byywVarArr = new byyw[]{ab()};
        }
        dtsr.dz(length, byywVarArr, new emyl() { // from class: buwk
            @Override // defpackage.emyl
            public final Object get() {
                return "fallback_reason:".concat(String.valueOf(buxf.this.getString(57)));
            }
        });
        if (!di(58)) {
            byywVarArr2 = byywVarArr;
            iArr17 = null;
        } else if (z) {
            byywVarArr2 = byywVarArr;
            iArr17 = aA();
        } else {
            byywVarArr2 = byywVarArr;
            iArr17 = new int[]{L()};
        }
        dtsr.dx(length, iArr17, new emyl() { // from class: buwl
            @Override // defpackage.emyl
            public final Object get() {
                return "auto_retry_counter:".concat(String.valueOf(buxf.this.getString(58)));
            }
        });
        if (!di(59)) {
            iArr18 = iArr17;
            zArr7 = null;
        } else if (z) {
            iArr18 = iArr17;
            zArr7 = bD();
        } else {
            iArr18 = iArr17;
            zArr7 = new boolean[]{aw()};
        }
        dtsr.dA(length, zArr7, new emyl() { // from class: buwm
            @Override // defpackage.emyl
            public final Object get() {
                return "can_revoke_before_delivered_with_rcs:".concat(String.valueOf(buxf.this.getString(59)));
            }
        });
        if (!di(60)) {
            zArr8 = zArr7;
            strArr26 = strArr19;
            zArr9 = bE;
            fjayVarArr = null;
        } else if (z) {
            zArr8 = zArr7;
            List de = de(getString(cM(60, MessagesTable.a)));
            fjay[] fjayVarArr3 = new fjay[de.size()];
            Iterator it = de.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                Iterator it2 = it;
                try {
                    byte[] y = dtub.y((String) it.next());
                    int i9 = i8 + 1;
                    if (y == null) {
                        strArr28 = strArr19;
                        fjayVar = null;
                    } else {
                        strArr28 = strArr19;
                        try {
                            fjayVar = (fjay) eyfy.parseFrom(fjay.a, y);
                        } catch (Throwable unused) {
                            i8 = i9;
                            fjayVarArr3[i8] = null;
                            i8++;
                            it = it2;
                            strArr19 = strArr28;
                        }
                    }
                    fjayVarArr3[i8] = fjayVar;
                    i8 = i9;
                } catch (Throwable unused2) {
                    strArr28 = strArr19;
                }
                it = it2;
                strArr19 = strArr28;
            }
            strArr26 = strArr19;
            zArr9 = bE;
            fjayVarArr = (fjay[]) dtub.C(null, fjayVarArr3, new fjay[0]);
        } else {
            zArr8 = zArr7;
            strArr26 = strArr19;
            zArr9 = bE;
            fjayVarArr = new fjay[]{au()};
        }
        dtsr.dz(length, fjayVarArr, new emyl() { // from class: buwo
            @Override // defpackage.emyl
            public final Object get() {
                return "trace_id:".concat(String.valueOf(buxf.this.getString(60)));
            }
        });
        byzg[] bc = di(61) ? z ? bc() : new byzg[]{ac()} : null;
        dtsr.dz(length, bc, new emyl() { // from class: buwp
            @Override // defpackage.emyl
            public final Object get() {
                return "outgoing_delivery_report_status:".concat(String.valueOf(buxf.this.getString(61)));
            }
        });
        byzg[] bd = di(62) ? z ? bd() : new byzg[]{ad()} : null;
        dtsr.dz(length, bd, new emyl() { // from class: buwq
            @Override // defpackage.emyl
            public final Object get() {
                return "outgoing_read_report_status:".concat(String.valueOf(buxf.this.getString(62)));
            }
        });
        if (!di(63)) {
            byzgVarArr = bc;
            fjayVarArr2 = fjayVarArr;
            byzgVarArr2 = bd;
            strArr27 = bw;
            bdgrVarArr = null;
            byzlVarArr = null;
        } else if (z) {
            byzgVarArr = bc;
            int[] dr2 = dr(getString(cM(63, MessagesTable.a)));
            byzl[] values2 = byzl.values();
            fjayVarArr2 = fjayVarArr;
            int length3 = values2.length;
            byzgVarArr2 = bd;
            byzl[] byzlVarArr3 = new byzl[dr2.length];
            strArr27 = bw;
            for (int i10 = 0; i10 < dr2.length; i10++) {
                int i11 = dr2[i10];
                if (i11 >= length3) {
                    throw new IllegalStateException();
                }
                byzlVarArr3[i10] = values2[i11];
            }
            bdgrVarArr = null;
            byzlVarArr = (byzl[]) dtub.C(null, byzlVarArr3, new byzl[0]);
        } else {
            byzgVarArr = bc;
            fjayVarArr2 = fjayVarArr;
            byzgVarArr2 = bd;
            strArr27 = bw;
            bdgrVarArr = null;
            byzlVarArr = new byzl[]{s()};
        }
        dtsr.dz(length, byzlVarArr, new emyl() { // from class: buwr
            @Override // defpackage.emyl
            public final Object get() {
                return "xms_transport:".concat(String.valueOf(buxf.this.getString(63)));
            }
        });
        int[] aC = di(64) ? z ? aC() : new int[]{N()} : bdgrVarArr;
        dtsr.dx(length, aC, new emyl() { // from class: buwt
            @Override // defpackage.emyl
            public final Object get() {
                return "message_original_protocol:".concat(String.valueOf(buxf.this.getString(64)));
            }
        });
        bdgr[] aW = di(65) ? z ? aW() : new bdgr[]{Y()} : bdgrVarArr;
        dtsr.dz(length, aW, new emyl() { // from class: buwu
            @Override // defpackage.emyl
            public final Object get() {
                return "satellite_datagram_id:".concat(String.valueOf(buxf.this.getString(65)));
            }
        });
        cfmh[] be = di(66) ? z ? be() : new cfmh[]{af()} : null;
        dtsr.dz(length, be, new emyl() { // from class: buwv
            @Override // defpackage.emyl
            public final Object get() {
                return "encryption_protocol:".concat(String.valueOf(buxf.this.getString(66)));
            }
        });
        if (!di(67)) {
            i2 = 0;
            byzlVarArr2 = byzlVarArr;
            optionalArr3 = null;
        } else if (z) {
            optionalArr3 = bk();
            byzlVarArr2 = byzlVarArr;
            i2 = 0;
        } else {
            i2 = 0;
            optionalArr3 = new Optional[]{B()};
            byzlVarArr2 = byzlVarArr;
        }
        dtsr.dz(length, optionalArr3, new emyl() { // from class: buww
            @Override // defpackage.emyl
            public final Object get() {
                return "message_persistence_id:".concat(String.valueOf(buxf.this.getString(67)));
            }
        });
        engr engrVar = new engr();
        int i12 = i2;
        while (i12 < length) {
            long j = jArr2[i12];
            if (j > 0) {
                i3 = i12;
                if (!hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(jArr2[i3]));
                    buoy c = MessagesTable.c();
                    c.aD();
                    long j2 = jArr2[i3];
                    cfmhVarArr = be;
                    if (messageIdTypeArr != null) {
                        c.v(messageIdTypeArr[i3]);
                    }
                    if (aV != null) {
                        c.m(aV[i3]);
                    }
                    if (bz != null) {
                        c.ag(bz[i3]);
                    }
                    if (bA != null) {
                        c.ah(bA[i3]);
                    }
                    if (bv != null) {
                        c.E(bv[i3]);
                    }
                    if (bx != null) {
                        c.Z(bx[i3]);
                    }
                    i4 = length;
                    if (aR != null) {
                        c.ai(aR[i3]);
                    }
                    if (instantArr != null) {
                        c.P(instantArr[i3]);
                    }
                    if (jArr11 != null) {
                        c.Y(jArr11[i3]);
                    }
                    if (iArr != null) {
                        c.O(iArr[i3]);
                    }
                    if (iArr3 != null) {
                        c.ao(iArr3[i3]);
                    }
                    if (iArr5 != null) {
                        c.y(iArr5[i3]);
                    }
                    if (zArr2 != null) {
                        c.H(zArr2[i3]);
                    }
                    if (zArr4 != null) {
                        c.X(zArr4[i3]);
                    }
                    if (uriArr2 != null) {
                        c.am(uriArr2[i3]);
                    }
                    if (iArr7 != null) {
                        c.an(iArr7[i3]);
                    }
                    if (jArr4 != null) {
                        c.al(jArr4[i3]);
                    }
                    if (strArr2 != null) {
                        c.C(strArr2[i3]);
                    }
                    if (strArr4 != null) {
                        c.D(strArr4[i3]);
                    }
                    if (strArr6 != null) {
                        c.z(strArr6[i3]);
                    }
                    if (jArr6 != null) {
                        c.A(jArr6[i3]);
                    }
                    if (jArr8 != null) {
                        c.S(jArr8[i3]);
                    }
                    if (strArr8 != null) {
                        c.B(strArr8[i3]);
                    }
                    if (iArr9 != null) {
                        c.Q(iArr9[i3]);
                    }
                    if (strArr10 != null) {
                        c.ae(strArr10[i3]);
                    }
                    if (azsuVarArr2 != null) {
                        c.G(azsuVarArr2[i3]);
                    }
                    if (jArr10 != null) {
                        c.ac(jArr10[i3]);
                    }
                    if (strArr12 != null) {
                        c.h(strArr12[i3]);
                    }
                    if (bdhgVarArr2 != null) {
                        c.U(bdhgVarArr2[i3]);
                    }
                    if (iArr11 != null) {
                        c.R(iArr11[i3]);
                    }
                    if (byziVarArr2 != null) {
                        c.ar(byziVarArr2[i3]);
                    }
                    if (iArr12 != null) {
                        c.W(iArr12[i3]);
                    }
                    if (zArr9 != null) {
                        c.w(zArr9[i3]);
                    }
                    if (strArr27 != null) {
                        c.V(strArr27[i3]);
                    }
                    if (jArr13 != null) {
                        c.T(jArr13[i3]);
                    }
                    if (iArr14 != null) {
                        c.aj(iArr14[i3]);
                    }
                    if (strArr14 != null) {
                        c.ak(strArr14[i3]);
                    }
                    if (strArr16 != null) {
                        c.n(strArr16[i3]);
                    }
                    if (strArr18 != null) {
                        c.j(strArr18[i3]);
                    }
                    if (jArr15 != null) {
                        c.k(jArr15[i3]);
                    }
                    if (strArr26 != null) {
                        c.as(strArr26[i3]);
                    }
                    if (jArr16 != null) {
                        c.aq(jArr16[i3]);
                    }
                    if (jArr18 != null) {
                        c.af(jArr18[i3]);
                    }
                    if (bdhgVarArr4 != null) {
                        c.L(bdhgVarArr4[i3]);
                    }
                    if (strArr21 != null) {
                        c.p(strArr21[i3]);
                    }
                    if (bArr2 != null) {
                        c.o(bArr2[i3]);
                    }
                    if (jArr20 != null) {
                        c.aa(jArr20[i3]);
                    }
                    if (fayvVarArr2 != null) {
                        c.q(fayvVarArr2[i3]);
                    }
                    if (strArr23 != null) {
                        c.i(strArr23[i3]);
                    }
                    if (strArr25 != null) {
                        c.u(strArr25[i3]);
                    }
                    if (messageIdTypeArr3 != null) {
                        c.J(messageIdTypeArr3[i3]);
                    }
                    if (zArr6 != null) {
                        c.f(zArr6[i3]);
                    }
                    if (uriArr4 != null) {
                        c.I(uriArr4[i3]);
                    }
                    if (optionalArr2 != null) {
                        c.r(optionalArr2[i3]);
                    }
                    if (iArr16 != null) {
                        c.ab(iArr16[i3]);
                    }
                    if (csggVarArr2 != null) {
                        c.l(csggVarArr2[i3]);
                    }
                    if (cjcoVarArr2 != null) {
                        c.F(cjcoVarArr2[i3]);
                    }
                    if (byywVarArr2 != null) {
                        c.t(byywVarArr2[i3]);
                    }
                    if (iArr18 != null) {
                        c.e(iArr18[i3]);
                    }
                    if (zArr8 != null) {
                        c.g(zArr8[i3]);
                    }
                    if (fjayVarArr2 != null) {
                        c.ap(fjayVarArr2[i3]);
                    }
                    if (byzgVarArr != null) {
                        c.M(byzgVarArr[i3]);
                    }
                    if (byzgVarArr2 != null) {
                        c.N(byzgVarArr2[i3]);
                    }
                    if (byzlVarArr2 != null) {
                        c.at(byzlVarArr2[i3]);
                    }
                    if (aC != null) {
                        c.K(aC[i3]);
                    }
                    if (aW != null) {
                        c.ad(aW[i3]);
                    }
                    if (cfmhVarArr != null) {
                        c.s(cfmhVarArr[i3]);
                    }
                    if (optionalArr3 != null) {
                        c.x(optionalArr3[i3]);
                    }
                    engrVar.h(c.a());
                    i12 = i3 + 1;
                    be = cfmhVarArr;
                    length = i4;
                }
            } else {
                i3 = i12;
            }
            cfmhVarArr = be;
            i4 = length;
            i12 = i3 + 1;
            be = cfmhVarArr;
            length = i4;
        }
        return engrVar.g();
    }

    @Override // defpackage.buuo
    public final int g() {
        return getInt(cM(35, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final int h() {
        return getInt(cM(15, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final int i() {
        return getInt(cM(10, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final long j() {
        return getLong(cM(20, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final long k() {
        return getLong(cM(34, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final long l() {
        return getLong(cM(8, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final long m() {
        return getLong(cM(6, MessagesTable.a));
    }

    @Override // defpackage.buuo
    public final Uri n() {
        String string = getString(cM(52, MessagesTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.buuo
    public final Uri o() {
        String string = getString(cM(14, MessagesTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.buuo
    public final ConversationIdType p() {
        return new ConversationIdType(getLong(cM(1, MessagesTable.a)));
    }

    @Override // defpackage.buuo
    public final MessageIdType q() {
        return new MessageIdType(getLong(cM(0, MessagesTable.a)));
    }

    @Override // defpackage.buuo
    public final bdhg r() {
        return bdhg.a(getString(cM(28, MessagesTable.a)));
    }

    @Override // defpackage.buuo
    public final byzl s() {
        byzl[] values = byzl.values();
        int i = getInt(cM(63, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.buuo
    public final csgg t() {
        csgg[] values = csgg.values();
        int i = getInt(cM(55, MessagesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.buuo
    public final engw u() {
        engr engrVar = new engr();
        while (moveToNext()) {
            p();
            engrVar.h(p());
        }
        return engrVar.g();
    }

    @Override // defpackage.buuo
    public final engw v() {
        engr engrVar = new engr();
        while (moveToNext()) {
            q();
            engrVar.h(q());
        }
        return engrVar.g();
    }

    @Override // defpackage.buuo
    public final engw w() {
        engr engrVar = new engr();
        while (moveToNext()) {
            aa();
            engrVar.h(aa());
        }
        return engrVar.g();
    }

    @Override // defpackage.buuo
    public final engw x() {
        engr engrVar = new engr();
        while (moveToNext()) {
            k();
            engrVar.h(Long.valueOf(k()));
        }
        return engrVar.g();
    }

    @Override // defpackage.buuo
    public final engw y() {
        engr engrVar = new engr();
        while (moveToNext()) {
            l();
            engrVar.h(Long.valueOf(l()));
        }
        return engrVar.g();
    }

    @Override // defpackage.buuo
    public final engw z() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (o() != null) {
                engrVar.h(o());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
