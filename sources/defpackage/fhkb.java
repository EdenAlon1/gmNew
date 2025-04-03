package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhkb extends fhho {
    final /* synthetic */ fhkf d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhkb(String str, fhkf fhkfVar, int i) {
        super(str);
        this.d = fhkfVar;
        this.e = i;
    }

    @Override // defpackage.fhho
    public final long a() {
        synchronized (this.d) {
            this.d.w.remove(Integer.valueOf(this.e));
        }
        return -1L;
    }
}
