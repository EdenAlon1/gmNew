package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class aoym implements alyn {
    public static aoym g(aqux aquxVar, alxo alxoVar, alyt alytVar, long j) {
        return new aore(aquxVar, alxoVar, alytVar, Instant.ofEpochMilli(j));
    }

    public abstract alxo a();

    public abstract alyt b();

    @Override // defpackage.alya
    public final /* synthetic */ int d() {
        return 2;
    }

    public abstract Instant e();

    public abstract void f();
}
