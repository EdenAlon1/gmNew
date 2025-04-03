package defpackage;

import com.android.vcard.VCardConstants;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhdj extends fhcj {
    private static final long serialVersionUID = -3320381650013860193L;
    private fgwn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdj() {
        super("RDATE");
        fgyu fgyuVar = fgyu.a;
        this.d = new fgwn(false, true);
    }

    @Override // defpackage.fhcj, defpackage.fguw
    public final String a() {
        fgwn fgwnVar = this.d;
        return (fgwnVar == null || (fgwnVar.isEmpty() && this.d.c)) ? super.a() : fhev.f(this.d);
    }

    @Override // defpackage.fhcj, defpackage.fgwo
    public final void c(String str) {
        if (fhbs.j.equals(b(VCardConstants.PARAM_VALUE))) {
            this.d = new fgwn(str);
        } else {
            super.c(str);
        }
    }

    @Override // defpackage.fhcj
    public final void d(fgza fgzaVar) {
        fgwn fgwnVar = this.d;
        if (fgwnVar == null || (fgwnVar.isEmpty() && this.d.c)) {
            super.d(fgzaVar);
            return;
        }
        fgwn fgwnVar2 = this.d;
        Iterator it = fgwnVar2.iterator();
        while (it.hasNext()) {
            fgwm fgwmVar = (fgwm) it.next();
            ((fgvb) fgwmVar.a).b(false);
            ((fgvb) fgwmVar.a).a(fgzaVar);
            ((fgvb) fgwmVar.b).b(false);
            ((fgvb) fgwmVar.b).a(fgzaVar);
        }
        fgwnVar2.a = fgzaVar;
        fgwnVar2.b = false;
    }
}
