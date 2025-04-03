package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cukx {
    public static final cukx a;
    public static final cukx b;
    public static final cukx c;
    public static final cukx d;
    public static final cukx e;
    public static final cukx f;
    public static final cukx g;
    public static final cukx h;
    public static final cukx i;
    public static final cukx j;
    public static final cukx k;
    public static final /* synthetic */ ffhx m;
    private static final Set n;
    private static final /* synthetic */ cukx[] o;
    public final int l;

    static {
        cukx cukxVar = new cukx("UNKNOWN", 0, 0);
        a = cukxVar;
        cukx cukxVar2 = new cukx("USER", 1, 2);
        b = cukxVar2;
        cukx cukxVar3 = new cukx("SCOOBY", 2, 4);
        c = cukxVar3;
        cukx cukxVar4 = new cukx("RCS_ENFORCEMENT", 3, 8);
        d = cukxVar4;
        cukx cukxVar5 = new cukx("LINGUA", 4, 16);
        e = cukxVar5;
        cukx cukxVar6 = new cukx("STRANGER_DANGER", 5, 32);
        f = cukxVar6;
        cukx cukxVar7 = new cukx("SAFE_URL", 6, 64);
        g = cukxVar7;
        cukx cukxVar8 = new cukx("HADES_REGEX_AND_MODELS", 7, 128);
        h = cukxVar8;
        cukx cukxVar9 = new cukx("ON_DEVICE_STRANGER_DANGER", 8, 256);
        i = cukxVar9;
        cukx cukxVar10 = new cukx("IN_APK_FUZZY_MATCHING", 9, 512);
        j = cukxVar10;
        cukx cukxVar11 = new cukx("PENPAL", 10, 1024);
        k = cukxVar11;
        cukx[] cukxVarArr = {cukxVar, cukxVar2, cukxVar3, cukxVar4, cukxVar5, cukxVar6, cukxVar7, cukxVar8, cukxVar9, cukxVar10, cukxVar11};
        o = cukxVarArr;
        ffhx a2 = ffhw.a(cukxVarArr);
        m = a2;
        ArrayList arrayList = new ArrayList();
        ffdb ffdbVar = new ffdb(a2);
        while (ffdbVar.hasNext()) {
            Object next = ffdbVar.next();
            cukx cukxVar12 = (cukx) next;
            if (!cukxVar12.c() && cukxVar12 != a) {
                arrayList.add(next);
            }
        }
        n = ffdx.ar(arrayList);
    }

    private cukx(String str, int i2, int i3) {
        this.l = i3;
    }

    public static cukx[] values() {
        return (cukx[]) o.clone();
    }

    public final erep a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return erep.UNKNOWN_CLASSIFICATION_SOURCE;
        }
        switch (ordinal) {
            case 2:
                return erep.SCOOBY;
            case 3:
                return erep.RCS_ENFORCEMENT;
            case 4:
                return erep.LINGUA;
            case 5:
                return erep.STRANGER_DANGER;
            case 6:
                return erep.SAFE_URL;
            case 7:
                return erep.HADES_REGEX_AND_MODELS;
            case 8:
                return erep.ON_DEVICE_STRANGER_DANGER;
            case 9:
                return erep.IN_APK_FUZZY_MATCHING;
            case 10:
                return erep.PENPAL;
            default:
                toString();
                throw new IllegalStateException(toString().concat(" unsupported for Spam.ClassificationSource"));
        }
    }

    public final boolean b() {
        return n.contains(this);
    }

    public final boolean c() {
        return this == b;
    }

    public final int d() {
        switch (ordinal()) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                toString();
                throw new IllegalStateException(toString().concat(" unsupported for AbuseMechanism"));
        }
    }
}
