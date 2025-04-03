package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.ffcu;
import defpackage.ffji;
import defpackage.ffjm;
import defpackage.hfc;
import defpackage.hfd;
import defpackage.hfm;
import defpackage.hfz;
import defpackage.hgf;
import defpackage.hgq;
import defpackage.hgs;
import defpackage.hho;
import defpackage.hic;
import defpackage.hik;
import defpackage.hil;
import defpackage.hio;
import defpackage.hky;
import defpackage.hla;
import defpackage.hpx;
import defpackage.hrc;
import defpackage.hre;
import defpackage.hrg;
import defpackage.iir;
import defpackage.iyq;
import defpackage.jaw;
import defpackage.jax;
import defpackage.jay;
import defpackage.jaz;
import defpackage.jba;
import defpackage.jbb;
import defpackage.jbc;
import defpackage.jbd;
import defpackage.jbf;
import defpackage.jbg;
import defpackage.jbh;
import defpackage.jbj;
import defpackage.jbk;
import defpackage.jbm;
import defpackage.jbn;
import defpackage.jci;
import defpackage.jdr;
import defpackage.jds;
import defpackage.jdv;
import defpackage.jdx;
import defpackage.jdy;
import defpackage.jdz;
import defpackage.jfd;
import defpackage.jid;
import defpackage.jig;
import defpackage.jiy;
import defpackage.lkr;
import defpackage.lnr;
import defpackage.owu;
import defpackage.owv;
import defpackage.owz;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final hik a = new hgq(hla.a, jaw.a);
    public static final hik b = new hky(jax.a);
    public static final hik c = new hgf(jba.a);
    public static final hik d = new hky(jay.a);
    public static final hik e = new hky(jaz.a);
    public static final hik f = new hky(jbb.a);
    public static final hik g = new hky(jbc.a);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    public static final void a(AndroidComposeView androidComposeView, ffjm ffjmVar, hfd hfdVar, int i) {
        char c2;
        ?? r18;
        jiy jiyVar;
        boolean areAllPrimitivesSupported;
        LinkedHashMap linkedHashMap;
        boolean z;
        int i2 = i & 6;
        hfd b2 = hfdVar.b(1396852028);
        int i3 = i2 == 0 ? (true != b2.F(androidComposeView) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b2.F(ffjmVar) ? 16 : 32;
        }
        if (b2.J((i3 & 19) != 18, i3 & 1)) {
            Context context = androidComposeView.getContext();
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(new Configuration(context.getResources().getConfiguration()), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new jbd(hhoVar);
                hfmVar.ad(R2);
            }
            androidComposeView.q = (ffji) R2;
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                R3 = new jci(context);
                hfmVar.ad(R3);
            }
            jci jciVar = (jci) R3;
            iyq E = androidComposeView.E();
            if (E == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object R4 = hfmVar.R();
            if (R4 == hfc.a) {
                owz owzVar = E.b;
                int i4 = jdz.a;
                Object parent = androidComposeView.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                c2 = 4;
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = hrc.class.getSimpleName() + ':' + str;
                owv U = owzVar.U();
                Bundle a2 = U.a(str2);
                if (a2 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a2.keySet()) {
                        ArrayList parcelableArrayList = a2.getParcelableArrayList(str3);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str3, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                r18 = 0;
                jdy jdyVar = jdy.a;
                hik hikVar = hrg.a;
                final hre hreVar = new hre(linkedHashMap, jdyVar);
                try {
                    U.b(str2, new owu() { // from class: jdw
                        @Override // defpackage.owu
                        public final Bundle a() {
                            int i5 = jdz.a;
                            Map b3 = hrc.this.b();
                            Bundle bundle = new Bundle();
                            for (Map.Entry entry : b3.entrySet()) {
                                String str4 = (String) entry.getKey();
                                List list = (List) entry.getValue();
                                bundle.putParcelableArrayList(str4, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                            }
                            return bundle;
                        }
                    });
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                jdv jdvVar = new jdv(hreVar, new jdx(z, U, str2));
                hfmVar.ad(jdvVar);
                R4 = jdvVar;
            } else {
                c2 = 4;
                r18 = 0;
            }
            jdv jdvVar2 = (jdv) R4;
            ffcu ffcuVar = ffcu.a;
            boolean F = b2.F(jdvVar2);
            Object R5 = hfmVar.R();
            if (F || R5 == hfc.a) {
                R5 = new jbf(jdvVar2);
                hfmVar.ad(R5);
            }
            hgs.c(ffcuVar, (ffji) R5, b2);
            Object R6 = hfmVar.R();
            if (R6 == hfc.a) {
                if (Build.VERSION.SDK_INT >= 31) {
                    areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
                    if (areAllPrimitivesSupported) {
                        R6 = new jds(androidComposeView);
                        hfmVar.ad(R6);
                    }
                }
                R6 = new jfd();
                hfmVar.ad(R6);
            }
            iir iirVar = (iir) R6;
            Configuration c3 = c(hhoVar);
            Object R7 = hfmVar.R();
            if (R7 == hfc.a) {
                R7 = new jid();
                hfmVar.ad(R7);
            }
            jid jidVar = (jid) R7;
            Object R8 = hfmVar.R();
            Object obj = R8;
            if (R8 == hfc.a) {
                Configuration configuration = new Configuration();
                if (c3 != null) {
                    configuration.setTo(c3);
                }
                hfmVar.ad(configuration);
                obj = configuration;
            }
            Configuration configuration2 = (Configuration) obj;
            Object R9 = hfmVar.R();
            if (R9 == hfc.a) {
                R9 = new jbk(configuration2, jidVar);
                hfmVar.ad(R9);
            }
            jbk jbkVar = (jbk) R9;
            boolean F2 = b2.F(context);
            Object R10 = hfmVar.R();
            if (F2 || R10 == hfc.a) {
                R10 = new jbj(context, jbkVar);
                hfmVar.ad(R10);
            }
            hgs.c(jidVar, (ffji) R10, b2);
            Object R11 = hfmVar.R();
            if (R11 == hfc.a) {
                R11 = new jig();
                hfmVar.ad(R11);
            }
            jig jigVar = (jig) R11;
            Object R12 = hfmVar.R();
            if (R12 == hfc.a) {
                R12 = new jbn(jigVar);
                hfmVar.ad(R12);
            }
            jbn jbnVar = (jbn) R12;
            boolean F3 = b2.F(context);
            Object R13 = hfmVar.R();
            if (F3 || R13 == hfc.a) {
                R13 = new jbm(context, jbnVar);
                hfmVar.ad(R13);
            }
            hgs.c(jigVar, (ffji) R13, b2);
            boolean booleanValue = ((Boolean) b2.e(jdr.q)).booleanValue() | ((Build.VERSION.SDK_INT < 31 || (jiyVar = androidComposeView.N) == null) ? r18 : ((Boolean) jiyVar.a.a()).booleanValue());
            hil[] hilVarArr = new hil[10];
            hilVarArr[r18] = a.c(c(hhoVar));
            hilVarArr[1] = b.c(context);
            hilVarArr[2] = lnr.a.c(E.a);
            hilVarArr[3] = f.c(E.b);
            hilVarArr[c2] = hrg.a.c(jdvVar2);
            hilVarArr[5] = g.c(androidComposeView);
            hilVarArr[6] = d.c(jidVar);
            hilVarArr[7] = e.c(jigVar);
            hilVarArr[8] = jdr.q.c(Boolean.valueOf(booleanValue));
            hilVarArr[9] = jdr.h.c(iirVar);
            hfz.b(hilVarArr, hpx.d(1471621628, new jbg(androidComposeView, jciVar, ffjmVar), b2), b2, 56);
        } else {
            b2.s();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new jbh(androidComposeView, ffjmVar, i);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(a.a(str, "CompositionLocal ", " not present"));
    }

    private static final Configuration c(hho hhoVar) {
        return (Configuration) hhoVar.a();
    }

    public static final hik<lkr> getLocalLifecycleOwner() {
        return lnr.a;
    }
}
