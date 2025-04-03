package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xij {
    public static final xij a;
    public static final xij b;
    public static final xij c;
    public static final xij d;
    private static final /* synthetic */ xij[] e;

    static {
        xij xijVar = new xij("CONVERSATION_COMPOSE_ROW", 0);
        a = xijVar;
        xij xijVar2 = new xij("DIRECT_SEND", 1);
        b = xijVar2;
        xij xijVar3 = new xij("SMART_REPLY", 2);
        c = xijVar3;
        xij xijVar4 = new xij("MEDIA_VIEWER", 3);
        d = xijVar4;
        xij[] xijVarArr = {xijVar, xijVar2, xijVar3, xijVar4};
        e = xijVarArr;
        ffhw.a(xijVarArr);
    }

    private xij(String str, int i) {
    }

    public static xij[] values() {
        return (xij[]) e.clone();
    }
}
