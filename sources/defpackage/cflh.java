package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cflh extends RuntimeException {
    public final cfla a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cflh(cfla cflaVar, cfla cflaVar2) {
        super("Illegal state transition in the HeavyWorkStatusStateMachine from " + cflaVar + " to " + cflaVar2);
        cflaVar2.getClass();
        this.a = cflaVar;
    }
}
