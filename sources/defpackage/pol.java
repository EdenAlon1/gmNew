package defpackage;

import androidx.work.CoroutineWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pol extends ffhv implements ffjm {
    int a;
    final /* synthetic */ CoroutineWorker b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pol(CoroutineWorker coroutineWorker, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = coroutineWorker;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ffgu c = c((ffsk) obj, (ffgu) obj2);
        ffcu ffcuVar = ffcu.a;
        ((pol) c).b(ffcuVar);
        return ffcuVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        this.a = 1;
        throw new IllegalStateException("Not implemented");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new pol(this.b, ffguVar);
    }
}
