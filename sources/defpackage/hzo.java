package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzo {
    public static final hzo a;
    public static final hzo b;
    public static final hzo c;
    public static final hzo d;
    private static final /* synthetic */ hzo[] e;

    static {
        hzo hzoVar = new hzo("Active", 0);
        a = hzoVar;
        hzo hzoVar2 = new hzo("ActiveParent", 1);
        b = hzoVar2;
        hzo hzoVar3 = new hzo("Captured", 2);
        c = hzoVar3;
        hzo hzoVar4 = new hzo("Inactive", 3);
        d = hzoVar4;
        hzo[] hzoVarArr = {hzoVar, hzoVar2, hzoVar3, hzoVar4};
        e = hzoVarArr;
        ffhw.a(hzoVarArr);
    }

    private hzo(String str, int i) {
    }

    public static hzo[] values() {
        return (hzo[]) e.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        throw new ffcd();
    }

    public final boolean b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                throw new ffcd();
            }
        }
        return true;
    }
}
