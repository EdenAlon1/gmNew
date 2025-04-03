package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.geller.portable.GellerException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duhg implements duhb {
    private static final enru a = enru.c("com/google/android/libraries/geller/portable/database/GellerFileStorage");
    private final Context b;
    private final String c;
    private final eyom d;

    public duhg(Context context, String str, eyom eyomVar) {
        this.b = context;
        this.c = str;
        this.d = eyomVar;
    }

    public static void j(File file) {
        File[] listFiles;
        if (file == null) {
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                j(file2);
            }
        }
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (RuntimeException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "deleteFileRecursively", 55, "GellerFileStorage.java")).t("Failed to delete file: %s", file);
        }
    }

    static byte[][] k(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, emxc emxcVar) {
        List d = duhf.d(sQLiteDatabase, "geller_file_table", "file_path", str, strArr, emxc.j("timestamp_micro DESC"), emxcVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            emxc o = o((String) it.next());
            if (o.g()) {
                arrayList.add(o.c());
            }
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    static long l(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, int i) {
        new ContentValues().put("delete_status", dugy.a(i));
        return sQLiteDatabase.update("geller_file_table", r0, str, strArr);
    }

    private static long m(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        long j = 0;
        for (String str2 : duhf.d(sQLiteDatabase, "geller_file_table", "file_path", str, strArr, emxc.j("timestamp_micro DESC"), emux.a)) {
            if (q(str2)) {
                j += s(sQLiteDatabase, new String[]{str2});
            }
        }
        return j;
    }

    private final emxc n(String str, String str2, long j, byte[] bArr) {
        File filesDir = this.b.getFilesDir();
        String[] strArr = {"geller", this.c, str};
        int i = ernn.a;
        int i2 = 2;
        for (int i3 = 0; i3 < 3; i3++) {
            i2 += strArr[i3].length();
        }
        char[] cArr = new char[i2];
        int i4 = 0;
        for (int i5 = 0; i5 < 3; i5++) {
            String str3 = strArr[i5];
            if (!str3.isEmpty()) {
                if (i4 > 0 && cArr[i4 - 1] != '/') {
                    cArr[i4] = '/';
                    i4++;
                }
                int length = str3.length();
                for (int i6 = 0; i6 < length; i6++) {
                    char charAt = str3.charAt(i6);
                    if (charAt == '/') {
                        if (i4 <= 0 || cArr[i4 - 1] != '/') {
                            charAt = '/';
                        }
                    }
                    cArr[i4] = charAt;
                    i4++;
                }
            }
        }
        File file = new File(filesDir, new String(cArr, 0, i4));
        if (!file.exists() && !file.mkdirs()) {
            ((enrr) ((enrr) a.i()).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "createFile", 666, "GellerFileStorage.java")).q("Unable to create file directory.");
            return emux.a;
        }
        File file2 = new File(file, str2 + "_" + j);
        ((enrr) ((enrr) a.d()).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "createFile", 671, "GellerFileStorage.java")).t("Writing to file %s.", file2.getAbsolutePath());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                return emxc.j(file2.toString());
            } finally {
            }
        } catch (IOException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "createFile", 675, "GellerFileStorage.java")).t("Filed to write file: %s", file2);
            return emux.a;
        }
    }

    private static emxc o(String str) {
        File file = new File(str);
        ((enrr) ((enrr) a.d()).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "readFile", 684, "GellerFileStorage.java")).t("Reading file %s.", file.getAbsolutePath());
        try {
            return file.exists() ? emxc.j(eoeo.b(file)) : emux.a;
        } catch (IOException | IllegalArgumentException | OutOfMemoryError | SecurityException e) {
            throw new GellerException(11, e.getMessage(), (byte[]) null);
        }
    }

    private final boolean p(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, long j, boolean z, byte[] bArr, List list) {
        Iterator it = list.iterator();
        boolean z2 = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            z2 = q(str2) ? z2 & (s(sQLiteDatabase, new String[]{str2}) > 0) : false;
        }
        if (!z2) {
            return false;
        }
        emxc n = n(str, strArr[0], j, bArr);
        if (!n.g()) {
            return false;
        }
        for (String str3 : strArr) {
            Object c = n.c();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str3);
            contentValues.put("data_type", str);
            contentValues.put("timestamp_micro", Long.valueOf(j));
            contentValues.put("num_times_used", (Integer) 0);
            if (z) {
                contentValues.put("sync_status", "SYNCED");
            }
            contentValues.put("file_path", (String) c);
            z2 &= sQLiteDatabase.insert("geller_file_table", null, contentValues) > 0;
        }
        return z2;
    }

    private static boolean q(String str) {
        ((enrr) ((enrr) a.d()).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "removeFile", 697, "GellerFileStorage.java")).t("Removing file: %s", str);
        File file = new File(str);
        try {
            if (!file.exists()) {
                return true;
            }
            file.delete();
            return true;
        } catch (RuntimeException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "removeFile", 704, "GellerFileStorage.java")).t("Failed to remove file: %s", str);
            return false;
        }
    }

    private final boolean r(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, long j, boolean z, byte[] bArr, String str2, String str3, String[] strArr2) {
        if (!q(str2)) {
            return false;
        }
        emxc n = n(str, strArr[0], j, bArr);
        if (!n.g()) {
            return false;
        }
        Object c = n.c();
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("sync_status", "SYNCED");
        } else {
            contentValues.putNull("sync_status");
        }
        contentValues.putNull("delete_status");
        contentValues.put("num_times_used", (Long) 0L);
        contentValues.put("file_path", (String) c);
        return ((long) sQLiteDatabase.update("geller_file_table", contentValues, str3, strArr2)) > 0;
    }

    private static long s(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            long delete = sQLiteDatabase.delete("geller_file_table", "file_path = ?", strArr);
            sQLiteDatabase.setTransactionSuccessful();
            return delete;
        } finally {
            sQLiteDatabase.endTransaction();
        }
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
                        j += m((SQLiteDatabase) obj, "data_type = ? AND ".concat(String.valueOf(str3)), new String[]{str2});
                    }
                }
            } else {
                if (i == 2) {
                    eynr eynrVar = (eynr) eynsVar.d;
                    eyom eyomVar = this.d;
                    duhf.e(eynrVar, eyomVar);
                    j = m((SQLiteDatabase) obj, (eynrVar.b.size() == 0 && eynrVar.c.size() == 0) ? "data_type = ?" : "data_type = ? AND " + duhf.f(eynrVar, eyomVar), new String[]{str2});
                } else if (i == 4 && ((Boolean) eynsVar.d).booleanValue()) {
                    j = m((SQLiteDatabase) ((emxn) emxcVar).a, "data_type = ?", new String[]{str2});
                }
            }
            ((SQLiteDatabase) obj).setTransactionSuccessful();
            return j;
        } finally {
            ((SQLiteDatabase) obj).endTransaction();
        }
    }

    @Override // defpackage.duhb
    public final /* synthetic */ eynk b(emxc emxcVar, Set set) {
        return eynk.a;
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
            sb.append("AND key like ?");
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
                sb.append(" AND sync_status = ? ");
                arrayList.add("SYNCED");
            } else {
                sb.append(" AND sync_status IS NULL ");
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
        ((enrr) ((enrr) a.d()).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "read", 352, "GellerFileStorage.java")).t("Selection query is: %s", sb);
        return k((SQLiteDatabase) ((emxn) emxcVar).a, sb.toString(), (String[]) arrayList.toArray(new String[0]), (1 & eyoyVar.b) != 0 ? emxc.j(Integer.valueOf(eyoyVar.e)) : emux.a);
    }

    @Override // defpackage.duhb
    public final String[] e(emxc emxcVar, String str) {
        emxf.l(true);
        emux emuxVar = emux.a;
        return (String[]) duhf.d((SQLiteDatabase) ((emxn) emxcVar).a, "geller_file_table", "key", "data_type = ? AND timestamp_micro >= 0 AND delete_status IS NULL", new String[]{str}, emuxVar, emuxVar).toArray(new String[0]);
    }

    @Override // defpackage.duhb
    public final long f(emxc emxcVar, String str, eyoj eyojVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4) {
        String b;
        emxf.l(true);
        String a2 = duhf.a(emxcVar4);
        ArrayList arrayList = new ArrayList();
        arrayList.add("data_type = ?");
        if (!a2.isEmpty()) {
            arrayList.add(a2);
        }
        int i = eyojVar.b;
        if (i == 1) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll((eyojVar.b == 1 ? (eyog) eyojVar.c : eyog.a).b);
            arrayList.add(duhf.g(arrayList2));
            b = new emww(" AND ").b(arrayList);
        } else {
            if (i != 2) {
                ((enrr) ((enrr) a.i()).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "updateElementStatus", 435, "GellerFileStorage.java")).q("Unexpected element_filtering in GellerElementSelectionParams.");
                return 0L;
            }
            eyoi eyoiVar = (eyoi) eyojVar.c;
            if (eyoiVar.b.size() != 0 || eyoiVar.c.size() != 0) {
                arrayList.add(duhf.i(eyoiVar.b, eyoiVar.c));
            }
            b = new emww(" AND ").b(arrayList);
        }
        ContentValues contentValues = new ContentValues();
        if (emxcVar2.g()) {
            ((Boolean) emxcVar2.c()).booleanValue();
            contentValues.put("sync_status", "SYNCED");
        }
        if (emxcVar3.g()) {
            ((Boolean) emxcVar3.c()).booleanValue();
            contentValues.put("deletion_sync_status", "DELETION_SYNCED");
        }
        if (emxcVar4.g()) {
            emxcVar4.c();
            emxcVar4.c();
            contentValues.put("delete_status", "PENDING_DELETE");
        }
        return ((SQLiteDatabase) ((emxn) emxcVar).a).update("geller_file_table", contentValues, b, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // defpackage.duhb
    public final boolean g(emxc emxcVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        String str2;
        String[] strArr2;
        List d;
        ?? r3;
        boolean p;
        emxf.l(emxcVar.g());
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) emxcVar.c();
        sQLiteDatabase.beginTransactionNonExclusive();
        boolean z2 = false;
        try {
            try {
                str2 = "data_type = ? AND " + duhf.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?";
                strArr2 = new String[]{str, String.valueOf(j)};
                d = duhf.d(sQLiteDatabase, "geller_file_table", "file_path", str2, strArr2, emxc.j("timestamp_micro DESC"), emux.a);
                r3 = 1;
                r3 = 1;
            } catch (Throwable th) {
                th = th;
            }
        } catch (IllegalStateException e) {
            e = e;
        }
        try {
            if (d.size() == 1 && new HashSet(duhf.d(sQLiteDatabase, "geller_file_table", "key", "file_path = ?", new String[]{(String) d.get(0)}, emxc.j("timestamp_micro DESC"), emux.a)).equals(new HashSet(Arrays.asList(strArr)))) {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                p = r(sQLiteDatabase2, str, strArr, j, z, bArr, (String) d.get(0), str2, strArr2);
                sQLiteDatabase = sQLiteDatabase2;
                sQLiteDatabase.setTransactionSuccessful();
                r3 = sQLiteDatabase2;
            } else {
                SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
                p = p(sQLiteDatabase3, str, strArr, j, z, bArr, d);
                sQLiteDatabase = sQLiteDatabase3;
                sQLiteDatabase.setTransactionSuccessful();
                r3 = sQLiteDatabase3;
            }
            z2 = p;
        } catch (IllegalStateException e2) {
            e = e2;
            sQLiteDatabase = r3;
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "write", (char) 151, "GellerFileStorage.java")).q("Failed to write file.");
            sQLiteDatabase.endTransaction();
            return z2;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = r3;
            Throwable th3 = th;
            sQLiteDatabase.endTransaction();
            throw th3;
        }
        sQLiteDatabase.endTransaction();
        return z2;
    }

    @Override // defpackage.duhb
    public final eypp h(emxc emxcVar, String str, String[] strArr, long j, boolean z, byte[] bArr) {
        eypp eyppVar;
        emxf.l(true);
        eypm eypmVar = (eypm) eypp.a.createBuilder();
        eypn eypnVar = (eypn) eypo.a.createBuilder();
        Object obj = ((emxn) emxcVar).a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            try {
                String str2 = "data_type = ? AND " + duhf.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?";
                String[] strArr2 = {str, String.valueOf(j)};
                List d = duhf.d((SQLiteDatabase) obj, "geller_file_table", "file_path", str2, strArr2, emxc.j("timestamp_micro DESC"), emux.a);
                if (d.size() == 1) {
                    List<String> d2 = duhf.d((SQLiteDatabase) obj, "geller_file_table", "key", "file_path = ?", new String[]{(String) d.get(0)}, emxc.j("timestamp_micro DESC"), emux.a);
                    if (new HashSet(d2).equals(new HashSet(Arrays.asList(strArr)))) {
                        boolean r = r((SQLiteDatabase) obj, str, strArr, j, z, bArr, (String) d.get(0), str2, strArr2);
                        ((SQLiteDatabase) obj).setTransactionSuccessful();
                        if (!r) {
                            throw new GellerException("Failed to update existing file entries.");
                        }
                        for (String str3 : d2) {
                            eynb eynbVar = (eynb) eync.a.createBuilder();
                            eynbVar.copyOnWrite();
                            eync eyncVar = (eync) eynbVar.instance;
                            str3.getClass();
                            eyncVar.b |= 2;
                            eyncVar.d = str3;
                            eynbVar.copyOnWrite();
                            eync eyncVar2 = (eync) eynbVar.instance;
                            eyncVar2.b |= 1;
                            eyncVar2.c = j;
                            eypnVar.b((eync) eynbVar.build());
                        }
                        eypmVar.copyOnWrite();
                        eypp eyppVar2 = (eypp) eypmVar.instance;
                        eypo eypoVar = (eypo) eypnVar.build();
                        eypoVar.getClass();
                        eyppVar2.e = eypoVar;
                        eyppVar2.b |= 2;
                        eyppVar = (eypp) eypmVar.build();
                        return eyppVar;
                    }
                }
                boolean p = p((SQLiteDatabase) obj, str, strArr, j, z, bArr, d);
                ((SQLiteDatabase) obj).setTransactionSuccessful();
                if (!p) {
                    throw new GellerException("Failed to insert new file entries.");
                }
                for (String str4 : strArr) {
                    eynb eynbVar2 = (eynb) eync.a.createBuilder();
                    eynbVar2.copyOnWrite();
                    eync eyncVar3 = (eync) eynbVar2.instance;
                    str4.getClass();
                    eyncVar3.b |= 2;
                    eyncVar3.d = str4;
                    eynbVar2.copyOnWrite();
                    eync eyncVar4 = (eync) eynbVar2.instance;
                    eyncVar4.b |= 1;
                    eyncVar4.c = j;
                    eypnVar.a((eync) eynbVar2.build());
                }
                eyppVar = (eypp) eypmVar.build();
                return eyppVar;
            } catch (IllegalStateException e) {
                ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerFileStorage", "writeWithResult", (char) 245, "GellerFileStorage.java")).q("Failed to write file.");
                sQLiteDatabase.endTransaction();
                return (eypp) eypmVar.build();
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // defpackage.duhb
    public final /* synthetic */ boolean i(emxc emxcVar, eypl eyplVar) {
        return duha.a(this, emxcVar, eyplVar);
    }
}
