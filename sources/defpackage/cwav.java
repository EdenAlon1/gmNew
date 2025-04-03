package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwav {
    public static final enru a = enru.c("com/google/android/apps/messaging/startchat/logger/StartChatEventLogger");
    public final twk b;
    public final aleq c;
    public final ffbr d;
    public aler e;
    public final int f;
    private final ffbr g;
    private final auvt h;
    private final ffsk i;

    public cwav(twk twkVar, aleq aleqVar, llv llvVar, ffbr ffbrVar, ffbr ffbrVar2, auvt auvtVar, ffsk ffskVar) {
        twkVar.getClass();
        aleqVar.getClass();
        llvVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        this.b = twkVar;
        this.c = aleqVar;
        this.g = ffbrVar;
        this.d = ffbrVar2;
        this.h = auvtVar;
        this.i = ffskVar;
        Bundle bundle = (Bundle) llvVar.b("startchat_logger_bundle");
        Integer num = (Integer) llvVar.b("contact_picker_source");
        int a2 = bundle != null ? epui.a(bundle.getInt("contact_picker_source")) : num != null ? epui.a(num.intValue()) : 0;
        this.f = a2 == 0 ? 1 : a2;
    }

    public final void a() {
        twk.e(this.b, 10, 0, this.f, 10);
    }

    public final void b() {
        twk.e(this.b, 13, 0, this.f, 10);
    }

    public final void c(boolean z) {
        if (!z) {
            ((ecrj) this.g.b()).g(csra.k, null, null, ecrh.CANCEL);
            return;
        }
        this.b.d(10, this.f);
        ((ecrj) this.g.b()).g(csra.k, null, null, ecrh.SUCCESS);
        ((ecrj) this.g.b()).e(csra.l);
    }

    public final void d(String str, String str2) {
        str2.getClass();
        twk.e(this.b, 8, 0, this.f, 10);
        f(false);
        if (((ersq) ((auvg) this.h).a.b()).a("bugle.enable_log_anonymized_input_format")) {
            axol.l(this.i, new cwau(this, str, str2, null));
        }
    }

    public final void e() {
        aler alerVar = this.e;
        if (alerVar != null) {
            alerVar.a();
        }
    }

    public final void f(boolean z) {
        ecrh ecrhVar = z ? ecrh.SUCCESS : ecrh.CANCEL;
        ((ecrj) this.g.b()).g(csra.j, null, null, ecrhVar);
        ((ecrj) this.g.b()).g(csra.l, null, null, ecrhVar);
    }
}
