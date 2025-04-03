package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ccn extends OrientationEventListener {
    final /* synthetic */ ccq a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccn(ccq ccqVar, Context context) {
        super(context);
        this.a = ccqVar;
        this.b = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        ArrayList arrayList;
        if (i == -1) {
            return;
        }
        final int i2 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
        if (this.b != i2) {
            this.b = i2;
            synchronized (this.a.a) {
                arrayList = new ArrayList(this.a.c.values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                final ccp ccpVar = (ccp) arrayList.get(i3);
                ccpVar.a.execute(new Runnable() { // from class: cco
                    @Override // java.lang.Runnable
                    public final void run() {
                        ccp ccpVar2 = ccp.this;
                        if (ccpVar2.b.get()) {
                            int i4 = i2;
                            cbl cblVar = ccpVar2.c.a;
                            auo auoVar = cblVar.g;
                            if (auoVar.U(i4)) {
                                auoVar.m();
                            }
                            avk avkVar = cblVar.d;
                            int C = avkVar.C();
                            if (avkVar.U(i4) && avkVar.e != null) {
                                avkVar.e = bly.b(Math.abs(bhp.b(i4) - bhp.b(C)), avkVar.e);
                            }
                            btz btzVar = cblVar.h;
                            if (btzVar.U(i4)) {
                                btzVar.m();
                            }
                        }
                    }
                });
            }
        }
    }
}
