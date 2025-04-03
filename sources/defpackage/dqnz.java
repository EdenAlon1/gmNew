package defpackage;

import java.util.EnumSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqnz {
    public static final ffbz a;
    public static final dqnz b;
    public static final dqnz c;
    public static final dqnz d;
    public static final dqnz e;
    public static final dqnz f;
    public static final dqnz g;
    private static final /* synthetic */ dqnz[] i;
    public final dqql h;

    static {
        dqnz dqnzVar = new dqnz("NEUTRAL", 0, null);
        b = dqnzVar;
        dqnz dqnzVar2 = new dqnz("LIGHT", 1, new dqql(127995));
        c = dqnzVar2;
        dqnz dqnzVar3 = new dqnz("MEDIUM_LIGHT", 2, new dqql(127996));
        d = dqnzVar3;
        dqnz dqnzVar4 = new dqnz("MEDIUM", 3, new dqql(127997));
        e = dqnzVar4;
        dqnz dqnzVar5 = new dqnz("MEDIUM_DARK", 4, new dqql(127998));
        f = dqnzVar5;
        dqnz dqnzVar6 = new dqnz("DARK", 5, new dqql(127999));
        g = dqnzVar6;
        dqnz[] dqnzVarArr = {dqnzVar, dqnzVar2, dqnzVar3, dqnzVar4, dqnzVar5, dqnzVar6};
        i = dqnzVarArr;
        ffhw.a(dqnzVarArr);
        a = ffca.a(new ffix() { // from class: dqnx
            @Override // defpackage.ffix
            public final Object invoke() {
                ffbz ffbzVar = dqnz.a;
                EnumSet allOf = EnumSet.allOf(dqnz.class);
                allOf.getClass();
                return allOf;
            }
        });
    }

    private dqnz(String str, int i2, dqql dqqlVar) {
        this.h = dqqlVar;
    }

    public static dqnz[] values() {
        return (dqnz[]) i.clone();
    }
}
