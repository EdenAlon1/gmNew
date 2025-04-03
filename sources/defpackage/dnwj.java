package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwj {
    public static final dnwj a;
    public static final dnwj b;
    public static final dnwj c;
    public static final dnwj d;
    private static final /* synthetic */ dnwj[] e;

    static {
        dnwj dnwjVar = new dnwj("MEDIA", 0);
        a = dnwjVar;
        dnwj dnwjVar2 = new dnwj("NO_CONTAINER", 1);
        b = dnwjVar2;
        dnwj dnwjVar3 = new dnwj("ON_BUBBLE", 2);
        c = dnwjVar3;
        dnwj dnwjVar4 = new dnwj("VOICE_MOOD", 3);
        d = dnwjVar4;
        dnwj[] dnwjVarArr = {dnwjVar, dnwjVar2, dnwjVar3, dnwjVar4};
        e = dnwjVarArr;
        ffhw.a(dnwjVarArr);
    }

    private dnwj(String str, int i) {
    }

    public static dnwj[] values() {
        return (dnwj[]) e.clone();
    }
}
