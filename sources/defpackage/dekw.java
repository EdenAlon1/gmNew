package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekw {
    public static final dekw a;
    public static final dekw b;
    public static final dekw c;
    public static final dekw d;
    private static final /* synthetic */ dekw[] e;

    static {
        dekw dekwVar = new dekw("EXPRESS_SIGN_IN_EXISTING_USER", 0);
        a = dekwVar;
        dekw dekwVar2 = new dekw("EXPRESS_SIGN_IN_NEW_USER", 1);
        b = dekwVar2;
        dekw dekwVar3 = new dekw("ACCOUNT_SWITCH", 2);
        c = dekwVar3;
        dekw dekwVar4 = new dekw("ALREADY_SIGNED_IN", 3);
        d = dekwVar4;
        dekw[] dekwVarArr = {dekwVar, dekwVar2, dekwVar3, dekwVar4};
        e = dekwVarArr;
        ffhw.a(dekwVarArr);
    }

    private dekw(String str, int i) {
    }

    public static dekw[] values() {
        return (dekw[]) e.clone();
    }

    public final String a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "express_sign_in_existing_user";
        }
        if (ordinal == 1) {
            return "express_sign_in_new_user";
        }
        if (ordinal == 2) {
            return "account_switch";
        }
        if (ordinal == 3) {
            return "already_signed_in";
        }
        throw null;
    }
}
