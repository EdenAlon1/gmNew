package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akap extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ akbo c;
    int d;
    UUID e;
    ekzz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akap(akbo akboVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = akboVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
