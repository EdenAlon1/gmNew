package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbnz implements dbnh {
    private static final cskc b = cskc.g("BugleWorkQueue", "WorkQueueDebugMenuProviderImpl");
    public final ffsk a;
    private final cqoh c;
    private final cfgt d;
    private final ffbr e;
    private final cevh f;
    private final Context g;

    public dbnz(cqoh cqohVar, dbir dbirVar, cfgt cfgtVar, ffbr ffbrVar, cevh cevhVar, Context context, ffsk ffskVar) {
        cqohVar.getClass();
        dbirVar.getClass();
        cfgtVar.getClass();
        cevhVar.getClass();
        context.getClass();
        ffskVar.getClass();
        this.c = cqohVar;
        this.d = cfgtVar;
        this.e = ffbrVar;
        this.f = cevhVar;
        this.g = context;
        this.a = ffskVar;
    }

    private final void e(MenuItem menuItem, final Activity activity, final ffjm ffjmVar) {
        menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dbnm
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem2) {
                menuItem2.getClass();
                axol.k(dbnz.this.a, null, new dbnr(ffjmVar, dbir.a(activity, Optional.empty(), Optional.empty()), null), 3);
                return false;
            }
        });
    }

    @Override // defpackage.dbnh
    public final void a(Menu menu, Activity activity) {
        menu.getClass();
        activity.getClass();
        SubMenu addSubMenu = menu.addSubMenu("PWQ");
        addSubMenu.getClass();
        MenuItem add = addSubMenu.add("PWQ Inspector");
        add.getClass();
        e(add, activity, new dbns(this, null));
        MenuItem add2 = addSubMenu.add("Run Janitor Job");
        add2.getClass();
        e(add2, activity, new dbnt(this, null));
        MenuItem add3 = addSubMenu.add("Check Constraints");
        add3.getClass();
        e(add3, activity, new dbnu(this, null));
        MenuItem add4 = addSubMenu.add("Dump PWQ Table");
        add4.getClass();
        e(add4, activity, new dbnv(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dbiq r17, defpackage.ffgu r18) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbnz.b(dbiq, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(final defpackage.dbiq r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dbnx
            if (r0 == 0) goto L13
            r0 = r9
            dbnx r0 = (defpackage.dbnx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbnx r0 = new dbnx
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dbiq r8 = r0.d
            defpackage.ffci.b(r9)
            goto L4d
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.ffci.b(r9)
            cfgt r9 = r7.d
            cfgc r2 = new cfgc
            r4 = 0
            r2.<init>(r9, r4)
            ffsk r9 = r9.h
            elfl r9 = defpackage.axol.h(r9, r2)
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)
            if (r9 != r1) goto L4d
            return r1
        L4d:
            cffz r9 = (defpackage.cffz) r9
            cskc r0 = defpackage.dbnz.b
            csjb r0 = r0.c()
            java.lang.String r1 = "Completed Janitor Job"
            r0.I(r1)
            java.lang.String r1 = "result"
            r0.A(r1, r9)
            r0.r()
            java.util.Map r0 = r9.a
            java.util.Set r1 = r0.entrySet()
            dbnp r5 = new dbnp
            r5.<init>()
            r4 = 0
            r6 = 30
            java.lang.String r2 = "\n"
            r3 = 0
            java.lang.String r0 = defpackage.ffdx.aA(r1, r2, r3, r4, r5, r6)
            j$.time.Duration r9 = r9.b
            long r1 = r9.toMillis()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r3 = "Rescheduling took "
            r9.<init>(r3)
            r9.append(r1)
            java.lang.String r1 = "ms"
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            dbnq r1 = new dbnq
            r1.<init>()
            defpackage.efbd.e(r1)
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbnz.c(dbiq, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final defpackage.dbiq r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.dbny
            if (r0 == 0) goto L13
            r0 = r10
            dbny r0 = (defpackage.dbny) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbny r0 = new dbny
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fflb r9 = r0.d
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L29
            goto L6a
        L29:
            r10 = move-exception
            goto L7c
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.ffci.b(r10)
            fflb r10 = new fflb
            r10.<init>()
            dbnj r2 = new dbnj
            r2.<init>()
            defpackage.efbd.e(r2)
            dbng r2 = new dbng     // Catch: java.lang.Throwable -> L78
            cqoh r4 = r8.c     // Catch: java.lang.Throwable -> L78
            android.content.Context r5 = r8.g     // Catch: java.lang.Throwable -> L78
            dbnk r6 = new dbnk     // Catch: java.lang.Throwable -> L78
            r6.<init>()     // Catch: java.lang.Throwable -> L78
            r2.<init>(r4, r5, r9, r6)     // Catch: java.lang.Throwable -> L78
            cevh r9 = r8.f     // Catch: java.lang.Throwable -> L78
            java.lang.Class<cevf> r4 = defpackage.cevf.class
            java.util.EnumSet r4 = java.util.EnumSet.allOf(r4)     // Catch: java.lang.Throwable -> L78
            elfl r9 = r9.i(r2, r4)     // Catch: java.lang.Throwable -> L78
            r0.d = r10     // Catch: java.lang.Throwable -> L78
            r0.c = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)     // Catch: java.lang.Throwable -> L78
            if (r9 == r1) goto L77
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            java.lang.Void r10 = (java.lang.Void) r10     // Catch: java.lang.Throwable -> L29
            dbnl r10 = new dbnl
            r10.<init>()
            defpackage.efbd.e(r10)
            ffcu r9 = defpackage.ffcu.a
            return r9
        L77:
            return r1
        L78:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L7c:
            dbnl r0 = new dbnl
            r0.<init>()
            defpackage.efbd.e(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbnz.d(dbiq, ffgu):java.lang.Object");
    }
}
