package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avb {
    public final /* synthetic */ avk a;

    public avb(avk avkVar) {
        this.a = avkVar;
    }

    public final void a() {
        avk avkVar = this.a;
        synchronized (avkVar.b) {
            Integer num = (Integer) avkVar.b.getAndSet(null);
            if (num == null) {
                return;
            }
            if (num.intValue() != avkVar.b()) {
                avkVar.t();
            }
        }
    }
}
