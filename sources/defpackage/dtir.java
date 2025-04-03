package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtir extends ffkk implements ffjo {
    final /* synthetic */ List a;
    final /* synthetic */ dtlg b;
    final /* synthetic */ boolean c;
    final /* synthetic */ dtil d;
    final /* synthetic */ hjz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtir(List list, dtlg dtlgVar, hjz hjzVar, boolean z, dtil dtilVar) {
        super(4);
        this.a = list;
        this.b = dtlgVar;
        this.e = hjzVar;
        this.c = z;
        this.d = dtilVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffjo
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        hvi b;
        hvi a;
        hvi a2;
        dtfd dtfdVar;
        boolean z;
        int i2;
        String str;
        edi ediVar = (edi) obj;
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (true != hfdVar.D(ediVar) ? 2 : 4) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= true != hfdVar.B(intValue) ? 16 : 32;
        }
        if (hfdVar.J((i & 147) != 146, i & 1)) {
            dtfd dtfdVar2 = (dtfd) this.a.get(intValue);
            hfdVar.v(-435818407);
            b = ebs.b(hvi.e, 1.0f);
            hvi a3 = hxo.a(ebs.o(b, 88.0f), eqm.b(15.0f));
            boolean z2 = this.e.c() == intValue;
            hfdVar.v(401589270);
            boolean D = ((((i & 112) ^ 48) > 32 && hfdVar.B(intValue)) || (i & 48) == 32) | hfdVar.D(this.b) | hfdVar.D(dtfdVar2);
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                dtip dtipVar = new dtip(intValue, this.b, this.e, dtfdVar2);
                hfdVar.y(dtipVar);
                f = dtipVar;
            }
            hfdVar.o();
            a = dee.a(huz.g(a3, new epq(z2, (ffix) f)), dsjy.a(gft.a(hfdVar)), idb.a);
            dtev dtevVar = dtfdVar2.e;
            if (dtevVar == null) {
                dtevVar = dtev.a;
            }
            dtex dtexVar = dtevVar.c;
            if (dtexVar == null) {
                dtexVar = dtex.a;
            }
            long d = iby.d(dtexVar.b);
            dtev dtevVar2 = dtfdVar2.e;
            if (dtevVar2 == null) {
                dtevVar2 = dtev.a;
            }
            dtex dtexVar2 = dtevVar2.c;
            if (dtexVar2 == null) {
                dtexVar2 = dtex.a;
            }
            long d2 = iby.d(dtexVar2.c);
            dtev dtevVar3 = dtfdVar2.e;
            if (dtevVar3 == null) {
                dtevVar3 = dtev.a;
            }
            dtex dtexVar3 = dtevVar3.c;
            if (dtexVar3 == null) {
                dtexVar3 = dtex.a;
            }
            hvi a4 = dovy.a(a, d, d2, dtexVar3.d);
            if (this.e.c() == intValue) {
                a4 = a4.a(dek.c(hvi.e, 3.0f, ibw.c, eqm.b(15.0f)));
            }
            int b2 = dtfg.b(dtfdVar2.c);
            if (b2 == 0) {
                b2 = 1;
            }
            a2 = dlsj.a(a4, jii.a(dtfe.f(b2), hfdVar), true);
            int i3 = huo.a;
            ipn a5 = dyc.a(hum.e, false);
            int a6 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b3 = huz.b(hfdVar, a2);
            int i4 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a5, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a6))) {
                Integer valueOf = Integer.valueOf(a6);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b3, iss.c);
            dyi dyiVar = dyi.a;
            hfdVar.v(642972361);
            if (dtfe.d(dtfdVar2)) {
                Uri a7 = dtfe.a(dtfdVar2);
                if (a7 == null) {
                    dtfdVar = dtfdVar2;
                    z = true;
                    i2 = 0;
                } else {
                    hvi b4 = dyiVar.b(hvr.a(hvi.e, 0.0f));
                    i2 = 0;
                    huo huoVar = hum.g;
                    int i5 = inp.a;
                    inp inpVar = ino.d;
                    dtfdVar2.getClass();
                    int b5 = dtfg.b(dtfdVar2.c);
                    if (b5 != 0) {
                        switch (b5) {
                            case 2:
                                str = "VOICE_MOOD_TYPE_UNKNOWN";
                                break;
                            case 3:
                                str = "VOICE_MOOD_TYPE_NONE";
                                break;
                            case 4:
                                str = "VOICE_MOOD_TYPE_CELEBRATE";
                                break;
                            case 5:
                                str = "VOICE_MOOD_TYPE_LOVE";
                                break;
                            case 6:
                                str = "VOICE_MOOD_TYPE_LAUGHING";
                                break;
                            case 7:
                                str = "VOICE_MOOD_TYPE_SOBBING";
                                break;
                            case 8:
                                str = "VOICE_MOOD_TYPE_HAPPY";
                                break;
                            case 9:
                                str = "VOICE_MOOD_TYPE_ANGRY";
                                break;
                            case 10:
                                str = "VOICE_MOOD_TYPE_SHOCKED";
                                break;
                            case 11:
                                str = "VOICE_MOOD_TYPE_ANNOYED";
                                break;
                            case 12:
                                str = "VOICE_MOOD_TYPE_SAD";
                                break;
                        }
                        String concat = "mood_selection_background_".concat(str);
                        dtfdVar = dtfdVar2;
                        z = true;
                        dnac.a(a7, null, b4, null, null, huoVar, inpVar, null, 0.0f, null, null, null, concat, null, null, null, hfdVar, 14155824, 0, 491320);
                    }
                    str = "UNRECOGNIZED";
                    String concat2 = "mood_selection_background_".concat(str);
                    dtfdVar = dtfdVar2;
                    z = true;
                    dnac.a(a7, null, b4, null, null, huoVar, inpVar, null, 0.0f, null, null, null, concat2, null, null, null, hfdVar, 14155824, 0, 491320);
                }
                hfdVar = hfdVar;
            } else {
                dtfdVar = dtfdVar2;
                z = true;
                i2 = 0;
            }
            hfdVar.o();
            hfdVar.v(642989305);
            boolean z3 = (this.c && this.d.c && this.e.c() == 0 && ((Boolean) hkf.a(this.d.d, hfdVar).a()).booleanValue()) ? z : i2;
            hfdVar.o();
            dtis.a(dtfdVar, z3, hfdVar, i2);
            hfdVar.n();
            hfdVar.o();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
