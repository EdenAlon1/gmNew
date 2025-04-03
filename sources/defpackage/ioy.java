package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioy implements irb {
    final /* synthetic */ ipa a;
    final /* synthetic */ Object b;
    private final cnx c;

    public ioy(ipa ipaVar, Object obj) {
        this.a = ipaVar;
        this.b = obj;
        int[] iArr = cnb.a;
        this.c = new cnx((byte[]) null);
    }

    @Override // defpackage.irb
    public final int a() {
        iui iuiVar = (iui) this.a.j.f(this.b);
        if (iuiVar != null) {
            return iuiVar.G().size();
        }
        return 0;
    }

    @Override // defpackage.irb
    public final void b() {
        this.a.i();
        iui iuiVar = (iui) this.a.j.b(this.b);
        if (iuiVar != null) {
            if (this.a.n <= 0) {
                imn.c("No pre-composed items to dispose");
            }
            int indexOf = this.a.a.I().indexOf(iuiVar);
            if (indexOf < this.a.a.I().size() - this.a.n) {
                imn.c("Item is not in pre-composed item range");
            }
            ipa ipaVar = this.a;
            ipaVar.m++;
            ipaVar.n--;
            int size = ipaVar.a.I().size();
            ipa ipaVar2 = this.a;
            int i = (size - ipaVar2.n) - ipaVar2.m;
            ipaVar2.l(indexOf, i);
            this.a.h(i);
        }
    }

    @Override // defpackage.irb
    public final void c(int i, long j) {
        iui iuiVar = (iui) this.a.j.f(this.b);
        if (iuiVar == null || !iuiVar.e()) {
            return;
        }
        int size = iuiVar.G().size();
        if (i < 0 || i >= size) {
            imn.d("Index (" + i + ") is out of bound of [0, " + size + ')');
        }
        if (iuiVar.g()) {
            imn.b("Pre-measure called on node that is not placed");
        }
        iui iuiVar2 = this.a.a;
        iuiVar2.o = true;
        ium.a(iuiVar).s((iui) iuiVar.G().get(i), j);
        iuiVar2.o = false;
        this.c.e(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [hvh] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.irb
    public final void d(ffji ffjiVar) {
        ivu ivuVar;
        hvh hvhVar;
        iui iuiVar = (iui) this.a.j.f(this.b);
        if (iuiVar == null || (ivuVar = iuiVar.x) == null || (hvhVar = ivuVar.e) == null) {
            return;
        }
        if (!hvhVar.C().z) {
            imn.c("visitSubtreeIf called on an unattached node");
        }
        hne hneVar = new hne(new hvh[16]);
        hvh hvhVar2 = hvhVar.C().t;
        if (hvhVar2 == null) {
            isx.j(hneVar, hvhVar.C());
        } else {
            hneVar.n(hvhVar2);
        }
        while (true) {
            int i = hneVar.b;
            if (i == 0) {
                return;
            }
            hvh hvhVar3 = (hvh) hneVar.c(i - 1);
            if ((hvhVar3.r & 262144) != 0) {
                for (hvh hvhVar4 = hvhVar3; hvhVar4 != null; hvhVar4 = hvhVar4.t) {
                    if ((hvhVar4.q & 262144) != 0) {
                        isz iszVar = hvhVar4;
                        ?? r7 = 0;
                        while (iszVar != 0) {
                            if (iszVar instanceof ixv) {
                                ixv ixvVar = (ixv) iszVar;
                                Object invoke = ffkj.e("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", ixvVar.e()) ? ffjiVar.invoke(ixvVar) : ixu.a;
                                if (invoke == ixu.c) {
                                    return;
                                }
                                if (invoke == ixu.b) {
                                    break;
                                }
                            } else if ((iszVar.q & 262144) != 0 && (iszVar instanceof isz)) {
                                hvh hvhVar5 = iszVar.n;
                                int i2 = 0;
                                iszVar = iszVar;
                                r7 = r7;
                                while (hvhVar5 != null) {
                                    if ((hvhVar5.q & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            iszVar = hvhVar5;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new hne(new hvh[16]);
                                            }
                                            if (iszVar != 0) {
                                                r7.n(iszVar);
                                            }
                                            r7.n(hvhVar5);
                                            iszVar = 0;
                                        }
                                    }
                                    hvhVar5 = hvhVar5.t;
                                    iszVar = iszVar;
                                    r7 = r7;
                                }
                                if (i2 != 1) {
                                }
                            }
                            iszVar = isx.a(r7);
                        }
                    }
                }
            }
            isx.j(hneVar, hvhVar3);
        }
    }
}
