package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfbl extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cfbn c;
    int d;
    WorkerParameters e;
    String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfbl(cfbn cfbnVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = cfbnVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
