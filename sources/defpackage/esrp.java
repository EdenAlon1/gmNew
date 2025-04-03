package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
class esrp implements Function {
    public static final esqr a(fcic fcicVar) {
        Object apply;
        Object apply2;
        Object apply3;
        esqp esqpVar;
        esqo esqoVar;
        esqi esqiVar = new esqi();
        esqiVar.a(esqo.a);
        Function function = essv.b;
        int i = fcicVar.b;
        fchz fchzVar = null;
        fcib fcibVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : fcib.REMOVAL_ALLOWED_FOR_ADMINS : fcib.REMOVAL_ALLOWED_FOR_ALL : fcib.NO_USER_REMOVAL_ALLOWED : fcib.UNKNOWN_REMOVAL_POLICY;
        if (fcibVar == null) {
            fcibVar = fcib.UNRECOGNIZED;
        }
        apply = function.apply(fcibVar);
        esqq esqqVar = (esqq) apply;
        if (esqqVar == null) {
            throw new NullPointerException("Null userRemovalPolicy");
        }
        esqiVar.a = esqqVar;
        Function function2 = essv.a;
        int i2 = fcicVar.c;
        fcia fciaVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : fcia.RENAMING_ALLOWED : fcia.NO_RENAMING_ALLOWED : fcia.UNKNOWN_RENAMING_POLICY;
        if (fciaVar == null) {
            fciaVar = fcia.UNRECOGNIZED;
        }
        apply2 = function2.apply(fciaVar);
        esqp esqpVar2 = (esqp) apply2;
        if (esqpVar2 == null) {
            throw new NullPointerException("Null renamingPolicy");
        }
        esqiVar.b = esqpVar2;
        Function function3 = essv.c;
        int i3 = fcicVar.d;
        if (i3 == 0) {
            fchzVar = fchz.UNKNOWN_GROUP_ICON_MODIFICATION_POLICY;
        } else if (i3 == 1) {
            fchzVar = fchz.NO_GROUP_ICON_MODIFICATION_ALLOWED;
        } else if (i3 == 2) {
            fchzVar = fchz.GROUP_ICON_MODIFICATION_ALLOWED;
        }
        if (fchzVar == null) {
            fchzVar = fchz.UNRECOGNIZED;
        }
        apply3 = function3.apply(fchzVar);
        esqiVar.a((esqo) apply3);
        esqq esqqVar2 = esqiVar.a;
        if (esqqVar2 != null && (esqpVar = esqiVar.b) != null && (esqoVar = esqiVar.c) != null) {
            return new esqj(esqqVar2, esqpVar, esqoVar);
        }
        StringBuilder sb = new StringBuilder();
        if (esqiVar.a == null) {
            sb.append(" userRemovalPolicy");
        }
        if (esqiVar.b == null) {
            sb.append(" renamingPolicy");
        }
        if (esqiVar.c == null) {
            sb.append(" groupIconModificationPolicy");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        throw null;
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        throw null;
    }
}
