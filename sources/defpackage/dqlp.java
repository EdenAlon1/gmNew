package defpackage;

import android.app.Activity;
import j$.util.Optional;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqlp implements dqli {
    public final dqkk a;
    public final eg b;
    private final Set c;
    private final dqlq d;

    public dqlp(Activity activity, Optional optional, dqkk dqkkVar) {
        activity.getClass();
        dqkkVar.getClass();
        this.a = dqkkVar;
        this.c = new LinkedHashSet();
        this.d = (dqlq) fflm.b(optional);
        if (!(activity instanceof eg)) {
            throw new IllegalStateException("Check failed.");
        }
        this.b = (eg) activity;
    }

    @Override // defpackage.dqli
    public final /* synthetic */ Object a(List list, boolean z, ffgu ffguVar) {
        return dqlg.b(this, list, z, ffguVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0150, code lost:
    
        if (r6 != r4) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0100, code lost:
    
        if (r2 != r4) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.dqli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqlp.b(java.util.List, ffgu):java.lang.Object");
    }

    @Override // defpackage.dqli
    public final /* synthetic */ boolean c(List list) {
        return dqlg.c(this, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqli
    public final boolean d(dqlf dqlfVar) {
        dqlfVar.getClass();
        engw engwVar = dqlfVar.k;
        if ((engwVar instanceof Collection) && engwVar.isEmpty()) {
            return false;
        }
        enqv it = engwVar.iterator();
        while (it.hasNext()) {
            if (koa.c(this.b, (String) it.next()) == 0) {
                engw engwVar2 = dqlfVar.m;
                if ((engwVar2 instanceof Collection) && engwVar2.isEmpty()) {
                    return true;
                }
                enqv it2 = engwVar2.iterator();
                while (it2.hasNext()) {
                    if (koa.c(this.b, (String) it2.next()) != -1) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dqli
    public final /* synthetic */ Object e(dqlf dqlfVar, ffgu ffguVar) {
        return dqlg.a(this, dqlfVar, true, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r6, int r7, defpackage.ffjm r8, defpackage.ffgu r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.dqll
            if (r0 == 0) goto L13
            r0 = r9
            dqll r0 = (defpackage.dqll) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqll r0 = new dqll
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.String r6 = r0.e
            dqlp r7 = r0.d
            defpackage.ffci.b(r9)
            goto L6f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.ffci.b(r9)
            return r9
        L3a:
            defpackage.ffci.b(r9)
            if (r7 <= 0) goto L46
            java.lang.String r9 = "_"
            java.lang.String r9 = defpackage.a.g(r7, r6, r9)
            goto L47
        L46:
            r9 = r6
        L47:
            java.util.Set r2 = r5.c
            boolean r2 = r2.contains(r9)
            if (r2 == 0) goto L5a
            int r7 = r7 + r4
            r0.c = r4
            java.lang.Object r6 = r5.f(r6, r7, r8, r0)
            if (r6 != r1) goto L59
            goto L75
        L59:
            return r6
        L5a:
            java.util.Set r6 = r5.c
            r6.add(r9)
            r0.d = r5
            r0.e = r9
            r0.c = r3
            java.lang.Object r6 = r8.a(r9, r0)
            if (r6 == r1) goto L75
            r7 = r9
            r9 = r6
            r6 = r7
            r7 = r5
        L6f:
            java.util.Set r7 = r7.c
            r7.remove(r6)
            return r9
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqlp.f(java.lang.String, int, ffjm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dqlm
            if (r0 == 0) goto L13
            r0 = r9
            dqlm r0 = (defpackage.dqlm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqlm r0 = new dqlm
            r0.<init>(r7, r9)
        L18:
            r5 = r0
            java.lang.Object r9 = r5.b
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.d
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r8 = r5.a
            dqlp r8 = r5.e
            defpackage.ffci.b(r9)
            goto L96
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ffci.b(r9)
            dqlq r9 = r7.d
            if (r9 == 0) goto L3e
            r9.c()
        L3e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            eg r1 = r7.b
            r3 = 2132084125(0x7f15059d, float:1.9808412E38)
            java.lang.String r1 = r1.getString(r3)
            r9.append(r1)
            java.util.Iterator r1 = r8.iterator()
        L53:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L70
            java.lang.Object r3 = r1.next()
            dqlf r3 = (defpackage.dqlf) r3
            java.lang.String r4 = "\n"
            r9.append(r4)
            eg r4 = r7.b
            int r3 = r3.l
            java.lang.String r3 = r4.getString(r3)
            r9.append(r3)
            goto L53
        L70:
            java.lang.String r9 = r9.toString()
            eg r1 = r7.b
            r3 = 2132086078(0x7f150d3e, float:1.9812373E38)
            java.lang.String r3 = r1.getString(r3)
            r3.getClass()
            dqlj r4 = new dqlj
            r4.<init>()
            r5.e = r7
            r5.a = r8
            r5.d = r2
            r6 = 12
            r2 = r9
            java.lang.Object r9 = defpackage.dsko.b(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L95
            return r0
        L95:
            r8 = r7
        L96:
            r0 = r9
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La7
            dqlq r8 = r8.d
            if (r8 == 0) goto Lae
            r8.a()
            return r9
        La7:
            dqlq r8 = r8.d
            if (r8 == 0) goto Lae
            r8.b()
        Lae:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqlp.g(java.util.List, ffgu):java.lang.Object");
    }
}
