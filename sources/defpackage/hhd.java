package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhd implements CoroutineExceptionHandler, hjk {
    private final ffhd a;
    private final ffjm b;
    private final ffsk d;
    private ffud e;

    public hhd(ffhd ffhdVar, ffjm ffjmVar) {
        this.a = ffhdVar;
        this.b = ffjmVar;
        this.d = ffsl.b(ffhdVar.plus(ffhdVar.get(hua.a) != null ? this : ffhe.a));
    }

    @Override // defpackage.ffhd
    public final <R> R fold(R r, ffjm<? super R, ? super ffha, ? extends R> ffjmVar) {
        return (R) ffgz.a(this, r, ffjmVar);
    }

    @Override // defpackage.hjk
    public final void g() {
        ffud ffudVar = this.e;
        if (ffudVar != null) {
            ffudVar.t(new hhf());
        }
        this.e = null;
    }

    @Override // defpackage.ffha, defpackage.ffhd
    public final <E extends ffha> E get(ffhb<E> ffhbVar) {
        return (E) ffgz.b(this, ffhbVar);
    }

    @Override // defpackage.ffha
    public final ffhb<?> getKey() {
        return CoroutineExceptionHandler.c;
    }

    @Override // defpackage.hjk
    public final void h() {
        ffud ffudVar = this.e;
        if (ffudVar != null) {
            ffudVar.t(new hhf());
        }
        this.e = null;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(ffhd ffhdVar, Throwable th) {
        ffcu ffcuVar;
        hua huaVar = (hua) ffhdVar.get(hua.a);
        if (huaVar != null) {
            huaVar.b(th, this);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.a.get(CoroutineExceptionHandler.c);
        if (coroutineExceptionHandler != null) {
            coroutineExceptionHandler.handleException(ffhdVar, th);
            ffcuVar = ffcu.a;
        } else {
            ffcuVar = null;
        }
        if (ffcuVar == null) {
            throw th;
        }
    }

    @Override // defpackage.hjk
    public final void i() {
        ffud ffudVar = this.e;
        if (ffudVar != null) {
            ffui.e(ffudVar, "Old job was still running!", null);
        }
        this.e = ffqy.d(this.d, null, null, this.b, 3);
    }

    @Override // defpackage.ffhd
    public final ffhd minusKey(ffhb<?> ffhbVar) {
        return ffgz.c(this, ffhbVar);
    }

    @Override // defpackage.ffhd
    public final ffhd plus(ffhd ffhdVar) {
        return ffgz.d(this, ffhdVar);
    }
}
