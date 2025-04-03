package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezv extends isz implements ixn {
    public jwk a;
    public jvu b;
    public eva c;
    public boolean d;
    public final boolean e;
    public jvj f;
    public fhi g;
    public juw h;
    public hzi i;

    public ezv(jwk jwkVar, jvu jvuVar, eva evaVar, boolean z, boolean z2, jvj jvjVar, fhi fhiVar, juw juwVar, hzi hziVar) {
        this.a = jwkVar;
        this.b = jvuVar;
        this.c = evaVar;
        this.d = z;
        this.e = z2;
        this.f = jvjVar;
        this.g = fhiVar;
        this.h = juwVar;
        this.i = hziVar;
        fhiVar.g = new ezi(this);
    }

    public static final /* synthetic */ void a(eva evaVar, String str, boolean z) {
        ffcu ffcuVar;
        if (z) {
            jwj jwjVar = evaVar.c;
            if (jwjVar != null) {
                ewe.b(ffdx.g(new juh(), new juc(str, 1)), evaVar.b, evaVar.p, jwjVar);
                ffcuVar = ffcu.a;
            } else {
                ffcuVar = null;
            }
            if (ffcuVar == null) {
                ffji ffjiVar = evaVar.p;
                int length = str.length();
                long a = jpn.a(length, length);
                long j = jpm.a;
                ffjiVar.invoke(new jvu(str, a, 4));
            }
        }
    }

    @Override // defpackage.ixn
    public final void dO(jkv jkvVar) {
        jlm jlmVar = this.a.a;
        ffmx[] ffmxVarArr = jkr.a;
        jku jkuVar = jkm.a;
        jku jkuVar2 = jkm.C;
        ffmx ffmxVar = jkr.a[16];
        jkuVar2.a(jkvVar, jlmVar);
        jkr.w(jkvVar, this.b.c);
        int i = hwh.c;
        hwh hwhVar = hwg.a;
        jku jkuVar3 = jkm.q;
        ffmx ffmxVar2 = jkr.a[8];
        jkuVar3.a(jkvVar, hwhVar);
        ezl ezlVar = new ezl(this);
        jku jkuVar4 = jjl.a;
        jkvVar.e(jjl.g, new jjb(null, ezlVar));
        if (!this.d) {
            jkr.c(jkvVar);
        }
        if (this.e) {
            jkvVar.e(jkm.H, ffcu.a);
        }
        boolean z = this.d;
        jku jkuVar5 = jkm.K;
        ffmx ffmxVar3 = jkr.a[23];
        jkuVar5.a(jkvVar, Boolean.valueOf(z));
        jkr.D(jkvVar, new ezm(this));
        if (z) {
            jkr.J(jkvVar, new ezn(this));
            jkr.E(jkvVar, new ezo(this));
        }
        jkr.I(jkvVar, new ezp(this));
        int i2 = this.h.f;
        ezq ezqVar = new ezq(this);
        jkvVar.e(jkm.E, new juu(i2));
        jkvVar.e(jjl.o, new jjb(null, ezqVar));
        jkr.h(jkvVar, null, new ezr(this));
        jkr.i(jkvVar, null, new ezs(this));
        if (!jpm.i(this.b.c) && !this.e) {
            jkvVar.e(jjl.p, new jjb(null, new ezt(this)));
            if (this.d) {
                jkvVar.e(jjl.q, new jjb(null, new ezj(this)));
            }
        }
        if (this.d) {
            jkvVar.e(jjl.r, new jjb(null, new ezk(this)));
        }
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.ixn
    public final boolean ea() {
        return true;
    }
}
