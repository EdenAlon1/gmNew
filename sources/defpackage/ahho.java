package defpackage;

import androidx.preference.SwitchPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahho {
    public static final cskc a = cskc.g("BugleMessageOrg", "MessageOrganizationSettingsFragmentPeer");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final crlv g;
    public SwitchPreferenceCompat h;
    public a i;
    public b j;

    public ahho(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        final cfup cfupVar = aitk.a;
        cfupVar.getClass();
        this.g = new crlv("enableOtpAutoDeleteFlag", new ffix() { // from class: ahhn
            @Override // defpackage.ffix
            public final Object invoke() {
                return (Boolean) cfup.this.e();
            }
        });
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
    }

    /* compiled from: PG */
    final class a implements ejwd<ahhz> {
        private final SwitchPreferenceCompat a;
        private final boolean b;

        public a(SwitchPreferenceCompat switchPreferenceCompat, boolean z) {
            this.a = switchPreferenceCompat;
            this.b = z;
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            csjb e = ahho.a.e();
            e.v("Error fetching message organization settings data");
            e.s(th);
            if (!this.b) {
                this.a.N(false);
            } else {
                this.a.G(false);
                this.a.N(true);
            }
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            ahhz ahhzVar = (ahhz) obj;
            csjb d = ahho.a.d();
            d.v("Fetching message organization settings");
            d.B("Otp auto-delete enabled", ahhzVar.a());
            d.r();
            if (!this.b) {
                this.a.N(false);
                return;
            }
            this.a.k(ahhzVar.a());
            this.a.N(true);
            this.a.G(true);
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    }

    /* compiled from: PG */
    final class b implements ejlr<Boolean, Void> {
        private final SwitchPreferenceCompat a;

        public b(SwitchPreferenceCompat switchPreferenceCompat) {
            this.a = switchPreferenceCompat;
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            csjb e = ahho.a.e();
            e.v("Error enabling otp auto-delete");
            e.s(th);
            this.a.k(!((Boolean) obj).booleanValue());
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
