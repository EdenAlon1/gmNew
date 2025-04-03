package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dywe {
    private static dywe a;
    private final Map b = new HashMap();

    public static synchronized dywe a() {
        dywe dyweVar;
        synchronized (dywe.class) {
            if (a == null) {
                a = new dywe();
            }
            dyweVar = a;
        }
        return dyweVar;
    }

    public final synchronized void b(Uri uri) {
        if (this.b.containsKey(uri)) {
            Iterator it = ((Set) this.b.get(uri)).iterator();
            while (it.hasNext()) {
                ((ContentObserver) it.next()).dispatchChange(false, uri);
            }
        }
    }

    final synchronized void c(Uri uri, ContentObserver contentObserver) {
        Set set;
        if (this.b.containsKey(uri)) {
            set = (Set) this.b.get(uri);
        } else {
            set = Collections.newSetFromMap(new WeakHashMap());
            this.b.put(uri, set);
        }
        set.add(contentObserver);
    }
}
