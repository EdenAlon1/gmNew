package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fftl implements Runnable, Comparable, ffte, fghx {
    public volatile Object _heap;
    private int a = -1;
    public long b;

    public fftl(long j) {
        this.b = j;
    }

    @Override // defpackage.fghx
    public final int b() {
        return this.a;
    }

    @Override // defpackage.fghx
    public final fghw c() {
        Object obj = this._heap;
        if (obj instanceof fghw) {
            return (fghw) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.b - ((fftl) obj).b;
        if (j > 0) {
            return 1;
        }
        return j >= 0 ? 0 : -1;
    }

    @Override // defpackage.fghx
    public final void d(fghw fghwVar) {
        if (this._heap == fftp.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = fghwVar;
    }

    @Override // defpackage.fghx
    public final void e(int i) {
        this.a = i;
    }

    @Override // defpackage.ffte
    public final void hO() {
        synchronized (this) {
            Object obj = this._heap;
            if (obj == fftp.a) {
                return;
            }
            fftm fftmVar = obj instanceof fftm ? (fftm) obj : null;
            if (fftmVar != null) {
                synchronized (fftmVar) {
                    if (c() != null) {
                        int b = b();
                        boolean z = ffso.a;
                        fftmVar.d(b);
                    }
                }
            }
            this._heap = fftp.a;
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.b + "]";
    }
}
