package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecks {
    public final fazb a;
    private final echj b;

    public ecks(echj echjVar, fazb fazbVar) {
        this.b = echjVar;
        this.a = fazbVar;
    }

    public final fgpo a(ecda ecdaVar) {
        fgpo fgpoVar = (fgpo) fgpu.a.createBuilder();
        fgpoVar.copyOnWrite();
        fgpu fgpuVar = (fgpu) fgpoVar.instance;
        fgpuVar.b |= 1;
        fgpuVar.c = true;
        String d = ecda.d(ecdaVar);
        if (d != null) {
            fgpoVar.copyOnWrite();
            fgpu fgpuVar2 = (fgpu) fgpoVar.instance;
            fgpuVar2.b |= 4;
            fgpuVar2.e = d;
        }
        try {
            fgpa fgpaVar = (fgpa) fgpb.a.createBuilder();
            fgoz a = this.b.a();
            fgpaVar.copyOnWrite();
            fgpb fgpbVar = (fgpb) fgpaVar.instance;
            a.getClass();
            fgpbVar.c = a;
            fgpbVar.b |= 1;
            fgpoVar.copyOnWrite();
            fgpu fgpuVar3 = (fgpu) fgpoVar.instance;
            fgpb fgpbVar2 = (fgpb) fgpaVar.build();
            fgpbVar2.getClass();
            fgpuVar3.d = fgpbVar2;
            fgpuVar3.b |= 2;
            return fgpoVar;
        } catch (RuntimeException e) {
            ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricFactory", "newCrash", 'V', "CrashMetricFactory.java")).q("Failed to get process stats.");
            return fgpoVar;
        }
    }
}
