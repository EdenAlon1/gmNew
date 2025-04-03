package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffhe implements Serializable, ffhd {
    public static final ffhe a = new ffhe();
    private static final long serialVersionUID = 0;

    private ffhe() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.ffhd
    public final <E extends ffha> E get(ffhb<E> ffhbVar) {
        ffhbVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.ffhd
    public final ffhd minusKey(ffhb<?> ffhbVar) {
        ffhbVar.getClass();
        return this;
    }

    @Override // defpackage.ffhd
    public final ffhd plus(ffhd ffhdVar) {
        ffhdVar.getClass();
        return ffhdVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.ffhd
    public final <R> R fold(R r, ffjm<? super R, ? super ffha, ? extends R> ffjmVar) {
        return r;
    }
}
