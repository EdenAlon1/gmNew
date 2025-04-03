package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.libraries.geller.portable.GellerException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duhc implements duhb {
    public static final enru a = enru.c("com/google/android/libraries/geller/portable/database/GellerDataTableStorage");
    private final boolean b;
    private final eyom c;

    public duhc(boolean z, eyom eyomVar) {
        this.b = z;
        this.c = eyomVar;
    }

    static String j(String str) {
        return "geller_data_table.".concat(str);
    }

    static byte[][] k(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr) {
        if (!z) {
            return l(sQLiteDatabase, false, str, strArr, -1);
        }
        String format = String.format("SELECT %s FROM (%s) distinct_data_ids INNER JOIN %s ON %s = %s ORDER BY %s DESC", j(GroupManagementRequest.DATA_TAG), String.format("SELECT DISTINCT %s, %s AS %s FROM %s WHERE %s ORDER BY %s DESC", "data_id", "timestamp_micro", "timestamp_micro", "geller_key_table", str, "timestamp_micro"), "geller_data_table", "distinct_data_ids.data_id", j("_id"), "timestamp_micro");
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteDatabase.rawQuery(format, strArr);
        try {
            int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow(GroupManagementRequest.DATA_TAG);
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getBlob(columnIndexOrThrow));
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return (byte[][]) arrayList.toArray(new byte[0][]);
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

    public static byte[][] l(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr, int i) {
        char c;
        String concat;
        String[] strArr2 = strArr;
        ArrayList arrayList = new ArrayList();
        String format = String.format("SELECT DISTINCT %s, %s FROM ( SELECT %s, %s, ROW_NUMBER() OVER ( PARTITION BY %s ORDER BY %s DESC ) row_index FROM %s  WHERE (%s))", "data_id", "timestamp_micro", "data_id", "timestamp_micro", "key", "timestamp_micro", "geller_key_table", str);
        if (i >= 0) {
            c = 2;
            format = String.valueOf(format).concat(String.valueOf(String.format(" WHERE row_index <= %s", String.valueOf(i))));
        } else {
            c = 2;
        }
        String valueOf = String.valueOf(String.format(" ORDER BY %s DESC", "timestamp_micro"));
        if (z) {
            String valueOf2 = String.valueOf(i);
            Object[] objArr = new Object[14];
            objArr[0] = "data_id";
            objArr[1] = "timestamp_micro";
            objArr[c] = "timestamp_micro";
            objArr[3] = "geller_key_table";
            objArr[4] = str;
            objArr[5] = "data_id";
            objArr[6] = "data_id";
            objArr[7] = "geller_key_table";
            objArr[8] = str;
            objArr[9] = "key";
            objArr[10] = "key";
            objArr[11] = "timestamp_micro";
            objArr[12] = valueOf2;
            objArr[13] = "timestamp_micro";
            concat = String.format("SELECT DISTINCT %s, %s as %s FROM %s T1 WHERE (%s) AND %s IN (SELECT %s FROM %s WHERE (%s) AND %s = T1.%s ORDER BY %s DESC LIMIT %s) ORDER BY %s DESC", objArr);
            int i2 = engw.d;
            engr engrVar = new engr();
            engrVar.i(strArr2);
            engrVar.i(strArr2);
            strArr2 = (String[]) engrVar.g().toArray(new String[0]);
        } else {
            concat = String.valueOf(format).concat(valueOf);
        }
        String j = j(GroupManagementRequest.DATA_TAG);
        String j2 = j("_id");
        Object[] objArr2 = new Object[6];
        objArr2[0] = j;
        objArr2[1] = concat;
        objArr2[c] = "geller_data_table";
        objArr2[3] = "distinct_data_ids.data_id";
        objArr2[4] = j2;
        objArr2[5] = "timestamp_micro";
        Cursor rawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s FROM (%s) distinct_data_ids INNER JOIN %s ON %s = %s ORDER BY %s DESC", objArr2), strArr2);
        try {
            int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow(GroupManagementRequest.DATA_TAG);
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getBlob(columnIndexOrThrow));
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return (byte[][]) arrayList.toArray(new byte[0][]);
        } finally {
        }
    }

    private static long m(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            long delete = sQLiteDatabase.delete("geller_data_table", str, strArr);
            sQLiteDatabase.setTransactionSuccessful();
            return delete;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static long n(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        try {
            sQLiteDatabase.beginTransactionNonExclusive();
            sQLiteDatabase.execSQL(String.format("DELETE FROM %s WHERE %s IN (SELECT %s FROM %s WHERE %s)", "geller_data_table", "_id", "data_id", "geller_key_table", str), strArr);
            long longForQuery = DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT changes()", null);
            sQLiteDatabase.setTransactionSuccessful();
            return longForQuery;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static long o(SQLiteDatabase sQLiteDatabase, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(GroupManagementRequest.DATA_TAG, bArr);
        return sQLiteDatabase.insertOrThrow("geller_data_table", null, contentValues);
    }

    private static long p(SQLiteDatabase sQLiteDatabase, String str, List list, long j, List list2, byte[] bArr) {
        long o = o(sQLiteDatabase, bArr);
        Iterator it = list.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            String[] strArr = {str, (String) it.next(), String.valueOf(j)};
            new ContentValues().put("data_id", Long.valueOf(o));
            j2 += sQLiteDatabase.update("geller_key_table", r4, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr);
        }
        m(sQLiteDatabase, duhf.b("_id", "IN", list2), null);
        return j2;
    }

    private static ContentValues q(emxc emxcVar, emxc emxcVar2, emxc emxcVar3) {
        ContentValues contentValues = new ContentValues();
        if (emxcVar.g()) {
            ((Boolean) emxcVar.c()).booleanValue();
            contentValues.put("sync_status", "SYNCED");
        }
        if (emxcVar2.g()) {
            ((Boolean) emxcVar2.c()).booleanValue();
            contentValues.put("deletion_sync_status", "DELETION_SYNCED");
        }
        if (emxcVar3.g()) {
            emxcVar3.c();
            emxcVar3.c();
            contentValues.put("delete_status", "PENDING_DELETE");
        }
        return contentValues;
    }

    private static void r(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, long j, boolean z, byte[] bArr, emxc emxcVar, emxc emxcVar2) {
        long o = o(sQLiteDatabase, bArr);
        for (String str2 : strArr) {
            enrr enrrVar = (enrr) ((enrr) a.d()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "insertDataAndKey", 967, "GellerDataTableStorage.java");
            Long valueOf = Long.valueOf(j);
            enrrVar.J("inserting %s key: %s ts: %d", str, str2, valueOf);
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str2);
            contentValues.put("data_id", Long.valueOf(o));
            contentValues.put("data_type", str);
            contentValues.put("timestamp_micro", valueOf);
            contentValues.put("num_times_used", (Integer) 0);
            if (z) {
                contentValues.put("sync_status", "SYNCED");
            }
            if (emxcVar.g()) {
                if (((Boolean) emxcVar.c()).booleanValue()) {
                    contentValues.put("deletion_sync_status", "DELETION_SYNCED");
                } else {
                    contentValues.putNull("deletion_sync_status");
                }
            }
            if (emxcVar2.g()) {
                contentValues.put("delete_status", (String) emxcVar2.c());
            }
            sQLiteDatabase.insertOrThrow("geller_key_table", null, contentValues);
        }
    }

    private static List s(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = sQLiteDatabase.query(true, "geller_key_table", new String[]{"data_id"}, str, strArr, "data_id", null, "timestamp_micro DESC", null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(Long.valueOf(query.getLong(query.getColumnIndexOrThrow("data_id"))));
                } finally {
                }
            }
            if (query != null) {
                query.close();
                return arrayList;
            }
        } catch (IllegalArgumentException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "readNumberFromKeyTable", (char) 758, "GellerDataTableStorage.java")).q("Column doesn't exist");
        }
        return arrayList;
    }

    private static long t(SQLiteDatabase sQLiteDatabase, String[] strArr, String str) {
        ContentValues contentValues = new ContentValues();
        if (str != null) {
            contentValues.put("delete_status", str);
        } else {
            contentValues.putNull("delete_status");
        }
        return sQLiteDatabase.update("geller_key_table", contentValues, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr);
    }

    private static long u(SQLiteDatabase sQLiteDatabase, String[] strArr, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("sync_status", "SYNCED");
        } else {
            contentValues.putNull("sync_status");
        }
        return sQLiteDatabase.update("geller_key_table", contentValues, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr);
    }

    @Override // defpackage.duhb
    public final long a(emxc emxcVar, String str, eyns eynsVar) {
        if ((eynsVar.b & 1) == 0) {
            throw new IllegalArgumentException("The `dataType` field is required in GellerDeleteParams.");
        }
        String str2 = eynsVar.e;
        emxf.l(true);
        Object obj = ((emxn) emxcVar).a;
        try {
            ((SQLiteDatabase) obj).beginTransactionNonExclusive();
            int i = eynsVar.c;
            long j = 0;
            if (i == 1) {
                for (String str3 : duhf.h(((eynn) eynsVar.d).b)) {
                    if (!str3.isEmpty()) {
                        j += n((SQLiteDatabase) obj, "data_type = ? AND ".concat(String.valueOf(str3)), new String[]{str2});
                    }
                }
            } else if (i == 2) {
                eynr eynrVar = (eynr) eynsVar.d;
                eyom eyomVar = this.c;
                String str4 = "data_type = ?";
                if (eynrVar.b.size() == 0 && eynrVar.c.size() == 0) {
                    duhf.e(eynrVar, eyomVar);
                    j = n((SQLiteDatabase) obj, str4, new String[]{str2});
                }
                str4 = "data_type = ? AND " + duhf.f(eynrVar, eyomVar);
                j = n((SQLiteDatabase) obj, str4, new String[]{str2});
            } else if (i == 4 && ((Boolean) eynsVar.d).booleanValue()) {
                j = m((SQLiteDatabase) ((emxn) emxcVar).a, String.format("%s IN (SELECT %s FROM %s WHERE %s = ?)", "_id", "data_id", "geller_key_table", "data_type"), new String[]{str2});
            }
            ((SQLiteDatabase) obj).setTransactionSuccessful();
            return j;
        } finally {
            ((SQLiteDatabase) obj).endTransaction();
        }
    }

    @Override // defpackage.duhb
    public final eynk b(emxc emxcVar, Set set) {
        Cursor cursor;
        int i = 1;
        emxf.l(true);
        char c = 3;
        int i2 = 0;
        int i3 = 2;
        StringBuilder sb = new StringBuilder(String.format("SELECT %s, COUNT(*), COUNT(DISTINCT %s) FROM %s", "data_type", "data_id", "geller_key_table"));
        if (!set.isEmpty()) {
            String b = duhf.b("data_type", "IN", set);
            sb.append(" WHERE ");
            sb.append(b);
        }
        sb.append(" GROUP BY data_type");
        Object obj = ((emxn) emxcVar).a;
        eynj eynjVar = (eynj) eynk.a.createBuilder();
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery(sb.toString(), null);
            try {
                HashMap hashMap = new HashMap();
                while (rawQuery.moveToNext()) {
                    char c2 = c;
                    String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow("data_type"));
                    int i4 = i2;
                    int i5 = rawQuery.getInt(i);
                    int i6 = i;
                    int i7 = rawQuery.getInt(i3);
                    if (string != null) {
                        int i8 = i3;
                        eynh eynhVar = (eynh) eyni.a.createBuilder();
                        eynhVar.copyOnWrite();
                        eyni eyniVar = (eyni) eynhVar.instance;
                        cursor = rawQuery;
                        try {
                            eyniVar.b |= 1;
                            eyniVar.c = string;
                            eynhVar.copyOnWrite();
                            eyni eyniVar2 = (eyni) eynhVar.instance;
                            eyniVar2.b |= 4;
                            eyniVar2.e = i5;
                            eynhVar.copyOnWrite();
                            eyni eyniVar3 = (eyni) eynhVar.instance;
                            eyniVar3.b |= 8;
                            eyniVar3.f = i7;
                            hashMap.put(string, eynhVar);
                            c = c2;
                            i2 = i4;
                            i = i6;
                            rawQuery = cursor;
                            i3 = i8;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (cursor == null) {
                                throw th2;
                            }
                            try {
                                cursor.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } else {
                        c = c2;
                        i2 = i4;
                        i = i6;
                    }
                }
                int i9 = i;
                cursor = rawQuery;
                char c3 = c;
                int i10 = i2;
                int i11 = i3;
                String j = j(GroupManagementRequest.DATA_TAG);
                String j2 = j("_id");
                Object[] objArr = new Object[7];
                objArr[i10] = "data_type";
                objArr[i9] = j;
                objArr[i11] = "geller_data_table";
                objArr[c3] = "data_id";
                objArr[4] = "data_type";
                objArr[5] = "geller_key_table";
                objArr[6] = j2;
                StringBuilder sb2 = new StringBuilder(String.format("SELECT distinct_data_ids.%s, COUNT(*), SUM(LENGTH(%s)) FROM %s LEFT JOIN (SELECT DISTINCT %s, %s FROM %s) distinct_data_ids ON %s = distinct_data_ids.data_id", objArr));
                if (!set.isEmpty()) {
                    String b2 = duhf.b("data_type", "IN", set);
                    sb2.append(" WHERE ");
                    sb2.append(b2);
                }
                sb2.append(" GROUP BY distinct_data_ids.");
                sb2.append("data_type");
                Cursor rawQuery2 = ((SQLiteDatabase) obj).rawQuery(sb2.toString(), null);
                while (rawQuery2.moveToNext()) {
                    try {
                        int i12 = i10;
                        String string2 = rawQuery2.getString(i12);
                        int i13 = rawQuery2.getInt(i9);
                        long j3 = rawQuery2.getLong(i11);
                        if (rawQuery2.isNull(i12)) {
                            eyor eyorVar = (eyor) eyos.a.createBuilder();
                            eyorVar.copyOnWrite();
                            eyos eyosVar = (eyos) eyorVar.instance;
                            eyosVar.b |= 2;
                            eyosVar.d = i13;
                            eyorVar.copyOnWrite();
                            eyos eyosVar2 = (eyos) eyorVar.instance;
                            eyosVar2.b |= 1;
                            eyosVar2.c = j3;
                            eyos eyosVar3 = (eyos) eyorVar.build();
                            eynjVar.copyOnWrite();
                            eynk eynkVar = (eynk) eynjVar.instance;
                            eyosVar3.getClass();
                            eynkVar.d = eyosVar3;
                            i9 = 1;
                            eynkVar.b |= 1;
                            i10 = i12;
                            i11 = 2;
                        } else {
                            i9 = 1;
                            if (TextUtils.isEmpty(string2)) {
                                i11 = 2;
                            } else {
                                eynh eynhVar2 = (eynh) hashMap.get(string2);
                                eynhVar2.copyOnWrite();
                                eyni eyniVar4 = (eyni) eynhVar2.instance;
                                eyni eyniVar5 = eyni.a;
                                i11 = 2;
                                eyniVar4.b |= 2;
                                eyniVar4.d = j3;
                            }
                            i10 = i12;
                        }
                    } finally {
                    }
                }
                if (rawQuery2 != null) {
                    rawQuery2.close();
                }
                ((SQLiteDatabase) obj).setTransactionSuccessful();
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    eynjVar.a((eyni) ((eynh) it.next()).build());
                }
                eynk eynkVar2 = (eynk) eynjVar.build();
                if (cursor != null) {
                    cursor.close();
                }
                return eynkVar2;
            } catch (Throwable th4) {
                th = th4;
                cursor = rawQuery;
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // defpackage.duhb
    public final /* synthetic */ ezic c() {
        return ezic.CUSTOM_STORAGE_TYPE_UNKNOWN;
    }

    @Override // defpackage.duhb
    public final byte[][] d(emxc emxcVar, eyoy eyoyVar) {
        emxf.l(true);
        StringBuilder sb = new StringBuilder();
        sb.append("timestamp_micro >= 0");
        ArrayList arrayList = new ArrayList();
        if ((eyoyVar.b & 4) != 0) {
            sb.append(" AND data_type = ?");
            arrayList.add(eyoyVar.g);
        }
        int i = eyoyVar.c;
        if (i == 1) {
            sb.append(" AND key = ?");
            arrayList.add(eyoyVar.c == 1 ? (String) eyoyVar.d : "");
        } else if (i == 9) {
            sb.append(" AND key like ?");
            arrayList.add(String.valueOf(eyoyVar.c == 9 ? (String) eyoyVar.d : "").concat("%"));
        }
        if ((eyoyVar.b & 2) != 0) {
            sb.append(" AND timestamp_micro >= ? AND timestamp_micro <= ?");
            eyox eyoxVar = eyoyVar.f;
            if (eyoxVar == null) {
                eyoxVar = eyox.a;
            }
            arrayList.add(String.valueOf(eyoxVar.b));
            eyox eyoxVar2 = eyoyVar.f;
            if (eyoxVar2 == null) {
                eyoxVar2 = eyox.a;
            }
            arrayList.add(String.valueOf(eyoxVar2.c));
        }
        if ((eyoyVar.b & 8) != 0) {
            if (eyoyVar.h) {
                sb.append(" AND sync_status = ?");
                arrayList.add("SYNCED");
            } else {
                sb.append(" AND sync_status IS NULL");
            }
        }
        if ((eyoyVar.b & 16) != 0) {
            if (eyoyVar.i) {
                sb.append(" AND delete_status IS NOT NULL");
            } else {
                sb.append(" AND delete_status IS NULL");
            }
        }
        if ((eyoyVar.b & 64) != 0) {
            int a2 = eyov.a(eyoyVar.k);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 1) {
                sb.append(" AND ( delete_status = ? OR delete_status = ? )");
                arrayList.add("PENDING_DELETE");
                arrayList.add("DELETION_PROCESSED");
            } else if (i2 == 2) {
                sb.append(" AND delete_status = ?");
                arrayList.add("PENDING_DELETE");
            } else if (i2 == 3) {
                sb.append(" AND delete_status = ?");
                arrayList.add("DELETION_PROCESSED");
            } else if (i2 == 4) {
                sb.append(" AND delete_status IS NULL");
            }
        }
        if ((eyoyVar.b & 32) != 0) {
            if (eyoyVar.j) {
                sb.append(" AND deletion_sync_status = ?");
                arrayList.add("DELETION_SYNCED");
            } else {
                sb.append(" AND deletion_sync_status IS NULL");
            }
        }
        ((enrr) ((enrr) a.d()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "read", 431, "GellerDataTableStorage.java")).t("Selection query is: %s", sb);
        if ((1 & eyoyVar.b) != 0) {
            return l((SQLiteDatabase) ((emxn) emxcVar).a, this.b, sb.toString(), (String[]) arrayList.toArray(new String[0]), eyoyVar.e);
        }
        return k((SQLiteDatabase) ((emxn) emxcVar).a, this.b, sb.toString(), (String[]) arrayList.toArray(new String[0]));
    }

    @Override // defpackage.duhb
    public final String[] e(emxc emxcVar, String str) {
        emxf.l(true);
        emux emuxVar = emux.a;
        return (String[]) duhf.d((SQLiteDatabase) ((emxn) emxcVar).a, "geller_key_table", "key", "data_type = ? AND timestamp_micro >= 0 AND delete_status IS NULL", new String[]{str}, emuxVar, emuxVar).toArray(new String[0]);
    }

    @Override // defpackage.duhb
    public final long f(emxc emxcVar, String str, eyoj eyojVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4) {
        emxf.l(true);
        String a2 = duhf.a(emxcVar4);
        int i = eyojVar.b;
        long j = 0;
        if (i != 1) {
            if (i != 2) {
                ((enrr) ((enrr) a.i()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "updateElementStatus", 552, "GellerDataTableStorage.java")).q("Unexpected element_filtering in GellerElementSelectionParams.");
                return 0L;
            }
            eyoi eyoiVar = (eyoi) eyojVar.c;
            String concat = (eyoiVar.b.size() == 0 && eyoiVar.c.size() == 0) ? "data_type = ?" : "data_type = ? AND ".concat(duhf.i(eyoiVar.b, eyoiVar.c));
            ArrayList arrayList = new ArrayList();
            arrayList.add(concat);
            if (!a2.isEmpty()) {
                arrayList.add(a2);
            }
            return ((SQLiteDatabase) ((emxn) emxcVar).a).update("geller_key_table", q(emxcVar2, emxcVar3, emxcVar4), new emww(" AND ").b(arrayList), new String[]{str});
        }
        for (String str2 : duhf.h(((eyog) eyojVar.c).b)) {
            if (!str2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("data_type = ?");
                arrayList2.add(str2);
                if (!a2.isEmpty()) {
                    arrayList2.add(a2);
                }
                j += ((SQLiteDatabase) ((emxn) emxcVar).a).update("geller_key_table", q(emxcVar2, emxcVar3, emxcVar4), new emww(" AND ").b(arrayList2), new String[]{str});
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // defpackage.duhb
    public final boolean g(emxc emxcVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        List list;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase3 = "data_type = ? AND ";
        emxf.l(emxcVar.g());
        SQLiteDatabase sQLiteDatabase4 = (SQLiteDatabase) emxcVar.c();
        if (bArr.length > 2000000) {
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 93, "GellerDataTableStorage.java")).r("Unable to write data: data size must be less than or equal to %s bytes", 2000000);
            return false;
        }
        sQLiteDatabase4.beginTransactionNonExclusive();
        try {
            try {
                list = s(sQLiteDatabase4, "data_type = ? AND " + duhf.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?", new String[]{str, String.valueOf(j)});
                try {
                    if (list.size() == 1) {
                        String[] strArr2 = {String.valueOf(list.get(0))};
                        emux emuxVar = emux.a;
                        List<String> d = duhf.d(sQLiteDatabase4, "geller_key_table", "key", "data_id = ?", strArr2, emuxVar, emuxVar);
                        if (new HashSet(d).equals(new HashSet(Arrays.asList(strArr)))) {
                            sQLiteDatabase2 = sQLiteDatabase4;
                            if (p(sQLiteDatabase2, str, d, j, list, bArr) <= 0) {
                                ((enrr) ((enrr) a.i()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 130, "GellerDataTableStorage.java")).q("Failed to update data.");
                            } else {
                                for (String str2 : d) {
                                    enru enruVar = a;
                                    ((enrr) ((enrr) enruVar.d()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 135, "GellerDataTableStorage.java")).D("write: updating %s : %s", str, str2);
                                    String[] strArr3 = {str, str2, String.valueOf(j)};
                                    if (u(sQLiteDatabase2, strArr3, z) <= 0 || t(sQLiteDatabase2, strArr3, null) <= 0) {
                                        ((enrr) ((enrr) enruVar.i()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 139, "GellerDataTableStorage.java")).q("Failed to update key.");
                                    }
                                }
                            }
                            sQLiteDatabase2.endTransaction();
                            return false;
                        }
                        sQLiteDatabase2 = sQLiteDatabase4;
                        m(sQLiteDatabase2, "_id = ?", strArr2);
                        emux emuxVar2 = emux.a;
                        r(sQLiteDatabase2, str, strArr, j, z, bArr, emuxVar2, emuxVar2);
                    } else {
                        sQLiteDatabase2 = sQLiteDatabase4;
                        if (list.isEmpty()) {
                            emux emuxVar3 = emux.a;
                            r(sQLiteDatabase2, str, strArr, j, z, bArr, emuxVar3, emuxVar3);
                        } else {
                            m(sQLiteDatabase2, duhf.b("_id", "IN", list), null);
                            emux emuxVar4 = emux.a;
                            r(sQLiteDatabase2, str, strArr, j, z, bArr, emuxVar4, emuxVar4);
                        }
                    }
                    sQLiteDatabase2.setTransactionSuccessful();
                    sQLiteDatabase = sQLiteDatabase2;
                } catch (IllegalStateException e) {
                    e = e;
                    ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", (char) 185, "GellerDataTableStorage.java")).q("Failed to write to data table.");
                    sQLiteDatabase = list;
                    sQLiteDatabase.endTransaction();
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase3.endTransaction();
                throw th;
            }
        } catch (IllegalStateException e2) {
            e = e2;
            list = sQLiteDatabase4;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase3 = sQLiteDatabase4;
            sQLiteDatabase3.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
        return true;
    }

    @Override // defpackage.duhb
    public final eypp h(emxc emxcVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        emxf.l(true);
        int i = 0;
        if (bArr.length > 2000000) {
            throw new GellerException(String.format("Unable to write data: data size must be less than or equal to %s bytes", 2000000));
        }
        Object obj = ((emxn) emxcVar).a;
        eypm eypmVar = (eypm) eypp.a.createBuilder();
        eypn eypnVar = (eypn) eypo.a.createBuilder();
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            try {
                List s = s((SQLiteDatabase) obj, "data_type = ? AND " + duhf.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?", new String[]{str, String.valueOf(j)});
                if (s.size() == 1) {
                    String[] strArr2 = {String.valueOf(s.get(0))};
                    emux emuxVar = emux.a;
                    List<String> d = duhf.d((SQLiteDatabase) obj, "geller_key_table", "key", "data_id = ?", strArr2, emuxVar, emuxVar);
                    if (new HashSet(d).equals(new HashSet(Arrays.asList(strArr)))) {
                        long j2 = 0;
                        if (p((SQLiteDatabase) obj, str, d, j, s, bArr) <= 0) {
                            throw new GellerException("Failed to update data.");
                        }
                        for (String str2 : d) {
                            long j3 = j2;
                            ((enrr) ((enrr) a.d()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "writeWithResult", 256, "GellerDataTableStorage.java")).D("write: updating %s : %s", str, str2);
                            String[] strArr3 = {str, str2, String.valueOf(j)};
                            if (u((SQLiteDatabase) obj, strArr3, z) <= j3 || t((SQLiteDatabase) obj, strArr3, null) <= j3) {
                                throw new GellerException("Failed to update key metadata.");
                            }
                            eynb eynbVar = (eynb) eync.a.createBuilder();
                            eynbVar.copyOnWrite();
                            eync eyncVar = (eync) eynbVar.instance;
                            str2.getClass();
                            eyncVar.b |= 2;
                            eyncVar.d = str2;
                            eynbVar.copyOnWrite();
                            eync eyncVar2 = (eync) eynbVar.instance;
                            eyncVar2.b |= 1;
                            eyncVar2.c = j;
                            eypnVar.b((eync) eynbVar.build());
                            j2 = j3;
                        }
                    } else {
                        m((SQLiteDatabase) obj, "_id = ?", strArr2);
                        emux emuxVar2 = emux.a;
                        r((SQLiteDatabase) obj, str, strArr, j, z, bArr, emuxVar2, emuxVar2);
                        int length = strArr.length;
                        while (i < length) {
                            String str3 = strArr[i];
                            eynb eynbVar2 = (eynb) eync.a.createBuilder();
                            eynbVar2.copyOnWrite();
                            eync eyncVar3 = (eync) eynbVar2.instance;
                            str3.getClass();
                            eyncVar3.b |= 2;
                            eyncVar3.d = str3;
                            eynbVar2.copyOnWrite();
                            eync eyncVar4 = (eync) eynbVar2.instance;
                            eyncVar4.b |= 1;
                            eyncVar4.c = j;
                            eypnVar.b((eync) eynbVar2.build());
                            i++;
                        }
                    }
                } else if (s.isEmpty()) {
                    emux emuxVar3 = emux.a;
                    r((SQLiteDatabase) obj, str, strArr, j, z, bArr, emuxVar3, emuxVar3);
                    int length2 = strArr.length;
                    while (i < length2) {
                        String str4 = strArr[i];
                        eynb eynbVar3 = (eynb) eync.a.createBuilder();
                        eynbVar3.copyOnWrite();
                        eync eyncVar5 = (eync) eynbVar3.instance;
                        str4.getClass();
                        eyncVar5.b |= 2;
                        eyncVar5.d = str4;
                        eynbVar3.copyOnWrite();
                        eync eyncVar6 = (eync) eynbVar3.instance;
                        eyncVar6.b |= 1;
                        eyncVar6.c = j;
                        eypnVar.a((eync) eynbVar3.build());
                        i++;
                    }
                } else {
                    m((SQLiteDatabase) obj, duhf.b("_id", "IN", s), null);
                    emux emuxVar4 = emux.a;
                    r((SQLiteDatabase) obj, str, strArr, j, z, bArr, emuxVar4, emuxVar4);
                    int length3 = strArr.length;
                    while (i < length3) {
                        String str5 = strArr[i];
                        eynb eynbVar4 = (eynb) eync.a.createBuilder();
                        eynbVar4.copyOnWrite();
                        eync eyncVar7 = (eync) eynbVar4.instance;
                        str5.getClass();
                        eyncVar7.b |= 2;
                        eyncVar7.d = str5;
                        eynbVar4.copyOnWrite();
                        eync eyncVar8 = (eync) eynbVar4.instance;
                        eyncVar8.b |= 1;
                        eyncVar8.c = j;
                        eypnVar.b((eync) eynbVar4.build());
                        i++;
                    }
                }
                eypmVar.copyOnWrite();
                eypp eyppVar = (eypp) eypmVar.instance;
                eypo eypoVar = (eypo) eypnVar.build();
                eypoVar.getClass();
                eyppVar.e = eypoVar;
                eyppVar.b |= 2;
                ((SQLiteDatabase) obj).setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                return (eypp) eypmVar.build();
            } catch (IllegalStateException e) {
                throw new GellerException(3, "Failed to write to DB.", e);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    @Override // defpackage.duhb
    public final boolean i(emxc emxcVar, eypl eyplVar) {
        boolean z;
        IllegalStateException illegalStateException;
        boolean z2;
        String name;
        emxc emxcVar2;
        String str;
        emxf.l(emxcVar.g());
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) emxcVar.c();
        sQLiteDatabase.beginTransactionNonExclusive();
        boolean z3 = true;
        try {
            try {
                for (eypk eypkVar : eyplVar.b) {
                    int i = eypkVar.b;
                    boolean z4 = false;
                    if ((i & 8) == 0 || (((i & 1) == 0 && (i & 64) == 0) || (i & 2) == 0)) {
                        z2 = false;
                        ((enrr) ((enrr) a.j()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "batchWrite", 669, "GellerDataTableStorage.java")).q("Invalid write params");
                    } else {
                        ezie ezieVar = eypkVar.g;
                        if (ezieVar == null) {
                            try {
                                ezieVar = ezie.a;
                            } catch (IllegalStateException e) {
                                illegalStateException = e;
                                z = z3;
                                ((enrr) ((enrr) ((enrr) a.i()).g(illegalStateException)).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "batchWrite", (char) 708, "GellerDataTableStorage.java")).q("Failed to write to data table.");
                                return z;
                            }
                        }
                        byte[] byteArray = ezieVar.toByteArray();
                        if ((eypkVar.b & 64) != 0) {
                            name = eypkVar.j;
                        } else {
                            ezib b = ezib.b(eypkVar.c);
                            if (b == null) {
                                b = ezib.UNKNOWN;
                            }
                            name = b.name();
                        }
                        String str2 = name;
                        if (byteArray.length > 2000000) {
                            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "batchWrite", 678, "GellerDataTableStorage.java")).r("Unable to write data: data size must be less than or equal to %s bytes", 2000000);
                        } else {
                            emxc j = (eypkVar.b & 16) != 0 ? emxc.j(Boolean.valueOf(eypkVar.h)) : emux.a;
                            if ((eypkVar.b & 32) != 0) {
                                int a2 = eypu.a(eypkVar.i);
                                if (a2 != 0 && a2 != z3) {
                                    str = a2 != 2 ? "DELETION_PROCESSED" : "PENDING_DELETE";
                                    emxcVar2 = emxc.j(str);
                                }
                                str = "DELETE_STATUS_UNSPECIFIED";
                                emxcVar2 = emxc.j(str);
                            } else {
                                emxcVar2 = emux.a;
                            }
                            emxc emxcVar3 = emxcVar2;
                            String[] strArr = (String[]) duhf.c(eypkVar.d).toArray(new String[0]);
                            long j2 = eypkVar.e;
                            boolean z5 = eypkVar.f;
                            List s = s(sQLiteDatabase, "data_type = ? AND " + duhf.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?", new String[]{str2, String.valueOf(j2)});
                            if (s.size() == z3) {
                                String[] strArr2 = {String.valueOf(s.get(0))};
                                emux emuxVar = emux.a;
                                z = z3;
                                boolean z6 = z5;
                                try {
                                    List<String> d = duhf.d(sQLiteDatabase, "geller_key_table", "key", "data_id = ?", strArr2, emuxVar, emuxVar);
                                    if (new HashSet(d).equals(new HashSet(Arrays.asList(strArr)))) {
                                        String str3 = str2;
                                        long p = p(sQLiteDatabase, str3, d, j2, s, byteArray);
                                        long j3 = 0;
                                        if (p <= 0) {
                                            ((enrr) ((enrr) a.i()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "updateDataAndKey", 1211, "GellerDataTableStorage.java")).q("Failed to update data.");
                                        } else {
                                            String str4 = (String) emxcVar3.f();
                                            for (String str5 : d) {
                                                z2 = z4;
                                                enru enruVar = a;
                                                long j4 = j3;
                                                ((enrr) ((enrr) enruVar.d()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "updateDataAndKey", 1216, "GellerDataTableStorage.java")).D("write: updating %s : %s", str3, str5);
                                                String[] strArr3 = {str3, str5, String.valueOf(j2)};
                                                if (u(sQLiteDatabase, strArr3, z6) > j4 && t(sQLiteDatabase, strArr3, str4) > j4) {
                                                    if (j.g()) {
                                                        boolean booleanValue = ((Boolean) j.c()).booleanValue();
                                                        boolean z7 = z6;
                                                        ContentValues contentValues = new ContentValues();
                                                        String str6 = str3;
                                                        if (booleanValue) {
                                                            contentValues.put("deletion_sync_status", "DELETION_SYNCED");
                                                        } else {
                                                            contentValues.putNull("deletion_sync_status");
                                                        }
                                                        if (sQLiteDatabase.update("geller_key_table", contentValues, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr3) > j4) {
                                                            z4 = z2;
                                                            j3 = j4;
                                                            z6 = z7;
                                                            str3 = str6;
                                                        }
                                                    } else {
                                                        z4 = z2;
                                                        j3 = j4;
                                                    }
                                                }
                                                ((enrr) ((enrr) enruVar.i()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "updateDataAndKey", 1221, "GellerDataTableStorage.java")).q("Failed to update key.");
                                            }
                                        }
                                    } else {
                                        m(sQLiteDatabase, "_id = ?", strArr2);
                                        r(sQLiteDatabase, str2, strArr, j2, z6, byteArray, j, emxcVar3);
                                    }
                                } catch (IllegalStateException e2) {
                                    e = e2;
                                    illegalStateException = e;
                                    ((enrr) ((enrr) ((enrr) a.i()).g(illegalStateException)).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "batchWrite", (char) 708, "GellerDataTableStorage.java")).q("Failed to write to data table.");
                                    return z;
                                }
                            } else {
                                z = z3;
                                if (s.isEmpty()) {
                                    r(sQLiteDatabase, str2, strArr, j2, z5, byteArray, j, emxcVar3);
                                } else {
                                    m(sQLiteDatabase, duhf.b("_id", "IN", s), null);
                                    r(sQLiteDatabase, str2, strArr, j2, z5, byteArray, j, emxcVar3);
                                }
                            }
                            z3 = z;
                        }
                        z2 = false;
                    }
                    return z2;
                }
                z = z3;
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } catch (IllegalStateException e3) {
            e = e3;
            z = z3;
        }
        return z;
    }
}
