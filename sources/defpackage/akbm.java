package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akbm extends ffhr {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ akbo d;
    int e;
    akbo f;
    UUID g;
    Duration h;
    ekzz i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbm(akbo akboVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = akboVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.i(null, this);
    }
}
