package defpackage;

import j$.util.Optional;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dizc {
    public static final Optional c = Optional.empty();
    private final String a;
    public final ecwh d;

    protected dizc(String str) {
        this.a = str;
        this.d = new ecwh(ecvd.a("com.google.android.ims.library")).d(str).c().a();
    }

    public static void m() {
        diyr.c();
        dizg.u();
        dizi.c();
        dizk.c();
        dizm.c();
        dizq.d();
        dizs.c();
        dizu.c();
        dizw.c();
        dizy.c();
        djaa.a();
        djac.c();
        djae.d();
        djag.c();
        djai.y();
        djak.d();
        djao.s();
        djaq.c();
        djas.d();
        djam.c();
        dizd.d();
        dizo.c();
    }

    protected abstract engw b();

    protected final diza e(String str, double d) {
        return new diza(this.d.e(str, d));
    }

    protected final diza f(String str, int i) {
        return new diza(this.d.f(str, i));
    }

    protected final diza g(String str, long j) {
        return new diza(this.d.g(str, j));
    }

    protected final diza h(String str, String str2) {
        return new diza(this.d.h(str, str2));
    }

    public final diza i(String str, boolean z) {
        return new diza(this.d.i(str, z));
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        engw b = b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            diyy diyyVar = (diyy) b.get(i);
            sb.append(System.lineSeparator());
            sb.append(diyyVar.b());
            sb.append("=");
            sb.append(diyyVar.a());
        }
        return sb.toString();
    }

    public final void k(PrintWriter printWriter) {
        engw b = b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            printWriter.println((diyy) b.get(i));
        }
    }

    protected final void l() {
        if (dkty.v()) {
            StringBuilder sb = new StringBuilder("<<< ");
            sb.append(this.a);
            sb.append("com.google.android.ims.library >>>");
            engw b = b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                diyy diyyVar = (diyy) b.get(i);
                sb.append(System.lineSeparator());
                sb.append(diyyVar);
            }
            dkty.c("%s", sb.toString());
        }
    }
}
