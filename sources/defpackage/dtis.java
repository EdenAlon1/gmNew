package defpackage;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtis {
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dtfd r11, boolean r12, defpackage.hfd r13, final int r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtis.a(dtfd, boolean, hfd, int):void");
    }

    public static final void b(final dtlg dtlgVar, final dtil dtilVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        final hvi hviVar2;
        hfd hfdVar2;
        dtlgVar.getClass();
        hfd b = hfdVar.b(-631607887);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dtlgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(dtilVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            hfdVar2 = b;
        } else {
            hve hveVar = hvi.e;
            Context context = (Context) b.e(AndroidCompositionLocals_androidKt.b);
            eey a = efb.a(0, b, 3);
            b.v(-412568815);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new hhy(0);
                hfmVar.ad(R);
            }
            final hjz hjzVar = (hjz) R;
            hfmVar.Z();
            b.v(-412566633);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f);
                hfmVar.ad(R2);
            }
            final boolean booleanValue = ((Boolean) R2).booleanValue();
            hfmVar.Z();
            dtfc dtfcVar = (dtfc) dtfd.a.createBuilder();
            dtfcVar.getClass();
            dtfcVar.copyOnWrite();
            dtfd dtfdVar = (dtfd) dtfcVar.instance;
            dtfdVar.c = dtfg.a(3);
            dtfdVar.b |= 1;
            eyfy build = dtfcVar.build();
            build.getClass();
            final List ad = ffdx.ad(ffdx.b((dtfd) build), dtilVar.b);
            d = ebs.d(ebs.e(hveVar, 64.0f), 1.0f);
            hvi a2 = jfw.a(d, "mood_selector_tag");
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            b.v(-412550628);
            boolean F = b.F(ad) | ((i3 & 14) == 4) | b.F(dtilVar);
            Object R3 = hfmVar.R();
            if (F || R3 == hfc.a) {
                ffji ffjiVar = new ffji() { // from class: dtin
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        List list = ad;
                        edpVar.a(list.size(), null, new dtiq(list), new hpw(-1091073711, true, new dtir(list, dtlgVar, hjzVar, booleanValue, dtilVar)));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(ffjiVar);
                R3 = ffjiVar;
            }
            hfmVar.Z();
            hviVar2 = hveVar;
            hfdVar2 = b;
            edh.b(a2, a, null, dxnVar, null, null, false, null, (ffji) R3, hfdVar2, 24576, 492);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dtio
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dtlg dtlgVar2 = dtlg.this;
                    dtil dtilVar2 = dtilVar;
                    int i4 = i;
                    dtis.b(dtlgVar2, dtilVar2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
