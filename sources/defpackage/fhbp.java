package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbp extends fgvi {
    private static final long serialVersionUID = -1169413145174029391L;
    private final URI b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbp(String str) {
        super("SENT-BY");
        URI b = fhex.b(fhev.e(str));
        int i = fgwj.a;
        this.b = b;
    }

    @Override // defpackage.fguw
    public final String a() {
        String f = fhev.f(this.b);
        int i = fhex.a;
        return f;
    }
}
