package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euxt {
    private static WeakReference a;
    private final SharedPreferences b;
    private euxn c;
    private final Executor d;

    private euxt(SharedPreferences sharedPreferences, Executor executor) {
        this.d = executor;
        this.b = sharedPreferences;
    }

    public static synchronized euxt b(Context context, Executor executor) {
        synchronized (euxt.class) {
            WeakReference weakReference = a;
            euxt euxtVar = weakReference != null ? (euxt) weakReference.get() : null;
            if (euxtVar != null) {
                return euxtVar;
            }
            euxt euxtVar2 = new euxt(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            euxtVar2.d();
            a = new WeakReference(euxtVar2);
            return euxtVar2;
        }
    }

    private final synchronized void d() {
        euxn euxnVar = new euxn(this.b, this.d);
        synchronized (euxnVar.d) {
            euxnVar.d.clear();
            String string = euxnVar.a.getString(euxnVar.b, "");
            if (!TextUtils.isEmpty(string) && string.contains(euxnVar.c)) {
                String[] split = string.split(euxnVar.c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        euxnVar.d.add(str);
                    }
                }
            }
        }
        this.c = euxnVar;
    }

    final synchronized euxs a() {
        String str;
        euxn euxnVar = this.c;
        synchronized (euxnVar.d) {
            str = (String) euxnVar.d.peek();
        }
        int i = euxs.d;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                return new euxs(split[0], split[1]);
            }
        }
        return null;
    }

    final synchronized void c(euxs euxsVar) {
        final euxn euxnVar = this.c;
        ArrayDeque arrayDeque = euxnVar.d;
        String str = euxsVar.c;
        synchronized (arrayDeque) {
            if (euxnVar.d.remove(str)) {
                euxnVar.e.execute(new Runnable() { // from class: euxm
                    @Override // java.lang.Runnable
                    public final void run() {
                        euxn euxnVar2 = euxn.this;
                        synchronized (euxnVar2.d) {
                            SharedPreferences.Editor edit = euxnVar2.a.edit();
                            String str2 = euxnVar2.b;
                            StringBuilder sb = new StringBuilder();
                            Iterator it = euxnVar2.d.iterator();
                            while (it.hasNext()) {
                                sb.append((String) it.next());
                                sb.append(euxnVar2.c);
                            }
                            edit.putString(str2, sb.toString()).commit();
                        }
                    }
                });
            }
        }
    }
}
