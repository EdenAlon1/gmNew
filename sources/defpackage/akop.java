package defpackage;

import android.content.Intent;
import androidx.preference.SwitchPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akop {
    public final akon a;
    public final ejwl b;
    public final ejlq c;
    public final elhk d;
    public final akom e;
    public final ffbr f;
    public final ffbr g;
    public SwitchPreferenceCompat h;
    public final b i = new b();
    public final a j = new a();

    public akop(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.a = (akon) ffbrVar.b();
        this.b = (ejwl) ffbrVar2.b();
        this.c = (ejlq) ffbrVar3.b();
        this.d = (elhk) ffbrVar4.b();
        this.e = (akom) ffbrVar5.b();
        this.f = ffbrVar6;
        this.g = ffbrVar7;
    }

    /* compiled from: PG */
    final class a implements ejwd<akoh> {
        public a() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            SwitchPreferenceCompat switchPreferenceCompat = akop.this.h;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.G(true);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            akop.this.h.k(((akoh) obj).c);
            akop.this.h.G(true);
            akop.this.h.N(true);
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    }

    /* compiled from: PG */
    final class b implements ejlr<Boolean, Void> {
        public b() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Intent intent = new Intent("com.google.android.apps.messaging.samsung.settings.CMC_CONSENT_TOGGLED");
            intent.putExtra("EXTRA_CMC_CONSENT_VALUE", bool.booleanValue());
            ((akne) akop.this.g.b()).b(intent);
            ((akzt) akop.this.f.b()).e("Bugle.AndromedaSettings.CmcConsentToggles.Count", true != bool.booleanValue() ? 2 : 1);
            akop.this.h.G(true);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ((akzt) akop.this.f.b()).e("Bugle.AndromedaSettings.CmcConsentToggles.Count", 3);
            akop.this.h.G(true);
            akop.this.h.k(!((Boolean) obj).booleanValue());
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
