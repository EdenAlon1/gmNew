package defpackage;

import com.google.android.rcs.client.messaging.data.MessageClass;

/* compiled from: PG */
/* loaded from: classes8.dex */
class clif extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        MessageClass messageClass = (MessageClass) obj;
        awxv awxvVar = (awxv) awya.a.createBuilder();
        awxz awxzVar = (awxz) clit.a.m().fP(messageClass.b());
        awxvVar.copyOnWrite();
        awya awyaVar = (awya) awxvVar.instance;
        awyaVar.c = awxzVar.d;
        awyaVar.b |= 1;
        awxx awxxVar = (awxx) clit.b.m().fP(messageClass.a());
        awxvVar.copyOnWrite();
        awya awyaVar2 = (awya) awxvVar.instance;
        awyaVar2.d = awxxVar.e;
        awyaVar2.b |= 2;
        boolean d = messageClass.d();
        awxvVar.copyOnWrite();
        awya awyaVar3 = (awya) awxvVar.instance;
        awyaVar3.b |= 4;
        awyaVar3.e = d;
        boolean c = messageClass.c();
        awxvVar.copyOnWrite();
        awya awyaVar4 = (awya) awxvVar.instance;
        awyaVar4.b |= 8;
        awyaVar4.f = c;
        return (awya) awxvVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awya awyaVar = (awya) obj;
        eign e = MessageClass.e();
        if ((awyaVar.b & 1) != 0) {
            emwd emwdVar = clit.a;
            awxz b = awxz.b(awyaVar.c);
            if (b == null) {
                b = awxz.UNKNOWN_MESSAGE_SOURCE;
            }
            e.e((eigp) emwdVar.fP(b));
        }
        if ((awyaVar.b & 2) != 0) {
            emwd emwdVar2 = clit.b;
            awxx b2 = awxx.b(awyaVar.d);
            if (b2 == null) {
                b2 = awxx.UNKNOWN_MESSAGE_PRIORITY;
            }
            e.d((eigo) emwdVar2.fP(b2));
        }
        if ((awyaVar.b & 4) != 0) {
            e.c(awyaVar.e);
        }
        if ((awyaVar.b & 8) != 0) {
            e.b(awyaVar.f);
        }
        return e.a();
    }
}
