package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajvx extends ffhr {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ ajwa e;
    int f;
    ajwa g;
    UUID h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajvx(ajwa ajwaVar, ffgu ffguVar) {
        super(ffguVar);
        this.e = ajwaVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(this);
    }
}
