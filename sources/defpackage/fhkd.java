package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhkd extends fhho {
    final /* synthetic */ fhkf d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhkd(String str, fhkf fhkfVar, int i, int i2) {
        super(str);
        this.d = fhkfVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.fhho
    public final long a() {
        try {
            this.d.m(this.e, this.f);
            return -1L;
        } catch (IOException e) {
            this.d.c(e);
            return -1L;
        }
    }
}
