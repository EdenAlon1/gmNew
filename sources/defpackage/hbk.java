package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbk extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dhy e;
    final /* synthetic */ hbl f;
    final /* synthetic */ ffji g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbk(dhy dhyVar, hbl hblVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = dhyVar;
        this.f = hblVar;
        this.g = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hbk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fgjb, int] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        hbl hblVar;
        hbi hbiVar;
        ffji ffjiVar;
        fgjb fgjbVar;
        hbl hblVar2;
        Throwable th;
        fgjb fgjbVar2;
        ffhh ffhhVar = ffhh.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    ffci.b(obj);
                    ffsk ffskVar = (ffsk) this.h;
                    dhy dhyVar = this.e;
                    ffha ffhaVar = ffskVar.hT().get(ffud.c);
                    ffhaVar.getClass();
                    hbi hbiVar2 = new hbi(dhyVar, (ffud) ffhaVar);
                    hbl hblVar3 = this.f;
                    while (true) {
                        hbi hbiVar3 = (hbi) hblVar3.a.get();
                        if (hbiVar3 != null && hbiVar2.a.compareTo(hbiVar3.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        AtomicReference atomicReference = hblVar3.a;
                        while (!atomicReference.compareAndSet(hbiVar3, hbiVar2)) {
                            if (atomicReference.get() != hbiVar3) {
                                break;
                            }
                        }
                        if (hbiVar3 != null) {
                            hbiVar3.b.t(null);
                        }
                        hblVar = this.f;
                        ffji ffjiVar2 = this.g;
                        this.h = hbiVar2;
                        fgjb fgjbVar3 = hblVar.b;
                        this.a = fgjbVar3;
                        this.b = ffjiVar2;
                        this.c = hblVar;
                        this.d = 1;
                        if (fgjbVar3.a(null, this) != ffhhVar) {
                            hbiVar = hbiVar2;
                            ffjiVar = ffjiVar2;
                            fgjbVar = fgjbVar3;
                        }
                    }
                    return ffhhVar;
                }
                if (r1 != 1) {
                    hblVar2 = (hbl) this.b;
                    Object obj2 = this.a;
                    hbiVar = (hbi) this.h;
                    try {
                        ffci.b(obj);
                        fgjbVar2 = obj2;
                        hbj.a(hblVar2.a, hbiVar);
                        fgjbVar2.b(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        hbj.a(hblVar2.a, hbiVar);
                        throw th;
                    }
                }
                Object obj3 = this.c;
                ffji ffjiVar3 = (ffji) this.b;
                Object obj4 = this.a;
                hbi hbiVar4 = (hbi) this.h;
                ffci.b(obj);
                hblVar = obj3;
                fgjbVar = obj4;
                ffjiVar = ffjiVar3;
                hbiVar = hbiVar4;
                this.h = hbiVar;
                this.a = fgjbVar;
                this.b = hblVar;
                this.c = null;
                this.d = 2;
                Object invoke = ffjiVar.invoke(this);
                if (invoke != ffhhVar) {
                    hblVar2 = hblVar;
                    obj = invoke;
                    fgjbVar2 = fgjbVar;
                    hbj.a(hblVar2.a, hbiVar);
                    fgjbVar2.b(null);
                    return obj;
                }
                return ffhhVar;
            } catch (Throwable th3) {
                hblVar2 = hblVar;
                th = th3;
                hbj.a(hblVar2.a, hbiVar);
                throw th;
            }
        } catch (Throwable th4) {
            r1.b(null);
            throw th4;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        hbk hbkVar = new hbk(this.e, this.f, this.g, ffguVar);
        hbkVar.h = obj;
        return hbkVar;
    }
}
