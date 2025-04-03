package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvfb {
    public static final cvfb a;
    public static final cvfb b;
    public static final cvfb c;
    private static final /* synthetic */ cvfb[] e;
    public final String d;

    static {
        cvfb cvfbVar = new cvfb("CallButton", 0, "messages_callButton");
        a = cvfbVar;
        cvfb cvfbVar2 = new cvfb("InvitePrompt", 1, "messages_invitePrompt");
        b = cvfbVar2;
        cvfb cvfbVar3 = new cvfb("TombstoneInserter", 2, "messages.tombstoneInserter");
        c = cvfbVar3;
        cvfb[] cvfbVarArr = {cvfbVar, cvfbVar2, cvfbVar3};
        e = cvfbVarArr;
        ffhw.a(cvfbVarArr);
    }

    private cvfb(String str, int i, String str2) {
        this.d = str2;
    }

    public static cvfb[] values() {
        return (cvfb[]) e.clone();
    }
}
