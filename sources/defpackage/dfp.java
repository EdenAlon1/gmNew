package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfp extends ddx implements isu {
    public ffix i;
    public ffix j;
    public boolean k;
    public final coc l;
    private final coc o;

    public dfp(ffix ffixVar, ffix ffixVar2, ffix ffixVar3, dwn dwnVar, dhf dhfVar, boolean z, jjj jjjVar) {
        super(dwnVar, dhfVar, z, null, jjjVar, ffixVar);
        this.i = ffixVar2;
        this.j = ffixVar3;
        this.k = true;
        int i = cnk.a;
        this.o = new coc((byte[]) null);
        this.l = new coc((byte[]) null);
    }

    private final void A() {
        long j;
        long j2;
        coc cocVar = this.o;
        Object[] objArr = cocVar.c;
        long[] jArr = cocVar.a;
        int length = jArr.length - 2;
        char c = 7;
        long j3 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j4 = jArr[i];
                j2 = 255;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j4 & 255) < 128) {
                            ((ffud) objArr[(i << 3) + i3]).t(null);
                        }
                        j4 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
        }
        cocVar.e();
        coc cocVar2 = this.l;
        Object[] objArr2 = cocVar2.c;
        long[] jArr2 = cocVar2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr2[i4];
                char c2 = c;
                long j6 = j3;
                if ((((~j5) << c2) & j5 & j6) != j6) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j5 & j2) < j) {
                            ((dfh) objArr2[(i4 << 3) + i6]).a.t(null);
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                }
                i4++;
                c = c2;
                j3 = j6;
            }
        }
        cocVar2.e();
    }

    @Override // defpackage.ddx
    public final Object b(ild ildVar, ffgu ffguVar) {
        boolean z = ((ddx) this).b;
        Object d = dtr.d(ildVar, (!z || this.j == null) ? null : new dfj(this), (!z || this.i == null) ? null : new dfk(this), new dfl(this, null), new dfm(this), ffguVar);
        return d == ffhh.a ? d : ffcu.a;
    }

    @Override // defpackage.hvh
    public final void dS() {
        A();
    }

    @Override // defpackage.ddx
    public final void g(jkv jkvVar) {
        if (this.i != null) {
            jkr.i(jkvVar, null, new dfi(this));
        }
    }

    @Override // defpackage.ddx
    protected final void k() {
        A();
    }

    @Override // defpackage.ddx
    protected final boolean s(KeyEvent keyEvent) {
        long b = iiz.b(keyEvent);
        boolean z = false;
        if (this.i != null && this.o.a(b) == null) {
            this.o.f(b, ffqy.d(D(), null, null, new dfn(this, null), 3));
            z = true;
        }
        dfh dfhVar = (dfh) this.l.a(b);
        if (dfhVar != null) {
            if (dfhVar.a.v()) {
                dfhVar.a.t(null);
                if (!dfhVar.b) {
                    ((ddx) this).c.invoke();
                    this.l.d(b);
                    return z;
                }
            } else {
                this.l.d(b);
            }
        }
        return z;
    }

    @Override // defpackage.ddx
    protected final void z(KeyEvent keyEvent) {
        ffix ffixVar;
        coc cocVar = this.o;
        long b = iiz.b(keyEvent);
        Object a = cocVar.a(b);
        boolean z = false;
        if (a != null) {
            ffud ffudVar = (ffud) this.o.a(b);
            if (ffudVar != null) {
                if (ffudVar.v()) {
                    ffudVar.t(null);
                } else {
                    z = true;
                }
            }
            this.o.d(b);
        }
        if (this.j == null) {
            if (z) {
                return;
            }
            ((ddx) this).c.invoke();
        } else if (this.l.a(b) == null) {
            if (z) {
                return;
            }
            this.l.f(b, new dfh(ffqy.d(D(), null, null, new dfo(this, b, null), 3)));
        } else {
            if (!z && (ffixVar = this.j) != null) {
                ffixVar.invoke();
            }
            this.l.d(b);
        }
    }
}
