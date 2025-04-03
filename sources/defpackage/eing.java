package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eing extends eilk {
    @Override // defpackage.eilk
    public final void b(MessagingResult messagingResult, clpz clpzVar) {
        switch (messagingResult.a()) {
            case 0:
                cloe cloeVar = cloe.ERROR_CAUSE_UNKNOWN;
                clpzVar.copyOnWrite();
                clqc clqcVar = (clqc) clpzVar.instance;
                clqc clqcVar2 = clqc.a;
                clqcVar.d = cloeVar.i;
                clqcVar.b |= 2;
                return;
            case 1:
                cloe cloeVar2 = cloe.ERROR_CAUSE_GROUP_TOO_FEW_PARTICIPANTS;
                clpzVar.copyOnWrite();
                clqc clqcVar3 = (clqc) clpzVar.instance;
                clqc clqcVar4 = clqc.a;
                clqcVar3.d = cloeVar2.i;
                clqcVar3.b |= 2;
                return;
            case 2:
                cloe cloeVar3 = cloe.ERROR_CAUSE_GROUP_TOO_MANY_PARTICIPANTS;
                clpzVar.copyOnWrite();
                clqc clqcVar5 = (clqc) clpzVar.instance;
                clqc clqcVar6 = clqc.a;
                clqcVar5.d = cloeVar3.i;
                clqcVar5.b |= 2;
                return;
            case 3:
                cloe cloeVar4 = cloe.ERROR_CAUSE_USER_NOT_A_GROUP_PARTICIPANT;
                clpzVar.copyOnWrite();
                clqc clqcVar7 = (clqc) clpzVar.instance;
                clqc clqcVar8 = clqc.a;
                clqcVar7.d = cloeVar4.i;
                clqcVar7.b |= 2;
                return;
            case 4:
                cloe cloeVar5 = cloe.ERROR_CAUSE_GROUP_SESSION_NOT_FOUND;
                clpzVar.copyOnWrite();
                clqc clqcVar9 = (clqc) clpzVar.instance;
                clqc clqcVar10 = clqc.a;
                clqcVar9.d = cloeVar5.i;
                clqcVar9.b |= 2;
                return;
            case 5:
                cloe cloeVar6 = cloe.ERROR_CAUSE_NOT_AUTHORIZED_TO_RESTART_GROUP;
                clpzVar.copyOnWrite();
                clqc clqcVar11 = (clqc) clpzVar.instance;
                clqc clqcVar12 = clqc.a;
                clqcVar11.d = cloeVar6.i;
                clqcVar11.b |= 2;
                return;
            case 6:
                cloe cloeVar7 = cloe.ERROR_CAUSE_LOW_PRIORITY_MESSAGE_REJECTED;
                clpzVar.copyOnWrite();
                clqc clqcVar13 = (clqc) clpzVar.instance;
                clqc clqcVar14 = clqc.a;
                clqcVar13.d = cloeVar7.i;
                clqcVar13.b |= 2;
                return;
            case 7:
                cloe cloeVar8 = cloe.ERROR_CAUSE_TRANSPORT_INTERNAL_ERROR;
                clpzVar.copyOnWrite();
                clqc clqcVar15 = (clqc) clpzVar.instance;
                clqc clqcVar16 = clqc.a;
                clqcVar15.d = cloeVar8.i;
                clqcVar15.b |= 2;
                return;
            default:
                throw new AssertionError("unexpected state: " + messagingResult.a());
        }
    }

    @Override // defpackage.eilk
    public final void c(MessagingResult messagingResult, clpz clpzVar) {
        int b = messagingResult.b();
        if (b == 0) {
            clog clogVar = clog.ERROR_CODE_OK;
            clpzVar.copyOnWrite();
            clqc clqcVar = (clqc) clpzVar.instance;
            clqc clqcVar2 = clqc.a;
            clqcVar.c = clogVar.d;
            clqcVar.b |= 1;
            return;
        }
        if (b != 1 && b != 2 && b != 3) {
            switch (b) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                case 14:
                case 15:
                case 16:
                    clog clogVar2 = clog.ERROR_CODE_ERROR;
                    clpzVar.copyOnWrite();
                    clqc clqcVar3 = (clqc) clpzVar.instance;
                    clqc clqcVar4 = clqc.a;
                    clqcVar3.c = clogVar2.d;
                    clqcVar3.b |= 1;
                    return;
                default:
                    throw new AssertionError("unexpected state: " + messagingResult.b());
            }
        }
        clog clogVar3 = clog.ERROR_CODE_UNKNOWN;
        clpzVar.copyOnWrite();
        clqc clqcVar5 = (clqc) clpzVar.instance;
        clqc clqcVar6 = clqc.a;
        clqcVar5.c = clogVar3.d;
        clqcVar5.b |= 1;
    }

    @Override // defpackage.eilk
    public final void d(MessagingResult messagingResult, clpz clpzVar) {
        int i;
        if (messagingResult.b() >= 2) {
            clri clriVar = (clri) clrl.a.createBuilder();
            int b = messagingResult.b();
            if (b != 0 && b != 1 && b != 2) {
                i = 3;
                if (b != 3) {
                    switch (b) {
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        case 14:
                            break;
                        case 15:
                            i = 4;
                            break;
                        case 16:
                            i = 2;
                            break;
                        default:
                            throw new AssertionError("unexpected state: " + messagingResult.b());
                    }
                    clriVar.copyOnWrite();
                    clrl clrlVar = (clrl) clriVar.instance;
                    clrlVar.c = i - 1;
                    clrlVar.b = 1 | clrlVar.b;
                    eyev a = eykj.a(messagingResult.c());
                    clriVar.copyOnWrite();
                    clrl clrlVar2 = (clrl) clriVar.instance;
                    a.getClass();
                    clrlVar2.d = a;
                    clrlVar2.b |= 2;
                    clrl clrlVar3 = (clrl) clriVar.build();
                    clpzVar.copyOnWrite();
                    clqc clqcVar = (clqc) clpzVar.instance;
                    clqc clqcVar2 = clqc.a;
                    clrlVar3.getClass();
                    clqcVar.e = clrlVar3;
                    clqcVar.b |= 4;
                }
            }
            i = 1;
            clriVar.copyOnWrite();
            clrl clrlVar4 = (clrl) clriVar.instance;
            clrlVar4.c = i - 1;
            clrlVar4.b = 1 | clrlVar4.b;
            eyev a2 = eykj.a(messagingResult.c());
            clriVar.copyOnWrite();
            clrl clrlVar22 = (clrl) clriVar.instance;
            a2.getClass();
            clrlVar22.d = a2;
            clrlVar22.b |= 2;
            clrl clrlVar32 = (clrl) clriVar.build();
            clpzVar.copyOnWrite();
            clqc clqcVar3 = (clqc) clpzVar.instance;
            clqc clqcVar22 = clqc.a;
            clrlVar32.getClass();
            clqcVar3.e = clrlVar32;
            clqcVar3.b |= 4;
        }
    }

    @Override // defpackage.eilk
    public final void e(MessagingResult messagingResult, final clpz clpzVar) {
        Optional empty;
        int b = messagingResult.b();
        if (b != 0 && b != 1 && b != 2 && b != 3) {
            switch (b) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                case 14:
                    empty = Optional.of(clqb.FALLBACK_REQUIRED);
                    break;
                case 15:
                    empty = Optional.of(clqb.FALLBACK_NOT_ALLOWED);
                    break;
                case 16:
                    empty = Optional.of(clqb.FALLBACK_DEFAULT);
                    break;
                default:
                    throw new AssertionError(a.h(b, "unexpected state: "));
            }
            clpzVar.getClass();
            empty.ifPresent(new Consumer() { // from class: einf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    clpz clpzVar2 = clpz.this;
                    clpzVar2.copyOnWrite();
                    clqc clqcVar = (clqc) clpzVar2.instance;
                    clqc clqcVar2 = clqc.a;
                    clqcVar.f = ((clqb) obj).e;
                    clqcVar.b |= 8;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        empty = Optional.empty();
        clpzVar.getClass();
        empty.ifPresent(new Consumer() { // from class: einf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                clpz clpzVar2 = clpz.this;
                clpzVar2.copyOnWrite();
                clqc clqcVar = (clqc) clpzVar2.instance;
                clqc clqcVar2 = clqc.a;
                clqcVar.f = ((clqb) obj).e;
                clqcVar.b |= 8;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final clqc f(MessagingResult messagingResult) {
        clpz clpzVar = (clpz) apply(messagingResult).toBuilder();
        clpzVar.copyOnWrite();
        clqc clqcVar = (clqc) clpzVar.instance;
        clqcVar.b &= -9;
        clqcVar.f = 0;
        return (clqc) clpzVar.build();
    }
}
