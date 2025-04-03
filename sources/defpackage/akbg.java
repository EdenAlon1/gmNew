package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akbg extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ akbo b;
    int c;
    akbo d;
    eqza e;
    UUID f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbg(akbo akboVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = akboVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object q;
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        q = this.b.q(null, null, false, this);
        return q;
    }
}
