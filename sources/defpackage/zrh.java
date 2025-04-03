package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrh implements ffjn {
    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ipo ei;
        ipq ipqVar = (ipq) obj;
        ipl iplVar = (ipl) obj2;
        long j = ((jzk) obj3).a;
        Trace.beginSection(ffpc.ac("measureMessageBubble", 126));
        try {
            iqk e = iplVar.e(j);
            ei = ipqVar.ei(e.a, e.b, ffem.a, new zrg(e));
            return ei;
        } finally {
            Trace.endSection();
        }
    }
}
