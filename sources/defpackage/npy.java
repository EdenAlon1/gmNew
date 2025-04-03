package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.view.Surface;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npy implements npm {
    public final Context a;
    private final mrm b;

    public npy(npx npxVar) {
        this.a = npxVar.a;
        this.b = npxVar.b;
    }

    public static nrd b(lqc lqcVar, String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        String lqcVar2 = lqcVar.toString();
        String str2 = lqcVar.o;
        lti.f(str2);
        return nrd.b(illegalArgumentException, 3003, new nrc(lqcVar2, lre.l(str2), true, null));
    }

    public final npw a(MediaFormat mediaFormat, final lqc lqcVar, Surface surface, boolean z) {
        MediaFormat mediaFormat2;
        lqc lqcVar2;
        Surface surface2;
        int i = engw.d;
        engw engwVar = enou.a;
        lti.f(lqcVar.o);
        try {
            ArrayList arrayList = new ArrayList(mrv.g(lqcVar, false, false));
            mrv.e(arrayList, new mru() { // from class: mrn
                @Override // defpackage.mru
                public final int a(Object obj) {
                    mrf mrfVar = (mrf) obj;
                    int i2 = mrv.a;
                    try {
                        return !mrfVar.d(lqc.this) ? 0 : 1;
                    } catch (mrs unused) {
                        return -1;
                    }
                }
            });
            if (arrayList.isEmpty()) {
                throw b(lqcVar, "No decoders for format");
            }
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    mrf mrfVar = (mrf) arrayList.get(i2);
                    if (!mrfVar.g) {
                        arrayList2.add(mrfVar);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
            if (lvf.a >= 31 && ((mrf) arrayList.get(0)).c.equals("video/dolby-vision")) {
                mediaFormat.setInteger("color-transfer-request", 7);
            }
            ArrayList arrayList3 = new ArrayList();
            Context context = this.a;
            for (mrf mrfVar2 : arrayList.subList(0, 1)) {
                mediaFormat.setString("mime", mrfVar2.c);
                try {
                    mediaFormat2 = mediaFormat;
                    lqcVar2 = lqcVar;
                    surface2 = surface;
                    try {
                        npw npwVar = new npw(context, lqcVar2, mediaFormat2, mrfVar2.a, true, surface2);
                        npwVar.c();
                        return npwVar;
                    } catch (nrd e) {
                        e = e;
                        arrayList3.add(e);
                        lqcVar = lqcVar2;
                        mediaFormat = mediaFormat2;
                        surface = surface2;
                    }
                } catch (nrd e2) {
                    e = e2;
                    mediaFormat2 = mediaFormat;
                    lqcVar2 = lqcVar;
                    surface2 = surface;
                }
            }
            throw ((nrd) arrayList3.get(0));
        } catch (mrs e3) {
            luj.d("DefaultDecoderFactory", "Error querying decoders", e3);
            throw b(lqcVar, "Querying codecs failed");
        }
    }
}
