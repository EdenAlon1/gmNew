package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azrn {
    public static final String[] a = {"my_identities.token", "my_identities.canonical_token", "my_identities.provisioning_id", "my_identities.is_verified", "my_identities.address_type", "my_identities.phone_number", "my_identities.display_name", "group_concat(quote(subscriptions.sub_id), '|')", "group_concat(quote(subscriptions.sim_serial_number), '|')", "group_concat(quote(subscriptions.rowid), '|') AS subscriptions__ROWID"};

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("my_identities.canonical_token", 60530);
        enhdVar.k("my_identities.provisioning_id", 59990);
        enhdVar.k("my_identities.is_verified", 60320);
        enhdVar.k("my_identities.address_type", 59980);
        enhdVar.k("my_identities.display_name", 60120);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("canonical_token", "index_null_canonical_token");
        enhdVar2.c();
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "my_identities.token";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: azqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: azqi
        };
        m.a();
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: azqs
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar2.a = "my_identities.canonical_token";
        m2.i(60530);
        dtqsVar2.d = new Supplier() { // from class: azqt
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: azqu
        };
        m2.a();
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "my_identities.provisioning_id";
        m3.i(59990);
        dtqsVar3.d = new Supplier() { // from class: azqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: azqw
        };
        m3.a();
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        m4.k(true);
        dtqsVar4.a = "my_identities.is_verified";
        m4.i(60320);
        dtqsVar4.d = new Supplier() { // from class: azqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: azqy
        };
        m4.a();
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "my_identities.address_type";
        m5.i(59980);
        dtqsVar5.d = new Supplier() { // from class: azqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: azqr
        };
        m5.a();
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "my_identities.phone_number";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: azra
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: azrb
        };
        m6.a();
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "my_identities.display_name";
        m7.i(60120);
        dtqsVar7.d = new Supplier() { // from class: azrc
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: azrd
        };
        m7.a();
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 1;
        m8.l(true);
        m8.g(true);
        m8.d(true);
        dtqsVar8.a = "subscriptions.sub_id";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: azre
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: azrf
        };
        m8.a();
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        m9.l(true);
        m9.g(true);
        m9.d(true);
        dtqsVar9.a = "subscriptions.sim_serial_number";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: azrg
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: azrh
        };
        m9.a();
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 8;
        dtqsVar10.a = "subscriptions__ROWID";
        m10.i(0);
        dtqsVar10.d = new Supplier() { // from class: azqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: azqj
        };
        m10.a();
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 4;
        dtqsVar11.a = "subscriptions.telephony_phone_number";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: azqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: azql
        };
        m11.a();
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 4;
        m12.d(true);
        dtqsVar12.a = "subscriptions.my_identity_token";
        m12.i(59450);
        dtqsVar12.d = new Supplier() { // from class: azqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: azqn
        };
        m12.a();
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 4;
        m13.d(true);
        m13.e(true);
        dtqsVar13.b = new Supplier() { // from class: azqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar13.a = "subscriptions.my_identity_token_with_foreign_key";
        m13.i(60160);
        dtqsVar13.d = new Supplier() { // from class: azqp
            @Override // java.util.function.Supplier
            public final Object get() {
                return azrn.b();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: azqq
        };
        m13.a();
    }

    public static final azrk a(String str) {
        String[] strArr;
        Integer c = c();
        if (c.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("my_identities.token");
            if (c.intValue() >= 60530) {
                engrVar.h("my_identities.canonical_token");
            }
            if (c.intValue() >= 59990) {
                engrVar.h("my_identities.provisioning_id");
            }
            if (c.intValue() >= 60320) {
                engrVar.h("my_identities.is_verified");
            }
            if (c.intValue() >= 59980) {
                engrVar.h("my_identities.address_type");
            }
            engrVar.h("my_identities.phone_number");
            if (c.intValue() >= 60120) {
                engrVar.h("my_identities.display_name");
            }
            engrVar.h("group_concat(quote(subscriptions.sub_id), '|')");
            engrVar.h("group_concat(quote(subscriptions.sim_serial_number), '|')");
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        azrk azrkVar = new azrk(strArr);
        azrkVar.z(str);
        return azrkVar;
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}
