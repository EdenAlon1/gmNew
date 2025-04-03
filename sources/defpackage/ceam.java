package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceam {
    /* JADX WARN: Multi-variable type inference failed */
    public static ceal a(int i, engw engwVar, ceah ceahVar) {
        emxf.b(!engwVar.isEmpty(), "No step is specified for B&R opt-out flow.");
        ceaf ceafVar = (ceaf) ceal.b.createBuilder();
        ceafVar.copyOnWrite();
        ceal cealVar = (ceal) ceafVar.instance;
        cealVar.c |= 1;
        cealVar.d = i;
        ceafVar.copyOnWrite();
        ceal cealVar2 = (ceal) ceafVar.instance;
        cealVar2.h = ceahVar.e;
        cealVar2.c |= 8;
        ceafVar.copyOnWrite();
        ceal cealVar3 = (ceal) ceafVar.instance;
        cealVar3.f = 1;
        cealVar3.c |= 4;
        ceaj ceajVar = (ceaj) engwVar.get(0);
        ceafVar.copyOnWrite();
        ceal cealVar4 = (ceal) ceafVar.instance;
        cealVar4.e = ceajVar.m;
        cealVar4.c |= 2;
        ceafVar.a(engwVar);
        return (ceal) ceafVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ceal b(int i, engw engwVar) {
        emxf.b(!engwVar.isEmpty(), "No step is specified for Multi-Device opt-out flow.");
        ceaf ceafVar = (ceaf) ceal.b.createBuilder();
        ceafVar.copyOnWrite();
        ceal cealVar = (ceal) ceafVar.instance;
        cealVar.c |= 1;
        cealVar.d = i;
        ceah ceahVar = ceah.MD_OPT_OUT;
        ceafVar.copyOnWrite();
        ceal cealVar2 = (ceal) ceafVar.instance;
        cealVar2.h = ceahVar.e;
        cealVar2.c |= 8;
        ceafVar.copyOnWrite();
        ceal cealVar3 = (ceal) ceafVar.instance;
        cealVar3.f = 1;
        cealVar3.c |= 4;
        ceaj ceajVar = (ceaj) engwVar.get(0);
        ceafVar.copyOnWrite();
        ceal cealVar4 = (ceal) ceafVar.instance;
        cealVar4.e = ceajVar.m;
        cealVar4.c |= 2;
        ceafVar.a(engwVar);
        return (ceal) ceafVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Optional c(ceal cealVar) {
        ceaj b = ceaj.b(cealVar.e);
        if (b == null) {
            b = ceaj.UNSPECIFIED_STEP;
        }
        eygk eygkVar = new eygk(cealVar.g, ceal.a);
        if (!eygkVar.contains(b)) {
            throw new cshc(36, csgx.NO_RETRY);
        }
        int size = eygkVar.size() - 1;
        int indexOf = eygkVar.indexOf(b);
        if (size == indexOf) {
            return Optional.empty();
        }
        ceaf ceafVar = (ceaf) cealVar.toBuilder();
        ceaj ceajVar = (ceaj) eygkVar.get(indexOf + 1);
        ceafVar.copyOnWrite();
        ceal cealVar2 = (ceal) ceafVar.instance;
        cealVar2.e = ceajVar.m;
        cealVar2.c |= 2;
        ceafVar.copyOnWrite();
        ceal cealVar3 = (ceal) ceafVar.instance;
        cealVar3.f = 1;
        cealVar3.c |= 4;
        return Optional.of((ceal) ceafVar.build());
    }

    public static String d(ceal cealVar) {
        String str;
        int i = cealVar.d;
        ceaj b = ceaj.b(cealVar.e);
        if (b == null) {
            b = ceaj.UNSPECIFIED_STEP;
        }
        switch (b.ordinal()) {
            case 1:
                str = "Tachyon_Unregister";
                break;
            case 2:
                str = "Set_Server_Status_Off";
                break;
            case 3:
                str = "Complete_Opt_Out_Md";
                break;
            case 4:
                str = "Clear_Primary_Device_Id";
                break;
            case 5:
                str = "Clear_Initial_Sync_Status";
                break;
            case 6:
                str = "Reset_Box";
                break;
            case 7:
                str = "Cancel_Work_Manager_Work";
                break;
            case 8:
                str = "Complete_Opt_Out_Bnr";
                break;
            case 9:
                str = "Complete_Downgrade_MultiDevice_to_Backup_and_Restore";
                break;
            case 10:
                str = "Clear_feature_types";
                break;
            case 11:
                str = "Retrieve_Cms_Timestamp";
                break;
            default:
                str = "Unspecified_Step";
                break;
        }
        return i + str;
    }
}
