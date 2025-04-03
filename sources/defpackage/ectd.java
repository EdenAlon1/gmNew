package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ectd {
    static final ecte a = new ectb(fgpf.a, true);
    private final Random b;
    private final ernh c;
    private final ecsp d;

    public ectd(Random random, ecsp ecspVar, ernh ernhVar) {
        this.b = random;
        this.c = ernhVar;
        this.d = ecspVar;
    }

    public final ecte a(fgpf fgpfVar) {
        int a2 = fgpe.a(fgpfVar.d);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            return new ectb(fgpfVar, fgpfVar.c == 1000);
        }
        if (i == 3) {
            return new ectb(fgpfVar, this.b.nextDouble() * 1000.0d < ((double) fgpfVar.c));
        }
        if (i != 4) {
            if (i == 5) {
                fgpfVar = fgpf.a;
            }
            return new ectb(fgpfVar, true);
        }
        Random random = this.b;
        ecsp ecspVar = this.d;
        ecspVar.getClass();
        return new ectc(fgpfVar, random, ecspVar, this.c);
    }
}
