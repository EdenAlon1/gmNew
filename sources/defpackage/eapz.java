package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eapz implements eapq {
    public final otb a;
    public final ort b = new eapx();
    public final orr c = new eapy();

    public eapz(otb otbVar) {
        this.a = otbVar;
    }

    @Override // defpackage.eapq
    public final List a() {
        return (List) ovw.b(this.a, true, false, new ffji() { // from class: eapr
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ovi a = ((ouz) obj).a("SELECT * FROM gnp_accounts");
                try {
                    int b = owc.b(a, "id");
                    int b2 = owc.b(a, "account_specific_id");
                    int b3 = owc.b(a, "account_type");
                    int b4 = owc.b(a, "obfuscated_gaia_id");
                    int b5 = owc.b(a, "actual_account_name");
                    int b6 = owc.b(a, "actual_account_oid");
                    int b7 = owc.b(a, "registration_status");
                    int b8 = owc.b(a, "registration_id");
                    int b9 = owc.b(a, "sync_sources");
                    int b10 = owc.b(a, "representative_target_id");
                    int b11 = owc.b(a, "sync_version");
                    int b12 = owc.b(a, "last_registration_time_ms");
                    int b13 = owc.b(a, "last_registration_request_hash");
                    int b14 = owc.b(a, "first_registration_version");
                    int b15 = owc.b(a, "internal_target_id");
                    int b16 = owc.b(a, "fitbit_decoded_id");
                    ArrayList arrayList = new ArrayList();
                    while (a.j()) {
                        long b17 = a.b(b);
                        String d = a.i(b2) ? null : a.d(b2);
                        int i = b14;
                        ArrayList arrayList2 = arrayList;
                        int c = eaoj.c((int) a.b(b3));
                        String d2 = a.i(b4) ? null : a.d(b4);
                        String d3 = a.i(b5) ? null : a.d(b5);
                        String d4 = a.i(b6) ? null : a.d(b6);
                        int b18 = (int) a.b(b7);
                        String d5 = a.i(b8) ? null : a.d(b8);
                        enip a2 = eaoj.a(a.i(b9) ? null : a.d(b9));
                        String d6 = a.i(b10) ? null : a.d(b10);
                        long b19 = a.b(b11);
                        long b20 = a.b(b12);
                        int i2 = b2;
                        int i3 = b3;
                        int b21 = (int) a.b(b13);
                        long b22 = a.b(i);
                        int i4 = b;
                        int i5 = b15;
                        String d7 = a.i(i5) ? null : a.d(i5);
                        b15 = i5;
                        int i6 = b16;
                        arrayList2.add(eagt.u(b17, d, c, d2, d3, d4, b18, d5, a2, d6, b19, b20, b21, b22, d7, a.b(i6)));
                        b16 = i6;
                        b2 = i2;
                        b = i4;
                        arrayList = arrayList2;
                        b14 = i;
                        b3 = i3;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    @Override // defpackage.eapq
    public final void b(final List list) {
        ((Integer) ovw.b(this.a, false, true, new ffji() { // from class: eapu
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Integer.valueOf(eapz.this.c.c((ouz) obj, list));
            }
        })).intValue();
    }

    @Override // defpackage.eapq
    public final eagt c(final int i, final String str) {
        return (eagt) ovw.b(this.a, true, false, new ffji() { // from class: eapv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ovi a = ((ouz) obj).a("SELECT * FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
                int i2 = i;
                String str2 = str;
                try {
                    a.e(1, i2);
                    a.g(2, str2);
                    int b = owc.b(a, "id");
                    int b2 = owc.b(a, "account_specific_id");
                    int b3 = owc.b(a, "account_type");
                    int b4 = owc.b(a, "obfuscated_gaia_id");
                    int b5 = owc.b(a, "actual_account_name");
                    int b6 = owc.b(a, "actual_account_oid");
                    int b7 = owc.b(a, "registration_status");
                    int b8 = owc.b(a, "registration_id");
                    int b9 = owc.b(a, "sync_sources");
                    int b10 = owc.b(a, "representative_target_id");
                    int b11 = owc.b(a, "sync_version");
                    int b12 = owc.b(a, "last_registration_time_ms");
                    int b13 = owc.b(a, "last_registration_request_hash");
                    int b14 = owc.b(a, "first_registration_version");
                    int b15 = owc.b(a, "internal_target_id");
                    int b16 = owc.b(a, "fitbit_decoded_id");
                    if (a.j()) {
                        r17 = eagt.u(a.b(b), a.i(b2) ? null : a.d(b2), eaoj.c((int) a.b(b3)), a.i(b4) ? null : a.d(b4), a.i(b5) ? null : a.d(b5), a.i(b6) ? null : a.d(b6), (int) a.b(b7), a.i(b8) ? null : a.d(b8), eaoj.a(a.i(b9) ? null : a.d(b9)), a.i(b10) ? null : a.d(b10), a.b(b11), a.b(b12), (int) a.b(b13), a.b(b14), a.i(b15) ? null : a.d(b15), a.b(b16));
                    }
                    return r17;
                } finally {
                    a.close();
                }
            }
        });
    }
}
