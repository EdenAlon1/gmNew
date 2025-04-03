package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eutg {
    private final SharedPreferences a;

    public eutg(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    private final synchronized String i(long j) {
        return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private final synchronized String j(String str) {
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private final synchronized void k() {
        SharedPreferences sharedPreferences = this.a;
        long j = sharedPreferences.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
    }

    private final synchronized void l(String str) {
        String j = j(str);
        if (j == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(j, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.a.edit().remove(j).commit();
        } else {
            this.a.edit().putStringSet(j, hashSet).commit();
        }
    }

    private final synchronized void m(String str, String str2) {
        l(str2);
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.a.edit().putStringSet(str, hashSet).commit();
    }

    final synchronized List a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(i(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(new eusv(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        e(System.currentTimeMillis());
        return arrayList;
    }

    final synchronized void b() {
        SharedPreferences sharedPreferences = this.a;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i = 0;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String i2 = i(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(i2)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(i2);
                    edit.putStringSet(key, hashSet);
                    i++;
                } else {
                    edit.remove(key);
                }
            }
        }
        if (i == 0) {
            edit.remove("fire-count");
        } else {
            edit.putLong("fire-count", i);
        }
        edit.commit();
    }

    final synchronized void c() {
        String i = i(System.currentTimeMillis());
        this.a.edit().putString("last-used-date", i).commit();
        l(i);
    }

    final synchronized void d(long j, String str) {
        SharedPreferences sharedPreferences = this.a;
        String i = i(j);
        if (sharedPreferences.getString("last-used-date", "").equals(i)) {
            String j2 = j(i);
            if (j2 != null && !j2.equals(str)) {
                m(str, i);
                return;
            }
            return;
        }
        long j3 = this.a.getLong("fire-count", 0L);
        if (j3 + 1 == 30) {
            k();
            j3 = this.a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(i);
        this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j3 + 1).putString("last-used-date", i).commit();
    }

    final synchronized void e(long j) {
        this.a.edit().putLong("fire-global", j).commit();
    }

    final synchronized boolean f(long j, long j2) {
        return i(j).equals(i(j2));
    }

    final synchronized boolean g(long j) {
        return h(j);
    }

    final synchronized boolean h(long j) {
        if (!this.a.contains("fire-global")) {
            this.a.edit().putLong("fire-global", j).commit();
            return true;
        }
        if (f(this.a.getLong("fire-global", -1L), j)) {
            return false;
        }
        this.a.edit().putLong("fire-global", j).commit();
        return true;
    }
}
