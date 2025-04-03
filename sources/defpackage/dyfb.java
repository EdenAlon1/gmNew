package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyfb implements dydd {
    public final effc a;
    public final dyfh b;
    private final Object c = new Object();
    private final Map d = new HashMap();
    private final Context e;
    private final Executor f;
    private final efbm g;
    private final efgc h;
    private final dydg i;
    private final dlpw j;
    private final String k;
    private final dfpi l;
    private final dhlv m;

    public dyfb(Context context, Executor executor, String str, efbm efbmVar, efgc efgcVar, dyfh dyfhVar, dydg dydgVar, dlpw dlpwVar, dfpi dfpiVar, effc effcVar, dhlv dhlvVar) {
        this.e = context;
        this.f = executor;
        this.g = efbmVar;
        this.h = efgcVar;
        this.b = dyfhVar;
        this.i = dydgVar;
        this.j = dlpwVar;
        this.k = str;
        this.l = dfpiVar;
        this.a = effcVar;
        this.m = dhlvVar;
    }

    @Override // defpackage.dydd
    public final dydc a(Account account) {
        Account account2;
        dydc dydcVar;
        synchronized (this.c) {
            if (this.d.containsKey(account)) {
                account2 = account;
            } else {
                Map map = this.d;
                Context context = this.e;
                Pattern pattern = efbs.a;
                efbr efbrVar = new efbr(context);
                efbrVar.a = "com.google.android.gms";
                efbrVar.e("managed");
                efbrVar.f("mdisync");
                efbrVar.c(account);
                efbrVar.g("profilesync/public/profile_info.pb");
                Uri a = efbrVar.a();
                efgc efgcVar = this.h;
                effz h = efga.h();
                ((efeq) h).a = new efes(this.a);
                h.e(dyff.a);
                h.f(a);
                dycv dycvVar = new dycv(efgcVar.a(h.a()));
                dyfk dyfkVar = new dyfk(this.f, this.g);
                final AtomicReference atomicReference = new AtomicReference(new dyfl() { // from class: dyev
                    @Override // defpackage.dyfl
                    public final void m() {
                    }
                });
                final AtomicReference atomicReference2 = new AtomicReference(new dyfm() { // from class: dyew
                    @Override // defpackage.dyfm
                    public final void n() {
                    }
                });
                emyl emylVar = new emyl() { // from class: dyex
                    @Override // defpackage.emyl
                    public final Object get() {
                        return (dyfl) atomicReference.get();
                    }
                };
                emyl emylVar2 = new emyl() { // from class: dyey
                    @Override // defpackage.emyl
                    public final Object get() {
                        return (dyfm) atomicReference2.get();
                    }
                };
                dyft dyftVar = new dyft(this.e, new dhep(this.e, new dheg(account)), this.k, account, emylVar, emylVar2);
                account2 = account;
                if (this.i.a(this.e)) {
                    dyct.d(this.e.getApplicationContext(), this.k);
                    final dlpw dlpwVar = this.j;
                    ListenableFuture f = erny.f(erny.f(duin.a(this.m.a()), new emwl() { // from class: dyeu
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            String str;
                            PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) obj;
                            return (pseudonymousIdToken == null || (str = pseudonymousIdToken.a) == null) ? "" : str;
                        }
                    }, erpp.a), new emwl() { // from class: dwnx
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return new dwnw(dlpw.this);
                        }
                    }, erpp.a);
                    this.b.getClass();
                    emxc.j(f);
                } else {
                    dyct.d(this.e.getApplicationContext(), this.k);
                    dlpw dlpwVar2 = this.j;
                    account2.toString();
                    emxc.j(new dwnw(dlpwVar2));
                }
                Context context2 = this.e;
                final dyfh dyfhVar = this.b;
                dyfhVar.getClass();
                emyl emylVar3 = new emyl() { // from class: dyet
                    @Override // defpackage.emyl
                    public final Object get() {
                        return new dyfg(dyfh.this.a);
                    }
                };
                new dwnv();
                dyct.d(this.e.getApplicationContext(), this.k);
                new dyfi(emylVar3);
                dyes dyesVar = new dyes(dyftVar, context2, dyfkVar, dycvVar, this.l, new dyez(this, a));
                dyesVar.g(new dyfa(this, a), erpp.a);
                atomicReference.set(dyesVar);
                atomicReference2.set(dyesVar);
                map.put(account2, dyesVar);
            }
            dydcVar = (dydc) this.d.get(account2);
        }
        return dydcVar;
    }
}
