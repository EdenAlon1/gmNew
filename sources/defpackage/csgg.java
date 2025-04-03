package defpackage;

import j$.util.Collection;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum csgg {
    UNKNOWN,
    SCHEDULED_BY_BATCH_BACKUP,
    EXECUTING_VIA_BATCH_BACKUP,
    SUCCEED_VIA_BATCH_BACKUP,
    FAILED_VIA_BATCH_BACKUP,
    SCHEDULED_BY_INITIAL_BACKUP,
    EXECUTING_VIA_INITIAL_BACKUP,
    SUCCEED_VIA_INITIAL_BACKUP,
    FAILED_VIA_INITIAL_BACKUP,
    SCHEDULED_BY_INCREMENTAL_BACKUP,
    EXECUTING_VIA_INCREMENTAL_BACKUP,
    SUCCEED_VIA_INCREMENTAL_BACKUP,
    FAILED_VIA_INCREMENTAL_BACKUP,
    RESTORED_FROM_TELEPHONY,
    RESTORED_FROM_CMS,
    MERGED_FROM_CMS,
    CMS_RESTORE_FAILED,
    CMS_RESTORE_IN_PROGRESS,
    SKIPPED_VIA_BATCH_BACKUP,
    SKIPPED_VIA_INITIAL_BACKUP,
    SKIPPED_VIA_INCREMENTAL_BACKUP,
    EXCLUDED;

    public static final enip A;
    private static final enip B;
    public static final enip w;
    public static final enip x;
    public static final enip y;
    public static final enip z;

    static {
        csgg csggVar = UNKNOWN;
        csgg csggVar2 = SCHEDULED_BY_BATCH_BACKUP;
        csgg csggVar3 = FAILED_VIA_BATCH_BACKUP;
        csgg csggVar4 = SCHEDULED_BY_INITIAL_BACKUP;
        csgg csggVar5 = FAILED_VIA_INITIAL_BACKUP;
        csgg csggVar6 = SCHEDULED_BY_INCREMENTAL_BACKUP;
        csgg csggVar7 = FAILED_VIA_INCREMENTAL_BACKUP;
        csgg csggVar8 = RESTORED_FROM_TELEPHONY;
        csgg csggVar9 = RESTORED_FROM_CMS;
        csgg csggVar10 = MERGED_FROM_CMS;
        csgg csggVar11 = CMS_RESTORE_FAILED;
        csgg csggVar12 = CMS_RESTORE_IN_PROGRESS;
        csgg csggVar13 = SKIPPED_VIA_BATCH_BACKUP;
        csgg csggVar14 = SKIPPED_VIA_INITIAL_BACKUP;
        csgg csggVar15 = SKIPPED_VIA_INCREMENTAL_BACKUP;
        csgg csggVar16 = EXCLUDED;
        w = enip.r(csggVar, csggVar8);
        x = enip.t(csggVar11, csggVar12, csggVar10, csggVar9);
        enip v = enip.v(csggVar, csggVar2, csggVar3, csggVar4, csggVar5, csggVar6, csggVar7, csggVar8, csggVar13, csggVar15, csggVar14, csggVar16);
        y = v;
        z = enip.v(csggVar, csggVar2, csggVar3, csggVar4, csggVar5, csggVar6, csggVar7, csggVar12, csggVar8, csggVar16);
        A = enip.v(csggVar, csggVar2, csggVar3, csggVar4, csggVar5, csggVar6, csggVar7, csggVar12, csggVar8);
        enin eninVar = new enin();
        eninVar.j(v);
        eninVar.c(csggVar12);
        B = eninVar.g();
    }

    public static Integer[] b() {
        return (Integer[]) Collection.EL.stream(B).map(new csga()).sorted().toArray(new IntFunction() { // from class: csgd
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                csgg csggVar = csgg.UNKNOWN;
                return new Integer[i];
            }
        });
    }

    public static csgg c(int i, int i2) {
        int i3 = i2 - 1;
        int i4 = i - 1;
        if (i3 == 1) {
            if (i == 0) {
                throw null;
            }
            if (i4 == 0) {
                return EXECUTING_VIA_INCREMENTAL_BACKUP;
            }
            if (i4 == 1) {
                return EXECUTING_VIA_INITIAL_BACKUP;
            }
            if (i4 == 2) {
                return EXECUTING_VIA_BATCH_BACKUP;
            }
            throw new IllegalStateException("Unknown CmsBackupType ".concat(csfx.a(i)));
        }
        if (i3 == 2) {
            if (i == 0) {
                throw null;
            }
            if (i4 == 0) {
                return SUCCEED_VIA_INCREMENTAL_BACKUP;
            }
            if (i4 == 1) {
                return SUCCEED_VIA_INITIAL_BACKUP;
            }
            if (i4 == 2) {
                return SUCCEED_VIA_BATCH_BACKUP;
            }
            throw new IllegalStateException("Unknown CmsBackupType ".concat(csfx.a(i)));
        }
        if (i3 != 3) {
            if (i == 0) {
                throw null;
            }
            if (i4 == 0) {
                return SKIPPED_VIA_INCREMENTAL_BACKUP;
            }
            if (i4 == 1) {
                return SKIPPED_VIA_INITIAL_BACKUP;
            }
            if (i4 == 2) {
                return SKIPPED_VIA_BATCH_BACKUP;
            }
            throw new IllegalStateException("Unknown CmsBackupType ".concat(csfx.a(i)));
        }
        if (i == 0) {
            throw null;
        }
        if (i4 == 0) {
            return FAILED_VIA_INCREMENTAL_BACKUP;
        }
        if (i4 == 1) {
            return FAILED_VIA_INITIAL_BACKUP;
        }
        if (i4 == 2) {
            return FAILED_VIA_BATCH_BACKUP;
        }
        throw new IllegalStateException("Unknown CmsBackupType ".concat(csfx.a(i)));
    }

    public final boolean a() {
        return !y.contains(this);
    }
}
