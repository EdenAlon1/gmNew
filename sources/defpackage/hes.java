package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hes implements hhh {
    public final Object a;
    public List b;
    public List c;
    public final hpm d;
    private final ffix f;
    private Throwable g;

    public hes() {
        this(null);
    }

    @Override // defpackage.hhh
    public final Object a(ffji ffjiVar, ffgu ffguVar) {
        ffix ffixVar;
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        heq heqVar = new heq(ffjiVar, ffrhVar);
        synchronized (this.a) {
            Throwable th = this.g;
            if (th != null) {
                ffrhVar.w(ffci.a(th));
            } else {
                boolean isEmpty = this.b.isEmpty();
                this.b.add(heqVar);
                if (isEmpty) {
                    this.d.set(1);
                }
                ffrhVar.d(new her(this, heqVar));
                if (isEmpty && (ffixVar = this.f) != null) {
                    try {
                        ffixVar.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.a) {
                            if (this.g == null) {
                                this.g = th2;
                                List list = this.b;
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    ((heq) list.get(i)).b.w(ffci.a(th2));
                                }
                                this.b.clear();
                                this.d.set(0);
                            }
                        }
                    }
                }
            }
        }
        return ffrhVar.m();
    }

    @Override // defpackage.ffhd
    public final <R> R fold(R r, ffjm<? super R, ? super ffha, ? extends R> ffjmVar) {
        return (R) ffgz.a(this, r, ffjmVar);
    }

    @Override // defpackage.ffha, defpackage.ffhd
    public final <E extends ffha> E get(ffhb<E> ffhbVar) {
        return (E) ffgz.b(this, ffhbVar);
    }

    @Override // defpackage.ffha
    public final /* synthetic */ ffhb getKey() {
        return hhh.e;
    }

    @Override // defpackage.ffhd
    public final ffhd minusKey(ffhb<?> ffhbVar) {
        return ffgz.c(this, ffhbVar);
    }

    @Override // defpackage.ffhd
    public final ffhd plus(ffhd ffhdVar) {
        return ffgz.d(this, ffhdVar);
    }

    public hes(ffix ffixVar) {
        this.f = ffixVar;
        this.a = new Object();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new hpm();
    }
}
