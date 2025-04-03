package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhju extends fhho {
    final /* synthetic */ fhkf d;
    final /* synthetic */ fhkn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhju(String str, fhkf fhkfVar, fhkn fhknVar) {
        super(str);
        this.d = fhkfVar;
        this.e = fhknVar;
    }

    @Override // defpackage.fhho
    public final long a() {
        try {
            this.d.b.f(this.e);
            return -1L;
        } catch (IOException e) {
            fhlc.b.l("Http2Connection.Listener failure for ".concat(String.valueOf(this.d.d)), 4, e);
            try {
                this.e.k(2, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
