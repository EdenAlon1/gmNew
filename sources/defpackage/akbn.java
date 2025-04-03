package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akbn extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ akbo b;
    int c;
    akbo d;
    UUID e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbn(akbo akboVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = akboVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m(null, null, this);
    }
}
