package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhjy extends fhho {
    final /* synthetic */ fhkf d;
    final /* synthetic */ int e;
    final /* synthetic */ fhmt f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhjy(String str, fhkf fhkfVar, int i, fhmt fhmtVar, int i2) {
        super(str);
        this.d = fhkfVar;
        this.e = i;
        this.f = fhmtVar;
        this.g = i2;
    }

    @Override // defpackage.fhho
    public final long a() {
        try {
            this.f.C(this.g);
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
