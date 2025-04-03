package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mif extends mdu {
    public static final /* synthetic */ int e = 0;
    public final int b;
    public final lru[] c;
    public final Object[] d;
    private final int f;
    private final int[] g;
    private final int[] h;
    private final HashMap i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mif(java.util.Collection r7, defpackage.mvf r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            lru[] r0 = new defpackage.lru[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            mhi r4 = (defpackage.mhi) r4
            int r5 = r3 + 1
            lru r4 = r4.a()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            mhi r3 = (defpackage.mhi) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.b()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mif.<init>(java.util.Collection, mvf):void");
    }

    @Override // defpackage.lru
    public final int b() {
        return this.f;
    }

    @Override // defpackage.lru
    public final int c() {
        return this.b;
    }

    @Override // defpackage.mdu
    protected final int r(Object obj) {
        Integer num = (Integer) this.i.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.mdu
    protected final int s(int i) {
        return lvf.b(this.g, i + 1, false, false);
    }

    @Override // defpackage.mdu
    protected final int t(int i) {
        return lvf.b(this.h, i + 1, false, false);
    }

    @Override // defpackage.mdu
    protected final int u(int i) {
        return this.g[i];
    }

    @Override // defpackage.mdu
    protected final int v(int i) {
        return this.h[i];
    }

    @Override // defpackage.mdu
    protected final lru w(int i) {
        return this.c[i];
    }

    @Override // defpackage.mdu
    protected final Object z(int i) {
        return this.d[i];
    }

    public mif(lru[] lruVarArr, Object[] objArr, mvf mvfVar) {
        super(mvfVar);
        this.c = lruVarArr;
        int length = lruVarArr.length;
        this.g = new int[length];
        this.h = new int[length];
        this.d = objArr;
        this.i = new HashMap();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < lruVarArr.length) {
            lru lruVar = lruVarArr[i];
            this.c[i4] = lruVar;
            this.h[i4] = i2;
            this.g[i4] = i3;
            i2 += lruVar.c();
            i3 += this.c[i4].b();
            this.i.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.b = i2;
        this.f = i3;
    }
}
