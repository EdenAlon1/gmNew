package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.tachyon.clientapi.IClientApiService;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgep extends dfra {
    public final Context a;
    private final emyl b;

    public dgep(Context context, emyl emylVar) {
        super(context, dgdz.b, dfqo.q, dfqz.a);
        this.a = context;
        int i = dgee.a;
        emys.a(new dged(context));
        this.b = emylVar;
    }

    public static boolean b(eseg esegVar, esee eseeVar) {
        return esegVar != null && new eygk(esegVar.c, eseg.a).contains(eseeVar);
    }

    final dhre a() {
        final dhri dhriVar = new dhri();
        final dgeb dgebVar = new dgeb("wrapper");
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dgem
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                IBinder b = ((dftv) obj).b();
                dfwv.n(b);
                ((dhri) obj2).b(IClientApiService.Stub.asInterface(b));
            }
        };
        dfunVar.c = 12301;
        dhre e = dhrt.e(i(dfunVar.a()), 5L, TimeUnit.SECONDS);
        e.t(new dhqv() { // from class: dgek
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                dgeb dgebVar2 = dgeb.this;
                dgebVar2.initCause(exc);
                dhriVar.a(dgebVar2);
            }
        });
        e.q((Executor) this.b.get(), new dhqy() { // from class: dgel
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                dhre c;
                final dhri dhriVar2 = dhriVar;
                final dgeb dgebVar2 = dgebVar;
                final IClientApiService iClientApiService = (IClientApiService) obj;
                try {
                    eseg esegVar = (eseg) eyfy.parseFrom(eseg.b, iClientApiService.getSupportedApiFeatures(), eyfc.a());
                    final boolean b = dgep.b(esegVar, esee.DUO_KIT_REQUESTS);
                    final boolean b2 = dgep.b(esegVar, esee.MEET_API_REQUESTS);
                    if (!dgep.b(esegVar, esee.SERVICE_API_GET_REGISTERED_ID_TYPE)) {
                        Account[] b3 = dgwf.a(dgep.this.a).b();
                        int length = b3.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                c = dhrt.c(false);
                                break;
                            }
                            Account account = b3[i];
                            if ("Duo".equals(account.name) && "com.google.android.apps.tachyon".equals(account.type)) {
                                c = dhrt.c(true);
                                break;
                            }
                            i++;
                        }
                    } else {
                        dhri dhriVar3 = new dhri();
                        try {
                            iClientApiService.getRegisteredIdType(new dgen(dhriVar3));
                        } catch (RemoteException e2) {
                            if (!dhriVar3.c(e2)) {
                                Log.e("DuoStateFetcher", "Error setting exception--task is already complete.", e2);
                            }
                        }
                        c = dhriVar3.a;
                    }
                    dhre d = c.d(new dhqh() { // from class: dgeh
                        @Override // defpackage.dhqh
                        public final Object a(dhre dhreVar) {
                            IClientApiService iClientApiService2 = iClientApiService;
                            if (!dhreVar.m()) {
                                Exception h = dhreVar.h();
                                h.getClass();
                                return dhrt.b(h);
                            }
                            boolean z = dhreVar.m() && ((Boolean) dhreVar.i()).booleanValue();
                            if (!z || !b2) {
                                return dhrt.c(new dgeg(b, z, false));
                            }
                            dhri dhriVar4 = new dhri();
                            try {
                                iClientApiService2.getMeetApiAvailabilityInfo(new dgeo(dhriVar4));
                            } catch (RemoteException e3) {
                                Log.e("DuoStateFetcher", "Error getting Meet registered.", e3);
                                dhriVar4.b(new dgeg(true, true, false));
                            }
                            return dhriVar4.a;
                        }
                    });
                    d.a(new dhqy() { // from class: dgei
                        @Override // defpackage.dhqy
                        public final void e(Object obj2) {
                            dhri.this.b((dgeg) obj2);
                        }
                    });
                    d.t(new dhqv() { // from class: dgej
                        @Override // defpackage.dhqv
                        public final void d(Exception exc) {
                            Log.e("DuoStateFetcher", "Error getting duo registered.", exc);
                            dgeb dgebVar3 = dgeb.this;
                            dgebVar3.initCause(exc);
                            dhriVar2.a(dgebVar3);
                        }
                    });
                } catch (RemoteException | eygu | NullPointerException e3) {
                    Log.e("DuoStateFetcher", "Error getting features.", e3);
                    dgebVar2.initCause(e3);
                    dhriVar2.a(dgebVar2);
                }
            }
        });
        return dhriVar.a;
    }
}
