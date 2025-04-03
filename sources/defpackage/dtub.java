package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtub {
    public static Context b;
    public static dttl c;
    private static String f;
    static final Object a = new Object();
    public static final SettableFuture d = SettableFuture.create();
    private static final Object e = new Object();
    private static final AtomicReference g = new AtomicReference(false);
    private static final Pattern h = Pattern.compile("^SCAN TABLE ([a-zA-Z0-9_]+)$");
    private static final Pattern i = Pattern.compile("^SCAN TABLE ([a-zA-Z0-9_]+).*");
    private static final Pattern j = Pattern.compile("^USE TEMP B-TREE .*");

    /* compiled from: PG */
    public interface a {
        dttm dH();

        Map fH();

        Map fK();

        azwj iA();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] A(final dtve dtveVar, int i2, final boolean z, final BiConsumer biConsumer, final dtro... dtroVarArr) {
        if (dtroVarArr.length == 0) {
            return new long[0];
        }
        Object[] objArr = dtroVarArr[0];
        if (!(objArr instanceof dtrq)) {
            throw new IllegalArgumentException("not insertable");
        }
        final dtrq dtrqVar = (dtrq) objArr;
        final String h2 = dtrqVar.h();
        String j2 = j(i2);
        String concat = j2 == null ? "" : j2.concat(" ");
        final String str = "INSERT " + concat + dtrqVar.f();
        return (long[]) dtveVar.s(new dtui("bulkInsertImpl-", h2), new emyl() { // from class: dttq
            /* JADX WARN: Code restructure failed: missing block: B:100:0x017b, code lost:
            
                if (r5 == false) goto L106;
             */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x017d, code lost:
            
                r1 = r8.g();
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x0181, code lost:
            
                if (r1 == null) goto L104;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x0183, code lost:
            
                r5 = new long[r14];
                r1 = r0.g(java.lang.String.format(java.util.Locale.US, "/*EXEMPT-FROM-QUERY-PLAN-CHECK*\/SELECT %s FROM %s ORDER BY %s DESC LIMIT %d", r1, r2, r1, java.lang.Integer.valueOf(r14)), null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x01a3, code lost:
            
                r0 = r1.getCount() - 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x01ad, code lost:
            
                if (r1.moveToNext() == false) goto L150;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x01af, code lost:
            
                r2 = r17;
                r5[r0] = r1.getLong(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x01b7, code lost:
            
                r0 = r0 - 1;
                r17 = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
            
                if (defpackage.emxe.c(r8.g()) == false) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x01bc, code lost:
            
                r2 = r17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x01be, code lost:
            
                if (r1 == null) goto L86;
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x01c0, code lost:
            
                r1.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:115:0x01c9, code lost:
            
                if (defpackage.dtub.c.q() == false) goto L107;
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x01cc, code lost:
            
                if (r14 != r4.length) goto L91;
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x01ce, code lost:
            
                r0 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:119:0x01d2, code lost:
            
                defpackage.emxf.l(r0);
                r0 = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x01d6, code lost:
            
                if (r0 >= r14) goto L151;
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x01d8, code lost:
            
                r6.accept(r4[r0], java.lang.Long.valueOf(r5[r0]));
             */
            /* JADX WARN: Code restructure failed: missing block: B:122:0x01e3, code lost:
            
                r0 = r0 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x01d1, code lost:
            
                r0 = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:125:0x0212, code lost:
            
                if (r12 <= 0) goto L109;
             */
            /* JADX WARN: Code restructure failed: missing block: B:126:0x0214, code lost:
            
                r9 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:127:0x0218, code lost:
            
                r3.a(r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:0x021b, code lost:
            
                return r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:0x0217, code lost:
            
                r9 = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:131:0x01e6, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:143:0x020e, code lost:
            
                throw new java.lang.IllegalStateException("table " + r2 + " does not have an integer primary key autoincrement");
             */
            /* JADX WARN: Code restructure failed: missing block: B:144:0x020f, code lost:
            
                r2 = 0;
                r5 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x0175, code lost:
            
                r17 = 0;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: all -> 0x021c, TryCatch #1 {all -> 0x021c, blocks: (B:14:0x0051, B:16:0x0054, B:17:0x0066, B:21:0x006e, B:23:0x008d, B:25:0x0096, B:28:0x009f, B:29:0x00a2, B:31:0x00a8, B:33:0x00b4, B:35:0x00ba, B:36:0x00d5, B:38:0x00db, B:81:0x00e5, B:41:0x00eb, B:78:0x00ef, B:44:0x00f5, B:46:0x00f9, B:48:0x00fd, B:50:0x0101, B:72:0x0108, B:60:0x010c, B:62:0x0110, B:66:0x0115, B:67:0x012c, B:69:0x012d, B:54:0x0137, B:84:0x0141, B:88:0x014e, B:89:0x016c, B:91:0x016d, B:92:0x0174, B:101:0x017d, B:103:0x0183, B:113:0x01c0, B:114:0x01c3, B:116:0x01cb, B:119:0x01d2, B:121:0x01d8, B:127:0x0218, B:140:0x01f2, B:139:0x01ef, B:142:0x01f3, B:143:0x020e, B:105:0x01a3, B:106:0x01a9, B:108:0x01af, B:135:0x01ea), top: B:13:0x0051, inners: #0, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00ba A[Catch: all -> 0x021c, TryCatch #1 {all -> 0x021c, blocks: (B:14:0x0051, B:16:0x0054, B:17:0x0066, B:21:0x006e, B:23:0x008d, B:25:0x0096, B:28:0x009f, B:29:0x00a2, B:31:0x00a8, B:33:0x00b4, B:35:0x00ba, B:36:0x00d5, B:38:0x00db, B:81:0x00e5, B:41:0x00eb, B:78:0x00ef, B:44:0x00f5, B:46:0x00f9, B:48:0x00fd, B:50:0x0101, B:72:0x0108, B:60:0x010c, B:62:0x0110, B:66:0x0115, B:67:0x012c, B:69:0x012d, B:54:0x0137, B:84:0x0141, B:88:0x014e, B:89:0x016c, B:91:0x016d, B:92:0x0174, B:101:0x017d, B:103:0x0183, B:113:0x01c0, B:114:0x01c3, B:116:0x01cb, B:119:0x01d2, B:121:0x01d8, B:127:0x0218, B:140:0x01f2, B:139:0x01ef, B:142:0x01f3, B:143:0x020e, B:105:0x01a3, B:106:0x01a9, B:108:0x01af, B:135:0x01ea), top: B:13:0x0051, inners: #0, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x016d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:98:0x0175 A[EDGE_INSN: B:98:0x0175->B:99:0x0175 BREAK  A[LOOP:0: B:13:0x0051->B:86:0x0148], SYNTHETIC] */
            @Override // defpackage.emyl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 578
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dttq.get():java.lang.Object");
            }
        }, dtvd.c().a());
    }

    public static long[] B(long[] jArr, long[] jArr2) {
        HashSet hashSet = new HashSet();
        long[] jArr3 = new long[jArr2.length];
        int i2 = 0;
        for (int i3 = 0; i3 < jArr2.length; i3++) {
            long j2 = jArr == null ? 0L : jArr[i3];
            if (jArr == null || (j2 != 0 && !hashSet.contains(Long.valueOf(j2)))) {
                hashSet.add(Long.valueOf(j2));
                jArr3[i2] = jArr2[i3];
                i2++;
            }
        }
        return Arrays.copyOf(jArr3, i2);
    }

    public static Object[] C(long[] jArr, Object[] objArr, Object[] objArr2) {
        if (jArr == null) {
            return objArr;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                Long valueOf = Long.valueOf(j2);
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(valueOf);
                    arrayList.add(objArr[i2]);
                }
            }
        }
        return arrayList.toArray(objArr2);
    }

    public static boolean[] D(long[] jArr, boolean[] zArr) {
        HashSet hashSet = new HashSet();
        boolean[] zArr2 = new boolean[zArr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < zArr.length; i3++) {
            long j2 = jArr == null ? 0L : jArr[i3];
            if (jArr == null || (j2 != 0 && !hashSet.contains(Long.valueOf(j2)))) {
                hashSet.add(Long.valueOf(j2));
                zArr2[i2] = zArr[i3];
                i2++;
            }
        }
        return Arrays.copyOf(zArr2, i2);
    }

    public static byte[][] E(long[] jArr, byte[][] bArr) {
        HashSet hashSet = new HashSet();
        byte[][] bArr2 = new byte[bArr.length][];
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            long j2 = jArr == null ? 0L : jArr[i3];
            if (jArr == null || (j2 != 0 && !hashSet.contains(Long.valueOf(j2)))) {
                hashSet.add(Long.valueOf(j2));
                bArr2[i2] = bArr[i3];
                i2++;
            }
        }
        return (byte[][]) Arrays.copyOf(bArr2, i2);
    }

    public static azwj F() {
        return ((a) ekhw.a(b, a.class)).iA();
    }

    public static double[] G(double[] dArr) {
        HashSet hashSet = new HashSet();
        double[] dArr2 = new double[dArr.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < dArr.length) {
            hashSet.add(-1L);
            dArr2[i3] = dArr[i2];
            i2++;
            i3++;
        }
        return Arrays.copyOf(dArr2, i3);
    }

    public static float[] H(float[] fArr) {
        HashSet hashSet = new HashSet();
        float[] fArr2 = new float[fArr.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < fArr.length) {
            hashSet.add(0L);
            fArr2[i3] = fArr[i2];
            i2++;
            i3++;
        }
        return Arrays.copyOf(fArr2, i3);
    }

    public static void I(dtve dtveVar, String str) {
        dtveVar.y("DROP TABLE ".concat(str));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:2|3|(15:(2:5|(31:(1:8)|9|10|(1:12)|13|14|(2:(4:112|113|109|110)|114)|(1:17)|18|19|20|21|22|(3:26|23|24)|27|(1:29)|30|31|32|(2:34|(1:38))(1:80)|(1:41)|42|(3:44|(1:46)|47)|48|(2:51|49)|52|53|(3:57|54|55)|58|59|(3:(1:62)|63|64)(2:66|67)))|31|32|(0)(0)|(0)|42|(0)|48|(1:49)|52|53|(2:54|55)|58|59|(0)(0))|(1:127)|128|10|(0)|13|14|(0)|(0)|18|19|20|21|22|(2:23|24)|27|(0)|30) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d4, code lost:
    
        android.util.Log.v("d26r", defpackage.a.m(r9, r20, "unable to recreate table ", " with columns "), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006e A[EXC_TOP_SPLITTER, LOOP:5: B:109:0x006e->B:113:0x007b, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[LOOP:0: B:11:0x004b->B:12:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf A[Catch: all -> 0x01c6, LOOP:1: B:23:0x00b9->B:26:0x00bf, LOOP_END, TRY_LEAVE, TryCatch #6 {all -> 0x01c6, blocks: (B:24:0x00b9, B:26:0x00bf), top: B:23:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[Catch: SQLiteException -> 0x01d3, all -> 0x01e3, TRY_ENTER, TryCatch #5 {SQLiteException -> 0x01d3, blocks: (B:22:0x00aa, B:29:0x00c9, B:30:0x00cc, B:41:0x010f, B:42:0x0112, B:44:0x0128, B:46:0x012d, B:48:0x0135, B:49:0x0139, B:51:0x013f, B:53:0x0149, B:62:0x019f, B:78:0x01b8, B:77:0x01b5, B:90:0x01c5, B:89:0x01c2, B:102:0x01d2, B:101:0x01cf), top: B:21:0x00aa, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2 A[Catch: all -> 0x01b9, TryCatch #8 {all -> 0x01b9, blocks: (B:32:0x00db, B:34:0x00e2, B:36:0x00eb, B:38:0x00f1), top: B:31:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f A[Catch: SQLiteException -> 0x01d3, all -> 0x01e3, TRY_ENTER, TryCatch #5 {SQLiteException -> 0x01d3, blocks: (B:22:0x00aa, B:29:0x00c9, B:30:0x00cc, B:41:0x010f, B:42:0x0112, B:44:0x0128, B:46:0x012d, B:48:0x0135, B:49:0x0139, B:51:0x013f, B:53:0x0149, B:62:0x019f, B:78:0x01b8, B:77:0x01b5, B:90:0x01c5, B:89:0x01c2, B:102:0x01d2, B:101:0x01cf), top: B:21:0x00aa, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128 A[Catch: SQLiteException -> 0x01d3, all -> 0x01e3, TryCatch #5 {SQLiteException -> 0x01d3, blocks: (B:22:0x00aa, B:29:0x00c9, B:30:0x00cc, B:41:0x010f, B:42:0x0112, B:44:0x0128, B:46:0x012d, B:48:0x0135, B:49:0x0139, B:51:0x013f, B:53:0x0149, B:62:0x019f, B:78:0x01b8, B:77:0x01b5, B:90:0x01c5, B:89:0x01c2, B:102:0x01d2, B:101:0x01cf), top: B:21:0x00aa, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f A[Catch: SQLiteException -> 0x01d3, all -> 0x01e3, LOOP:3: B:49:0x0139->B:51:0x013f, LOOP_END, TryCatch #5 {SQLiteException -> 0x01d3, blocks: (B:22:0x00aa, B:29:0x00c9, B:30:0x00cc, B:41:0x010f, B:42:0x0112, B:44:0x0128, B:46:0x012d, B:48:0x0135, B:49:0x0139, B:51:0x013f, B:53:0x0149, B:62:0x019f, B:78:0x01b8, B:77:0x01b5, B:90:0x01c5, B:89:0x01c2, B:102:0x01d2, B:101:0x01cf), top: B:21:0x00aa, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a A[Catch: all -> 0x01ac, LOOP:4: B:54:0x0154->B:57:0x015a, LOOP_END, TryCatch #9 {all -> 0x01ac, blocks: (B:55:0x0154, B:57:0x015a, B:59:0x0197, B:66:0x01a3, B:67:0x01ab), top: B:54:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a3 A[Catch: all -> 0x01ac, TRY_ENTER, TryCatch #9 {all -> 0x01ac, blocks: (B:55:0x0154, B:57:0x015a, B:59:0x0197, B:66:0x01a3, B:67:0x01ab), top: B:54:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void J(defpackage.dtve r19, java.lang.String r20, java.lang.String r21, java.lang.String[] r22, java.lang.String[] r23) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtub.J(dtve, java.lang.String, java.lang.String, java.lang.String[], java.lang.String[]):void");
    }

    public static int a(dtve dtveVar) {
        return ((dtqy) dtveVar.l()).g;
    }

    @Deprecated
    public static long b(dtve dtveVar, String str, dtro dtroVar, Function function, Consumer consumer) {
        Object apply;
        ContentValues contentValues = new ContentValues();
        dtroVar.b(contentValues);
        dtwf h2 = dtwg.a().h(dtveVar, str, dtroVar);
        apply = function.apply(contentValues);
        Long l = (Long) apply;
        long longValue = l.longValue();
        consumer.o(l);
        h2.a(longValue != -1);
        return longValue;
    }

    public static dtro c(dtyq dtyqVar) {
        dtsu o = dtyqVar.o();
        try {
            if (o.getCount() <= 1) {
                dtro cQ = o.cQ();
                o.close();
                return cQ;
            }
            throw new IllegalStateException("queried for more than 1 row on unique column: " + o.getCount() + " rows; " + dtyqVar.F(dtzu.b()));
        } catch (Throwable th) {
            try {
                o.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static dtul d(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, Set set) {
        String replace = str.replace(" IN ()", " IN ('x', 'y', 'z')");
        dtul dtulVar = new dtul();
        boolean contains = replace.contains(" LIMIT ");
        Cursor rawQuery = sQLiteDatabase.rawQuery("EXPLAIN QUERY PLAN ".concat(String.valueOf(replace)), strArr);
        try {
            int columnIndex = rawQuery.getColumnIndex("detail");
            StringBuilder sb = new StringBuilder();
            String str2 = null;
            boolean z = false;
            boolean z2 = true;
            while (rawQuery.moveToNext()) {
                String string = rawQuery.getString(columnIndex);
                sb.append(string);
                if (z2 && contains) {
                    Matcher matcher = i.matcher(string);
                    if (matcher.matches() && !set.contains(matcher.group(1))) {
                        z = true;
                    }
                    sb.append("\n");
                } else {
                    Matcher matcher2 = h.matcher(string);
                    if (matcher2.matches()) {
                        if (matcher2.groupCount() > 0) {
                            str2 = matcher2.group(1);
                        }
                        sb.append(" <<<<<<<<<< QUERY PLAN WARNING");
                        if (set.contains(str2)) {
                            sb.append(" (exempted)");
                        } else {
                            dtulVar.b = true;
                        }
                    }
                    if (z && j.matcher(string).matches()) {
                        sb.append(" <<<<<<<<<< QUERY PLAN WARNING");
                        dtulVar.b = true;
                    }
                    sb.append("\n");
                }
                z2 = false;
            }
            dtulVar.a = sb.toString();
            if (rawQuery != null) {
                rawQuery.close();
            }
            return dtulVar;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static dtve e(String str) {
        dtve dtveVar;
        emxf.m(((dtqv) c).k, "not primary process");
        a aVar = (a) ekhw.a(b, a.class);
        return (!x() || (dtveVar = (dtve) aVar.dH().a.get(str)) == null) ? (dtve) aVar.fH().get(str) : dtveVar;
    }

    static engw f(dtry[] dtryVarArr) {
        int i2 = engw.d;
        engr engrVar = new engr();
        for (dtry dtryVar : dtryVarArr) {
            engrVar.h(dtryVar.toString());
        }
        return engrVar.g();
    }

    public static Object g(dtve dtveVar, String str, final dtuo dtuoVar, final dtum dtumVar, final dtun dtunVar) {
        Object obj = dtuoVar.get();
        if (dtumVar.apply(obj).booleanValue()) {
            F().a(str.concat("-slowpath"));
            return dtveVar.r("optimisticUpdate", new emyl() { // from class: dttr
                @Override // defpackage.emyl
                public final Object get() {
                    Context context = dtub.b;
                    dtum dtumVar2 = dtumVar;
                    Object obj2 = dtuo.this.get();
                    return dtumVar2.apply(obj2).booleanValue() ? dtunVar.apply(obj2) : obj2;
                }
            });
        }
        F().a(str.concat("-fastpath"));
        return obj;
    }

    public static String h(String str) {
        int indexOf = str.indexOf(" AS ");
        return indexOf >= 0 ? str.substring(indexOf + 4) : str;
    }

    public static String i(byte[] bArr) {
        if (bArr == null) {
            return "NULL";
        }
        StringBuilder sb = new StringBuilder("X'");
        StringBuilder sb2 = new StringBuilder();
        for (byte b2 : bArr) {
            sb2.append(String.format("%02X", Byte.valueOf(b2)));
        }
        sb.append((CharSequence) sb2);
        sb.append("'");
        return sb.toString();
    }

    public static String j(int i2) {
        if (i2 == 1) {
            return "OR ROLLBACK";
        }
        if (i2 == 2) {
            return "OR ABORT";
        }
        if (i2 == 3) {
            return "OR FAIL";
        }
        if (i2 == 4) {
            return "OR IGNORE";
        }
        if (i2 != 5) {
            return null;
        }
        return "OR REPLACE";
    }

    public static String k(ContentValues contentValues, Map map, dtzu dtzuVar) {
        StringBuilder sb = new StringBuilder();
        for (String str : contentValues.keySet()) {
            Object obj = contentValues.get(str);
            String valueOf = obj == null ? "null" : obj instanceof Boolean ? String.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : obj instanceof Number ? obj.toString() : obj instanceof byte[] ? i((byte[]) obj) : DatabaseUtils.sqlEscapeString(obj.toString());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            sb.append(",");
        }
        if (map != null) {
            for (String str2 : map.keySet()) {
                sb.append(str2);
                sb.append("=");
                sb.append(((dtzj) map.get(str2)).ag(dtzuVar));
                sb.append(",");
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static String l(SQLiteDatabase sQLiteDatabase) {
        String str;
        synchronized (e) {
            if (f == null) {
                if (sQLiteDatabase != null) {
                    try {
                        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT sqlite_version()", null);
                        try {
                            rawQuery.moveToFirst();
                            f = rawQuery.getString(0);
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        f = defpackage.a.G(th, "error: ");
                    }
                } else {
                    f = "not open";
                }
            }
            str = f;
        }
        return str;
    }

    public static String m(String[] strArr) {
        return new emww(",").f(strArr);
    }

    public static String n(String str) {
        if (!str.contains("group_concat") || str.contains(" AS ")) {
            return str;
        }
        int abs = Math.abs(str.hashCode());
        if (abs < 0) {
            abs = 0;
        }
        return str + " AS gen_as_" + abs;
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.", 2);
        if (split.length == 2) {
            return split[1];
        }
        throw new IllegalArgumentException("malformed qualified column:".concat(str));
    }

    public static List p(Object obj, Class cls) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < Array.getLength(obj); i2++) {
            arrayList.add(cls.cast(Array.get(obj, i2)));
        }
        return arrayList;
    }

    public static void q(int i2, int i3, emyl emylVar) {
        Object obj;
        obj = ((dtqv) c).d.get();
        if (((Boolean) obj).booleanValue() && i3 != i2) {
            throw new IllegalStateException(String.format("unexpected array size %s; expected %s; raw column value: %s", Integer.valueOf(i3), Integer.valueOf(i2), emylVar.get()));
        }
    }

    public static void r(dtve dtveVar, String str) {
        Cursor query = dtveVar.j().query("sqlite_master", new String[]{"sql"}, "type = 'table' AND name = ?", new String[]{str}, null, null, null);
        try {
            int count = query.getCount();
            if (query != null) {
                query.close();
            }
            if (count != 0) {
                dtveVar.y("DELETE FROM ".concat(str));
            }
        } catch (Throwable th) {
            if (query == null) {
                throw th;
            }
            try {
                query.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static void s(boolean z) {
        g.set(Boolean.valueOf(z));
    }

    public static void t(ContentValues contentValues, String str, long j2) {
        if (j2 != 0) {
            contentValues.put(str, Long.valueOf(j2));
        } else {
            contentValues.putNull(str);
        }
    }

    public static void u(ContentValues contentValues, String str, String str2) {
        if (str2 == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, str2);
        }
    }

    public static void v(dtve dtveVar, String str, String str2) {
        dtveVar.y("DROP INDEX IF EXISTS ".concat(str));
        dtveVar.y(str2);
    }

    public static void w(String str, int i2) {
        throw new IllegalStateException(String.format(Locale.US, defpackage.a.a(str, "column ", " is not available in schema version %d"), Integer.valueOf(i2)));
    }

    static boolean x() {
        Object obj;
        if (((Boolean) g.get()).booleanValue()) {
            return true;
        }
        obj = ((dtqv) c).g.get();
        return ((Boolean) obj).booleanValue();
    }

    public static byte[] y(String str) {
        if (str == null || str.equals("NULL")) {
            return null;
        }
        if (!str.startsWith("X'") || !str.endsWith("'")) {
            throw new IllegalArgumentException("invalid blob");
        }
        String substring = str.substring(2, str.length() - 1);
        int length = substring.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("invalid blob");
        }
        int i2 = length / 2;
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 + i3;
            bArr[i3] = (byte) Integer.parseInt(substring.substring(i4, i4 + 2), 16);
        }
        return bArr;
    }

    public static int[] z(long[] jArr, int[] iArr) {
        HashSet hashSet = new HashSet();
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            long j2 = jArr == null ? 0L : jArr[i3];
            if (jArr == null || (j2 != 0 && !hashSet.contains(Long.valueOf(j2)))) {
                hashSet.add(Long.valueOf(j2));
                iArr2[i2] = iArr[i3];
                i2++;
            }
        }
        return Arrays.copyOf(iArr2, i2);
    }
}
