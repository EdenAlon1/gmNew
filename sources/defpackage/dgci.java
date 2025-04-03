package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgci {
    private final dgch a;
    private final emcd b;
    private long c;
    private final dfym d;

    public dgci(dgch dgchVar, dfym dfymVar) {
        this.a = dgchVar;
        this.d = dfymVar;
        this.b = (emcd) emch.a.createBuilder();
        this.c = -1L;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized dgci clone() {
        return new dgci(this);
    }

    public final synchronized emch b() {
        return (emch) this.b.build();
    }

    public final void c(int i, dgch dgchVar) {
        if (dgchVar == dgch.NOTHING) {
            throw new IllegalArgumentException("Cannot record an event with granularity NOTHING");
        }
        if (dgchVar.compareTo(this.a) > 0) {
            return;
        }
        synchronized (this) {
            emce emceVar = (emce) emcg.a.createBuilder();
            emceVar.copyOnWrite();
            emcg emcgVar = (emcg) emceVar.instance;
            emcgVar.c = i - 1;
            emcgVar.b |= 1;
            long nanoTime = System.nanoTime();
            long j = this.c;
            if (j >= 0) {
                long millis = Duration.ofNanos(nanoTime - j).toMillis();
                emceVar.copyOnWrite();
                emcg emcgVar2 = (emcg) emceVar.instance;
                emcgVar2.b |= 2;
                emcgVar2.d = millis;
            }
            this.c = nanoTime;
            emcd emcdVar = this.b;
            emcdVar.copyOnWrite();
            emch emchVar = (emch) emcdVar.instance;
            emcg emcgVar3 = (emcg) emceVar.build();
            emch emchVar2 = emch.a;
            emcgVar3.getClass();
            eygr eygrVar = emchVar.b;
            if (!eygrVar.c()) {
                emchVar.b = eyfy.mutableCopy(eygrVar);
            }
            emchVar.b.add(emcgVar3);
        }
    }

    private dgci(dgci dgciVar) {
        this.a = dgciVar.a;
        this.d = dgciVar.d;
        this.b = (emcd) dgciVar.b.mo371clone();
        this.c = dgciVar.c;
    }
}
