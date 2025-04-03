package defpackage;

import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrs extends ffhv implements ffjm {
    final /* synthetic */ ahrw a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahrs(ffgu ffguVar, ahrw ahrwVar) {
        super(2, ffguVar);
        this.a = ahrwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahrs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = brbs.a;
        brbj brbjVar = new brbj();
        brbjVar.f("ConversationClassificationPersisterImpl#deleteExpiredClassifications");
        final ahrw ahrwVar = this.a;
        brbjVar.c(new Function() { // from class: ahrr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brbr brbrVar = (brbr) obj2;
                brbrVar.getClass();
                brbrVar.c(axcl.CONVERSATION_CLASSIFICATION_TYPE_PENPAL_SCAM);
                long epochMilli = ahrw.this.c.f().toEpochMilli() - Duration.ofDays(((Number) ctjd.bH.e()).intValue()).toMillis();
                int intValue = brbs.c().intValue();
                if (intValue < 58840) {
                    dtub.w("generated_timestamp", intValue);
                }
                brbrVar.aq(new dtwe("conversation_classifications_table.generated_timestamp", 10, Long.valueOf(epochMilli)));
                return brbrVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return new Integer(brbjVar.b().b());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahrs ahrsVar = new ahrs(ffguVar, this.a);
        ahrsVar.b = obj;
        return ahrsVar;
    }
}
