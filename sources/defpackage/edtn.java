package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edtn {
    public static erge a(edtg edtgVar, int i, int i2) {
        return b(edtgVar, i, i2, edfs.a);
    }

    public static erge b(edtg edtgVar, int i, int i2, edfs edfsVar) {
        erge ergeVar = (erge) ergj.a.createBuilder();
        erfg erfgVar = (erfg) erfh.a.createBuilder();
        erfgVar.copyOnWrite();
        erfh erfhVar = (erfh) erfgVar.instance;
        erfhVar.b |= 1;
        edtf edtfVar = (edtf) edtgVar;
        erfhVar.c = edtfVar.a;
        erfgVar.copyOnWrite();
        erfh erfhVar2 = (erfh) erfgVar.instance;
        erfhVar2.b |= 2;
        erfhVar2.d = edtfVar.b;
        erfh erfhVar3 = (erfh) erfgVar.build();
        ergeVar.copyOnWrite();
        ergj ergjVar = (ergj) ergeVar.instance;
        erfhVar3.getClass();
        ergjVar.e = erfhVar3;
        ergjVar.b |= 4;
        ergeVar.copyOnWrite();
        ergj ergjVar2 = (ergj) ergeVar.instance;
        ergjVar2.b |= 16777216;
        ergjVar2.j = i == 2;
        ergeVar.copyOnWrite();
        ergj ergjVar3 = (ergj) ergeVar.instance;
        ergjVar3.n = i - 1;
        ergjVar3.b |= Integer.MIN_VALUE;
        ergeVar.copyOnWrite();
        ergj ergjVar4 = (ergj) ergeVar.instance;
        ergjVar4.l = 1;
        ergjVar4.b |= 536870912;
        ergeVar.copyOnWrite();
        ergj ergjVar5 = (ergj) ergeVar.instance;
        ergjVar5.o = (i2 != 3 ? 3 : 2) - 1;
        ergjVar5.c |= 1;
        ergeVar.copyOnWrite();
        ergj ergjVar6 = (ergj) ergeVar.instance;
        ergjVar6.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        ergjVar6.k = "4.2.0";
        edfsVar.a();
        ergeVar.copyOnWrite();
        ergj ergjVar7 = (ergj) ergeVar.instance;
        ergjVar7.c |= 8;
        ergjVar7.q = false;
        edfsVar.c();
        return ergeVar;
    }
}
