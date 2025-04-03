package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amod {
    public static final amod a;
    public static final amod b;
    public static final amod c;
    private static final /* synthetic */ amod[] d;

    static {
        amod amodVar = new amod("UNKNOWN", 0);
        a = amodVar;
        amod amodVar2 = new amod("POST_INCOMING_MESSAGE_NOTIFICATION", 1);
        b = amodVar2;
        amod amodVar3 = new amod("POST_UNAPPROVED_NOTIFICATION", 2);
        c = amodVar3;
        amod[] amodVarArr = {amodVar, amodVar2, amodVar3};
        d = amodVarArr;
        ffhw.a(amodVarArr);
    }

    private amod(String str, int i) {
    }

    public static amod[] values() {
        return (amod[]) d.clone();
    }
}
