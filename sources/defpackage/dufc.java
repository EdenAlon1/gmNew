package defpackage;

import android.accounts.Account;
import com.google.android.libraries.geller.portable.Geller;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dufc {
    public static final /* synthetic */ int a = 0;
    private final emzl b;

    static {
        TimeUnit.DAYS.toMicros(7L);
    }

    public dufc(final dufb dufbVar) {
        this.b = new emzf().b(new emzg(new emwl() { // from class: duex
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = dufc.a;
                dufb dufbVar2 = dufb.this;
                dufp dufpVar = new dufp(dufbVar2.m, dufbVar2.f, dufbVar2.k);
                emwl emwlVar = dufbVar2.c;
                emwl emwlVar2 = dufbVar2.h;
                eyev eyevVar = dufbVar2.i;
                dudi dudiVar = new dudi(dufpVar);
                ExecutorService executorService = dufbVar2.d;
                Geller geller = dufbVar2.a;
                ExecutorService executorService2 = dufbVar2.e;
                return new dufo((emxc) obj, geller, dufbVar2.q, dufbVar2.b, emwlVar, dufbVar2.g, emwlVar2, eyevVar, dufbVar2.j, dudiVar, executorService, executorService2, dufbVar2.f, dufbVar2.l, emtt.a, dufbVar2.n, dufbVar2.o, dufbVar2.m);
            }
        }));
    }

    public final ListenableFuture a(String str, String str2, Account account, String str3, enip enipVar, int i, emxc emxcVar) {
        try {
            return ((dufd) this.b.a(emxc.i(account))).a(str3, str2, str, enipVar, i, emxcVar);
        } catch (ersm | ExecutionException e) {
            enqu listIterator = enipVar.listIterator();
            while (listIterator.hasNext()) {
                ((ezib) listIterator.next()).name();
            }
            return erqt.h(new duew("Failed to load GellerSyncScheduler", e));
        }
    }
}
