package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhby extends fgwo {
    private static final long serialVersionUID = 8430929418723298803L;
    private URI c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhby() {
        super("ATTENDEE");
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        String f = fhev.f(this.c);
        int i = fhex.a;
        return f;
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        this.c = fhex.b(str);
    }
}
