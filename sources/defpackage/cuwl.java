package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuwl implements kfd {
    final /* synthetic */ cuwp a;
    final /* synthetic */ String b;
    final /* synthetic */ Map c;

    public cuwl(cuwp cuwpVar, String str, Map map) {
        this.a = cuwpVar;
        this.b = str;
        this.c = map;
    }

    @Override // defpackage.kfd
    public final Object a(kfb kfbVar) {
        final cuwk cuwkVar = new cuwk(kfbVar);
        dgat dgatVar = new dgat(this.a.b);
        String str = this.b;
        Map map = this.c;
        if (fdmg.b()) {
            final dgbn dgbnVar = (dgbn) dgatVar.b.get();
            dgbnVar.b.a(str, map, dgbn.a(null)).s(new dhqs() { // from class: dgbm
                @Override // defpackage.dhqs
                public final void a(dhre dhreVar) {
                    Context context = dgbn.this.a;
                    Exception h = dhreVar.h();
                    cuwkVar.a(h != null ? dgbn.b(context, h) : ((dhrm) dhreVar).d ? dgbn.b(context, new CancellationException("Task is canceled")) : ((dgcp) dhreVar.i()).a());
                }
            });
            return "TachyonSpamGrpc.getDroidGuardResults";
        }
        final dgbd dgbdVar = dgatVar.a;
        final dgaz dgazVar = new dgaz(dgbdVar, str, map, cuwkVar);
        final long a = dgazVar.e.a();
        dgbdVar.c.postAtTime(new Runnable() { // from class: dgax
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = "getResults init timeout: " + a + " ms";
                dgbd dgbdVar2 = dgbd.this;
                Context context = dgbdVar2.a;
                dgbk dgbkVar = dgbdVar2.b;
                dgbi dgbiVar = dgazVar;
                dgbiVar.d(new dgbh(context, dgbkVar, str2, dgbiVar.g));
            }
        }, dgazVar, a + SystemClock.uptimeMillis());
        dgbdVar.b.b(dgazVar);
        return "TachyonSpamGrpc.getDroidGuardResults";
    }
}
