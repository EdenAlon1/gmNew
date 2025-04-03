package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cetn extends ceys {
    public engw a;
    public Exception b;
    public Bundle c;
    private boolean d;
    private boolean e;
    private boolean f;
    private byte g;

    public cetn() {
    }

    @Override // defpackage.ceys
    public final ceyt a() {
        if (this.g == 7) {
            return new ceto(this.d, this.e, this.a, this.b, this.f, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" completed");
        }
        if ((this.g & 2) == 0) {
            sb.append(" retryable");
        }
        if ((this.g & 4) == 0) {
            sb.append(" skipped");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ceys
    public final void b(boolean z) {
        this.d = z;
        this.g = (byte) (this.g | 1);
    }

    @Override // defpackage.ceys
    public final void c(boolean z) {
        this.e = z;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.ceys
    public final void d(boolean z) {
        this.f = z;
        this.g = (byte) (this.g | 4);
    }

    public cetn(ceyt ceytVar) {
        ceto cetoVar = (ceto) ceytVar;
        this.d = cetoVar.a;
        this.e = cetoVar.b;
        this.a = cetoVar.c;
        this.b = cetoVar.d;
        this.f = cetoVar.e;
        this.c = cetoVar.f;
        this.g = (byte) 7;
    }
}
