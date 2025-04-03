package defpackage;

import android.content.res.Resources;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duze {
    public final Resources a;
    private final ConcurrentHashMap b = new ConcurrentHashMap();

    public duze(Resources resources) {
        this.a = resources;
    }

    public final String a(int i) {
        try {
            ConcurrentHashMap concurrentHashMap = this.b;
            Integer valueOf = Integer.valueOf(i);
            final Resources resources = this.a;
            resources.getClass();
            return (String) ConcurrentMap.EL.computeIfAbsent(concurrentHashMap, valueOf, new Function() { // from class: duzd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return resources.getString(((Integer) obj).intValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } catch (Resources.NotFoundException | NullPointerException e) {
            ((ensz) ((ensz) ((ensz) duwi.a.i()).g(e)).h("com/google/android/libraries/inputmethod/preferences/PreferenceKeyCache", "get", 37, "PreferenceKeyCache.java")).r("Failed to get key name from id %d: ", i);
            return "";
        }
    }
}
