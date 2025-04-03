package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjvk implements aqkh {
    public final Instant a;
    public final boolean b;
    public final ffbz c;
    public final ctas d;
    public final long e;
    public final long f;
    public final cjvt g;
    public cjvu h;
    private final boolean i;
    private final ffbr j;
    private final ffhd k;
    private final ffbz l = ffca.a(new ffix() { // from class: cjvf
        @Override // defpackage.ffix
        public final Object invoke() {
            return (aoku) cjvk.this.c.a();
        }
    });

    public cjvk(cjvt cjvtVar, cjvu cjvuVar, Instant instant, boolean z, boolean z2, ffbz ffbzVar, ffbr ffbrVar, ctas ctasVar, ffhd ffhdVar, long j, long j2) {
        this.g = cjvtVar;
        this.h = cjvuVar;
        this.a = instant;
        this.i = z;
        this.b = z2;
        this.c = ffbzVar;
        this.j = ffbrVar;
        this.d = ctasVar;
        this.k = ffhdVar;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.aqkh
    public final Instant a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.aqkh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.cjvj
            if (r0 == 0) goto L13
            r0 = r11
            cjvj r0 = (defpackage.cjvj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cjvj r0 = new cjvj
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            java.lang.String r4 = "mimetype"
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r11)
            goto La4
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L34:
            defpackage.ffci.b(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            cjvt r2 = r10.g
            java.lang.String r5 = r2.c
            java.lang.String r6 = "data2"
            java.lang.String r7 = "vnd.android.cursor.item/name"
            r8 = 0
            if (r5 == 0) goto L6d
            boolean r5 = defpackage.ffpc.J(r5)
            if (r5 == 0) goto L4e
            goto L6d
        L4e:
            java.lang.String r5 = r2.d
            if (r5 == 0) goto L6d
            boolean r5 = defpackage.ffpc.J(r5)
            if (r5 != 0) goto L6d
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            r5.put(r4, r7)
            java.lang.String r7 = r2.c
            r5.put(r6, r7)
            java.lang.String r2 = r2.d
            java.lang.String r6 = "data3"
            r5.put(r6, r2)
            goto L87
        L6d:
            java.lang.String r5 = r2.e
            if (r5 == 0) goto L86
            boolean r5 = defpackage.ffpc.J(r5)
            if (r5 == 0) goto L78
            goto L86
        L78:
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            r5.put(r4, r7)
            java.lang.String r2 = r2.e
            r5.put(r6, r2)
            goto L87
        L86:
            r5 = r8
        L87:
            if (r5 == 0) goto L8c
            r11.add(r5)
        L8c:
            ffhd r2 = r10.k
            ffhd r2 = defpackage.ekxi.a(r2)
            cjvi r5 = new cjvi
            r5.<init>(r8, r10)
            r0.a = r11
            r0.d = r3
            java.lang.Object r0 = defpackage.ffra.a(r2, r5, r0)
            if (r0 == r1) goto Lbb
            r9 = r0
            r0 = r11
            r11 = r9
        La4:
            byte[] r11 = (byte[]) r11
            if (r11 == 0) goto Lba
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "vnd.android.cursor.item/photo"
            r1.put(r4, r2)
            java.lang.String r2 = "data15"
            r1.put(r2, r11)
            r0.add(r1)
        Lba:
            return r0
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjvk.b(ffgu):java.lang.Object");
    }

    @Override // defpackage.aqkh
    public final boolean c() {
        return this.i;
    }

    @Override // defpackage.aqkh
    public final void d() {
        String str;
        if (this.h.a != null || (str = this.g.e) == null || str.length() == 0) {
            return;
        }
        crji crjiVar = (crji) this.j.b();
        String str2 = this.g.e;
        str2.getClass();
        this.h = new cjvu(crjiVar.e(str2, (aoku) this.l.a(), null), this.g.a, false, 4);
    }

    @Override // defpackage.aqkj
    public final cjvt f() {
        return this.g;
    }

    @Override // defpackage.aqkj
    public final cjvu g() {
        return this.h;
    }
}
