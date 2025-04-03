package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emfz {
    public static final emfz a;
    public static final emfz b;
    public static final emfz c;
    private static final /* synthetic */ emfz[] d;

    static {
        emfz emfzVar = new emfz("LOADING", 0);
        a = emfzVar;
        emfz emfzVar2 = new emfz("HIGHLIGHT_SUGGESTIONS", 1);
        b = emfzVar2;
        emfz emfzVar3 = new emfz("SENDING", 2);
        c = emfzVar3;
        emfz[] emfzVarArr = {emfzVar, emfzVar2, emfzVar3};
        d = emfzVarArr;
        ffhw.a(emfzVarArr);
    }

    private emfz(String str, int i) {
    }

    public static emfz[] values() {
        return (emfz[]) d.clone();
    }
}
