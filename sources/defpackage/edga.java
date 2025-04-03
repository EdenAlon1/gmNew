package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edga implements edkp {
    public final edtm a;
    public final edtg b;
    public final edkq c;

    public edga(edtm edtmVar, edtg edtgVar, edkq edkqVar) {
        this.a = edtmVar;
        this.b = edtgVar;
        this.c = edkqVar;
    }

    public static final int f(dhre dhreVar) {
        if (dhreVar.m()) {
            return 2;
        }
        Exception h = dhreVar.h();
        h.getClass();
        int a = (h instanceof dfqu ? (dfqu) h : new dfqu(new Status(13, h.getMessage()))).a();
        if (a != 7) {
            return a != 15 ? 1 : 3;
        }
        return 4;
    }

    public final ergw a() {
        Locale b = this.c.b();
        Locale locale = Locale.getDefault();
        ergw ergwVar = (ergw) ergy.a.createBuilder();
        String locale2 = b.toString();
        ergwVar.copyOnWrite();
        ergy ergyVar = (ergy) ergwVar.instance;
        locale2.getClass();
        ergyVar.b |= 2;
        ergyVar.d = locale2;
        if (!b.equals(locale)) {
            String locale3 = locale.toString();
            ergwVar.copyOnWrite();
            ergy ergyVar2 = (ergy) ergwVar.instance;
            locale3.getClass();
            ergyVar2.b |= 4;
            ergyVar2.e = locale3;
        }
        return ergwVar;
    }

    public final void b(erfv erfvVar, int i) {
        e(erfvVar, 2, i, edfs.a);
    }

    @Override // defpackage.edkp
    public final void c(edrs edrsVar, int i, int i2) {
        ergk ergkVar = (ergk) ergl.a.createBuilder();
        ergkVar.copyOnWrite();
        ergl.a((ergl) ergkVar.instance);
        ergu erguVar = (ergu) ergv.a.createBuilder();
        erguVar.a(edke.b(((edqs) edrsVar).b));
        ergv ergvVar = (ergv) erguVar.build();
        ergkVar.copyOnWrite();
        ergl erglVar = (ergl) ergkVar.instance;
        ergvVar.getClass();
        erglVar.c = ergvVar;
        erglVar.b |= 4;
        ergl erglVar2 = (ergl) ergkVar.build();
        ergw a = a();
        a.copyOnWrite();
        ergy ergyVar = (ergy) a.instance;
        ergy ergyVar2 = ergy.a;
        ergyVar.c = 4;
        ergyVar.b |= 1;
        a.copyOnWrite();
        ergy ergyVar3 = (ergy) a.instance;
        erglVar2.getClass();
        ergyVar3.f = erglVar2;
        ergyVar3.b |= 128;
        ergy ergyVar4 = (ergy) a.build();
        erge a2 = edtn.a(this.b, i, i2);
        a2.copyOnWrite();
        ergj ergjVar = (ergj) a2.instance;
        ergj ergjVar2 = ergj.a;
        ergjVar.d = 1;
        ergjVar.b |= 2;
        a2.copyOnWrite();
        ergj ergjVar3 = (ergj) a2.instance;
        ergyVar4.getClass();
        ergjVar3.f = ergyVar4;
        ergjVar3.b |= 64;
        String a3 = this.c.a();
        a2.copyOnWrite();
        ergj ergjVar4 = (ergj) a2.instance;
        a3.getClass();
        ergjVar4.b |= 1073741824;
        ergjVar4.m = a3;
        this.a.a(a2);
    }

    @Override // defpackage.edkp
    public final void d(dhre dhreVar, long j, long j2, int i, int i2, edfs edfsVar) {
        boolean m = dhreVar.m();
        erfq erfqVar = (erfq) erfr.a.createBuilder();
        erfqVar.copyOnWrite();
        erfr erfrVar = (erfr) erfqVar.instance;
        erfrVar.b |= 1;
        erfrVar.c = 1;
        erfqVar.copyOnWrite();
        erfr erfrVar2 = (erfr) erfqVar.instance;
        erfrVar2.b |= 2;
        erfrVar2.d = m ? 1 : 0;
        erfr erfrVar3 = (erfr) erfqVar.build();
        erfs erfsVar = (erfs) erfv.a.createBuilder();
        erfsVar.copyOnWrite();
        erfv erfvVar = (erfv) erfsVar.instance;
        erfvVar.c = 7;
        erfvVar.b |= 1;
        erfsVar.copyOnWrite();
        erfv erfvVar2 = (erfv) erfsVar.instance;
        erfrVar3.getClass();
        erfvVar2.f = erfrVar3;
        erfvVar2.b |= 32;
        int f = f(dhreVar);
        erfsVar.copyOnWrite();
        erfv erfvVar3 = (erfv) erfsVar.instance;
        erfvVar3.d = f - 1;
        erfvVar3.b |= 2;
        erfsVar.copyOnWrite();
        erfv erfvVar4 = (erfv) erfsVar.instance;
        erfvVar4.b |= 4;
        erfvVar4.e = (int) (j2 - j);
        e((erfv) erfsVar.build(), i, i2, edfsVar);
    }

    public final void e(erfv erfvVar, int i, int i2, edfs edfsVar) {
        erge b = edtn.b(this.b, i, i2, edfsVar);
        b.copyOnWrite();
        ergj ergjVar = (ergj) b.instance;
        ergj ergjVar2 = ergj.a;
        ergjVar.d = 16;
        ergjVar.b |= 2;
        b.copyOnWrite();
        ergj ergjVar3 = (ergj) b.instance;
        erfvVar.getClass();
        ergjVar3.i = erfvVar;
        ergjVar3.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        String a = this.c.a();
        b.copyOnWrite();
        ergj ergjVar4 = (ergj) b.instance;
        a.getClass();
        ergjVar4.b |= 1073741824;
        ergjVar4.m = a;
        this.a.a(b);
    }

    @Override // defpackage.edkp
    public final void g(edry edryVar, int i) {
        erfw erfwVar = (erfw) erfx.a.createBuilder();
        List<String> list = ((edqy) edryVar).a;
        if (!list.isEmpty()) {
            for (String str : list) {
                erfwVar.copyOnWrite();
                erfx erfxVar = (erfx) erfwVar.instance;
                str.getClass();
                eygr eygrVar = erfxVar.b;
                if (!eygrVar.c()) {
                    erfxVar.b = eyfy.mutableCopy(eygrVar);
                }
                erfxVar.b.add(str);
            }
        }
        erfx erfxVar2 = (erfx) erfwVar.build();
        ergc ergcVar = (ergc) ergd.a.createBuilder();
        if (erfxVar2 != null) {
            ergcVar.copyOnWrite();
            ergd ergdVar = (ergd) ergcVar.instance;
            ergdVar.c = erfxVar2;
            ergdVar.b |= 4;
        }
        ergd ergdVar2 = (ergd) ergcVar.build();
        ergw a = a();
        a.copyOnWrite();
        ergy ergyVar = (ergy) a.instance;
        ergy ergyVar2 = ergy.a;
        ergyVar.c = 5;
        ergyVar.b |= 1;
        a.copyOnWrite();
        ergy ergyVar3 = (ergy) a.instance;
        ergdVar2.getClass();
        ergyVar3.g = ergdVar2;
        ergyVar3.b |= 256;
        ergy ergyVar4 = (ergy) a.build();
        erge a2 = edtn.a(this.b, i, 3);
        a2.copyOnWrite();
        ergj ergjVar = (ergj) a2.instance;
        ergj ergjVar2 = ergj.a;
        ergjVar.d = 1;
        ergjVar.b |= 2;
        a2.copyOnWrite();
        ergj ergjVar3 = (ergj) a2.instance;
        ergyVar4.getClass();
        ergjVar3.f = ergyVar4;
        ergjVar3.b |= 64;
        String a3 = this.c.a();
        a2.copyOnWrite();
        ergj ergjVar4 = (ergj) a2.instance;
        a3.getClass();
        ergjVar4.b |= 1073741824;
        ergjVar4.m = a3;
        this.a.a(a2);
    }

    @Override // defpackage.edkp
    public final void h(edrs edrsVar, int i) {
        ergk ergkVar = (ergk) ergl.a.createBuilder();
        ergkVar.copyOnWrite();
        ergl.a((ergl) ergkVar.instance);
        ergu erguVar = (ergu) ergv.a.createBuilder();
        erguVar.a(edke.b(((edqs) edrsVar).b));
        ergv ergvVar = (ergv) erguVar.build();
        ergkVar.copyOnWrite();
        ergl erglVar = (ergl) ergkVar.instance;
        ergvVar.getClass();
        erglVar.c = ergvVar;
        erglVar.b |= 4;
        ergl erglVar2 = (ergl) ergkVar.build();
        ergw a = a();
        a.copyOnWrite();
        ergy ergyVar = (ergy) a.instance;
        ergy ergyVar2 = ergy.a;
        ergyVar.c = 4;
        ergyVar.b |= 1;
        a.copyOnWrite();
        ergy ergyVar3 = (ergy) a.instance;
        erglVar2.getClass();
        ergyVar3.j = erglVar2;
        ergyVar3.b |= 2097152;
        ergy ergyVar4 = (ergy) a.build();
        erge a2 = edtn.a(this.b, i, 3);
        a2.copyOnWrite();
        ergj ergjVar = (ergj) a2.instance;
        ergj ergjVar2 = ergj.a;
        ergjVar.d = 1;
        ergjVar.b |= 2;
        a2.copyOnWrite();
        ergj ergjVar3 = (ergj) a2.instance;
        ergyVar4.getClass();
        ergjVar3.f = ergyVar4;
        ergjVar3.b |= 64;
        String a3 = this.c.a();
        a2.copyOnWrite();
        ergj ergjVar4 = (ergj) a2.instance;
        a3.getClass();
        ergjVar4.b |= 1073741824;
        ergjVar4.m = a3;
        this.a.a(a2);
    }
}
