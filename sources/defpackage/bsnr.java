package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsnr extends dtsr implements bskr {
    @Deprecated
    public bsnr(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bsnz bsnzVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bsom.a, dtyoVar, dtvsVar, bsnzVar);
    }

    public final int A() {
        return getInt(cM(48, bsom.a));
    }

    public final int B() {
        return getInt(cM(29, bsom.a));
    }

    public final int C() {
        return getInt(cM(41, bsom.a));
    }

    public final int D() {
        return getInt(cM(37, bsom.a));
    }

    public final int E() {
        return getInt(cM(76, bsom.a));
    }

    public final long F() {
        return getLong(cM(55, bsom.a));
    }

    public final long G() {
        return getLong(cM(50, bsom.a));
    }

    public final long H() {
        return getLong(cM(44, bsom.a));
    }

    public final long I() {
        return getLong(cM(49, bsom.a));
    }

    public final long J() {
        return getLong(cM(18, bsom.a));
    }

    public final long K() {
        return getLong(cM(21, bsom.a));
    }

    public final long L() {
        return getLong(cM(20, bsom.a));
    }

    public final long M() {
        return getLong(cM(56, bsom.a));
    }

    public final long N() {
        return getLong(cM(17, bsom.a));
    }

    public final Uri O() {
        String string = getString(cM(8, bsom.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri P() {
        String string = getString(cM(75, bsom.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final ayhd Q() {
        return ayhd.b(getInt(cM(62, bsom.a)));
    }

    public final azcr R() {
        return azcs.a(getString(cM(28, bsom.a)));
    }

    public final azsu S() {
        return azsv.a(getString(cM(27, bsom.a)));
    }

    public final ConversationIdType T() {
        return new ConversationIdType(getLong(cM(60, bsom.a)));
    }

    public final ConversationIdType U() {
        return new ConversationIdType(getLong(cM(61, bsom.a)));
    }

    public final byyy V() {
        byyy[] values = byyy.values();
        int i = getInt(cM(3, bsom.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final cfmf W() {
        return cfmf.a(getString(cM(73, bsom.a)));
    }

    public final cfmh X() {
        return new cfmh(getLong(cM(72, bsom.a)));
    }

    public final ckkz Y() {
        byte[] blob = getBlob(cM(69, bsom.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ckkz) eyfy.parseFrom(ckkz.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return ckkz.a;
        }
    }

    public final cknh Z() {
        return new cknh(getLong(cM(58, bsom.a)));
    }

    public final boolean aA() {
        return getInt(cM(42, bsom.a)) == 1;
    }

    public final boolean aB() {
        return getInt(cM(68, bsom.a)) == 1;
    }

    public final boolean aC() {
        return getInt(cM(57, bsom.a)) == 1;
    }

    public final boolean aD() {
        return getInt(cM(10, bsom.a)) == 1;
    }

    public final boolean aE() {
        return getInt(cM(47, bsom.a)) == 1;
    }

    public final byte[] aF() {
        return getBlob(cM(54, bsom.a));
    }

    public final int[] aG() {
        return dtub.z(null, dr(getString(cM(40, bsom.a))));
    }

    public final int[] aH() {
        return dtub.z(null, dr(getString(cM(15, bsom.a))));
    }

    public final int[] aI() {
        return dtub.z(null, dr(getString(cM(39, bsom.a))));
    }

    public final int[] aJ() {
        return dtub.z(null, dr(getString(cM(71, bsom.a))));
    }

    public final int[] aK() {
        return dtub.z(null, dr(getString(cM(48, bsom.a))));
    }

    public final int[] aL() {
        return dtub.z(null, dr(getString(cM(29, bsom.a))));
    }

    public final int[] aM() {
        return dtub.z(null, dr(getString(cM(41, bsom.a))));
    }

    public final int[] aN() {
        return dtub.z(null, dr(getString(cM(37, bsom.a))));
    }

    public final int[] aO() {
        return dtub.z(null, dr(getString(cM(76, bsom.a))));
    }

    public final long[] aP() {
        return dtub.B(null, ds(getString(cM(55, bsom.a))));
    }

    public final long[] aQ() {
        return dtub.B(null, ds(getString(cM(50, bsom.a))));
    }

    public final long[] aR() {
        return dtub.B(null, ds(getString(cM(44, bsom.a))));
    }

    public final long[] aS() {
        return dtub.B(null, ds(getString(cM(49, bsom.a))));
    }

    public final long[] aT() {
        return dtub.B(null, ds(getString(cM(18, bsom.a))));
    }

    public final long[] aU() {
        return dtub.B(null, ds(getString(cM(21, bsom.a))));
    }

    public final long[] aV() {
        return dtub.B(null, ds(getString(cM(20, bsom.a))));
    }

    public final long[] aW() {
        return dtub.B(null, ds(getString(cM(38, bsom.a))));
    }

    public final long[] aX() {
        return dtub.B(null, ds(getString(cM(56, bsom.a))));
    }

    public final long[] aY() {
        return dtub.B(null, ds(getString(cM(17, bsom.a))));
    }

    public final Uri[] aZ() {
        String[] dt = dt(getString(cM(13, bsom.a)));
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

    public final ckte aa() {
        ckte[] values = ckte.values();
        int i = getInt(cM(70, bsom.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final Optional ab() {
        return bdhe.b(getLong(cM(66, bsom.a)));
    }

    public final Optional ac() {
        return bdhe.b(getLong(cM(65, bsom.a)));
    }

    public final String ad() {
        return getString(cM(74, bsom.a));
    }

    public final String ae() {
        return getString(cM(51, bsom.a));
    }

    public final String af() {
        return getString(cM(26, bsom.a));
    }

    public final String ag() {
        return getString(cM(14, bsom.a));
    }

    public final String ah() {
        return cuxs.a(getString(cM(11, bsom.a)));
    }

    public final String ai() {
        return cuxs.a(getString(cM(12, bsom.a)));
    }

    public final String aj() {
        return getString(cM(19, bsom.a));
    }

    public final String ak() {
        return cuxs.a(getString(cM(46, bsom.a)));
    }

    public final String al() {
        return getString(cM(36, bsom.a));
    }

    public final String am() {
        return getString(cM(23, bsom.a));
    }

    public final String an() {
        return getString(cM(25, bsom.a));
    }

    public final String ao() {
        return cuxs.a(getString(cM(45, bsom.a)));
    }

    public final String ap() {
        return getString(cM(35, bsom.a));
    }

    public final String aq() {
        return getString(cM(9, bsom.a));
    }

    public final String ar() {
        return cuxb.a(getString(cM(53, bsom.a)));
    }

    public final String as() {
        return getString(cM(64, bsom.a));
    }

    public final String at() {
        return getString(cM(34, bsom.a));
    }

    public final String au() {
        return cuxs.a(getString(cM(6, bsom.a)));
    }

    public final String av() {
        return cuxs.a(getString(cM(7, bsom.a)));
    }

    public final String aw() {
        return getString(cM(4, bsom.a));
    }

    public final boolean ax() {
        return getInt(cM(67, bsom.a)) == 1;
    }

    public final boolean ay() {
        return getInt(cM(43, bsom.a)) == 1;
    }

    public final boolean az() {
        return getInt(cM(33, bsom.a)) == 1;
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bsei();
    }

    public final String[] bA() {
        return (String[]) dtub.C(null, dt(getString(cM(19, bsom.a))), new String[0]);
    }

    public final String[] bB() {
        String[] dt = dt(getString(cM(2, bsom.a)));
        for (int i = 0; i < dt.length; i++) {
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    public final String[] bC() {
        String[] dt = dt(getString(cM(46, bsom.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxs.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    public final String[] bD() {
        return (String[]) dtub.C(null, dt(getString(cM(36, bsom.a))), new String[0]);
    }

    public final String[] bE() {
        return (String[]) dtub.C(null, dt(getString(cM(23, bsom.a))), new String[0]);
    }

    public final String[] bF() {
        return (String[]) dtub.C(null, dt(getString(cM(31, bsom.a))), new String[0]);
    }

    public final String[] bG() {
        return (String[]) dtub.C(null, dt(getString(cM(25, bsom.a))), new String[0]);
    }

    public final String[] bH() {
        String[] dt = dt(getString(cM(45, bsom.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxs.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    public final String[] bI() {
        return (String[]) dtub.C(null, dt(getString(cM(35, bsom.a))), new String[0]);
    }

    public final String[] bJ() {
        return (String[]) dtub.C(null, dt(getString(cM(22, bsom.a))), new String[0]);
    }

    public final String[] bK() {
        return (String[]) dtub.C(null, dt(getString(cM(24, bsom.a))), new String[0]);
    }

    public final String[] bL() {
        return (String[]) dtub.C(null, dt(getString(cM(9, bsom.a))), new String[0]);
    }

    public final String[] bM() {
        String[] dt = dt(getString(cM(53, bsom.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxb.a(dt[i]);
        }
        for (int i2 = 0; i2 < dt.length; i2++) {
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    public final String[] bN() {
        return (String[]) dtub.C(null, dt(getString(cM(52, bsom.a))), new String[0]);
    }

    public final String[] bO() {
        return (String[]) dtub.C(null, dt(getString(cM(64, bsom.a))), new String[0]);
    }

    public final String[] bP() {
        return (String[]) dtub.C(null, dt(getString(cM(34, bsom.a))), new String[0]);
    }

    public final String[] bQ() {
        String[] dt = dt(getString(cM(6, bsom.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxs.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    public final String[] bR() {
        String[] dt = dt(getString(cM(7, bsom.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxs.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    public final String[] bS() {
        return (String[]) dtub.C(null, dt(getString(cM(4, bsom.a))), new String[0]);
    }

    public final boolean[] bT() {
        return dtub.D(null, du(getString(cM(59, bsom.a))));
    }

    public final boolean[] bU() {
        return dtub.D(null, du(getString(cM(67, bsom.a))));
    }

    public final boolean[] bV() {
        return dtub.D(null, du(getString(cM(43, bsom.a))));
    }

    public final boolean[] bW() {
        return dtub.D(null, du(getString(cM(33, bsom.a))));
    }

    public final boolean[] bX() {
        return dtub.D(null, du(getString(cM(42, bsom.a))));
    }

    public final boolean[] bY() {
        return dtub.D(null, du(getString(cM(68, bsom.a))));
    }

    public final boolean[] bZ() {
        return dtub.D(null, du(getString(cM(30, bsom.a))));
    }

    public final Uri[] ba() {
        String[] dt = dt(getString(cM(8, bsom.a)));
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

    public final Uri[] bb() {
        String[] dt = dt(getString(cM(75, bsom.a)));
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

    public final ayhd[] bc() {
        int[] dr = dr(getString(cM(62, bsom.a)));
        ayhd[] ayhdVarArr = new ayhd[dr.length];
        for (int i = 0; i < dr.length; i++) {
            ayhd b = ayhd.b(dr[i]);
            if (b == null) {
                throw new IllegalStateException();
            }
            ayhdVarArr[i] = b;
        }
        return (ayhd[]) dtub.C(null, ayhdVarArr, new ayhd[0]);
    }

    public final azcr[] bd() {
        String[] dt = dt(getString(cM(28, bsom.a)));
        int length = dt.length;
        azcr[] azcrVarArr = new azcr[length];
        for (int i = 0; i < length; i++) {
            azcrVarArr[i] = azcs.a(dt[i]);
        }
        return (azcr[]) dtub.C(null, azcrVarArr, new azcr[0]);
    }

    public final azsu[] be() {
        String[] dt = dt(getString(cM(27, bsom.a)));
        int length = dt.length;
        azsu[] azsuVarArr = new azsu[length];
        for (int i = 0; i < length; i++) {
            azsuVarArr[i] = azsv.a(dt[i]);
        }
        return (azsu[]) dtub.C(null, azsuVarArr, new azsu[0]);
    }

    public final ConversationIdType[] bf() {
        long[] ds = ds(getString(cM(60, bsom.a)));
        int length = ds.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(ds[i]);
        }
        return (ConversationIdType[]) dtub.C(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final ConversationIdType[] bg() {
        long[] ds = ds(getString(cM(61, bsom.a)));
        int length = ds.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(ds[i]);
        }
        return (ConversationIdType[]) dtub.C(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final ConversationIdType[] bh() {
        long[] ds = ds(getString(cM(0, bsom.a)));
        int length = ds.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(ds[i]);
        }
        return (ConversationIdType[]) dtub.C(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final MessageIdType[] bi() {
        long[] ds = ds(getString(cM(5, bsom.a)));
        int length = ds.length;
        MessageIdType[] messageIdTypeArr = new MessageIdType[length];
        for (int i = 0; i < length; i++) {
            messageIdTypeArr[i] = new MessageIdType(ds[i]);
        }
        return (MessageIdType[]) dtub.C(null, messageIdTypeArr, new MessageIdType[0]);
    }

    public final byyt[] bj() {
        int[] dr = dr(getString(cM(16, bsom.a)));
        byyt[] byytVarArr = new byyt[dr.length];
        for (int i = 0; i < dr.length; i++) {
            byyt a = byyt.a(dr[i]);
            if (a == null) {
                throw new IllegalStateException();
            }
            byytVarArr[i] = a;
        }
        return (byyt[]) dtub.C(null, byytVarArr, new byyt[0]);
    }

    public final byyy[] bk() {
        int[] dr = dr(getString(cM(3, bsom.a)));
        byyy[] values = byyy.values();
        int length = values.length;
        byyy[] byyyVarArr = new byyy[dr.length];
        for (int i = 0; i < dr.length; i++) {
            int i2 = dr[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            byyyVarArr[i] = values[i2];
        }
        return (byyy[]) dtub.C(null, byyyVarArr, new byyy[0]);
    }

    public final cfmf[] bl() {
        String[] dt = dt(getString(cM(73, bsom.a)));
        int length = dt.length;
        cfmf[] cfmfVarArr = new cfmf[length];
        for (int i = 0; i < length; i++) {
            cfmfVarArr[i] = cfmf.a(dt[i]);
        }
        return (cfmf[]) dtub.C(null, cfmfVarArr, new cfmf[0]);
    }

    public final cfmh[] bm() {
        long[] ds = ds(getString(cM(72, bsom.a)));
        int length = ds.length;
        cfmh[] cfmhVarArr = new cfmh[length];
        for (int i = 0; i < length; i++) {
            cfmhVarArr[i] = new cfmh(ds[i]);
        }
        return (cfmh[]) dtub.C(null, cfmhVarArr, new cfmh[0]);
    }

    public final ckkz[] bn() {
        ckkz ckkzVar;
        List de = de(getString(cM(69, bsom.a)));
        ckkz[] ckkzVarArr = new ckkz[de.size()];
        Iterator it = de.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                byte[] y = dtub.y((String) it.next());
                int i2 = i + 1;
                if (y == null) {
                    ckkzVar = null;
                } else {
                    try {
                        ckkzVar = (ckkz) eyfy.parseFrom(ckkz.a, y);
                    } catch (Throwable unused) {
                        i = i2;
                        ckkzVarArr[i] = null;
                        i++;
                    }
                }
                ckkzVarArr[i] = ckkzVar;
                i = i2;
            } catch (Throwable unused2) {
            }
        }
        return (ckkz[]) dtub.C(null, ckkzVarArr, new ckkz[0]);
    }

    public final cknh[] bo() {
        long[] ds = ds(getString(cM(58, bsom.a)));
        int length = ds.length;
        cknh[] cknhVarArr = new cknh[length];
        for (int i = 0; i < length; i++) {
            cknhVarArr[i] = new cknh(ds[i]);
        }
        return (cknh[]) dtub.C(null, cknhVarArr, new cknh[0]);
    }

    public final ckte[] bp() {
        int[] dr = dr(getString(cM(70, bsom.a)));
        ckte[] values = ckte.values();
        int length = values.length;
        ckte[] ckteVarArr = new ckte[dr.length];
        for (int i = 0; i < dr.length; i++) {
            int i2 = dr[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            ckteVarArr[i] = values[i2];
        }
        return (ckte[]) dtub.C(null, ckteVarArr, new ckte[0]);
    }

    public final cpxu[] bq() {
        long[] ds = ds(getString(cM(1, bsom.a)));
        int length = ds.length;
        cpxu[] cpxuVarArr = new cpxu[length];
        for (int i = 0; i < length; i++) {
            cpxuVarArr[i] = cpxu.b(ds[i]);
        }
        return (cpxu[]) dtub.C(null, cpxuVarArr, new cpxu[0]);
    }

    public final csgg[] br() {
        int[] dr = dr(getString(cM(63, bsom.a)));
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

    public final Optional[] bs() {
        long[] ds = ds(getString(cM(66, bsom.a)));
        int length = ds.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = bdhe.b(ds[i]);
        }
        return (Optional[]) dtub.C(null, optionalArr, new Optional[0]);
    }

    public final Optional[] bt() {
        long[] ds = ds(getString(cM(65, bsom.a)));
        int length = ds.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = bdhe.b(ds[i]);
        }
        return (Optional[]) dtub.C(null, optionalArr, new Optional[0]);
    }

    public final String[] bu() {
        return (String[]) dtub.C(null, dt(getString(cM(74, bsom.a))), new String[0]);
    }

    public final String[] bv() {
        return (String[]) dtub.C(null, dt(getString(cM(51, bsom.a))), new String[0]);
    }

    public final String[] bw() {
        return (String[]) dtub.C(null, dt(getString(cM(26, bsom.a))), new String[0]);
    }

    public final String[] bx() {
        return (String[]) dtub.C(null, dt(getString(cM(14, bsom.a))), new String[0]);
    }

    public final String[] by() {
        String[] dt = dt(getString(cM(11, bsom.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxs.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    public final String[] bz() {
        String[] dt = dt(getString(cM(12, bsom.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxs.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    @Override // defpackage.bskr
    public final int c() {
        return getInt(cM(40, bsom.a));
    }

    public final boolean[] ca() {
        return dtub.D(null, du(getString(cM(32, bsom.a))));
    }

    public final boolean[] cb() {
        return dtub.D(null, du(getString(cM(57, bsom.a))));
    }

    public final boolean[] cc() {
        return dtub.D(null, du(getString(cM(10, bsom.a))));
    }

    public final boolean[] cd() {
        return dtub.D(null, du(getString(cM(47, bsom.a))));
    }

    public final byte[][] ce() {
        return dtub.E(null, dC(getString(cM(54, bsom.a))));
    }

    @Override // defpackage.bskr
    public final int e() {
        return getInt(cM(39, bsom.a));
    }

    @Override // defpackage.bskr
    public final long f() {
        return getLong(cM(38, bsom.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        int i;
        String[] strArr;
        Uri[] uriArr;
        String[] strArr2;
        long[] jArr;
        boolean[] zArr;
        boolean[] zArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        Uri[] uriArr2;
        Uri[] uriArr3;
        String[] strArr7;
        String[] strArr8;
        int[] iArr;
        int[] iArr2;
        byyt[] byytVarArr;
        byyt[] byytVarArr2;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        String[] strArr9;
        String[] strArr10;
        long[] jArr6;
        long[] jArr7;
        long[] jArr8;
        long[] jArr9;
        String[] strArr11;
        String[] strArr12;
        String[] strArr13;
        String[] strArr14;
        String[] strArr15;
        String[] strArr16;
        String[] strArr17;
        String[] strArr18;
        String[] strArr19;
        String[] strArr20;
        azsu[] azsuVarArr;
        azsu[] azsuVarArr2;
        azcr[] azcrVarArr;
        azcr[] azcrVarArr2;
        int[] iArr3;
        int[] iArr4;
        boolean[] zArr3;
        boolean[] zArr4;
        String[] strArr21;
        String[] strArr22;
        boolean[] zArr5;
        boolean[] zArr6;
        boolean[] zArr7;
        boolean[] zArr8;
        String[] strArr23;
        String[] strArr24;
        String[] strArr25;
        String[] strArr26;
        String[] strArr27;
        String[] strArr28;
        int[] iArr5;
        int[] iArr6;
        long[] jArr10;
        long[] jArr11;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        boolean[] zArr9;
        boolean[] zArr10;
        boolean[] zArr11;
        boolean[] zArr12;
        long[] jArr12;
        long[] jArr13;
        String[] strArr29;
        String[] strArr30;
        String[] strArr31;
        String[] strArr32;
        boolean[] zArr13;
        boolean[] zArr14;
        int[] iArr13;
        int[] iArr14;
        long[] jArr14;
        long[] jArr15;
        long[] jArr16;
        long[] jArr17;
        String[] strArr33;
        String[] strArr34;
        String[] strArr35;
        String[] strArr36;
        String[] strArr37;
        String[] strArr38;
        byte[][] bArr;
        byte[][] bArr2;
        long[] jArr18;
        long[] jArr19;
        long[] jArr20;
        long[] jArr21;
        boolean[] zArr15;
        boolean[] zArr16;
        cknh[] cknhVarArr;
        cknh[] cknhVarArr2;
        boolean[] zArr17;
        boolean[] zArr18;
        ConversationIdType[] conversationIdTypeArr;
        ConversationIdType[] conversationIdTypeArr2;
        ConversationIdType[] conversationIdTypeArr3;
        ConversationIdType[] conversationIdTypeArr4;
        ayhd[] ayhdVarArr;
        ayhd[] ayhdVarArr2;
        csgg[] csggVarArr;
        csgg[] csggVarArr2;
        String[] strArr39;
        String[] strArr40;
        Optional[] optionalArr;
        Optional[] optionalArr2;
        Optional[] optionalArr3;
        Optional[] optionalArr4;
        boolean[] zArr19;
        boolean[] zArr20;
        boolean[] zArr21;
        boolean[] zArr22;
        ckkz[] ckkzVarArr;
        ckkz[] ckkzVarArr2;
        ckte[] ckteVarArr;
        ckte[] ckteVarArr2;
        int[] iArr15;
        int[] iArr16;
        cfmh[] cfmhVarArr;
        cfmh[] cfmhVarArr2;
        cfmf[] cfmfVarArr;
        cfmf[] cfmfVarArr2;
        String[] strArr41;
        String[] strArr42;
        Uri[] uriArr4;
        int[] iArr17;
        int i2;
        Uri[] uriArr5;
        int[] iArr18;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            return engw.q();
        }
        HashSet hashSet = new HashSet();
        boolean d = this.d.d();
        ConversationIdType[] bh = di(0) ? d ? bh() : new ConversationIdType[]{h()} : null;
        dtsr.dz(length, bh, new emyl() { // from class: bsks
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bsnr.this.getString(0)));
            }
        });
        cpxu[] bq = di(1) ? d ? bq() : new cpxu[]{k()} : null;
        dtsr.dz(length, bq, new emyl() { // from class: bsku
            @Override // defpackage.emyl
            public final Object get() {
                return "sms_thread_id:".concat(String.valueOf(bsnr.this.getString(1)));
            }
        });
        String[] bB = di(2) ? d ? bB() : new String[]{q()} : null;
        dtsr.dz(length, bB, new emyl() { // from class: bslg
            @Override // defpackage.emyl
            public final Object get() {
                return "name:".concat(String.valueOf(bsnr.this.getString(2)));
            }
        });
        byyy[] bk = di(3) ? d ? bk() : new byyy[]{V()} : null;
        dtsr.dz(length, bk, new emyl() { // from class: bsls
            @Override // defpackage.emyl
            public final Object get() {
                return "name_is_automatic:".concat(String.valueOf(bsnr.this.getString(3)));
            }
        });
        String[] bS = di(4) ? d ? bS() : new String[]{aw()} : null;
        dtsr.dz(length, bS, new emyl() { // from class: bsme
            @Override // defpackage.emyl
            public final Object get() {
                return "subtitle:".concat(String.valueOf(bsnr.this.getString(4)));
            }
        });
        MessageIdType[] bi = di(5) ? d ? bi() : new MessageIdType[]{i()} : null;
        dtsr.dz(length, bi, new emyl() { // from class: bsmq
            @Override // defpackage.emyl
            public final Object get() {
                return "latest_message_id:".concat(String.valueOf(bsnr.this.getString(5)));
            }
        });
        String[] bQ = di(6) ? d ? bQ() : new String[]{au()} : null;
        dtsr.dz(length, bQ, new emyl() { // from class: bsnc
            @Override // defpackage.emyl
            public final Object get() {
                return "snippet_text:".concat(String.valueOf(bsnr.this.getString(6)));
            }
        });
        if (di(7)) {
            strArr = d ? bR() : new String[]{av()};
            i = 0;
        } else {
            i = 0;
            strArr = null;
        }
        dtsr.dz(length, strArr, new emyl() { // from class: bsnl
            @Override // defpackage.emyl
            public final Object get() {
                return "subject_text:".concat(String.valueOf(bsnr.this.getString(7)));
            }
        });
        if (!di(8)) {
            uriArr = null;
        } else if (d) {
            uriArr = ba();
        } else {
            uriArr = new Uri[1];
            uriArr[i] = O();
        }
        dtsr.dz(length, uriArr, new emyl() { // from class: bsnm
            @Override // defpackage.emyl
            public final Object get() {
                return "preview_uri:".concat(String.valueOf(bsnr.this.getString(8)));
            }
        });
        if (!di(9)) {
            strArr2 = null;
        } else if (d) {
            strArr2 = bL();
        } else {
            strArr2 = new String[1];
            strArr2[i] = aq();
        }
        dtsr.dz(length, strArr2, new emyl() { // from class: bsnn
            @Override // defpackage.emyl
            public final Object get() {
                return "preview_content_type:".concat(String.valueOf(bsnr.this.getString(9)));
            }
        });
        if (!di(10)) {
            jArr = dB;
            zArr = null;
        } else if (d) {
            zArr = cc();
            jArr = dB;
        } else {
            jArr = dB;
            boolean[] zArr23 = new boolean[1];
            zArr23[i] = aD();
            zArr = zArr23;
        }
        dtsr.dA(length, zArr, new emyl() { // from class: bsld
            @Override // defpackage.emyl
            public final Object get() {
                return "show_draft:".concat(String.valueOf(bsnr.this.getString(10)));
            }
        });
        if (!di(11)) {
            zArr2 = zArr;
            strArr3 = null;
        } else if (d) {
            strArr3 = by();
            zArr2 = zArr;
        } else {
            zArr2 = zArr;
            String[] strArr43 = new String[1];
            strArr43[i] = ah();
            strArr3 = strArr43;
        }
        dtsr.dz(length, strArr3, new emyl() { // from class: bslo
            @Override // defpackage.emyl
            public final Object get() {
                return "draft_snippet_text:".concat(String.valueOf(bsnr.this.getString(11)));
            }
        });
        if (!di(12)) {
            strArr4 = strArr3;
            strArr5 = null;
        } else if (d) {
            strArr5 = bz();
            strArr4 = strArr3;
        } else {
            strArr4 = strArr3;
            String[] strArr44 = new String[1];
            strArr44[i] = ai();
            strArr5 = strArr44;
        }
        dtsr.dz(length, strArr5, new emyl() { // from class: bslz
            @Override // defpackage.emyl
            public final Object get() {
                return "draft_subject_text:".concat(String.valueOf(bsnr.this.getString(12)));
            }
        });
        if (!di(13)) {
            strArr6 = strArr5;
            uriArr2 = null;
        } else if (d) {
            uriArr2 = aZ();
            strArr6 = strArr5;
        } else {
            strArr6 = strArr5;
            Uri[] uriArr6 = new Uri[1];
            uriArr6[i] = g();
            uriArr2 = uriArr6;
        }
        dtsr.dz(length, uriArr2, new emyl() { // from class: bsmk
            @Override // defpackage.emyl
            public final Object get() {
                return "draft_preview_uri:".concat(String.valueOf(bsnr.this.getString(13)));
            }
        });
        if (!di(14)) {
            uriArr3 = uriArr2;
            strArr7 = null;
        } else if (d) {
            strArr7 = bx();
            uriArr3 = uriArr2;
        } else {
            uriArr3 = uriArr2;
            String[] strArr45 = new String[1];
            strArr45[i] = ag();
            strArr7 = strArr45;
        }
        dtsr.dz(length, strArr7, new emyl() { // from class: bsmv
            @Override // defpackage.emyl
            public final Object get() {
                return "draft_preview_content_type:".concat(String.valueOf(bsnr.this.getString(14)));
            }
        });
        if (!di(15)) {
            strArr8 = strArr7;
            iArr = null;
        } else if (d) {
            iArr = aH();
            strArr8 = strArr7;
        } else {
            strArr8 = strArr7;
            int[] iArr19 = new int[1];
            iArr19[i] = y();
            iArr = iArr19;
        }
        dtsr.dx(length, iArr, new emyl() { // from class: bsng
            @Override // defpackage.emyl
            public final Object get() {
                return "etouffee_default:".concat(String.valueOf(bsnr.this.getString(15)));
            }
        });
        if (!di(16)) {
            iArr2 = iArr;
            byytVarArr = null;
        } else if (d) {
            byytVarArr = bj();
            iArr2 = iArr;
        } else {
            iArr2 = iArr;
            byyt[] byytVarArr3 = new byyt[1];
            byytVarArr3[i] = j();
            byytVarArr = byytVarArr3;
        }
        dtsr.dz(length, byytVarArr, new emyl() { // from class: bsno
            @Override // defpackage.emyl
            public final Object get() {
                return "archive_status:".concat(String.valueOf(bsnr.this.getString(16)));
            }
        });
        if (!di(17)) {
            byytVarArr2 = byytVarArr;
            jArr2 = null;
        } else if (d) {
            jArr2 = aY();
            byytVarArr2 = byytVarArr;
        } else {
            byytVarArr2 = byytVarArr;
            long[] jArr22 = new long[1];
            jArr22[i] = N();
            jArr2 = jArr22;
        }
        dtsr.dy(length, jArr2, new emyl() { // from class: bsnp
            @Override // defpackage.emyl
            public final Object get() {
                return "sort_timestamp:".concat(String.valueOf(bsnr.this.getString(17)));
            }
        });
        if (!di(18)) {
            jArr3 = jArr2;
            jArr4 = null;
        } else if (d) {
            jArr4 = aT();
            jArr3 = jArr2;
        } else {
            jArr3 = jArr2;
            long[] jArr23 = new long[1];
            jArr23[i] = J();
            jArr4 = jArr23;
        }
        dtsr.dy(length, jArr4, new emyl() { // from class: bsnq
            @Override // defpackage.emyl
            public final Object get() {
                return "last_read_timestamp:".concat(String.valueOf(bsnr.this.getString(18)));
            }
        });
        if (!di(19)) {
            jArr5 = jArr4;
            strArr9 = null;
        } else if (d) {
            strArr9 = bA();
            jArr5 = jArr4;
        } else {
            jArr5 = jArr4;
            String[] strArr46 = new String[1];
            strArr46[i] = aj();
            strArr9 = strArr46;
        }
        dtsr.dz(length, strArr9, new emyl() { // from class: bskt
            @Override // defpackage.emyl
            public final Object get() {
                return "icon:".concat(String.valueOf(bsnr.this.getString(19)));
            }
        });
        if (!di(20)) {
            strArr10 = strArr9;
            jArr6 = null;
        } else if (d) {
            jArr6 = aV();
            strArr10 = strArr9;
        } else {
            strArr10 = strArr9;
            long[] jArr24 = new long[1];
            jArr24[i] = L();
            jArr6 = jArr24;
        }
        dtsr.dy(length, jArr6, new emyl() { // from class: bskv
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_contact_id:".concat(String.valueOf(bsnr.this.getString(20)));
            }
        });
        if (!di(21)) {
            jArr7 = jArr6;
            jArr8 = null;
        } else if (d) {
            jArr8 = aU();
            jArr7 = jArr6;
        } else {
            jArr7 = jArr6;
            long[] jArr25 = new long[1];
            jArr25[i] = K();
            jArr8 = jArr25;
        }
        dtsr.dy(length, jArr8, new emyl() { // from class: bskw
            @Override // defpackage.emyl
            public final Object get() {
                return "normalized_participant_contact_id:".concat(String.valueOf(bsnr.this.getString(21)));
            }
        });
        if (!di(22)) {
            jArr9 = jArr8;
            strArr11 = null;
        } else if (d) {
            strArr11 = bJ();
            jArr9 = jArr8;
        } else {
            jArr9 = jArr8;
            String[] strArr47 = new String[1];
            strArr47[i] = s();
            strArr11 = strArr47;
        }
        dtsr.dz(length, strArr11, new emyl() { // from class: bskx
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_lookup_key:".concat(String.valueOf(bsnr.this.getString(22)));
            }
        });
        if (!di(23)) {
            strArr12 = strArr11;
            strArr13 = null;
        } else if (d) {
            strArr13 = bE();
            strArr12 = strArr11;
        } else {
            strArr12 = strArr11;
            String[] strArr48 = new String[1];
            strArr48[i] = am();
            strArr13 = strArr48;
        }
        dtsr.dz(length, strArr13, new emyl() { // from class: bsky
            @Override // defpackage.emyl
            public final Object get() {
                return "normalized_participant_lookup_key:".concat(String.valueOf(bsnr.this.getString(23)));
            }
        });
        if (!di(24)) {
            strArr14 = strArr13;
            strArr15 = null;
        } else if (d) {
            strArr15 = bK();
            strArr14 = strArr13;
        } else {
            strArr14 = strArr13;
            String[] strArr49 = new String[1];
            strArr49[i] = t();
            strArr15 = strArr49;
        }
        dtsr.dz(length, strArr15, new emyl() { // from class: bskz
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_normalized_destination:".concat(String.valueOf(bsnr.this.getString(24)));
            }
        });
        if (!di(25)) {
            strArr16 = strArr15;
            strArr17 = null;
        } else if (d) {
            strArr17 = bG();
            strArr16 = strArr15;
        } else {
            strArr16 = strArr15;
            String[] strArr50 = new String[1];
            strArr50[i] = an();
            strArr17 = strArr50;
        }
        dtsr.dz(length, strArr17, new emyl() { // from class: bsla
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_comparable_destination:".concat(String.valueOf(bsnr.this.getString(25)));
            }
        });
        if (!di(26)) {
            strArr18 = strArr17;
            strArr19 = null;
        } else if (d) {
            strArr19 = bw();
            strArr18 = strArr17;
        } else {
            strArr18 = strArr17;
            String[] strArr51 = new String[1];
            strArr51[i] = af();
            strArr19 = strArr51;
        }
        dtsr.dz(length, strArr19, new emyl() { // from class: bslb
            @Override // defpackage.emyl
            public final Object get() {
                return "current_self_id:".concat(String.valueOf(bsnr.this.getString(26)));
            }
        });
        if (!di(27)) {
            strArr20 = strArr19;
            azsuVarArr = null;
        } else if (d) {
            azsuVarArr = be();
            strArr20 = strArr19;
        } else {
            strArr20 = strArr19;
            azsu[] azsuVarArr3 = new azsu[1];
            azsuVarArr3[i] = S();
            azsuVarArr = azsuVarArr3;
        }
        dtsr.dz(length, azsuVarArr, new emyl() { // from class: bslc
            @Override // defpackage.emyl
            public final Object get() {
                return "current_my_identity_foreign_key:".concat(String.valueOf(bsnr.this.getString(27)));
            }
        });
        if (!di(28)) {
            azsuVarArr2 = azsuVarArr;
            azcrVarArr = null;
        } else if (d) {
            azcrVarArr = bd();
            azsuVarArr2 = azsuVarArr;
        } else {
            azsuVarArr2 = azsuVarArr;
            azcr[] azcrVarArr3 = new azcr[1];
            azcrVarArr3[i] = R();
            azcrVarArr = azcrVarArr3;
        }
        dtsr.dz(length, azcrVarArr, new emyl() { // from class: bsle
            @Override // defpackage.emyl
            public final Object get() {
                return "destination_token:".concat(String.valueOf(bsnr.this.getString(28)));
            }
        });
        if (!di(29)) {
            azcrVarArr2 = azcrVarArr;
            iArr3 = null;
        } else if (d) {
            iArr3 = aL();
            azcrVarArr2 = azcrVarArr;
        } else {
            azcrVarArr2 = azcrVarArr;
            int[] iArr20 = new int[1];
            iArr20[i] = B();
            iArr3 = iArr20;
        }
        dtsr.dx(length, iArr3, new emyl() { // from class: bslf
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_count:".concat(String.valueOf(bsnr.this.getString(29)));
            }
        });
        if (!di(30)) {
            iArr4 = iArr3;
            zArr3 = null;
        } else if (d) {
            zArr3 = bZ();
            iArr4 = iArr3;
        } else {
            iArr4 = iArr3;
            boolean[] zArr24 = new boolean[1];
            zArr24[i] = w();
            zArr3 = zArr24;
        }
        dtsr.dA(length, zArr3, new emyl() { // from class: bslh
            @Override // defpackage.emyl
            public final Object get() {
                return "notification_enabled:".concat(String.valueOf(bsnr.this.getString(30)));
            }
        });
        if (!di(31)) {
            zArr4 = zArr3;
            strArr21 = null;
        } else if (d) {
            strArr21 = bF();
            zArr4 = zArr3;
        } else {
            zArr4 = zArr3;
            String[] strArr52 = new String[1];
            strArr52[i] = r();
            strArr21 = strArr52;
        }
        dtsr.dz(length, strArr21, new emyl() { // from class: bsli
            @Override // defpackage.emyl
            public final Object get() {
                return "notification_sound_uri:".concat(String.valueOf(bsnr.this.getString(31)));
            }
        });
        if (!di(32)) {
            strArr22 = strArr21;
            zArr5 = null;
        } else if (d) {
            zArr5 = ca();
            strArr22 = strArr21;
        } else {
            strArr22 = strArr21;
            boolean[] zArr25 = new boolean[1];
            zArr25[i] = x();
            zArr5 = zArr25;
        }
        dtsr.dA(length, zArr5, new emyl() { // from class: bslj
            @Override // defpackage.emyl
            public final Object get() {
                return "notification_vibration:".concat(String.valueOf(bsnr.this.getString(32)));
            }
        });
        if (!di(33)) {
            zArr6 = zArr5;
            zArr7 = null;
        } else if (d) {
            zArr7 = bW();
            zArr6 = zArr5;
        } else {
            zArr6 = zArr5;
            boolean[] zArr26 = new boolean[1];
            zArr26[i] = az();
            zArr7 = zArr26;
        }
        dtsr.dA(length, zArr7, new emyl() { // from class: bslk
            @Override // defpackage.emyl
            public final Object get() {
                return "include_email_addr:".concat(String.valueOf(bsnr.this.getString(33)));
            }
        });
        if (!di(34)) {
            zArr8 = zArr7;
            strArr23 = null;
        } else if (d) {
            strArr23 = bP();
            zArr8 = zArr7;
        } else {
            zArr8 = zArr7;
            String[] strArr53 = new String[1];
            strArr53[i] = at();
            strArr23 = strArr53;
        }
        dtsr.dz(length, strArr23, new emyl() { // from class: bsll
            @Override // defpackage.emyl
            public final Object get() {
                return "sms_service_center:".concat(String.valueOf(bsnr.this.getString(34)));
            }
        });
        if (!di(35)) {
            strArr24 = strArr23;
            strArr25 = null;
        } else if (d) {
            strArr25 = bI();
            strArr24 = strArr23;
        } else {
            strArr24 = strArr23;
            String[] strArr54 = new String[1];
            strArr54[i] = ap();
            strArr25 = strArr54;
        }
        dtsr.dz(length, strArr25, new emyl() { // from class: bslm
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_id_list:".concat(String.valueOf(bsnr.this.getString(35)));
            }
        });
        if (!di(36)) {
            strArr26 = strArr25;
            strArr27 = null;
        } else if (d) {
            strArr27 = bD();
            strArr26 = strArr25;
        } else {
            strArr26 = strArr25;
            String[] strArr55 = new String[1];
            strArr55[i] = al();
            strArr27 = strArr55;
        }
        dtsr.dz(length, strArr27, new emyl() { // from class: bsln
            @Override // defpackage.emyl
            public final Object get() {
                return "normalized_participant_id_list:".concat(String.valueOf(bsnr.this.getString(36)));
            }
        });
        if (!di(37)) {
            strArr28 = strArr27;
            iArr5 = null;
        } else if (d) {
            iArr5 = aN();
            strArr28 = strArr27;
        } else {
            strArr28 = strArr27;
            int[] iArr21 = new int[1];
            iArr21[i] = D();
            iArr5 = iArr21;
        }
        dtsr.dx(length, iArr5, new emyl() { // from class: bslp
            @Override // defpackage.emyl
            public final Object get() {
                return "source_type:".concat(String.valueOf(bsnr.this.getString(37)));
            }
        });
        if (!di(38)) {
            iArr6 = iArr5;
            jArr10 = null;
        } else if (d) {
            jArr10 = aW();
            iArr6 = iArr5;
        } else {
            iArr6 = iArr5;
            long[] jArr26 = new long[1];
            jArr26[i] = f();
            jArr10 = jArr26;
        }
        dtsr.dy(length, jArr10, new emyl() { // from class: bslq
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_session_id:".concat(String.valueOf(bsnr.this.getString(38)));
            }
        });
        if (!di(39)) {
            jArr11 = jArr10;
            iArr7 = null;
        } else if (d) {
            iArr7 = aI();
            jArr11 = jArr10;
        } else {
            jArr11 = jArr10;
            int[] iArr22 = new int[1];
            iArr22[i] = e();
            iArr7 = iArr22;
        }
        dtsr.dx(length, iArr7, new emyl() { // from class: bslr
            @Override // defpackage.emyl
            public final Object get() {
                return "join_state:".concat(String.valueOf(bsnr.this.getString(39)));
            }
        });
        if (!di(40)) {
            iArr8 = iArr7;
            iArr9 = null;
        } else if (d) {
            iArr9 = aG();
            iArr8 = iArr7;
        } else {
            iArr8 = iArr7;
            int[] iArr23 = new int[1];
            iArr23[i] = c();
            iArr9 = iArr23;
        }
        dtsr.dx(length, iArr9, new emyl() { // from class: bslt
            @Override // defpackage.emyl
            public final Object get() {
                return "conv_type:".concat(String.valueOf(bsnr.this.getString(40)));
            }
        });
        if (!di(41)) {
            iArr10 = iArr9;
            iArr11 = null;
        } else if (d) {
            iArr11 = aM();
            iArr10 = iArr9;
        } else {
            iArr10 = iArr9;
            int[] iArr24 = new int[1];
            iArr24[i] = C();
            iArr11 = iArr24;
        }
        dtsr.dx(length, iArr11, new emyl() { // from class: bslu
            @Override // defpackage.emyl
            public final Object get() {
                return "send_mode:".concat(String.valueOf(bsnr.this.getString(41)));
            }
        });
        if (!di(42)) {
            iArr12 = iArr11;
            zArr9 = null;
        } else if (d) {
            zArr9 = bX();
            iArr12 = iArr11;
        } else {
            iArr12 = iArr11;
            boolean[] zArr27 = new boolean[1];
            zArr27[i] = aA();
            zArr9 = zArr27;
        }
        dtsr.dA(length, zArr9, new emyl() { // from class: bslv
            @Override // defpackage.emyl
            public final Object get() {
                return "IS_ENTERPRISE:".concat(String.valueOf(bsnr.this.getString(42)));
            }
        });
        if (!di(43)) {
            zArr10 = zArr9;
            zArr11 = null;
        } else if (d) {
            zArr11 = bV();
            zArr10 = zArr9;
        } else {
            zArr10 = zArr9;
            boolean[] zArr28 = new boolean[1];
            zArr28[i] = ay();
            zArr11 = zArr28;
        }
        dtsr.dA(length, zArr11, new emyl() { // from class: bslw
            @Override // defpackage.emyl
            public final Object get() {
                return "has_ea2p_bot_recipient:".concat(String.valueOf(bsnr.this.getString(43)));
            }
        });
        if (!di(44)) {
            zArr12 = zArr11;
            jArr12 = null;
        } else if (d) {
            jArr12 = aR();
            zArr12 = zArr11;
        } else {
            zArr12 = zArr11;
            long[] jArr27 = new long[1];
            jArr27[i] = H();
            jArr12 = jArr27;
        }
        dtsr.dy(length, jArr12, new emyl() { // from class: bslx
            @Override // defpackage.emyl
            public final Object get() {
                return "last_interactive_event_timestamp:".concat(String.valueOf(bsnr.this.getString(44)));
            }
        });
        if (!di(45)) {
            jArr13 = jArr12;
            strArr29 = null;
        } else if (d) {
            strArr29 = bH();
            jArr13 = jArr12;
        } else {
            jArr13 = jArr12;
            String[] strArr56 = new String[1];
            strArr56[i] = ao();
            strArr29 = strArr56;
        }
        dtsr.dz(length, strArr29, new emyl() { // from class: bsly
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_display_destination:".concat(String.valueOf(bsnr.this.getString(45)));
            }
        });
        if (!di(46)) {
            strArr30 = strArr29;
            strArr31 = null;
        } else if (d) {
            strArr31 = bC();
            strArr30 = strArr29;
        } else {
            strArr30 = strArr29;
            String[] strArr57 = new String[1];
            strArr57[i] = ak();
            strArr31 = strArr57;
        }
        dtsr.dz(length, strArr31, new emyl() { // from class: bsma
            @Override // defpackage.emyl
            public final Object get() {
                return "normalized_participant_display_destination:".concat(String.valueOf(bsnr.this.getString(46)));
            }
        });
        if (!di(47)) {
            strArr32 = strArr31;
            zArr13 = null;
        } else if (d) {
            zArr13 = cd();
            strArr32 = strArr31;
        } else {
            strArr32 = strArr31;
            boolean[] zArr29 = new boolean[1];
            zArr29[i] = aE();
            zArr13 = zArr29;
        }
        dtsr.dA(length, zArr13, new emyl() { // from class: bsmb
            @Override // defpackage.emyl
            public final Object get() {
                return "spam_warning_dismiss_status:".concat(String.valueOf(bsnr.this.getString(47)));
            }
        });
        if (!di(48)) {
            zArr14 = zArr13;
            iArr13 = null;
        } else if (d) {
            iArr13 = aK();
            zArr14 = zArr13;
        } else {
            zArr14 = zArr13;
            int[] iArr25 = new int[1];
            iArr25[i] = A();
            iArr13 = iArr25;
        }
        dtsr.dx(length, iArr13, new emyl() { // from class: bsmc
            @Override // defpackage.emyl
            public final Object get() {
                return "open_count:".concat(String.valueOf(bsnr.this.getString(48)));
            }
        });
        if (!di(49)) {
            iArr14 = iArr13;
            jArr14 = null;
        } else if (d) {
            jArr14 = aS();
            iArr14 = iArr13;
        } else {
            iArr14 = iArr13;
            long[] jArr28 = new long[1];
            jArr28[i] = I();
            jArr14 = jArr28;
        }
        dtsr.dy(length, jArr14, new emyl() { // from class: bsmd
            @Override // defpackage.emyl
            public final Object get() {
                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(bsnr.this.getString(49)));
            }
        });
        if (!di(50)) {
            jArr15 = jArr14;
            jArr16 = null;
        } else if (d) {
            jArr16 = aQ();
            jArr15 = jArr14;
        } else {
            jArr15 = jArr14;
            long[] jArr29 = new long[1];
            jArr29[i] = G();
            jArr16 = jArr29;
        }
        dtsr.dy(length, jArr16, new emyl() { // from class: bsmf
            @Override // defpackage.emyl
            public final Object get() {
                return "delete_timestamp:".concat(String.valueOf(bsnr.this.getString(50)));
            }
        });
        if (!di(51)) {
            jArr17 = jArr16;
            strArr33 = null;
        } else if (d) {
            strArr33 = bv();
            jArr17 = jArr16;
        } else {
            jArr17 = jArr16;
            String[] strArr58 = new String[1];
            strArr58[i] = ae();
            strArr33 = strArr58;
        }
        dtsr.dz(length, strArr33, new emyl() { // from class: bsmg
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_id:".concat(String.valueOf(bsnr.this.getString(51)));
            }
        });
        if (!di(52)) {
            strArr34 = strArr33;
            strArr35 = null;
        } else if (d) {
            strArr35 = bN();
            strArr34 = strArr33;
        } else {
            strArr34 = strArr33;
            String[] strArr59 = new String[1];
            strArr59[i] = u();
            strArr35 = strArr59;
        }
        dtsr.dz(length, strArr35, new emyl() { // from class: bsmh
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_id:".concat(String.valueOf(bsnr.this.getString(52)));
            }
        });
        if (!di(53)) {
            strArr36 = strArr35;
            strArr37 = null;
        } else if (d) {
            strArr37 = bM();
            strArr36 = strArr35;
        } else {
            strArr36 = strArr35;
            String[] strArr60 = new String[1];
            strArr60[i] = ar();
            strArr37 = strArr60;
        }
        dtsr.dz(length, strArr37, new emyl() { // from class: bsmi
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_conference_uri:".concat(String.valueOf(bsnr.this.getString(53)));
            }
        });
        if (!di(54)) {
            strArr38 = strArr37;
            bArr = null;
        } else if (d) {
            bArr = ce();
            strArr38 = strArr37;
        } else {
            strArr38 = strArr37;
            byte[][] bArr3 = new byte[1][];
            bArr3[i] = aF();
            bArr = bArr3;
        }
        dtsr.dz(length, bArr, new emyl() { // from class: bsmj
            @Override // defpackage.emyl
            public final Object get() {
                return "tachygram_group_routing_info_token:".concat(String.valueOf(bsnr.this.getString(54)));
            }
        });
        if (!di(55)) {
            bArr2 = bArr;
            jArr18 = null;
        } else if (d) {
            jArr18 = aP();
            bArr2 = bArr;
        } else {
            bArr2 = bArr;
            long[] jArr30 = new long[1];
            jArr30[i] = F();
            jArr18 = jArr30;
        }
        dtsr.dy(length, jArr18, new emyl() { // from class: bsml
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(bsnr.this.getString(55)));
            }
        });
        if (!di(56)) {
            jArr19 = jArr18;
            jArr20 = null;
        } else if (d) {
            jArr20 = aX();
            jArr19 = jArr18;
        } else {
            jArr19 = jArr18;
            long[] jArr31 = new long[1];
            jArr31[i] = M();
            jArr20 = jArr31;
        }
        dtsr.dy(length, jArr20, new emyl() { // from class: bsmm
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(bsnr.this.getString(56)));
            }
        });
        if (!di(57)) {
            jArr21 = jArr20;
            zArr15 = null;
        } else if (d) {
            zArr15 = cb();
            jArr21 = jArr20;
        } else {
            jArr21 = jArr20;
            boolean[] zArr30 = new boolean[1];
            zArr30[i] = aC();
            zArr15 = zArr30;
        }
        dtsr.dA(length, zArr15, new emyl() { // from class: bsmn
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_session_allows_revocation:".concat(String.valueOf(bsnr.this.getString(57)));
            }
        });
        if (!di(58)) {
            zArr16 = zArr15;
            cknhVarArr = null;
        } else if (d) {
            cknhVarArr = bo();
            zArr16 = zArr15;
        } else {
            zArr16 = zArr15;
            cknh[] cknhVarArr3 = new cknh[1];
            cknhVarArr3[i] = Z();
            cknhVarArr = cknhVarArr3;
        }
        dtsr.dz(length, cknhVarArr, new emyl() { // from class: bsmo
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_capabilities:".concat(String.valueOf(bsnr.this.getString(58)));
            }
        });
        if (!di(59)) {
            cknhVarArr2 = cknhVarArr;
            zArr17 = null;
        } else if (d) {
            zArr17 = bT();
            cknhVarArr2 = cknhVarArr;
        } else {
            cknhVarArr2 = cknhVarArr;
            boolean[] zArr31 = new boolean[1];
            zArr31[i] = v();
            zArr17 = zArr31;
        }
        dtsr.dA(length, zArr17, new emyl() { // from class: bsmp
            @Override // defpackage.emyl
            public final Object get() {
                return "awaiting_reverse_sync:".concat(String.valueOf(bsnr.this.getString(59)));
            }
        });
        if (!di(60)) {
            zArr18 = zArr17;
            conversationIdTypeArr = null;
        } else if (d) {
            conversationIdTypeArr = bf();
            zArr18 = zArr17;
        } else {
            zArr18 = zArr17;
            ConversationIdType[] conversationIdTypeArr5 = new ConversationIdType[1];
            conversationIdTypeArr5[i] = T();
            conversationIdTypeArr = conversationIdTypeArr5;
        }
        dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bsmr
            @Override // defpackage.emyl
            public final Object get() {
                return "duplicate_of:".concat(String.valueOf(bsnr.this.getString(60)));
            }
        });
        if (!di(61)) {
            conversationIdTypeArr2 = conversationIdTypeArr;
            conversationIdTypeArr3 = null;
        } else if (d) {
            conversationIdTypeArr3 = bg();
            conversationIdTypeArr2 = conversationIdTypeArr;
        } else {
            conversationIdTypeArr2 = conversationIdTypeArr;
            ConversationIdType[] conversationIdTypeArr6 = new ConversationIdType[1];
            conversationIdTypeArr6[i] = U();
            conversationIdTypeArr3 = conversationIdTypeArr6;
        }
        dtsr.dz(length, conversationIdTypeArr3, new emyl() { // from class: bsms
            @Override // defpackage.emyl
            public final Object get() {
                return "new_duplicate_of:".concat(String.valueOf(bsnr.this.getString(61)));
            }
        });
        if (!di(62)) {
            conversationIdTypeArr4 = conversationIdTypeArr3;
            ayhdVarArr = null;
        } else if (d) {
            ayhdVarArr = bc();
            conversationIdTypeArr4 = conversationIdTypeArr3;
        } else {
            conversationIdTypeArr4 = conversationIdTypeArr3;
            ayhd[] ayhdVarArr3 = new ayhd[1];
            ayhdVarArr3[i] = Q();
            ayhdVarArr = ayhdVarArr3;
        }
        dtsr.dz(length, ayhdVarArr, new emyl() { // from class: bsmt
            @Override // defpackage.emyl
            public final Object get() {
                return "error_state:".concat(String.valueOf(bsnr.this.getString(62)));
            }
        });
        if (!di(63)) {
            ayhdVarArr2 = ayhdVarArr;
            csggVarArr = null;
        } else if (d) {
            csggVarArr = br();
            ayhdVarArr2 = ayhdVarArr;
        } else {
            ayhdVarArr2 = ayhdVarArr;
            csgg[] csggVarArr3 = new csgg[1];
            csggVarArr3[i] = l();
            csggVarArr = csggVarArr3;
        }
        dtsr.dz(length, csggVarArr, new emyl() { // from class: bsmu
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_life_cycle:".concat(String.valueOf(bsnr.this.getString(63)));
            }
        });
        if (!di(64)) {
            csggVarArr2 = csggVarArr;
            strArr39 = null;
        } else if (d) {
            strArr39 = bO();
            csggVarArr2 = csggVarArr;
        } else {
            csggVarArr2 = csggVarArr;
            String[] strArr61 = new String[1];
            strArr61[i] = as();
            strArr39 = strArr61;
        }
        dtsr.dz(length, strArr39, new emyl() { // from class: bsmw
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_self_msisdn:".concat(String.valueOf(bsnr.this.getString(64)));
            }
        });
        if (!di(65)) {
            strArr40 = strArr39;
            optionalArr = null;
        } else if (d) {
            optionalArr = bt();
            strArr40 = strArr39;
        } else {
            strArr40 = strArr39;
            Optional[] optionalArr5 = new Optional[1];
            optionalArr5[i] = ac();
            optionalArr = optionalArr5;
        }
        dtsr.dz(length, optionalArr, new emyl() { // from class: bsmx
            @Override // defpackage.emyl
            public final Object get() {
                return "recipient_offline_timestamp_ms:".concat(String.valueOf(bsnr.this.getString(65)));
            }
        });
        if (!di(66)) {
            optionalArr2 = optionalArr;
            optionalArr3 = null;
        } else if (d) {
            optionalArr3 = bs();
            optionalArr2 = optionalArr;
        } else {
            optionalArr2 = optionalArr;
            Optional[] optionalArr6 = new Optional[1];
            optionalArr6[i] = ab();
            optionalArr3 = optionalArr6;
        }
        dtsr.dz(length, optionalArr3, new emyl() { // from class: bsmy
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(bsnr.this.getString(66)));
            }
        });
        if (!di(67)) {
            optionalArr4 = optionalArr3;
            zArr19 = null;
        } else if (d) {
            zArr19 = bU();
            optionalArr4 = optionalArr3;
        } else {
            optionalArr4 = optionalArr3;
            boolean[] zArr32 = new boolean[1];
            zArr32[i] = ax();
            zArr19 = zArr32;
        }
        dtsr.dA(length, zArr19, new emyl() { // from class: bsmz
            @Override // defpackage.emyl
            public final Object get() {
                return "has_been_e2ee:".concat(String.valueOf(bsnr.this.getString(67)));
            }
        });
        if (!di(68)) {
            zArr20 = zArr19;
            zArr21 = null;
        } else if (d) {
            zArr21 = bY();
            zArr20 = zArr19;
        } else {
            zArr20 = zArr19;
            boolean[] zArr33 = new boolean[1];
            zArr33[i] = aB();
            zArr21 = zArr33;
        }
        dtsr.dA(length, zArr21, new emyl() { // from class: bsna
            @Override // defpackage.emyl
            public final Object get() {
                return "marked_as_unread:".concat(String.valueOf(bsnr.this.getString(68)));
            }
        });
        if (!di(69)) {
            zArr22 = zArr21;
            ckkzVarArr = null;
        } else if (d) {
            ckkzVarArr = bn();
            zArr22 = zArr21;
        } else {
            zArr22 = zArr21;
            ckkz[] ckkzVarArr3 = new ckkz[1];
            ckkzVarArr3[i] = Y();
            ckkzVarArr = ckkzVarArr3;
        }
        dtsr.dz(length, ckkzVarArr, new emyl() { // from class: bsnb
            @Override // defpackage.emyl
            public final Object get() {
                return "custom_theme:".concat(String.valueOf(bsnr.this.getString(69)));
            }
        });
        if (!di(70)) {
            ckkzVarArr2 = ckkzVarArr;
            ckteVarArr = null;
        } else if (d) {
            ckteVarArr = bp();
            ckkzVarArr2 = ckkzVarArr;
        } else {
            ckkzVarArr2 = ckkzVarArr;
            ckte[] ckteVarArr3 = new ckte[1];
            ckteVarArr3[i] = aa();
            ckteVarArr = ckteVarArr3;
        }
        dtsr.dz(length, ckteVarArr, new emyl() { // from class: bsnd
            @Override // defpackage.emyl
            public final Object get() {
                return "mms_group_upgrade_status:".concat(String.valueOf(bsnr.this.getString(70)));
            }
        });
        if (!di(71)) {
            ckteVarArr2 = ckteVarArr;
            iArr15 = null;
        } else if (d) {
            iArr15 = aJ();
            ckteVarArr2 = ckteVarArr;
        } else {
            ckteVarArr2 = ckteVarArr;
            int[] iArr26 = new int[1];
            iArr26[i] = z();
            iArr15 = iArr26;
        }
        dtsr.dx(length, iArr15, new emyl() { // from class: bsne
            @Override // defpackage.emyl
            public final Object get() {
                return "mms_group_upgrade_retries:".concat(String.valueOf(bsnr.this.getString(71)));
            }
        });
        if (!di(72)) {
            iArr16 = iArr15;
            cfmhVarArr = null;
        } else if (d) {
            cfmhVarArr = bm();
            iArr16 = iArr15;
        } else {
            iArr16 = iArr15;
            cfmh[] cfmhVarArr3 = new cfmh[1];
            cfmhVarArr3[i] = X();
            cfmhVarArr = cfmhVarArr3;
        }
        dtsr.dz(length, cfmhVarArr, new emyl() { // from class: bsnf
            @Override // defpackage.emyl
            public final Object get() {
                return "encryption_protocol:".concat(String.valueOf(bsnr.this.getString(72)));
            }
        });
        if (!di(73)) {
            cfmhVarArr2 = cfmhVarArr;
            cfmfVarArr = null;
        } else if (d) {
            cfmfVarArr = bl();
            cfmhVarArr2 = cfmhVarArr;
        } else {
            cfmhVarArr2 = cfmhVarArr;
            cfmf[] cfmfVarArr3 = new cfmf[1];
            cfmfVarArr3[i] = W();
            cfmfVarArr = cfmfVarArr3;
        }
        dtsr.dz(length, cfmfVarArr, new emyl() { // from class: bsnh
            @Override // defpackage.emyl
            public final Object get() {
                return "encryption_id:".concat(String.valueOf(bsnr.this.getString(73)));
            }
        });
        if (!di(74)) {
            cfmfVarArr2 = cfmfVarArr;
            strArr41 = null;
        } else if (d) {
            strArr41 = bu();
            cfmfVarArr2 = cfmfVarArr;
        } else {
            cfmfVarArr2 = cfmfVarArr;
            String[] strArr62 = new String[1];
            strArr62[i] = ad();
            strArr41 = strArr62;
        }
        dtsr.dz(length, strArr41, new emyl() { // from class: bsni
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_correlation_id:".concat(String.valueOf(bsnr.this.getString(74)));
            }
        });
        if (!di(75)) {
            strArr42 = strArr41;
            uriArr4 = null;
        } else if (d) {
            uriArr4 = bb();
            strArr42 = strArr41;
        } else {
            strArr42 = strArr41;
            Uri[] uriArr7 = new Uri[1];
            uriArr7[i] = P();
            uriArr4 = uriArr7;
        }
        dtsr.dz(length, uriArr4, new emyl() { // from class: bsnj
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_icon_url:".concat(String.valueOf(bsnr.this.getString(75)));
            }
        });
        if (!di(76)) {
            iArr17 = null;
        } else if (d) {
            iArr17 = aO();
        } else {
            iArr17 = new int[1];
            iArr17[i] = E();
        }
        dtsr.dx(length, iArr17, new emyl() { // from class: bsnk
            @Override // defpackage.emyl
            public final Object get() {
                return "unread_count:".concat(String.valueOf(bsnr.this.getString(76)));
            }
        });
        engr engrVar = new engr();
        int i3 = i;
        while (i3 < length) {
            long j = jArr[i3];
            if (j > 0) {
                i2 = i3;
                if (!hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(jArr[i2]));
                    bsel d2 = bsom.d();
                    d2.aD();
                    long j2 = jArr[i2];
                    uriArr5 = uriArr4;
                    if (bh != null) {
                        d2.B(bh[i2]);
                    }
                    if (bq != null) {
                        d2.as(bq[i2]);
                    }
                    if (bB != null) {
                        d2.M(bB[i2]);
                    }
                    if (bk != null) {
                        d2.N(bk[i2]);
                    }
                    if (bS != null) {
                        d2.ay(bS[i2]);
                    }
                    if (bi != null) {
                        d2.I(bi[i2]);
                    }
                    if (bQ != null) {
                        d2.at(bQ[i2]);
                    }
                    if (strArr != null) {
                        d2.ax(strArr[i2]);
                    }
                    if (uriArr != null) {
                        d2.ae(uriArr[i2]);
                    }
                    if (strArr2 != null) {
                        d2.ad(strArr2[i2]);
                    }
                    if (zArr2 != null) {
                        d2.aq(zArr2[i2]);
                    }
                    if (strArr4 != null) {
                        d2.s(strArr4[i2]);
                    }
                    if (strArr6 != null) {
                        d2.t(strArr6[i2]);
                    }
                    if (uriArr3 != null) {
                        d2.r(uriArr3[i2]);
                    }
                    if (strArr8 != null) {
                        d2.q(strArr8[i2]);
                    }
                    if (iArr2 != null) {
                        d2.p(iArr2[i2]);
                    }
                    if (byytVarArr2 != null) {
                        d2.c(byytVarArr2[i2]);
                    }
                    iArr18 = iArr17;
                    if (jArr3 != null) {
                        d2.au(jArr3[i2]);
                    }
                    if (jArr5 != null) {
                        d2.H(jArr5[i2]);
                    }
                    if (strArr10 != null) {
                        d2.A(strArr10[i2]);
                    }
                    if (jArr7 != null) {
                        d2.X(jArr7[i2]);
                    }
                    if (jArr9 != null) {
                        d2.O(jArr9[i2]);
                    }
                    if (strArr12 != null) {
                        d2.ab(strArr12[i2]);
                    }
                    if (strArr14 != null) {
                        d2.R(strArr14[i2]);
                    }
                    if (strArr16 != null) {
                        d2.ac(strArr16[i2]);
                    }
                    if (strArr18 != null) {
                        d2.W(strArr18[i2]);
                    }
                    if (strArr20 != null) {
                        d2.k(strArr20[i2]);
                    }
                    if (azsuVarArr2 != null) {
                        d2.j(azsuVarArr2[i2]);
                    }
                    if (azcrVarArr2 != null) {
                        d2.o(azcrVarArr2[i2]);
                    }
                    if (iArr4 != null) {
                        d2.Y(iArr4[i2]);
                    }
                    if (zArr4 != null) {
                        d2.S(zArr4[i2]);
                    }
                    if (strArr22 != null) {
                        d2.T(strArr22[i2]);
                    }
                    if (zArr6 != null) {
                        d2.U(zArr6[i2]);
                    }
                    if (zArr8 != null) {
                        d2.C(zArr8[i2]);
                    }
                    if (strArr24 != null) {
                        d2.ar(strArr24[i2]);
                    }
                    if (strArr26 != null) {
                        d2.aa(strArr26[i2]);
                    }
                    if (strArr28 != null) {
                        d2.Q(strArr28[i2]);
                    }
                    if (iArr6 != null) {
                        d2.av(iArr6[i2]);
                    }
                    if (jArr11 != null) {
                        d2.am(jArr11[i2]);
                    }
                    if (iArr8 != null) {
                        d2.E(iArr8[i2]);
                    }
                    if (iArr10 != null) {
                        d2.i(iArr10[i2]);
                    }
                    if (iArr12 != null) {
                        d2.ap(iArr12[i2]);
                    }
                    if (zArr10 != null) {
                        d2.D(zArr10[i2]);
                    }
                    if (zArr12 != null) {
                        d2.z(zArr12[i2]);
                    }
                    if (jArr13 != null) {
                        d2.F(jArr13[i2]);
                    }
                    if (strArr30 != null) {
                        d2.Z(strArr30[i2]);
                    }
                    if (strArr32 != null) {
                        d2.P(strArr32[i2]);
                    }
                    if (zArr14 != null) {
                        d2.aw(zArr14[i2]);
                    }
                    if (iArr14 != null) {
                        d2.V(iArr14[i2]);
                    }
                    if (jArr15 != null) {
                        d2.G(jArr15[i2]);
                    }
                    if (jArr17 != null) {
                        d2.m(jArr17[i2]);
                    }
                    if (strArr34 != null) {
                        d2.f(strArr34[i2]);
                    }
                    if (strArr36 != null) {
                        d2.ai(strArr36[i2]);
                    }
                    if (strArr38 != null) {
                        d2.af(strArr38[i2]);
                    }
                    if (bArr2 != null) {
                        d2.az(bArr2[i2]);
                    }
                    if (jArr19 != null) {
                        d2.h(jArr19[i2]);
                    }
                    if (jArr21 != null) {
                        d2.an(jArr21[i2]);
                    }
                    if (zArr16 != null) {
                        d2.al(zArr16[i2]);
                    }
                    if (cknhVarArr2 != null) {
                        d2.ag(cknhVarArr2[i2]);
                    }
                    if (zArr18 != null) {
                        d2.d(zArr18[i2]);
                    }
                    if (conversationIdTypeArr2 != null) {
                        d2.n(conversationIdTypeArr2[i2]);
                    }
                    if (conversationIdTypeArr4 != null) {
                        d2.u(conversationIdTypeArr4[i2]);
                    }
                    if (ayhdVarArr2 != null) {
                        d2.x(ayhdVarArr2[i2]);
                    }
                    if (csggVarArr2 != null) {
                        d2.g(csggVarArr2[i2]);
                    }
                    if (strArr40 != null) {
                        d2.ak(strArr40[i2]);
                    }
                    if (optionalArr2 != null) {
                        d2.ao(optionalArr2[i2]);
                    }
                    if (optionalArr4 != null) {
                        d2.aj(optionalArr4[i2]);
                    }
                    if (zArr20 != null) {
                        d2.y(zArr20[i2]);
                    }
                    if (zArr22 != null) {
                        d2.J(zArr22[i2]);
                    }
                    if (ckkzVarArr2 != null) {
                        d2.l(ckkzVarArr2[i2]);
                    }
                    if (ckteVarArr2 != null) {
                        d2.L(ckteVarArr2[i2]);
                    }
                    if (iArr16 != null) {
                        d2.K(iArr16[i2]);
                    }
                    if (cfmhVarArr2 != null) {
                        d2.w(cfmhVarArr2[i2]);
                    }
                    if (cfmfVarArr2 != null) {
                        d2.v(cfmfVarArr2[i2]);
                    }
                    if (strArr42 != null) {
                        d2.e(strArr42[i2]);
                    }
                    if (uriArr5 != null) {
                        d2.ah(uriArr5[i2]);
                    }
                    if (iArr18 != null) {
                        d2.aA(iArr18[i2]);
                    }
                    engrVar.h(d2.a());
                    i3 = i2 + 1;
                    uriArr4 = uriArr5;
                    iArr17 = iArr18;
                }
            } else {
                i2 = i3;
            }
            uriArr5 = uriArr4;
            iArr18 = iArr17;
            i3 = i2 + 1;
            uriArr4 = uriArr5;
            iArr17 = iArr18;
        }
        return engrVar.g();
    }

    @Override // defpackage.bskr
    public final Uri g() {
        String string = getString(cM(13, bsom.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bskr
    public final ConversationIdType h() {
        return new ConversationIdType(getLong(cM(0, bsom.a)));
    }

    @Override // defpackage.bskr
    public final MessageIdType i() {
        return new MessageIdType(getLong(cM(5, bsom.a)));
    }

    @Override // defpackage.bskr
    public final byyt j() {
        return byyt.a(getInt(cM(16, bsom.a)));
    }

    @Override // defpackage.bskr
    public final cpxu k() {
        return cpxu.b(getLong(cM(1, bsom.a)));
    }

    @Override // defpackage.bskr
    public final csgg l() {
        csgg[] values = csgg.values();
        int i = getInt(cM(63, bsom.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.bskr
    public final engw m() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (W() != null) {
                engrVar.h(W());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.bskr
    public final engw n() {
        engr engrVar = new engr();
        while (moveToNext()) {
            h();
            engrVar.h(h());
        }
        return engrVar.g();
    }

    @Override // defpackage.bskr
    public final engw o() {
        engr engrVar = new engr();
        while (moveToNext()) {
            e();
            engrVar.h(Integer.valueOf(e()));
        }
        return engrVar.g();
    }

    @Override // defpackage.bskr
    public final engw p() {
        engr engrVar = new engr();
        while (moveToNext()) {
            k();
            engrVar.h(k());
        }
        return engrVar.g();
    }

    @Override // defpackage.bskr
    public final String q() {
        return getString(cM(2, bsom.a));
    }

    @Override // defpackage.bskr
    public final String r() {
        return getString(cM(31, bsom.a));
    }

    @Override // defpackage.bskr
    public final String s() {
        return getString(cM(22, bsom.a));
    }

    @Override // defpackage.bskr
    public final String t() {
        return getString(cM(24, bsom.a));
    }

    @Override // defpackage.bskr
    public final String u() {
        return getString(cM(52, bsom.a));
    }

    @Override // defpackage.bskr
    public final boolean v() {
        return getInt(cM(59, bsom.a)) == 1;
    }

    @Override // defpackage.bskr
    public final boolean w() {
        return getInt(cM(30, bsom.a)) == 1;
    }

    @Override // defpackage.bskr
    public final boolean x() {
        return getInt(cM(32, bsom.a)) == 1;
    }

    public final int y() {
        return getInt(cM(15, bsom.a));
    }

    public final int z() {
        return getInt(cM(71, bsom.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
