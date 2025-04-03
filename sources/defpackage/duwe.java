package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duwe implements duof {
    public static final duwe a = new duwe();
    public final Map c;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    private final Map d = new HashMap();

    public duwe() {
        Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(duwg.a)));
        this.c = new WeakHashMap();
        duoe.a.a(this);
    }

    public final duwd a(Class cls, String str, Object obj) {
        duwd duwdVar;
        duwd duwdVar2 = (duwd) this.b.get(str);
        if (duwdVar2 != null) {
            if (duwdVar2.b != cls) {
                if (duzy.a) {
                    throw new IllegalStateException("Flag [" + str + "] with different type already exists: " + duwdVar2.b.toString());
                }
                this.b.remove(str);
            }
            duwdVar2.i(obj);
            return duwdVar2;
        }
        if (duzy.a && (TextUtils.isEmpty(str) || !str.matches("^[a-zA-Z0-9_]*$"))) {
            throw new IllegalStateException(a.a(str, "Invalid flag name [", "]"));
        }
        duwdVar2 = new duwd(str, cls);
        synchronized (this.d) {
            Set set = (Set) this.d.remove(str);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    duwdVar2.g((duwh) it.next());
                }
            }
            duwdVar = (duwd) this.b.putIfAbsent(str, duwdVar2);
        }
        if (duwdVar != null) {
            duwdVar2 = duwdVar;
        }
        duwdVar2.i(obj);
        return duwdVar2;
    }
}
