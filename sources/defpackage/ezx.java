package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezx extends ffhv implements ffjm {
    final /* synthetic */ ezy a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezx(ezy ezyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ezyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ezx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        ffci.b(obj);
        ffsk ffskVar = (ffsk) this.b;
        ffud ffudVar = (ffud) this.a.b.getAndSet(null);
        ezy ezyVar = this.a;
        ffud d = ffqy.d(ffskVar, null, null, new ezw(ffudVar, ezyVar, null), 3);
        while (true) {
            AtomicReference atomicReference = ezyVar.b;
            if (atomicReference.compareAndSet(null, d)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ezx ezxVar = new ezx(this.a, ffguVar);
        ezxVar.b = obj;
        return ezxVar;
    }
}
