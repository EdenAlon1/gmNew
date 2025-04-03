package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fget extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx[] b;
    final /* synthetic */ int c;
    final /* synthetic */ AtomicInteger d;
    final /* synthetic */ ffwm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fget(ffxx[] ffxxVarArr, int i, AtomicInteger atomicInteger, ffwm ffwmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVarArr;
        this.c = i;
        this.d = atomicInteger;
        this.e = ffwmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fget) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        AtomicInteger atomicInteger;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ffxx[] ffxxVarArr = this.b;
                int i = this.c;
                ffxx ffxxVar = ffxxVarArr[i];
                fges fgesVar = new fges(this.e, i);
                this.a = 1;
                if (ffxxVar.a(fgesVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.e.e(null);
            }
            return ffcu.a;
        } finally {
            if (this.d.decrementAndGet() == 0) {
                this.e.e(null);
            }
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fget(this.b, this.c, this.d, this.e, ffguVar);
    }
}
