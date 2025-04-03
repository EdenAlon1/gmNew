package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdq implements ffxy {
    final /* synthetic */ cwds a;

    public cwdq(cwds cwdsVar) {
        this.a = cwdsVar;
    }

    @Override // defpackage.ffxy
    public final /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        cwds cwdsVar = this.a;
        cwir cwirVar = (cwir) obj;
        synchronized (cwdsVar.b) {
            Iterator it = cwirVar.e.iterator();
            while (it.hasNext()) {
                aoku aokuVar = ((ChipData) it.next()).a;
                Map map = cwdsVar.c;
                if (map.get(aokuVar) == null) {
                    map.put(aokuVar, cwdsVar.a(aokuVar));
                }
            }
        }
        return ffcu.a;
    }
}
