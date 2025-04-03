package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bve {
    public static final List a = DesugarCollections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    public static bvd f() {
        bwd bwdVar = new bwd();
        bwdVar.d(-1);
        bwdVar.f(-1);
        bwdVar.e(-1);
        bwdVar.c(-1);
        return bwdVar;
    }

    public abstract int a();

    public abstract int b();

    public final int c() {
        int a2 = a();
        int d = d();
        ksw.b(d > 0, a.h(d, "Invalid channel count: "));
        if (a2 == 2) {
            return d + d;
        }
        throw new IllegalArgumentException(a.h(a2, "Invalid audio encoding: "));
    }

    public abstract int d();

    public abstract int e();
}
