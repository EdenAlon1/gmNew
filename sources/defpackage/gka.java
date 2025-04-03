package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gka implements ijf {
    final /* synthetic */ gkb a;

    public gka(gkb gkbVar) {
        this.a = gkbVar;
    }

    @Override // defpackage.ijf
    public final long a(long j, long j2, int i) {
        if (!((Boolean) this.a.b.invoke()).booleanValue()) {
            return 0L;
        }
        gvr gvrVar = this.a.a;
        gvrVar.d(gvrVar.b() + iak.c(j));
        return 0L;
    }

    @Override // defpackage.ijf
    public final /* synthetic */ long b(long j, int i) {
        return 0L;
    }

    @Override // defpackage.ijf
    public final Object c(long j, long j2, ffgu ffguVar) {
        if (kan.b(j2) > 0.0f) {
            this.a.a.d(0.0f);
        }
        return new kan(0L);
    }

    @Override // defpackage.ijf
    public final /* synthetic */ Object d(long j, ffgu ffguVar) {
        return new kan(0L);
    }
}
