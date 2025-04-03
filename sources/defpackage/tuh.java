package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.contacts.corp.CorpContactsRefreshWorker;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tuh extends cpdo {
    public static final cskc a = cskc.g("Bugle", "CorpContactsRefreshStartupTask");
    public final Context b;
    private final errl c;

    public tuh(Context context, errl errlVar) {
        this.b = context;
        this.c = errlVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("CorpContactsRefreshStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        return elfo.f(new Runnable() { // from class: tug
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) csrd.b.e()).booleanValue();
                csjb a2 = tuh.a.a();
                a2.I("Executing CorpContactsRefreshStartupTask.");
                a2.B("isEnabled", booleanValue);
                a2.r();
                tuh tuhVar = tuh.this;
                if (!booleanValue) {
                    pqr.a(tuhVar.b).b("corp_contacts_refresh_worker");
                    return;
                }
                pqs a3 = pqr.a(tuhVar.b);
                poz pozVar = poz.KEEP;
                pqh pqhVar = new pqh(CorpContactsRefreshWorker.class, CorpContactsRefreshWorker.g.toMillis(), TimeUnit.MILLISECONDS);
                poh pohVar = new poh();
                pohVar.a = true;
                pohVar.c(3);
                pqhVar.g(pohVar.a());
                a3.f("corp_contacts_refresh_worker", pozVar, (pqi) pqhVar.b());
            }
        }, this.c);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}
