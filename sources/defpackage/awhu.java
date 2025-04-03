package defpackage;

import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awhu implements awli {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateIconUrlConverter");
    private final ffbr b;

    public awhu(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.b = ffbrVar;
    }

    @Override // defpackage.awli
    public final /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awvy awvyVar = (awvy) obj;
        awvyVar.getClass();
        if (!((atzy) this.b.b()).a()) {
            awxc awxcVar = awxc.a;
            awxcVar.getClass();
            return awxcVar;
        }
        if (!ffkj.e(awvyVar.d, awkhVar.n())) {
            throw new IllegalArgumentException("Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        }
        awxb awxbVar = (awxb) awxc.a.createBuilder();
        awxbVar.getClass();
        awxd.b(awvyVar.d, awxbVar);
        awxc a2 = awxd.a(awxbVar);
        if ((awvyVar.c & 16) == 0) {
            ensk e = a.e();
            e.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, awkhVar.f());
            enrrVar.Y(csux.J, awkhVar.n());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateIconUrlConverter", "toGroupUpdate", 55, "GroupFullStateIconUrlConverter.kt")).q("Skipping group icon URL change because icon URL is missing in group full state");
            return a2;
        }
        awwa awwaVar = awvyVar.j;
        if (awwaVar == null) {
            awwaVar = awwa.a;
        }
        String str = awwaVar.c;
        str.getClass();
        Optional j = awkhVar.j();
        final ffji ffjiVar = new ffji() { // from class: awhq
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                return ((Uri) obj2).toString();
            }
        };
        if (ffkj.e(str, j.map(new Function() { // from class: awhr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ffji.this.invoke(obj2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(""))) {
            ensk e2 = a.e();
            e2.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar2 = (enrr) e2;
            enrrVar2.Y(csux.p, awkhVar.f());
            enrrVar2.Y(csux.J, awkhVar.n());
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateIconUrlConverter", "toGroupUpdate", 66, "GroupFullStateIconUrlConverter.kt")).q("Skipping group icon URL change because icon URL is the same on the client and server");
            return a2;
        }
        ensk e3 = a.e();
        e3.Y(ente.a, "BugleGroupManagement");
        enrr enrrVar3 = (enrr) e3;
        enrrVar3.Y(csux.p, awkhVar.f());
        enrrVar3.Y(csux.J, awkhVar.n());
        enrr enrrVar4 = (enrr) enrrVar3.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateIconUrlConverter", "toGroupUpdate", 74, "GroupFullStateIconUrlConverter.kt");
        String ad = ffpc.ad(str, 3);
        final ffji ffjiVar2 = new ffji() { // from class: awhs
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                return ((Uri) obj2).toString();
            }
        };
        String str2 = (String) j.map(new Function() { // from class: awht
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ffji.this.invoke(obj2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("");
        enrrVar4.D("Server icon URL (%s) and client icon URL (%s) do not match. Generating icon URL update GroupEvent.", ad, str2 != null ? ffpc.ad(str2, 3) : null);
        awxb awxbVar2 = (awxb) a2.toBuilder();
        awxbVar2.getClass();
        awwb awwbVar = (awwb) awwc.a.createBuilder();
        awwbVar.getClass();
        awwd.c(str, awwbVar);
        awwd.d(str.length() == 0, awwbVar);
        awwa awwaVar2 = awvyVar.j;
        if (awwaVar2 == null) {
            awwaVar2 = awwa.a;
        }
        awxf awxfVar = awwaVar2.d;
        if (awxfVar == null) {
            awxfVar = awxf.a;
        }
        awwd.b(awxfVar, awwbVar);
        awxd.c(awwd.a(awwbVar), awxbVar2);
        return awxd.a(awxbVar2);
    }
}
