package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapi {
    public static final aapi a;
    public static final aapi b;
    public static final aapi c;
    public static final aapi d;
    public static final aapi e;
    private static final /* synthetic */ aapi[] f;

    static {
        aapi aapiVar = new aapi("PROCESSING_NO_CONTENT", 0);
        a = aapiVar;
        aapi aapiVar2 = new aapi("DOWNLOADABLE_NO_CONTENT", 1);
        b = aapiVar2;
        aapi aapiVar3 = new aapi("NO_CONNECTION_NO_CONTENT", 2);
        c = aapiVar3;
        aapi aapiVar4 = new aapi("MANUAL_DOWNLOADING_NO_CONTENT", 3);
        d = aapiVar4;
        aapi aapiVar5 = new aapi("NORMAL", 4);
        e = aapiVar5;
        aapi[] aapiVarArr = {aapiVar, aapiVar2, aapiVar3, aapiVar4, aapiVar5};
        f = aapiVarArr;
        ffhw.a(aapiVarArr);
    }

    private aapi(String str, int i) {
    }

    public static aapi[] values() {
        return (aapi[]) f.clone();
    }
}
