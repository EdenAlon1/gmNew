package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xii {
    public static final xii a;
    public static final xii b;
    public static final xii c;
    public static final xii d;
    public static final xii e;
    private static final /* synthetic */ xii[] g;
    public final eooi f;

    static {
        xii xiiVar = new xii("CONVERSATION_FULLSCREEN", 0, eooi.CONVERSATION_ACTIVITY);
        a = xiiVar;
        xii xiiVar2 = new xii("CONVERSATION_BUBBLE", 1, eooi.BUBBLE);
        b = xiiVar2;
        xii xiiVar3 = new xii("DIRECT_SEND", 2, eooi.DIRECT_SEND_FULL_SCREEN);
        c = xiiVar3;
        xii xiiVar4 = new xii("SMART_REPLY", 3, eooi.CONVERSATION_ACTIVITY);
        d = xiiVar4;
        xii xiiVar5 = new xii("MEDIA_VIEWER", 4, eooi.MEDIA_FULL_SCREEN);
        e = xiiVar5;
        xii[] xiiVarArr = {xiiVar, xiiVar2, xiiVar3, xiiVar4, xiiVar5};
        g = xiiVarArr;
        ffhw.a(xiiVarArr);
    }

    private xii(String str, int i, eooi eooiVar) {
        this.f = eooiVar;
    }

    public static xii[] values() {
        return (xii[]) g.clone();
    }
}
