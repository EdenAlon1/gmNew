package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffsd extends ffgo implements ffgw {
    public static final ffsc l = new ffsc();

    public ffsd() {
        super(ffgw.k);
    }

    public abstract void a(ffhd ffhdVar, Runnable runnable);

    @Override // defpackage.ffgw
    public final ffgu e(ffgu ffguVar) {
        return new fggk(this, ffguVar);
    }

    public boolean ex(ffhd ffhdVar) {
        return true;
    }

    @Override // defpackage.ffgw
    public final void f(ffgu ffguVar) {
        fggk fggkVar = (fggk) ffguVar;
        while (fggkVar.f.a == fggl.b) {
        }
        Object obj = fggkVar.f.a;
        ffrh ffrhVar = obj instanceof ffrh ? (ffrh) obj : null;
        if (ffrhVar != null) {
            ffrhVar.z();
        }
    }

    @Override // defpackage.ffgo, defpackage.ffha, defpackage.ffhd
    public final <E extends ffha> E get(ffhb<E> ffhbVar) {
        ffhbVar.getClass();
        if (!(ffhbVar instanceof ffgp)) {
            if (ffgw.k == ffhbVar) {
                return this;
            }
            return null;
        }
        ffgp ffgpVar = (ffgp) ffhbVar;
        if (!ffgpVar.b(getKey())) {
            return null;
        }
        E e = (E) ffgpVar.a(this);
        if (e instanceof ffha) {
            return e;
        }
        return null;
    }

    public void h(ffhd ffhdVar, Runnable runnable) {
        a(ffhdVar, runnable);
    }

    public ffsd i(int i) {
        fggy.a(i);
        return new fggx(this, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (defpackage.ffgw.k == r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.a(r1) != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        return defpackage.ffhe.a;
     */
    @Override // defpackage.ffgo, defpackage.ffhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ffhd minusKey(defpackage.ffhb<?> r2) {
        /*
            r1 = this;
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.ffgp
            if (r0 == 0) goto L1a
            ffgp r2 = (defpackage.ffgp) r2
            ffhb r0 = r1.getKey()
            boolean r0 = r2.b(r0)
            if (r0 == 0) goto L21
            ffha r2 = r2.a(r1)
            if (r2 == 0) goto L21
            goto L1e
        L1a:
            ffgv r0 = defpackage.ffgw.k
            if (r0 != r2) goto L21
        L1e:
            ffhe r2 = defpackage.ffhe.a
            return r2
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffsd.minusKey(ffhb):ffhd");
    }

    public String toString() {
        return ffsp.a(this) + "@" + ffsp.b(this);
    }
}
