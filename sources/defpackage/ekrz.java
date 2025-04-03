package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekrz extends eewk {
    final /* synthetic */ eksb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekrz(eksb eksbVar) {
        super("forceSync");
        this.a = eksbVar;
    }

    @Override // defpackage.eewl
    public final String c(Context context, String[] strArr) {
        String t;
        ekzz f = eleg.f("forceSync");
        try {
            final ektp ektpVar = (ektp) this.a.a.b();
            final Set keySet = this.a.a(strArr).keySet();
            ((enrr) ((enrr) ektp.a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "forceSync", 938, "SyncManagerImpl.java")).q("forceSync(). Running all Synclets, but not rescheduling once finished.");
            final HashMap hashMap = new HashMap();
            ListenableFuture k = elfr.k(ektpVar.h, new eroh() { // from class: ektm
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Map map;
                    Collection collection = keySet;
                    ektp ektpVar2 = ektp.this;
                    synchronized (ektpVar2.i) {
                        Iterator it = collection.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            map = hashMap;
                            if (hasNext) {
                                ektu ektuVar = (ektu) it.next();
                                if (!ektpVar2.k.containsKey(ektuVar)) {
                                    SettableFuture create = SettableFuture.create();
                                    ektpVar2.k.put(ektuVar, create);
                                    map.put(ektuVar, create);
                                }
                            }
                        }
                    }
                    return ektpVar2.i(map);
                }
            }, ektpVar.c);
            f.b(k);
            try {
                Set set = (Set) k.get();
                cmh cmhVar = new cmh();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String b = ((ektu) it.next()).b.b();
                    if (cmhVar.containsKey(b)) {
                        cmhVar.put(b, Integer.valueOf(((Integer) cmhVar.get(b)).intValue() + 1));
                    } else {
                        cmhVar.put(b, 1);
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : cmhVar.entrySet()) {
                    sb.append("Synclet ");
                    sb.append((String) entry.getKey());
                    sb.append(" finished for ");
                    sb.append(entry.getValue());
                    sb.append(" account(s).\n");
                }
                t = sb.toString();
            } catch (InterruptedException e) {
                e = e;
                t = a.t(emyt.a(e), "Error running sync: ");
                f.close();
                return t;
            } catch (ExecutionException e2) {
                e = e2;
                t = a.t(emyt.a(e), "Error running sync: ");
                f.close();
                return t;
            }
            f.close();
            return t;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eewk, defpackage.eewl
    public final String[] d(Context context, String[] strArr) {
        return this.a.b(strArr);
    }
}
