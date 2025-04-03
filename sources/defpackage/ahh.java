package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahh implements bjt {
    final /* synthetic */ aku a;
    final /* synthetic */ ahu b;

    public ahh(ahu ahuVar, aku akuVar) {
        this.b = ahuVar;
        this.a = akuVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        final bgk bgkVar;
        if (!(th instanceof bdw)) {
            if (th instanceof CancellationException) {
                this.b.q("Unable to configure camera cancelled");
                return;
            }
            if (this.b.A == 10) {
                this.b.L(10, new asu(4, th));
            }
            ahu ahuVar = this.b;
            Objects.toString(ahuVar);
            avw.d("Camera2CameraImpl", "Unable to configure camera ".concat(ahuVar.toString()), th);
            ahu ahuVar2 = this.b;
            if (ahuVar2.j == this.a) {
                ahuVar2.O();
                return;
            }
            return;
        }
        ahu ahuVar3 = this.b;
        bdy bdyVar = ((bdw) th).a;
        Iterator it = ahuVar3.a.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                bgkVar = null;
                break;
            } else {
                bgkVar = (bgk) it.next();
                if (bgkVar.f().contains(bdyVar)) {
                    break;
                }
            }
        }
        if (bgkVar != null) {
            ahu ahuVar4 = this.b;
            final bge bgeVar = bgkVar.f;
            ScheduledExecutorService a = bjm.a();
            if (bgeVar != null) {
                ahuVar4.r("Posting surface closed", new Throwable());
                a.execute(new Runnable() { // from class: agm
                    @Override // java.lang.Runnable
                    public final void run() {
                        bge.this.a(bgkVar);
                    }
                });
            }
        }
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i = ((asb) this.b.p).e;
    }
}
