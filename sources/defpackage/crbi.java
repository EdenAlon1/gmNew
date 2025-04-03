package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crbi extends crej {
    public bdhg a;
    private awvd d;
    private Optional c = Optional.empty();
    public Optional b = Optional.empty();

    @Override // defpackage.crej
    public final crek a() {
        awvd awvdVar;
        bdhg bdhgVar = this.a;
        if (bdhgVar != null && (awvdVar = this.d) != null) {
            return new crbj(bdhgVar, this.c, this.b, awvdVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rcsMessageId");
        }
        if (this.d == null) {
            sb.append(" fileUploadResponse");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.crej
    public final void b(String str) {
        this.c = Optional.ofNullable(str);
    }

    @Override // defpackage.crej
    public final void c(awvd awvdVar) {
        if (awvdVar == null) {
            throw new NullPointerException("Null fileUploadResponse");
        }
        this.d = awvdVar;
    }
}
