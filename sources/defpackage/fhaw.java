package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhaw extends fgvi {
    private static final long serialVersionUID = -2445932592596993470L;
    private final URI b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhaw(String str) {
        super("ALTREP");
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
