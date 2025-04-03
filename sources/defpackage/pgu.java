package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pgu extends ffkk implements ffix {
    final /* synthetic */ pgv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgu(pgv pgvVar) {
        super(0);
        this.a = pgvVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return BigInteger.valueOf(this.a.b).shiftLeft(32).or(BigInteger.valueOf(this.a.c)).shiftLeft(32).or(BigInteger.valueOf(this.a.d));
    }
}
