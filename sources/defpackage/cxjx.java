package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxjx {
    public final cxjq a;
    public final ejxn b;
    public final Optional c;
    public final elhk d;
    public final ejxk e;
    public SwitchPreferenceCompat f;

    public cxjx(cxjq cxjqVar, ejxn ejxnVar, Optional optional, elhk elhkVar) {
        ejxnVar.getClass();
        this.a = cxjqVar;
        this.b = ejxnVar;
        this.c = optional;
        this.d = elhkVar;
        this.e = new ejxk() { // from class: cxjr
            @Override // defpackage.ejxk
            public final /* synthetic */ void a(Throwable th) {
                ejxj.a(th);
            }

            @Override // defpackage.ejxk
            public final void b(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = cxjx.this.f;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                    switchPreferenceCompat.N(true);
                    switchPreferenceCompat.k(booleanValue);
                }
            }
        };
    }
}
