package defpackage;

import j$.time.Duration;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avjy {
    public static final cfup a = cfvl.i(cfvl.b, "enable_bot_id_logging_with_block_reports", false);
    public static final cfup b = cfvl.i(cfvl.b, "enable_draft_toolstone", false);
    public static final cfup c = cfvl.e(cfvl.b, "rbm_toolstone_reappearance_strategy", 1);
    public static final cfup d = cfvl.e(cfvl.b, "rbm_toolstone_reappearance_unresponded_time_passed_days", 10);
    public static final cfup e = cfvl.e(cfvl.b, "rbm_toolstone_reappearance_unresponded_message_count", 10);
    public static final cfup f = cfvl.i(cfvl.b, "rbm_toolstone_visible_by_default", false);
    public static final cfup g = cfvl.e(cfvl.b, "rbm_toolstone_first_appearance_strategy", 1);
    public static final cfup h = cfvl.e(cfvl.b, "rbm_toolstone_first_appearance_unresponded_time_passed_days", 10);
    public static final cfup i = cfvl.h(cfvl.b, "rbm_toolstone_allowlisted_bot_ids", "google@rbm.goog");
    public static final cfup j = cfvl.e(cfvl.b, "rbm_toolstone_first_appearance_unresponded_message_count", 10);
    public static final cfup k = cfvl.i(cfvl.b, "enable_blocking_on_toolstone_calculation", false);
    public static final cfup l = cfvl.h(cfvl.b, "rbm_toolstone_enabled_domains", "rbm.goog");
    public static final cfva m;

    static {
        ecwh ecwhVar = cfvl.b;
        ezgv ezgvVar = (ezgv) ezgw.a.createBuilder();
        ezgvVar.getClass();
        DesugarCollections.unmodifiableList(((ezgw) ezgvVar.instance).b).getClass();
        ezgvVar.b("OTP");
        eyfy build = ezgvVar.build();
        build.getClass();
        m = cfvl.u(ecwhVar, "hide_rbm_toolstone_categories", (ezgw) build, new ecwg() { // from class: avjx
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (ezgw) eyfy.parseFrom(ezgw.a, bArr);
            }
        });
        cfvl.i(cfvl.b, "catch_null_bot_id_and_raw_destination", false);
    }

    public static final List a() {
        eygr eygrVar = ((ezgw) m.e()).b;
        eygrVar.getClass();
        return eygrVar;
    }

    public static final List b() {
        Object e2 = i.e();
        e2.getClass();
        return f((String) e2);
    }

    public static final List c() {
        Object e2 = l.e();
        e2.getClass();
        return f((String) e2);
    }

    public static final long d(int i2) {
        (i2 == 3 ? (Integer) h.e() : (Integer) d.e()).getClass();
        return Duration.ofDays(Math.max(0, Math.min(90, r2.intValue()))).toMillis();
    }

    public static final int e(int i2) {
        Integer num = i2 == 3 ? (Integer) j.e() : (Integer) e.e();
        num.getClass();
        return Math.max(0, Math.min(30, num.intValue()));
    }

    private static final List f(String str) {
        if (str.length() == 0) {
            return ffel.a;
        }
        List V = ffpc.V(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(ffdx.n(V, 10));
        Iterator it = V.iterator();
        while (it.hasNext()) {
            arrayList.add(ffpc.x((String) it.next()).toString());
        }
        return arrayList;
    }
}
