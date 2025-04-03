package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhka extends fhho {
    final /* synthetic */ fhkf d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhka(String str, fhkf fhkfVar, int i) {
        super(str);
        this.d = fhkfVar;
        this.e = i;
    }

    @Override // defpackage.fhho
    public final long a() {
        try {
            this.d.u.j(this.e, 9);
            synchronized (this.d) {
                this.d.w.remove(Integer.valueOf(this.e));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
