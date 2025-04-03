package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.time.Instant;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkrx {
    public final dkrw a;
    private final Context b;

    public dkrx(Context context) {
        this.a = new dkrw(context, "com.google.android.rcs");
        this.b = context;
    }

    public final synchronized int a() {
        int intValue;
        dkrw dkrwVar = this.a;
        synchronized (dkrwVar) {
            dkrwVar.d();
            Integer num = (Integer) dkrwVar.d.get("provisioning_sms_port_override");
            intValue = num != null ? num.intValue() : 0;
        }
        return intValue;
    }

    public final synchronized long b() {
        long a;
        a = this.a.a("requestid", 1L);
        this.a.h("requestid", 1 + a);
        return a;
    }

    public final synchronized long c() {
        long a;
        a = this.a.a("sessionid", 1L);
        if (a == 1) {
            dkty.c("Session ID is 1 !! This should only be the case after clearing the data or installing for the first time!", new Object[0]);
            a = 1;
        }
        if (a < 1500000000) {
            dkty.c("Seeding session ID to current timestamp", new Object[0]);
            a = Instant.now().getEpochSecond();
        }
        this.a.h("sessionid", 1 + a);
        return a;
    }

    public final synchronized String d(String str, int i) {
        String a;
        dkrw dkrwVar = this.a;
        a = dkvb.a(this.b, str, i);
        dkrwVar.j("clientid", a);
        return a;
    }

    public final synchronized String e() {
        return this.a.c("capabilities_pidf_etag", null);
    }

    public final synchronized String f() {
        return this.a.c("clientid", null);
    }

    public final synchronized String g() {
        return emxe.a(this.a.c("default_country", null));
    }

    public final synchronized String h() {
        return emxe.a(this.a.c("msisdn", null));
    }

    public final synchronized String i() {
        return this.a.c("provisioning_acs_url_override", null);
    }

    public final synchronized String j() {
        return this.a.c("sim_serial_number", null);
    }

    public final synchronized void k(long j) {
        long a = this.a.a("sessionid", 1L);
        long j2 = j + a;
        dkty.c("****** DEBUG ****** Bumping session ID from %s to %s", Long.valueOf(a), Long.valueOf(j2));
        this.a.h("sessionid", j2);
    }

    public final void l(String str, PrintWriter printWriter) {
        Object obj;
        printWriter.print(' ');
        printWriter.print(str);
        printWriter.print(": ");
        dkrw dkrwVar = this.a;
        synchronized (dkrwVar) {
            dkrwVar.d();
            obj = dkrwVar.d.get(str);
        }
        printWriter.println(obj);
    }

    public final synchronized void m() {
        this.a.f("capabilities_pidf_etag");
    }

    public final synchronized void n(String str) {
        this.a.j("capabilities_pidf_etag", str);
    }

    public final void o(String str) {
        this.a.j("default_country", emxe.b(str));
    }

    public final synchronized void p(boolean z) {
        this.a.g("send_error_result_from_engine", z);
    }

    public final void q(boolean z) {
        this.a.g("first_time_discovery_finished", z);
    }

    public final synchronized void r(String str) {
        dkrw dkrwVar = this.a;
        String b = emxe.b(str);
        dkrwVar.j("msisdn", b);
        dkty.c("Setting username for Analytics to: %s", dktx.PHONE_NUMBER.c(b));
    }

    public final synchronized boolean s() {
        return this.a.l("send_error_result_from_engine");
    }

    public final synchronized boolean t() {
        String h = h();
        if (TextUtils.isEmpty(h)) {
            return false;
        }
        return h.startsWith("+1100");
    }

    public final synchronized boolean u() {
        return this.a.k("provisioning_acs_url_override");
    }

    public final synchronized boolean v() {
        return this.a.k("provisioning_sms_port_override");
    }

    public final synchronized boolean w() {
        return this.a.l("first_time_discovery_finished");
    }

    public final synchronized boolean x() {
        long a = this.a.a("sessionid", 0L);
        return a < 1 || a < 1500000000;
    }

    public final synchronized void y() {
        this.a.h("provisioning_last_attempt", 0L);
    }
}
