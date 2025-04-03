package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avik {
    public static final avik a;
    public static final avik b;
    public static final avik c;
    private static final /* synthetic */ avik[] e;
    public final float d;

    static {
        avik avikVar = new avik("FULL", 0, 1.0f);
        a = avikVar;
        avik avikVar2 = new avik("HALF", 1, 2.0f);
        b = avikVar2;
        avik avikVar3 = new avik("TALL", 2, 1.3333334f);
        c = avikVar3;
        avik[] avikVarArr = {avikVar, avikVar2, avikVar3};
        e = avikVarArr;
        ffhw.a(avikVarArr);
    }

    private avik(String str, int i, float f) {
        this.d = f;
    }

    public static avik[] values() {
        return (avik[]) e.clone();
    }
}
