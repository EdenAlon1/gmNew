package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoMedia;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diib {
    public static final dktn a = new dktn("BusinessInfoRetriever");
    public final diia b;
    final diia c;
    private final Context d;
    private final BusinessInfoDatabase e;
    private final ctvb f;
    private final djqt g;
    private final ConcurrentHashMap h;
    private final ConcurrentHashMap i;
    private final ConcurrentHashMap j;

    public diib(Context context, BusinessInfoDatabase businessInfoDatabase, ctvb ctvbVar, djqt djqtVar) {
        dihx dihxVar = new dihx(this, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        this.b = dihxVar;
        this.c = new dihy(this, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.d = context;
        this.e = businessInfoDatabase;
        dihxVar.allowCoreThreadTimeOut(true);
        this.f = ctvbVar;
        this.g = djqtVar;
    }

    final dihu a(String str) {
        dihu dihuVar = new dihu(str, this.d, 0, this.e, this.g);
        dihu dihuVar2 = (dihu) this.i.putIfAbsent(str, dihuVar);
        if (dihuVar2 == null) {
            dkty.l(a, "Caching new business media runnable for botId %s", dktx.GENERIC.c(str));
            return dihuVar;
        }
        dkty.l(a, "Returning cached business media runnable for botId %s", dktx.GENERIC.c(str));
        return dihuVar2;
    }

    final dihu b(String str) {
        dihu dihuVar = new dihu(str, this.d, 2, this.e, this.g);
        dihu dihuVar2 = (dihu) this.i.putIfAbsent(String.valueOf(str).concat("-verifier-logo"), dihuVar);
        if (dihuVar2 == null) {
            dkty.l(a, "Caching new business media runnable for verifier logo for botId %s", dktx.GENERIC.c(str));
            return dihuVar;
        }
        dkty.l(a, "Returning cached business media runnable for verifier logo for botId %s", dktx.GENERIC.c(str));
        return dihuVar2;
    }

    public final dihv c(String str, ctvb ctvbVar) {
        boolean z = diyr.d() && BusinessInfoData.getVerifiedBotPlatform(str) == 1;
        dihv dihvVar = new dihv(str, this.d, this.e, z, ctvbVar);
        dihv dihvVar2 = (dihv) this.h.putIfAbsent(str + "_" + z, dihvVar);
        if (dihvVar2 == null) {
            dkty.l(a, "Caching new business metadata runnable for botId %s", dktx.GENERIC.c(str));
            return dihvVar;
        }
        dkty.l(a, "Returning cached business metadata runnable for botId %s", dktx.GENERIC.c(str));
        return dihvVar2;
    }

    public final dihz d(String str) {
        dihz dihzVar = c(str, this.f).d;
        if (dihzVar != dihz.INFO_LOCALLY_AVAILABLE) {
            return dihzVar;
        }
        dihu a2 = a(str);
        return (diyr.d() && BusinessInfoData.getVerifiedBotPlatform(str) == 1 && a2.d == dihz.INFO_LOCALLY_AVAILABLE) ? b(str).d : a2.d;
    }

    public final void e(String str) {
        dihu b;
        this.e.getClass();
        for (Integer num : BusinessInfoMedia.ALL_MEDIA_TYPES) {
            int intValue = num.intValue();
            if (TextUtils.isEmpty(this.e.getLocalMediaPath(str, intValue))) {
                if (intValue == 0) {
                    dkty.l(a, "Logo image does not exist locally for botId %s", dktx.GENERIC.c(str));
                    intValue = 0;
                } else if (intValue == 1) {
                    dkty.l(a, "Hero image does not exist locally for botId %s", dktx.GENERIC.c(str));
                    intValue = 1;
                } else if (intValue == 2) {
                    dkty.l(a, "Verifier logo image does not exist locally for botId %s", dktx.GENERIC.c(str));
                    intValue = 2;
                } else {
                    dkty.l(a, "Unknown media type %d does not exist locally for botId %s", num, dktx.GENERIC.c(str));
                }
                if (intValue == 0) {
                    dkty.l(a, "Queuing download of logo for botId %s", dktx.GENERIC.c(str));
                    b = a(str);
                } else if (intValue == 1) {
                    dkty.l(a, "Queuing download of hero image for botId %s", dktx.GENERIC.c(str));
                    b = new dihu(str, this.d, 1, this.e, this.g);
                } else {
                    if (intValue != 2) {
                        throw new IllegalStateException(String.format("Unhandled business media type %d", Integer.valueOf(intValue)));
                    }
                    if (diyr.d() && BusinessInfoData.getVerifiedBotPlatform(str) == 1) {
                        dkty.l(a, "Queuing download of verifier logo image for botId %s", dktx.GENERIC.c(str));
                        b = b(str);
                    } else {
                        dkty.l(a, "Skipping unsupported download of verifier logo for botId %s", dktx.GENERIC.c(str));
                    }
                }
                this.c.a(b);
            } else if (intValue == 0) {
                dkty.l(a, "Logo image exists locally for botId %s", dktx.GENERIC.c(str));
            } else if (intValue == 1) {
                dkty.l(a, "Hero image exists locally for botId %s", dktx.GENERIC.c(str));
            } else if (intValue == 2) {
                dkty.l(a, "Verifier logo image exists locally for botId %s", dktx.GENERIC.c(str));
            } else {
                dkty.l(a, "Unknown media type %d exists locally for botId %s", num, dktx.GENERIC.c(str));
            }
        }
    }

    public final boolean f(String str) {
        dihz d = d(str);
        return d == dihz.INFO_LOCALLY_AVAILABLE || d == dihz.SERVER_ERROR || d == dihz.CLIENT_ERROR;
    }

    public final void g(String str, dkkd dkkdVar) {
        if (TextUtils.isEmpty(str)) {
            dkty.h(a, "RBM botId is missing for bot info retrieval.", new Object[0]);
            return;
        }
        dihv c = c(str, this.f);
        if (dkkdVar != null) {
            if (!this.j.containsKey(str)) {
                this.j.putIfAbsent(str, new CopyOnWriteArraySet());
            }
            ((CopyOnWriteArraySet) this.j.get(str)).add(dkkdVar);
        }
        if (c.d == dihz.INFO_LOCALLY_AVAILABLE) {
            dktn dktnVar = a;
            dkty.l(dktnVar, "Bot info is locally available for botId: %s", dktx.GENERIC.c(str));
            e(str);
            Long queryExpiryMillisByBotId = this.e.queryExpiryMillisByBotId(str);
            Long a2 = dkvj.a();
            long longValue = a2.longValue();
            if (queryExpiryMillisByBotId != null && queryExpiryMillisByBotId.longValue() > longValue) {
                dkty.l(dktnVar, "Bot info has not expired for botId: %s expiry: %d currentTime: %d", dktx.GENERIC.c(str), queryExpiryMillisByBotId, a2);
                h(str);
                return;
            }
        }
        dkty.l(a, "Running bot info retrieval for botId: %s", dktx.GENERIC.c(str));
        this.b.a(c);
    }

    public final void h(String str) {
        if (!this.j.containsKey(str)) {
            dkty.l(a, "No listeners set for botId %s", dktx.GENERIC.c(str));
            return;
        }
        dkty.l(a, "Notifying and removing listeners for botId %s", dktx.GENERIC.c(str));
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.j.get(str);
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            dkkd dkkdVar = (dkkd) it.next();
            dkkj dkkjVar = dkkdVar.a;
            String str2 = dkkdVar.b;
            diib diibVar = dkkdVar.c;
            if (str.equals(str2) && diibVar.f(str)) {
                synchronized (dkkjVar.P) {
                    dkkjVar.P.notifyAll();
                }
            }
            copyOnWriteArraySet.remove(dkkdVar);
        }
    }
}
