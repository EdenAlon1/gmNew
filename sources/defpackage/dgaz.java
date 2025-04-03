package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgaz extends dgbi {
    final /* synthetic */ Map a;
    final /* synthetic */ dgbd b;
    final /* synthetic */ cuwk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgaz(dgbd dgbdVar, String str, Map map, cuwk cuwkVar) {
        super(str, null);
        this.a = map;
        this.c = cuwkVar;
        this.b = dgbdVar;
    }

    @Override // defpackage.dgbi
    protected final void c(dgau dgauVar) {
        this.b.c.removeCallbacksAndMessages(this);
        dgbd dgbdVar = this.b;
        final dgbc dgbcVar = new dgbc(dgbdVar.a, dgauVar, dgbdVar.c, this.a, this.e, this.g, dgbdVar.b, this.c);
        final long a = dgbcVar.e.a();
        dgbcVar.c.postAtTime(new Runnable() { // from class: dgbb
            @Override // java.lang.Runnable
            public final void run() {
                String str = "getResults snapshot timeout: " + a + " ms";
                dgbc dgbcVar2 = dgbc.this;
                dgbh dgbhVar = new dgbh(dgbcVar2.a, dgbcVar2.f, str, dgbcVar2.g);
                String a2 = dgbhVar.a(new HashMap());
                dgbhVar.close();
                dgbcVar.a(a2);
            }
        }, dgbcVar, a + SystemClock.uptimeMillis());
        dgau dgauVar2 = dgbcVar.b;
        String a2 = dgauVar2.a(dgbcVar.d);
        dgauVar2.close();
        dgbcVar.c.removeCallbacksAndMessages(dgbcVar);
        dgbcVar.a(a2);
    }
}
