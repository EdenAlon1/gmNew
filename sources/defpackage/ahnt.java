package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahnt extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ ahny d;
    final /* synthetic */ eisx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahnt(AtomicReference atomicReference, ahny ahnyVar, eisx eisxVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = atomicReference;
        this.d = ahnyVar;
        this.e = eisxVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            AtomicReference atomicReference = this.c;
            ahny ahnyVar = this.d;
            eisx eisxVar = this.e;
            this.a = atomicReference;
            this.b = 1;
            Object c = ahnyVar.c(eisxVar, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            obj2 = atomicReference;
            obj = c;
        }
        ((AtomicReference) obj2).set(ejug.a(obj, this.d.a.f()));
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ahnt(this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
