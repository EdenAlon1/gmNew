package defpackage;

import com.google.android.rcs.client.messaging.data.MessageClass;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eili extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        MessageClass messageClass = (MessageClass) obj;
        clpd clpdVar = (clpd) clpi.a.createBuilder();
        clph clphVar = (clph) eimr.a.m().fP(messageClass.b());
        clpdVar.copyOnWrite();
        clpi clpiVar = (clpi) clpdVar.instance;
        clpiVar.c = clphVar.d;
        clpiVar.b |= 1;
        clpf clpfVar = (clpf) eimr.b.m().fP(messageClass.a());
        clpdVar.copyOnWrite();
        clpi clpiVar2 = (clpi) clpdVar.instance;
        clpiVar2.d = clpfVar.e;
        clpiVar2.b |= 2;
        boolean d = messageClass.d();
        clpdVar.copyOnWrite();
        clpi clpiVar3 = (clpi) clpdVar.instance;
        clpiVar3.b |= 4;
        clpiVar3.e = d;
        boolean c = messageClass.c();
        clpdVar.copyOnWrite();
        clpi clpiVar4 = (clpi) clpdVar.instance;
        clpiVar4.b |= 8;
        clpiVar4.f = c;
        return (clpi) clpdVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        clpi clpiVar = (clpi) obj;
        eign e = MessageClass.e();
        if ((clpiVar.b & 1) != 0) {
            emwd emwdVar = eimr.a;
            clph b = clph.b(clpiVar.c);
            if (b == null) {
                b = clph.UNKNOWN_MESSAGE_SOURCE;
            }
            e.e((eigp) emwdVar.fP(b));
        }
        if ((clpiVar.b & 2) != 0) {
            emwd emwdVar2 = eimr.b;
            clpf b2 = clpf.b(clpiVar.d);
            if (b2 == null) {
                b2 = clpf.UNKNOWN_MESSAGE_PRIORITY;
            }
            e.d((eigo) emwdVar2.fP(b2));
        }
        if ((clpiVar.b & 4) != 0) {
            e.c(clpiVar.e);
        }
        if ((clpiVar.b & 8) != 0) {
            e.b(clpiVar.f);
        }
        return e.a();
    }
}
