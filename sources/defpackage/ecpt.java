package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ecpt implements Runnable {
    public final /* synthetic */ ecpv a;

    public /* synthetic */ ecpt(ecpv ecpvVar) {
        this.a = ecpvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ecpv ecpvVar = this.a;
        long millis = ecpvVar.a.e().toMillis();
        long j = ecpvVar.h;
        long j2 = ecpvVar.g;
        long j3 = j - j2;
        boolean z = false;
        if (j3 >= 0) {
            ecpvVar.k.c = false;
            if (j3 > ((Integer) ecpvVar.c.h().get(0)).intValue()) {
                ecjc ecjcVar = ecpvVar.e;
                eciu m = eciv.m();
                fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
                fgqu fgquVar = (fgqu) fgqv.a.createBuilder();
                fgquVar.copyOnWrite();
                fgqv fgqvVar = (fgqv) fgquVar.instance;
                fgqvVar.b = 2;
                fgqvVar.c = Long.valueOf(j3);
                fgqv fgqvVar2 = (fgqv) fgquVar.build();
                fgqwVar.copyOnWrite();
                fgqx fgqxVar = (fgqx) fgqwVar.instance;
                fgqvVar2.getClass();
                fgqxVar.s = fgqvVar2;
                fgqxVar.b |= 262144;
                m.f((fgqx) fgqwVar.build());
                ecjcVar.b(m.a());
                ecpvVar.f = 0;
            }
            ecpvVar.a(new ecps(ecpvVar), ecpvVar.c.g());
            return;
        }
        long j4 = millis - j2;
        ecfe ecfeVar = ecpvVar.k;
        if (((Boolean) ecfeVar.a.b()).booleanValue() && !ecfeVar.c && j4 >= ((Long) ecfeVar.b.b()).longValue()) {
            ecfeVar.c = true;
            ecfeVar.d.a(eceh.STALL);
        }
        if (((Boolean) ecpvVar.b.b()).booleanValue() || j4 > ((Integer) ecpvVar.c.h().get(ecpvVar.f)).intValue()) {
            engw h = ecpvVar.c.h();
            if (ecpvVar.f != h.size() && j4 > ((Integer) h.get(ecpvVar.f)).intValue()) {
                while (ecpvVar.f != h.size() && j4 > ((Integer) h.get(ecpvVar.f)).intValue()) {
                    ecpvVar.f++;
                    z = true;
                }
                if (z) {
                    ecjc ecjcVar2 = ecpvVar.e;
                    eciu m2 = eciv.m();
                    fgqw fgqwVar2 = (fgqw) fgqx.a.createBuilder();
                    fgqu fgquVar2 = (fgqu) fgqv.a.createBuilder();
                    fgquVar2.copyOnWrite();
                    fgqv fgqvVar3 = (fgqv) fgquVar2.instance;
                    fgqvVar3.b = 1;
                    fgqvVar3.c = Long.valueOf(j4);
                    fgqv fgqvVar4 = (fgqv) fgquVar2.build();
                    fgqwVar2.copyOnWrite();
                    fgqx fgqxVar2 = (fgqx) fgqwVar2.instance;
                    fgqvVar4.getClass();
                    fgqxVar2.s = fgqvVar4;
                    fgqxVar2.b |= 262144;
                    m2.f((fgqx) fgqwVar2.build());
                    ecjcVar2.b(m2.a());
                }
            }
        }
        ecpvVar.a(new ecpt(ecpvVar), ecpvVar.c.f());
    }
}
