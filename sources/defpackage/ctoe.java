package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctoe extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ctof d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctoe(ctof ctofVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = ctofVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctoe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        fgjb fgjbVar;
        ffhh ffhhVar = ffhh.a;
        if (this.c != 0) {
            obj2 = this.b;
            Object obj3 = this.a;
            ffci.b(obj);
            fgjbVar = obj3;
        } else {
            ffci.b(obj);
            ctof ctofVar = this.d;
            fgjb fgjbVar2 = ctofVar.s;
            this.a = fgjbVar2;
            this.b = ctofVar;
            this.c = 1;
            if (fgjbVar2.a(null, this) == ffhhVar) {
                return ffhhVar;
            }
            obj2 = ctofVar;
            fgjbVar = fgjbVar2;
        }
        try {
            if (((ctof) obj2).p != null) {
                long epochMilli = ((ctof) obj2).h.f().toEpochMilli() - ((ctof) obj2).q;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Object e = ctni.c.e();
                e.getClass();
                if (epochMilli > timeUnit.toMillis(((Number) e).longValue())) {
                    ((ctof) obj2).q = ((ctof) obj2).h.f().toEpochMilli();
                    emlk emlkVar = ((ctof) obj2).p;
                    if (emlkVar != null) {
                        engw engwVar = emlkVar.g;
                        int i = ((enou) engwVar).c;
                        for (int i2 = 0; i2 < i; i2++) {
                            ((empj) engwVar.get(i2)).b();
                        }
                    }
                }
            }
            fgjbVar.b(null);
            return ffcu.a;
        } catch (Throwable th) {
            fgjbVar.b(null);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctoe(this.d, ffguVar);
    }
}
