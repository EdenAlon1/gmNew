package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyml extends cymm {
    public static final emyl a = cfvl.w("no_connection_bottom_bar_enable_ui");
    public final ffbr b;
    public final ffbr c;
    public final cymi d;
    public final b e = new b();

    /* compiled from: PG */
    public final class a implements ellf {
    }

    public cyml(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = ffbrVar;
        cymj cymjVar = (cymj) ffbrVar2.b();
        lkv lkvVar = ((cymk) ffbrVar.b()).a;
        ejvb ejvbVar = (ejvb) cymjVar.a.b();
        ejvbVar.getClass();
        errl errlVar = (errl) cymjVar.b.b();
        errlVar.getClass();
        csjk csjkVar = (csjk) cymjVar.c.b();
        csjkVar.getClass();
        ejvp ejvpVar = (ejvp) cymjVar.d.b();
        ejvpVar.getClass();
        badt badtVar = (badt) cymjVar.e.b();
        badtVar.getClass();
        lkvVar.getClass();
        this.d = new cymi(ejvbVar, errlVar, csjkVar, ejvpVar, badtVar, lkvVar);
        this.c = ffbrVar3;
    }

    public static View a(cymk cymkVar) {
        return cymkVar.N().findViewById(R.id.bottom_bar_container);
    }

    /* compiled from: PG */
    final class b implements ejwd<cymh> {
        public b() {
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            View a = cyml.a((cymk) cyml.this.b.b());
            boolean a2 = ((cymh) obj).a();
            if (((Boolean) ((cfup) cyml.a.get()).e()).booleanValue() && a2) {
                a.setVisibility(0);
            } else {
                a.setVisibility(8);
            }
            ellj.g(new a(), a);
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
        }
    }
}
