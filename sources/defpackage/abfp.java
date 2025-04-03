package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfp {
    public static final void a(final abfn abfnVar, hfd hfdVar, final int i) {
        int i2;
        ffix ffixVar;
        dnlg dnlgVar;
        String a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1384654243);
        if (i3 == 0) {
            i2 = (true != b.D(abfnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hvi f = eba.f(hvi.e, 8.0f, 24.0f, 8.0f, 16.0f);
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, b, 0);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, f);
            int i5 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ffix ffixVar3 = abfnVar.a;
            b.v(44613329);
            if (ffixVar3 != null) {
                dnly.a(new dnlz(jii.a(R.string.message_actions_turn_on_data_setting, b), null, null, null, null, new dnlf(dmzz.ds), null, ffixVar3, 94), null, b, 0, 2);
            }
            hfmVar.Z();
            b.v(44624961);
            if (abfnVar.k && (ffixVar = abfnVar.b) != null) {
                boolean z = abfnVar.g;
                ffix ffixVar4 = (z || abfnVar.h) ? null : ffixVar;
                if (z || abfnVar.h) {
                    dnlgVar = dnle.a;
                } else {
                    dnlgVar = new dnlf(abfnVar.f ? dmzz.dn : dmzz.dm);
                }
                dnlg dnlgVar2 = dnlgVar;
                if (abfnVar.e) {
                    b.v(647887067);
                    if (abfnVar.g) {
                        b.v(647905574);
                        a = jii.a(R.string.message_actions_still_sending_as_rcs, b);
                        hfmVar.Z();
                    } else if (abfnVar.h) {
                        b.v(648042873);
                        String str = abfnVar.i;
                        if (str != null) {
                            a = jii.b(R.string.message_actions_delivers_when_recipient_online, new Object[]{str}, b);
                            hfmVar.Z();
                        } else {
                            hfmVar.Z();
                            hfmVar.Z();
                        }
                    } else {
                        b.v(648532301);
                        a = jii.a(R.string.message_actions_resend_as_rcs, b);
                        hfmVar.Z();
                    }
                    hfmVar.Z();
                } else {
                    b.v(648656084);
                    if (abfnVar.g) {
                        b.v(648691021);
                        a = jii.a(R.string.message_actions_still_sending, b);
                        hfmVar.Z();
                    } else {
                        b.v(648791988);
                        a = jii.a(R.string.message_actions_resend, b);
                        hfmVar.Z();
                    }
                    hfmVar.Z();
                }
                dnly.a(new dnlz(a, null, null, null, null, dnlgVar2, null, ffixVar4, 94), null, b, 0, 2);
            }
            hfmVar.Z();
            ffix ffixVar5 = abfnVar.c;
            b.v(44679394);
            if (ffixVar5 != null) {
                dnly.a(new dnlz(jii.a(true != abfnVar.j ? R.string.message_actions_resend_as_fallback_no_connection : R.string.message_actions_resend_as_fallback, b), null, null, null, null, new dnlf(dmzz.dm, "SMS"), null, true != abfnVar.j ? null : ffixVar5, 94), null, b, 0, 2);
            }
            hfmVar.Z();
            ffix ffixVar6 = abfnVar.d;
            b.v(44697693);
            if (ffixVar6 != null) {
                dnly.a(new dnlz(jii.a(true != abfnVar.g ? R.string.message_actions_delete : R.string.message_actions_stop_sending_and_delete, b), null, null, null, null, new dnlf(dmzz.aD), null, ffixVar6, 94), null, b, 0, 2);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abfo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    abfp.a(abfn.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
