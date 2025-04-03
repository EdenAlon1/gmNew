package defpackage;

import android.accounts.Account;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejar {
    public static final enru a = enru.c("com/google/apps/tiktok/account/data/google/GcoreAccountName");
    public final boolean b;
    private final emxc c;
    private final emxc d;

    public ejar(emxc emxcVar, emxc emxcVar2, emxc emxcVar3) {
        this.c = emxcVar;
        this.d = emxcVar2;
        this.b = !((Boolean) emxcVar3.e(false)).booleanValue();
    }

    public static String d(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        return g(lowerCase) ? String.valueOf(lowerCase.substring(0, lowerCase.lastIndexOf("@")).replace(".", "").replace('i', 'l').replace('1', 'l').replace('0', 'o').replace('2', 'z').replace('5', 's')).concat("@gmail.com") : lowerCase;
    }

    public static boolean g(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        return lowerCase.endsWith("@googlemail.com") || lowerCase.endsWith("@gmail.com");
    }

    public static final boolean h(eixz eixzVar) {
        return !eixzVar.i;
    }

    public final ListenableFuture a(eisx eisxVar) {
        return erny.f(b(eisxVar), eldl.a(new emwl() { // from class: ejap
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str = (String) obj;
                emxf.b(str != null, "AccountId was not a Google account");
                return new Account(str, "com.google");
            }
        }), erpp.a);
    }

    public final ListenableFuture b(eisx eisxVar) {
        return eisxVar != null ? ernq.f(erny.f(((eiyk) ((emxn) this.c).a).c(eisxVar), eldl.a(new emwl() { // from class: ejan
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ejar.this.e(((eixn) obj).b());
            }
        }), erpp.a), IllegalArgumentException.class, eldl.a(new emwl() { // from class: ejao
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                throw new eizq((IllegalArgumentException) obj);
            }
        }), erpp.a) : erqt.h(new eizq());
    }

    public final ListenableFuture c(final String str) {
        return str != null ? erny.f(((eiyk) ((emxn) this.c).a).e(), eldl.a(new emwl() { // from class: ejam
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eyfw checkIsLite;
                eyfw checkIsLite2;
                List<eixn> list = (List) obj;
                Iterator it = list.iterator();
                while (true) {
                    String str2 = str;
                    ejar ejarVar = ejar.this;
                    if (!it.hasNext()) {
                        String d = ejar.d(str2);
                        for (eixn eixnVar : list) {
                            if (ejar.h(eixnVar.b()) && ejarVar.f(eixnVar.b())) {
                                if (d.equals(ejar.d(eixnVar.b().g))) {
                                    return eixnVar.a();
                                }
                                if (ejarVar.b) {
                                    eixz b = eixnVar.b();
                                    checkIsLite = eyfy.checkIsLite(ejbv.a);
                                    b.b(checkIsLite);
                                    Object l = b.r.l(checkIsLite.d);
                                    for (String str3 : ((ejbo) (l == null ? checkIsLite.b : checkIsLite.c(l))).d) {
                                        if (ejar.g(str3)) {
                                            ((enrr) ((enrr) ejar.a.i()).h("com/google/apps/tiktok/account/data/google/GcoreAccountName", "toAccountId", 180, "GcoreAccountName.java")).q("Found google email address as the old primary email address. This shouldn't happen because the primary email address cannot change once set to a google domain one.");
                                            if (d.equals(ejar.d(str3))) {
                                                return eixnVar.a();
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        throw new eizq();
                    }
                    eixn eixnVar2 = (eixn) it.next();
                    if (ejar.h(eixnVar2.b()) && ejarVar.f(eixnVar2.b())) {
                        if (str2.equals(eixnVar2.b().g)) {
                            return eixnVar2.a();
                        }
                        if (ejarVar.b) {
                            eixz b2 = eixnVar2.b();
                            checkIsLite2 = eyfy.checkIsLite(ejbv.a);
                            b2.b(checkIsLite2);
                            Object l2 = b2.r.l(checkIsLite2.d);
                            Iterator<E> it2 = ((ejbo) (l2 == null ? checkIsLite2.b : checkIsLite2.c(l2))).d.iterator();
                            while (it2.hasNext()) {
                                if (str2.equals((String) it2.next())) {
                                    return eixnVar2.a();
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }), erpp.a) : erqt.h(new eizq());
    }

    public final String e(eixz eixzVar) {
        if (((String) ((emxn) this.d).a).equals(eixzVar.k)) {
            return eixzVar.g;
        }
        return null;
    }

    public final boolean f(eixz eixzVar) {
        return ((String) ((emxn) this.d).a).equals(eixzVar.k);
    }
}
