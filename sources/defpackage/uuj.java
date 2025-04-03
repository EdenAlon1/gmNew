package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uuj implements ejwd<List<cnlf>> {
    final /* synthetic */ uuy a;

    public uuj(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        csjy.p("Bugle", th, "Error: getting reminders within conversation. ".concat(String.valueOf(String.valueOf(this.a.ap))));
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Long l;
        List<cnlf> list = (List) obj;
        cmj cmjVar = new cmj();
        uuy uuyVar = this.a;
        uuyVar.aI = cmjVar;
        Iterator it = uuyVar.Y.iterator();
        while (it.hasNext()) {
            ((ListenableFuture) it.next()).cancel(false);
        }
        uuyVar.Y.clear();
        cpn cpnVar = new cpn();
        for (cnlf cnlfVar : list) {
            MessageIdType b = bdhb.b(cnlfVar.c);
            long j = cnlfVar.d;
            if (uuyVar.aH.containsKey(b)) {
                ksr ksrVar = (ksr) uuyVar.aH.get(b);
                boolean F = (ksrVar == null || (l = (Long) ksrVar.a) == null) ? false : uuyVar.F(l.longValue());
                boolean F2 = uuyVar.F(j);
                boolean contains = uuyVar.aI.contains(b);
                if (!F2 && F && !contains) {
                    uuyVar.aI.add(b);
                    csjy.c("ReminderAnimation", "Snoozed reminder ".concat(String.valueOf(b.b())));
                }
            }
            cpnVar.put(b, new ksr(Long.valueOf(j), false));
            if (!uuyVar.F(j)) {
                errk schedule = uuyVar.K.schedule(erry.a, uuyVar.c(j), TimeUnit.MILLISECONDS);
                uuyVar.L.i(ejlp.b(schedule), new ejlm(b), uuyVar.ah);
                uuyVar.Y.add(schedule);
            }
        }
        uuyVar.aH = cpnVar;
        upx upxVar = uuyVar.aB;
        ura uraVar = upxVar.c;
        if (!uraVar.k.isEmpty() || !list.isEmpty()) {
            enhd enhdVar = new enhd();
            for (cnlf cnlfVar2 : list) {
                enhdVar.k(bdhb.b(cnlfVar2.c), Long.valueOf(cnlfVar2.d));
            }
            uraVar.k = enhdVar.c();
            uraVar.p();
        }
        upxVar.b.F();
    }

    @Override // defpackage.ejwd
    public final void hB() {
    }
}
