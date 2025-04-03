package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yxf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public String e;
    public dmvi f;
    public ajiy g;
    public final dnmk h;

    public yxf(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = "";
        this.h = new dnmk(str5, "", new ffix() { // from class: yxa
            @Override // defpackage.ffix
            public final Object invoke() {
                yxf yxfVar = yxf.this;
                yxfVar.e = "";
                ajiy ajiyVar = yxfVar.g;
                if (ajiyVar == null) {
                    ffkj.c("popupController");
                    ajiyVar = null;
                }
                dmvi dmviVar = yxfVar.f;
                dmviVar.getClass();
                ajiyVar.b(yxfVar.a(dmviVar));
                return ffcu.a;
            }
        }, new ffji() { // from class: yxb
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str6 = (String) obj;
                str6.getClass();
                yxf yxfVar = yxf.this;
                yxfVar.e = str6;
                ajiy ajiyVar = yxfVar.g;
                if (ajiyVar == null) {
                    ffkj.c("popupController");
                    ajiyVar = null;
                }
                dmvi dmviVar = yxfVar.f;
                dmviVar.getClass();
                ajiyVar.b(yxfVar.a(dmviVar));
                return ffcu.a;
            }
        }, 1, new dnmj(ersy.a("bugle.show_clear_on_focus_or_content", "bugle")));
    }

    public final dmvi a(dmvi dmviVar) {
        return dmvi.b(dmviVar, null, ffdx.b(dnmk.a(this.h, this.e, null, null, 61)), null, null, null, null, 125);
    }
}
