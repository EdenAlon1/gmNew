package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
final class canb {
    public static final canb a;
    public static final canb b;
    public static final canb c;
    public static final canb d;
    private static final /* synthetic */ canb[] e;

    static {
        canb canbVar = new canb("NEW_TOMBSTONE_IS_SAME_AS_LAST_TOMBSTONE", 0);
        a = canbVar;
        canb canbVar2 = new canb("NO_MESSAGES_BEFORE_LAST_TOMBSTONE", 1);
        b = canbVar2;
        canb canbVar3 = new canb("LAST_MESSAGE_PROTOCOL_IS_SAME_AS_NEW_TOMBSTONE_PROTOCOL", 2);
        c = canbVar3;
        canb canbVar4 = new canb("LAST_MESSAGE_PROTOCOL_IS_DIFFERENT_FROM_NEW_TOMBSTONE_PROTOCOL", 3);
        d = canbVar4;
        canb[] canbVarArr = {canbVar, canbVar2, canbVar3, canbVar4};
        e = canbVarArr;
        ffhw.a(canbVarArr);
    }

    private canb(String str, int i) {
    }

    public static canb[] values() {
        return (canb[]) e.clone();
    }
}
