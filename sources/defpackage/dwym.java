package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwym implements dwyh {
    public final dwub a;
    private final Context b;
    private final Executor c;
    private final engw d;

    public dwym(Context context, Executor executor, dwub dwubVar, engw engwVar) {
        this.b = context;
        this.c = executor;
        this.a = dwubVar;
        this.d = engwVar;
    }

    @Override // defpackage.dwyh
    public final ListenableFuture a() {
        return this.a.b();
    }

    @Override // defpackage.dwyh
    public final ListenableFuture b(dwns dwnsVar) {
        dwqo n = dwqp.n();
        n.c(dwnsVar.c);
        n.b(dwou.a);
        if ((dwnsVar.b & 4) != 0) {
            String str = dwnsVar.e;
            Account account = null;
            if (!str.isEmpty()) {
                int indexOf = str.indexOf(":");
                if (indexOf < 0) {
                    dxth.h("%s: Unable to parse Account with string = '%s'", "AccountUtil", str);
                } else {
                    String substring = str.substring(0, indexOf);
                    String substring2 = str.substring(indexOf + 1);
                    if (dwxn.b(substring2) && dwxn.b(substring)) {
                        account = new Account(substring2, substring);
                    } else {
                        dxth.i("%s: Unable to create Account with name = '%s', type = '%s'", "AccountUtil", substring2, substring);
                    }
                }
            }
            ((dwod) n).a = emxc.i(account);
        }
        return this.a.d(n.a());
    }

    @Override // defpackage.dwyh
    public final ListenableFuture c(final String str) {
        dwrr i = dwrs.i();
        i.b(true);
        return elfr.j(this.a.f(i.c()), new emwl() { // from class: dwyj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw engwVar = (engw) obj;
                ArrayList arrayList = new ArrayList();
                int size = engwVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str2 = str;
                    dwns dwnsVar = (dwns) engwVar.get(i2);
                    if (!dwnsVar.c.toLowerCase(Locale.US).contains(str2.toLowerCase(Locale.US)) && !dwnsVar.e.toLowerCase(Locale.US).contains(str2.toLowerCase(Locale.US)) && !dwnsVar.j.toLowerCase(Locale.US).contains(str2.toLowerCase(Locale.US))) {
                        Iterator<E> it = dwnsVar.k.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((String) it.next()).toLowerCase(Locale.US).contains(str2.toLowerCase(Locale.US))) {
                                arrayList.add(dwnsVar);
                                break;
                            }
                        }
                    } else {
                        arrayList.add(dwnsVar);
                    }
                }
                Collections.sort(arrayList, new Comparator() { // from class: dwyl
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        dwns dwnsVar2 = (dwns) obj2;
                        dwns dwnsVar3 = (dwns) obj3;
                        return enem.b.c(dwnsVar2.c, dwnsVar3.c).c(dwnsVar2.e, dwnsVar3.e).c(dwnsVar2.j, dwnsVar3.j).b(dwnsVar2.f, dwnsVar3.f).a();
                    }
                });
                return engw.n(arrayList);
            }
        }, this.c);
    }

    @Override // defpackage.dwyh
    public final ListenableFuture d() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            engw engwVar = this.d;
            if (i >= ((enou) engwVar).c) {
                return dycg.c(arrayList).a(new Callable() { // from class: dwyk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                }, this.c);
            }
            arrayList.add(((dwqt) engwVar.get(i)).a(this.a));
            i++;
        }
    }

    @Override // defpackage.dwyh
    public final ListenableFuture e() {
        final dwub dwubVar = this.a;
        final Context context = this.b;
        final Executor executor = this.c;
        return elfr.i(new erog() { // from class: dwya
            @Override // defpackage.erog
            public final ListenableFuture a() {
                String k = dwub.this.k();
                ((enrr) ((enrr) dwyg.a.h()).h("com/google/android/libraries/mdi/download/debug/DebugUtil", "logDebugInfo", 27, "DebugUtil.java")).q("MDD Lib dump:");
                int i = 0;
                while (i <= k.length() / 4000) {
                    int i2 = i * 4000;
                    i++;
                    ((enrr) ((enrr) dwyg.a.h()).h("com/google/android/libraries/mdi/download/debug/DebugUtil", "logDebugInfo", 33, "DebugUtil.java")).t("%s", k.substring(i2, Math.min(k.length(), i * 4000)));
                }
                final Executor executor2 = executor;
                final Context context2 = context;
                return dycd.e(dwyg.a("MDD.WIFI.CHARGING.PERIODIC.TASK", context2, executor2)).g(new eroh() { // from class: dwyd
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return dwyg.a("MDD.CELLULAR.CHARGING.PERIODIC.TASK", context2, executor2);
                    }
                }, executor2).g(new eroh() { // from class: dwye
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return dwyg.a("MDD.CHARGING.PERIODIC.TASK", context2, executor2);
                    }
                }, executor2).g(new eroh() { // from class: dwyf
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return dwyg.a("MDD.MAINTENANCE.PERIODIC.GCM.TASK", context2, executor2);
                    }
                }, executor2);
            }
        }, executor);
    }

    @Override // defpackage.dwyh
    public final ListenableFuture f(final String str) {
        return elfr.i(new erog() { // from class: dwyi
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return dwym.this.a.g(str);
            }
        }, this.c);
    }
}
