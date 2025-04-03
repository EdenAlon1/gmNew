package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckca extends ffhv implements ffjm {
    int a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ aoku c;
    final /* synthetic */ ckce d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckca(ffgu ffguVar, MessageCoreData messageCoreData, aoku aokuVar, ckce ckceVar) {
        super(2, ffguVar);
        this.b = messageCoreData;
        this.c = aokuVar;
        this.d = ckceVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckca) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        bdhg bdhgVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            bdhgVar = (bdhg) this.e;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            bdhg E = this.b.E();
            awyu awyuVar = (awyu) awyv.a.createBuilder();
            awyuVar.getClass();
            String f = E.f();
            awyuVar.copyOnWrite();
            awyv awyvVar = (awyv) awyuVar.instance;
            awyvVar.b |= 1;
            awyvVar.c = f;
            eyfy build = awyuVar.build();
            build.getClass();
            awyv awyvVar2 = (awyv) build;
            Optional e = this.c.e();
            e.getClass();
            Object b = fflm.b(e);
            if (b == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Optional ag = this.b.ag();
            final ckcb ckcbVar = ckcb.a;
            awui awuiVar = (awui) ag.flatMap(new Function() { // from class: ckcd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj2) {
                    return ffji.this.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElseThrow(ckcc.a);
            awyq awyqVar = (awyq) awyr.a.createBuilder();
            awyqVar.getClass();
            awyqVar.copyOnWrite();
            awyr awyrVar = (awyr) awyqVar.instance;
            awyrVar.c = (awui) b;
            awyrVar.b |= 1;
            String f2 = E.f();
            awyqVar.copyOnWrite();
            awyr awyrVar2 = (awyr) awyqVar.instance;
            awyrVar2.b |= 2;
            awyrVar2.d = f2;
            String a = this.b.z().a();
            a.getClass();
            awyqVar.copyOnWrite();
            awyr awyrVar3 = (awyr) awyqVar.instance;
            awyrVar3.b |= 4;
            awyrVar3.e = a;
            eyee byteString = awyvVar2.toByteString();
            awyqVar.copyOnWrite();
            awyr awyrVar4 = (awyr) awyqVar.instance;
            awyrVar4.b |= 8;
            awyrVar4.f = byteString;
            awuiVar.getClass();
            awyqVar.copyOnWrite();
            awyr awyrVar5 = (awyr) awyqVar.instance;
            awyrVar5.g = awuiVar;
            awyrVar5.b |= 16;
            eyfy build2 = awyqVar.build();
            build2.getClass();
            elfl d = ((avkj) this.d.d.b()).d((awyr) build2);
            d.getClass();
            this.e = E;
            this.a = 1;
            Object c = fgfz.c(d, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            bdhgVar = E;
            obj = c;
        }
        awud awudVar = ((awyt) obj).c;
        if (awudVar == null) {
            awudVar = awud.a;
        }
        awuc b2 = awuc.b(awudVar.c);
        if (b2 == null) {
            b2 = awuc.UNKNOWN_STATUS;
        }
        b2.getClass();
        if (awuc.OK == b2 || awuc.PENDING == b2) {
            return true;
        }
        ((akzt) this.d.e.b()).g("Bugle.Rcs.Chat.Message.Revoke.Send.Failed.Counts", 0L);
        ensk e2 = ckce.a.e();
        e2.Y(ente.a, "BugleAction");
        enrr enrrVar = (enrr) e2;
        enrrVar.Y(csux.e, bdhgVar.f());
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/RcsRevocationSenderImpl$revokeWithChatApi$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 95, "RcsRevocationSenderImpl.kt")).t("Failed to revoke, status: %s.", b2.name());
        return false;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ckca ckcaVar = new ckca(ffguVar, this.b, this.c, this.d);
        ckcaVar.e = obj;
        return ckcaVar;
    }
}
