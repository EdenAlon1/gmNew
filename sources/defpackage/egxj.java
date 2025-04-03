package defpackage;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egxj {
    public static final void a(final ewke ewkeVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        hvi d;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1239336804);
        if (i3 == 0) {
            i2 = (true != b.D(ewkeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else if (ewkeVar == ewke.ENTERPRISE_CONTACT_ADMIN) {
            d = ebs.d(hvi.e, 1.0f);
            hvi f = eba.f(d, 15.0f, 16.0f, 15.0f, 8.0f);
            b.v(1437414727);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: egwa
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.u(jkvVar, "infoMessage");
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c = jjs.c(f, false, (ffji) R);
            int i4 = huo.a;
            ipn a = ebm.a(dxu.e, hum.n, b, 54);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            hvi j = eba.j(hvi.e, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            igz igzVar = fqr.a;
            if (igzVar == null) {
                igx igxVar = new igx("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                List list = iii.a;
                idl idlVar = new idl(ibw.a);
                ArrayList arrayList = new ArrayList(32);
                iha.i(11.0f, 7.0f, arrayList);
                iha.f(2.0f, arrayList);
                iha.m(2.0f, arrayList);
                iha.f(-2.0f, arrayList);
                iha.b(arrayList);
                iha.i(11.0f, 11.0f, arrayList);
                iha.f(2.0f, arrayList);
                iha.m(6.0f, arrayList);
                iha.f(-2.0f, arrayList);
                iha.b(arrayList);
                iha.i(12.0f, 2.0f, arrayList);
                iha.c(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f, arrayList);
                iha.l(4.48f, 10.0f, 10.0f, 10.0f, arrayList);
                iha.l(10.0f, -4.48f, 10.0f, -10.0f, arrayList);
                iha.k(17.52f, arrayList);
                iha.b(arrayList);
                iha.i(12.0f, 20.0f, arrayList);
                iha.d(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f, arrayList);
                iha.l(3.59f, -8.0f, 8.0f, -8.0f, arrayList);
                iha.l(8.0f, 3.59f, 8.0f, 8.0f, arrayList);
                iha.l(-3.59f, 8.0f, -8.0f, 8.0f, arrayList);
                iha.b(arrayList);
                igxVar.c(arrayList, 0, "", idlVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                fqr.a = igxVar.a();
                igzVar = fqr.a;
                igzVar.getClass();
            }
            dwho.b(igzVar, null, j, 0L, b, 432, 8);
            hfdVar2 = b;
            dwjt.b(jii.a(R.string.pqe_info_message_managed_organization, b), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar2, 0, 0, 131070);
            hfdVar2.n();
        } else {
            hfdVar2 = b;
            if (ewkeVar != ewke.MESSAGE_UNDEFINED && ewkeVar != ewke.NO_MESSAGE) {
                throw new ffcd();
            }
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: egwb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    egxj.a(ewke.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r18, final java.lang.Object r19, final defpackage.ffix r20, final defpackage.ffix r21, final boolean r22, final boolean r23, final boolean r24, defpackage.ewke r25, defpackage.hfd r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egxj.b(java.lang.String, java.lang.Object, ffix, ffix, boolean, boolean, boolean, ewke, hfd, int, int):void");
    }

    public static final void c(final String str, ffix ffixVar, boolean z, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        final ffix ffixVar2;
        final boolean z2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-424859637);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
            z2 = z;
            hfdVar2 = b;
        } else {
            int i4 = huo.a;
            hus husVar = hum.n;
            dxj dxjVar = dxu.e;
            hvi j = eba.j(hvi.e, 20.0f, 0.0f, 8.0f, 0.0f, 10);
            ipn a = ebm.a(dxjVar, husVar, b, 54);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
            int i5 = ist.a;
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ebr ebrVar = ebr.a;
            dwjt.b(str, ebrVar.a(hvi.e, 1.0f, false), gft.a(b).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(b).e, b, i2 & 14, 3120, 55288);
            hfdVar2 = b;
            ffixVar2 = ffixVar;
            z2 = z;
            egth.a(228758, hpx.d(140180605, new egwk(ffixVar2, z2), hfdVar2), hfdVar2, 54);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: egwe
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    ffix ffixVar4 = ffixVar2;
                    int i6 = i;
                    egxj.c(str2, ffixVar4, z2, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final /* synthetic */ ada d(final egub egubVar, final ffix ffixVar, final boolean z, hfd hfdVar) {
        hfdVar.v(1107441342);
        ael aelVar = new ael();
        hfdVar.v(1068056441);
        boolean D = hfdVar.D(ffixVar) | hfdVar.F(egubVar);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new ffji() { // from class: egwg
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ade adeVar = (ade) obj;
                    adeVar.getClass();
                    Intent intent = adeVar.b;
                    String stringExtra = intent != null ? intent.getStringExtra("result.updatedPhotoUrl") : null;
                    egub egubVar2 = egubVar;
                    if (stringExtra == null || ffpc.J(stringExtra)) {
                        ffqy.d(egubVar2.b, null, null, new egtv(egubVar2, null), 3);
                    } else {
                        boolean z2 = z;
                        ffix.this.invoke();
                        ffqy.d(egubVar2.b, null, null, new egty(egubVar2, stringExtra, z2, null), 3);
                    }
                    return ffcu.a;
                }
            };
            hfdVar.y(f);
        }
        hfdVar.o();
        ada a = aco.a(aelVar, (ffji) f, hfdVar);
        hfdVar.o();
        return a;
    }

    public static final void e(final Object obj, final ffix ffixVar, final boolean z, final boolean z2, egsa egsaVar, hfd hfdVar, final int i) {
        Object obj2;
        int i2;
        final egsa egsaVar2;
        qrz qrzVar;
        hfd hfdVar2;
        hfd b = hfdVar.b(610816505);
        if ((i & 6) == 0) {
            obj2 = obj;
            i2 = (true != b.F(obj2) ? 2 : 4) | i;
        } else {
            obj2 = obj;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
            egsaVar2 = egsaVar;
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                egsaVar2 = (egsa) b.e(egsi.a);
            } else {
                b.s();
                egsaVar2 = egsaVar;
            }
            b.l();
            hve hveVar = hvi.e;
            int i3 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i4 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dyi dyiVar = dyi.a;
            hvi k = ebs.k(hxo.a(hvi.e, eqm.a), 170.0f);
            if (egsaVar2.b()) {
                ffjm ffjmVar2 = eguk.e;
                jku jkuVar = qrv.b;
                qrzVar = new qrz(ffjmVar2);
            } else {
                qrzVar = null;
            }
            qrv.a(obj2, null, k, null, null, 0.0f, qrzVar, null, null, b, (i2 & 14) | 48, 888);
            hfdVar2 = b;
            egth.a(228768, hpx.d(-1800698231, new egwo(z, ffixVar, dyiVar, z2), hfdVar2), hfdVar2, 54);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: egwf
                @Override // defpackage.ffjm
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    Object obj5 = obj;
                    ffix ffixVar3 = ffixVar;
                    boolean z3 = z;
                    boolean z4 = z2;
                    egxj.e(obj5, ffixVar3, z3, z4, egsaVar2, (hfd) obj3, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final String str, final god godVar, final Account account, final egub egubVar, final dvyu dvyuVar, final egse egseVar, egsa egsaVar, hfd hfdVar, final int i) {
        int i2;
        god godVar2;
        egse egseVar2;
        egsa egsaVar2;
        final egsa egsaVar3;
        str.getClass();
        godVar.getClass();
        account.getClass();
        egubVar.getClass();
        dvyuVar.getClass();
        egseVar.getClass();
        hfd b = hfdVar.b(1080721152);
        if ((i & 6) == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            godVar2 = godVar;
            i2 |= true != b.D(godVar2) ? 16 : 32;
        } else {
            godVar2 = godVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(account) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? b.D(egubVar) : b.F(egubVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(dvyuVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            egseVar2 = egseVar;
            i2 |= true != b.F(egseVar2) ? 65536 : 131072;
        } else {
            egseVar2 = egseVar;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((599187 & i2) == 599186 && b.I()) {
            b.s();
            egsaVar3 = egsaVar;
        } else {
            int i3 = (-3670017) & i2;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                egsaVar2 = (egsa) b.e(egsi.a);
            } else {
                b.s();
                egsaVar2 = egsaVar;
            }
            b.l();
            dvyuVar.b(228769, null, new dvxc[]{dvyd.a(account.name), dwca.a("profile_primitives_android")}, null, hpx.d(1155110826, new egxi(egubVar, godVar2, account, str, egsaVar2, egseVar2), b), b, ((i3 << 12) & 234881024) | 12582918, 122);
            egsaVar3 = egsaVar2;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: egwh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    god godVar3 = godVar;
                    Account account2 = account;
                    egub egubVar2 = egubVar;
                    dvyu dvyuVar2 = dvyuVar;
                    egse egseVar3 = egseVar;
                    egxj.f(str2, godVar3, account2, egubVar2, dvyuVar2, egseVar3, egsaVar3, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
