package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egpl implements efmo {
    final /* synthetic */ egpm a;

    public egpl(egpm egpmVar) {
        this.a = egpmVar;
    }

    @Override // defpackage.efmo
    public final void a(String str, int i) {
        exgb exgbVar = (exgb) exgc.a.createBuilder();
        exgf exgfVar = (exgf) exgg.a.createBuilder();
        exgfVar.copyOnWrite();
        exgg exggVar = (exgg) exgfVar.instance;
        exggVar.c = 21;
        exggVar.b |= 1;
        exft exftVar = (exft) exfu.a.createBuilder();
        exftVar.copyOnWrite();
        exfu exfuVar = (exfu) exftVar.instance;
        exfuVar.b |= 8;
        exfuVar.f = efmn.a(i);
        exfu exfuVar2 = (exfu) exftVar.build();
        exgfVar.copyOnWrite();
        exgg exggVar2 = (exgg) exgfVar.instance;
        exfuVar2.getClass();
        exggVar2.e = exfuVar2;
        exggVar2.b |= 4;
        exgbVar.copyOnWrite();
        exgc exgcVar = (exgc) exgbVar.instance;
        exgg exggVar3 = (exgg) exgfVar.build();
        exggVar3.getClass();
        exgcVar.d = exggVar3;
        exgcVar.b |= 1;
        this.a.b.c((exgc) exgbVar.build());
    }

    @Override // defpackage.efmo
    public final void b(efnl efnlVar) {
        String str;
        exgb exgbVar = (exgb) exgc.a.createBuilder();
        exgf exgfVar = (exgf) exgg.a.createBuilder();
        exgfVar.copyOnWrite();
        exgg exggVar = (exgg) exgfVar.instance;
        exggVar.c = 21;
        exggVar.b |= 1;
        exgbVar.copyOnWrite();
        exgc exgcVar = (exgc) exgbVar.instance;
        exgg exggVar2 = (exgg) exgfVar.build();
        exggVar2.getClass();
        exgcVar.d = exggVar2;
        exgcVar.b |= 1;
        this.a.b.c((exgc) exgbVar.build());
        egpm egpmVar = this.a;
        boolean z = egpmVar.g;
        enhd enhdVar = new enhd();
        int i = egpmVar.e.c;
        String str2 = "null";
        switch (i) {
            case 1:
                str = "UNKNOWN_ENTRY_POINT";
                break;
            case 2:
                str = "CONTACTS_ROW_CLICKED";
                break;
            case 3:
                str = "CONTACTS_ROW_EDIT_ICON";
                break;
            case 4:
                str = "CONTACTS_SEARCH_BAR";
                break;
            case 5:
                str = "CONTACTS_CREATE_CONTACT_BUTTON";
                break;
            case 6:
                str = "CONTACTS_TRASH_ROW_CLICKED";
                break;
            case 7:
                str = "OBAKE_CAMERA_PHOTO_SELECTED";
                break;
            case 8:
                str = "OBAKE_DEVICE_PHOTO_SELECTED";
                break;
            case 9:
                str = "OBAKE_GOOGLE_PHOTOS_PHOTO_SELECTED";
                break;
            case 10:
                str = "EMAIL_BUTTON";
                break;
            case 11:
                str = "SCHEDULE_BUTTON";
                break;
            case 12:
                str = "CHAT_BUTTON";
                break;
            case 13:
                str = "CALL_BUTTON";
                break;
            case 14:
                str = "MEET_BUTTON";
                break;
            case 15:
                str = "OBAKE_ART_PHOTO_SELECTED";
                break;
            default:
                str = "null";
                break;
        }
        if (i == 0) {
            throw null;
        }
        enhdVar.k("uientrypoint", str);
        fapp b = fapp.b(egpmVar.f.c);
        if (b == null) {
            b = fapp.UNKNOWN_APPLICATION;
        }
        enhdVar.k("hostapp", b.name());
        if (fdrj.c() && fdrj.d()) {
            egjk egjkVar = egpmVar.e;
            if (egjkVar.c == 15) {
                int i2 = egjkVar.b;
                if (i2 == 1) {
                    str2 = "UNKNOWN";
                } else if (i2 == 2) {
                    str2 = "PRESET";
                } else if (i2 == 3) {
                    str2 = "CUSTOMIZED";
                }
                if (i2 == 0) {
                    throw null;
                }
                enhdVar.k("selectedColorCustomizationType", str2);
            }
        }
        enhdVar.k("wasMonogram", Boolean.toString(egpmVar.g));
        egpmVar.d.j(new egph(efnlVar, z, enhdVar.c()));
    }
}
