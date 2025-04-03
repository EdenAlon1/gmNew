package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fftn extends ffto implements ffsu {
    private final ffqk a;
    public final ffqn c = new ffqn(null, ffqo.a);
    public final ffqn d;

    public fftn() {
        ffqo ffqoVar = ffqo.a;
        this.d = new ffqn(null, ffqoVar);
        this.a = new ffqk(false, ffqoVar);
    }

    private final void A() {
        fghx fghxVar;
        fftm fftmVar = (fftm) this.d.a;
        if (fftmVar == null || fftmVar.g()) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (fftmVar) {
                fghx b = fftmVar.b();
                fghxVar = null;
                if (b != null) {
                    fftl fftlVar = (fftl) b;
                    if (nanoTime - fftlVar.b >= 0 && B(fftlVar)) {
                        fghxVar = fftmVar.d(0);
                    }
                }
            }
        } while (((fftl) fghxVar) != null);
    }

    private final boolean B(Runnable runnable) {
        while (true) {
            Object obj = this.c.a;
            if (x()) {
                return false;
            }
            if (obj == null) {
                if (this.c.d(null, runnable)) {
                    return true;
                }
            } else if (obj instanceof fghg) {
                fghg fghgVar = (fghg) obj;
                int a = fghgVar.a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a != 1) {
                    return false;
                }
                this.c.d(obj, fghgVar.c());
            } else {
                if (obj == fftp.b) {
                    return false;
                }
                fghg fghgVar2 = new fghg(8, true);
                fghgVar2.a((Runnable) obj);
                fghgVar2.a(runnable);
                if (this.c.d(obj, fghgVar2)) {
                    return true;
                }
            }
        }
    }

    @Override // defpackage.ffsd
    public final void a(ffhd ffhdVar, Runnable runnable) {
        j(runnable);
    }

    public ffte c(long j, Runnable runnable, ffhd ffhdVar) {
        return ffsr.a.c(j, runnable, ffhdVar);
    }

    @Override // defpackage.ffsu
    public final void d(long j, ffrf ffrfVar) {
        long a = fftp.a(j);
        if (a < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            fftj fftjVar = new fftj(this, a + nanoTime, ffrfVar);
            w(nanoTime, fftjVar);
            ffrj.b(ffrfVar, fftjVar);
        }
    }

    public void j(Runnable runnable) {
        A();
        if (B(runnable)) {
            z();
        } else {
            ffsq.a.j(runnable);
        }
    }

    @Override // defpackage.ffti
    public void l() {
        fghx d;
        ThreadLocal threadLocal = ffvi.a;
        ffvi.a.set(null);
        this.a.c = 1;
        boolean z = ffso.a;
        while (true) {
            Object obj = this.c.a;
            if (obj == null) {
                if (this.c.d(null, fftp.b)) {
                    break;
                }
            } else if (obj instanceof fghg) {
                ((fghg) obj).d();
                break;
            } else {
                if (obj == fftp.b) {
                    break;
                }
                fghg fghgVar = new fghg(8, true);
                fghgVar.a((Runnable) obj);
                if (this.c.d(obj, fghgVar)) {
                    break;
                }
            }
        }
        while (m() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            fftm fftmVar = (fftm) this.d.a;
            if (fftmVar == null) {
                return;
            }
            synchronized (fftmVar) {
                d = fftmVar.a() > 0 ? fftmVar.d(0) : null;
            }
            fftl fftlVar = (fftl) d;
            if (fftlVar == null) {
                return;
            } else {
                k(nanoTime, fftlVar);
            }
        }
    }

    @Override // defpackage.ffti
    public final long m() {
        Runnable runnable;
        fftl fftlVar;
        if (s()) {
            return 0L;
        }
        A();
        ffqn ffqnVar = this.c;
        while (true) {
            Object obj = ffqnVar.a;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof fghg)) {
                if (obj == fftp.b) {
                    break;
                }
                if (this.c.d(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                fghg fghgVar = (fghg) obj;
                Object b = fghgVar.b();
                if (b != fghg.a) {
                    runnable = (Runnable) b;
                    break;
                }
                this.c.d(obj, fghgVar.c());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        ffdn ffdnVar = this.b;
        if (((ffdnVar == null || ffdnVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = this.c.a;
        if (obj2 != null) {
            if (!(obj2 instanceof fghg)) {
                return obj2 == fftp.b ? Long.MAX_VALUE : 0L;
            }
            if (!((fghg) obj2).e()) {
                return 0L;
            }
        }
        fftm fftmVar = (fftm) this.d.a;
        if (fftmVar == null || (fftlVar = (fftl) fftmVar.c()) == null) {
            return Long.MAX_VALUE;
        }
        return ffmk.j(fftlVar.b - System.nanoTime(), 0L);
    }

    protected final ffte v(long j, Runnable runnable) {
        long a = fftp.a(j);
        if (a >= 4611686018427387903L) {
            return ffux.a;
        }
        long nanoTime = System.nanoTime();
        fftk fftkVar = new fftk(a + nanoTime, runnable);
        w(nanoTime, fftkVar);
        return fftkVar;
    }

    public final void w(long j, fftl fftlVar) {
        if (!x()) {
            fftm fftmVar = (fftm) this.d.a;
            if (fftmVar == null) {
                this.d.d(null, new fftm(j));
                Object obj = this.d.a;
                obj.getClass();
                fftmVar = (fftm) obj;
            }
            synchronized (fftlVar) {
                if (fftlVar._heap == fftp.a) {
                    return;
                }
                synchronized (fftmVar) {
                    fftl fftlVar2 = (fftl) fftmVar.b();
                    if (!x()) {
                        if (fftlVar2 == null) {
                            fftmVar.a = j;
                        } else {
                            long j2 = fftlVar2.b;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            long j3 = fftmVar.a;
                            if (j - j3 > 0) {
                                fftmVar.a = j;
                            } else {
                                j = j3;
                            }
                        }
                        if (fftlVar.b - j < 0) {
                            fftlVar.b = j;
                        }
                        boolean z = ffso.a;
                        fftlVar.d(fftmVar);
                        fghx[] fghxVarArr = fftmVar.b;
                        if (fghxVarArr == null) {
                            fghxVarArr = new fghx[4];
                            fftmVar.b = fghxVarArr;
                        } else if (fftmVar.a() >= fghxVarArr.length) {
                            int a = fftmVar.a();
                            Object[] copyOf = Arrays.copyOf(fghxVarArr, a + a);
                            copyOf.getClass();
                            fghxVarArr = (fghx[]) copyOf;
                            fftmVar.b = fghxVarArr;
                        }
                        int a2 = fftmVar.a();
                        fftmVar.e(a2 + 1);
                        fghxVarArr[a2] = fftlVar;
                        fftlVar.e(a2);
                        fftmVar.f(a2);
                        fftm fftmVar2 = (fftm) this.d.a;
                        if ((fftmVar2 != null ? (fftl) fftmVar2.c() : null) == fftlVar) {
                            z();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        k(j, fftlVar);
    }

    public final boolean x() {
        return this.a.a();
    }

    protected final boolean y() {
        if (!r()) {
            return false;
        }
        fftm fftmVar = (fftm) this.d.a;
        if (fftmVar != null && !fftmVar.g()) {
            return false;
        }
        Object obj = this.c.a;
        if (obj == null) {
            return true;
        }
        return obj instanceof fghg ? ((fghg) obj).e() : obj == fftp.b;
    }
}
