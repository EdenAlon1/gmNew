package defpackage;

import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eilh extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        GroupMember groupMember = (GroupMember) obj;
        clow clowVar = (clow) cloz.a.createBuilder();
        String d = groupMember.d();
        clowVar.copyOnWrite();
        cloz clozVar = (cloz) clowVar.instance;
        clozVar.b |= 1;
        clozVar.c = d;
        clqv clqvVar = (clqv) eimo.b.m().fP(groupMember.b());
        clowVar.copyOnWrite();
        cloz clozVar2 = (cloz) clowVar.instance;
        clqvVar.getClass();
        clozVar2.d = clqvVar;
        clozVar2.b |= 2;
        if (groupMember.c().isPresent() && groupMember.c().isPresent()) {
            clqv clqvVar2 = (clqv) eimo.b.m().fP(groupMember.c().get());
            clowVar.copyOnWrite();
            cloz clozVar3 = (cloz) clowVar.instance;
            clqvVar2.getClass();
            clozVar3.e = clqvVar2;
            clozVar3.b |= 4;
        }
        boolean e = groupMember.e();
        clowVar.copyOnWrite();
        cloz clozVar4 = (cloz) clowVar.instance;
        clozVar4.b |= 8;
        clozVar4.f = e;
        cloy cloyVar = (cloy) eimo.a.m().fP(groupMember.a());
        clowVar.copyOnWrite();
        cloz clozVar5 = (cloz) clowVar.instance;
        clozVar5.g = cloyVar.e;
        clozVar5.b |= 16;
        return (cloz) clowVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cloz clozVar = (cloz) obj;
        eifv f = GroupMember.f();
        if ((clozVar.b & 1) != 0) {
            f.b(clozVar.c);
        }
        if ((clozVar.b & 2) != 0) {
            emwd emwdVar = eimo.b;
            clqv clqvVar = clozVar.d;
            if (clqvVar == null) {
                clqvVar = clqv.a;
            }
            f.c((RcsDestinationId) emwdVar.fP(clqvVar));
        }
        if ((clozVar.b & 4) != 0) {
            emwd emwdVar2 = eimo.b;
            clqv clqvVar2 = clozVar.e;
            if (clqvVar2 == null) {
                clqvVar2 = clqv.a;
            }
            ((eiej) f).a = Optional.of((RcsDestinationId) emwdVar2.fP(clqvVar2));
        }
        if ((clozVar.b & 8) != 0) {
            f.d(clozVar.f);
        }
        if ((clozVar.b & 16) != 0) {
            emwd emwdVar3 = eimo.a;
            cloy b = cloy.b(clozVar.g);
            if (b == null) {
                b = cloy.UNKNOWN_TYPE;
            }
            f.f((eifw) emwdVar3.fP(b));
        }
        return f.a();
    }
}
