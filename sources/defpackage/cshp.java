package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cshp {
    public static final enhk a;

    static {
        enhd enhdVar = new enhd();
        axeu axeuVar = axeu.UNSPECIFIED_STATUS;
        enhdVar.k(new cshq(axeuVar, axeuVar), csho.NO_FEATURE_IS_ON);
        enhdVar.k(new cshq(axeu.UNSPECIFIED_STATUS, axeu.ENABLED), csho.BNR_ONLY);
        enhdVar.k(new cshq(axeu.UNSPECIFIED_STATUS, axeu.ENABLING), csho.BNR_ONLY);
        enhdVar.k(new cshq(axeu.UNSPECIFIED_STATUS, axeu.ENABLE_FAILED), csho.BNR_ENABLE_FAILED);
        enhdVar.k(new cshq(axeu.UNSPECIFIED_STATUS, axeu.DISABLED), csho.NO_FEATURE_IS_ON);
        enhdVar.k(new cshq(axeu.UNSPECIFIED_STATUS, axeu.DISABLING), csho.DISABLING_BNR);
        enhdVar.k(new cshq(axeu.UNSPECIFIED_STATUS, axeu.DISABLE_FAILED), csho.BNR_DISABLE_FAILED);
        axeu axeuVar2 = axeu.ENABLED;
        enhdVar.k(new cshq(axeuVar2, axeuVar2), csho.BNR_AND_MD);
        enhdVar.k(new cshq(axeu.ENABLED, axeu.ENABLING), csho.BNR_AND_MD);
        enhdVar.k(new cshq(axeu.ENABLED, axeu.ENABLE_FAILED), csho.BNR_ENABLE_FAILED);
        enhdVar.k(new cshq(axeu.ENABLING, axeu.ENABLED), csho.BNR_AND_MD);
        axeu axeuVar3 = axeu.ENABLING;
        enhdVar.k(new cshq(axeuVar3, axeuVar3), csho.BNR_AND_MD);
        enhdVar.k(new cshq(axeu.ENABLING, axeu.ENABLE_FAILED), csho.BNR_ENABLE_FAILED);
        enhdVar.k(new cshq(axeu.ENABLE_FAILED, axeu.UNSPECIFIED_STATUS), csho.LEGACY_MD_ENABLE_FAILED);
        enhdVar.k(new cshq(axeu.ENABLE_FAILED, axeu.ENABLED), csho.MD_ENABLE_FAILED);
        enhdVar.k(new cshq(axeu.ENABLE_FAILED, axeu.ENABLING), csho.MD_ENABLE_FAILED);
        axeu axeuVar4 = axeu.ENABLE_FAILED;
        enhdVar.k(new cshq(axeuVar4, axeuVar4), csho.BNR_ENABLE_FAILED);
        enhdVar.k(new cshq(axeu.DISABLED, axeu.UNSPECIFIED_STATUS), csho.NO_FEATURE_IS_ON);
        enhdVar.k(new cshq(axeu.DISABLED, axeu.ENABLED), csho.BNR_ONLY);
        enhdVar.k(new cshq(axeu.DISABLED, axeu.ENABLING), csho.BNR_ONLY);
        enhdVar.k(new cshq(axeu.DISABLED, axeu.ENABLE_FAILED), csho.BNR_ENABLE_FAILED);
        axeu axeuVar5 = axeu.DISABLED;
        enhdVar.k(new cshq(axeuVar5, axeuVar5), csho.NO_FEATURE_IS_ON);
        enhdVar.k(new cshq(axeu.DISABLED, axeu.DISABLING), csho.DISABLING_BNR);
        enhdVar.k(new cshq(axeu.DISABLED, axeu.DISABLE_FAILED), csho.BNR_DISABLE_FAILED);
        enhdVar.k(new cshq(axeu.DISABLING, axeu.UNSPECIFIED_STATUS), csho.LEGACY_MD_DISABLING);
        enhdVar.k(new cshq(axeu.DISABLING, axeu.ENABLED), csho.TURNING_OFF_MD);
        enhdVar.k(new cshq(axeu.DISABLING, axeu.ENABLING), csho.TURNING_OFF_MD);
        enhdVar.k(new cshq(axeu.DISABLING, axeu.ENABLE_FAILED), csho.BNR_ENABLE_FAILED);
        axeu axeuVar6 = axeu.DISABLING;
        enhdVar.k(new cshq(axeuVar6, axeuVar6), csho.DISABLING_BNR);
        enhdVar.k(new cshq(axeu.DISABLE_FAILED, axeu.UNSPECIFIED_STATUS), csho.LEGACY_MD_DISABLE_FAILED);
        enhdVar.k(new cshq(axeu.DISABLE_FAILED, axeu.ENABLED), csho.MD_DISABLE_FAILED);
        enhdVar.k(new cshq(axeu.DISABLE_FAILED, axeu.ENABLING), csho.MD_DISABLE_FAILED);
        enhdVar.k(new cshq(axeu.DISABLE_FAILED, axeu.ENABLE_FAILED), csho.BNR_ENABLE_FAILED);
        enhdVar.k(new cshq(axeu.DISABLE_FAILED, axeu.DISABLING), csho.DISABLING_BNR);
        axeu axeuVar7 = axeu.DISABLE_FAILED;
        enhdVar.k(new cshq(axeuVar7, axeuVar7), csho.BNR_DISABLE_FAILED);
        a = enhdVar.c();
    }
}
