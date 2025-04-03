package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mej implements mim {
    private final Context a;
    private final mqx b;
    private final mrm c = mrm.a;

    public mej(Context context) {
        this.a = context;
        this.b = new mqx(context);
    }

    @Override // defpackage.mim
    public final void a(mig migVar) {
        migVar.eL();
    }

    @Override // defpackage.mim
    public final mig[] b(Handler handler, mgi mgiVar, mgi mgiVar2, mgi mgiVar3, mgi mgiVar4) {
        ArrayList arrayList = new ArrayList();
        myy myyVar = new myy(this.a);
        myyVar.d = this.b;
        myyVar.c = this.c;
        myyVar.e = 5000L;
        myyVar.f = handler;
        myyVar.i = mgiVar;
        myyVar.g = 50;
        myyVar.h = -9223372036854775807L;
        lti.c(!myyVar.b);
        Handler handler2 = myyVar.f;
        lti.c((handler2 == null && myyVar.i == null) || !(handler2 == null || myyVar.i == null));
        myyVar.b = true;
        arrayList.add(new mza(myyVar));
        mnj mnjVar = new mnj(this.a);
        lti.c(!mnjVar.c);
        mnjVar.c = true;
        if (mnjVar.f == null) {
            mnjVar.f = new mnl(new lsr[0]);
        }
        if (mnjVar.g == null) {
            mnjVar.g = new mnb(mnjVar.a);
        }
        arrayList.add(new mny(this.a, this.b, this.c, handler, mgiVar2, new mnu(mnjVar)));
        arrayList.add(new mvz(mgiVar3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new mrz(mgiVar4, looper));
        arrayList.add(new mrz(mgiVar4, looper));
        arrayList.add(new nav());
        arrayList.add(new mql(mqe.a));
        return (mig[]) arrayList.toArray(new mig[0]);
    }
}
