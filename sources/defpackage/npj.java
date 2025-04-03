package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npj extends nsc {
    private final npo e;
    private final lsp f;
    private final lxz g;
    private final lxz h;
    private final npg i;
    private final npi j;
    private final lqc k;
    private boolean l;
    private long m;

    /* JADX WARN: Multi-variable type inference failed */
    public npj(lqc lqcVar, lqc lqcVar2, nsl nslVar, nql nqlVar, engw engwVar, npn npnVar, nrx nrxVar, nrj nrjVar) {
        super(lqcVar, nrxVar);
        npi npiVar;
        npn npnVar2;
        nqg nqgVar;
        npi npiVar2;
        nsl nslVar2;
        lsw lswVar = new lsw();
        engr engrVar = new engr();
        engrVar.j(engwVar);
        engrVar.h(lswVar);
        npg npgVar = new npg(engrVar.g());
        this.i = npgVar;
        this.k = lqcVar2;
        npi b = npgVar.b(nqlVar, lqcVar2);
        lsp a = npgVar.a();
        lti.c(!a.equals(lsp.a));
        lqb lqbVar = new lqb();
        String str = nslVar.b;
        if (str == null) {
            str = lqcVar.o;
            lti.f(str);
        }
        lqbVar.c(str);
        lqbVar.D = a.b;
        lqbVar.C = a.c;
        lqbVar.E = a.d;
        lqbVar.j = lqcVar2.k;
        lqc lqcVar3 = new lqc(lqbVar);
        lqb lqbVar2 = new lqb(lqcVar3);
        lqbVar2.c(k(lqcVar3, nrxVar.b(1)));
        lqc lqcVar4 = new lqc(lqbVar2);
        npl nplVar = (npl) npnVar;
        npn npnVar3 = nplVar.a;
        if (lqcVar4.j == -1) {
            lqb lqbVar3 = new lqb(lqcVar4);
            lqbVar3.h = 131072;
            lqcVar4 = new lqc(lqbVar3);
        }
        if (lqcVar4.o == null) {
            throw nqi.b(lqcVar4, false);
        }
        MediaFormat b2 = lum.b(lqcVar4);
        engw f = nqt.f(lqcVar4.o);
        if (f.isEmpty()) {
            throw nqi.a(lqcVar4, "No audio media codec found");
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) f.get(0);
        final String str2 = lqcVar4.o;
        lti.f(str2);
        if (f.isEmpty()) {
            nqgVar = null;
            npiVar = b;
            npnVar2 = npnVar3;
        } else {
            npiVar = b;
            final int i = lqcVar4.F;
            npnVar2 = npnVar3;
            MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) nqi.c(f, new nqf() { // from class: nqd
                @Override // defpackage.nqf
                public final int a(MediaCodecInfo mediaCodecInfo3) {
                    String str3 = str2;
                    int i2 = i;
                    return Math.abs(nqt.b(mediaCodecInfo3, str3, i2) - i2);
                }
            }).get(0);
            int b3 = nqt.b(mediaCodecInfo2, str2, lqcVar4.F);
            lqb lqbVar4 = new lqb(lqcVar4);
            lqbVar4.D = b3;
            nqgVar = new nqg(mediaCodecInfo2, new lqc(lqbVar4));
        }
        if (nqgVar != null) {
            mediaCodecInfo = nqgVar.a;
            lqcVar4 = nqgVar.b;
            b2 = lum.b(lqcVar4);
        }
        npw npwVar = new npw(((nqi) npnVar2).a, lqcVar4, b2, mediaCodecInfo.getName(), false, null);
        nplVar.b = npwVar.c();
        this.e = npwVar;
        try {
            npw npwVar2 = npwVar;
            MediaFormat inputFormat = npwVar.b.getInputFormat();
            npw npwVar3 = npwVar;
            boolean z = npwVar.e;
            npw npwVar4 = npwVar;
            lsp lspVar = new lsp(npw.j(inputFormat, z, npwVar.a.l));
            if (lspVar.b != a.b) {
                npgVar.c();
                lswVar.j(lspVar.b);
                npiVar2 = npgVar.b(nqlVar, lqcVar2);
                a = npgVar.a();
            } else {
                npiVar2 = npiVar;
            }
            this.j = npiVar2;
            this.f = a;
            this.g = new lxz(0);
            this.h = new lxz(0);
            lqc lqcVar5 = npwVar.a;
            String str3 = lqcVar3.o;
            String str4 = lqcVar5.o;
            int i2 = lvf.a;
            if (Objects.equals(str3, str4)) {
                nslVar2 = nslVar;
            } else {
                nsk nskVar = new nsk(nslVar);
                nskVar.b(lqcVar5.o);
                nslVar2 = nskVar.a();
            }
            nrjVar.a(nslVar2);
        } catch (RuntimeException e) {
            luj.h(e);
            throw npwVar.k(e);
        }
    }

    private final long h() {
        lsp lspVar = this.f;
        return ((this.m / lspVar.e) * 1000000) / lspVar.b;
    }

    @Override // defpackage.nsc
    public final void d() {
        this.i.c();
        this.e.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ef, code lost:
    
        if (r8.a != r10) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0375  */
    @Override // defpackage.nsc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean g() {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npj.g():boolean");
    }

    @Override // defpackage.nsc
    protected final lqc p() {
        return this.e.b();
    }

    @Override // defpackage.nsc
    protected final lxz q() {
        lxz lxzVar = this.h;
        lxzVar.d = this.e.d();
        if (lxzVar.d == null) {
            return null;
        }
        MediaCodec.BufferInfo a = this.e.a();
        lti.f(a);
        lxzVar.f = a.presentationTimeUs;
        lxz lxzVar2 = this.h;
        lxzVar2.a = 1;
        return lxzVar2;
    }

    @Override // defpackage.nsc
    public final /* bridge */ /* synthetic */ nrl r(nql nqlVar, lqc lqcVar, int i) {
        if (this.l) {
            return this.i.b(nqlVar, lqcVar);
        }
        this.l = true;
        lti.c(lqcVar.equals(this.k));
        return this.j;
    }

    @Override // defpackage.nsc
    protected final void s() {
        this.e.i();
    }

    @Override // defpackage.nsc
    protected final boolean t() {
        return this.e.g();
    }
}
