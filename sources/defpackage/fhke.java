package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhke extends fhho {
    final /* synthetic */ fhkf d;
    final /* synthetic */ int e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhke(String str, fhkf fhkfVar, int i, long j) {
        super(str);
        this.d = fhkfVar;
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.fhho
    public final long a() {
        try {
            this.d.u.i(this.e, this.f);
            return -1L;
        } catch (IOException e) {
            this.d.c(e);
            return -1L;
        }
    }
}
