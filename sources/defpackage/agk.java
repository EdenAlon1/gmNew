package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agk implements bcp {
    public final Context a;
    public final ayb b;
    public final bde c;
    public final bdd d;
    public final apu e;
    public final List f;
    public final ala g;
    public final long h;
    private final Map i = new HashMap();

    public agk(Context context, bde bdeVar, atl atlVar, long j) {
        this.a = context;
        this.c = bdeVar;
        apu apuVar = new apu(Build.VERSION.SDK_INT >= 30 ? new apx(context) : Build.VERSION.SDK_INT >= 29 ? new apw(context) : Build.VERSION.SDK_INT >= 28 ? new apv(context) : new apz(context, new apy(((bbe) bdeVar).b)));
        this.e = apuVar;
        this.g = ala.d(context);
        try {
            ArrayList<String> arrayList = new ArrayList();
            List<String> asList = Arrays.asList(apuVar.a.f());
            if (atlVar == null) {
                Iterator it = asList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                Object obj = null;
                try {
                    Integer b = atlVar.b();
                    if (b != null && asList.contains("0") && asList.contains("1")) {
                        if (b.intValue() == 1) {
                            if (((Integer) apuVar.a("0").c(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                                obj = "1";
                            }
                        } else if (b.intValue() == 0 && ((Integer) apuVar.a("1").c(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                            obj = "0";
                        }
                    }
                } catch (IllegalStateException unused) {
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : asList) {
                    if (!str.equals(obj)) {
                        arrayList2.add(a(str));
                    }
                }
                Iterator it2 = atlVar.c(arrayList2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((bcq) ((ati) it2.next())).k());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : arrayList) {
                if (str2.equals("0") || str2.equals("1")) {
                    arrayList3.add(str2);
                } else if (akg.a(this.e, str2)) {
                    arrayList3.add(str2);
                } else {
                    avw.a("Camera2CameraFactory", a.a(str2, "Camera ", " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE."));
                }
            }
            this.f = arrayList3;
            asb asbVar = new asb(this.e);
            this.b = asbVar;
            bdd bddVar = new bdd(asbVar);
            this.d = bddVar;
            asbVar.a.add(bddVar);
            this.h = j;
        } catch (aog e) {
            throw new avv(new ato(e));
        } catch (ato e2) {
            throw new avv(e2);
        }
    }

    public final ahv a(String str) {
        try {
            ahv ahvVar = (ahv) this.i.get(str);
            if (ahvVar != null) {
                return ahvVar;
            }
            ahv ahvVar2 = new ahv(str, this.e);
            this.i.put(str, ahvVar2);
            return ahvVar2;
        } catch (aog e) {
            throw new ato(e);
        }
    }

    @Override // defpackage.bcp
    public final Set b() {
        return new LinkedHashSet(this.f);
    }
}
