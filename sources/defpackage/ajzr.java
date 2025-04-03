package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajzr extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ akag b;
    int c;
    akag d;
    UUID e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzr(akag akagVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = akagVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, this);
    }
}
