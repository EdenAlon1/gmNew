package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eahe implements eaha {
    private static final entd d = entd.c("GnpSdk");
    public final Context a;
    public final eafq b;
    public final ears c;
    private final eapp e;
    private final earu f;
    private final eajw g;
    private final Set h;
    private final eajz i;

    public eahe(Context context, eapp eappVar, eafq eafqVar, earu earuVar, eajw eajwVar, ears earsVar, eajz eajzVar, Set set) {
        context.getClass();
        eappVar.getClass();
        earuVar.getClass();
        eajwVar.getClass();
        earsVar.getClass();
        eajzVar.getClass();
        set.getClass();
        this.a = context;
        this.e = eappVar;
        this.b = eafqVar;
        this.f = earuVar;
        this.g = eajwVar;
        this.c = earsVar;
        this.i = eajzVar;
        this.h = set;
    }

    private final void d(eagt eagtVar) {
        ffqz.a(ffhe.a, new eahb(this, eagtVar, null));
    }

    private final void e(Throwable th) {
        this.g.a(this.i.a(37));
        ((ensz) ((ensz) d.j()).g(th)).q("Account change event handling skipped due to error getting device accounts");
    }

    private final void f(boolean z) {
        ((efkw) this.c.w.get()).a(this.a.getPackageName(), Boolean.valueOf(z));
    }

    private static final boolean g(eagt eagtVar, Set set) {
        easy s = eagtVar.s();
        if (s instanceof eatf) {
            return set.contains(((eatf) eagtVar.s()).a);
        }
        if (s instanceof eatb) {
            return ffdx.au(set, eagtVar.k());
        }
        if ((s instanceof eatd) || (s instanceof eaua) || (s instanceof eaty)) {
            return true;
        }
        throw new ffcd();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[SYNTHETIC] */
    @Override // defpackage.eaha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Intent r10, defpackage.eafp r11, long r12) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eahe.a(android.content.Intent, eafp, long):void");
    }

    @Override // defpackage.eaha
    public final boolean b(Intent intent) {
        return ffkj.e("android.accounts.LOGIN_ACCOUNTS_CHANGED", intent.getAction());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0149, code lost:
    
        if (r15 != r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0149 -> B:12:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c9 -> B:32:0x00d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eagt r13, defpackage.eagt r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eahe.c(eagt, eagt, ffgu):java.lang.Object");
    }
}
