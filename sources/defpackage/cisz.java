package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cisz extends ciwo {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    private CharSequence d;
    private long e;
    private byte f;

    @Override // defpackage.ciwo
    public final ciwp a() {
        CharSequence charSequence;
        if (this.f == 1 && (charSequence = this.d) != null) {
            return new cita(this.a, charSequence, this.e, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" messageText");
        }
        if (this.f == 0) {
            sb.append(" messageTimestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ciwo
    public final void b(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null messageText");
        }
        this.d = charSequence;
    }

    @Override // defpackage.ciwo
    public final void c(long j) {
        this.e = j;
        this.f = (byte) 1;
    }
}
