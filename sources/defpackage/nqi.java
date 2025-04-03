package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqi implements npn {
    public final Context a;
    public final ntp b;
    public final npe c;

    public nqi(nqe nqeVar) {
        this.a = nqeVar.a;
        this.b = nqeVar.c;
        this.c = nqeVar.d;
    }

    public static nrd a(lqc lqcVar, String str) {
        return nrd.b(new IllegalArgumentException(str), 4003, new nrc(lqcVar.toString(), lre.l(lqcVar.o), false, null));
    }

    public static nrd b(lqc lqcVar, boolean z) {
        return nrd.b(new IllegalArgumentException((z && lpo.i(lqcVar.C)) ? "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: ".concat(String.valueOf(String.valueOf(lqcVar.C))) : "No MIME type is supported by both encoder and muxer."), 4003, new nrc(lqcVar.toString(), z, false, null));
    }

    public static engw c(List list, nqf nqfVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) list.get(i2);
            int a = nqfVar.a(mediaCodecInfo);
            if (a != Integer.MAX_VALUE) {
                if (a < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = a;
                } else if (a == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return engw.n(arrayList);
    }
}
