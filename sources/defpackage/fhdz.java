package defpackage;

import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhdz extends fheh {
    private static final long serialVersionUID = 5049421499261722194L;
    private fgvd d;

    public fhdz() {
        super("TRIGGER", fgyu.a);
    }

    @Override // defpackage.fhck, defpackage.fguw
    public final String a() {
        fgvd fgvdVar = this.d;
        return fgvdVar != null ? fgvdVar.toString() : super.a();
    }

    @Override // defpackage.fhck, defpackage.fgwo
    public final void c(String str) {
        try {
            super.c(str);
            this.d = null;
        } catch (ParseException unused) {
            this.d = new fgvd(str);
            d(null);
        }
    }
}
