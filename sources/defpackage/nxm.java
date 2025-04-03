package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxm implements lkr, lmy, lkd, owz {
    public final Context a;
    public nzh b;
    public lkj c;
    public final String d;
    public lkv e;
    public final owy f;
    public boolean g;
    public lkj h;
    public final ffbz i;
    private final Bundle j;
    private final Bundle k;
    private final ffbz l;
    private final lms m;
    private final nyk n;

    public nxm(Context context, nzh nzhVar, Bundle bundle, lkj lkjVar, nyk nykVar, String str, Bundle bundle2) {
        this.a = context;
        this.b = nzhVar;
        this.j = bundle;
        this.c = lkjVar;
        this.n = nykVar;
        this.d = str;
        this.k = bundle2;
        this.e = new lkv(this);
        this.f = owx.a(this);
        ffbz a = ffca.a(new nxi(this));
        this.l = a;
        ffca.a(new nxl(this));
        this.h = lkj.INITIALIZED;
        this.m = (lmg) a.a();
        this.i = ffca.a(nxk.a);
    }

    @Override // defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.lkd
    public final lms R() {
        return this.m;
    }

    @Override // defpackage.lmy
    public final lmx S() {
        if (!this.g) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.e.c == lkj.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        nyk nykVar = this.n;
        if (nykVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.d;
        lmx lmxVar = (lmx) nykVar.a.get(str);
        if (lmxVar != null) {
            return lmxVar;
        }
        lmx lmxVar2 = new lmx();
        nykVar.a.put(str, lmxVar2);
        return lmxVar2;
    }

    @Override // defpackage.lkd
    public final lnx T() {
        loa loaVar = new loa((byte[]) null);
        Context applicationContext = this.a.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            loaVar.b(lmp.b, application);
        }
        loaVar.b(lmc.a, this);
        loaVar.b(lmc.b, this);
        Bundle a = a();
        if (a != null) {
            loaVar.b(lmc.c, a);
        }
        return loaVar;
    }

    @Override // defpackage.owz
    public final owv U() {
        return this.f.a;
    }

    public final Bundle a() {
        if (this.j == null) {
            return null;
        }
        Bundle a = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
        a.putAll(this.j);
        return a;
    }

    public final void b(lkj lkjVar) {
        lkjVar.getClass();
        this.h = lkjVar;
        c();
    }

    public final void c() {
        if (!this.g) {
            this.f.a();
            this.g = true;
            if (this.n != null) {
                lmc.c(this);
            }
            this.f.b(this.k);
        }
        if (this.c.ordinal() < this.h.ordinal()) {
            this.e.f(this.c);
        } else {
            this.e.f(this.h);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof nxm)) {
            nxm nxmVar = (nxm) obj;
            if (ffkj.e(this.d, nxmVar.d) && ffkj.e(this.b, nxmVar.b) && ffkj.e(this.e, nxmVar.e) && ffkj.e(U(), nxmVar.U())) {
                if (ffkj.e(this.j, nxmVar.j)) {
                    return true;
                }
                Bundle bundle = this.j;
                if (bundle == null || (keySet = bundle.keySet()) == null) {
                    return false;
                }
                if (keySet.isEmpty()) {
                    return true;
                }
                for (String str : keySet) {
                    Object obj2 = this.j.get(str);
                    Bundle bundle2 = nxmVar.j;
                    if (!ffkj.e(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = (this.d.hashCode() * 31) + this.b.hashCode();
        Bundle bundle = this.j;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = this.j.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((hashCode * 31) + this.e.hashCode()) * 31) + U().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(" + this.d + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nxm(nxm nxmVar, Bundle bundle) {
        this(nxmVar.a, nxmVar.b, bundle, nxmVar.c, nxmVar.n, nxmVar.d, nxmVar.k);
        nxmVar.getClass();
        this.c = nxmVar.c;
        b(nxmVar.h);
    }
}
