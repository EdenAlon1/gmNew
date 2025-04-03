package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecpd extends ecdp {
    final /* synthetic */ emye e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecpd(emxc emxcVar, fazb fazbVar, Context context, emye emyeVar) {
        super("NetworkMetric", emxcVar, fazbVar, context);
        this.e = emyeVar;
    }

    @Override // defpackage.ecdp
    public final enip a(fgqx fgqxVar) {
        if ((fgqxVar.b & 32) == 0) {
            return enpd.a;
        }
        enin eninVar = new enin();
        fgnc fgncVar = fgqxVar.h;
        if (fgncVar == null) {
            fgncVar = fgnc.a;
        }
        Iterator<E> it = fgncVar.b.iterator();
        while (it.hasNext()) {
            eninVar.j(this.e.g(((fgna) it.next()).u));
        }
        return eninVar.g();
    }
}
