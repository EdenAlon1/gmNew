package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eclh extends ecdp {
    public eclh(emxc emxcVar, fazb fazbVar, Context context) {
        super("CrashMetric", emxcVar, fazbVar, context);
    }

    @Override // defpackage.ecdp
    public final enip a(fgqx fgqxVar) {
        if ((fgqxVar.b & 64) == 0) {
            return enpd.a;
        }
        fgpu fgpuVar = fgqxVar.i;
        if (fgpuVar == null) {
            fgpuVar = fgpu.a;
        }
        eria eriaVar = fgpuVar.i;
        if (eriaVar == null) {
            eriaVar = eria.a;
        }
        enin eninVar = new enin();
        erhu erhuVar = eriaVar.e;
        if (erhuVar == null) {
            erhuVar = erhu.a;
        }
        eninVar.c(erhuVar.d);
        Iterator<E> it = eriaVar.f.iterator();
        while (it.hasNext()) {
            eninVar.c(((erhu) it.next()).d);
        }
        Iterator<E> it2 = (eriaVar.c == 4 ? (erhx) eriaVar.d : erhx.a).b.iterator();
        while (it2.hasNext()) {
            erhu erhuVar2 = ((erhz) it2.next()).c;
            if (erhuVar2 == null) {
                erhuVar2 = erhu.a;
            }
            eninVar.c(erhuVar2.d);
        }
        return eninVar.g();
    }
}
