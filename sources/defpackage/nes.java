package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nes extends AbstractC0191new {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int e;

    public nes(ndu nduVar) {
        super(nduVar);
    }

    @Override // defpackage.AbstractC0191new
    protected final boolean a(luv luvVar) {
        if (this.b) {
            luvVar.L(1);
        } else {
            int j = luvVar.j();
            int i = j >> 4;
            this.e = i;
            if (i == 2) {
                int i2 = a[(j >> 2) & 3];
                lqb lqbVar = new lqb();
                lqbVar.a("video/x-flv");
                lqbVar.c("audio/mpeg");
                lqbVar.C = 1;
                lqbVar.D = i2;
                this.d.i(new lqc(lqbVar));
                this.c = true;
            } else if (i == 7 || i == 8) {
                lqb lqbVar2 = new lqb();
                lqbVar2.a("video/x-flv");
                lqbVar2.c(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                lqbVar2.C = 1;
                lqbVar2.D = 8000;
                this.d.i(new lqc(lqbVar2));
                this.c = true;
            } else if (i != 10) {
                throw new nev(a.h(i, "Audio format not supported: "));
            }
            this.b = true;
        }
        return true;
    }

    @Override // defpackage.AbstractC0191new
    protected final boolean b(luv luvVar, long j) {
        if (this.e == 2) {
            int b = luvVar.b();
            this.d.m(luvVar, b);
            this.d.o(j, 1, b, 0, null);
            return true;
        }
        int j2 = luvVar.j();
        if (j2 != 0 || this.c) {
            if (this.e == 10 && j2 != 1) {
                return false;
            }
            int b2 = luvVar.b();
            this.d.m(luvVar, b2);
            this.d.o(j, 1, b2, 0, null);
            return true;
        }
        int b3 = luvVar.b();
        byte[] bArr = new byte[b3];
        luvVar.F(bArr, 0, b3);
        nbn a2 = nbo.a(bArr);
        lqb lqbVar = new lqb();
        lqbVar.a("video/x-flv");
        lqbVar.c("audio/mp4a-latm");
        lqbVar.j = a2.c;
        lqbVar.C = a2.b;
        lqbVar.D = a2.a;
        lqbVar.p = Collections.singletonList(bArr);
        this.d.i(new lqc(lqbVar));
        this.c = true;
        return false;
    }
}
