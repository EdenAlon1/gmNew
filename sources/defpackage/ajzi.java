package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajzi extends ffhr {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ akag d;
    int e;
    akag f;
    UUID g;
    Duration h;
    fflb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzi(akag akagVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = akagVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, this);
    }
}
