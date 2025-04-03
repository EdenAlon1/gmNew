package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akam extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ akbo c;
    int d;
    UUID e;
    ffkz f;
    ekzz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akam(akbo akboVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = akboVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
