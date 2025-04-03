package defpackage;

import java.util.EnumSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqnw {
    public static final ffbz a;
    public static final dqnw b;
    public static final dqnw c;
    public static final dqnw d;
    private static final /* synthetic */ dqnw[] g;
    public final dqql e;
    public final dqql f;

    static {
        dqnw dqnwVar = new dqnw("NEUTRAL", 0, null, new dqql(129489));
        b = dqnwVar;
        dqnw dqnwVar2 = new dqnw("FEMALE", 1, new dqql(9792), new dqql(128105));
        c = dqnwVar2;
        dqnw dqnwVar3 = new dqnw("MALE", 2, new dqql(9794), new dqql(128104));
        d = dqnwVar3;
        dqnw[] dqnwVarArr = {dqnwVar, dqnwVar2, dqnwVar3};
        g = dqnwVarArr;
        ffhw.a(dqnwVarArr);
        a = ffca.a(new ffix() { // from class: dqnu
            @Override // defpackage.ffix
            public final Object invoke() {
                ffbz ffbzVar = dqnw.a;
                EnumSet allOf = EnumSet.allOf(dqnw.class);
                allOf.getClass();
                return allOf;
            }
        });
    }

    private dqnw(String str, int i, dqql dqqlVar, dqql dqqlVar2) {
        this.e = dqqlVar;
        this.f = dqqlVar2;
    }

    public static dqnw[] values() {
        return (dqnw[]) g.clone();
    }
}
