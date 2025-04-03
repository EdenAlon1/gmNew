package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eti extends ffkk implements ffji {
    final /* synthetic */ eva a;
    final /* synthetic */ jvu b;
    final /* synthetic */ jvj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eti(eva evaVar, jvu jvuVar, jvj jvjVar) {
        super(1);
        this.a = evaVar;
        this.b = jvuVar;
        this.c = jvjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jpg jpgVar;
        long f;
        ict ictVar;
        ibq c;
        ibt ibtVar;
        ifr ifrVar = (ifr) obj;
        exq d = this.a.d();
        if (d != null) {
            jvu jvuVar = this.b;
            eva evaVar = this.a;
            jvj jvjVar = this.c;
            ibt b = ifrVar.t().b();
            long b2 = evaVar.b();
            long a = evaVar.a();
            long j = evaVar.s;
            boolean i = jpm.i(b2);
            jpg jpgVar2 = d.a;
            ict ictVar2 = evaVar.r;
            if (i) {
                jpgVar = jpgVar2;
                ict ictVar3 = ictVar2;
                if (jpm.i(a)) {
                    ictVar = ictVar3;
                    if (!jpm.i(jvuVar.c)) {
                        ictVar3.k(j);
                        ewe.a(b, jvuVar.c, jvjVar, jpgVar, ictVar3);
                        ictVar = ictVar3;
                    }
                } else {
                    ibw ibwVar = new ibw(jpgVar.a.b.f());
                    if (ibwVar.i == 16) {
                        ibwVar = null;
                    }
                    long j2 = ibwVar != null ? ibwVar.i : ibw.a;
                    f = iby.f(ibw.d(j2), ibw.c(j2), ibw.b(j2), ibw.a(j2) * 0.2f, ibw.f(j2));
                    ictVar3.k(f);
                    ewe.a(b, a, jvjVar, jpgVar, ictVar3);
                    ictVar = ictVar3;
                }
            } else {
                ictVar2.k(j);
                jpgVar = jpgVar2;
                ict ictVar4 = ictVar2;
                ewe.a(b, b2, jvjVar, jpgVar, ictVar4);
                ictVar = ictVar4;
            }
            boolean z = false;
            if (jpgVar.t() && !jyw.a(jpgVar.a.f, 3)) {
                z = true;
            }
            boolean z2 = z;
            ?? r8 = ictVar;
            if (z2) {
                long j3 = jpgVar.c;
                r8 = 4294967295;
                iam a2 = ian.a(0L, (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32));
                b.l();
                b.s(a2);
            }
            jou jouVar = jpgVar.a.b.b;
            jyk jykVar = jouVar.m;
            if (jykVar == null) {
                jykVar = jyk.a;
            }
            jyk jykVar2 = jykVar;
            idg idgVar = jouVar.n;
            if (idgVar == null) {
                idgVar = idg.a;
            }
            idg idgVar2 = idgVar;
            ifs ifsVar = jouVar.p;
            if (ifsVar == null) {
                ifsVar = ifu.a;
            }
            ifs ifsVar2 = ifsVar;
            try {
                c = jouVar.c();
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (c != null) {
                    jyr jyrVar = jouVar.a;
                    ibt ibtVar2 = b;
                    jlz.p(jpgVar.b, ibtVar2, c, jyrVar != jyo.a ? jyrVar.a() : 1.0f, idgVar2, jykVar2, ifsVar2);
                    ibtVar = ibtVar2;
                    r8 = ibtVar2;
                } else {
                    jyr jyrVar2 = jouVar.a;
                    ibt ibtVar3 = b;
                    jlz.o(jpgVar.b, ibtVar3, jyrVar2 != jyo.a ? jyrVar2.b() : ibw.a, idgVar2, jykVar2, ifsVar2);
                    ibtVar = ibtVar3;
                    r8 = ibtVar3;
                }
                if (z2) {
                    ibtVar.j();
                }
            } catch (Throwable th2) {
                th = th2;
                b = r8;
                if (z2) {
                    b.j();
                }
                throw th;
            }
        }
        return ffcu.a;
    }
}
