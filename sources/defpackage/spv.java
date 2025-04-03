package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spv extends ffhr {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ spw d;
    int e;
    spw f;
    UUID g;
    dfjp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spv(spw spwVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = spwVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, this);
    }
}
