package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.CancellationSignal;
import android.util.Log;
import defpackage.dtro;
import defpackage.dtry;
import defpackage.dtsu;
import defpackage.dtyq;
import defpackage.dtyx;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtsr<C extends dtsu<C, Q, B, D, CR>, Q extends dtyq<C, Q, B, D, CR>, B extends dtyx<C, Q, B, D, CR>, D extends dtro<C, Q, B, D, CR>, CR extends dtry<CR>> extends CursorWrapper {
    static final emye a = emye.b('|');
    public static final /* synthetic */ int j = 0;
    private static final engw k;
    private static final int[] l;
    private static final long[] m;
    private static final boolean[] n;
    private static final float[] o;
    private static final double[] p;
    private static final byte[][] q;
    private static final long[] r;
    public final dtyq b;
    public final dtve c;
    protected final dtvs d;
    protected Map e;
    public String[] f;
    public dtzj[] g;
    public final Map h;
    protected final int[] i;
    private final AtomicLong s;
    private final AtomicInteger t;

    static {
        int i = engw.d;
        k = enou.a;
        l = new int[0];
        m = new long[0];
        n = new boolean[0];
        o = new float[0];
        p = new double[0];
        q = new byte[0][];
        r = new long[]{-1};
    }

    public dtsr(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, String[] strArr2, dtyo dtyoVar, dtvs dtvsVar, dtyq dtyqVar) {
        super(cursor);
        this.s = new AtomicLong(Thread.currentThread().getId());
        this.h = new HashMap();
        this.t = new AtomicInteger();
        if (cursor instanceof dtsr) {
            ((dtsr) cursor).dh();
        }
        dh();
        this.b = dtyqVar;
        int i = 0;
        boolean z = dtyqVar == null ? false : ((dtrj) dtyqVar.e).y;
        if (this.e == null) {
            this.e = new HashMap();
            int length = strArr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                this.e.put(dtyoVar.apply(strArr2[i2]), Integer.valueOf(i3));
                i2++;
                i3++;
            }
        }
        this.c = dtveVar;
        this.f = strArr;
        this.g = dtzjVarArr;
        this.i = new int[strArr2.length];
        this.d = dtvsVar;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.e.entrySet()) {
            hashMap.put(z ? dtub.h((String) entry.getKey()) : (String) entry.getKey(), (Integer) entry.getValue());
        }
        Arrays.fill(this.i, -1);
        if (z) {
            while (i < strArr.length) {
                int intValue = ((Integer) Map.EL.getOrDefault(hashMap, dtub.h(strArr[i]), -1)).intValue();
                if (intValue >= 0) {
                    this.i[intValue] = i;
                }
                i++;
            }
            return;
        }
        while (i < strArr.length) {
            String str = strArr[i];
            if (hashMap.containsKey(str)) {
                this.i[((Integer) hashMap.get(str)).intValue()] = i;
            }
            i++;
        }
    }

    private final void a() {
        Object obj;
        obj = ((dtqv) dtub.c).e.get();
        if (((Boolean) obj).booleanValue() && this.t.get() > 0) {
            throw new ConcurrentModificationException("unable to set cursor position while binding");
        }
    }

    private final void c() {
        Object obj;
        obj = ((dtqv) dtub.c).b.get();
        if (((Boolean) obj).booleanValue() && this.s.get() != Thread.currentThread().getId()) {
            throw new IllegalStateException("multi-threaded access to cursor");
        }
    }

    protected static final void dA(int i, boolean[] zArr, emyl emylVar) {
        if (zArr != null) {
            dtub.q(i, zArr.length, emylVar);
        }
    }

    protected static final long[] dB(String str) {
        return str == null ? r : ds(str);
    }

    public static final byte[][] dC(String str) {
        byte[] bArr;
        List<String> de = de(str);
        if (de.isEmpty()) {
            return q;
        }
        byte[][] bArr2 = new byte[de.size()][];
        int i = 0;
        for (String str2 : de) {
            int i2 = i + 1;
            if (!str2.equals("NULL")) {
                int length = str2.length();
                if (length >= 3 && str2.charAt(0) == 'X' && str2.charAt(1) == '\'' && str2.charAt(length - 1) == '\'') {
                    int i3 = length - 3;
                    if ((i3 & 1) == 0) {
                        int i4 = i3 >> 1;
                        byte[] bArr3 = new byte[i4];
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = i5 + i5;
                            bArr3[i5] = (byte) Short.parseShort(str2.substring(i6 + 2, i6 + 4), 16);
                        }
                        bArr = bArr3;
                    }
                }
                throw new IllegalArgumentException("invalid blob string: ".concat(String.valueOf(str2)));
            }
            bArr = null;
            bArr2[i] = bArr;
            i = i2;
        }
        return bArr2;
    }

    protected static final List de(String str) {
        return (str == null || str.length() == 0) ? k : a.i(str);
    }

    protected static final double[] dp(String str) {
        List<String> de = de(str);
        if (de.isEmpty()) {
            return p;
        }
        double[] dArr = new double[de.size()];
        int i = 0;
        for (String str2 : de) {
            double d = eobe.a;
            if (str2 != null && !str2.equals("NULL")) {
                try {
                    d = Double.parseDouble(str2);
                } catch (NumberFormatException unused) {
                    d = Double.NaN;
                }
            }
            dArr[i] = d;
            i++;
        }
        return dArr;
    }

    protected static final float[] dq(String str) {
        List<String> de = de(str);
        if (de.isEmpty()) {
            return o;
        }
        float[] fArr = new float[de.size()];
        int i = 0;
        for (String str2 : de) {
            float f = 0.0f;
            if (str2 != null && !str2.equals("NULL")) {
                try {
                    f = Float.parseFloat(str2);
                } catch (NumberFormatException unused) {
                    f = Float.NaN;
                }
            }
            fArr[i] = f;
            i++;
        }
        return fArr;
    }

    public static final int[] dr(String str) {
        int i;
        List<String> de = de(str);
        if (de.isEmpty()) {
            return l;
        }
        int[] iArr = new int[de.size()];
        int i2 = 0;
        for (String str2 : de) {
            if (str2 != null && !str2.equals("NULL")) {
                try {
                    i = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                }
                iArr[i2] = i;
                i2++;
            }
            i = 0;
            iArr[i2] = i;
            i2++;
        }
        return iArr;
    }

    public static final long[] ds(String str) {
        List<String> de = de(str);
        if (de.isEmpty()) {
            return m;
        }
        long[] jArr = new long[de.size()];
        int i = 0;
        for (String str2 : de) {
            long j2 = 0;
            if (str2 != null && !str2.equals("NULL")) {
                try {
                    j2 = Long.parseLong(str2);
                } catch (NumberFormatException unused) {
                }
            }
            jArr[i] = j2;
            i++;
        }
        return jArr;
    }

    public static final String[] dt(String str) {
        boolean z;
        char charAt;
        String[] strArr = dtzb.a;
        if (str == null || str.length() == 0) {
            return dtzb.a;
        }
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            int i = -1;
            while (true) {
                boolean z2 = true;
                i++;
                if (i >= length) {
                    return (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                char charAt2 = str.charAt(i);
                if (charAt2 == '\'') {
                    while (true) {
                        int i2 = i + 1;
                        if (i2 >= length) {
                            i = i2;
                            break;
                        }
                        char charAt3 = str.charAt(i2);
                        if (charAt3 == '\'') {
                            char charAt4 = i2 < length + (-1) ? str.charAt(i + 2) : (char) 0;
                            if (charAt4 == '\'') {
                                i += 2;
                                charAt3 = '\'';
                            } else {
                                if (charAt4 != '|' && charAt4 != 0) {
                                    Log.w("DatabaseAnnotationProcessor", "Failed to parse quoted string {REDACTED STRING } at position " + i2 + "; expected a divider character(|), end of string but found (" + charAt4 + ")");
                                    throw new IllegalArgumentException("malformed string; expected quote character");
                                }
                                dtzb.a(arrayList, sb);
                                sb.setLength(0);
                                i += 2;
                            }
                        } else {
                            i = i2;
                        }
                        sb.append(charAt3);
                    }
                } else {
                    enqu listIterator = dtzb.b.entrySet().listIterator();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            z = false;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) listIterator.next();
                        String str2 = (String) entry.getKey();
                        if (str.substring(i, Math.min(str.length(), i + str2.length())).equals(str2)) {
                            String str3 = (String) entry.getValue();
                            if (true == str3.equals("@null")) {
                                str3 = null;
                            }
                            arrayList.add(str3);
                            i += str2.length();
                            z = true;
                        }
                    }
                    if (z || "-0123456789.".indexOf(charAt2) < 0) {
                        z2 = z;
                    } else {
                        sb.append(charAt2);
                        while (true) {
                            i++;
                            if (i >= length || (charAt = str.charAt(i)) == '|') {
                                break;
                            }
                            sb.append(charAt);
                        }
                        dtzb.a(arrayList, sb);
                        sb.setLength(0);
                    }
                    if (!z2) {
                        Log.w("DatabaseAnnotationProcessor", "Failed to parse quoted string {REDACTED STRING } at position " + i + "; expected a quote char('), but found (" + charAt2 + ")");
                        throw new IllegalArgumentException("malformed string; expected quote character");
                    }
                }
            }
        } catch (IllegalArgumentException unused) {
            return dtzb.a;
        }
    }

    public static final boolean[] du(String str) {
        List<String> de = de(str);
        if (de.isEmpty()) {
            return n;
        }
        boolean[] zArr = new boolean[de.size()];
        int i = 0;
        for (String str2 : de) {
            zArr[i] = (str2 == null || str2.equals("NULL")) ? false : str2.equals("1");
            i++;
        }
        return zArr;
    }

    protected static final void dv(int i, double[] dArr, emyl emylVar) {
        if (dArr != null) {
            dtub.q(i, dArr.length, emylVar);
        }
    }

    protected static final void dw(int i, float[] fArr, emyl emylVar) {
        if (fArr != null) {
            dtub.q(i, fArr.length, emylVar);
        }
    }

    protected static final void dx(int i, int[] iArr, emyl emylVar) {
        if (iArr != null) {
            dtub.q(i, iArr.length, emylVar);
        }
    }

    protected static final void dy(int i, long[] jArr, emyl emylVar) {
        if (jArr != null) {
            dtub.q(i, jArr.length, emylVar);
        }
    }

    protected static final void dz(int i, Object[] objArr, emyl emylVar) {
        if (objArr != null) {
            dtub.q(i, objArr.length, emylVar);
        }
    }

    protected abstract dtro b();

    public final int cM(int i, String[] strArr) {
        int i2 = this.i[i];
        if (i2 != -1) {
            return i2;
        }
        throw new IllegalArgumentException("column " + strArr[i] + " is not part of the projection.");
    }

    public final int cN() {
        return super.getCount();
    }

    public final dtro cO() {
        return cP(new dtsk(this));
    }

    public final dtro cP(final Supplier supplier) {
        return (dtro) dc(new Supplier() { // from class: dtsh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Supplier
            public final Object get() {
                Object obj;
                obj = supplier.get();
                dtro dtroVar = (dtro) obj;
                dtsr dtsrVar = dtsr.this;
                dtroVar.c((dtsu) dtsrVar);
                dtvs dtvsVar = dtsrVar.d;
                dtroVar.cO = dtvsVar.b;
                if (dtvsVar != null) {
                    dtsrVar.df(dtvsVar.c(), dtroVar);
                }
                return dtroVar;
            }
        });
    }

    public final dtro cQ() {
        return cR(new dtsk(this));
    }

    public final dtro cR(Supplier supplier) {
        if (moveToNext()) {
            return cP(supplier);
        }
        return null;
    }

    public final dtro cS() {
        try {
            if (getCount() <= 1) {
                dtro cP = moveToFirst() ? cP(new dtsk(this)) : null;
                close();
                return cP;
            }
            throw new IllegalStateException("query found " + getCount() + " rows");
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final dtro cT() {
        try {
            boolean moveToFirst = moveToFirst();
            if (getCount() == 1 && moveToFirst) {
                dtro cP = cP(new dtsk(this));
                close();
                return cP;
            }
            throw new IllegalStateException("query found " + getCount() + " rows");
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final dtsq cU() {
        ArrayList arrayList = new ArrayList();
        int columnCount = getWrappedCursor().getColumnCount() - this.f.length;
        for (int i = 0; i < columnCount; i++) {
            int length = this.f.length + i;
            if (length >= getWrappedCursor().getColumnCount()) {
                throw new IllegalArgumentException("offset out of range");
            }
            arrayList.add(getWrappedCursor().getString(length));
        }
        HashMap hashMap = new HashMap();
        dtzj[] dtzjVarArr = this.g;
        if (dtzjVarArr != null) {
            int i2 = 0;
            for (dtzj dtzjVar : dtzjVarArr) {
                if (dtzjVar instanceof dtqr) {
                    hashMap.put(((dtqr) dtzjVar).a, Integer.valueOf(i2));
                    i2++;
                }
            }
        }
        return new dtsq(arrayList, hashMap);
    }

    public final dtsu cV(String str) {
        return (dtsu) this.h.get(str);
    }

    public final engw cW() {
        return cY(new dtsk(this));
    }

    public final engw cX(dtsp dtspVar) {
        engw g;
        try {
            dh();
            if (moveToFirst()) {
                int i = engw.d;
                engr engrVar = new engr();
                do {
                    engrVar.h(da(dtspVar));
                } while (moveToNext());
                c();
                g = engrVar.g();
            } else {
                int i2 = engw.d;
                g = enou.a;
            }
            close();
            return g;
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw cY(Supplier supplier) {
        engw g;
        CancellationSignal cancellationSignal;
        try {
            dh();
            if (moveToFirst()) {
                int i = engw.d;
                engr engrVar = new engr();
                do {
                    engrVar.h(cP(supplier));
                    dtyq dtyqVar = this.b;
                    if (dtyqVar != null && (cancellationSignal = dtyqVar.r) != null && cancellationSignal.isCanceled()) {
                        throw new duaa();
                    }
                } while (moveToNext());
                c();
                g = engrVar.g();
            } else {
                int i2 = engw.d;
                g = enou.a;
            }
            close();
            return g;
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Stream cZ() {
        Object obj;
        obj = ((dtqv) dtub.c).c.get();
        if (!((Boolean) obj).booleanValue()) {
            dh();
            return Stream.CC.generate(new Supplier() { // from class: dtsi
                @Override // java.util.function.Supplier
                public final Object get() {
                    dtsr dtsrVar = dtsr.this;
                    dtro cR = dtsrVar.cR(new dtsk(dtsrVar));
                    if (dtsrVar.getPosition() == dtsrVar.getCount() - 1) {
                        dtsrVar.close();
                    }
                    return cR;
                }
            }).limit(getCount()).onClose(new Runnable() { // from class: dtsj
                @Override // java.lang.Runnable
                public final void run() {
                    dtsr.this.close();
                }
            });
        }
        final dtsp dtspVar = new dtsp() { // from class: dtsg
            @Override // defpackage.dtsp
            public final Object a(Object obj2) {
                int i = dtsr.j;
                return obj2;
            }
        };
        dh();
        Object db = db(dtspVar);
        if (db == null) {
            close();
            return Stream.CC.empty();
        }
        final boolean[] zArr = {false};
        return Stream.CC.iterate(db, new Predicate() { // from class: dtsl
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                int i = dtsr.j;
                return obj2 != null;
            }
        }, new UnaryOperator() { // from class: dtsm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                boolean[] zArr2 = zArr;
                dtsr dtsrVar = dtsr.this;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    dtsrVar.dh();
                }
                Object db2 = dtsrVar.db(dtspVar);
                if (db2 == null) {
                    dtsrVar.close();
                }
                return db2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).onClose(new Runnable() { // from class: dtsn
            @Override // java.lang.Runnable
            public final void run() {
                dtsr.this.close();
            }
        });
    }

    public final Object da(final dtsp dtspVar) {
        return dc(new Supplier() { // from class: dtso
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Supplier
            public final Object get() {
                dtsr dtsrVar = dtsr.this;
                dtro b = dtsrVar.b();
                b.c((dtsu) dtsrVar);
                dtvs dtvsVar = dtsrVar.d;
                b.cO = dtvsVar.b;
                if (dtvsVar != null) {
                    dtsrVar.df(dtvsVar.c(), b);
                }
                return dtspVar.a(b);
            }
        });
    }

    public final Object db(dtsp dtspVar) {
        if (moveToNext()) {
            return da(dtspVar);
        }
        return null;
    }

    public final Object dc(Supplier supplier) {
        Object obj;
        try {
            this.t.incrementAndGet();
            obj = supplier.get();
            return obj;
        } finally {
            this.t.decrementAndGet();
        }
    }

    public final String dd(String str) {
        dtzj[] dtzjVarArr = this.g;
        if (dtzjVarArr != null) {
            int i = 0;
            for (dtzj dtzjVar : dtzjVarArr) {
                if ((dtzjVar instanceof dtqr) && ((dtqr) dtzjVar).a.equals(str)) {
                    return getWrappedCursor().getString(this.f.length + i);
                }
                i++;
            }
        }
        throw new IllegalArgumentException("unknown as expression: ".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void df(engw engwVar, dtro dtroVar) {
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            dtvn dtvnVar = (dtvn) engwVar.get(i);
            dtsr dtsrVar = (dtsr) ((dtsu) this).cV(dtvnVar.e);
            engw fI = dtsrVar.fI(dtvnVar);
            engr engrVar = new engr();
            engrVar.h(dtsrVar.b());
            engrVar.j(fI);
            dtroVar.cM.put(dtvnVar.e, engrVar.g());
            dtroVar.cN.put(dtvnVar.e, dtvnVar);
            df(dtvnVar.a.m.c(), dtroVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dg(dtvs dtvsVar, engw engwVar, boolean z) {
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            ((dtvn) engwVar.get(i)).a(this.c, this, dtvsVar, z);
        }
    }

    public final void dh() {
        this.s.set(Thread.currentThread().getId());
    }

    public final boolean di(int i) {
        return this.i[i] != -1;
    }

    public final boolean dj(String str) {
        dtzj[] dtzjVarArr = this.g;
        if (dtzjVarArr != null) {
            for (dtzj dtzjVar : dtzjVarArr) {
                if ((dtzjVar instanceof dtqr) && ((dtqr) dtzjVar).a.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean dk() {
        a();
        return super.moveToFirst();
    }

    public final boolean dl() {
        a();
        return super.moveToLast();
    }

    public final boolean dm() {
        a();
        return super.moveToNext();
    }

    public final boolean dn(int i) {
        a();
        return super.moveToPosition(i);
    }

    /* renamed from: do, reason: not valid java name */
    public final boolean m369do() {
        a();
        return super.moveToPrevious();
    }

    public engw fI(dtvn dtvnVar) {
        throw new IllegalStateException("shouldn't get here");
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        dtve dtveVar = this.c;
        return dtveVar == null ? super.getCount() : dtveVar.d(this);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        a();
        c();
        dtve dtveVar = this.c;
        return dtveVar == null ? dk() : dtveVar.J(this);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        a();
        c();
        dtve dtveVar = this.c;
        return dtveVar == null ? dl() : dtveVar.K(this);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        a();
        c();
        dtve dtveVar = this.c;
        return dtveVar == null ? dm() : dtveVar.L(this);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int i) {
        a();
        c();
        dtve dtveVar = this.c;
        return dtveVar == null ? dn(i) : dtveVar.M(this, i);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        a();
        c();
        dtve dtveVar = this.c;
        return dtveVar == null ? m369do() : dtveVar.N(this);
    }
}
