package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alaf implements albq, cskz, cskg {
    public static final cskc a = cskc.g("BugleUsageStatistics", "TimerEventLoggerImpl");
    public static final cfva b = cfvl.c(cfvl.b, "action_breakdown_timer_percent", eobe.a);
    public final ffbr d;
    public final cqoh e;
    public final errl f;
    private final ffbr g;
    private final emyl h;
    private final ffbr i;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    private boolean j = false;

    public alaf(ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, emyl emylVar, ffbr ffbrVar3, errl errlVar) {
        this.g = ffbrVar;
        this.d = ffbrVar2;
        this.e = cqohVar;
        this.h = emylVar;
        this.i = ffbrVar3;
        this.f = errlVar;
    }

    private final akzw q(String str, akzw akzwVar) {
        if (!this.j) {
            a.m("Clearcut loggings are disabled.");
            return alaq.a;
        }
        akzw akzwVar2 = (akzw) this.c.get(str);
        if (akzwVar2 != null) {
            return akzwVar2;
        }
        akzw akzwVar3 = (akzw) this.c.putIfAbsent(str, akzwVar);
        return akzwVar3 != null ? akzwVar3 : akzwVar;
    }

    private static String r(String str, String str2) {
        csix.f(TextUtils.isEmpty(str));
        return TextUtils.isEmpty(str2) ? str : String.valueOf(str).concat(String.valueOf(str2));
    }

    @Override // defpackage.albq
    public final akzw a(String str, eogt eogtVar, String str2) {
        if (!cful.a((Random) this.h.get(), b)) {
            return alaq.a;
        }
        String r = r(str, str2);
        return q(r, new alac(this, str, eogtVar, r, this.e.a()));
    }

    @Override // defpackage.albq
    public final akzw b(String str) {
        return d(str, null, this.e.a());
    }

    @Override // defpackage.albq
    public final akzw c(String str, String str2) {
        return d(str, str2, this.e.a());
    }

    @Override // defpackage.albq
    public final akzw d(String str, String str2, long j) {
        String r = r(str, str2);
        return q(r, new alae(this, str, r, j));
    }

    @Override // defpackage.albq
    public final void e(String str) {
        f(str, null);
    }

    @Override // defpackage.albq
    public final void f(String str, String str2) {
        this.c.remove(r(str, str2));
    }

    @Override // defpackage.albq
    public final void g() {
        h(null);
    }

    @Override // defpackage.albq
    public final void h(String str) {
        i(str, this.e.a() - 900000);
    }

    public final void i(String str, long j) {
        for (Map.Entry entry : this.c.entrySet()) {
            if (((akzw) entry.getValue()).a() < j) {
                csjb d = a.d();
                d.M("dropping timer", ((akzw) entry.getValue()).b());
                d.I("(age)");
                d.r();
                this.c.remove(entry.getKey(), entry.getValue());
            } else if (str != null && ((String) entry.getKey()).startsWith(str)) {
                csjb d2 = a.d();
                d2.A("dropping timer", entry.getValue());
                d2.I("(match)");
                d2.r();
                this.c.remove(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // defpackage.albq
    public final void j() {
        this.j = ((csxu) this.g.b()).i("bugle_enable_analytics", true);
    }

    @Override // defpackage.cskz
    public final void k(String str, long j, long j2) {
        ((cfuu) this.i.b()).a();
        double doubleValue = ((Double) cful.u.e()).doubleValue();
        if (this.j && j >= j2 * doubleValue && str != null && str.startsWith("Bugle.")) {
            ((akzt) this.d.b()).g(str, j);
        }
        if (j <= j2) {
            csjb d = a.d();
            d.I(str);
            d.I("asyncTask took");
            d.H(j);
            d.r();
        }
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        if (i == 15) {
            i(null, 0L);
        } else {
            g();
        }
    }

    @Override // defpackage.albq
    public final akzw m(int i, String str) {
        if (!cful.a((Random) this.h.get(), b)) {
            return alaq.a;
        }
        String r = r("Bugle.DataModel.Action.UpdateConversationEncryptionStatusAction.ExecuteAction.DownloadAndProcessRemoteInstanceData.Latency", str);
        return q(r, new alad(this, i, r, this.e.a()));
    }

    @Override // defpackage.albq
    public final void n(String str) {
        akzw akzwVar = (akzw) this.c.get(r(str, null));
        if (akzwVar != null) {
            akzwVar.c();
        }
    }

    @Override // defpackage.albq
    public final elfl o(emyl emylVar) {
        final long a2 = this.e.a();
        return ((elfl) emylVar.get()).i(new eroh() { // from class: akzz
            @Override // defpackage.eroh
            public final ListenableFuture a(final Object obj) {
                final alaf alafVar = alaf.this;
                final long a3 = alafVar.e.a();
                final long j = a2;
                return elfo.f(new Runnable() { // from class: alaa
                    public final /* synthetic */ String b = "Bugle.Cms.IncrementalBackup.ExecutionTime";

                    @Override // java.lang.Runnable
                    public final void run() {
                        ((akzt) alaf.this.d.b()).g(this.b, a3 - j);
                    }
                }, alafVar.f).h(new emwl() { // from class: alab
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cskc cskcVar = alaf.a;
                        return obj;
                    }
                }, erpp.a);
            }
        }, erpp.a);
    }

    @Override // defpackage.albq
    public final void p(String str, String str2) {
        akzw akzwVar = (akzw) this.c.get(r(str, str2));
        if (akzwVar != null) {
            akzwVar.c();
        }
    }
}
