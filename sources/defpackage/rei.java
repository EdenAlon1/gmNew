package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rei implements qtw {
    private final rdl a;
    private final qxd b;

    public rei(rdl rdlVar, qxd qxdVar) {
        this.a = rdlVar;
        this.b = qxdVar;
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        boolean z;
        ree reeVar;
        rju rjuVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof ree) {
            reeVar = (ree) inputStream;
            z = false;
        } else {
            z = true;
            reeVar = new ree(inputStream, this.b);
        }
        boolean z2 = z;
        synchronized (rju.a) {
            rjuVar = (rju) rju.a.poll();
        }
        if (rjuVar == null) {
            rjuVar = new rju();
        }
        rju rjuVar2 = rjuVar;
        rjuVar2.b = reeVar;
        rkd rkdVar = new rkd(rjuVar2);
        reh rehVar = new reh(reeVar, rjuVar2);
        try {
            rdl rdlVar = this.a;
            qwv a = rdlVar.a(new rdx(rkdVar, rdlVar.g, rdlVar.f), i, i2, qtuVar, rehVar);
            rjuVar2.a();
            if (z2) {
                reeVar.b();
            }
            return a;
        } finally {
        }
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        return true;
    }
}
