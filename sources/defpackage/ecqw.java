package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecqw extends ecdp {
    final /* synthetic */ emye e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecqw(emxc emxcVar, fazb fazbVar, Context context, emye emyeVar) {
        super("StorageMetric", emxcVar, fazbVar, context);
        this.e = emyeVar;
    }

    @Override // defpackage.ecdp
    public final enip a(fgqx fgqxVar) {
        if ((fgqxVar.b & 128) == 0) {
            return enpd.a;
        }
        enin eninVar = new enin();
        fgqm fgqmVar = fgqxVar.j;
        if (fgqmVar == null) {
            fgqmVar = fgqm.a;
        }
        Iterator<E> it = fgqmVar.k.iterator();
        while (it.hasNext()) {
            eninVar.j(this.e.i(((fgql) it.next()).c));
        }
        return eninVar.g();
    }
}
