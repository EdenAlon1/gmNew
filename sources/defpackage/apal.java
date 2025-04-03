package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apal {
    public static final apal a;
    private static final /* synthetic */ apal[] g;
    public final engw b;
    public final engw c;
    public final ffjm d;
    public final ffjm e;
    public final ffjm f;

    static {
        engw s = engw.s(new buxl(MessagesTable.c.i, false), new buxl(MessagesTable.c.a, false));
        s.getClass();
        buum buumVar = MessagesTable.c;
        engw s2 = engw.s(new buxl(buumVar.i, true), new buxl(buumVar.a, true));
        s2.getClass();
        apal apalVar = new apal(s, s2, apai.a, apaj.a, apak.a);
        a = apalVar;
        apal[] apalVarArr = {apalVar};
        g = apalVarArr;
        ffhw.a(apalVarArr);
    }

    private apal(engw engwVar, engw engwVar2, ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3) {
        this.b = engwVar;
        this.c = engwVar2;
        this.d = ffjmVar;
        this.e = ffjmVar2;
        this.f = ffjmVar3;
    }

    public static apal[] values() {
        return (apal[]) g.clone();
    }
}
