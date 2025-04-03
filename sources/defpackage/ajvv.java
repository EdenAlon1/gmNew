package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajvv extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ajwa c;
    int d;
    UUID e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajvv(ajwa ajwaVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = ajwaVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
