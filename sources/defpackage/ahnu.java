package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahnu extends ffhv implements ffji {
    final /* synthetic */ AtomicReference a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahnu(AtomicReference atomicReference, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = atomicReference;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a.get();
        obj2.getClass();
        return obj2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ahnu(this.a, (ffgu) obj).b(ffcu.a);
    }
}
