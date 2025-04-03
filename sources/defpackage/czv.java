package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czv extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ czr e;
    final /* synthetic */ czw f;
    final /* synthetic */ ffji g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czv(czr czrVar, czw czwVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = czrVar;
        this.f = czwVar;
        this.g = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fgjb, int] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        czw czwVar;
        czt cztVar;
        ffji ffjiVar;
        fgjb fgjbVar;
        czw czwVar2;
        Throwable th;
        fgjb fgjbVar2;
        ffhh ffhhVar = ffhh.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    ffci.b(obj);
                    ffsk ffskVar = (ffsk) this.h;
                    czr czrVar = this.e;
                    ffha ffhaVar = ffskVar.hT().get(ffud.c);
                    ffhaVar.getClass();
                    czt cztVar2 = new czt(czrVar, (ffud) ffhaVar);
                    czw czwVar3 = this.f;
                    while (true) {
                        czt cztVar3 = (czt) czwVar3.a.get();
                        if (cztVar3 != null && cztVar2.a.compareTo(cztVar3.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        AtomicReference atomicReference = czwVar3.a;
                        while (!atomicReference.compareAndSet(cztVar3, cztVar2)) {
                            if (atomicReference.get() != cztVar3) {
                                break;
                            }
                        }
                        if (cztVar3 != null) {
                            cztVar3.b.t(new czs());
                        }
                        czwVar = this.f;
                        ffji ffjiVar2 = this.g;
                        this.h = cztVar2;
                        fgjb fgjbVar3 = czwVar.b;
                        this.a = fgjbVar3;
                        this.b = ffjiVar2;
                        this.c = czwVar;
                        this.d = 1;
                        if (fgjbVar3.a(null, this) != ffhhVar) {
                            cztVar = cztVar2;
                            ffjiVar = ffjiVar2;
                            fgjbVar = fgjbVar3;
                        }
                    }
                    return ffhhVar;
                }
                if (r1 != 1) {
                    czwVar2 = (czw) this.b;
                    Object obj2 = this.a;
                    cztVar = (czt) this.h;
                    try {
                        ffci.b(obj);
                        fgjbVar2 = obj2;
                        czu.a(czwVar2.a, cztVar);
                        fgjbVar2.b(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        czu.a(czwVar2.a, cztVar);
                        throw th;
                    }
                }
                Object obj3 = this.c;
                ffji ffjiVar3 = (ffji) this.b;
                Object obj4 = this.a;
                czt cztVar4 = (czt) this.h;
                ffci.b(obj);
                czwVar = obj3;
                fgjbVar = obj4;
                ffjiVar = ffjiVar3;
                cztVar = cztVar4;
                this.h = cztVar;
                this.a = fgjbVar;
                this.b = czwVar;
                this.c = null;
                this.d = 2;
                Object invoke = ffjiVar.invoke(this);
                if (invoke != ffhhVar) {
                    czwVar2 = czwVar;
                    obj = invoke;
                    fgjbVar2 = fgjbVar;
                    czu.a(czwVar2.a, cztVar);
                    fgjbVar2.b(null);
                    return obj;
                }
                return ffhhVar;
            } catch (Throwable th3) {
                czwVar2 = czwVar;
                th = th3;
                czu.a(czwVar2.a, cztVar);
                throw th;
            }
        } catch (Throwable th4) {
            r1.b(null);
            throw th4;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        czv czvVar = new czv(this.e, this.f, this.g, ffguVar);
        czvVar.h = obj;
        return czvVar;
    }
}
