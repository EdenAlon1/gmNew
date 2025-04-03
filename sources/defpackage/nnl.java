package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnl implements nnb {
    private final nod a;
    private String b;
    private ndu c;
    private nnk d;
    private boolean e;
    private long l;
    private final boolean[] f = new boolean[3];
    private final nns g = new nns(32);
    private final nns h = new nns(33);
    private final nns i = new nns(34);
    private final nns j = new nns(39);
    private final nns k = new nns(40);
    private long m = -9223372036854775807L;
    private final luv n = new luv();

    public nnl(nod nodVar) {
        this.a = nodVar;
    }

    private final void f() {
        lti.g(this.c);
        int i = lvf.a;
    }

    private final void g(byte[] bArr, int i, int i2) {
        nnk nnkVar = this.d;
        if (nnkVar.e) {
            int i3 = nnkVar.c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                nnkVar.f = (bArr[i4] & 128) != 0;
                nnkVar.e = false;
            } else {
                nnkVar.c = i3 + (i2 - i);
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023e A[SYNTHETIC] */
    @Override // defpackage.nnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.luv r29) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnl.a(luv):void");
    }

    @Override // defpackage.nnb
    public final void b(ncr ncrVar, nom nomVar) {
        nomVar.c();
        this.b = nomVar.b();
        this.c = ncrVar.p(nomVar.a(), 2);
        this.d = new nnk(this.c);
        this.a.c(ncrVar, nomVar);
    }

    @Override // defpackage.nnb
    public final void c(boolean z) {
        f();
        if (z) {
            this.a.d();
            nnk nnkVar = this.d;
            long j = this.l;
            nnkVar.l = nnkVar.b;
            nnkVar.a((int) (j - nnkVar.a));
            nnkVar.j = nnkVar.a;
            nnkVar.a = j;
            nnkVar.a(0);
            nnkVar.h = false;
        }
    }

    @Override // defpackage.nnb
    public final void d(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.nnb
    public final void e() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        lwa.j(this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        this.a.a();
        nnk nnkVar = this.d;
        if (nnkVar != null) {
            nnkVar.e = false;
            nnkVar.f = false;
            nnkVar.g = false;
            nnkVar.h = false;
            nnkVar.i = false;
        }
    }
}
