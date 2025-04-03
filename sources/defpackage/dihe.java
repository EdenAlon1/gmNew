package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dihe implements digw {
    public final AtomicBoolean a = new AtomicBoolean();
    private HashMap j = null;
    public final HashMap b = new HashMap(16, 1.0f);
    public final HashMap c = new HashMap(16, 1.0f);
    public final HashMap d = new HashMap(16, 1.0f);
    public final HashMap e = new HashMap(16, 1.0f);
    public Object f = null;
    public boolean g = false;
    public String[] h = new String[0];
    public final dihb i = new dihb();

    public static final void e(ContentResolver contentResolver) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }

    public static final Object f(Map map, String str, Object obj) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj2 = map.get(str);
        return obj2 != null ? obj2 : obj;
    }

    @Override // defpackage.digw
    public final String a(ContentResolver contentResolver, String str, String str2) {
        ContentProviderClient acquireUnstableContentProviderClient;
        String str3;
        e(contentResolver);
        synchronized (this) {
            c(contentResolver);
            Object obj = this.f;
            if (this.j.containsKey(str)) {
                String str4 = (String) this.j.get(str);
                if (str4 != null) {
                    str2 = str4;
                }
                return str2;
            }
            for (String str5 : this.h) {
                if (str.startsWith(str5)) {
                    if (!this.g) {
                        b(contentResolver, this.h);
                        if (this.j.containsKey(str)) {
                            String str6 = (String) this.j.get(str);
                            if (str6 != null) {
                                str2 = str6;
                            }
                            return str2;
                        }
                    }
                    return str2;
                }
            }
            try {
                acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(digv.a);
                try {
                } catch (Throwable th) {
                    acquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (dihd unused) {
            }
            if (acquireUnstableContentProviderClient == null) {
                throw new dihd("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor query = acquireUnstableContentProviderClient.query(digv.a, null, null, new String[]{str}, null);
                try {
                    if (query == null) {
                        throw new dihd("ContentProvider query returned null cursor");
                    }
                    if (query.moveToFirst()) {
                        str3 = query.getString(1);
                        query.close();
                        acquireUnstableContentProviderClient.release();
                    } else {
                        query.close();
                        acquireUnstableContentProviderClient.release();
                        str3 = null;
                    }
                    if (str3 != null && str3.equals(str2)) {
                        str3 = str2;
                    }
                    synchronized (this) {
                        if (obj == this.f) {
                            this.j.put(str, str3);
                        }
                    }
                    return str3 != null ? str3 : str2;
                } finally {
                }
            } catch (RemoteException e) {
                throw new dihd(e);
            }
        }
    }

    public final void b(ContentResolver contentResolver, String[] strArr) {
        try {
            HashMap hashMap = (HashMap) dihb.a(contentResolver, strArr, new dihc() { // from class: digy
                @Override // defpackage.dihc
                public final Map a(int i) {
                    return new HashMap(i, 1.0f);
                }
            });
            if (!hashMap.isEmpty()) {
                Set keySet = hashMap.keySet();
                keySet.removeAll(this.b.keySet());
                keySet.removeAll(this.c.keySet());
                keySet.removeAll(this.d.keySet());
                keySet.removeAll(this.e.keySet());
            }
            if (!hashMap.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = hashMap;
                } else {
                    this.j.putAll(hashMap);
                }
            }
            this.g = true;
        } catch (dihd unused) {
        }
    }

    public final void c(ContentResolver contentResolver) {
        if (this.j == null) {
            this.a.set(false);
            this.j = new HashMap(16, 1.0f);
            this.f = new Object();
            contentResolver.registerContentObserver(digv.a, true, new diha(this));
            return;
        }
        if (this.a.getAndSet(false)) {
            this.j.clear();
            this.b.clear();
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f = new Object();
            this.g = false;
        }
    }

    public final void d(Object obj, Map map, String str, Object obj2) {
        if (obj == this.f) {
            map.put(str, obj2);
            this.j.remove(str);
        }
    }
}
