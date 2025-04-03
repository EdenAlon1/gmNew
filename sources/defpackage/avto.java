package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes6.dex */
class avto extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        awul awulVar = (awul) obj;
        eijj eijjVar = new eijj();
        if ((awulVar.b & 1) != 0) {
            emwd emwdVar = avtx.a;
            awup awupVar = awulVar.c;
            if (awupVar == null) {
                awupVar = awup.a;
            }
            eijjVar.c((ContentType) emwdVar.fP(awupVar));
        }
        if ((awulVar.b & 2) != 0) {
            eijjVar.b(awulVar.d);
        }
        return eijjVar.a();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eijp eijpVar = (eijp) obj;
        awuk awukVar = (awuk) awul.a.createBuilder();
        eyee b = eijpVar.b();
        awukVar.copyOnWrite();
        awul awulVar = (awul) awukVar.instance;
        awulVar.b |= 2;
        awulVar.d = b;
        awup awupVar = (awup) avtx.a.m().fP(eijpVar.a());
        awukVar.copyOnWrite();
        awul awulVar2 = (awul) awukVar.instance;
        awupVar.getClass();
        awulVar2.c = awupVar;
        awulVar2.b |= 1;
        return (awul) awukVar.build();
    }
}
