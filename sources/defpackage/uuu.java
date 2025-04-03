package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uuu implements ejlr<Void, eyjv<uqr>> {
    final /* synthetic */ uuy a;

    public uuu(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        uqr uqrVar = (uqr) ((eyjv) obj2).a(uqr.a, eyfc.a());
        uqo uqoVar = this.a.I;
        if (uqoVar.g == null) {
            csjy.n("Bugle", "Failed to show options UI: fragment manager is null.");
            return;
        }
        ezxc ezxcVar = (ezxc) ezxf.a.createBuilder();
        String str = uqrVar.d;
        ezxcVar.copyOnWrite();
        ezxf ezxfVar = (ezxf) ezxcVar.instance;
        str.getClass();
        ezxfVar.b |= 1;
        ezxfVar.c = str;
        String str2 = uqrVar.e;
        ezxcVar.copyOnWrite();
        ezxf ezxfVar2 = (ezxf) ezxcVar.instance;
        str2.getClass();
        ezxfVar2.b |= 2;
        ezxfVar2.d = str2;
        boolean z = uqrVar.f;
        ezxcVar.copyOnWrite();
        ezxf ezxfVar3 = (ezxf) ezxcVar.instance;
        ezxfVar3.b |= 8;
        ezxfVar3.f = z;
        int i = uqrVar.n;
        ezxcVar.copyOnWrite();
        ezxf ezxfVar4 = (ezxf) ezxcVar.instance;
        ezxfVar4.b |= 512;
        ezxfVar4.l = i;
        boolean z2 = uqrVar.g;
        ezxcVar.copyOnWrite();
        ezxf ezxfVar5 = (ezxf) ezxcVar.instance;
        ezxfVar5.b |= 16;
        ezxfVar5.g = z2;
        boolean z3 = uqrVar.h;
        ezxcVar.copyOnWrite();
        ezxf ezxfVar6 = (ezxf) ezxcVar.instance;
        ezxfVar6.b |= 32;
        ezxfVar6.h = z3;
        String str3 = uqrVar.i;
        ezxcVar.copyOnWrite();
        ezxf ezxfVar7 = (ezxf) ezxcVar.instance;
        str3.getClass();
        ezxfVar7.b |= 64;
        ezxfVar7.i = str3;
        boolean z4 = uqrVar.j;
        ezxcVar.copyOnWrite();
        ezxf ezxfVar8 = (ezxf) ezxcVar.instance;
        ezxfVar8.b |= 128;
        ezxfVar8.j = z4;
        int i2 = uqrVar.c;
        boolean z5 = ((Boolean) clei.a.e()).booleanValue() && bdjs.u(i2);
        if (uqrVar.k) {
            ezxe ezxeVar = ezxe.ERROR_NO_RETRY_NO_FALLBACK_OPTIONS;
            ezxcVar.copyOnWrite();
            ezxf ezxfVar9 = (ezxf) ezxcVar.instance;
            ezxfVar9.e = ezxeVar.k;
            ezxfVar9.b |= 4;
            ezxcVar.copyOnWrite();
            ezxf ezxfVar10 = (ezxf) ezxcVar.instance;
            ezxfVar10.b |= 32;
            ezxfVar10.h = false;
            ezxcVar.copyOnWrite();
            ezxf ezxfVar11 = (ezxf) ezxcVar.instance;
            ezxfVar11.b |= 128;
            ezxfVar11.j = false;
        } else if (bdjs.t(i2) || z5) {
            ezxe ezxeVar2 = ezxe.SENT_OPTIONS;
            ezxcVar.copyOnWrite();
            ezxf ezxfVar12 = (ezxf) ezxcVar.instance;
            ezxfVar12.e = ezxeVar2.k;
            ezxfVar12.b |= 4;
        } else if (bdjs.s(i2)) {
            ezxe ezxeVar3 = ezxe.SENDING_OPTIONS;
            ezxcVar.copyOnWrite();
            ezxf ezxfVar13 = (ezxf) ezxcVar.instance;
            ezxfVar13.e = ezxeVar3.k;
            ezxfVar13.b |= 4;
        } else if (uqrVar.l) {
            ezxe ezxeVar4 = ezxe.SEND_TIMEOUT_OPTIONS;
            ezxcVar.copyOnWrite();
            ezxf ezxfVar14 = (ezxf) ezxcVar.instance;
            ezxfVar14.e = ezxeVar4.k;
            ezxfVar14.b |= 4;
        } else if (uqrVar.m) {
            ezxe ezxeVar5 = ezxe.ERROR_RECIPIENT_LOST_ENCRYPTION_OPTIONS;
            ezxcVar.copyOnWrite();
            ezxf ezxfVar15 = (ezxf) ezxcVar.instance;
            ezxfVar15.e = ezxeVar5.k;
            ezxfVar15.b |= 4;
        } else if (uqoVar.e.i() && byyr.d(uqrVar.n) && bdjs.v(i2)) {
            ezxe ezxeVar6 = ezxe.ERROR_GROUP_FTD_OPTIONS;
            ezxcVar.copyOnWrite();
            ezxf ezxfVar16 = (ezxf) ezxcVar.instance;
            ezxfVar16.e = ezxeVar6.k;
            ezxfVar16.b |= 4;
        } else {
            ezxe ezxeVar7 = ezxe.ERROR_OPTIONS;
            ezxcVar.copyOnWrite();
            ezxf ezxfVar17 = (ezxf) ezxcVar.instance;
            ezxfVar17.e = ezxeVar7.k;
            ezxfVar17.b |= 4;
        }
        ezxcVar.copyOnWrite();
        ezxf ezxfVar18 = (ezxf) ezxcVar.instance;
        ezxfVar18.b |= 256;
        ezxfVar18.k = z5;
        crka.aY((ezxf) ezxcVar.build()).t(uqoVar.g, "messageFailureOptionsBottomModalFragment");
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        if (!(th instanceof CancellationException)) {
            throw new IllegalStateException("Failure to load participants, metadata, or isFallbackSupported. conversationId=".concat(String.valueOf(String.valueOf(this.a.ap))), th);
        }
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
