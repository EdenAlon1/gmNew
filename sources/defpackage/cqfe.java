package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqfe {
    public static final cqfe a;
    public static final cqfe b;
    public static final cqfe c;
    public static final cqfe d;
    public static final cqfe e;
    public static final cqfe f;
    private static final /* synthetic */ cqfe[] g;

    static {
        cqfe cqfeVar = new cqfe("SUCCESS", 0);
        a = cqfeVar;
        cqfe cqfeVar2 = new cqfe("DIRTY", 1);
        b = cqfeVar2;
        cqfe cqfeVar3 = new cqfe("SCAN_FAILED", 2);
        c = cqfeVar3;
        cqfe cqfeVar4 = new cqfe("NOT_DEFAULT_SMS_APP", 3);
        d = cqfeVar4;
        cqfe cqfeVar5 = new cqfe("MISSING_PERMISSIONS", 4);
        e = cqfeVar5;
        cqfe cqfeVar6 = new cqfe("STALLED", 5);
        f = cqfeVar6;
        cqfe[] cqfeVarArr = {cqfeVar, cqfeVar2, cqfeVar3, cqfeVar4, cqfeVar5, cqfeVar6};
        g = cqfeVarArr;
        ffhw.a(cqfeVarArr);
    }

    private cqfe(String str, int i) {
    }

    public static cqfe[] values() {
        return (cqfe[]) g.clone();
    }
}
