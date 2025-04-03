package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sqd extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ sqf b;
    int c;
    sqf d;
    Duration e;
    UUID f;
    sor g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqd(sqf sqfVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = sqfVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, null, this);
    }
}
