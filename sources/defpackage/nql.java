package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nql {
    public final lqw a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final int f;
    public final nqo g;

    public nql(lqw lqwVar, boolean z, long j, nqo nqoVar) {
        lti.d(true, "Audio and video cannot both be removed");
        if (c(lqwVar)) {
            lti.a(j != -9223372036854775807L);
            lti.a(!z && nqoVar.b.isEmpty());
        }
        this.a = lqwVar;
        this.b = z;
        this.c = false;
        this.d = false;
        this.e = j;
        this.f = -2147483647;
        this.g = nqoVar;
    }

    private static boolean c(lqw lqwVar) {
        return Objects.equals(lqwVar.a, "androidx-media3-GapMediaItem");
    }

    final long a(long j) {
        long j2;
        if (this.b) {
            j2 = -9223372036854775807L;
        } else {
            engw engwVar = this.g.b;
            int size = engwVar.size();
            long j3 = j;
            for (int i = 0; i < size; i++) {
                j3 = ((lsr) engwVar.get(i)).a(j3);
            }
            j2 = j3;
        }
        engw engwVar2 = this.g.c;
        int size2 = engwVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((lpx) engwVar2.get(i2)).a();
        }
        return Math.max(j2, j);
    }

    final boolean b() {
        return c(this.a);
    }
}
