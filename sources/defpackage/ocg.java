package defpackage;

import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ocg extends ffkk implements ffji {
    final /* synthetic */ oco a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocg(oco ocoVar) {
        super(1);
        this.a = ocoVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        odk odkVar = (odk) obj;
        odkVar.getClass();
        if (((Boolean) this.a.d.c()).booleanValue()) {
            Handler handler = (Handler) this.a.n.a();
            oco ocoVar = this.a;
            handler.removeCallbacks(ocoVar.o);
            ocoVar.o.a.set(odkVar);
            handler.post(ocoVar.o);
        } else {
            Iterator it = this.a.l.iterator();
            while (it.hasNext()) {
                ((ffji) it.next()).invoke(odkVar);
            }
        }
        return ffcu.a;
    }
}
