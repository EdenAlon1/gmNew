package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ers extends ffkk implements ffix {
    final /* synthetic */ eyh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ers(eyh eyhVar) {
        super(0);
        this.a = eyhVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        eyh eyhVar = this.a;
        return Boolean.valueOf(eyhVar != null ? new eyd(eyhVar).invoke().booleanValue() : false);
    }
}
