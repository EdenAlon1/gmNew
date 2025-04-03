package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crta implements fgug {
    public final fguu a;
    public final fgwp b;
    public final fgvj c;
    final /* synthetic */ crtb d;

    public crta(crtb crtbVar, fguu fguuVar, fgwp fgwpVar, fgvj fgvjVar) {
        this.d = crtbVar;
        this.a = fguuVar;
        this.b = fgwpVar;
        this.c = fgvjVar;
    }

    private static final String b(fhbc fhbcVar, String str) {
        try {
            int i = fheq.b;
            return fhep.a.b(fhbcVar).decode(str);
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // defpackage.fgug
    public final void a(String str) {
        crtb.a(this.d.i);
        fgwo fgwoVar = this.d.i;
        fgwoVar.getClass();
        if (fgwoVar instanceof fgve) {
            if (fgwoVar.b(VCardConstants.PARAM_ENCODING) == null) {
                this.d.i.c(fhev.d(str));
                return;
            } else {
                this.d.i.c(b((fhbc) this.d.i.b(VCardConstants.PARAM_ENCODING), fhev.d(str)));
                return;
            }
        }
        if (fgwoVar.b(VCardConstants.PARAM_ENCODING) == null) {
            this.d.i.c(str);
        } else {
            this.d.i.c(b((fhbc) this.d.i.b(VCardConstants.PARAM_ENCODING), str));
        }
    }
}
