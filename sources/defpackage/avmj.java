package defpackage;

import android.util.LruCache;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avmj implements avmb {
    private final ffbr a;

    public avmj(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.avmb
    public final elfl a(awui awuiVar) {
        return elfo.e(Optional.ofNullable((avmz) ((LruCache) this.a.b()).get(awuiVar)));
    }

    @Override // defpackage.avmb
    public final elfl b(Iterable iterable) {
        LruCache lruCache = (LruCache) this.a.b();
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            awui awuiVar = (awui) it.next();
            avmz avmzVar = (avmz) lruCache.get(awuiVar);
            if (avmzVar != null) {
                hashMap.put(awuiVar, avmzVar);
            }
        }
        return elfo.e(hashMap);
    }

    @Override // defpackage.avmb
    public final elfl c(Map map) {
        Map.EL.forEach(map, new BiConsumer() { // from class: avmi
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                avmj.this.e((awui) obj, (avmz) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        return elfo.e(null);
    }

    @Override // defpackage.avmb
    public final elfl d(awui awuiVar, avmz avmzVar) {
        e(awuiVar, avmzVar);
        return elfo.e(null);
    }

    public final void e(awui awuiVar, avmz avmzVar) {
        avmz avmzVar2 = (avmz) ((LruCache) this.a.b()).get(awuiVar);
        if (avmzVar2 == null || avmzVar2.b().compareTo(avmzVar.b()) <= 0) {
            ((LruCache) this.a.b()).put(awuiVar, avmzVar);
        }
    }
}
