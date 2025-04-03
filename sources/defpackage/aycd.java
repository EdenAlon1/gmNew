package defpackage;

import android.provider.ContactsContract;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aycd implements aybz {
    public static final entd a = entd.c("BugleContacts");
    public final ejoc b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    private final ffsk f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;

    public aycd(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ejoc ejocVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ejocVar.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        this.f = ffskVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.b = ejocVar;
        this.c = ffbrVar6;
        this.k = ffbrVar7;
        this.d = ffbrVar8;
        this.e = ffbrVar9;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.aybz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ayca
            if (r0 == 0) goto L13
            r0 = r8
            ayca r0 = (defpackage.ayca) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ayca r0 = new ayca
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r0 = r0.a
            java.io.Closeable r0 = (java.io.Closeable) r0
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L7f
        L2f:
            r8 = move-exception
            goto L89
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            ekzz r2 = r0.e
            java.lang.Object r5 = r0.a
            aycd r5 = (defpackage.aycd) r5
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L44
            r8 = r2
            goto L67
        L44:
            r8 = move-exception
            r0 = r2
            goto L89
        L47:
            defpackage.ffci.b(r8)
            java.lang.String r8 = "ContactsSync#forceSync"
            ekzz r8 = defpackage.eleg.f(r8)
            ffbr r2 = r7.i     // Catch: java.lang.Throwable -> L85
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L85
            aybe r2 = (defpackage.aybe) r2     // Catch: java.lang.Throwable -> L85
            r0.a = r7     // Catch: java.lang.Throwable -> L85
            r0.e = r8     // Catch: java.lang.Throwable -> L85
            r0.d = r5     // Catch: java.lang.Throwable -> L85
            r5 = 4
            java.lang.Object r2 = r2.a(r5, r0)     // Catch: java.lang.Throwable -> L85
            if (r2 != r1) goto L66
            goto L7d
        L66:
            r5 = r7
        L67:
            ffbr r2 = r5.j     // Catch: java.lang.Throwable -> L85
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L85
            aycj r2 = (defpackage.aycj) r2     // Catch: java.lang.Throwable -> L85
            ayci r5 = defpackage.ayci.d     // Catch: java.lang.Throwable -> L85
            r0.a = r8     // Catch: java.lang.Throwable -> L85
            r0.e = r3     // Catch: java.lang.Throwable -> L85
            r0.d = r4     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r2.a(r5, r0)     // Catch: java.lang.Throwable -> L85
            if (r0 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r0 = r8
        L7f:
            defpackage.ffig.a(r0, r3)
            ffcu r8 = defpackage.ffcu.a
            return r8
        L85:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L89:
            throw r8     // Catch: java.lang.Throwable -> L8a
        L8a:
            r1 = move-exception
            defpackage.ffig.a(r0, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aycd.a(ffgu):java.lang.Object");
    }

    @Override // defpackage.aybz
    public final void b() {
        if (((axun) this.k.b()).a()) {
            ((ensz) a.h()).q("Registering contacts observers");
            aybd aybdVar = (aybd) this.g.b();
            ((ejtr) aybdVar.b.b()).d(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, false, aybdVar);
            aych aychVar = (aych) this.h.b();
            ((ejtr) aychVar.b.b()).d(ContactsContract.DeletedContacts.CONTENT_URI, false, aychVar);
            axol.k(this.f, null, new aycb(this, null), 3);
        }
    }

    @Override // defpackage.aybz
    public final void c() {
        ((ensz) a.h()).q("Unregistering contacts observers");
        ((aybd) this.g.b()).b();
        ((aych) this.h.b()).b();
        axol.k(this.f, null, new aycc(this, null), 3);
    }
}
