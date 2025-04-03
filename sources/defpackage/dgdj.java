package defpackage;

import android.os.RemoteException;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import com.google.android.gms.droidguard.internal.IDroidGuardHandle;
import com.google.android.gms.droidguard.internal.IDroidGuardService;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgdj implements dgcl {
    public final dgcy a;
    public final Executor b;
    public final dgdc c;

    public dgdj(dgcy dgcyVar, Executor executor, dgdc dgdcVar) {
        this.a = dgcyVar;
        this.b = executor;
        this.c = dgdcVar;
    }

    static dgdi b(dfwc dfwcVar, String str, dgcn dgcnVar, int i, dgci dgciVar) {
        dgbz dgbzVar;
        dgciVar.c(3, dgch.FINE);
        try {
            IDroidGuardHandle createDroidGuardHandle = ((IDroidGuardService) dfwcVar.w()).createDroidGuardHandle();
            dgciVar.c(4, dgch.FINE);
            DroidGuardResultsRequest droidGuardResultsRequest = new DroidGuardResultsRequest();
            int i2 = droidGuardResultsRequest.a.getInt("clientVersion");
            droidGuardResultsRequest.a.putInt("clientVersion", (i2 - (i2 % 10)) + 2);
            droidGuardResultsRequest.a.putAll(((dgck) dgcnVar).d);
            droidGuardResultsRequest.b(i);
            try {
                DroidGuardInitReply initWithExtras = createDroidGuardHandle.initWithExtras(str, droidGuardResultsRequest);
                if (initWithExtras == null) {
                    try {
                        createDroidGuardHandle.init(str);
                    } catch (RemoteException e) {
                        throw dgcq.b(e, "Failed on init() call");
                    }
                }
                dgciVar.c(5, dgch.FINE);
                if (initWithExtras != null) {
                    try {
                        dgbzVar = dgbo.a(dfwcVar.c, dgciVar, initWithExtras);
                    } catch (dgbv | dgca | IOException e2) {
                        throw dgcq.a(e2, 8, "Failed to start the app-side VM process");
                    }
                } else {
                    dgbzVar = null;
                }
                dgciVar.c(13, dgch.COARSE);
                return new dgcr(createDroidGuardHandle, dgbzVar);
            } catch (RemoteException e3) {
                throw dgcq.b(e3, "Failed on initWithExtras() call");
            }
        } catch (RemoteException e4) {
            throw dgcq.b(e4, "Failed to create DroidGuard handle");
        }
    }

    @Override // defpackage.dgcl
    public final dhre a(final String str, final Map map, final dgcn dgcnVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        final long currentTimeMillis2 = System.currentTimeMillis();
        final dgci dgciVar = new dgci(Arrays.asList(fdmj.b().split(",", -1)).contains(str) ? dgch.FINE : dgch.COARSE, dfym.a);
        dgciVar.c(2, dgch.COARSE);
        dhre a = dgdq.a(this.b, this.a.d(1, 1, new dgcx() { // from class: dgdg
            @Override // defpackage.dgcx
            public final Object a(dfwc dfwcVar) {
                dgdj dgdjVar = dgdj.this;
                dgcy dgcyVar = dgdjVar.a;
                String str2 = str;
                dgcn dgcnVar2 = dgcnVar;
                int a2 = dgcyVar.a();
                dgci dgciVar2 = dgciVar;
                dgdi b = dgdj.b(dfwcVar, str2, dgcnVar2, a2, dgciVar2);
                Executor executor = dgdjVar.b;
                if (executor == null) {
                    throw new NullPointerException("Null executor");
                }
                dgdc dgdcVar = dgdjVar.c;
                if (str2 != null) {
                    return new dgdo(dgdjVar.a, executor, dgdcVar, str2, dgcnVar2, dgciVar2, ((dgcr) b).a);
                }
                throw new NullPointerException("Null flowName");
            }
        }), ((dgck) dgcnVar).a);
        a.o(this.b, new dhqs() { // from class: dgdh
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar) {
                dgdj.this.c.a(35502, dhreVar, currentTimeMillis2, System.currentTimeMillis());
            }
        });
        dhre g = a.g(this.b, new dhrd() { // from class: dgde
            @Override // defpackage.dhrd
            public final dhre a(Object obj) {
                final dgco dgcoVar = (dgco) obj;
                dhre a2 = dgcoVar.a(map);
                a2.o(dgdj.this.b, new dhqs() { // from class: dgdd
                    @Override // defpackage.dhqs
                    public final void a(dhre dhreVar) {
                        dgco.this.close();
                    }
                });
                return a2;
            }
        });
        g.o(this.b, new dhqs() { // from class: dgdf
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar) {
                dgdj.this.c.a(35501, dhreVar, currentTimeMillis, System.currentTimeMillis());
            }
        });
        return g;
    }
}
