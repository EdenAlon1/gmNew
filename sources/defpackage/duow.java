package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duow implements duqk {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/data/DefaultGlobalPreferencesProtoProvider");
    public final effy b;
    public final Executor c;
    public final dupn d;

    public duow(Context context) {
        errm errmVar = dunl.a().e;
        this.c = errmVar;
        efgc efgcVar = duxw.b;
        if (efgcVar == null) {
            synchronized (duxw.class) {
                efgcVar = duxw.b;
                if (efgcVar == null) {
                    efim efimVar = efim.a;
                    HashMap hashMap = new HashMap();
                    efbm efbmVar = duxw.a;
                    if (efbmVar == null) {
                        synchronized (duxw.class) {
                            efbm efbmVar2 = duxw.a;
                            if (efbmVar2 == null) {
                                efcu a2 = efcu.a();
                                efbo efboVar = new efbo(context.getApplicationContext());
                                efdh.a(true, "LockScope will not be used in the custom backend. Only call builderWithOverrideForTest if you want to override the backend for testing, or call builder together with setLockScope to set a new lock scope.", new Object[0]);
                                efboVar.c = a2;
                                efbm efbmVar3 = new efbm(engw.s(new efbp(efboVar), new efce(a2)));
                                duxw.a = efbmVar3;
                                efbmVar2 = efbmVar3;
                            }
                            efbmVar = efbmVar2;
                        }
                    }
                    efgd.a(efho.a, hashMap);
                    efgc efgcVar2 = new efgc(errmVar, efbmVar, efimVar, hashMap);
                    duxw.b = efgcVar2;
                    efgcVar = efgcVar2;
                }
            }
        }
        effz h = efga.h();
        Pattern pattern = efbs.a;
        efbr efbrVar = new efbr(context);
        efbrVar.f("protodatastore");
        efbrVar.g("global_variant_prefs.pb");
        h.f(efbrVar.a());
        h.e(dupy.a);
        this.b = efgcVar.a(h.a());
        this.d = new dupn(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(engw engwVar) {
        int a2;
        int a3 = enjk.a(engwVar, new emxg() { // from class: duot
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((duqm) obj).b == 2;
            }
        });
        if (a3 < 0) {
            return 0;
        }
        duqm duqmVar = (duqm) engwVar.get(a3);
        if (duqmVar.b != 2 || (a2 = dupv.a(((Integer) duqmVar.c).intValue())) == 0) {
            return 1;
        }
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(engw engwVar) {
        int a2;
        int a3 = enjk.a(engwVar, new emxg() { // from class: duor
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((duqm) obj).b == 1;
            }
        });
        if (a3 < 0) {
            return 0;
        }
        duqm duqmVar = (duqm) engwVar.get(a3);
        if (duqmVar.b != 1 || (a2 = duqq.a(((Integer) duqmVar.c).intValue())) == 0) {
            return 1;
        }
        return a2;
    }

    public final void a(final dupy dupyVar) {
        erqt.r(erqc.o(this.b.b(new emwl() { // from class: duos
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return dupy.this;
            }
        }, this.c)), new duov(this, dupyVar), this.c);
    }
}
