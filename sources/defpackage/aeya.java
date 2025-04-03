package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeya {
    private static final enhk a;
    private static final enhk b;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(SuperSortLabel.UNKNOWN, eqjv.UNKNOWN_SUPER_SORT_LABEL);
        enhdVar.k(SuperSortLabel.ALL, eqjv.ALL);
        enhdVar.k(SuperSortLabel.PERSONAL, eqjv.PERSONAL);
        enhdVar.k(SuperSortLabel.TRANSACTION, eqjv.TRANSACTION);
        enhdVar.k(SuperSortLabel.PROMOTION, eqjv.PROMOTION);
        enhdVar.k(SuperSortLabel.UPDATE, eqjv.UPDATE);
        enhdVar.k(SuperSortLabel.OTP, eqjv.OTP);
        enhdVar.k(SuperSortLabel.BUSINESS_UPDATE, eqjv.BUSINESS_UPDATE);
        a = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k(eqjv.UNKNOWN_SUPER_SORT_LABEL, SuperSortLabel.UNKNOWN);
        enhdVar2.k(eqjv.ALL, SuperSortLabel.ALL);
        enhdVar2.k(eqjv.PERSONAL, SuperSortLabel.PERSONAL);
        enhdVar2.k(eqjv.TRANSACTION, SuperSortLabel.TRANSACTION);
        enhdVar2.k(eqjv.PROMOTION, SuperSortLabel.PROMOTION);
        enhdVar2.k(eqjv.UPDATE, SuperSortLabel.UPDATE);
        enhdVar2.k(eqjv.OTP, SuperSortLabel.OTP);
        enhdVar2.k(eqjv.BUSINESS_UPDATE, SuperSortLabel.BUSINESS_UPDATE);
        b = enhdVar2.c();
    }

    public static SuperSortLabel a(eqjv eqjvVar) {
        SuperSortLabel superSortLabel = (SuperSortLabel) b.get(eqjvVar);
        superSortLabel.getClass();
        return superSortLabel;
    }

    public static eqjv b(SuperSortLabel superSortLabel) {
        eqjv eqjvVar = (eqjv) a.get(superSortLabel);
        eqjvVar.getClass();
        return eqjvVar;
    }
}
