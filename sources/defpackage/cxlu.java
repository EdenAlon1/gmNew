package defpackage;

import androidx.preference.SwitchPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxlu {
    public final cxls a;
    public final cvbr b;
    public final ejwl c;
    public final ejlq d;
    public SwitchPreferenceCompat e;
    public final ejlr f = new ejlr<Boolean, Void>() { // from class: cxlu.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            SwitchPreferenceCompat switchPreferenceCompat = cxlu.this.e;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.k(((Boolean) obj).booleanValue());
            cxlu.this.e.G(true);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            SwitchPreferenceCompat switchPreferenceCompat = cxlu.this.e;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.k(!((Boolean) obj).booleanValue());
            cxlu.this.e.G(true);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejwd g = new ejwd<Boolean>() { // from class: cxlu.2
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            SwitchPreferenceCompat switchPreferenceCompat = cxlu.this.e;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.G(true);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            SwitchPreferenceCompat switchPreferenceCompat = cxlu.this.e;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.G(true);
            cxlu.this.e.k(((Boolean) obj).booleanValue());
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    };

    public cxlu(cxls cxlsVar, ejwl ejwlVar, ejlq ejlqVar, cvbr cvbrVar) {
        this.a = cxlsVar;
        this.b = cvbrVar;
        this.c = ejwlVar;
        this.d = ejlqVar;
    }
}
