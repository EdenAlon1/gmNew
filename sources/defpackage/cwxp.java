package defpackage;

import androidx.preference.SwitchPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwxp {
    public final cwxm a;
    public final ffbr b;
    public final ffbr c;
    public SwitchPreferenceCompat d;
    public SwitchPreferenceCompat e;
    public final ejlr f;
    public final ejlr g;

    public cwxp(cwxm cwxmVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar2.getClass();
        this.a = cwxmVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.f = new ejlr<Boolean, Void>() { // from class: cwxp.2
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = cwxp.this.d;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(false);
                }
                SwitchPreferenceCompat switchPreferenceCompat2 = cwxp.this.d;
                if (switchPreferenceCompat2 != null) {
                    switchPreferenceCompat2.k(booleanValue);
                }
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = cwxp.this.d;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                }
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = cwxp.this.d;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                }
                SwitchPreferenceCompat switchPreferenceCompat2 = cwxp.this.d;
                if (switchPreferenceCompat2 != null) {
                    switchPreferenceCompat2.k(!booleanValue);
                }
            }
        };
        this.g = new ejlr<Boolean, Void>() { // from class: cwxp.1
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = cwxp.this.e;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(false);
                }
                SwitchPreferenceCompat switchPreferenceCompat2 = cwxp.this.e;
                if (switchPreferenceCompat2 != null) {
                    switchPreferenceCompat2.k(booleanValue);
                }
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = cwxp.this.e;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                }
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = cwxp.this.e;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                }
                SwitchPreferenceCompat switchPreferenceCompat2 = cwxp.this.e;
                if (switchPreferenceCompat2 != null) {
                    switchPreferenceCompat2.k(!booleanValue);
                }
            }
        };
    }
}
