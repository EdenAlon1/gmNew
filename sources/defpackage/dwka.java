package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwka implements kev {
    final /* synthetic */ int a;

    public dwka(int i) {
        this.a = i;
    }

    @Override // defpackage.kev
    public final long a(kac kacVar, long j, kah kahVar, long j2) {
        kahVar.getClass();
        int b = kacVar.b() - ((int) (j2 >> 32));
        int i = kacVar.c - ((int) (j2 & 4294967295L));
        int i2 = this.a;
        int i3 = i - i2;
        if (i3 < 0) {
            i3 = kacVar.e + i2;
        }
        return ((kacVar.b + (b / 2)) << 32) | (4294967295L & i3);
    }
}
