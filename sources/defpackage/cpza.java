package defpackage;

import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpza implements cskg {
    public static final /* synthetic */ int g = 0;
    private static final enip h = enip.v(' ', '@', '.', ',', ':', '-', '(', ')', '+', '[', ']', '{', '}', '<', '>');
    public final ffbr a;
    public final LruCache b;
    public final LruCache c;
    public final LruCache d;
    public final LruCache e;
    public final LruCache f;
    private final ayhi i;
    private final LruCache j;
    private final LruCache k;
    private final enru l;

    public cpza(ayhi ayhiVar, ffbr ffbrVar) {
        ayhiVar.getClass();
        ffbrVar.getClass();
        this.i = ayhiVar;
        this.a = ffbrVar;
        Object e = coxg.b.e();
        e.getClass();
        this.b = new LruCache(((Number) e).intValue());
        Object e2 = coxg.b.e();
        e2.getClass();
        this.c = new LruCache(((Number) e2).intValue());
        Object e3 = coxg.b.e();
        e3.getClass();
        this.d = new LruCache(((Number) e3).intValue());
        Object e4 = coxg.b.e();
        e4.getClass();
        this.j = new LruCache(((Number) e4).intValue());
        Object e5 = coxg.b.e();
        e5.getClass();
        this.e = new LruCache(((Number) e5).intValue());
        Object e6 = coxg.b.e();
        e6.getClass();
        this.f = new LruCache(((Number) e6).intValue());
        Object e7 = coxg.b.e();
        e7.getClass();
        this.k = new LruCache(((Number) e7).intValue());
        this.l = enru.c("com/google/android/apps/messaging/shared/telephony/forwardsync/ForwardSyncCache");
    }

    static /* synthetic */ Object e(cpza cpzaVar, LruCache lruCache, Object obj, ffbr ffbrVar, String str, ffji ffjiVar, ffji ffjiVar2, int i) {
        if ((i & 16) != 0) {
            ffjiVar = new ffji() { // from class: cpyu
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    int i2 = cpza.g;
                    obj2.getClass();
                    return obj2.toString();
                }
            };
        }
        ffji ffjiVar3 = ffjiVar;
        if ((i & 32) != 0) {
            ffjiVar2 = new ffji() { // from class: cpyv
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    int i2 = cpza.g;
                    obj2.getClass();
                    return obj2.toString();
                }
            };
        }
        ffji ffjiVar4 = ffjiVar2;
        if ((i & 8) != 0) {
            str = "";
        }
        return cpzaVar.f(lruCache, obj, ffbrVar, str, ffjiVar3, ffjiVar4);
    }

    private final Object f(LruCache lruCache, Object obj, ffbr ffbrVar, String str, ffji ffjiVar, ffji ffjiVar2) {
        Object obj2;
        synchronized (lruCache) {
            obj2 = lruCache.get(obj);
            if (obj2 == null) {
                obj2 = ffbrVar.b();
                lruCache.put(obj, obj2);
                String str2 = (String) ffjiVar.invoke(obj);
                obj2.getClass();
                ((enrr) this.l.g().h("com/google/android/apps/messaging/shared/telephony/forwardsync/ForwardSyncCache", "getOrCreateFromCache", 196, "ForwardSyncCache.kt")).J("cache update [%s]: [%s] -> [%s]", str, str2, (String) ffjiVar2.invoke(obj2));
            }
        }
        return obj2;
    }

    public final aoku a(String str, int i, ffbr ffbrVar) {
        return (aoku) f(this.j, i + "::" + str, ffbrVar, "miCache", new ffji() { // from class: cpyw
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str2 = (String) obj;
                str2.getClass();
                return cpza.this.c(str2);
            }
        }, new ffji() { // from class: cpyx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                aoku aokuVar = (aoku) obj;
                aokuVar.getClass();
                return cpza.this.c(aokuVar.toString());
            }
        });
    }

    public final cpbd b(cpxu cpxuVar, ffbr ffbrVar) {
        return (cpbd) e(this, this.k, cpxuVar, ffbrVar, "threadDataCache", null, new ffji() { // from class: cpyy
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cpbd cpbdVar = (cpbd) obj;
                int i = cpza.g;
                cpbdVar.getClass();
                return String.valueOf(cpbdVar.hashCode());
            }
        }, 16);
    }

    public final String c(String str) {
        ArrayList arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(Character.valueOf(this.i.a(h).a(str.charAt(i))));
        }
        return ffdx.aA(arrayList, "", null, null, null, 62);
    }

    public final void d() {
        this.b.evictAll();
        this.c.evictAll();
        this.d.evictAll();
        this.j.evictAll();
        this.e.evictAll();
        this.k.evictAll();
        this.f.evictAll();
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        ((enrr) this.l.h().h("com/google/android/apps/messaging/shared/telephony/forwardsync/ForwardSyncCache", "reclaimMemory", 215, "ForwardSyncCache.kt")).q("reclaimMemory: Clearing caches");
        d();
    }
}
