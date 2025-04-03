package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuea {
    public static final cuea a;
    public static final cuea b;
    public static final cuea c;
    public static final cuea d;
    public static final cuea e;
    private static final /* synthetic */ cuea[] f;

    static {
        cuea cueaVar = new cuea("UNKNOWN", 0);
        a = cueaVar;
        cuea cueaVar2 = new cuea("UNSUBSCRIBE_TOOLSTONE", 1);
        b = cueaVar2;
        cuea cueaVar3 = new cuea("TOMBSTONE_ANNOTATION", 2);
        c = cueaVar3;
        cuea cueaVar4 = new cuea("OVERFLOW_MENU", 3);
        d = cueaVar4;
        cuea cueaVar5 = new cuea("SEND_MESSAGE", 4);
        e = cueaVar5;
        cuea[] cueaVarArr = {cueaVar, cueaVar2, cueaVar3, cueaVar4, cueaVar5};
        f = cueaVarArr;
        ffhw.a(cueaVarArr);
    }

    private cuea(String str, int i) {
    }

    public static cuea[] values() {
        return (cuea[]) f.clone();
    }
}
