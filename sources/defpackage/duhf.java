package defpackage;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.geller.portable.GellerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duhf {
    public static final enru a = enru.c("com/google/android/libraries/geller/portable/database/GellerDatabaseUtil");

    static String a(emxc emxcVar) {
        if (!emxcVar.g()) {
            return "";
        }
        emxcVar.c();
        return String.format("(%s IS NULL)", "delete_status");
    }

    static String b(String str, String str2, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        Iterator it = iterable.iterator();
        boolean z = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            sb.append(true != z ? ", " : "(");
            if (next instanceof Number) {
                sb.append(next);
            } else {
                DatabaseUtils.appendEscapedSQLString(sb, String.valueOf(next));
            }
            z = false;
        }
        if (z) {
            sb.append("(");
        }
        sb.append(")");
        return sb.toString();
    }

    static List c(List list) {
        return list.isEmpty() ? engw.r("") : list;
    }

    static List d(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr, emxc emxcVar, emxc emxcVar2) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = sQLiteDatabase.query(true, str, new String[]{str2}, str3, strArr, null, null, (String) emxcVar.f(), emxcVar2.g() ? ((Integer) emxcVar2.c()).toString() : null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(query.getString(query.getColumnIndexOrThrow(str2)));
                } finally {
                }
            }
            if (query != null) {
                query.close();
                return arrayList;
            }
        } catch (IllegalArgumentException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseUtil", "readStringFromTable", '=', "GellerDatabaseUtil.java")).q("Column doesn't exist");
        }
        return arrayList;
    }

    static void e(eynr eynrVar, eyom eyomVar) {
        if (eynrVar.b.size() == 0 && eynrVar.c.size() == 0 && eyomVar.e) {
            throw new GellerException("Deleting all data via an empty deletion selection is no longer supported. Please use delete_all instead.");
        }
    }

    static String f(eynr eynrVar, eyom eyomVar) {
        if (eynrVar.b.size() == 0 && eynrVar.c.size() == 0 && eyomVar.e) {
            throw new UnsupportedOperationException("Deleting all data via an empty deletion selection is no longer supported. Please use delete_all instead.");
        }
        String concat = eynrVar.b.size() != 0 ? "".concat(b("timestamp_micro", "IN", eynrVar.b)) : "";
        if (eynrVar.c.size() == 0) {
            return concat;
        }
        if (!concat.isEmpty()) {
            concat = concat.concat(" AND ");
        }
        return concat.concat(b("key", "IN", eynrVar.c));
    }

    static String g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eync eyncVar = (eync) it.next();
            if (!eyncVar.d.isEmpty() || eyncVar.c != 0) {
                ArrayList arrayList2 = new ArrayList();
                if ((eyncVar.b & 1) != 0) {
                    long j = eyncVar.c;
                    if (j >= 0) {
                        arrayList2.add(b("timestamp_micro", "=", engw.r(Long.valueOf(j))));
                    }
                }
                if (!eyncVar.d.isEmpty()) {
                    arrayList2.add(b("key", "=", engw.r(eyncVar.d)));
                }
                arrayList.add(String.format("(%s)", new emww(" AND ").b(arrayList2)));
            }
        }
        return String.format("(%s)", new emww(" OR ").b(arrayList));
    }

    static List h(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = enkr.e(list, 100).iterator();
        while (it.hasNext()) {
            arrayList.add(g((List) it.next()));
        }
        return arrayList;
    }

    static String i(List list, List list2) {
        String concat = list.isEmpty() ? "" : "".concat(b("timestamp_micro", "IN", list));
        if (list2.isEmpty()) {
            return concat;
        }
        if (!concat.isEmpty()) {
            concat = concat.concat(" AND ");
        }
        return concat.concat(b("key", "IN", list2));
    }
}
