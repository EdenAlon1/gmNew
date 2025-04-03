package defpackage;

import com.google.android.libraries.geller.portable.Geller;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dugp implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ eyny b;
    final /* synthetic */ Geller c;

    public dugp(Geller geller, String str, eyny eynyVar) {
        this.a = str;
        this.b = eynyVar;
        this.c = geller;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Long) obj).longValue() > 0) {
            Geller geller = this.c;
            geller.d.onDeletion(this.a, this.b.toByteArray());
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((enrr) ((enrr) ((enrr) Geller.a.i()).g(th)).h("com/google/android/libraries/geller/portable/Geller$3", "onFailure", (char) 1649, "Geller.java")).q("Unexpected failure invoking storageOperationsCallback.");
    }
}
