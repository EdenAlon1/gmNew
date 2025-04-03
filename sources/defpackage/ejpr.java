package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejpr extends pqy {
    private static final enru a = enru.c("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory");
    private final Map b;
    private final elbx c;
    private final Map d;

    public ejpr(Map map, elbx elbxVar, Map map2) {
        this.b = map;
        this.c = elbxVar;
        this.d = map2;
    }

    @Override // defpackage.pqy
    public final ppr a(Context context, String str, WorkerParameters workerParameters) {
        ffbr ffbrVar;
        String str2;
        try {
            elav f = this.c.f("WorkerFactory.createWorker()");
            try {
                if (str.equals(TikTokListenableWorker.class.getName())) {
                    enip a2 = ejqn.a(workerParameters.c);
                    if (a2.size() != 1) {
                        ((enrr) ((enrr) a.i()).h("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 88, "TikTokWorkerFactory.java")).t("A TikTok worker was created, but it has %s count tags instead of 1, so it was skipped", new ecgg(a2.size()));
                        f.close();
                        return null;
                    }
                    str2 = (String) enjk.l(a2);
                    ffbrVar = (ffbr) this.b.get(str2);
                } else {
                    ffbrVar = (ffbr) this.b.get(str);
                    if (ffbrVar != null) {
                        workerParameters.c.add(ejqn.b(str));
                    }
                    str2 = str;
                }
                ffbr ffbrVar2 = ffbrVar;
                if (ffbrVar2 != null) {
                    if (str2 != null) {
                        TikTokListenableWorker tikTokListenableWorker = new TikTokListenableWorker(context, this.c, this.d, ffbrVar2, workerParameters, elad.a);
                        f.close();
                        return tikTokListenableWorker;
                    }
                    str2 = null;
                }
                if (str.equals(TikTokListenableWorker.class.getName())) {
                    ((enrr) ((enrr) a.i()).h("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "maybeLogMissingWorkerMessage", 160, "TikTokWorkerFactory.java")).t("A worker with the `permanentTag` %s does not exist in this version of the application. This suggests that an app upgrade removed this worker and now work scheduled before the upgrade can't run. If this is surprising, refer to go/tiktok/dev/androidx/work#deprecating, then reach out to #tiktok on YAQS, or g/tiktok-users if the situation is still unclear.", str2);
                }
                f.close();
                return null;
            } finally {
            }
        } catch (RuntimeException e) {
            ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", (char) 148, "TikTokWorkerFactory.java")).q("TikTokWorkerFactory failed to instantiate a TikTokWorker");
            return null;
        }
    }
}
