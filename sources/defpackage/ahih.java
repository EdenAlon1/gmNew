package defpackage;

import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahih {
    public static final cskc a = cskc.g("BugleSuperSort", "SuperSortSettingsFragmentPeer");
    public final ahic b;
    public final elhk c;
    public final ejwl d;
    public final ejlq e;
    public final tbn f;
    public final ahhq g;
    public final ahhd h;
    public final crlv i;
    public SwitchPreferenceCompat j;
    public SwitchPreferenceCompat k;
    public Preference l;
    public c m;
    public a n;
    public b o;

    public ahih(ahic ahicVar, elhk elhkVar, ejwl ejwlVar, ejlq ejlqVar, tbn tbnVar, ahhq ahhqVar, ahhd ahhdVar) {
        final cfup cfupVar = aitk.a;
        cfupVar.getClass();
        this.i = new crlv("enableOtpAutoDeleteFlag", new ffix() { // from class: ahig
            @Override // defpackage.ffix
            public final Object invoke() {
                return (Boolean) cfup.this.e();
            }
        });
        this.b = ahicVar;
        this.c = elhkVar;
        this.d = ejwlVar;
        this.e = ejlqVar;
        this.f = tbnVar;
        this.g = ahhqVar;
        this.h = ahhdVar;
    }

    /* compiled from: PG */
    final class c implements ejwd<ahhz> {
        private final SwitchPreferenceCompat a;
        private final SwitchPreferenceCompat b;
        private final Preference c;
        private final boolean d;

        public c(SwitchPreferenceCompat switchPreferenceCompat, SwitchPreferenceCompat switchPreferenceCompat2, Preference preference, boolean z) {
            this.a = switchPreferenceCompat;
            this.b = switchPreferenceCompat2;
            this.c = preference;
            this.d = z;
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            csjb e = ahih.a.e();
            e.v("Error fetching super sort settings data");
            e.s(th);
            this.b.G(false);
            this.b.N(true);
            if (this.d) {
                this.a.G(false);
                this.a.N(true);
            } else {
                this.a.N(false);
            }
            this.c.G(false);
            this.c.N(true);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            ahhz ahhzVar = (ahhz) obj;
            csjb d = ahih.a.d();
            d.v("Fetching super sort");
            d.B("Super sort enabled", ahhzVar.b());
            d.B("Otp auto-delete enabled", ahhzVar.a());
            d.r();
            this.b.k(ahhzVar.b());
            this.b.G(true);
            this.b.N(true);
            if (this.d) {
                this.a.k(ahhzVar.a());
                this.a.N(true);
                this.a.G(ahhzVar.b());
            } else {
                this.a.N(false);
            }
            this.c.G(ahhzVar.b());
            this.c.N(true);
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    }

    /* compiled from: PG */
    final class a implements ejlr<Boolean, Void> {
        private final SwitchPreferenceCompat a;

        public a(SwitchPreferenceCompat switchPreferenceCompat) {
            this.a = switchPreferenceCompat;
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            csjb e = ahih.a.e();
            e.v("Error enabling otp auto-delete");
            e.s(th);
            this.a.k(!((Boolean) obj).booleanValue());
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class b implements ejlr<Boolean, Void> {
        private final SwitchPreferenceCompat a;
        private final SwitchPreferenceCompat b;
        private final Preference c;

        public b(SwitchPreferenceCompat switchPreferenceCompat, SwitchPreferenceCompat switchPreferenceCompat2, Preference preference) {
            this.a = switchPreferenceCompat;
            this.b = switchPreferenceCompat2;
            this.c = preference;
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            this.a.G(bool.booleanValue());
            this.c.G(bool.booleanValue());
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            Boolean bool = (Boolean) obj;
            csjb e = ahih.a.e();
            e.v("Error enabling super sort");
            e.s(th);
            this.b.k(!bool.booleanValue());
            this.a.G(!bool.booleanValue());
            this.c.G(!bool.booleanValue());
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
