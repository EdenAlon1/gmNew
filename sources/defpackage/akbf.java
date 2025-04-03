package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akbf extends ffhr {
    long a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ akbo d;
    int e;
    akbo f;
    UUID g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbf(akbo akboVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = akboVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.l(null, null, 0L, this);
    }
}
