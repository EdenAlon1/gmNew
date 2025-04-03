package defpackage;

import j$.time.LocalDate;
import j$.time.MonthDay;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class airx extends ffhr {
    Object a;
    int b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ airy e;
    int f;
    airy g;
    LocalDate h;
    MonthDay i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airx(airy airyVar, ffgu ffguVar) {
        super(ffguVar);
        this.e = airyVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
