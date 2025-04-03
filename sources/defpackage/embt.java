package defpackage;

import io.grpc.Status;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class embt implements erqj {
    private final feeb a;

    public embt(feeb feebVar) {
        this.a = feebVar;
    }

    @Override // defpackage.erqj
    public final /* synthetic */ void b(Object obj) {
        febo feboVar;
        Map map = ((embu) obj).b;
        feeb feebVar = this.a;
        try {
            synchronized (feebVar.b) {
                feee feeeVar = feebVar.b;
                Map map2 = feeeVar.e;
                if (map2 == null || map2 != map) {
                    febo feboVar2 = new febo();
                    for (String str : map.keySet()) {
                        if (str.endsWith("-bin")) {
                            febh febhVar = febo.b;
                            int i = febj.d;
                            febg febgVar = new febg(str, febhVar);
                            Iterator it = ((List) map.get(str)).iterator();
                            while (it.hasNext()) {
                                feboVar2.g(febgVar, eoeg.e.k((String) it.next()));
                            }
                        } else {
                            febf febfVar = febo.c;
                            int i2 = febj.d;
                            febe febeVar = new febe(str, febfVar);
                            Iterator it2 = ((List) map.get(str)).iterator();
                            while (it2.hasNext()) {
                                feboVar2.g(febeVar, (String) it2.next());
                            }
                        }
                    }
                    feeeVar.d = feboVar2;
                    feebVar.b.e = map;
                }
                feboVar = feebVar.b.d;
            }
            fdxf fdxfVar = feebVar.a;
            fera feraVar = (fera) fdxfVar;
            emxf.m(!feraVar.i, "apply() or fail() already called");
            feboVar.getClass();
            feraVar.c.f(feboVar);
            fdyn a = feraVar.e.a();
            try {
                fejs d = ((fera) fdxfVar).a.d(((fera) fdxfVar).b, ((fera) fdxfVar).c, ((fera) fdxfVar).d, ((fera) fdxfVar).f);
                feraVar.e.f(a);
                feraVar.b(d);
            } catch (Throwable th) {
                feraVar.e.f(a);
                throw th;
            }
        } catch (Throwable th2) {
            feebVar.a.a(Status.j.withDescription("Failed to convert credential metadata").d(th2));
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (th instanceof ExecutionException) {
            th = th.getCause();
        }
        feeb feebVar = this.a;
        if ((th instanceof embl) && ((embl) th).a()) {
            feebVar.a.a(Status.p.withDescription("Credentials failed to obtain metadata").d(th));
        } else {
            feebVar.a.a(Status.j.withDescription("Failed computing credential metadata").d(th));
        }
    }
}
