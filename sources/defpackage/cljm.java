package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cljm extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        clpi clpiVar = (clpi) obj;
        awxv awxvVar = (awxv) awya.a.createBuilder();
        if ((clpiVar.b & 1) != 0) {
            emwd m = clkw.a.m();
            clph b = clph.b(clpiVar.c);
            if (b == null) {
                b = clph.UNKNOWN_MESSAGE_SOURCE;
            }
            awxz awxzVar = (awxz) m.fP(b);
            awxvVar.copyOnWrite();
            awya awyaVar = (awya) awxvVar.instance;
            awyaVar.c = awxzVar.d;
            awyaVar.b |= 1;
        }
        if ((clpiVar.b & 2) != 0) {
            emwd m2 = clkw.b.m();
            clpf b2 = clpf.b(clpiVar.d);
            if (b2 == null) {
                b2 = clpf.UNKNOWN_MESSAGE_PRIORITY;
            }
            awxx awxxVar = (awxx) m2.fP(b2);
            awxvVar.copyOnWrite();
            awya awyaVar2 = (awya) awxvVar.instance;
            awyaVar2.d = awxxVar.e;
            awyaVar2.b |= 2;
        }
        if ((clpiVar.b & 4) != 0) {
            boolean z = clpiVar.e;
            awxvVar.copyOnWrite();
            awya awyaVar3 = (awya) awxvVar.instance;
            awyaVar3.b |= 4;
            awyaVar3.e = z;
        }
        if ((clpiVar.b & 8) != 0) {
            boolean z2 = clpiVar.f;
            awxvVar.copyOnWrite();
            awya awyaVar4 = (awya) awxvVar.instance;
            awyaVar4.b |= 8;
            awyaVar4.f = z2;
        }
        return (awya) awxvVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awya awyaVar = (awya) obj;
        clpd clpdVar = (clpd) clpi.a.createBuilder();
        if ((awyaVar.b & 1) != 0) {
            emwd emwdVar = clkw.a;
            awxz b = awxz.b(awyaVar.c);
            if (b == null) {
                b = awxz.UNKNOWN_MESSAGE_SOURCE;
            }
            clph clphVar = (clph) emwdVar.fP(b);
            clpdVar.copyOnWrite();
            clpi clpiVar = (clpi) clpdVar.instance;
            clpiVar.c = clphVar.d;
            clpiVar.b |= 1;
        }
        if ((awyaVar.b & 2) != 0) {
            emwd emwdVar2 = clkw.b;
            awxx b2 = awxx.b(awyaVar.d);
            if (b2 == null) {
                b2 = awxx.UNKNOWN_MESSAGE_PRIORITY;
            }
            clpf clpfVar = (clpf) emwdVar2.fP(b2);
            clpdVar.copyOnWrite();
            clpi clpiVar2 = (clpi) clpdVar.instance;
            clpiVar2.d = clpfVar.e;
            clpiVar2.b |= 2;
        }
        if ((awyaVar.b & 4) != 0) {
            boolean z = awyaVar.e;
            clpdVar.copyOnWrite();
            clpi clpiVar3 = (clpi) clpdVar.instance;
            clpiVar3.b |= 4;
            clpiVar3.e = z;
        }
        if ((awyaVar.b & 8) != 0) {
            boolean z2 = awyaVar.f;
            clpdVar.copyOnWrite();
            clpi clpiVar4 = (clpi) clpdVar.instance;
            clpiVar4.b |= 8;
            clpiVar4.f = z2;
        }
        return (clpi) clpdVar.build();
    }
}
