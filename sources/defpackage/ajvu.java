package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajvu extends ffhr {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ajwa d;
    int e;
    ajwa f;
    UUID g;
    sny h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajvu(ajwa ajwaVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = ajwaVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, null, this);
    }
}
